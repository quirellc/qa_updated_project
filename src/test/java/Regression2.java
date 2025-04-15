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
        @Test
        public void TR0001_user_login() throws InterruptedException {
                WebDriver driver = getDriver();
                System.out.println(driver.getClass().getSimpleName());
                driver.navigate().to(baseUrl);
                System.out.println("Navigating to: " + baseUrl);
                // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
//        driver.navigate().to("https://staging5.openquire.com/");
                //     driver.navigate().to("https://app-next.openquire.com/");
//        driver.navigate().to("https://staging5-next.openquire.com/");

                //  WebDriver driver1 = getDriver();

                //   String pageTitle = driver.getTitle();
                if (baseUrl.contains("staging")) {
                        BaseClass.quireLogin().enter_admin_Email();
                } else if (baseUrl.contains("app")) {
                        BaseClass.quireLogin().enterProdEmail();
                }

                Thread.sleep(1000);
                BaseClass.quireLogin().enterPassword();
                Thread.sleep(1000);
                BaseClass.quireLogin().clickLogin();
                Thread.sleep(3000);


        }


//        @Test
//        public void TR_001a_navigate() throws InterruptedException {
//                WebDriver driver = getDriver();
//                //navigate to empty report-automation testing report
//                driver.navigate().to("https://staging3.openquire.com/reports/1330368");
//                Thread.sleep(500);
//                BaseClass.staging5().captureURL();
//                Thread.sleep(500);
//               // BaseClass.staging5().click_and_capture_track_changes_button();
//                Thread.sleep(1000);
//        }

        @Test
        public void TR_010a_edit_image_captions() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

                //Go into to QA Automation Parent folder
                BaseClass.reportfoldersection().clickReportsTab();
                BaseClass.reportfoldersection().enterSearchField_QA_Report();
                Thread.sleep(3500);
                BaseClass.reportfoldersection().clickReportsFirstLink();
                Thread.sleep(500);



                //Go into to pca Project Folder
                BaseClass.projectFolderSection().click_PCA_ProjectFolderLink();
                Thread.sleep(500);
                BaseClass.reportfoldersection().clickReportsFirstLink();
                Thread.sleep(1000);

                BaseClass.reportfoldersection().enter_image1_updated_name();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().verify_custom_image1_caption();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().clickSectionView_Appendices();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().verify_image1_original_name_appendix();
                Thread.sleep(1000);


                //        //quick preview button in next tab
                BaseClass.reportfoldersection().click_quick_preview_button();
                Thread.sleep(2000);
                BaseClass.reportfoldersection().change_to_next_tab();
                Thread.sleep(500);
                //quick preview tab - capture header and footer data
                BaseClass.reportfoldersection().verify_qp_updated_image_caption();
                Thread.sleep(500);
                WebDriver driver = getDriver();

                //close second tab and go back to default tab
                driver.close();
                Thread.sleep(500);
                BaseClass.reportfoldersection().change_to_default_tab();
                Thread.sleep(1000);
        }

        @Test
        public void TR_010b_delete_exclude_appendix_files() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
                BaseClass.reportfoldersection().clickSectionView_Appendices();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().number_of_items_appendix_section();
                Thread.sleep(500);

                BaseClass.staging5().hover_to_delete_first_pdf_appendix_file();
                Thread.sleep(500);
                BaseClass.staging5().hover_to_exclude_first_pdf_appendix_file();
                Thread.sleep(500);

                BaseClass.staging5().hover_to_delete_first_gallery_appendix_file();
                Thread.sleep(500);
                BaseClass.staging5().hover_to_exclude_first_gallery_appendix_file();
                Thread.sleep(500);

                BaseClass.reportfoldersection().number_of_items_appendix_section();
                Thread.sleep(500);

                BaseClass.staging5().click_view_trash_button();
                Thread.sleep(500);


                //restore recent 2 deleted items (appendices)
                BaseClass.staging5().click_restore_first_deleted_item();
                Thread.sleep(500);
                BaseClass.staging5().click_restore_first_deleted_item();
                Thread.sleep(500);
                //go back and refresh
                WebDriver driver = getDriver();

                driver.navigate().back();
                Thread.sleep(500);
                driver.navigate().refresh();
                Thread.sleep(500);
                BaseClass.reportfoldersection().clickSectionView_Appendices();
                Thread.sleep(1500);

                BaseClass.reportfoldersection().number_of_items_appendix_section();
                Thread.sleep(1000);

        }
        @Test
        public void TR_011_export_appendix_to_report() throws InterruptedException, IOException, ParserConfigurationException, SAXException {



                BaseClass.templatesSection().click_export_content_button();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().change_to_next_tab();
                Thread.sleep(1500);
                BaseClass.staging5().mark_all_notifications_as_read();
                Thread.sleep(1000);
                //export pca report into medium priority report
                BaseClass.templatesSection().click_export_to_single_template_button();
                Thread.sleep(1000);
                BaseClass.templatesSection().enter_export_to_report_field();
                Thread.sleep(1000);
                BaseClass.templatesSection().click_first_target_report_dropdown_link();
                Thread.sleep(1000);
                BaseClass.templatesSection().click_export_appendix_items();
                Thread.sleep(1000);
                BaseClass.templatesSection().click_export_now_button();
                Thread.sleep(8000);
                WebDriver driver = getDriver();

                driver.navigate().refresh();
                Thread.sleep(8000);
                BaseClass.staging5().verify_active_notification_button();
                Thread.sleep(1000);
                BaseClass.staging5().click_active_notification_button();
                Thread.sleep(1000);
                BaseClass.staging5().confirm_export_3_unread_notification();
                Thread.sleep(1000);
                BaseClass.staging5().mark_all_as_read();
//        Thread.sleep(500);
//        BaseClass.templatesSection().verify_export_completed();
                Thread.sleep(1000);


                driver.close();
                Thread.sleep(500);
                BaseClass.reportfoldersection().change_to_default_tab();
                Thread.sleep(1000);
//
                //Go into to QA Automation Parent folder
                BaseClass.reportfoldersection().clickReportsTab();
                BaseClass.reportfoldersection().enterSearchField_QA_Report();
                Thread.sleep(3500);
                BaseClass.reportfoldersection().clickReportsFirstLink();
                Thread.sleep(500);
                //Go into to medium priority Project Folder
                BaseClass.projectFolderSection().click_medium_priority_ProjectFolderLink();
                Thread.sleep(500);
                BaseClass.reportfoldersection().clickReportsFirstLink();
                Thread.sleep(2000);
                BaseClass.templatesSection().verify_appendix_sections_exported();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().clickSectionView_Appendices();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().number_of_items_appendix_section();
                Thread.sleep(2000);


        }
        @Test
        public void TR_012_Report_tag_matrix_features() throws InterruptedException, IOException, ParserConfigurationException, SAXException{
                WebDriver driver = getDriver();
                if (baseUrl.contains("staging5")) {
                        driver.navigate().to("https://staging5.openquire.com/projects/327971/report_tags");
                        Thread.sleep(2000);
                } else if (baseUrl.contains("staging3")) {
                        driver.navigate().to("https://staging3.openquire.com/projects/601010/report_tags");
                        Thread.sleep(2000);
                }
                //enter account manager name
                BaseClass.staging5().click_reportTagMatrix_first_cell();
                Thread.sleep(500);

                BaseClass.staging5().enter_pca_portfolio_project_name_textBox();
                Thread.sleep(500);

                BaseClass.templatesSection().verify_alertMessage_reportTag();
                Thread.sleep(500);

                BaseClass.staging5().right_click_reportTagMatrix_first_cell();

                Thread.sleep(500);
                BaseClass.staging5().click_copy_data_across_rows_button();
                Thread.sleep(500);
                BaseClass.staging5().click_confirm_button();
                Thread.sleep(1500);
                BaseClass.staging5().capture_copy_data_confirmation_text();
                Thread.sleep(500);
                BaseClass.staging5().click_ok_button();
                Thread.sleep(500);
                BaseClass.staging5().confirm_copied_reportTagMatrix_cells_are_the_same();
                Thread.sleep(500);

        }
        @Test
        public void TR_013_Portfolio_features() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
                WebDriver driver = getDriver();
                if (baseUrl.contains("staging5")) {
                        driver.navigate().to("https://staging5.openquire.com/portfolios/4699");
                        Thread.sleep(2000);
                } else if (baseUrl.contains("staging3")) {
                        driver.navigate().to("https://staging3.openquire.com/portfolios/9299");
                        Thread.sleep(2000);
                }

                //change to aggregated cost view
                BaseClass.staging5().click_change_porfolio_view_button();
                Thread.sleep(1000);
                BaseClass.staging5().select_porfolio_view_aggregated();
                Thread.sleep(500);
                BaseClass.staging5().click_save_button();
                Thread.sleep(1500);

                //capture current cells under project name
                BaseClass.staging5().capture_pca_portfolio_project_name_cells();
                Thread.sleep(500);

                //click project name cell, then enter qa_timeofsystem
                BaseClass.staging5().click_pca_portfolio_project_name_cell();
                Thread.sleep(500);
                BaseClass.staging5().enter_pca_portfolio_project_name_textBox();
                Thread.sleep(500);
                //right click project name cell, copy data across, click confirm button, capture confirmation text, click ok
                BaseClass.staging5().right_click_pca_portfolio_project_name_cell();
                Thread.sleep(500);
                BaseClass.staging5().click_copy_data_across_rows_button();
                Thread.sleep(500);
                BaseClass.staging5().click_confirm_button();
                Thread.sleep(1500);
                BaseClass.staging5().capture_copy_data_confirmation_text();
                Thread.sleep(500);
                BaseClass.staging5().click_ok_button();
                Thread.sleep(500);

                //capture and confirm copied cells in table
                BaseClass.staging5().confirm_copied_pca_portfolio_project_name_cells();
                Thread.sleep(1000);

                //click undo button, capture alert, capture column data
                BaseClass.staging5().click_undo_button();
                Thread.sleep(500);
                BaseClass.staging5().captureAlertMessage();
                Thread.sleep(500);
                BaseClass.staging5().capture_pca_portfolio_project_name_cells();
                Thread.sleep(500);

                //expoty excel and pdf
                BaseClass.staging5().click_export_to_excel_fm1105();
                Thread.sleep(500);
                BaseClass.templatesSection().captureAlertMessage();
                Thread.sleep(500);
                BaseClass.staging5().click_cancel_alert_message();
                Thread.sleep(500);
                BaseClass.staging5().click_export_pdf_button();
                Thread.sleep(500);
                BaseClass.templatesSection().captureAlertMessage();
                Thread.sleep(500);
                BaseClass.staging5().click_cancel_alert_message();
                Thread.sleep(7000);
                driver.navigate().refresh();
                Thread.sleep(5000);

