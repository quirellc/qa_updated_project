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

    }



        @Test
        public void TR_023_ck5_multiple_comments() throws InterruptedException {
            WebDriver driver = getDriver();
            BaseClass.staging5().clickUserProfileTab();
            BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
            Thread.sleep(500);

            //  String pageTitle = driver.getTitle();

            BaseClass.quireLogin().enterEmail_bv_sysadmin_level();
            Thread.sleep(1000);
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(2000);

            //pca

            driver.navigate().to("https://staging5.openquire.com/templates/668836");
            Thread.sleep(1500);
            BaseClass.pca_xml_section().clickSectionView_QuickFactsTable();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_special_section_comments_test();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_multiple_comments_test();
            Thread.sleep(1000);



//esa
            driver.navigate().to("https://staging5.openquire.com/templates/668839");
            Thread.sleep(1500);
            BaseClass.pca_xml_section().clickSectionView_ESA_XML();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_special_section_comments_test();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_multiple_comments_test();
            Thread.sleep(1000);
//        //sra
//        driver.navigate().to("https://staging5.openquire.com/templates/668838");
//        Thread.sleep(1000);
//        BaseClass.ck5editor().ck5_multiple_comments_test();
//        //zon
//        driver.navigate().to("https://staging5.openquire.com/templates/668840");
//        Thread.sleep(1000);
//        BaseClass.ck5editor().ck5_multiple_comments_test();


            //fm1104
            driver.navigate().to("https://staging5.openquire.com/templates/668841");
            Thread.sleep(1000);
            BaseClass.staging5().click_section_III_property_details_sectionView();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_special_section_comments_test();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_multiple_comments_test();
            Thread.sleep(1000);


            //fm1105
            driver.navigate().to("https://staging5.openquire.com/templates/668845");
            Thread.sleep(1000);
            BaseClass.staging5().click_section_II_unit_details_sectionView();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_special_section_comments_test();
            Thread.sleep(1000);
            BaseClass.ck5editor().ck5_multiple_comments_test();
            Thread.sleep(1000);

            //cost_recommendation
            driver.navigate().to("https://staging5.openquire.com/templates/668846");
            Thread.sleep(1000);
            BaseClass.ck5editor().click_second_empty_comments_icon();
            Thread.sleep(1000);
            BaseClass.ck5editor().add_new_comment_to_ST();
            BaseClass.ck5editor().verify_unresolved_1_comment_is_Visible();
            BaseClass.ck5editor().click_comments_resolve_button();
            BaseClass.ck5editor().verify_resolved_1_comment_is_Visible();

            BaseClass.ck5editor().click_and_verify_comments_archive_icon();

            BaseClass.ck5editor().reopen_archived_comment_discussion();
            BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
            BaseClass.ck5editor().delete_comments_in_field();
            BaseClass.ck5editor().verify_grey_empty_comments_icon();
            Thread.sleep(1000);

        }




}

// click r5c5 dynamic cell - formu











