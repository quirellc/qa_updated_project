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


public class    Regression2 extends ReusableAnnotations {
    @Test
    public void TR_0001_user_login() throws InterruptedException, IOException {
        WebDriver driver = getDriver();
        System.out.println(driver.getClass().getSimpleName());
        driver.navigate().to(baseUrl);
        System.out.println("Navigating to: " + baseUrl);
        // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
        //     driver.navigate().to("https://app-next.openquire.com/");
//        driver.navigate().to("https://staging5-next.openquire.com/");

        //  WebDriver driver1 = getDriver();

        //   String pageTitle = driver.getTitle();
        if (baseUrl.contains("staging")) {
            BaseClass.quireLogin().enter_admin_Email();
        } else if (baseUrl.contains("app")) {
            BaseClass.quireLogin().enterRootUserEmail();
        }

        Thread.sleep(1000);
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(3000);
//        driver.navigate().to("https://staging3.openquire.com/reports/1595583");
//        Thread.sleep(3000);
//
//        BaseClass.pca_xml_section().clickSectionView_QuickFactsTable();
//        Thread.sleep(500);
//        BaseClass.ck5editor().ck5_special_section_comments_test();
//        Thread.sleep(500);


//
//        BaseClass.staging5().clickUserProfileTab();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
////enter root user
//        BaseClass.quireLogin().enterRootUserEmail();
//        BaseClass.quireLogin().enterPassword();
//        //Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//        //  if (baseUrl.contains("app")) {
//        //      driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//        //  } else if (baseUrl.contains("staging3") || baseUrl.contains("devops")) {
//        //      driver.navigate().to( baseUrl + "/companies/4/company_features");
//        //   }
//        //  else {
//
//        driver.navigate().to(baseUrl + "companies/253/company_features");
//        //  }
//        Thread.sleep(1000);
//
//
//        BaseClass.staging5().register_ck5_feature_unregister_ck4_features();
//        Thread.sleep(1000);
//
//
////log out current user, log into sysadmin atlas
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        BaseClass.quireLogin().enter_admin_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//

        //  Thread.sleep(5000);
        // BaseClass.ck5editor().ck5_special_section_comments_test();
        //  Thread.sleep(500);

//        Thread.sleep(3000);

//        BaseClass.reportfoldersection().ck4PackagesCheck();
//
////
//        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//        Thread.sleep(500);
//        BaseClass.reporttagssection().click_ReportTags_manage_settings_icon();
//        Thread.sleep(1000);
//
//        BaseClass.reporttagssection().scroll_and_click_and_verify_user1_checkbox();
//         BaseClass.reporttagssection().verify_ReportTags_settings_view_isVisible();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1000);
////
//////log out current user, log into sysadmin atlas
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        BaseClass.quireLogin().enter_admin_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//        driver.navigate().to("https://staging3.openquire.com/reports/1595351");
//        Thread.sleep(500);
////
////
//        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//        Thread.sleep(500);
//        BaseClass.reporttagssection().scroll_and_enter_user1_field_RT();
//        Thread.sleep(1000);
//       // BaseClass.staging5().click_save_button();
//       // Thread.sleep(500);
////
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//        Thread.sleep(1500);
//        BaseClass.reporttagssection().verify_user1_qaAdmin_signature_RT_loaded();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(500);
//
//        BaseClass.staging5().clickSection_row_editor();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().click_report_tag_icon_ck5();
//        Thread.sleep(500);
//        BaseClass.staging5().click_Signature1_RT_dropDownItem();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_pixel_out_of_section();
////        Thread.sleep(500);
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_Signature_contentTag();
//        Thread.sleep(500);
////        BaseClass.reportfoldersection().clickStatusButton();
////        Thread.sleep(500);
////        BaseClass.reportfoldersection().click_review_status_button();
////        Thread.sleep(500);
////        BaseClass.staging5().click_save_button();
////
////        BaseClass.templatesSection().verify_alertMessage_reportStatus();
////
////        Thread.sleep(500);
////        driver.navigate().refresh();
//
//        BaseClass.staging5().clickSection_row_editor();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_content_tag_in_editor();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().click_signature_icon_ck5();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().click_stamp_icon_dropdown_ck5();
//
//        Thread.sleep(2000);
////
//        BaseClass.staging5().verify_Signature_populated_contentTag();
//        Thread.sleep(500);

//        AEI old before prod refresh
//        driver.navigate().to("https://staging3.openquire.com/reports/1329981");
        //AEI CK4
//        driver.navigate().to("https://staging3.openquire.com/reports/741432#");
        //AEI CK5
//        driver.navigate().to("https://staging3.openquire.com/reports/1595390");
//        EFI pre prod refresh
        //    driver.navigate().to("https://app.openquire.com/reports/1083115");

        //EFI ck4
//        driver.navigate().to("https://staging3.openquire.com/reports/1595392");

        //EFI ck5
        // driver.navigate().to("https://staging3.openquire.com/reports/1595391");
//
//        Thread.sleep(3000);
//        BaseClass.reportfoldersection().clickRegeneratePDFButton();
//        Thread.sleep(3000);
//        BaseClass.reportfoldersection().captureGeneratedPDF_text();
//        Thread.sleep(3500);
//        BaseClass.reportfoldersection().click_GeneratedPDF_button();
//        Thread.sleep(3500);
//        BaseClass.pdfVerification().verify_efi_styles_pdf();

//        BaseClass.pdfVerification().verify_aei_styles_pdf();
        Thread.sleep(3000);
//        BaseClass.pdfVerification().verify_prince_logo_pdf(false);
//        Thread.sleep(9000);

//        java.util.List<String> coverImageNames = ReusableMethodsLoggersPOM.getPDFImageNames_from_most_recent_download_page(1, true);
//        System.out.println("First-page image names: " + coverImageNames);

//        java.util.List<String> coverImageInfos = ReusableMethodsLoggersPOM.getPDFImageInfo_from_most_recent_download_page_deep(1, true);
//        System.out.println("First-page image infos (deep): " + coverImageInfos);
//

    }
    @Test
    public void TR_019_old_pca_costTable_labels() throws InterruptedException, IOException {
        WebDriver driver = getDriver();

        BaseClass.templatesSection().clickTemplatesTab();
        BaseClass.templatesSection().clickAddTemplateButton();
        BaseClass.templatesSection().enterTemplateNameField_old_PCA();
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        BaseClass.templatesSection().selectTemplateTypeDropdown_old_PCA();

        Thread.sleep(1000);


        BaseClass.templatesSection().enterTemplateDescriptionField();
        BaseClass.templatesSection().clickSave();
        Thread.sleep(3000);

        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.templatesSection().clickHereLinkTemplate();
        Thread.sleep(2000);

        //add cost rec
        BaseClass.staging5().hoverto_default_section_title();

        BaseClass.staging5().click_default_section_title();

        Thread.sleep(500);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(500);
        BaseClass.staging5().click_add_projSummary_toSection();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_costRecommendation_toSection();

        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        BaseClass.staging5().click_add_cost_recommendation_button();
        Thread.sleep(500);

        BaseClass.staging5().enter_boiler_name_cost_recommendation();
        Thread.sleep(500);
        BaseClass.staging5().enter_cost_summary_5_quantity();
        BaseClass.staging5().enter_cost_summary_unit_1000_cost();
        BaseClass.staging5().click_critical_repair_cost_checkbox();
        Thread.sleep(500);
        BaseClass.staging5().enter_cost_summary_comments();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);


        BaseClass.staging5().click_add_cost_recommendation_button();
        Thread.sleep(500);