//click notification icon and click first link, and open new tab with link
                BaseClass.staging5().click_active_notification_button();
                Thread.sleep(500);
                // BaseClass.staging5().mark_all_as_read();
                // Thread.sleep(1000);
                BaseClass.staging5().open_pca_portfolio_pdf_notification_link();
                //  BaseClass.reportfoldersection().change_to_next_tab();
                Thread.sleep(1000);
                BaseClass.staging5().verify_portfolio_from_PDF();
                Thread.sleep(500);
                //navigate back to original page
                driver.navigate().back();
                Thread.sleep(500);
        }

        @Test
        public void TR_014_proj_summary_table() throws InterruptedException, IOException {

                BaseClass.reportfoldersection().clickReportsTab();
                BaseClass.reportfoldersection().enterSearchField_QA_Report();
                Thread.sleep(4500);
                BaseClass.reportfoldersection().clickReportsFirstLink();
                Thread.sleep(1000);
                BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();
                Thread.sleep(1000);
                //cloned fm 1104 report
                BaseClass.reportfoldersection().clickReportSecondLink();
                Thread.sleep(1000);


                BaseClass.staging5().click_project_summary_sectionView();
                Thread.sleep(1000);

                BaseClass.staging5().click_section_row_editor_projectSummary();
                Thread.sleep(1000);
                BaseClass.ck5editor().enter_proj_summary_text_body();
                Thread.sleep(500);
                // click out of section, capture report tag text
                BaseClass.staging5().click_out_of_section();
                Thread.sleep(500);

                BaseClass.staging5().enter_introPage_title_field();
                Thread.sleep(1000);


                BaseClass.staging5().click_section_row_editor_projectSummary();
                BaseClass.ck5editor().click_report_link_icon_ck5();
                BaseClass.staging5().click_link_updated_project_summary_to_section();
                BaseClass.staging5().click_save_button();
                Thread.sleep(1000);

                BaseClass.staging5().click_out_of_section();
                Thread.sleep(500);

                BaseClass.staging5().verify_sectionLink_isVisible();
                Thread.sleep(1000);



                //quick preview button in next tab
                BaseClass.reportfoldersection().click_quick_preview_button();
                Thread.sleep(1000);
                BaseClass.reportfoldersection().change_to_next_tab();
                Thread.sleep(2000);

                //quick preview tab - capture project summary linked section, updated title, checkmark, default section
                BaseClass.reportfoldersection().verify_quick_preview_projectSummary();
                Thread.sleep(500);
                WebDriver driver = getDriver();
//close second tab and go back to default tab
                driver.close();
                Thread.sleep(500);
                BaseClass.reportfoldersection().change_to_default_tab();

                Thread.sleep(500);
//generate pdf and capture alert message
                BaseClass.reportfoldersection().clickGeneratePDFButton();
                Thread.sleep(500);
                BaseClass.reportfoldersection().captureAlertMessage();
                Thread.sleep(3000);
                //capture and click generated pdf

                BaseClass.reportfoldersection().captureGeneratedPDF_text();
//
                Thread.sleep(2000);


                BaseClass.staging5().click_export_to_excel_fm1105();
                //  Thread.sleep(500);
                BaseClass.templatesSection().verify_excel_AlertMessage();
                Thread.sleep(500);
                BaseClass.staging5().click_cancel_alert_message();
                Thread.sleep(500);
                BaseClass.staging5().click_export_pdf_button();
                BaseClass.templatesSection().verify_PDF_AlertMessage();
                Thread.sleep(500);

                BaseClass.staging5().click_project_summary_sectionView();
                Thread.sleep(1000);
                BaseClass.staging5().click_section_row_editor_projectSummary();
                Thread.sleep(1000);

                BaseClass.ck5editor().select_all_text_projSummary_section_body();
                Thread.sleep(500);
                BaseClass.ck5editor().click_comment_icon_ck5();
                Thread.sleep(1000);
                BaseClass.ck5editor().verify_comment_highlight_is_Visible();
                Thread.sleep(1000);
                BaseClass.ck5editor().enter_comments_to_field();
                Thread.sleep(1000);
                BaseClass.ck5editor().update_comments_in_field();
                Thread.sleep(1000);
                //verify yellow comments bubble says 1
                //NOT WORKING AS OF NOW 9_16_24 -
                // 10/16/24 - Working
                BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
                //   BaseClass.staging5().verify_if_comments_icon_isActive();
                Thread.sleep(1000);
                BaseClass.ck5editor().click_comments_resolve_button();
                Thread.sleep(1000);

                //        //NOT WORKING AS OF NOW 9_16_24
                BaseClass.ck5editor().verify_resolved_2_comment_is_Visible();
                Thread.sleep(1000);
                //no comments archive button anymore 10-16-24
                BaseClass.ck5editor().click_and_verify_comments_archive_icon();
                Thread.sleep(1000);
                BaseClass.ck5editor().update_comments_in_field();
                Thread.sleep(1000);
                // NEED VERIFICATION STEPS
                BaseClass.ck5editor().reopen_archived_comment_discussion();
                Thread.sleep(1000);
                //NOT WORKING AS OF NOW 9_16_24
                BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
                // Thread.sleep(1000);

                BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
                BaseClass.templatesSection().captureAlertMessage();
                Thread.sleep(1000);
                BaseClass.staging5().verify_intro_pages_blue_marked_complete_icon_is_Visible();
                Thread.sleep(500);


                BaseClass.templatesSection().clickdeleteToTrash();
                Thread.sleep(500);
                BaseClass.templatesSection().verify_alertMessage_deleteItem();
                Thread.sleep(1000);
                BaseClass.staging5().click_view_trash_button();
                Thread.sleep(500);


                //restore recent 2 deleted items (appendices)
                BaseClass.staging5().click_restore_first_deleted_item();
                Thread.sleep(500);
                BaseClass.templatesSection().verify_alertMessage_item_restored();
                Thread.sleep(500);


                //go back and refresh
                driver.navigate().back();
                Thread.sleep(500);
                driver.navigate().refresh();
                Thread.sleep(500);

                //export to pef checkbox options
                BaseClass.staging5().hover_and_click_project_summary_sectionView_checkbox();
                Thread.sleep(500);
                BaseClass.staging5().click_sectionView_export();
                Thread.sleep(500);

                BaseClass.staging5().click_sectionView_export_to_word_button();
                Thread.sleep(500);

                BaseClass.staging5().verify_export_to_word_message();
                Thread.sleep(500);

                BaseClass.staging5().click_export_sections_button();
                Thread.sleep(500);
                BaseClass.templatesSection().verify_alertMessage_submitted_for_request();
                Thread.sleep(500);
                BaseClass.staging5().click_cancel_alert_message();
                Thread.sleep(500);








//        //turn on spell check and fix all issues
//        BaseClass.staging5().click_and_capture_spell_check_button();
//        Thread.sleep(5000);
//        BaseClass.staging5().capture_spellCheck_error_sections();
//        Thread.sleep(1500);
//
//        BaseClass.staging5().fix_all_spellCheck_errors();
//        Thread.sleep(1000);

        }

        @Test
        public void TR_015_libraries_ST_dropdown_valuese() throws InterruptedException, IOException {

                BaseClass.staging5().clickLibrariesTab();
                BaseClass.staging5().click_librariesTab_smartTableValues_Dropdown();
                Thread.sleep(500);
                BaseClass.staging5().click_export_to_excel();
                Thread.sleep(500);
                BaseClass.templatesSection().verify_excel_AlertMessage();
                Thread.sleep(10000);
                BaseClass.staging5().click_active_notification_button();
                Thread.sleep(500);
                BaseClass.staging5().verify_ST_dropdownvalue_excel_file_generated();
                Thread.sleep(500);


        }

        @Test
        public void TR_016_libraries_CostRecommendation() throws InterruptedException, IOException {

                BaseClass.staging5().clickLibrariesTab();
                BaseClass.staging5().click_librariesTab_costRec_Dropdown();
                Thread.sleep(500);
                BaseClass.staging5().click_export_to_excel();
                Thread.sleep(500);

                BaseClass.templatesSection().verify_excel_AlertMessage();
                BaseClass.staging5().click_filter_by_labels_search_field();
                Thread.sleep(500);
                BaseClass.staging5().click_filter_by_labels_first_dropdown();
                Thread.sleep(1500);
                BaseClass.staging5().click_filter_by_labels_alan_dropdown();
                Thread.sleep(500);
                BaseClass.pca_xml_section().clickSearchField();
                Thread.sleep(500);
                BaseClass.staging5().verify_filter_has_0_results();
                Thread.sleep(500);
                BaseClass.staging5().click_remove_first_label();
                Thread.sleep(500);
                BaseClass.pca_xml_section().clickSearchField();
                Thread.sleep(500);
                BaseClass.staging5().verify_cost_rec_alan_label_587();
                BaseClass.staging5().verify_cost_rec_alan_label_name();

                Thread.sleep(500);

                //remove label and search
                BaseClass.staging5().click_remove_first_label();
                Thread.sleep(500);
                BaseClass.staging5().enter_587_cost_rec_searchField();
                Thread.sleep(500);
                BaseClass.staging5().verify_cost_rec_alan_label_587();
                Thread.sleep(500);



                BaseClass.staging5().click_active_notification_button();
                Thread.sleep(500);

                BaseClass.staging5().verify_ST_dropdownvalue_excel_file_generated();
                Thread.sleep(500);


        }
        @Test
        public void TR_017_Atlas_admin_permissions() throws InterruptedException, IOException {

//log out current user, log into sysadmin atlas
                BaseClass.staging5().clickUserProfileTab();
                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
                BaseClass.quireLogin().enterEmail_sysadmin_atlas();
                BaseClass.quireLogin().enterPassword();
                Thread.sleep(1000);
                BaseClass.quireLogin().clickLogin();
                Thread.sleep(500);
                BaseClass.staging5().click_modal_close_window();
                Thread.sleep(500);

                //click templates tab, create new template button, verify it exists, then cancel
                BaseClass.templatesSection().clickTemplatesTab();
                Thread.sleep(500);

                BaseClass.templatesSection().clickAddTemplateButton();
                Thread.sleep(2000);

                BaseClass.templatesSection().verify_NewTemplateModal_isVisible();
                Thread.sleep(500);

                BaseClass.templatesSection().clickCancel();
                Thread.sleep(500);

                //click first template in templates tab and click manage collaborators
                BaseClass.reportfoldersection().clickReportsFirstLink();
                Thread.sleep(1000);
                BaseClass.templatesSection().click_manage_collaborators_button();
                Thread.sleep(1000);


                //hover and click first arrow button unassigned package...save
                BaseClass.staging5().hover_unassigned__dropdown_value();
                Thread.sleep(800);
                BaseClass.staging5().click_unassigned_items_right_arrow();
                Thread.sleep(1000);
                BaseClass.pca_xml_section().getTemplatesPackagesList();
                Thread.sleep(1000);
                BaseClass.staging5().click_save_button();
                Thread.sleep(500);
                BaseClass.reportfoldersection().captureAlertMessage();
                Thread.sleep(500);

                //remove assigned first package hovering over checkbox
                BaseClass.templatesSection().click_manage_collaborators_button();
                Thread.sleep(1000);
                BaseClass.pca_xml_section().hover_assigned_packages_first_item();
                Thread.sleep(500);
                BaseClass.pca_xml_section().click_cancel_button_first_assigned_package_button();
                Thread.sleep(1000);
                BaseClass.pca_xml_section().getTemplatesPackagesList();
                Thread.sleep(500);
                BaseClass.staging5().click_save_button();
                Thread.sleep(500);
                BaseClass.reportfoldersection().captureAlertMessage();
                Thread.sleep(500);


                //log out current user, log into admin atlas
                BaseClass.staging5().clickUserProfileTab();
                Thread.sleep(500);
                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
                BaseClass.quireLogin().enterEmail_admin_atlas();
                BaseClass.quireLogin().enterPassword();
                Thread.sleep(1000);
                BaseClass.quireLogin().clickLogin();
                Thread.sleep(500);
                BaseClass.staging5().click_modal_close_window();
                Thread.sleep(500);


                //verify unable to click templates tab
                BaseClass.templatesSection().clickTemplatesTab();
                Thread.sleep(500);
                BaseClass.templatesSection().verify_add_template_button_locked();
                Thread.sleep(500);

                //verify unable to click edit labels tab
                BaseClass.templatesSection().verify_edit_labels_button_locked();
                Thread.sleep(500);

                //go to company users
                BaseClass.staging5().clickUsersTab();
                Thread.sleep(500);
                BaseClass.staging5().click_usersTab_companyUsers_dropdownItem();
                Thread.sleep(1000);

                //find QA Dumnmy user
                BaseClass.reportfoldersection().enterSearchField_QA_companyUser();
                Thread.sleep(3000);
                BaseClass.staging5().click_qa_dummy_user_link();
                Thread.sleep(500);
                BaseClass.staging5().verify_locked_companyUser_fields();
                Thread.sleep(500);
                BaseClass.staging5().select_company_user_status();
                Thread.sleep(500);
                BaseClass.staging5().clickSave();
                Thread.sleep(500);
                BaseClass.staging5().captureAlertMessage();

        }


}


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







