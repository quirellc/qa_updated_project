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

        driver.navigate().to("https://next.openquire.com/");
        Thread.sleep(500);


        // TC5 - Old URLs are Redirected Appropriately

        BaseClass.quireHome().navigate_to_urls();
        Thread.sleep(1000);
    }}


//        BaseClass.quireHomeNew().hover_benefits_subHeader_button();
//        BaseClass.quireHomeNew().hover_toolkits_subHeader_button();
//        BaseClass.quireHomeNew().click_and_verify_quality_sub_subheaderButton();
//        //Thread.sleep(500);


        //  System.out.println(driver.getClass().getSimpleName());
        // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
//        driver.navigate().to("https://staging5.openquire.com/companies/187/company_users");
//        //  WebDriver driver1 = getDriver();
//
//        BaseClass.quireLogin().enterRootUserEmail();
//        //Thread.sleep(1000);
//        BaseClass.quireLogin().enterPassword();
//        //Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        //Thread.sleep(2000);

//            BaseClass.staging5().create_10_company_users_jmeter();
//            //Thread.sleep(500);


//
//        BaseClass.staging5().click_coverLetter_sectionView();
//
//
//  BaseClass.templatesSection().clickAddContentRow_introPages();
//
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().verify_quire_AI_icon_isVisible();
//        //Thread.sleep(1000);
//
//        BaseClass.quire_AI().click_quire_AI_icon();
//        //Thread.sleep(1000);
//
//        BaseClass.quire_AI().verify_quire_AI_dropDownItems();
//        //Thread.sleep(1000);
//
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//        BaseClass.quire_AI().verify_quire_AI_loading_prompt();
//
//        BaseClass.quire_AI().click_quire_AI_stop_button();
//        BaseClass.quire_AI().verify_quire_AI_empty_prompt();
//        BaseClass.quire_AI().click_quire_AI_try_again_button();
//     //   //Thread.sleep(3000);
//
//        BaseClass.quire_AI().verify_quire_AI_summarize_generated_prompt();
//        //Thread.sleep(1000);
//
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        //Thread.sleep(1000);
//        BaseClass.staging5().acceptAlert();
//        //Thread.sleep(1500);
//
//        BaseClass.staging5().click_out_of_section();
//        //Thread.sleep(1000);
//
//        BaseClass.quire_AI().verify_quire_AI_summarize_generated_prompt();
//
//        BaseClass.staging5().click_title_page_sectionView();
//        //Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//        BaseClass.quire_AI().verify_quire_AI_summarize_generated_prompt();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_copy_text_button();
//        //Thread.sleep(1000);
//        BaseClass.staging5().click_out_of_section();
//        //Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        //Thread.sleep(1000);
//        BaseClass.ck5editor().paste_text_introPages_body();
//        //Thread.sleep(1000);
//        BaseClass.staging5().click_out_of_section();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().verify_quire_AI_summarize_generated_prompt();
//
//
//                BaseClass.staging5().click_executive_summary_sectionView();
//        //Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_dropDown_thesaurus_button();
//        //Thread.sleep(3000);
//        BaseClass.quire_AI().verify_quire_AI_thesaurus_generated_prompt();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        //Thread.sleep(1000);
//        BaseClass.staging5().acceptAlert();
//        //Thread.sleep(1500);
//        BaseClass.staging5().click_out_of_section();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().verify_quire_AI_thesaurus_generated_prompt();
//
//
//        BaseClass.staging5().click_default_section_title();
//        //Thread.sleep(1000);
//
//    BaseClass.staging5().clickSection_row_editor();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_dropDown_technical_tone_button();
//        //Thread.sleep(1000);
//
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_generated_prompt();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        //Thread.sleep(1000);
//        BaseClass.staging5().acceptAlert();
//        //Thread.sleep(1500);
//        BaseClass.staging5().click_out_of_section();
//        //Thread.sleep(1000);
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_generated_prompt();
//
//        //Thread.sleep(5000);
//
//    }




//}
// click r5c5 dynamic cell - formu