        BaseClass.staging5().enter_parking_name_cost_recommendation();
        Thread.sleep(500);
        BaseClass.staging5().enter_cost_summary_5_quantity();
        BaseClass.staging5().enter_cost_summary_unit_1000_cost();
        Thread.sleep(500);
        BaseClass.staging5().click_all_Years_repair_cost_checkbox();
        BaseClass.staging5().click_all_Years_repair_cost_checkbox();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Saved URL: " + currentUrl);
        Thread.sleep(2000);


        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);

        driver.navigate().to(currentUrl);
        Thread.sleep(3000);

        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
        Thread.sleep(1500);
        BaseClass.reporttagssection().click_ReportTags_manage_settings_icon();
        Thread.sleep(3000);

        BaseClass.reporttagssection().scroll_and_click_and_verify_multiple_cost_tables_checkbox();
        // BaseClass.reporttagssection().verify_ReportTags_settings_view_isVisible();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(2000);
        //  WebDriver driver = getDriver();

        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        BaseClass.quireLogin().enter_admin_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1500);
        driver.navigate().to(currentUrl);
        Thread.sleep(1500);


        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);

        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
        Thread.sleep(500);
        BaseClass.reporttagssection().select_multiple_cost_tables_feature_dropdown();
        Thread.sleep(500);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);
        BaseClass.staging5().click_boiler_test_item_link();
        Thread.sleep(500);
        BaseClass.staging5().enter_cost_rec_boiler_label_field();
        Thread.sleep(2000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(2000);
        BaseClass.staging5().click_parking_test_item_link();
        Thread.sleep(2000);
        BaseClass.staging5().enter_cost_rec_parking_label_field();
        Thread.sleep(2000);
        BaseClass.staging5().click_save_button();


        Thread.sleep(2000);
        BaseClass.staging5().click_add_immediate_repair_cost_section();
        Thread.sleep(1000);
        BaseClass.staging5().verify_immediate_repair_cost_section_text();
        Thread.sleep(1000);

        BaseClass.staging5().click_add_capital_reserve_schedule_section();
        Thread.sleep(1000);
        BaseClass.staging5().verify_capital_reserved_schedule_cost_section_text();
        Thread.sleep(1000);


        BaseClass.staging5().click_project_summary_sectionView();
        Thread.sleep(1000);
        BaseClass.staging5().verify_old_pca_project_summary_text();
        Thread.sleep(1000);


        BaseClass.reportfoldersection().click_quick_preview_button();
        Thread.sleep(2000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(500);
        //quick preview tab - capture header and footer data
        BaseClass.staging5().verify_old_pca_project_summary_text_qp();
        BaseClass.staging5().verify_immediate_repair_cost_section_text_qp();
        BaseClass.staging5().verify_capital_reserved_schedule_cost_section_text_qp();

        Thread.sleep(500);

        //close second tab and go back to default tab
        driver.close();
        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(1000);

    }

//    @Test
//    public void TR_021_styles_logo_indentation_check() throws InterruptedException, IOException {
//        WebDriver driver = getDriver();
//
//
//        //EFI ck4
////        driver.navigate().to("https://staging3.openquire.com/reports/1595392");
//
//        //EFI ck5
//        driver.navigate().to("https://staging3.openquire.com/reports/1595683");
//        Thread.sleep(3000);
////        BaseClass.staging5().clickSection_row_editor();
////        Thread.sleep(3000);
////        BaseClass.ck5editor().enter_styles_indented_text_body_ck5();
////        Thread.sleep(30000);
//        BaseClass.reportfoldersection().clickReportSettingsButton();
//        BaseClass.reportfoldersection().clickStylesTab_ReportSettings();
//        BaseClass.reportfoldersection().clickEFI2024StyleButton();
//        BaseClass.reportfoldersection().click_add_button_styles_package();
//        BaseClass.staging5().click_save_button();
//
//        BaseClass.reportfoldersection().clickRegeneratePDFButton();
//        Thread.sleep(3000);
//        BaseClass.reportfoldersection().captureGeneratedPDF_text();
//        Thread.sleep(3500);
//        BaseClass.reportfoldersection().click_GeneratedPDF_button();
//        Thread.sleep(3500);
//
//        BaseClass.pdfVerification().verify_efi_styles_pdf();
//        Thread.sleep(2000);
//
//        BaseClass.reportfoldersection().clickReportSettingsButton();
//        BaseClass.reportfoldersection().clickStylesTab_ReportSettings();
//        BaseClass.pca_xml_section().hover_assigned_packages_first_item();
//        Thread.sleep(800);
//        BaseClass.pca_xml_section().click_cancel_button_first_assigned_package_button();
//        Thread.sleep(1000);
//
//        BaseClass.reportfoldersection().clickAEIReportStyle2022Button();
//        BaseClass.reportfoldersection().click_add_button_styles_package();
//        BaseClass.staging5().click_save_button();
//
//
//        BaseClass.reportfoldersection().clickRegeneratePDFButton();
//        Thread.sleep(3000);
//        BaseClass.reportfoldersection().captureGeneratedPDF_text();
//        Thread.sleep(3500);
//        BaseClass.reportfoldersection().click_GeneratedPDF_button();
//        Thread.sleep(3500);
//
//        BaseClass.pdfVerification().verify_aei_styles_pdf();
//        Thread.sleep(2000);
//
//        BaseClass.reportfoldersection().clickReportSettingsButton();
//        BaseClass.reportfoldersection().clickStylesTab_ReportSettings();
//        BaseClass.pca_xml_section().hover_assigned_packages_first_item();
//        Thread.sleep(800);
//        BaseClass.pca_xml_section().click_cancel_button_first_assigned_package_button();
//        Thread.sleep(1000);
//
//    }
//



}
//    @Test
//    public void TR_0008_ck5_AI_toolbar() throws InterruptedException {
//        WebDriver driver = getDriver();
//
//        driver.navigate().to("https://staging3.openquire.com/reports/1595463");
//
////         Enable spell check and track changes
//
//        BaseClass.staging5().click_and_capture_spell_check_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_and_capture_track_changes_button();
//        Thread.sleep(4500);
//
////         ========== TEST 1: Generate Content > Summarize (with Replace button) ==========
////         Test AI Summarize feature with Stop/Try Again and Replace functionality
//        BaseClass.staging5().click_coverLetter_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//
//        BaseClass.quire_AI().verify_quire_AI_icon_isVisible();
//        Thread.sleep(500);
//        BaseClass.quire_AI().select_all_TC_body_text();
//        Thread.sleep(500);
//
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_dropDownItems();
//        Thread.sleep(500);
//
//        // Click Generate Content > Summarize
//        BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().verify_quire_AI_loading_prompt();
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
//        BaseClass.quire_AI().verify_quire_AI_summarize_generated_prompt();
//        Thread.sleep(1000);
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
//        // Revert Cover Letter changes
//        BaseClass.staging5().click_coverLetter_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_revisions_icon();
//        Thread.sleep(1000);
//
////        BaseClass.ck5editor().click_close_button_popup();
////        Thread.sleep(1000);
////        BaseClass.staging5().click_intro_pages_revisions_icon();
////        Thread.sleep(1000);
//
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(500);
//
//
//        // ========== TEST 2: Generate Content > Summarize (with Copy button) ==========
//        // Test AI Copy feature - generate AI text, copy it, then paste into different section
//        BaseClass.staging5().click_title_page_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_TC_body_text();
//        Thread.sleep(500);
//        // Open AI toolbar and generate summarize content
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//        Thread.sleep(2000);
//        BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_generated_prompt();
//        Thread.sleep(1000);
//
//        // Click Copy button (copies AI text to clipboard, does NOT insert into editor)
//        BaseClass.quire_AI().click_quire_AI_copy_text_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Now paste the copied AI text into the editor manually
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(500);
//        BaseClass.quire_AI().paste_text_introPages_body();
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
//        BaseClass.staging5().click_intro_pages_revisions_icon();
//        Thread.sleep(1000);
////        BaseClass.ck5editor().click_close_button_popup();
////        Thread.sleep(1000);
////        BaseClass.staging5().click_intro_pages_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // ========== TEST 3: Content Assistant > Suggest References ==========
//        // Test AI Suggest References feature in Executive Summary intro page
//
//
//        BaseClass.staging5().click_executive_summary_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_TC_body_text();
//        Thread.sleep(500);
//        // Open AI toolbar and click Content Assistant > Thesaurus
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_contentAssistant_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_suggest_references_button();
//        Thread.sleep(6000);
//
//        // Verify thesaurus suggestions appear
//        BaseClass.quire_AI().verify_quire_AI_suggest_references_generated_prompt();
//        Thread.sleep(1000);
//
//        // Replace text with thesaurus suggestion
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1500);
//
//        // Verify the thesaurus replacement persists
//        BaseClass.quire_AI().verify_quire_AI_suggest_references_inserted_text();
//        Thread.sleep(500);
//        // Revert Executive Summary changes
//        BaseClass.staging5().click_executive_summary_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_revisions_icon();
//        Thread.sleep(1000);
////        BaseClass.ck5editor().click_close_button_popup();
////        Thread.sleep(1000);
////        BaseClass.staging5().click_intro_pages_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(2000);
//
////         ========== TEST 4: Adjust Content Tone > Technical ==========
////         Test AI Tone Adjustment - converts text to technical tone in Default Section SmartTable
//
//
//
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().click_smartTable_cell_text_to_select();
//        Thread.sleep(1000);
//      //  BaseClass.quire_AI().Discard_TC_if_present_ST_cell();
//        Thread.sleep(1000);
//          //   BaseClass.quire_AI().click_smartTable_cell_text_to_select();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_TC_body_text();
//        Thread.sleep(500);
//        // Open AI toolbar and click Adjust Content Tone > Technical
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//      //  BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_adjustContentTone_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_technical_tone_button();
//        Thread.sleep(2000);
//
//        // Verify technical tone content appears
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_generated_prompt();
//        Thread.sleep(1000);
//
//        // Replace text with technical tone version
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Verify the technical tone text persists
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_inserted_text();
//        Thread.sleep(1000);
//        // Revert Default Section SmartTable changes
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_revisions_icon_second();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);

    /// /
    /// /Thread.sleep(2000);
    /// /        BaseClass.staging5().click_default_section_title();
    /// /        Thread.sleep(1000);
    /// /        BaseClass.staging5().click_and_capture_track_changes_button();
    /// /        Thread.sleep(2000);
    /// /        BaseClass.quire_AI().click_smartTable_cell_text_to_select();
    /// /        Thread.sleep(1000);
    /// /        BaseClass.quire_AI().Discard_TC_if_present_ST_cell();
    /// /        Thread.sleep(1000);
