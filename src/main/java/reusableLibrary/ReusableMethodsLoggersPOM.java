package reusableLibrary;

import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import org.apache.pdfbox.cos.COSName;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;


import static org.apache.pdfbox.pdmodel.PDDocument.*;
import static reusableLibrary.ReusableAnnotations.driver;
import static reusableLibrary.ReusableAnnotations.getDriver;

public class ReusableMethodsLoggersPOM {

    //create a return method to return the webdriver you going to use on your test classes
    //static command allows your method to be global
    // public static WebDriver defineChromeDriver()  {
//    public static WebDriver defineDriver(String browser) throws MalformedURLException {
////        //  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
////        if (browser.equalsIgnoreCase("chrome")) {
////            WebDriverManager.chromedriver().setup();
////            ChromeOptions options = new ChromeOptions();
////            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
////            options.addArguments("start-maximized");
////            WebDriver driver = new ChromeDriver(options);
////
////        } else if (browser.equalsIgnoreCase("firefox")) {
//
//        WebDriverManager.firefoxdriver().setup();
//        FirefoxOptions options = new FirefoxOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//        options.addArguments("--headless");
//        //   options.addArguments("start-maximized");
//        WebDriver driver = new FirefoxDriver(options);
//
//        //  driver.manage().window().maximize();
//        //}
//
//        return driver;
//    }

//
//   }//end of webdriver method

    //return method will execute your statements along with returning some conditions/value
    //example of return methods are only WebDriver method & getText action

    //void method will only perform the action but won't return anything
    //void actions are click, sendKeys, scrolling, submit, select, mouse hover, clear

    public static void closePDFViewer(WebDriver driver) {
        Set<String> windowHandles = driver.getWindowHandles();
        String originalWindow = driver.getWindowHandle();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            String currentURL = driver.getCurrentUrl();

            if (driver instanceof ChromeDriver) {
                // **Chrome: Check for Chrome PDF Viewer extension**
                if (currentURL.startsWith("chrome-extension://")) {
                    System.out.println("Detected Chrome PDF Viewer. Closing tab...");
                    driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.COMMAND, "W")); // Mac
                    driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.CONTROL, "W")); // Windows/Linux
                    return;
                }
            } else if (driver instanceof FirefoxDriver) {
                // **Firefox: Usually opens PDFs in same tab or separate tab**
                System.out.println("Detected PDF tab in Firefox. Closing tab...");
                driver.close(); // Close the current tab
                return;
            }
        }

        // **Ensure switching back to original window**
        driver.switchTo().window(originalWindow);
    }




    //click action is one of the type of void method
    public static void clickMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        int maxAttempts = 3; // Maximum number of attempts
        int attempt = 0;
        
        while (attempt < maxAttempts) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(xpath)).click();
                System.out.println("Successfully clicked on: " + elementName);
                logger.log(LogStatus.PASS, "Successfully clicked on: " + elementName);
                return; // Success - exit the method
            } catch (org.openqa.selenium.ElementClickInterceptedException e) {
                attempt++;
                System.out.println("\nElementClickInterceptedException encountered, attempt " + attempt + ": " + e.getMessage());
                logger.log(LogStatus.WARNING, "Click intercepted on attempt " + attempt + ", attempting to dismiss blocking modal");
                
                // Try to dismiss blocking modal/dialog
                try {
                    dismissBlockingModal(driver, logger);
                    Thread.sleep(500); // Brief pause after dismissing modal
                } catch (Exception modalException) {
                    System.out.println("Could not dismiss modal: " + modalException.getMessage());
                }
            } catch (Exception e) {
                attempt++;
                // Log the exception for debugging purposes
                System.out.println("\nException encountered, attempt " + attempt + ": " + e);

            }
        }
        
        // If we've exhausted all attempts, throw an AssertionError to stop the test
        String currentUrl = driver.getCurrentUrl();
        String errorMessage = "FAILED: Unable to click on " + elementName + " after " + maxAttempts + " attempts" + " , URL: " + currentUrl;
       // logger.log(LogStatus.FATAL, errorMessage);
        System.out.println(errorMessage);
        logger.log(LogStatus.FAIL, errorMessage);
        getScreenShot(driver, "final_failure_" + elementName.replaceAll("\\s+", "_"), logger);
        throw new AssertionError(errorMessage);
    }//end of click method
    
    private static void dismissBlockingModal(WebDriver driver, ExtentTest logger) {
        try {
            // Try to find and click the "Yes, continue editing" button from the modal
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement continueButton = shortWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='Yes, continue editing.']")));
            continueButton.click();
            System.out.println("✅ Dismissed blocking modal by clicking 'Yes, continue editing' button");
            logger.log(LogStatus.INFO, "✅ Dismissed blocking modal by clicking 'Yes, continue editing' button");
            Thread.sleep(500);
        } catch (Exception e) {
            // If specific button not found, try generic modal close approaches
            try {
                WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(1));
                // Try to find any visible modal and click its close button or overlay
                List<WebElement> modals = driver.findElements(By.cssSelector("div.modal.in, div.modal.show, div.bootbox.modal.in"));
                if (!modals.isEmpty()) {
                    // Try clicking modal backdrop or close button
                    try {
                        WebElement closeBtn = shortWait.until(ExpectedConditions.elementToBeClickable(
                            By.cssSelector("button.close, button[data-dismiss='modal']")));
                        closeBtn.click();
                        System.out.println("✅ Dismissed modal using close button");
                        logger.log(LogStatus.INFO, "✅ Dismissed modal using close button");
                    } catch (Exception closeException) {
                        System.out.println("⚠️ Modal detected but could not dismiss it");
                        logger.log(LogStatus.WARNING, "⚠️ Modal detected but could not dismiss it");
                    }
                }
            } catch (Exception genericException) {
                // No modal found or couldn't dismiss - this is acceptable
            }
        }
    }

    public static void clickByIndex(WebDriver driver, String xpath, int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            // Wait for all elements matching the xpath to be present
            // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
            //  WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)).get(index));

            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
         //   System.out.println("Number of elements found: " + element.getSize());
            // Get the list of elements
            // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(" + xpath + ")[" + (index + 1) + "]")));

            // Click the element
            element.click();
            System.out.println("Successfully clicked on: " + elementName + " at index: " + index);
            logger.log(LogStatus.PASS, "Successfully clicked on: " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to click on: " + elementName +  " at index: " + index + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to click on: " + elementName + " at index: " + index + ": " + e);

        }

    }



    public static void scrollandClickMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            jse.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
            Thread.sleep(1000);

            // First click attempt
            element.click();
            System.out.println("Clicked once on: " + elementName);

            // Wait and verify if still visible — retry once
            Thread.sleep(1500);
