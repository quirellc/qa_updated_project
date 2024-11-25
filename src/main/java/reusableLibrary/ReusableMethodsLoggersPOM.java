package reusableLibrary;

import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
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
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
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
                return;
            } catch (TimeoutException e) {
                // Handle timeout explicitly
                System.out.println("\n" + e);
                logger.log(LogStatus.INFO, e);

            } catch (StaleElementReferenceException e) {
                attempt++;
                // Retry the click if StaleElementReferenceException is caught
                System.out.println("\n" + "Stale element encountered, retrying click attempt " + attempt);
                logger.log(LogStatus.INFO, "Stale element encountered, retrying click attempt " + attempt);
                wait.until(ExpectedConditions.elementToBeClickable(xpath));
                // Re-locate the element
            } catch (Exception e) {
                attempt++;
                System.out.println("Unable to click on " + elementName + ": " + e);
                logger.log(LogStatus.FAIL, "Unable to click on: " + elementName + ": " + e);
                wait.until(ExpectedConditions.elementToBeClickable(xpath));
               //   getScreenShot(driver, "screenshot", logger);
            }

        }
    }//end of click method

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
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
             jse.executeScript("arguments[0].scrollIntoView(true)",element);
          //  jse.executeScript("arguments[0].scrollIntoView({block: 'center'})", element);

//            Thread.sleep(1000);
//            jse.executeScript("window.scrollBy(0, -5000);");
//            Thread.sleep(1000);
//
//            jse.executeScript("scroll(0,-5000)");
            Thread.sleep(700);
            wait.until(ExpectedConditions.elementToBeClickable(xpath)).click();
            System.out.println("Successfully scrolled and clicked: " + elementName);
            logger.log(LogStatus.PASS, "Successfully scrolled and clicked " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to scrolled and click : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to scrolled and click: " + elementName + ": " + e);
            //  getScreenShot(driver, "screenshot", logger);
        }//end of double click exception
    }//end of double click method


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
            logger.log(LogStatus.FAIL, "Unable to click on: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
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
            System.out.println("Successfully clicked and submitted on: " + elementName);
            logger.log(LogStatus.PASS, "Successfully clicked and submitted on: " + elementName);
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
                Thread.sleep(500);
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
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

    public static void open_href_attribute_link(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        String result = null;
        try {
            WebElement foundElement = wait.until(ExpectedConditions.elementToBeClickable(xpath));
            result = foundElement.getAttribute("href");
            driver.get(result);
           System.out.println("Successfully opened href link  from " + elementName);
            logger.log(LogStatus.PASS, "Successfully opened href link from" + elementName);

        } catch (Exception e) {
            System.out.println("Unable open href link " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to Unable open href link from: " + elementName + ": " + e);
            // Assuming you have a method to take screenshots
            // getScreenShot(driver, "screenshot", logger);
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
    public static void mouseHoverMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions mouseActions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable((xpath)));
            mouseActions.moveToElement(element).perform();
            System.out.println("Successfully hovered over: " + elementName);
            logger.log(LogStatus.PASS, "Successfully hover over: " + elementName);

        } catch (Exception e) {
            System.out.println("Unable to hover over: " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to hover over: " + elementName + ": " + e);
            getScreenShot(driver, "screenshot", logger);
        }//end of mouse hover exception
    }//end of mouse hover method

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
            System.out.println("Unable to right click : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to right click: " + elementName + ": " + e);
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

    public static void verifyBooleanStatement(WebDriver driver, WebElement xpath, boolean expectedValue, ExtentTest logger, String elementName) {
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = null;
        int maxAttempts = 3; // Maximum number of attempts
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



//        } catch (Exception e) {
//            System.out.println("\n" + "Unable to find :  " + elementName + "___Visibility expected: " +  expectedValue);
//            logger.log(LogStatus.PASS,"Unable to find :  " + elementName + "___Visibility expected: " +  expectedValue );
//
//        }//end of exception
            }
        }
    }//end of verifyBooleanStatement



    public static void verifyBooleanStatement1(WebDriver driver, WebElement xpath, boolean expectedValue, ExtentTest logger, String elementName) {
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = null;
        int maxAttempts = 3; // Maximum number of attempts
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
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
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occured while taking SCREENSHOT!!! " + e);
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

    public static String getPdfContent_from_downloads(String pdf_file_name) throws IOException {
        try {

            String pdfFilePath = System.getProperty("user.dir")  +pdf_file_name;


            // Load PDF document
            PDDocument document = PDDocument.load(new File(pdfFilePath));

            // Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Get text from PDF
            String text = pdfStripper.getText(document);

            // Print extracted text
            System.out.println(text);

            // Close the document
            document.close();

            return text;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // Or handle the exception according to your requirement

        }
    } // end of main




}