//    }
//    @Test
//    public void TR_019_old_pca_costTable_labels() throws InterruptedException, IOException {
//        WebDriver driver = getDriver();
//
//        BaseClass.templatesSection().clickTemplatesTab();
//        BaseClass.templatesSection().clickAddTemplateButton();
//        BaseClass.templatesSection().enterTemplateNameField_old_PCA();
//        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
//        BaseClass.templatesSection().selectTemplateTypeDropdown_old_PCA();
//
//        Thread.sleep(1000);
//
//
//        BaseClass.templatesSection().enterTemplateDescriptionField();
//        BaseClass.templatesSection().clickSave();
//        Thread.sleep(3000);
//
//        BaseClass.templatesSection().capture_created_AlertMessage();
//        BaseClass.templatesSection().clickHereLinkTemplate();
//        Thread.sleep(2000);
//
//        //add cost rec
//        BaseClass.staging5().hoverto_default_section_title();
//
//        BaseClass.staging5().click_default_section_title();
//
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_projSummary_toSection();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_costRecommendation_toSection();
//
//        Thread.sleep(1000);
//
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//
//        BaseClass.staging5().click_add_cost_recommendation_button();
//        Thread.sleep(500);
//
//        BaseClass.staging5().enter_boiler_name_cost_recommendation();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_5_quantity();
//        BaseClass.staging5().enter_cost_summary_unit_1000_cost();
//        BaseClass.staging5().click_critical_repair_cost_checkbox();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_comments();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1000);
//
//
//        BaseClass.staging5().click_add_cost_recommendation_button();
//        Thread.sleep(500);
//
//        BaseClass.staging5().enter_parking_name_cost_recommendation();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_5_quantity();
//        BaseClass.staging5().enter_cost_summary_unit_1000_cost();
//        Thread.sleep(500);
//        BaseClass.staging5().click_all_Years_repair_cost_checkbox();
//        BaseClass.staging5().click_all_Years_repair_cost_checkbox();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1000);
//
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println("Saved URL: " + currentUrl);
//        Thread.sleep(2000);
//
//
//        BaseClass.staging5().clickUserProfileTab();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        BaseClass.quireLogin().enterRootUserEmail();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(1000);
//
//        driver.navigate().to(currentUrl);
//        Thread.sleep(3000);
//
//        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//        Thread.sleep(1500);
//        BaseClass.reporttagssection().click_ReportTags_manage_settings_icon();
//        Thread.sleep(3000);
//
//        BaseClass.reporttagssection().scroll_and_click_and_verify_multiple_cost_tables_checkbox();
//        // BaseClass.reporttagssection().verify_ReportTags_settings_view_isVisible();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(2000);
//        //  WebDriver driver = getDriver();
//
//        BaseClass.staging5().clickUserProfileTab();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        BaseClass.quireLogin().enter_admin_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(1500);
//        driver.navigate().to(currentUrl);
//        Thread.sleep(1500);
//
//
//        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
//        Thread.sleep(500);
//
//        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//        Thread.sleep(500);
//        BaseClass.reporttagssection().select_multiple_cost_tables_feature_dropdown();
//        Thread.sleep(500);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(500);
//        BaseClass.staging5().click_boiler_test_item_link();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_rec_boiler_label_field();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_parking_test_item_link();
//        Thread.sleep(2000);
//        BaseClass.staging5().enter_cost_rec_parking_label_field();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_save_button();
//
//
//        Thread.sleep(2000);
//        BaseClass.staging5().click_add_immediate_repair_cost_section();
//        Thread.sleep(1000);
//       // BaseClass.staging5().verify_immediate_repair_cost_section_text();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().click_add_capital_reserve_schedule_section();
//        Thread.sleep(1000);
//       // BaseClass.staging5().verify_capital_reserved_schedule_cost_section_text();
//        Thread.sleep(1000);
//
//
//        BaseClass.staging5().click_project_summary_sectionView();
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_old_pca_project_summary_text();
//        Thread.sleep(1000);
//
//
//        BaseClass.reportfoldersection().click_quick_preview_button();
//        Thread.sleep(2000);
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        //quick preview tab - capture header and footer data
//        BaseClass.staging5().verify_old_pca_project_summary_text_qp();
//        BaseClass.staging5().verify_immediate_repair_cost_section_text_qp();
//        BaseClass.staging5().verify_capital_reserved_schedule_cost_section_text_qp();
//
//        Thread.sleep(500);
//
//        //close second tab and go back to default tab
//        driver.close();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().change_to_default_tab();
//        Thread.sleep(1000);
//
//    }
//}