//            if (xpath.isDisplayed()) {
//                System.out.println("Element still visible after click — retrying...");
//                jse.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
//                Thread.sleep(500);
//                element.click();
//                System.out.println("Retried click on: " + elementName);
//            }

            logger.log(LogStatus.PASS, "Successfully scrolled and clicked (with retry if needed): " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to scroll and click (with retry): " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to scroll and click (with retry): " + elementName + ": " + e);
        }
    }

    /**
     * Extract image XObject names from the most recent downloaded PDF. Optionally saves images to disk for debugging.
     * Location scanned: src/main/java/downloads
     *
     * @param saveImages if true, saves images to src/main/java/downloads/extracted_images/
     * @return list of image object names found across all pages (e.g., Im1, X1, etc.) or empty list if none
     */
    public static java.util.List<String> getPDFImageNames_from_most_recent_download(boolean saveImages) throws IOException {
        java.util.List<String> imageNames = new java.util.ArrayList<>();
        // Specify the custom download directory
        String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";

        // Create a File object for the downloads folder
        File folder = new File(downloadDir);

        // List all PDF files in the directory
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));

        // Check if there are no PDF files
        if (files == null || files.length == 0) {
            System.out.println("No PDF files found in the downloads folder.");
            return imageNames;
        }

        // Sort files by last modified timestamp (most recent first)
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

        // Get the most recently downloaded PDF file
        File latestPdfFile = files[0];
        System.out.println("Opening latest downloaded PDF for image scan: " + latestPdfFile.getName());

        // Prepare output folder if saving is enabled
        File outDir = null;
        if (saveImages) {
            outDir = new File(downloadDir + "/extracted_images");
            if (!outDir.exists()) {
                outDir.mkdirs();
            }
        }

        // Load the PDF document
        try (PDDocument document = PDDocument.load(latestPdfFile)) {
            int pageIndex = 0;
            for (PDPage page : document.getPages()) {
                pageIndex++;
                PDResources resources = page.getResources();
                if (resources == null) continue;

                for (COSName xObjectName : resources.getXObjectNames()) {
                    try {
                        PDXObject xObject = resources.getXObject(xObjectName);
                        if (xObject instanceof PDImageXObject) {
                            String name = xObjectName.getName();
                            imageNames.add(name);
                            System.out.println("Found image on page " + pageIndex + ": " + name);

                            if (saveImages) {
                                BufferedImage bimg = ((PDImageXObject) xObject).getImage();
                                if (bimg != null) {
                                    String outName = "page-" + pageIndex + "-" + name + ".png";
                                    File outFile = new File(outDir, outName);
                                    ImageIO.write(bimg, "png", outFile);
                                    System.out.println("Saved image: " + outFile.getAbsolutePath());
                                }
                            }
                        }
                    } catch (Exception inner) {
                        // Skip non-image xobjects or failures gracefully
                    }
                }
            }
        }

        if (imageNames.isEmpty()) {
            System.out.println("No images found in the latest PDF.");
        }
        return imageNames;
    }

    public static java.util.List<String> getPDFImageInfo_from_most_recent_download_page_deep(int pageIndexOneBased, boolean saveImages) throws IOException {
        java.util.List<String> infos = new java.util.ArrayList<>();
        String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";
        File folder = new File(downloadDir);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));
        if (files == null || files.length == 0) {
            System.out.println("No PDF files found in the downloads folder.");
            return infos;
        }
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
        File latestPdfFile = files[0];

        File outDir = null;
        if (saveImages) {
            outDir = new File(downloadDir + "/extracted_images");
            if (!outDir.exists()) {
                outDir.mkdirs();
            }
        }

        try (PDDocument document = PDDocument.load(latestPdfFile)) {
            int currentIndex = 0;
            for (PDPage page : document.getPages()) {
                currentIndex++;
                if (currentIndex != pageIndexOneBased) continue;
                PDResources resources = page.getResources();
                if (resources == null) break;
                traverseResourcesForImages(resources, "", currentIndex, outDir, saveImages, infos);
                break;
            }
        }

        if (infos.isEmpty()) {
            System.out.println("No images found on page " + pageIndexOneBased + " (deep scan).");
        }
        return infos;
    }

    private static void traverseResourcesForImages(PDResources resources, String prefix, int pageIndex,
                                                   File outDir, boolean saveImages, java.util.List<String> infos) throws IOException {
        for (COSName name : resources.getXObjectNames()) {
            try {
                PDXObject xObject = resources.getXObject(name);
                String fullName = prefix.isEmpty() ? name.getName() : prefix + "/" + name.getName();
                if (xObject instanceof PDImageXObject) {
                    BufferedImage bimg = ((PDImageXObject) xObject).getImage();
                    String hash = (bimg != null) ? sha256OfImage(bimg) : "";
                    infos.add("page=" + pageIndex + ", name=" + fullName + ", hash=" + hash);
                    System.out.println("Found image (deep) on page " + pageIndex + ": " + fullName + " hash=" + hash);
                    if (saveImages && bimg != null && outDir != null) {
                        String outName = "page-" + pageIndex + "-" + fullName.replace('/', '_') + ".png";
                        File outFile = new File(outDir, outName);
                        ImageIO.write(bimg, "png", outFile);
                        System.out.println("Saved image: " + outFile.getAbsolutePath());
                    }
                } else if (xObject instanceof PDFormXObject) {
                    PDFormXObject form = (PDFormXObject) xObject;
                    PDResources formRes = form.getResources();
                    if (formRes != null) {
                        traverseResourcesForImages(formRes, fullName, pageIndex, outDir, saveImages, infos);
                    }
                }
            } catch (Exception ignore) {
            }
        }
    }

    private static String sha256OfImage(BufferedImage img) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "png", baos);
            byte[] bytes = baos.toByteArray();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(bytes);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (IOException | NoSuchAlgorithmException e) {
            return "";
        }
    }

    /**
     * Extract image XObject names from a specific PDF file path. Optionally saves images to disk for debugging.
     *
     * @param absolutePdfPath absolute path to the PDF to scan
     * @param saveImages if true, saves images next to the PDF under an "extracted_images" subfolder
     * @return list of image object names found across all pages, or empty list if none
     */
    public static java.util.List<String> getPDFImageNames_from_path(String absolutePdfPath, boolean saveImages) throws IOException {
        java.util.List<String> imageNames = new java.util.ArrayList<>();
        if (absolutePdfPath == null) {
            System.out.println("PDF path is null.");
            return imageNames;
        }

        File pdfFile = new File(absolutePdfPath);
        if (!pdfFile.exists() || !pdfFile.isFile()) {
            System.out.println("PDF not found: " + absolutePdfPath);
            return imageNames;
        }

        System.out.println("Opening PDF for image scan: " + pdfFile.getAbsolutePath());

        // Prepare output folder if saving is enabled
        File outDir = null;
        if (saveImages) {
            outDir = new File(pdfFile.getParentFile(), "extracted_images");
            if (!outDir.exists()) {
                outDir.mkdirs();
            }
        }

        try (PDDocument document = PDDocument.load(pdfFile)) {
            int pageIndex = 0;
            for (PDPage page : document.getPages()) {
                pageIndex++;
                PDResources resources = page.getResources();
                if (resources == null) continue;

                for (COSName xObjectName : resources.getXObjectNames()) {
                    try {
                        PDXObject xObject = resources.getXObject(xObjectName);
                        if (xObject instanceof PDImageXObject) {
                            String name = xObjectName.getName();
                            imageNames.add(name);
                            System.out.println("Found image on page " + pageIndex + ": " + name);

                            if (saveImages) {
                                BufferedImage bimg = ((PDImageXObject) xObject).getImage();
                                if (bimg != null) {
                                    String outName = pdfFile.getName().replaceAll("\\.pdf$","") + "-page-" + pageIndex + "-" + name + ".png";
                                    File outFile = new File(outDir, outName);
                                    ImageIO.write(bimg, "png", outFile);
                                    System.out.println("Saved image: " + outFile.getAbsolutePath());
                                }
                            }
                        }
                    } catch (Exception inner) {
                        // Skip non-image xobjects or failures gracefully
                    }
                }
            }
        }

        if (imageNames.isEmpty()) {
            System.out.println("No images found in PDF: " + pdfFile.getName());
        }
        return imageNames;
    }

    public static java.util.List<String> getPDFImageNames_from_most_recent_download_page(int pageIndexOneBased, boolean saveImages) throws IOException {
        java.util.List<String> imageNames = new java.util.ArrayList<>();
        String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";
        File folder = new File(downloadDir);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));
        if (files == null || files.length == 0) {
            System.out.println("No PDF files found in the downloads folder.");
            return imageNames;
        }
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
        File latestPdfFile = files[0];

        File outDir = null;
        if (saveImages) {
            outDir = new File(downloadDir + "/extracted_images");
            if (!outDir.exists()) {
                outDir.mkdirs();
            }
        }

        try (PDDocument document = PDDocument.load(latestPdfFile)) {
            int currentIndex = 0;
            for (PDPage page : document.getPages()) {
                currentIndex++;
                if (currentIndex != pageIndexOneBased) continue;
                PDResources resources = page.getResources();
                if (resources == null) break;

                for (COSName xObjectName : resources.getXObjectNames()) {
                    try {
                        PDXObject xObject = resources.getXObject(xObjectName);
                        if (xObject instanceof PDImageXObject) {
                            String name = xObjectName.getName();
                            imageNames.add(name);
                            System.out.println("Found image on page " + currentIndex + ": " + name);
                            if (saveImages) {
                                BufferedImage bimg = ((PDImageXObject) xObject).getImage();
                                if (bimg != null) {
                                    String outName = "page-" + currentIndex + "-" + name + ".png";
                                    File outFile = new File(outDir, outName);
                                    ImageIO.write(bimg, "png", outFile);
                                    System.out.println("Saved image: " + outFile.getAbsolutePath());
                                }
                            }
                        }
                    } catch (Exception inner) {
                    }
                }
                break;
            }
        }

        if (imageNames.isEmpty()) {
            System.out.println("No images found on page " + pageIndexOneBased + ".");
        }
        return imageNames;
    }

    /**
     * Compares images from the most recent downloaded PDF with multiple expected logo images using pixel comparison.
     * Saves extracted PDF images to disk and checks if any match the provided expected images.
     * Use this version when you have multiple logos to compare. Includes automatic ExtentReport logging.
     *
     * @param logger ExtentTest logger for logging results (can be null if no logging needed)
     * @param similarityThreshold Percentage threshold for match (0.0 to 100.0). E.g., 95.0 means 95% similarity required
     * @param expectedImagePaths Variable number of absolute paths to expected logo images (e.g., "logo1.png", "logo2.png", "logo3.png")
     * @return Map with image names as keys and match results (true/false) as values
     * @throws IOException if PDF or image files cannot be read
     */
    public static Map<String, Boolean> compareImagesInPDF_with_expected_logos(
            ExtentTest logger,
            double similarityThreshold,
            String... expectedImagePaths) throws IOException {
        
        Map<String, Boolean> matchResults = new HashMap<>();
        String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";
        
        // Get most recent PDF
        File folder = new File(downloadDir);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));
        if (files == null || files.length == 0) {
            System.out.println("No PDF files found in the downloads folder.");
            return matchResults;
        }
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
        File latestPdfFile = files[0];
        System.out.println("Comparing images in PDF: " + latestPdfFile.getName());
        
        // Load expected images
        java.util.List<BufferedImage> expectedImages = new java.util.ArrayList<>();
        java.util.List<String> expectedImageNames = new java.util.ArrayList<>();
        
        for (String imagePath : expectedImagePaths) {
            if (imagePath != null && !imagePath.isEmpty()) {
                File imgFile = new File(imagePath);
                if (imgFile.exists()) {
                    BufferedImage img = ImageIO.read(imgFile);
                    if (img != null) {
                        expectedImages.add(img);
                        expectedImageNames.add(imgFile.getName());
                        System.out.println("Loaded expected image: " + imgFile.getName());
                    } else {
                        System.out.println("Warning: Could not read image: " + imagePath);
                    }
                } else {
                    System.out.println("Warning: Expected image not found: " + imagePath);
                }
            }
        }
        
        if (expectedImages.isEmpty()) {
            System.out.println("No valid expected images to compare against.");
            return matchResults;
        }
        
        // Create output directory for extracted images
        File outDir = new File(downloadDir + "/extracted_images");
        if (!outDir.exists()) {
            outDir.mkdirs();
        }
        
        // Extract and compare images from PDF (skip duplicates, early exit when all found)
        Set<String> processedImages = new HashSet<>();
        Set<Integer> matchedLogoIndices = new HashSet<>(); // Track which expected logos have been matched
        int expectedLogosCount = expectedImageNames.size();
        
        try (PDDocument document = PDDocument.load(latestPdfFile)) {
            int pageIndex = 0;
            pageLoop: for (PDPage page : document.getPages()) {
                pageIndex++;
                PDResources resources = page.getResources();
                if (resources == null) continue;
                
                for (COSName xObjectName : resources.getXObjectNames()) {
                    try {
                        PDXObject xObject = resources.getXObject(xObjectName);
                        if (xObject instanceof PDImageXObject) {
                            String imageName = xObjectName.getName();
                            
                            // Skip if we already processed this image name
                            if (processedImages.contains(imageName)) {
                                System.out.println("Skipping duplicate image '" + imageName + "' on page " + pageIndex);
                                continue;
                            }
                            processedImages.add(imageName);
                            
                            BufferedImage pdfImage = ((PDImageXObject) xObject).getImage();
                            
                            if (pdfImage != null) {
                                // Save extracted image
                                String outName = "page-" + pageIndex + "-" + imageName + ".png";
                                File outFile = new File(outDir, outName);
                                ImageIO.write(pdfImage, "png", outFile);
                                System.out.println("Extracted image: " + outFile.getAbsolutePath());
                                
                                // Compare with each expected image (skip already matched logos)
                                boolean foundMatch = false;
                                for (int i = 0; i < expectedImages.size(); i++) {
                                    // Skip if this expected logo was already matched
                                    if (matchedLogoIndices.contains(i)) {
                                        continue;
                                    }
                                    
                                    BufferedImage expectedImage = expectedImages.get(i);
                                    String expectedName = expectedImageNames.get(i);
                                    double similarity = calculateImageSimilarity(pdfImage, expectedImage);
                                    
                                    System.out.println("Comparing '" + imageName + "' with '" + expectedName + "': " + 
                                                     String.format("%.2f", similarity) + "% similarity");
                                    
                                    if (similarity >= similarityThreshold) {
                                        foundMatch = true;
                                        matchedLogoIndices.add(i); // Mark this logo as matched
                                        System.out.println("✅ MATCH FOUND: '" + imageName + "' matches '" + expectedName +
                                                         "' (similarity: " + String.format("%.2f", similarity) + "%)");
                                        break;
                                    }
                                }
                                
                                matchResults.put(imageName, foundMatch);
                                if (!foundMatch) {
                                    System.out.println(" ❌ NO MATCH: '" + imageName + "' does not match any expected images");
                                }
                                
                                // Early exit: Stop if all expected logos have been found
                                if (matchedLogoIndices.size() >= expectedLogosCount) {
                                    System.out.println("\n✅ All " + expectedLogosCount + " expected logos found! Stopping search early.");
                                    break pageLoop;
                                }
                            }
                        }
                    } catch (Exception inner) {
                        System.out.println("Error processing image: " + inner.getMessage());
                    }
                }
            }
        }
        
        // Summary with detailed results
        System.out.println("\n=== COMPARISON SUMMARY ===");
        long matchCount = matchResults.values().stream().filter(match -> match).count();
        long totalImages = matchResults.size();
        
        System.out.println("Total images in PDF: " + totalImages);
        System.out.println("Images matching expected logos: " + matchCount);
        System.out.println("Unmatched images: " + (totalImages - matchCount));
        System.out.println("Expected logos provided: " + expectedLogosCount);
        
        // Universal result evaluation with ExtentReport logging
        if (matchCount == 0) {
            System.out.println("\n❌  RESULT: No expected logos found in PDF");
            if (logger != null) {
                logger.log(LogStatus.FAIL, "❌ Logo verification failed: No logos found in PDF");
            }
        } else if (matchCount < expectedLogosCount) {
            System.out.println("\n⚠ RESULT: Only " + matchCount + " of " + expectedLogosCount + " expected logos found");
            if (logger != null) {
                logger.log(LogStatus.WARNING, "Logo verification partial: Only " + matchCount + " of " + expectedLogosCount + " logos found");
            }
        } else {
            System.out.println("\n✅ RESULT: All " + expectedLogosCount + " expected logos found in PDF");
            if (logger != null) {
                logger.log(LogStatus.PASS, "✅ Logo verification passed: All " + expectedLogosCount + " logos found in PDF");
            }
        }
        
        return matchResults;
    }

    /**
     * Compares images from the most recent downloaded PDF with expected logo images using pixel comparison.
     * Saves extracted PDF images to disk and checks if any match the provided expected images.
     *
     * @param expectedImage1Path Absolute path to first expected logo image (e.g., "/path/to/logo1.png")
     * @param expectedImage2Path Absolute path to second expected logo image (e.g., "/path/to/logo2.png") - can be null
     * @param similarityThreshold Percentage threshold for match (0.0 to 100.0). E.g., 95.0 means 95% similarity required
     * @return Map with image names as keys and match results (true/false) as values
     * @throws IOException if PDF or image files cannot be read
     */
    public static Map<String, Boolean> compareImagesInPDF_with_expected_logos(
            String expectedImage1Path,
            String expectedImage2Path,
            double similarityThreshold) throws IOException {
        
        Map<String, Boolean> matchResults = new HashMap<>();
        String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";
        
        // Get most recent PDF
        File folder = new File(downloadDir);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));
        if (files == null || files.length == 0) {
            System.out.println("No PDF files found in the downloads folder.");
            return matchResults;
        }
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
        File latestPdfFile = files[0];
        System.out.println("Comparing images in PDF: " + latestPdfFile.getName());
        
        // Load expected images
        java.util.List<BufferedImage> expectedImages = new java.util.ArrayList<>();
        java.util.List<String> expectedImageNames = new java.util.ArrayList<>();
        
        // Load first image
        if (expectedImage1Path != null && !expectedImage1Path.isEmpty()) {
            File imgFile1 = new File(expectedImage1Path);
            if (imgFile1.exists()) {
                BufferedImage img = ImageIO.read(imgFile1);
                if (img != null) {
                    expectedImages.add(img);
                    expectedImageNames.add(imgFile1.getName());
                    System.out.println("Loaded expected image 1: " + imgFile1.getName());
                } else {
                    System.out.println("Warning: Could not read image: " + expectedImage1Path);
                }
            } else {
                System.out.println("Warning: Expected image not found: " + expectedImage1Path);
            }
        }
        
        // Load second image (optional)
        if (expectedImage2Path != null && !expectedImage2Path.isEmpty()) {
            File imgFile2 = new File(expectedImage2Path);
            if (imgFile2.exists()) {
                BufferedImage img = ImageIO.read(imgFile2);
                if (img != null) {
                    expectedImages.add(img);
                    expectedImageNames.add(imgFile2.getName());
                    System.out.println("Loaded expected image 2: " + imgFile2.getName());
                } else {
                    System.out.println("Warning: Could not read image: " + expectedImage2Path);
                }
            } else {
                System.out.println("Warning: Expected image not found: " + expectedImage2Path);
            }
        }
        
        if (expectedImages.isEmpty()) {
            System.out.println("No valid expected images to compare against.");
            return matchResults;
        }
        
        // Create output directory for extracted images
        File outDir = new File(downloadDir + "/extracted_images");
        if (!outDir.exists()) {
            outDir.mkdirs();
        }
        
        // Extract and compare images from PDF
        try (PDDocument document = PDDocument.load(latestPdfFile)) {
            int pageIndex = 0;
            for (PDPage page : document.getPages()) {
                pageIndex++;
                PDResources resources = page.getResources();
                if (resources == null) continue;
                
                for (COSName xObjectName : resources.getXObjectNames()) {
                    try {
                        PDXObject xObject = resources.getXObject(xObjectName);
                        if (xObject instanceof PDImageXObject) {
                            String imageName = xObjectName.getName();
                            BufferedImage pdfImage = ((PDImageXObject) xObject).getImage();
                            
                            if (pdfImage != null) {
                                // Save extracted image
                                String outName = "page-" + pageIndex + "-" + imageName + ".png";
                                File outFile = new File(outDir, outName);
                                ImageIO.write(pdfImage, "png", outFile);
                                System.out.println("Extracted image: " + outFile.getAbsolutePath());
                                
                                // Compare with each expected image
                                boolean foundMatch = false;
                                for (int i = 0; i < expectedImages.size(); i++) {
                                    BufferedImage expectedImage = expectedImages.get(i);
                                    String expectedName = expectedImageNames.get(i);
                                    double similarity = calculateImageSimilarity(pdfImage, expectedImage);
                                    
                                    System.out.println("Comparing '" + imageName + "' with '" + expectedName + "': " + 
                                                     String.format("%.2f", similarity) + "% similarity");
                                    
                                    if (similarity >= similarityThreshold) {
                                        foundMatch = true;
                                        System.out.println("✓ MATCH FOUND: '" + imageName + "' matches '" + expectedName + 
                                                         "' (similarity: " + String.format("%.2f", similarity) + "%)");
                                        break;
                                    }
                                }
                                
                                matchResults.put(imageName, foundMatch);
                                if (!foundMatch) {
                                    System.out.println("✗ NO MATCH: '" + imageName + "' does not match any expected images");
                                }
                            }
                        }
                    } catch (Exception inner) {
                        System.out.println("Error processing image: " + inner.getMessage());
                    }
                }
            }
        }
        
        // Summary
        System.out.println("\n=== COMPARISON SUMMARY ===");
        long matchCount = matchResults.values().stream().filter(match -> match).count();
        System.out.println("Total images in PDF: " + matchResults.size());
        System.out.println("Matched images: " + matchCount);
        System.out.println("Unmatched images: " + (matchResults.size() - matchCount));
        
        return matchResults;
    }
    
    /**
     * Calculates pixel-by-pixel similarity between two images.
     * Returns percentage of matching pixels (0.0 to 100.0).
     * Images are resized to match dimensions if different.
     */
    private static double calculateImageSimilarity(BufferedImage img1, BufferedImage img2) {
        // Resize images to same dimensions if needed
        int width = Math.min(img1.getWidth(), img2.getWidth());
        int height = Math.min(img1.getHeight(), img2.getHeight());
        
        BufferedImage resized1 = resizeImage(img1, width, height);
        BufferedImage resized2 = resizeImage(img2, width, height);
        
        long totalPixels = (long) width * height;
        long matchingPixels = 0;
        
        // Compare each pixel with tolerance for minor variations
        int tolerance = 10; // RGB tolerance per channel
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb1 = resized1.getRGB(x, y);
                int rgb2 = resized2.getRGB(x, y);
                
                int r1 = (rgb1 >> 16) & 0xFF;
                int g1 = (rgb1 >> 8) & 0xFF;
                int b1 = rgb1 & 0xFF;
                
                int r2 = (rgb2 >> 16) & 0xFF;
                int g2 = (rgb2 >> 8) & 0xFF;
                int b2 = rgb2 & 0xFF;
                
                if (Math.abs(r1 - r2) <= tolerance && 
                    Math.abs(g1 - g2) <= tolerance && 
                    Math.abs(b1 - b2) <= tolerance) {
                    matchingPixels++;
                }
            }
        }
        
        return (matchingPixels * 100.0) / totalPixels;
    }
    
    /**
     * Resizes an image to specified dimensions.
     */
    private static BufferedImage resizeImage(BufferedImage original, int targetWidth, int targetHeight) {
        if (original.getWidth() == targetWidth && original.getHeight() == targetHeight) {
            return original;
        }
        
        BufferedImage resized = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = resized.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(original, 0, 0, targetWidth, targetHeight, null);
        g.dispose();
        return resized;
    }

    //create select dropdown by visible text
    public static void selectByText(WebDriver driver, WebElement xpath, String visibleText, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(visibleText);
            System.out.println("Successfully selected by visible text: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select by visible text: " + elementName + ": " + e);
        }//end of scroll by element exception
    }//end of scroll by element

    public static void selectByValue(WebDriver driver, WebElement xpath, String Value, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
            Select dropdown = new Select(element);
            dropdown.selectByValue(Value);
            System.out.println("Successfully selected by value: " + elementName);
            logger.log(LogStatus.PASS, "Successfully clicked on: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select by value: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to select by value: " + elementName + ": " + e);
        }//end of scroll by element exception
    }//end of scroll by element

    public static void selectByIndex(WebDriver driver, WebElement xpath, int Value, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
            Select dropdown = new Select(element);
            dropdown.selectByIndex(Value);
            System.out.println("Successfully selected by index: " + elementName);
            logger.log(LogStatus.PASS, "Successfully selected by index: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to be selected by index: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to be selected by index: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of scroll by element exception
    }//end of scroll by element


    //submit action is one of the type of void method
    public static void submitMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            wait.until(ExpectedConditions.elementToBeClickable((xpath))).click();
            Thread.sleep(500);

            wait.until(ExpectedConditions.elementToBeClickable((xpath))).sendKeys(Keys.ENTER);
            System.out.println("Successfully  submitted on: " + elementName);
            logger.log(LogStatus.PASS, "Successfully submitted on: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to submit on: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }
    }//end of submit method

    public static void errorDisplayed(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            if ((xpath.isDisplayed())) {
                System.out.println("Error Message:  " + elementName + " is visible");
                logger.log(LogStatus.FAIL, "Error Message:  " + elementName + " is visible");

            }
        } catch (Exception e) {
            System.out.println("No Errors for: " + elementName);
            logger.log(LogStatus.PASS, "No Errors for:  " + elementName);
        }
    }//end of submit method

    public static void clearMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try {
            wait.until(ExpectedConditions.elementToBeClickable((xpath))).click();
            Thread.sleep(500);
            wait.until(ExpectedConditions.elementToBeClickable((xpath))).clear();
            System.out.println("Successfully cleared: " + elementName);
            logger.log(LogStatus.PASS, "Successfully cleared: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to clear: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);

        }


    }//end of submit method


    //sendkeys action is one of the type of void method
    public static void sendKeysMethod(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        int maxAttempts = 2; // Maximum number of attempts
        int attempt = 0;
        while (attempt < maxAttempts) {
            try {
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
                //    attempt++;

                // element.clear();
                element.sendKeys(userValue);
                System.out.println("Successfully entered a value on: " + elementName);
                logger.log(LogStatus.PASS, "Successfully entered a value on: " + elementName);
                return;
            } catch (StaleElementReferenceException e) {
                attempt++;
                // Retry the click if StaleElementReferenceException is caught
                System.out.println("\n" + "Stale element encountered, retrying  attempt " + attempt);
                logger.log(LogStatus.INFO, "Stale element encountered, retrying  attempt " + attempt);
                wait.until(ExpectedConditions.elementToBeClickable(xpath));
            } catch (Exception e) {
                attempt++;

                System.out.println("retrying, Unable to enter a value on: " + elementName + ": " + e);
                logger.log(LogStatus.FAIL, "retrying, Unable to enter a value on: " + elementName + ": " + e);
                getScreenShot(driver, "screenshot", logger);
            }
        }
    }//end of sendkeys method

    public static void sendkeys_js_method(WebDriver driver, WebElement element, String userValue, ExtentTest logger, String elementName) {
        int maxAttempts = 2; // Maximum number of attempts
        int attempt = 0;

        while (attempt < maxAttempts) {
            try {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].value = arguments[1];", element, userValue);

                System.out.println("Successfully entered a value using JavaScript on: " + elementName);
                logger.log(LogStatus.PASS, "Successfully entered a value using JavaScript on: " + elementName);
                return; // Exit loop if successful
            } catch (Exception e) {
                attempt++;
                System.out.println("Attempt " + attempt + ": Failed to enter value using JavaScript on " + elementName + " - " + e);
                logger.log(LogStatus.FAIL, "Attempt " + attempt + ": Failed to enter value using JavaScript on " + elementName + " - " + e);

                if (attempt == maxAttempts) {
                    getScreenShot(driver, "screenshot", logger);
                }
            }
        }
    }

    //sendkeys action is one of the type of void method
    public static void sendKeysandSubmitMethod(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        int maxAttempts = 2; // Maximum number of attempts
        int attempt = 0;
        while (attempt < maxAttempts) {
            try {
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
                element.clear();
                element.sendKeys(userValue);
                Thread.sleep(500);
                element.sendKeys(Keys.ENTER);
                System.out.println("Successfully entered a value on: " + elementName);
                logger.log(LogStatus.PASS, "Successfully entered a value on: " + elementName);
                return;
            } catch (StaleElementReferenceException e) {
                attempt++;
                // Retry the click if StaleElementReferenceException is caught
                System.out.println("\n" + "Stale element encountered, retrying click attempt " + attempt);
                logger.log(LogStatus.INFO, "Stale element encountered, retrying click attempt " + attempt);
                wait.until(ExpectedConditions.elementToBeClickable(xpath));
            } catch (Exception e) {
                attempt++;
                System.out.println("Unable to enter a value on: " + elementName + ": " + e);
                logger.log(LogStatus.FAIL, "Unable to enter a value on: " + elementName + ": " + e);
                getScreenShot(driver, "screenshot", logger);
            }
        }
    }//end of sendkeys method

    public static void sendKeysandSubmitMethod2(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        int maxAttempts = 2; // Maximum number of attempts
        int attempt = 0;
        while (attempt < maxAttempts) {
            try {
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
                element.sendKeys(userValue);
                Thread.sleep(1500);
              //  element.click();
               // Thread.sleep(500);

                element.sendKeys(Keys.ENTER);
                System.out.println("Successfully entered a value on: " + elementName);
                logger.log(LogStatus.PASS, "Successfully entered a value on: " + elementName);
                return;
            } catch (StaleElementReferenceException e) {
                attempt++;
                // Retry the click if StaleElementReferenceException is caught
                System.out.println("\n" + "Stale element encountered, retrying click attempt " + attempt);
                logger.log(LogStatus.INFO, "Stale element encountered, retrying click attempt " + attempt);
                wait.until(ExpectedConditions.elementToBeClickable(xpath));
            } catch (Exception e) {
                attempt++;
                System.out.println("Unable to enter a value on: " + elementName + ": " + e);
                logger.log(LogStatus.FAIL, "Unable to enter a value on: " + elementName + ": " + e);
                getScreenShot(driver, "screenshot", logger);
            }
        }
    }//end of sendkeys method

    //click action is one of the type of void method
    public static void sendKeysMethodByIndex(WebDriver driver, String xpath, String userValue, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            element.clear();
            element.sendKeys(userValue);
            System.out.println("Successfully entered a value on: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to enter a value on: " + elementName + ": " + e);
        }
    }//end of sendkeys method


    public static void verifyEmptyText(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            result = element.getText();
            if (result.isEmpty()) {
                System.out.println(elementName + ": is empty as expected.");
                logger.log(LogStatus.PASS, elementName + " is empty as expected");
            } else {
                System.out.println(elementName + " : IS NOT empty as expected. Content: " + result);
                logger.log(LogStatus.FAIL, elementName + " : IS NOT empty as expected. Content: " + result);
            }

        } catch (Exception e) {
            System.out.println("Unable to capture text from: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text from: " + elementName + ": " + e);
            //  getScreenShot(driver, "screenshot", logger);

        }
       // return result;
    }//end of get text method

    //capture a text and return it using return method
    public static String captureTextMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            result = element.getText();
            System.out.println("\n" + elementName + "\n" + result + "\n");
            logger.log(LogStatus.PASS, "  " + elementName + "\n");
            logger.log(LogStatus.PASS, "\n" + result + "\n");

        } catch (Exception e) {
            System.out.println("Unable to capture text from: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text from: " + elementName + ": " + e);
            //  getScreenShot(driver, "screenshot", logger);

        }
        return result;
    }//end of get text method

    public static String saveTextMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
        String result = null;
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            result = element.getText();
            System.out.println("\n" + elementName + " saved"+ "\n");
            logger.log(LogStatus.PASS, "  " + elementName + "\n");
