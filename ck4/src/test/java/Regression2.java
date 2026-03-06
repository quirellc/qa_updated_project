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
    public void TR001a_ck4_feature_enable() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.navigate().to(baseUrl + "companies/253/company_features");
        Thread.sleep(3000);

//        BaseClass.staging5().clickUserProfileTab();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
////enter root user
        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
//        if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//        } else if (baseUrl.contains("staging3") || baseUrl.contains("devops")) {
//            driver.navigate().to( baseUrl + "/companies/4/company_features");
//        }
//        else {

            driver.navigate().to(baseUrl + "companies/253/company_features");
//        }
        Thread.sleep(3000);

//        BaseClass.staging5().register_ck4_feature();
        Thread.sleep(1000);
        BaseClass.staging5().scroll_and_click_unregister_HOT14_feature();
        Thread.sleep(1000);
        BaseClass.staging5().scroll_and_click_unregister_atlas_feature();
        Thread.sleep(1000);
        BaseClass.staging5().scroll_and_click_unregister_allUsersAccessToAllReports_feature();
        Thread.sleep(1000);
        BaseClass.staging5().scroll_and_click_unregister_unregister_allTemplate_feature();
        Thread.sleep(1000);


//log out current user, log into sysadmin atlas
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        BaseClass.quireLogin().enter_admin_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
 //       BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);


    }