//    @Test
//    public void TR_006_FM1105_v12_sections() throws InterruptedException {
//
//        WebDriver driver = getDriver();
//        driver.navigate().to("https://staging3.openquire.com/templates/1332699");
//        Thread.sleep(500);
//
//        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
//        Thread.sleep(500);
//
//        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//        Thread.sleep(500);
//
//        BaseClass.fm_section().select_FM_form_version_v11();
//        Thread.sleep(500);
//
//
//        BaseClass.staging5().click_section_I_general_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_III_property_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_IV_esa_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_V_repair_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_VI_details();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_section_II_unit_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_carport_item__section_II();
//        Thread.sleep(500);
//        //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
//        BaseClass.staging5().enter_costItem_details_sectionII();
//        Thread.sleep(500);
//        BaseClass.staging5().click_garages_item__section_II();
//        Thread.sleep(500);
//        //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
//        BaseClass.staging5().enter_costItem_details_sectionII();
//        Thread.sleep(500);
////        BaseClass.staging5().click_section_II_unit_details_sectionView();
////        Thread.sleep(2000);
//        BaseClass.staging5().verify_section_II_error_message();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_default_section_title();
//
//        Thread.sleep(500);
//
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_costRecommendation_toSection();
//
//        Thread.sleep(1000);
//
//        driver.navigate().refresh();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_cost_recommendation_button();
//        Thread.sleep(500);
//
//
//        BaseClass.staging5().select_carportItem_cost_recommendation();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_quantity();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_unit_cost();
//        Thread.sleep(500);
//        BaseClass.staging5().click_critical_repair_cost_checkbox_fm1105();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//        BaseClass.staging5().select_garagesItem_cost_recommendation();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_quantity();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_unit_cost();
//        Thread.sleep(500);
//        BaseClass.staging5().click_critical_repair_cost_checkbox_fm1105();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_fm_1105_table_cost_summary();
//        Thread.sleep(1000);
//
//        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
//        Thread.sleep(500);
//        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//        Thread.sleep(500);
//
//        BaseClass.fm_section().select_FM_form_version_v12();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_section_II_unit_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.fm_section().verify_FM1105_v12_conditionRating_errors();
//        Thread.sleep(500);
//
//
//        BaseClass.staging5().click_carport_item__section_II();
//        Thread.sleep(500);
//        //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
//        BaseClass.staging5().click_condition_dropDown_propertyItem();
//        Thread.sleep(500);
//        BaseClass.staging5().select_condition_dropDown_propertyItem_v12();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_garages_item__section_II();
//        Thread.sleep(500);
//        //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
//        BaseClass.staging5().click_condition_dropDown_propertyItem();
//        Thread.sleep(500);
//        BaseClass.staging5().select_condition_dropDown_propertyItem_v12();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(500);
//
//
//
////            v12 and v11 _sections
//        BaseClass.staging5().click_section_I_general_details_sectionView();
//        BaseClass.fm_section().verify_fm1105_section1_v11();
//        BaseClass.fm_section().verify_sectionI_seismic_checklist_v11_fm1105();
//        BaseClass.staging5().click_section_II_unit_details_sectionView();
//        Thread.sleep(1000);
//        BaseClass.fm_section().verify_section_II_numerical_condition_rating();
//        Thread.sleep(1000);
//        BaseClass.fm_section().verify_1104_sectionII_numerical_conditionRatings_list();
//        Thread.sleep(1000);
//        BaseClass.fm_section().enter_sectionII_overall_property_conditionRating_v11_fm1105();
//        Thread.sleep(1000);
//        BaseClass.fm_section().select_overall_condition_rating_dropDown_v11_fm1105();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_section_III_property_details_sectionView();
//        BaseClass.fm_section().verify_section_III_repairs_identification_v11();
//        BaseClass.fm_section().verify_fm1105_v11_footer_text();
//        BaseClass.reportfoldersection().click_quick_preview_button();
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        BaseClass.fm_section().verify_fm1105_v12_qp();
//
//        BaseClass.fm_section().verify_cost_rec_table_v11_fm1105_qp();
//        driver.close();
//        BaseClass.staging5().switchToOriginalTab();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_III_property_details_sectionView();
//        Thread.sleep(500);
//
//
//
////generate json , capture generated json text
//        BaseClass.reportfoldersection().click_generate_JSON_Button();
//        Thread.sleep(5000);
//        BaseClass.reportfoldersection().capture_generated_JSON_text();
//        Thread.sleep(2000);
////generate json , capture generated json text
//
//        BaseClass.staging5().click_export_to_excel_fm1105();
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(4000);
//
//        BaseClass.staging5().click_active_notification_button();
//        BaseClass.staging5().capture_unread_notification();
//        Thread.sleep(2500);
//        driver.navigate().refresh();
//        Thread.sleep(2500);
//
//    }


//    @Test
//    public void TR_006_FM1105_v11_sections() throws InterruptedException {
//
//        WebDriver driver = getDriver();
//        driver.navigate().to("https://staging3.openquire.com/templates/1332590");
//
//        BaseClass.staging5().click_section_I_general_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_III_property_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_IV_esa_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_V_repair_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_VI_details();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_section_II_unit_details_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_carport_item__section_II();
//        Thread.sleep(500);
//        //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
//        BaseClass.staging5().enter_costItem_details_sectionII();
//        Thread.sleep(500);
//        BaseClass.staging5().click_garages_item__section_II();
//        Thread.sleep(500);
//        //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
//        BaseClass.staging5().enter_costItem_details_sectionII();
//        Thread.sleep(500);
//        BaseClass.staging5().click_default_section_title();
//
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_costRecommendation_toSection();
//
//        Thread.sleep(1000);
//
//        driver.navigate().refresh();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_cost_recommendation_button();
//        Thread.sleep(500);
//
//
//        BaseClass.staging5().select_carportItem_cost_recommendation();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_quantity();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_unit_cost();
//        Thread.sleep(500);
//        BaseClass.staging5().click_critical_repair_cost_checkbox_fm1105();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//        BaseClass.staging5().select_garagesItem_cost_recommendation();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_quantity();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_cost_summary_unit_cost();
//        Thread.sleep(500);
//        BaseClass.staging5().click_critical_repair_cost_checkbox_fm1105();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_fm_1105_table_cost_summary();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_section_II_unit_details_sectionView();
//        Thread.sleep(2000);
//        BaseClass.staging5().verify_section_II_error_message();
//
//
////            v12 and v11 _sections
//        BaseClass.staging5().click_section_I_general_details_sectionView();
//        BaseClass.fm_section().verify_fm1105_section1_v11();
//        BaseClass.fm_section().verify_sectionI_seismic_checklist_v11_fm1105();
//        BaseClass.staging5().click_section_II_unit_details_sectionView();
//        Thread.sleep(1000);
//        BaseClass.fm_section().verify_section_II_numerical_condition_rating();
//        Thread.sleep(1000);
//        BaseClass.fm_section().enter_sectionII_overall_property_conditionRating_v11_fm1105();
//        Thread.sleep(1000);
//        BaseClass.fm_section().select_overall_condition_rating_dropDown_v11_fm1105();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_section_III_property_details_sectionView();
//        BaseClass.fm_section().verify_section_III_repairs_identification_v11();
//        BaseClass.fm_section().verify_fm1105_v11_footer_text();
//        BaseClass.reportfoldersection().click_quick_preview_button();
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        BaseClass.fm_section().verify_fm1105_v12_qp();
//
//        BaseClass.fm_section().verify_cost_rec_table_v11_fm1105_qp();
//        driver.close();
//        BaseClass.staging5().switchToOriginalTab();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_III_property_details_sectionView();
//        Thread.sleep(500);
//
//
//
//
//
//
//
//
////generate json , capture generated json text
//        BaseClass.reportfoldersection().click_generate_JSON_Button();
//        Thread.sleep(5000);
//        BaseClass.reportfoldersection().capture_generated_JSON_text();
//        Thread.sleep(2000);
////generate json , capture generated json text
//
//        BaseClass.staging5().click_export_to_excel_fm1105();
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(4000);
//
//        BaseClass.staging5().click_active_notification_button();
//        BaseClass.staging5().capture_unread_notification();
//        Thread.sleep(2500);
//        driver.navigate().refresh();
//        Thread.sleep(2500);
//
//    }