//            logger.log(LogStatus.PASS, "\n" + result + "\n");

        } catch (Exception e) {
            System.out.println("Unable to capture text from: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text from: " + elementName + ": " + e);
            //  getScreenShot(driver, "screenshot", logger);

        }
        return result;
    }//end of get text method


    public static String captureAttributeMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName, String attributeName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String result = null;
        try {
            WebElement foundElement = wait.until(ExpectedConditions.elementToBeClickable(xpath));
            result = foundElement.getAttribute(attributeName);
            System.out.println("\n" + elementName + "\n" + result + "\n");
            logger.log(LogStatus.PASS, "  " + elementName + "\n");
            logger.log(LogStatus.PASS, "\n" + result + "\n");

        } catch (Exception e) {
            System.out.println("Unable to capture text from: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to capture text from: " + elementName + ": " + e);
            // Assuming you have a method to take screenshots
            // getScreenShot(driver, "screenshot", logger);
        }
        return result;
    }

    public static void open_href_attribute_link(WebDriver driver, WebElement linkElement, ExtentTest logger, String elementName) {
        try {
            // Click the link using JS to trigger download
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkElement);
            System.out.println("Clicked download link: " + elementName);
            logger.log(LogStatus.PASS, "Clicked download link: " + elementName);

        } catch (Exception e) {
            System.out.println("Failed to click download link: " + elementName + " -> " + e);
            logger.log(LogStatus.FAIL, "Failed to click download link: " + elementName + " -> " + e);
        }
    }


    public static void setAttributeValue(WebDriver driver, WebElement element, ExtentTest logger, String attributeName, String attributeValue) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attributeName, attributeValue);
            System.out.println("Set attribute '" + attributeName + "' to value: " + attributeValue);
            logger.log(LogStatus.PASS, "Set attribute '" + attributeName + "' to value: " + attributeValue);
        } catch (Exception e) {
            System.out.println("Unable to set attribute '" + attributeName + "' value: " + e);
            logger.log(LogStatus.FAIL, "Unable to set attribute '" + attributeName + "' value: " + e);
            // Assuming you have a method to take screenshots
            // getScreenShot(driver, "screenshot", logger);
        }
    }


    //hover over by mouse
    //create a void method for mouse hoover
    public static void mouseHoverMethod(WebDriver driver, WebElement element, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions mouseActions = new Actions(driver);

        try {
            // Primary: Direct Actions hover
            WebElement el = wait.until(ExpectedConditions.visibilityOf(element));

            // Scroll into view to improve reliability
          //  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);

            mouseActions.moveToElement(el).perform();

            // Optional small wait for menus/tooltips
            Thread.sleep(500);

            System.out.println("✅ Successfully hovered over: " + elementName);
            logger.log(LogStatus.PASS, "Successfully hovered over: " + elementName);

        } catch (Exception e) {
            System.out.println("⚠️ Direct hover failed on: " + elementName + " → Trying offset hover...");
            logger.log(LogStatus.WARNING, "Fallback to offset hover for: " + elementName);

            try {
                WebElement el = wait.until(ExpectedConditions.visibilityOf(element));

                // Offset hover (secondary)
                mouseActions.moveToElement(el, 5, 5).perform();

                Thread.sleep(500);

                System.out.println("✅ Successfully hovered (via offset): " + elementName);
                logger.log(LogStatus.PASS, "Successfully hovered (via offset): " + elementName);

            } catch (Exception ex) {
                System.out.println("❌ Unable to hover over: " + elementName + " using both methods → " + ex);
                logger.log(LogStatus.FAIL, "Unable to hover over: " + elementName + " using both methods → " + ex);
                getScreenShot(driver, "screenshot", logger);
            }
        }
    }



    //double click
    //create a void method for double click
    public static void scrollandDoubleClickMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions mouseActions = new Actions(driver);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            //  jse.executeScript("arguments[0].scrollIntoView(true)",element);
            jse.executeScript("arguments[0].scrollIntoView({block: 'center'})", element);