//    @Test
//    public void TR001_user_login() throws InterruptedException {
//        WebDriver driver = getDriver();
//        System.out.println(driver.getClass().getSimpleName());
//        driver.navigate().to(baseUrl);
//        System.out.println("Navigating to: " + baseUrl);
//        // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
////        driver.navigate().to("https://staging5.openquire.com/");
//        //     driver.navigate().to("https://app-next.openquire.com/");
////        driver.navigate().to("https://staging5-next.openquire.com/");
//
//        //  WebDriver driver1 = getDriver();
//
//        //   String pageTitle = driver.getTitle();
//        if (baseUrl.contains("staging")) {
//            BaseClass.quireLogin().enter_admin_Email();
//        } else if (baseUrl.contains("app")) {
//            BaseClass.quireLogin().enter_admin_Email();
//        }
//
//        Thread.sleep(1000);
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(3000);
//        //   } else {
//        //       System.out.println("\n" + "Already logged in. Skipping login steps.");
//        //      Thread.sleep(3000);
//        //  }
//
//        BaseClass.staging5().captureURL();
//      //  BaseClass.staging5().click_quire_then_qate_company_widget();
////        Thread.sleep(5000);
//        driver.navigate().to("https://staging3.openquire.com/reports/1595451");
//       // WebDriver driver = getDriver();
////        BaseClass.staging5().register_ck4_feature();
//    //    Thread.sleep(5000);
////        BaseClass.staging5().scroll_and_click_unregister_ck4_feature();
////
////        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
////        BaseClass.reporttagssection().scroll_and_enter_user1_field_RT();
////        Thread.sleep(1000);
////        driver.navigate().refresh();
////
////        Thread.sleep(2000);
////        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
////        Thread.sleep(1500);
////        BaseClass.reporttagssection().verify_user1_qaAdmin_signature_RT_loaded();
////        Thread.sleep(2000);
////        BaseClass.staging5().click_default_section_title();
////        Thread.sleep(500);
////
////        BaseClass.staging5().clickSection_row_editor();
////        BaseClass.staging5().click_reportTag_icon_ck_modal();
////        Thread.sleep(500);
////        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
////        BaseClass.staging5().click_Signature1_RT_dropDownItem();
////        driver.switchTo().defaultContent();
////        Thread.sleep(1000);
////
////        BaseClass.staging5().verify_Signature_contentTag();
////        Thread.sleep(1000);
////        BaseClass.staging5().clickSection_row_editor();
////
////        //go to text body iframe, double click yellow report tag, go to parent frame
////        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
////        Thread.sleep(500);
////        BaseClass.templatesSection().click_content_tag_in_editor();
////        Thread.sleep(500);
////        driver.switchTo().parentFrame();
////        Thread.sleep(500);
////
////        BaseClass.staging5().click_signature_icon_ck_modal();
////        Thread.sleep(500);
////        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
////        Thread.sleep(500);
////        BaseClass.staging5().click_reportTag_dropDownItem_ck_modal();
////        Thread.sleep(500);
////
////        driver.switchTo().defaultContent();
////        Thread.sleep(500);
////
////        BaseClass.staging5().click_pixel_out_of_section();
////        Thread.sleep(500);
////        BaseClass.reporttagssection().verify_Signature_populated_contentTag();
////        Thread.sleep(500);
//
//        Thread.sleep(2000);
//
//
//    }
//
//    @Test
//    public void TR_0008_ck4_AI_toolbar() throws InterruptedException {
//        WebDriver driver = getDriver();
//
//        // Enable spell check and track changes
//        BaseClass.staging5().click_and_capture_spell_check_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_and_capture_track_changes_button();
//        Thread.sleep(5000);
//
//        // ========== TEST 1: Generate Content > Summarize (with Replace button) ==========
//        // Test AI Summarize feature with Stop/Try Again and Replace functionality
//        BaseClass.staging5().click_coverLetter_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//
//       // BaseClass.quire_AI().verify_quire_AI_dropDownItems();
//      //  Thread.sleep(500);
//
//        // Click Generate Content > Summarize
////        BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
////        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//       // Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//      //  Thread.sleep(1000);
//
//        BaseClass.quire_AI().verify_quire_AI_loading_prompt();
//     //   Thread.sleep(1000);
//
//        // Test Stop button - should clear the AI response
//        BaseClass.quire_AI().click_quire_AI_stop_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_empty_prompt();
//        Thread.sleep(500);
//
//        // Test Try Again button - should regenerate AI response
//        BaseClass.quire_AI().click_quire_AI_try_again_button();
//        Thread.sleep(5000);
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_summarize_coverLetter_generated_prompt();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//
//        // Test Replace button - replaces editor content with AI generated text
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//
//        // Verify the AI text was inserted into the editor
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().verify_quire_AI_summarize_coverLetter_inserted_text();
//        Thread.sleep(500);
//
//
//        // Revert Cover Letter changes
//        BaseClass.staging5().click_coverLetter_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(500);
//
//
//
//        // ========== TEST 2: Generate Content > Summarize (with Copy button) ==========
//        // Test AI Copy feature - generate AI text, copy it, then paste into different section
//        BaseClass.staging5().click_title_page_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        // Open AI toolbar and generate summarize content
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//       // BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
//      //  Thread.sleep(500);
//
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//        driver.switchTo().defaultContent();
//
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(5000);
//
//        BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_generated_prompt();
//        Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        Thread.sleep(1000);
//
//
//        // Click Copy button (copies AI text to clipboard, does NOT insert into editor)
//        BaseClass.quire_AI().click_quire_AI_copy_text_button();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().click_cancel_quire_AI_prompt();
//        Thread.sleep(500);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Now paste the copied AI text into the editor manually
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        BaseClass.quire_AI().paste_text_body();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Verify the pasted AI text appears in the editor
//        BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_inserted_text();
//        Thread.sleep(500);
//
//        // Revert Title Page changes
//        BaseClass.staging5().click_title_page_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // ========== TEST 3: Content Assistant > Suggest References ==========
//        // Test AI Suggest References feature in Executive Summary intro page
//        BaseClass.staging5().click_executive_summary_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//
//        // Switch to editor iframe and select all text
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        // Open AI toolbar and click Content Assistant > Suggest References
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_contentAssistant_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_suggest_references_button();
//        Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        Thread.sleep(5000);
//
//        // Verify reference suggestions appear
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_suggest_references_generated_prompt();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//
//        // Replace text with suggested references
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Verify the references persist in intro page
//        BaseClass.quire_AI().verify_quire_AI_suggest_references_inserted_text();
//        Thread.sleep(500);
//
//        // Revert Executive Summary changes
//        BaseClass.staging5().click_executive_summary_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(2000);
//
////         ========== TEST 4: Adjust Content Tone > Technical ==========
////         Test AI Tone Adjustment - converts text to technical tone in Default Section SmartTable
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//
//        // Click on the specific SmartTable cell with text to convert
//        BaseClass.quire_AI().click_smartTable_cell_text_to_select();
//        Thread.sleep(1000);
//
//        // Switch to SmartTable editor iframe and select all text
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        // Open AI toolbar and click Adjust Content Tone > Technical
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_adjustContentTone_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_technical_tone_button();
//        Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        Thread.sleep(5000);
//
//        // Verify technical tone content appears
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_generated_prompt();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//
//        // Replace text with technical tone version
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Verify the technical tone text persists in SmartTable
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_inserted_text();
//        Thread.sleep(1000);
//
//        // Revert Default Section SmartTable changes
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_revisions_icon_second();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//    }


    // @Test
    public void TR_018_ck4_packages_ProjSummary_section() throws InterruptedException {
        WebDriver driver = getDriver();

        driver.navigate().to(baseUrl + "projects/706327");

        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();


        BaseClass.reportfoldersection().ck4PackagesCheck();

        Thread.sleep(500);


    }
}

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