//    @Test
//    public void TR_015_ck5_packages_ProjSummary_section() throws InterruptedException {
//        WebDriver driver = getDriver();
//        if (baseUrl.contains("staging5")) {
//            driver.navigate().to("https://staging5.openquire.com/folders/275681/projects/328759");
//        } else if (baseUrl.contains("staging3")) {
//            driver.navigate().to("https://staging3.openquire.com/folders/545421/projects/601025");
//        } else if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/projects/658267");
//        }
//
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//        BaseClass.reportfoldersection().ck5PackagesCheck();
//        Thread.sleep(500);
//
//    }




    //     BaseClass.reportfoldersection().click_ck5_sanity_test_report_link();
//BaseClass.staging5().enter_all_company_users_with_roles();

//            BaseClass.staging5().click_add_company_user();
//            Thread.sleep(500);
//            BaseClass.staging5().enter_company_user_name_field();
//            Thread.sleep(500);
//            BaseClass.staging5().enter_company_user_email_field();
//            Thread.sleep(500);
//            BaseClass.staging5().enter_company_user_pw_field();
//            BaseClass.staging5().enter_company_user_pw_confirmation_field();
//            Thread.sleep(500);
//            BaseClass.staging5().select_company_user_permission_level();
//            Thread.sleep(1500);
//            BaseClass.staging5().clickSave();
//            Thread.sleep(1000);
        //  BaseClass.smartTables().click_row1_dynamic_inside_ST();