//            Thread.sleep(1000);
//            jse.executeScript("window.scrollBy(0, -5000);");
//            Thread.sleep(1000);
//
//            jse.executeScript("scroll(0,-5000)");
            Thread.sleep(500);
            mouseActions.doubleClick(element).perform();
            System.out.println("Successfully double clicked: " + elementName);
            logger.log(LogStatus.PASS, "Successfully double clicked " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to double click : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to double click: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of double click exception
    }//end of double click method

    public static void doubleClickMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
//            jse.executeScript("arguments[0].scrollIntoView(true)",element);
            jse.executeScript("arguments[0].scrollIntoView({block: 'center'})", element);

            Thread.sleep(500);
            mouseActions.doubleClick(element).perform();
            System.out.println("Successfully double clicked: " + elementName);
            logger.log(LogStatus.PASS, "Successfully double clicked " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to double click : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to double click: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of double click exception
    }//end of double click method
    public static void click_to_right_method(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            mouseActions.moveToElement(element, 70, 0)   // move 70px right from center
                    .doubleClick()                   // double-click at **current mouse location**
                    .perform();

            Thread.sleep(500);
            System.out.println("Successfully  clicked to right: " + elementName);
            logger.log(LogStatus.PASS, "Successfully  clicked to right: " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to  click to right: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to click to right:" + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of double click exception
    }//end of double click method

    public static void doubleClick_noScrollMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       // JavascriptExecutor jse = (JavascriptExecutor) driver;

        Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
//            jse.executeScript("arguments[0].scrollIntoView(true)",element);
          //  jse.executeScript("arguments[0].scrollIntoView({block: 'center'})", element);

         //   Thread.sleep(500);
            mouseActions.doubleClick(element).perform();
            System.out.println("Successfully double clicked: " + elementName);
            logger.log(LogStatus.PASS, "Successfully double clicked " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to double click : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to double click: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of double click exception
    }//end of double click method


    public static void rightClickMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            mouseActions.contextClick(element).perform();
            System.out.println("Successfully right clicked: " + elementName);
            logger.log(LogStatus.PASS, "Successfully right clicked " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to right click : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to right click: " + elementName + ": " + e);
        }
    }

    public static void selectAll_method(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      //  Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));

//element.clear();
            String os = System.getProperty("os.name").toLowerCase();
            String selectAllKey = (os.contains("mac")) ? Keys.chord(Keys.COMMAND, "a") : Keys.chord(Keys.CONTROL, "a");
            element.sendKeys(selectAllKey);
//            // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//            Thread.sleep(500);
//            element.sendKeys(Keys.BACK_SPACE);

            //  mouseActions.sendKeys(Keys.BACK_SPACE).perform();
            //  element.sendKeys(String.valueOf(Keys.BACK_SPACE));
            //   Thread.sleep(500);


            // Send Ctrl+A (or Command+A on Mac) to select all text
//            if (System.getProperty("os.name").startsWith("Mac")) {
//                element.sendKeys(Keys.chord(Keys.COMMAND, "a"));
//            } else {
//                element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//            }
//            element.sendKeys(Keys.BACK_SPACE);

            System.out.println("Successfully selected all text  in: " + elementName);
            logger.log(LogStatus.PASS, "Successfully selected all text  in " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select all text in: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to select all text  in " + elementName + ": " + e);
        }
    }

    public static void clickEnterThenPaste_method(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            // Wait until the element is clickable
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));

            // Determine OS and set the appropriate key combination for pasting clipboard content
            String os = System.getProperty("os.name").toLowerCase();
            String pasteKey = (os.contains("mac")) ? Keys.chord(Keys.COMMAND, "v") : Keys.chord(Keys.CONTROL, "v");

            // Send Enter key followed by paste action
            element.sendKeys(Keys.ENTER); // Click Enter
            element.sendKeys(pasteKey);   // Paste clipboard content

            System.out.println("Successfully clicked Enter and pasted text in: " + elementName);
            logger.log(LogStatus.PASS, "Successfully clicked Enter and pasted text in " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click Enter and paste text in: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to click Enter and paste text in " + elementName + ": " + e);
        }
    }

    public static void selectAllandDelete_method(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //  Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));

//element.clear();
            String os = System.getProperty("os.name").toLowerCase();
            String selectAllKey = (os.contains("mac")) ? Keys.chord(Keys.COMMAND, "a") : Keys.chord(Keys.CONTROL, "a");
            element.sendKeys(selectAllKey);
//            // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
            Thread.sleep(500);
            element.sendKeys(Keys.BACK_SPACE);

            //  mouseActions.sendKeys(Keys.BACK_SPACE).perform();
            //  element.sendKeys(String.valueOf(Keys.BACK_SPACE));
            //   Thread.sleep(500);


            // Send Ctrl+A (or Command+A on Mac) to select all text
//            if (System.getProperty("os.name").startsWith("Mac")) {
//                element.sendKeys(Keys.chord(Keys.COMMAND, "a"));
//            } else {
//                element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//            }
//            element.sendKeys(Keys.BACK_SPACE);

            System.out.println("Successfully selected all text and deleted in: " + elementName);
            logger.log(LogStatus.PASS, "Successfully selected all text and deleted in " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select all text and deletein: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to select all text and delete  in " + elementName + ": " + e);
        }
    }
    public static void escapeMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            mouseActions.sendKeys(Keys.ESCAPE).perform();
