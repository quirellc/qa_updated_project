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
        driver.navigate().to("https://staging5.openquire.com/");
        //  WebDriver driver1 = getDriver();

        String pageTitle = driver.getTitle();
        if (pageTitle.contains("OpenQuire")) {
            BaseClass.quireLogin().enter_admin_Email();
            Thread.sleep(1000);
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(3000);
        } else {
            System.out.println("\n" + "Already logged in. Skipping login steps.");
            Thread.sleep(3000);
        }

        BaseClass.staging5().captureURL();
        Thread.sleep(2000);





    }
//    @Test
//    public void TR_001_FM1104_new_cloned_template_and_report() throws InterruptedException {
//        WebDriver driver = getDriver();
//        //    driver.navigate().to("https://staging5.openquire.com/reports/666396");
//        driver.navigate().to("https://staging5.openquire.com");
//
//        BaseClass.quireLogin().enter_admin_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        //pca
//
//        //driver.navigate().to("https://staging5.openquire.com/templates/668836");
//        Thread.sleep(1500);
//
//
//        BaseClass.staging5().clickLibrariesTab();
//        BaseClass.staging5().click_librariesTab_costRec_Dropdown();
//        Thread.sleep(500);
//        BaseClass.staging5().click_export_to_excel();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().verify_excel_AlertMessage();
//        BaseClass.staging5().click_filter_by_labels_search_field();
//        Thread.sleep(500);
//        BaseClass.staging5().click_filter_by_labels_first_dropdown();
//        Thread.sleep(1500);
//        BaseClass.staging5().click_filter_by_labels_alan_dropdown();
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().clickSearchField();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_filter_has_0_results();
//        Thread.sleep(500);
//        BaseClass.staging5().click_remove_first_label();
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().clickSearchField();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_cost_rec_alan_label_587();
//        BaseClass.staging5().verify_cost_rec_alan_label_name();
//
//        Thread.sleep(500);
//
//        //remove label and search
//        BaseClass.staging5().click_remove_first_label();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_587_cost_rec_searchField();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_cost_rec_alan_label_587();
//        Thread.sleep(500);
//
//
//
//    }