//    @Test
//    public void TR_012_Report_tag_matrix_features() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//        WebDriver driver = getDriver();
//
//        BaseClass.staging5().clickUserProfileTab();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
////enter root user
//        BaseClass.quireLogin().enterRootUserEmail();
//        BaseClass.quireLogin().enterPassword();
//        //Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//        if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//        } else if (baseUrl.contains("staging3")) {
//            driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
//        }
//
//        BaseClass.staging5().scroll_and_click_unregister_HOT14_feature();
//
//
//        Thread.sleep(500);
//        if (baseUrl.contains("staging5")) {
//            driver.navigate().to("https://staging5.openquire.com/projects/327971/report_tags");
//            Thread.sleep(2000);
//        } else if (baseUrl.contains("staging3")) {
//            driver.navigate().to("https://staging3.openquire.com/projects/601010/report_tags");
//            Thread.sleep(2000);
//        } else if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/projects/654503/report_tags");
//            Thread.sleep(2000);
//        }
//        //enter account manager name
//        BaseClass.staging5().click_reportTagMatrix_first_cell();
//        Thread.sleep(500);
//
//        BaseClass.staging5().enter_pca_portfolio_project_name_textBox();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().verify_alertMessage_reportTag();
//        Thread.sleep(500);
//
//        BaseClass.staging5().right_click_reportTagMatrix_first_cell();
//
//        Thread.sleep(500);
//        BaseClass.staging5().click_copy_data_across_rows_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_confirm_button();
//        Thread.sleep(1500);
//        BaseClass.staging5().capture_copy_data_confirmation_text();
//        Thread.sleep(500);
//        BaseClass.staging5().click_ok_button();
//        Thread.sleep(500);
//        BaseClass.staging5().confirm_copied_reportTagMatrix_cells_are_the_same();
//        Thread.sleep(500);
//
//    }
//
//    @Test
//    public void TR_013_Portfolio_features() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//        WebDriver driver = getDriver();
//        if (baseUrl.contains("staging5")) {
//            driver.navigate().to("https://staging5.openquire.com/portfolios/4699");
//            Thread.sleep(2000);
//        } else if (baseUrl.contains("staging3")) {
//            driver.navigate().to("https://staging3.openquire.com/portfolios/9301");
//            Thread.sleep(2000);
//        } else if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/portfolios/10393");
//            Thread.sleep(2000);
//        }
//
//        //change to aggregated cost view
//        BaseClass.staging5().click_change_porfolio_view_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().select_porfolio_view_aggregated();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1500);
//
//        //capture current cells under project name
//        BaseClass.staging5().capture_pca_portfolio_project_name_cells();
//        Thread.sleep(500);
//
//        //click project name cell, then enter qa_timeofsystem
//        BaseClass.staging5().click_pca_portfolio_project_name_cell();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_pca_portfolio_project_name_textBox();
//        Thread.sleep(500);
//        //right click project name cell, copy data across, click confirm button, capture confirmation text, click ok
//        BaseClass.staging5().right_click_pca_portfolio_project_name_cell();
//        Thread.sleep(500);
//        BaseClass.staging5().click_copy_data_across_rows_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_confirm_button();
//        Thread.sleep(1500);
//        BaseClass.staging5().capture_copy_data_confirmation_text();
//        Thread.sleep(500);
//        BaseClass.staging5().click_ok_button();
//        Thread.sleep(500);
//
//        //capture and confirm copied cells in table
//        BaseClass.staging5().confirm_copied_pca_portfolio_project_name_cells();
//        Thread.sleep(1000);
//
//        //click undo button, capture alert, capture column data
//        BaseClass.staging5().click_undo_button();
//        Thread.sleep(500);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_pca_portfolio_project_name_cells();
//        Thread.sleep(500);
//
//        //expoty excel and pdf
//        BaseClass.staging5().click_export_to_excel_fm1105();
//        Thread.sleep(500);
//        BaseClass.templatesSection().captureAlertMessage();
//        Thread.sleep(500);
//        BaseClass.staging5().click_cancel_alert_message();
//        Thread.sleep(500);
//        BaseClass.staging5().click_export_pdf_button();
//        Thread.sleep(500);
//        BaseClass.templatesSection().captureAlertMessage();
//        Thread.sleep(500);
//        BaseClass.staging5().click_cancel_alert_message();
//        Thread.sleep(7000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
////click notification icon and click first link, and open new tab with link
//        BaseClass.staging5().click_active_notification_button();
//        Thread.sleep(500);
//        // BaseClass.staging5().mark_all_as_read();
//        // Thread.sleep(1000);
//        BaseClass.staging5().open_pca_portfolio_pdf_notification_link();
//        //  BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_portfolio_from_PDF();
//        Thread.sleep(500);
//        //   WebDriver driver = getDriver();
//
//        //navigate back to original page
//        driver.navigate().back();
//        Thread.sleep(500);
//
//
//    }
//
//    @Test
//    public void TR_017_Atlas_admin_permissions() throws InterruptedException, IOException {
//
//        WebDriver driver = getDriver();
////                BaseClass.staging5().clickUserProfileTab();
////                Thread.sleep(500);
////
////                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//////enter root user
////                BaseClass.quireLogin().enterRootUserEmail();
////                BaseClass.quireLogin().enterPassword();
////                //Thread.sleep(1000);
////                BaseClass.quireLogin().clickLogin();
////                Thread.sleep(500);
////                BaseClass.staging5().click_modal_close_window();
////                Thread.sleep(500);
//        if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//        } else if (baseUrl.contains("staging3")) {
//            driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
//        }
//        Thread.sleep(1000);
//        BaseClass.staging5().add_atlas_feature();
//        BaseClass.staging5().click_add_company_feature();
//
//        BaseClass.staging5().select_company_feature_HOT14();
//
////log out current user, log into sysadmin atlas
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        BaseClass.quireLogin().enter_sysadmin_testingInc_email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//        //click templates tab, create new template button, verify it exists, then cancel
//        BaseClass.templatesSection().clickTemplatesTab();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().clickAddTemplateButton();
//        Thread.sleep(2000);
//
//        BaseClass.templatesSection().verify_NewTemplateModal_isVisible();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().clickCancel();
//        Thread.sleep(500);
//
//        //click first template in templates tab and click manage collaborators
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().click_manage_collaborators_button();
//        Thread.sleep(1000);
//
//
//        //hover and click first arrow button unassigned package...save
//        BaseClass.staging5().hover_unassigned__dropdown_value();
//        Thread.sleep(800);
//        BaseClass.staging5().click_unassigned_items_right_arrow();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().getTemplatesPackagesList();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().captureAlertMessage();
//        Thread.sleep(500);
//
//        //remove assigned first package hovering over checkbox
//        BaseClass.templatesSection().click_manage_collaborators_button();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().hover_assigned_packages_first_item();
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().click_cancel_button_first_assigned_package_button();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().getTemplatesPackagesList();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().captureAlertMessage();
//        Thread.sleep(500);
//
//
//        //log out current user, log into admin atlas
//        BaseClass.staging5().clickUserProfileTab();
//        Thread.sleep(500);
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        BaseClass.quireLogin().enter_admin_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//
//        //verify unable to click templates tab
//        BaseClass.templatesSection().clickTemplatesTab();
//        Thread.sleep(500);
//        BaseClass.templatesSection().verify_add_template_button_locked();
//        Thread.sleep(500);
//
//        //verify unable to click edit labels tab
//        BaseClass.templatesSection().verify_edit_labels_button_locked();
//        Thread.sleep(500);
//        //  WebDriver driver = getDriver();
//        driver.navigate().refresh();
//
//        //go to company users
//        BaseClass.staging5().clickUsersTab();
//        Thread.sleep(500);
//        BaseClass.staging5().click_usersTab_companyUsers_dropdownItem();
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_loading_complete_sideBar();
//
//        //find QA Dumnmy user
//        BaseClass.reportfoldersection().enterSearchField_QA_companyUser();
//        Thread.sleep(3000);
//        BaseClass.staging5().click_qa_dummy_user_link();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_locked_companyUser_fields();
//        Thread.sleep(500);
//        BaseClass.staging5().select_company_user_status();
//        Thread.sleep(500);
//        BaseClass.staging5().clickSave();
//        Thread.sleep(500);
//        BaseClass.staging5().captureAlertMessage();
//
//    }
//}
//        @Test
//        public void TR_013_portfolios() throws InterruptedException {
//
//                BaseClass.staging5().clickUserProfileTab();
//                Thread.sleep(500);
//
//                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
////enter root user
//                BaseClass.quireLogin().enterRootUserEmail();
//                BaseClass.quireLogin().enterPassword();
//                //Thread.sleep(1000);
//                BaseClass.quireLogin().clickLogin();
//                Thread.sleep(500);
//                BaseClass.staging5().click_modal_close_window();
//                Thread.sleep(500);
//                WebDriver driver = getDriver();
//                if (baseUrl.contains("app")) {
//                        driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//                }
//                else if (baseUrl.contains("staging3")) {
//                        driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
//                }
//
//                BaseClass.staging5().scroll_and_click_unregister_HOT14_feature();
//                Thread.sleep(500);
//
//
////        else if (baseUrl.contains("app")) {
////            driver.navigate().to("https://app.openquire.com/companies/253/company_email_templates?filter=report%3Astatus_change");
////        }
//
//                //go to portfolios tab and into qa automation pca portfolio
//                BaseClass.staging5().clickPortfoliosTab();
//                BaseClass.staging5().click_QA_PCA_portfolio();
//                Thread.sleep(2500);
//
//                //change to individual cost view
//                BaseClass.staging5().click_change_porfolio_view_button();
//                Thread.sleep(500);
//                BaseClass.staging5().select_porfolio_view_individual();
//                Thread.sleep(500);
//                BaseClass.staging5().click_save_button();
//                Thread.sleep(1500);
//
//
//                //capture portfolio text and click export pdf and export excel button...and capture green banner
//                BaseClass.staging5().capture_portfolio_text();
//                Thread.sleep(1000);
//
//                BaseClass.staging5().click_export_to_excel_fm1105();
//                Thread.sleep(500);
//                BaseClass.templatesSection().captureAlertMessage();
//                Thread.sleep(500);
//                BaseClass.staging5().click_cancel_alert_message();
//                Thread.sleep(500);
//                BaseClass.staging5().click_export_pdf_button();
//                Thread.sleep(500);
//                BaseClass.templatesSection().captureAlertMessage();
//                Thread.sleep(500);
//                BaseClass.staging5().click_cancel_alert_message();
//                Thread.sleep(500);
//                //change to aggregated cost view
//                BaseClass.staging5().click_change_porfolio_view_button();
//                Thread.sleep(1000);
//                BaseClass.staging5().select_porfolio_view_aggregated();
//                Thread.sleep(500);
//                BaseClass.staging5().click_save_button();
//                Thread.sleep(1500);
//
//                //capture portfolio text and click export pdf and export excel button...and capture green banner
//                BaseClass.staging5().capture_portfolio_text();
//                Thread.sleep(1000);
//                BaseClass.staging5().click_export_to_excel_fm1105();
//                BaseClass.templatesSection().captureAlertMessage();
//                Thread.sleep(500);
//                BaseClass.staging5().click_cancel_alert_message();
//                Thread.sleep(500);
//                BaseClass.staging5().click_export_pdf_button();
//                BaseClass.templatesSection().captureAlertMessage();
//                Thread.sleep(500);
//                BaseClass.staging5().click_cancel_alert_message();
//                Thread.sleep(500);
//
//                if (baseUrl.contains("app")) {
//                        driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//                }
//                else if (baseUrl.contains("staging3")) {
//                        driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
//                }
//                Thread.sleep(500);
//                BaseClass.staging5().click_add_company_feature();
//                Thread.sleep(500);
//                BaseClass.staging5().select_company_feature_HOT14();
//                Thread.sleep(500);
//
//
//
//                BaseClass.staging5().clickUserProfileTab();
//                Thread.sleep(500);
//
//                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
////enter root user
//                BaseClass.quireLogin().enter_admin_Email();
//                BaseClass.quireLogin().enterPassword();
//                //Thread.sleep(1000);
//                BaseClass.quireLogin().clickLogin();
//                Thread.sleep(500);
//
//        }

//
//    @Test
//    public void TR_021_rows_and_headerRows() throws InterruptedException {
//        WebDriver driver = getDriver();
//
////INSERT ROW ABOVE
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
////click escape dynamic cell with data
//        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_row_above_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r1_empty();
//        Thread.sleep(500);
//
////DELETE ROW 1 - no data
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
////switch r5c5 dynamic cell to iframe
//   //     BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//    //    Thread.sleep(500);
////switch r5c5 dynamic cell to iframe - to click escape button
//        BaseClass.ck5editor().click_escape_current_cell();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_delete_row_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        //   BaseClass.smartTables().verify_con();
//        //   Thread.sleep(500);
//
//
////INSERT ROW Below
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_row_below_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r2_empty();
//        Thread.sleep(500);
//
//
//
//
//        //merge row 2
//
//
////INSERT Header Above in R1
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_header_above_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r1_header_is_empty();
//        Thread.sleep(500);
//
//
//        //INSERT Header below empty R1 Header
//        BaseClass.smartTables().click_r1_header();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe
//    //    BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//        BaseClass.ck5editor().click_escape_current_cell();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1_header_smartTable - after escape is clicked
//        BaseClass.smartTables().rightClick_r1_header_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_header_below_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r2_header_is_empty();
//        Thread.sleep(500);
//
//
//      //  Thread.sleep(500);
//        BaseClass.smartTables().click_r1_header();
//        Thread.sleep(2500);
//        BaseClass.smartTables().right_click_row2_header_ST();
//        Thread.sleep(2500);
//        BaseClass.smartTables().click_merge_cells();
//        Thread.sleep(500);
//
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_merged_row2_ST_preview_mode();
//        Thread.sleep(500);
//    }