//            Thread.sleep(500);
//            mouseActions.contextClick(element).perform();
            System.out.println("Successfully clicked escape " + elementName);
            logger.log(LogStatus.PASS, "Successfully clicked escape " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to  click escape: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to  click escape: " + elementName + ": " + e);
        }
    }


    public static void doubleClickandSendKeysMethod(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions mouseActions = new Actions(driver);

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            mouseActions.doubleClick(element).perform();
            System.out.println("Successfully double clicked: " + elementName);
            logger.log(LogStatus.PASS, "Successfully double clicked " + elementName);
            Thread.sleep(1500);
            // element.clear();
            mouseActions.sendKeys(userValue).perform();
            System.out.println("Successfully entered value on: " + elementName);
            logger.log(LogStatus.PASS, "Successfully entered value on: " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to double click or submit : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to double click or submit: " + elementName + ": " + e);
            //getScreenShot(driver, "screenshot", logger);
        }//end of double click exception
    }//end of double click method


    //create a void method for mouse hoover by index
    public static void mouseHoverMethodByIndex(WebDriver driver, String xpath, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions mouseActions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            mouseActions.moveToElement(element).perform();
            System.out.println("Successfully hovered over: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover over: " + elementName + ": " + e);
        }//end of mouse hover by index exception
    }//end of mouse hover method by index


    //create scroll intoview element
    public static void scrollToElementMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
          //  jse.executeScript("arguments[0].scrollIntoView(true)", element);
            jse.executeScript("arguments[0].scrollIntoView({block: 'center'})", element);

            System.out.println("Successfully scrolled to: " + elementName);
            logger.log(LogStatus.PASS, "Successfully scrolled to: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to scroll to: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to scroll to: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of scroll by element exception
    }//end of scroll by element method


    public static void scrollToViewMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));
              jse.executeScript("arguments[0].scrollIntoView(true)", element);