//        @Test
//        public void TR_005_FM1104_new_cloned_template_and_report() throws InterruptedException {
//            WebDriver driver = getDriver();
//
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//        BaseClass.staging5().captureURL();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().click_status_Email_Notification_Template();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_email_template_message();
//        Thread.sleep(500);
//        BaseClass.ck5editor().verify_ck_editor_root_emailStatusTemplate_permission_level();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(100000);
//      //  String pageTitle = driver.getTitle();
//        driver.navigate().to("https://staging5.openquire.com/reports/669017");
//
//            BaseClass.quireLogin().enterEmail_bv_admin_level();
//            Thread.sleep(1000);
//            BaseClass.quireLogin().enterPassword();
//            Thread.sleep(1000);
//            BaseClass.quireLogin().clickLogin();
//            Thread.sleep(1000);
//
//
//        Thread.sleep(50000);
//
//
//     //   BaseClass.ck5editor().enter_long_text_body_ck5();
//        //   BaseClass.staging5().click_default_section_title();
//        //       BaseClass.staging5().clickSection_row_editor();
//
//        BaseClass.smartTables().click_r1_c1();
//        Thread.sleep(1000);
//        //        Add 2 new comments
//        BaseClass.ck5editor().double_click_first_line();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_comment_icon_ck5();
//        Thread.sleep(500);
//        BaseClass.ck5editor().enter_comment_to_field();
//        Thread.sleep(500);
//        BaseClass.ck5editor().double_click_third_line();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_comment_icon_ck5();
//        Thread.sleep(500);
//        BaseClass.ck5editor().verify_comment_highlight_is_Visible();
//        Thread.sleep(500);
//        BaseClass.ck5editor().enter_comment_to_field();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_comments_resolve_button();
//        Thread.sleep(1500);
//
//
//        BaseClass.smartTables().click_row1_plainText_inside_ST();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().add_new_comment_to_ST();
//        Thread.sleep(500);
//
//        BaseClass.smartTables().click_row1_number_inside_ST();
//        Thread.sleep(500);
//        BaseClass.ck5editor().add_new_comment_to_ST();
//        Thread.sleep(500);
//
//
//        BaseClass.smartTables().click_row1_formula_inside_ST();
//        Thread.sleep(500);
//        BaseClass.ck5editor().add_new_comment_to_ST();
//        Thread.sleep(500);
//
//
//        BaseClass.smartTables().click_row1_dynamic_inside_ST();
//        Thread.sleep(500);
//        BaseClass.ck5editor().add_new_comment_to_ST();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_comments_resolve_button();
//        Thread.sleep(500);
//
//
//        BaseClass.smartTables().click_row1_date_inside_ST();
//        Thread.sleep(500);
//        BaseClass.ck5editor().add_new_comment_to_ST();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_comments_resolve_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        BaseClass.staging5().click_smartTable_title_header();
//        BaseClass.ck5editor().verify_unresolved_4_comment_is_Visible();
//
//        BaseClass.ck5editor().hover_unresolved_4_comments_icon();
//        Thread.sleep(500);
//        BaseClass.ck5editor().verify_comments_hover_icon();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().hover_comments_icon_statusBar();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().verify_comments_hover_icon();
//        Thread.sleep(500);
//
//
//        BaseClass.ck5editor().click_unresolved_4_comments_icon();
//        Thread.sleep(1500);
//        BaseClass.ck5editor().verify_unresolved_comments_smartTable();
//        Thread.sleep(1500);
//        BaseClass.ck5editor().verify_resolved_comments_smartTable();
//        Thread.sleep(500);
//
//
//        Thread.sleep(50000);
//
//
//
//
//
//
//        BaseClass.smartTables().click_row6_richText_formula_link();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_reference_tag_icon_ck5();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_reference_tag_dropDown_item_ck5();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.smartTables().capture_reference_tag_value();
//        Thread.sleep(500);
//
//
//
//
//        //QP and verify Reference tag value and Section Link
//        BaseClass.reportfoldersection().click_quick_preview_button();
//        Thread.sleep(1000);
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        //quick preview tab - capture header and footer data
//        BaseClass.smartTables().verify_qp_ST_reference_tag();
//        BaseClass.smartTables().verify_quickPreview_linked_section_is_visible();
//        Thread.sleep(500);
//        //close second tab and go back to default tab
//        driver.close();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().change_to_default_tab();
//        Thread.sleep(1000);
//
//
//
//
//        // unlink section link
//        BaseClass.smartTables().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().doubleclick_linked_section_text();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_unlink_button_sectionLinkView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_linked_sectionLink_isNot_visible();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//
//        //delete reference tag value
//        //rightclick formula cell with reference tag included
//        BaseClass.smartTables().click_row1_formula();
//        Thread.sleep(1000);
//        BaseClass.smartTables().click_escape_button_formula_smartTable();
//
//
//        BaseClass.smartTables().rightClick_formula_cell_hasReferenceTag_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_add_or_edit_cell_reference_tag_button();
//
//        //delete reference tag value
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_deleted_reference_tag_is_Visible();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//
//
//        //QP and verify Reference tag value and Section Link
//        BaseClass.reportfoldersection().click_quick_preview_button();
//        Thread.sleep(1000);
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        //quick preview tab - capture header and footer data
//        BaseClass.smartTables().verify_qp_ST_reference_tag_not_visible();
//        BaseClass.smartTables().verify_quickPreview_linked_section_isNot_visible();
//        Thread.sleep(500);
//        //close second tab and go back to default tab
//        driver.close();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().change_to_default_tab();
//        Thread.sleep(1000);
//
//
//
//        //enter number for dynamic r1c5
//
//        BaseClass.smartTables().click_row1_dynamic();
//        Thread.sleep(500);
//
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(15000);
////        //DELETE Header R1 and R2
////        BaseClass.staging5().click_r1_header();
////        Thread.sleep(500);
//////switch r1c5 dynamic cell to iframe
////        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
////        Thread.sleep(500);
//////switch r1c5 dynamic cell to iframe - to click escape button
////        BaseClass.templatesSection().click_escape_cell_iFrame();
////        Thread.sleep(500);
////        driver.switchTo().parentFrame();
////        Thread.sleep(500);
////        //right click r1_header_smartTable - after escape is clicked
////        BaseClass.staging5().rightClick_r1_header_smartTable();
////        Thread.sleep(500);
////        // dynamic cell - after right click - click insert row above
////        BaseClass.staging5().click_delete_row_button();
////        Thread.sleep(500);
////        BaseClass.staging5().click_smartTable_sectionView();
////        Thread.sleep(500);
////        BaseClass.staging5().verify_r1_header_is_empty();
////        Thread.sleep(500);
////
////
//////delete header row 1 again
////        BaseClass.staging5().click_r1_header();
////        Thread.sleep(500);
//////switch r1c5 dynamic cell to iframe
////        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
////        Thread.sleep(500);
//////switch r1c5 dynamic cell to iframe - to click escape button
////        BaseClass.templatesSection().click_escape_cell_iFrame();
////        Thread.sleep(500);
////        driver.switchTo().parentFrame();
////        Thread.sleep(500);
////        //right click r1_header_smartTable - after escape is clicked
////        BaseClass.staging5().rightClick_r1_header_smartTable();
////        Thread.sleep(500);
////        // dynamic cell - after right click - click insert row above
////        BaseClass.staging5().click_delete_row_button();
////        Thread.sleep(500);
////        BaseClass.staging5().click_smartTable_sectionView();
////        Thread.sleep(500);
////        BaseClass.staging5().verify_r1_header_is_empty();
////        Thread.sleep(500);
//
////        Scenario 4
////        No existing unresolved or resolved comments
////        Add 2 new comments
////        Refresh page
////        Resolve both comments added in step 2
////        Refresh page
////        Reopen both comments resolved in step 5
//
//
//
//        Thread.sleep(30000);
//
//        //   Thread.sleep(2500);
//
//
//
//
//
//
//
////        BaseClass.staging5().click_coverLetter_sectionView();
////        Thread.sleep(500);
////
////        //check revision history
////        BaseClass.staging5().click_intro_pages_revisions_icon();
////        //NOT WORKING
////        BaseClass.staging5().capture_revisions_history();
////       // BaseClass.staging5().click_cancel_button_popup();
////        Thread.sleep(500);
////
////       // BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
////      //  Thread.sleep(500);
////        BaseClass.staging5().click_out_of_section();
////
////        Thread.sleep(500);
//
//    }




        //NOT WORKING
//add wordbank assigned item to cell
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_row5_richText();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_insert_wordbank_arrow_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        //not working 9-10-24
//     //   BaseClass.staging5().verify_green_highlighted_wb_item_is_Visible();
//        Thread.sleep(1500);
//        BaseClass.staging5().click_row5_richText();
//        Thread.sleep(1000);

    //NOT NEEDED
//        //export to excel from smart table actions
//        BaseClass.staging5().click_smartTable_actions_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_export_to_excel_file_dropdown_button();
//        Thread.sleep(500);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);



        //unlink - section link
        //NOT WORKING
//        BaseClass.staging5().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().doubleclick_linked_section_text();
//        Thread.sleep(500);
//        BaseClass.staging5().click_unlink_button_sectionLinkView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        BaseClass.staging5().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_linked_sectionLink_isNot_visible();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().click_quick_preview_button();
//        Thread.sleep(1500);
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_quickPreview_linked_section_isNot_visible();
//        driver.close();
//        BaseClass.reportfoldersection().change_to_default_tab();
//        Thread.sleep(500);
    }








