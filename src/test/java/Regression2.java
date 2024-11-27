import Quire_POM.BaseClass;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.relevantcodes.extentreports.LogStatus;
import okhttp3.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;


public class Regression2 extends ReusableAnnotations {
    //  String browserName = driver.getClass().getSimpleName();
    //  String browserName1 = driver.getClass().getName();



    @Test
    public void TR001_user_login() throws InterruptedException {
        WebDriver driver = getDriver();
        System.out.println(driver.getClass().getSimpleName());
        // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
        driver.navigate().to("https://staging5.openquire.com/templates/669256");
        //  WebDriver driver1 = getDriver();

        String pageTitle = driver.getTitle();
        if (pageTitle.contains("OpenQuire")) {
            BaseClass.quireLogin().enterEmail_bv_sysadmin_level();
            Thread.sleep(1000);
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(3000);
        } else {
            System.out.println("\n" + "Already logged in. Skipping login steps.");
            Thread.sleep(3000);
        }


        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(500);

        //go to text body iframe, enter text
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(2000);
     //   BaseClass.ck5editor().enter_text_body_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);



    }


}

// click r5c5 dynamic cell - formu