//            jse.executeScript("arguments[0].scrollIntoView({block: 'center'})", element);

            System.out.println("Successfully scrolled to: " + elementName);
            logger.log(LogStatus.PASS, "Successfully scrolled to: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to scroll to: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to scroll to: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of scroll by element exception
    }//end of scroll by element method

    public static void changeTabs(WebDriver driver, int tabNumber, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //call the window handles in array list and switch to the new tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab by index of tabNumber
        try {
            driver.switchTo().window(tabs.get(tabNumber));
            System.out.println("Successfully changed tab to: " + elementName);
            logger.log(LogStatus.PASS, "Successfully changed tab to: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to change tab: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to change tab to: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }// end of tab change exception
    } // end of changing tab method

//    public static void verifyBooleanStatement(WebDriver driver, WebElement xpath, boolean expectedValue, ExtentTest logger, String elementName) {
//        //store the xpath in boolean statement
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        WebElement element = null;
//        int maxAttempts = 3; // Maximum number of attempts
//        int attempt = 0;
//        while (attempt < maxAttempts) {
//            boolean elementState;
//            try {
//
//                element = wait.until(ExpectedConditions.visibilityOf(xpath));
//                elementState = element.isDisplayed();
//            //    return;
////            System.out.println("Expected: " + expectedValue + "element displayed: " + elementState);
//            } catch (TimeoutException e) {
//                // Handle timeout explicitly
//                elementState = false; // Element not found, set visibility to false
//            } catch (Exception e) {
//                // Handle WebDriverException explicitly
//                System.out.println("WebDriverException encountered: " + e.getMessage());
//                logger.log(LogStatus.ERROR, "WebDriverException encountered: " + e.getMessage());
//                attempt++;
//                continue; // Retry the operation
//            }
//
//
//            if (elementState == expectedValue) {
//                System.out.println("\n" + elementName + "\n" + "Visibility: " + elementState + " - as expected ✅" + "\n");
//                logger.log(LogStatus.PASS, "\n" + elementName + "\n" + "Visibility: " + elementState + "  - as expected ✅");
//                return;
//
//            } else {
//                attempt++;
//                System.out.println("\n" + elementName + "\n" + "Visibility: " + elementState + " - is NOT expected ❌....retrying attempt: " + attempt + "\n");
//                logger.log(LogStatus.FAIL, "\n" + elementName + "\n" + "Visibility: " + elementState + " - is NOT expected ❌....retrying attempt: " + attempt );
//            }
//        }
//    }//end of verifyBooleanStatement
public static void verifyBooleanStatement(WebDriver driver, WebElement xpath, boolean expectedValue, ExtentTest logger, String elementName) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    WebElement element = null;
    int maxAttempts = 3;
    int attempt = 0;

    while (attempt < maxAttempts) {
        boolean elementState;

        try {
            element = wait.until(ExpectedConditions.visibilityOf(xpath));
            elementState = element.isDisplayed();

        } catch (TimeoutException e) {
            elementState = false;

            // ✅ If we expected false, treat it as PASS instead of fail
            if (!expectedValue) {
                System.out.println("\n" + elementName + "\n✅Visibility: false - as expected ✅\n");
                logger.log(LogStatus.PASS, "\n" + elementName + "\n✅Visibility: false - as expected ✅");
                return;
            }

        } catch (Exception e) {
            System.out.println("WebDriverException encountered: " + e.getMessage());
            logger.log(LogStatus.ERROR, "WebDriverException encountered: " + e.getMessage());
            attempt++;
            continue;
        }

        if (elementState == expectedValue) {
            System.out.println("\n" + elementName + "\n✅Visibility: " + elementState + " - as expected ✅\n");
            logger.log(LogStatus.PASS, "\n" + elementName + "\n✅Visibility: " + elementState + " - as expected ✅");
            return;
        } else {
            attempt++;
            System.out.println("\n" + elementName + "\nVisibility: " + elementState + " - is NOT expected ❌....retrying attempt: " + attempt + "\n");
            logger.log(LogStatus.FAIL, "\n" + elementName + "\nVisibility: " + elementState + " - is NOT expected ❌....retrying attempt: " + attempt);
        }
    }
}

    public static void verify_element_dissapeared(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.invisibilityOf(xpath));
            System.out.println("\nelement dissapeared as expected: " + elementName);
            logger.log(LogStatus.PASS, "element dissapeared as expected: " + elementName);
        } catch (TimeoutException e) {
            logger.log(LogStatus.FAIL, "element did not dissapear: " + elementName + ": " + e);
            System.out.println("element did not dissapear: " + elementName + ": " + e);
        }
    }


    public static void verifyBooleanStatement1(WebDriver driver, WebElement xpath, boolean expectedValue, ExtentTest logger, String elementName) {
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = null;
        int maxAttempts = 4; // Maximum number of attempts
        int attempt = 0;
        while (attempt < maxAttempts) {
            boolean elementState;
            try {

                element = wait.until(ExpectedConditions.visibilityOf(xpath));
                elementState = element.isDisplayed();
                //    return;
//            System.out.println("Expected: " + expectedValue + "element displayed: " + elementState);
            } catch (TimeoutException e) {
                // Handle timeout explicitly
                elementState = false; // Element not found, set visibility to false
            }

            if (elementState == expectedValue) {
                System.out.println("\n" + elementName + "\n" + "Visibility: " + elementState + " - as expected" + "\n");
                logger.log(LogStatus.PASS, "\n" + elementName + "\n" + "Visibility: " + elementState + " - as expected");
                return;

            } else {
                attempt++;
                System.out.println("\n" + elementName + "\n" + "Visibility: " + elementState + " - is NOT expected....retrying attempt: " + attempt + "\n");
                logger.log(LogStatus.FAIL, "\n" + elementName + "\n" + "Visibility: " + elementState + " - is NOT expected....retrying attempt: " + attempt );

            }
        }
    }//end of verifyBooleanStatement