//        @Test
//        public void TR_015_generate_PDF_projFolders() throws InterruptedException {
//                BaseClass.staging5().clickReportsTab();
//                BaseClass.reportfoldersection().enterSearchField_QA_Report();
//                BaseClass.reportfoldersection().clickReportsFirstLink();
//                Thread.sleep(4500);
//                BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();
//                Thread.sleep(2000);
////regenerate existing report already from previous test steps
//                BaseClass.reportfoldersection().clickGeneratePDFButton_projfolderview();
//
//                BaseClass.reportfoldersection().click_regenerate_button_project_folder_view();//
//                //verify green banner
//                BaseClass.templatesSection().verify_PDF_generating_AlertMessage();
//              //  Thread.sleep(2000);
//                //verify loading sign disappeared for pdf status
//              //  BaseClass.templatesSection().verify_PDF_finished_generating();
////click generate pdf, if not available, will re generate second report
//                BaseClass.reportfoldersection().clickGeneratePDFButton_projfolderview();
//                BaseClass.templatesSection().verify_PDF_generating_AlertMessage();
//                Thread.sleep(2000);
//
//                BaseClass.templatesSection().verify_PDF_finished_generating();
//
//        }
//        @Test
//        public void TR_003_add_title_page_image_report_tag() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//
//                BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
//                Thread.sleep(500);
//                BaseClass.reporttagssection().click_ReportTags_manage_settings_icon();
//                Thread.sleep(1000);
//
//                BaseClass.reporttagssection().scroll_and_click_and_verify_title_page_image_checkbox();
//                // BaseClass.reporttagssection().verify_ReportTags_settings_view_isVisible();
//                // Thread.sleep(500);
//                BaseClass.staging5().click_save_button();
//                Thread.sleep(1000);
//
//
//        }
//        @Test
//        public void TR_010b_delete_exclude_appendix_files() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//                BaseClass.reportfoldersection().clickSectionView_Appendices();
//                Thread.sleep(1000);
//                BaseClass.reportfoldersection().number_of_items_appendix_section();
//                Thread.sleep(500);
//
//                BaseClass.staging5().hover_to_delete_first_pdf_appendix_file();
//                Thread.sleep(500);
//                BaseClass.staging5().hover_to_exclude_first_pdf_appendix_file();
//                Thread.sleep(500);
//
//                BaseClass.staging5().hover_to_delete_first_gallery_appendix_file();
//                Thread.sleep(500);
//                BaseClass.staging5().hover_to_exclude_first_gallery_appendix_file();
//                Thread.sleep(500);
//
//                BaseClass.reportfoldersection().number_of_items_appendix_section();
//                Thread.sleep(500);
//
//                BaseClass.staging5().click_view_trash_button();
//                Thread.sleep(500);
//
//
//                //restore recent 2 deleted items (appendices)
//                BaseClass.staging5().click_restore_first_deleted_item();
//                Thread.sleep(500);
//                BaseClass.staging5().click_restore_first_deleted_item();
//                Thread.sleep(500);
//                //go back and refresh
//                WebDriver driver = getDriver();
//
//                driver.navigate().back();
//                Thread.sleep(500);
//                driver.navigate().refresh();
//                Thread.sleep(500);
//                BaseClass.reportfoldersection().clickSectionView_Appendices();
//                Thread.sleep(1500);
//
//                BaseClass.reportfoldersection().number_of_items_appendix_section();
//                Thread.sleep(1000);
//
//        }
//
//        @Test
//        public void TR_001a_navigate() throws InterruptedException {
//                WebDriver driver = getDriver();
//                //navigate to empty report-automation testing report
//                driver.navigate().to("https://staging3.openquire.com");
//                Thread.sleep(500);
//                BaseClass.staging5().captureURL();
//                Thread.sleep(500);
//                // BaseClass.staging5().click_and_capture_track_changes_button();
//                Thread.sleep(1000);
//
//
//                //log out current user, log into sysadmin atlas
//                BaseClass.staging5().clickUserProfileTab();
//                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//                BaseClass.quireLogin().enterEmail_sysadmin_atlas();
//                BaseClass.quireLogin().enterPassword();
//                Thread.sleep(1000);
//                BaseClass.quireLogin().clickLogin();
//                Thread.sleep(500);
//                BaseClass.staging5().click_modal_close_window();
//                Thread.sleep(500);
//
//                //log out current user, log into admin atlas
//                BaseClass.staging5().clickUserProfileTab();
//                Thread.sleep(500);
//                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//                BaseClass.quireLogin().enterEmail_admin_atlas();
//                BaseClass.quireLogin().enterPassword();
//                Thread.sleep(1000);
//                BaseClass.quireLogin().clickLogin();
//                Thread.sleep(500);
//                BaseClass.staging5().click_modal_close_window();
//                Thread.sleep(1000);
//
//
//                //go to company users
//                BaseClass.staging5().clickUsersTab();
//                Thread.sleep(500);
//                BaseClass.staging5().click_usersTab_companyUsers_dropdownItem();
//                Thread.sleep(1000);
//                BaseClass.staging5().verify_loading_complete_sideBar();
//                //find QA Dumnmy user
//                BaseClass.staging5().click_created_filter_button_twice();
//                Thread.sleep(3000);
//                BaseClass.staging5().click_qa_dummy_user_link();
//                Thread.sleep(500);
//                BaseClass.staging5().verify_locked_companyUser_fields();
//                Thread.sleep(500);
//                BaseClass.staging5().select_company_user_status();
//                Thread.sleep(500);
//                BaseClass.staging5().clickSave();
//                Thread.sleep(500);
//                BaseClass.staging5().captureAlertMessage();
//
//        }



                //    @Test
//    public void TR_020_sort_columns() throws InterruptedException{
//
//
//
//        BaseClass.smartTables().click_c1_header();
//        Thread.sleep(1000);
//
//        BaseClass.smartTables().click_sort_columns_except_formula_and_date();
//        Thread.sleep(1000);
//
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//
//
//    }
//    @Test
//    public void TR_021_rows_and_headerRows() throws InterruptedException {
//        WebDriver driver = getDriver();
//
////INSERT ROW ABOVE
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
////click escape dynamic cell with data
//        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
//
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_row_above_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r1_empty();
//        Thread.sleep(500);
//
//        //DELETE ROW 1 - no data
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
////switch r5c5 dynamic cell to iframe
//   //     BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//    //    Thread.sleep(500);
////switch r5c5 dynamic cell to iframe - to click escape button
//        BaseClass.ck5editor().click_escape_current_cell();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_delete_row_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        //   BaseClass.smartTables().verify_con();
//        //   Thread.sleep(500);
//
//
////INSERT ROW Below
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_row_below_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r2_empty();
//        Thread.sleep(500);
//
//
////INSERT Header Above in R1
//        BaseClass.smartTables().click_r1_c5_dynamic();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_header_above_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r1_header_is_empty();
//        Thread.sleep(500);
//
//
//        //INSERT Header below empty R1 Header
//        BaseClass.smartTables().click_r1_header();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe
//    //    BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//        BaseClass.ck5editor().click_escape_current_cell();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1_header_smartTable - after escape is clicked
//        BaseClass.smartTables().rightClick_r1_header_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.smartTables().click_insert_header_below_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_r2_header_is_empty();
//        Thread.sleep(500);
//    }

        //}
