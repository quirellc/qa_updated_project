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
      //  System.out.println(driver.getClass().getSimpleName());
        // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
        driver.navigate().to("https://staging5.openquire.com/reports/669267");
        //  WebDriver driver1 = getDriver();

            BaseClass.quireLogin().enterEmail_bv_sysadmin_level();
            Thread.sleep(1000);
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(3000);

        BaseClass.smartTables().click_row3_richText();
        Thread.sleep(500);
        BaseClass.ck5editor().click_footNote_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(1500); // Use sparingly for debugging; replace with proper waits.

        BaseClass.ck5editor().enter_footNote_textBox();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_save_button_footnote();

//        BaseClass.templatesSection().enter_instruction_text_iFrame();
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().click_ok_button_footNote();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

    }


}

// click r5c5 dynamic cell - formu