//    public static boolean isElementPresent(WebDriver driver, WebElement locator) {
//        try {
//            WebElement element = driver.findElement((By) locator);
//            return element.isDisplayed();
//        } catch (Exception e) {
//            System.out.println("Element not present or visible: " + e.getClass().getSimpleName() + " - " + e.getMessage());
//
//            // Quietly return false without verbose logging
//            return false;
//        }
//    }

    public static boolean isElementPresent( WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("Element not present or visible: " + e.getClass().getSimpleName() + " - " + e.getMessage());

            return false;
        }
    }
    public static void verify_url(WebDriver driver, String urlContent, ExtentTest logger)  {
        try {
            //Thread.sleep(2000);

            String strUrl = driver.getCurrentUrl();
        //  BaseClass.staging5().captureURL();
        if (strUrl.contains(urlContent)) {
            System.out.println("URL contains '" + urlContent + "' as expected" + '\n');
            logger.log(LogStatus.PASS, "URL contains '" + urlContent + "' as expected");

        } else {
            System.out.println("Unable to verify expected URL content- " + urlContent + " . URL Captured '" + strUrl + "'");
            logger.log(LogStatus.FAIL, "Unable to verify expected URL content- " + urlContent + " . URL Captured '" + strUrl + "'");
        }
        } catch (Exception e) {
            System.out.println("Unable to capture URL");
        }
        }
    public static void verifyAnyElementFound(WebDriver driver, String[] xpaths, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        boolean anyElementFound = false;

        try {
            for (String xpath : xpaths) {
                List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
                if (!elements.isEmpty()) {
                    anyElementFound = true;
                    break;
                }
            }
        } catch (TimeoutException e) {
            // Handle timeout explicitly
            anyElementFound = false; // No elements found within the timeout
        }

        if (anyElementFound) {
            System.out.println("\n" + elementName + "\n" + "At least one element found - as expected" + "\n");
            logger.log(LogStatus.PASS, "\n" + elementName + "\n" + "At least one element found - as expected");
        } else {
            System.out.println("\n" + elementName + "\n" + "No elements found - is NOT expected" + "\n");
            logger.log(LogStatus.FAIL, "\n" + elementName + "\n" + "No elements found - is NOT expected");
        }
    }



    //click action is one of the type of void method
    public static void click_modal(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(xpath)).click();
            System.out.println("Successfully clicked on: " + elementName);
            logger.log(LogStatus.PASS, "Successfully clicked on: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to find: " + elementName);
            logger.log(LogStatus.PASS, "Unable to find: " + elementName);
        }
    }//end of click method by index
    //create scroll intoview element by index


    public static void switch_to_iFrame(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        int maxAttempts = 3; // Maximum number of attempts
        int attempt = 0;
        while (attempt < maxAttempts) {

            try {
                // int size1 = driver.findElements(By.tagName("iframe")).size();
                // System.out.println("there are"+ size1 + " frames before clicking: "+ elementName);
                // Thread.sleep(1000);
                wait.until(ExpectedConditions.elementToBeClickable(xpath));
                driver.switchTo().frame(xpath);

                System.out.println("successfully changed frame to: " + elementName);
                logger.log(LogStatus.PASS, "successfully changed frame to: " + elementName);
                return;
            } catch (StaleElementReferenceException e) {
                attempt++;
                // Retry the click if StaleElementReferenceException is caught
                System.out.println("\n" + "Stale element encountered, retrying click attempt " + attempt);
                logger.log(LogStatus.INFO, "Stale element encountered, retrying click attempt " + attempt);
                wait.until(ExpectedConditions.visibilityOf(xpath));
                // Re-locate the element

            } catch (Exception e) {
                attempt++;
                System.out.println("Unable to change frame to: " + elementName + ": " + e);
                logger.log(LogStatus.FAIL, "Unable to change frame to: " + elementName + ": " + e);
                wait.until(ExpectedConditions.visibilityOf(xpath));

            }
        }
    }//end of click method by index


    public static void scrollToElementByIndexMethod(WebDriver driver, String xpath, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            jse.executeScript("arguments[0].scrollIntoView(true)", element);
            System.out.println("Successfully scrolled to: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to scroll to: " + elementName + ": " + e);
        }//end of scroll by element exception
    }//end of scroll by element method


    //create a void method for scrolling by pixel
    public static void scrollByPixelMethod(WebDriver driver, int x, int y) {
        //explicit wait of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //call JSE
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            //enter int x and y coordinates as integer
            jse.executeScript("scroll(" + x + "," + y + ")");
            System.out.println("Successfully scrolled by " + x + "," + y);
        } catch (Exception e) {
            System.out.println("Unable to scroll by " + x + "," + y + ": " + e);
        }//end of scroll by pixel exception
    }//end of scroll by pixel method

    public static void clickByPixelMethod(WebDriver driver, int x, int y) {
        //explicit wait of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //call JSE
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            //enter int x and y coordinates as integer
          //  jse.executeScript("scroll(" + x + "," + y + ")");
            String script = "var elem = document.elementFromPoint(" + x + ", " + y + ");" +
                    "if (elem) { elem.click(); }";
            jse.executeScript(script);

            System.out.println("Successfully clicked on " + x + "," + y);
        } catch (Exception e) {
            System.out.println("Unable to click: " + x + "," + y + ": " + e);
        }//end of scroll by pixel exception
    }//end of scroll by pixel method


    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = "src/main/java/HTML_Report/Screenshots/";
            
            // Create directory if it doesn't exist
            new File(directory).mkdirs();
            
            // Take screenshot and save to file
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File(directory + fileName);
            FileUtils.copyFile(sourceFile, destFile);
            
            // For CI/CD environments, embed the image directly in the HTML report
            // Convert screenshot to base64 string and embed it directly
            String base64Image = "data:image/png;base64," + 
                                 Base64.getEncoder().encodeToString(FileUtils.readFileToByteArray(destFile));
            
            // Add both the file reference (for local viewing) and base64 data (for CI/CD viewing)
            String fileImage = logger.addScreenCapture("Screenshots/" + fileName);
            logger.log(LogStatus.FAIL, "", fileImage);
            
            // Also add a base64 version that will be visible in CI/CD
            logger.log(LogStatus.FAIL, "Screenshot", "<img src='" + base64Image + "' style='max-width:800px;'>");
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT!!! " + e);
        }
    }//end of getScreenshot method


    public static void captureXMLdata(String attrName, String xmlFileLocation, ExtentTest logger, String elementName) {
        try {
//src/main/java/downloads/123456_PCA.xml      nns1:noNamespaceSchemaLocation
            File xmlFile = new File(xmlFileLocation);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            // Normalize the document
            doc.getDocumentElement().normalize();
            String xmlName = doc.getDocumentElement().getAttribute(attrName);
            System.out.println(elementName + " generated from XML: : " + xmlName);
            logger.log(LogStatus.PASS, elementName + " generated from XML:  " + xmlName);
        } catch (Exception e) {
            System.out.println(elementName + " not generated from XML");
            logger.log(LogStatus.FAIL, elementName + " not generated from XML");
        }
    }//end of captureXMLdata

    public static void uploadFileMethod(WebDriver driver, String xpath, String fileLocation, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            WebElement element = driver.findElement(By.xpath(xpath));
            File file = new File("src/main/java/images/" + fileLocation);

            //  File file = new File("./" + fileLocation);
            //   System.out.println(file.getAbsolutePath());
            Thread.sleep(1000);

            element.sendKeys(file.getAbsolutePath());

            System.out.println("\n" + "Successfully uploaded: " + fileLocation + " to: " + elementName + "\n");
            logger.log(LogStatus.PASS, "Successfully uploaded" + fileLocation + "to: " + elementName);

        } catch (Exception e) {
            System.out.println("\n" + "Unable to upload file to: " + elementName + ": " + e + "\n");
            logger.log(LogStatus.FAIL, "Unable to upload file to: " + elementName + ": " + e);

        }
    }

    public static void upload_downloaded_company_files(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {

            // Specify the directory containing the files
            File downloadsDir = new File("src/main/java/downloads/");
//            File[] files = downloadsDir.listFiles();
            File[] files = downloadsDir.listFiles(new FilenameFilter() {

                @Override
                public boolean accept(File dir, String name) {
                    // Filter files starting with 'company' and ending with '.xlsx'
                    return name.startsWith("company_usage_reports") && name.endsWith(".xlsx");
                }
            });
            if (files == null || files.length == 0) {
                throw new RuntimeException("No files found in the directory matching the criteria.");
            }

            //for one file in directory
//            if (files == null || files.length != 1) {
//                throw new RuntimeException("There should be exactly one file in the directory.");
////            }
//
//            // Get the single file from the directory
//            File file = files[0];
//            String filePath = file.getAbsolutePath();
            for (File file : files) {
                WebElement element = driver.findElement(By.xpath(xpath));

                String filePath = file.getAbsolutePath();
                Thread.sleep(2000); // Adjust delay as necessary

                // Upload the file
                element.sendKeys(filePath);

                System.out.println("\n" + "Successfully uploaded: " + file.getName() + " to: " + elementName + "\n");
                logger.log(LogStatus.PASS, "Successfully uploaded " + file.getName() + " to: " + elementName);
                Thread.sleep(3000); // Adjust delay as necessary

            }

        } catch(Exception e){
                System.out.println("\n" + "Unable to upload file to: " + elementName + ": " + e + "\n");
                logger.log(LogStatus.FAIL, "Unable to upload file to: " + elementName + ": " + e);
            }
        }


    public static void confirm_dashboard_bubble_count(WebDriver driver, WebElement bubble_dashboard_count, List<WebElement> dashboard_items , ExtentTest logger, String elementName) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        String bubble_dashboard_count_string = ReusableMethodsLoggersPOM.captureTextMethod(driver, bubble_dashboard_count, logger, "bubble_dashboard_count");

        // Convert the captured text to an integer
        int bubble_dashboard_count_int;
        try {
            bubble_dashboard_count_int = Integer.parseInt(bubble_dashboard_count_string);
        } catch (NumberFormatException e) {
            bubble_dashboard_count_int = -1; // or handle the error as needed
            softAssert.fail("The captured text is not a valid integer: " + bubble_dashboard_count_string);
        }
        int dashboard_count_size =dashboard_items.size();
        // Use SoftAssert to compare the text integer with the size of the list
        if (bubble_dashboard_count_int == dashboard_count_size) {
            // Print statement if the values match
            System.out.println( elementName + "  (" + bubble_dashboard_count_int + ") matches items in the widget. (" + dashboard_count_size + ") ");
            logger.log(LogStatus.PASS, elementName +" (" + bubble_dashboard_count_int + ") matches items in the widget. (" + dashboard_count_size + ") ");

        } else {
            // Assert and fail if the values do not match
            softAssert.assertEquals(bubble_dashboard_count_int, bubble_dashboard_count_int, elementName + "  bubble DOES NOT match with the items in the widget.(" + dashboard_count_size + ").");
            logger.log(LogStatus.FAIL, elementName+" bubble (" + bubble_dashboard_count_int + ") DOES NOT match with the size of items in the widget (" + dashboard_count_size + ").");

        }
        // Report any soft assertion failures
        softAssert.assertAll();
    }

    public static void confirm_dashboard_companies_reports(WebDriver driver, WebElement bubble_dashboard_count, List<WebElement> dashboard_items , ExtentTest logger, String elementName) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        String bubble_dashboard_count_string = ReusableMethodsLoggersPOM.captureTextMethod(driver, bubble_dashboard_count, logger, "bubble_dashboard_count");

        // Convert the captured text to an integer
        int bubble_dashboard_count_int;
        try {
            bubble_dashboard_count_int = Integer.parseInt(bubble_dashboard_count_string);
        } catch (NumberFormatException e) {
            bubble_dashboard_count_int = -1; // or handle the error as needed
            softAssert.fail("The captured text is not a valid integer: " + bubble_dashboard_count_string);
        }


        int dashboard_count_size =dashboard_items.size();
        // Use SoftAssert to compare the text integer with the size of the list
        if (bubble_dashboard_count_int == dashboard_count_size) {
            // Print statement if the values match
            System.out.println( elementName + "  (" + bubble_dashboard_count_int + ") matches items in the widget. (" + dashboard_count_size + ") ");
            logger.log(LogStatus.PASS, elementName +" (" + bubble_dashboard_count_int + ") matches items in the widget. (" + dashboard_count_size + ") ");

        } else {
            // Assert and fail if the values do not match
            softAssert.assertEquals(bubble_dashboard_count_int, bubble_dashboard_count_int, elementName + "  bubble DOES NOT match with the items in the widget.(" + dashboard_count_size + ").");
            logger.log(LogStatus.FAIL, elementName+" bubble (" + bubble_dashboard_count_int + ") DOES NOT match with the size of items in the widget (" + dashboard_count_size + ").");

        }
        // Report any soft assertion failures
        softAssert.assertAll();
    }
    public static void uploadFile_robot_method(WebDriver driver, WebElement xpath, String fileLocation, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(xpath));

            // Click the file input element to open the file picker dialog
            element.click();

            // Wait briefly to ensure the file picker dialog has opened
            Thread.sleep(2000); // Adjust as needed

            // Set the file path to upload using the Robot class
            File file = new File("./" + fileLocation);

            setClipboardData(file.getAbsolutePath());
            Robot robot = new Robot();
            // Paste the file path into the file picker dialog
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Press Enter to confirm the file selection
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            System.out.println("Successfully uploaded " + fileLocation + " to: " + elementName);
            logger.log(LogStatus.PASS, "Successfully uploaded " + fileLocation + " to: " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to upload file to: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to upload file to: " + elementName + ": " + e);
        }
    }

    // Helper method to set clipboard data
    public static void setClipboardData(String data) {
        StringSelection stringSelection = new StringSelection(data);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }


    public static void unzipMethod(String location, String zipFilePath) throws IOException {

        File destDir = new File(location);
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry = zipIn.getNextEntry();
        while (entry != null) {
            String filePath = location + File.separator + entry.getName();
            if (!entry.isDirectory()) {
                // If the entry is a file, extract it
                extractFile(zipIn, filePath);
            } else {
                // If the entry is a directory, create it
                File dir = new File(filePath);
                dir.mkdirs();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
        zipIn.close();
    }

    public static void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = zipIn.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        }
    }

    public static String getPdfContent_from_browser() throws IOException {
        try {
            WebDriver driver = getDriver();

            String pdfUrl = driver.getCurrentUrl();

            URL pdfURL = new URL(pdfUrl);

            InputStream is = pdfURL.openStream();

            BufferedInputStream bis = new BufferedInputStream(is);

            PDDocument doc = PDDocument.load(bis);

            PDFTextStripper strip = new PDFTextStripper();
            String stripText = strip.getText(doc);

           //  System.out.println(stripText);

            doc.close();

            return stripText;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // Or handle the exception according to your requirement

        }
    } // end of main



    public static String getPdfContent_from_downloads(String partialFileName) throws IOException {
        try {
            // Specify the custom download directory
            String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads"; // Custom directory

            // Create a File object for the downloads folder
            File folder = new File(downloadDir);

            // List all PDF files in the directory that match the partial file name
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf") && name.contains(partialFileName));

            // Check if no file was found
            if (files == null || files.length == 0) {
                System.out.println("No PDF file found with partial name: " + partialFileName);
                return null;
            }

            // Use the first match (adjust if necessary to handle multiple files)
            File pdfFile = files[0];

            // Load the PDF document
            PDDocument document = PDDocument.load(pdfFile);

            // Create PDFTextStripper to extract text
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Get text from the PDF
            String text = pdfStripper.getText(document);

            // Close the document
            document.close();

            // Print the extracted text (for debugging purposes)
            System.out.println("Extracted text from PDF: ");
            System.out.println(text);

            return text;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // Handle the exception and return null if an error occurs
        }
    }


    /**
     * Extracts all annotations (including tooltips/notes) from the most recent PDF
     * @return List of annotation contents
     */
    public static java.util.List<String> getPDFAnnotations_from_most_recent_download() throws IOException {
        java.util.List<String> annotations = new java.util.ArrayList<>();
        String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";
        
        File folder = new File(downloadDir);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));
        
        if (files == null || files.length == 0) {
            System.out.println("No PDF files found in the downloads folder.");
            return annotations;
        }
        
        Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
        File latestPdfFile = files[0];
        System.out.println("Extracting annotations from: " + latestPdfFile.getName());
        
        try (PDDocument document = PDDocument.load(latestPdfFile)) {
            for (PDPage page : document.getPages()) {
                java.util.List<PDAnnotation> pageAnnotations = page.getAnnotations();
                for (PDAnnotation annotation : pageAnnotations) {
                    String contents = annotation.getContents();
                    if (contents != null && !contents.isEmpty()) {
                        System.out.println("Found annotation: " + contents);
                        annotations.add(contents);
                    }
                }
            }
        }
        
        if (annotations.isEmpty()) {
            System.out.println("No annotations found in PDF.");
        } else {
            System.out.println("Total annotations found: " + annotations.size());
        }
        
        return annotations;
    }

    public static String getPDFContent_from_most_recent_download() throws IOException {
        try {
            // Specify the custom download directory
            String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";

            // Create a File object for the downloads folder
            File folder = new File(downloadDir);

            // List all PDF files in the directory
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));

            // Check if there are no PDF files
            if (files == null || files.length == 0) {
                System.out.println("No PDF files found in the downloads folder.");
                return null;
            }

            // Sort files by last modified timestamp (most recent first)
            Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