//        @Test
//        public void TR018_Spellcheck_trackChanges_ck4() throws InterruptedException {
//                WebDriver driver = getDriver();
//
//                //navigate to empty report-automation testing report
//                driver.navigate().to("https://app.openquire.com/reports/1379930");
//                Thread.sleep(500);
//                BaseClass.staging5().captureURL();
//                Thread.sleep(500);
//                BaseClass.staging5().click_and_capture_track_changes_button();
//                Thread.sleep(1000);
//
//
//                // go to section 1 and type spellcheck error text
//        BaseClass.staging5().click_Section2_row_editor();
//                Thread.sleep(5000);
//                BaseClass.ck5editor().enter_sc_text_body_ck5();
//                Thread.sleep(50000);
//                BaseClass.staging5().click_default_section_title();
//                Thread.sleep(500);
//
//                BaseClass.ck5editor().click_current_section_TC_highlight();
//                Thread.sleep(1000);
//
//                BaseClass.ck5editor().click_accept_TC_suggestion();
//                Thread.sleep(500);
//
//                BaseClass.staging5().click_and_capture_spell_check_button();
//                Thread.sleep(500);
//                BaseClass.staging5().capture_spellCheck_error_sections();
//                Thread.sleep(2000);
//                BaseClass.staging5().fix_all_spellCheck_errors_sanity();
//                Thread.sleep(500);
//
//        BaseClass.staging5().click_Section2_row_editor();
//                Thread.sleep(500);
//
//                BaseClass.ck5editor().select_all_and_backspace_sc_tc_section();
////
////                //track changes delete section - red - section 1
////
////                BaseClass.staging5().clickSection_row_editor();
////
////                BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
////                Thread.sleep(500);
////                BaseClass.templatesSection().select_all_and_backspace_Section_section_row_iFrame();
////                Thread.sleep(500);
////                driver.switchTo().defaultContent();
////                Thread.sleep(500);
//               // BaseClass.staging5().click_section_1_header();
//               // Thread.sleep(500);
////
////                //verify green and red track change showing
//////        BaseClass.staging5().verify_green_tracked_changes_is_Visible();
//////        Thread.sleep(500);
//                BaseClass.ck5editor().click_TC_red_highlight();
//                Thread.sleep(500);
////                //delete section 1 by accepting red cross change
////
//              //  BaseClass.staging5().click_Section2_row_editor();
//               // Thread.sleep(500);
//                BaseClass.ck5editor().click_accept_TC_suggestion();
//                Thread.sleep(500);
//                BaseClass.staging5().click_section_2_header();
//                Thread.sleep(1000);
//
////        //delete section 2 by rejecting green change
////
////        BaseClass.staging5().click_Section2_row_editor();
////        Thread.sleep(500);
////        BaseClass.staging5().click_reject_change_icon_ck5();
////        Thread.sleep(500);
////
////        BaseClass.staging5().click_default_section_title();
////        BaseClass.staging5().capture_spellCheck_errors();
//
//                //       Thread.sleep(500);
//
//
//        }
//        @Test
//        public void TR_006a_Headers_Footers() throws InterruptedException, IOException {
////not adding in report, doing to template
//
////                BaseClass.reportfoldersection().clickReportsTab();
////        BaseClass.reportfoldersection().enterSearchField_QA_Report();
////        Thread.sleep(4500);
////        BaseClass.reportfoldersection().clickReportsFirstLink();
////        Thread.sleep(1000);
////        BaseClass.projectFolderSection().click_projectFolderLink_MediumPriority();
////        Thread.sleep(1000);
////        BaseClass.reportfoldersection().clickReportsFirstLink();
//
//
////        //in proj folder, click add new report button
////        BaseClass.reportfoldersection().clickAddReportButton();
////        //new report name and info
////        BaseClass.reportfoldersection().enterReportName_QA_Medium_Priority_Report_Field();
////
////        BaseClass.reportfoldersection().enterReportDescriptionField();
////        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
////        Thread.sleep(2500);
////        BaseClass.reportfoldersection().clickDropdownItem();
////        Thread.sleep(1000);
////        BaseClass.reportfoldersection().clickSave();
////        Thread.sleep(3000);
//////capture alert message fore template created
////        BaseClass.templatesSection().capture_created_AlertMessage();
////        BaseClass.templatesSection().clickHereLinkReport();
////        Thread.sleep(3000);
//
//                //click template settings button
////                BaseClass.templatesSection().clickTemplateSettingsButton();
////
////
////                //click header tab
////                BaseClass.reportfoldersection().clickHeaderTab_ReportSettings();
////                Thread.sleep(500);
//////left header textbox - insert report tag
////                BaseClass.reportfoldersection().click_left_header_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_header_reportTag_ReportSettings();
////                Thread.sleep(500);
//////center header textbox - insert month variable tag
////                BaseClass.reportfoldersection().click_center_header_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_month_variable_dropdown_ReportSettings();
////                Thread.sleep(500);
////                //right header textbox - insert text
////                BaseClass.reportfoldersection().enter_right_header_textBox_ReportSettings();
////                Thread.sleep(500);
////
////                //click footer tab
////                BaseClass.reportfoldersection().clickfooterTab_ReportSettings();
////                Thread.sleep(500);
//////left footer textbox - insert report tag
////                BaseClass.reportfoldersection().click_left_footer_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_footer_reportTag_ReportSettings();
////                Thread.sleep(500);
//////center footer textbox - insert year variable tag
////                BaseClass.reportfoldersection().click_center_footer_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_year_variable_dropdown_ReportSettings();
////                Thread.sleep(500);
////                //right footer textbox - insert text
////
////                BaseClass.reportfoldersection().enter_right_footer_textBox_ReportSettings();
////                Thread.sleep(500);
////                //click s ave button
////                BaseClass.staging5().click_save_button();
////                Thread.sleep(1000);
////
////                //quick preview button in next tab
////                BaseClass.reportfoldersection().click_quick_preview_button();
////                Thread.sleep(1000);
////                BaseClass.reportfoldersection().change_to_next_tab();
////                Thread.sleep(500);
////
////                //quick preview tab - capture header and footer data
////                BaseClass.reportfoldersection().verify_header_section_quickPreview();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().verify_footer_section_quickPreview();
////                Thread.sleep(500);
//                WebDriver driver = getDriver();
////
//////close second tab and go back to default tab
////                driver.close();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().change_to_default_tab();
////
////
////                Thread.sleep(500);
////generate pdf and capture alert message
////                BaseClass.reportfoldersection().clickRegeneratePDFButton();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().captureAlertMessage();
////                Thread.sleep(3000);
//                //capture and click generated pdf
//
//                BaseClass.reportfoldersection().captureGeneratedPDF_text();
//               // BaseClass.reportfoldersection().click_GeneratedPDF_button();
//
////verify if header and footer has contents expected
//                BaseClass.staging5().verify_header_footer_PDF_contents();
//                Thread.sleep(500);
//                //close second tab and go to default tab
//
//                Thread.sleep(6000);
//
//
////        BaseClass.staging5().click_export_to_excel_fm1105();
////        Thread.sleep(500);
////        BaseClass.templatesSection().captureAlertMessage();
////        Thread.sleep(500);
////        BaseClass.staging5().click_cancel_alert_message();
////        Thread.sleep(500);
////        BaseClass.staging5().click_export_pdf_button();
////        Thread.sleep(500);
////        BaseClass.templatesSection().captureAlertMessage();
////        Thread.sleep(500);
////        BaseClass.staging5().click_cancel_alert_message();
////        Thread.sleep(500);
//
//        }







