package reusableLibrary;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReusableAnnotations {
    //you need to make your WebDriver driver variable static since we are calling it to our test class

//    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

 // ThreadLocal to manage WebDriver instances per thread
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }
    //set before suite annotation method
    @Parameters("browser")
    @BeforeClass

    public void setDriver(String browser) throws MalformedURLException {
        //  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        if (browser.contains("chrome")) {
        	
            WebDriverManager.chromedriver().setup();


            // Set download directory
            String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";

            // Set Chrome options to specify download directory
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("download.default_directory", downloadDir);
            ChromeOptions options = new ChromeOptions();

            options.setExperimentalOption("prefs", prefs);

            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            options.addArguments("start-maximized");
//            options.addArguments("--headless"); // Add headless mode

//            driver = new ChromeDriver(options);
         // Set the WebDriver instance for this thread
            driver.set(new ChromeDriver(options));

//            String zipFilePath = downloadDir + "/yourfile.zip"; // Replace "yourfile.zip" with the actual name of your ZIP file
//            String destDir = downloadDir + "/unzipped";
//
//            try {
//                unzip(zipFilePath, destDir);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();

            String downloadDir = System.getProperty("user.dir") + "/src/main/java/downloads";


            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.download.dir", downloadDir);
            profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); // Set MIME type of the file you're downloading


            options.setProfile(profile);
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//            driver = new FirefoxDriver(options);
         // Set the WebDriver instance for this thread
            driver.set(new FirefoxDriver(options));
            getDriver().manage().window().maximize();


        }

    }//end of before suite
    @AfterClass
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove(); // Remove the instance from ThreadLocal
            reports.endTest(logger);

        }}

    //call before method annotation to capture each test name dynamically
    @BeforeMethod
    public void getTestName(Method methodName) throws MalformedURLException {
        //get a name of the test
        logger = reports.startTest(methodName.getName());


    }//end of before method

    @Parameters("browser")

    @BeforeClass

    public void setUpReport(String browser) {
        String className = this.getClass().getSimpleName();
        DateFormat formatDate = new SimpleDateFormat("(MM_dd_yyyy)");
        Date systemDate = new Date();
        String dateOfSystem = formatDate.format(systemDate);
        //System.out.println(browser);
        if (browser.contains("chrome")) {
            reports = new ExtentReports("src/main/java/HTML_Report/automationReport_" + className + dateOfSystem +"_chrome.html", true);

        } else if (browser.contains("firefox")) {
            reports = new ExtentReports("src/main/java/HTML_Report/automationReport_" + className + dateOfSystem +"_ff.html", true);
        }
      //  reports = new ExtentReports("src/main/java/HTML_Report/automationReport_" + className + dateOfSystem + browserName+".html", true);
    }//end of before method  @AfterSuite

    @BeforeClass public void cleanFolder() throws IOException {
        //get a name of the test
        File folder = new File(System.getProperty("user.dir") + "/src/main/java/downloads");
        if (folder.exists()) {
            FileUtils.cleanDirectory(folder);
        }
    }//end of before method


    @AfterClass
    public void finishReport() {
        reports.flush();
    }//end of after suite

    @AfterSuite
    public void quitDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove(); // Remove the instance from ThreadLocal
        }
        reports.endTest(logger);
    }//end of after suite


    public void hardAssertEquals(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }//end of parent test class

    public void softAssertEquals(String actual, String expected) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected);
        softAssert.assertAll();
    }

    String location = System.getProperty("user.dir") + "/src/main/java/downloads";
    public  boolean VerifyDownloadedfile( String expectedFileName){
        //store the xpath in boolean statement
        File folder = new File(location);
        File[] fileList = folder.listFiles();
        boolean isFilePresent = false;
        for (File file : fileList) {
            if (file.isFile()) {
                String fileName = file.getName();
                //  System.out.println(fileName);
                if (fileName.matches(expectedFileName)) {
                    isFilePresent = true;
                    System.out.println(expectedFileName + " downloaded to " + location);
                    logger.log(LogStatus.PASS, expectedFileName + " downloaded to " + location);

                }
            }
        }
        return isFilePresent;
    }//end of verifyBooleanStatement




    //  unzip(zipFilePath, destDirectory);



}