//            try {
//                WebDriver driver = getDriver();
//
//                // Refresh only for Firefox
//                if (driver instanceof FirefoxDriver) {
//                    System.out.println("Firefox detected, refreshing before checking for PDF...");
//                    driver.navigate().refresh();
//                    Thread.sleep(3000); // Give it time to reload and finalize download
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }

            // Get the most recently downloaded PDF file
            File latestPdfFile = files[0];
            System.out.println("Opening latest downloaded PDF: " + latestPdfFile.getName());

            // Load the PDF document
            PDDocument document = PDDocument.load(latestPdfFile);

            // Extract text using PDFTextStripper
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);

            // Close the document
            document.close();

            // Print extracted text for debugging
            System.out.println("Extracted text from PDF:");
            System.out.println(text);

            return text;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // Handle the exception and return null if an error occurs
        }
    }

    public static String getPDFContent_with_indentation_from_most_recent_download() throws IOException {
        try {
            // Specify the custom download directory
            String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";

            // Create a File object for the downloads folder
            File folder = new File(downloadDir);

            // List all PDF files in the directory
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".pdf"));

            // Check if there are no PDF files
            if (files == null || files.length == 0) {
                System.out.println("No PDF files found in the downloads folder.");
                return null;
            }

            // Sort files by last modified timestamp (most recent first)
            Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());

            // Get the most recently downloaded PDF file
            File latestPdfFile = files[0];
            System.out.println("Opening latest downloaded PDF (with indentation): " + latestPdfFile.getName());

            // Load the PDF document
            PDDocument document = PDDocument.load(latestPdfFile);

            // Extract text using PDFTextStripper with indentation preservation
            PDFTextStripper pdfStripper = new PDFTextStripper();
            pdfStripper.setSortByPosition(true); // Sort text by position to preserve layout
            pdfStripper.setSpacingTolerance(10.0f); // Increase spacing tolerance to preserve indents
            pdfStripper.setAverageCharTolerance(20.0f); // Preserve character spacing
            pdfStripper.setIndentThreshold(20.0f); // Preserve indentation
            String text = pdfStripper.getText(document);

            // Close the document
            document.close();

            return text;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // Handle the exception and return null if an error occurs
        }
    }

    public static String getPdfContent_from_browser_href(String pdfUrl) throws IOException {
        try {
            WebDriver driver = getDriver();

           // String pdfUrl = driver.getCurrentUrl();

            URL pdfURL = new URL(pdfUrl);

            InputStream is = pdfURL.openStream();

            BufferedInputStream bis = new BufferedInputStream(is);

            PDDocument doc = PDDocument.load(bis);

            PDFTextStripper strip = new PDFTextStripper();
            String stripText = strip.getText(doc);

            //  System.out.println(stripText);

            doc.close();

            return stripText;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // Or handle the exception according to your requirement

        }
    } // end of main




}