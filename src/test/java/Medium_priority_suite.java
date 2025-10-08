import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import reusableLibrary.ReusableAnnotations;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Medium_priority_suite extends ReusableAnnotations {

//	WebDriver driver = getDriver();
@Test
public void TR001_user_login() throws InterruptedException {
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
        BaseClass.quireLogin().enter_admin_Email();
    }

    Thread.sleep(1000);
    BaseClass.quireLogin().enterPassword();
    Thread.sleep(1000);
    BaseClass.quireLogin().clickLogin();
    Thread.sleep(3000);
    //   } else {
    //       System.out.println("\n" + "Already logged in. Skipping login steps.");
    //      Thread.sleep(3000);
    //  }

    BaseClass.staging5().captureURL();
    Thread.sleep(2000);
}
    @Test
    public void TR_001a_create_proj_folder() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(5500);
        BaseClass.reportfoldersection().clickReportsFirstLink();


        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        BaseClass.projectFolderSection().enterProjectFolderNameField_Medium();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        Thread.sleep(2000);
//  BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
//  Thread.sleep(2000);
//  BaseClass.projectFolderSection().click_PCA_Template_projectFolder_templatesTab();
//  Thread.sleep(500);
//  BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
//  Thread.sleep(2000);
//  BaseClass.projectFolderSection().clickSave();
//  Thread.sleep(6000);
//  BaseClass.projectFolderSection().click_PCA_ProjectFolderLink();
//  Thread.sleep(2000);
//
//  BaseClass.reportfoldersection().clickAddReportButton();
//
//  BaseClass.reportfoldersection().enterReportName_QA_PCA_Field();
//  BaseClass.reportfoldersection().enterReportDescriptionField();
//  BaseClass.reportfoldersection().clickReport_TemplateDropdown();
//  Thread.sleep(1500);
//  BaseClass.reportfoldersection().clickDropdownItem();
//  Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        //Thread.sleep(3000);
//
//
        BaseClass.templatesSection().captureAlertMessage();
//  BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(1000);


    }

    @Test
    public void TR_002_create_template_from_word() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddTemplateButton();
        Thread.sleep(500);
        BaseClass.templatesSection().enterTemplateNameField_medium_priority();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(1000);
        BaseClass.templatesSection().click_import_from_word_template_checkbox();
        Thread.sleep(1000);
        BaseClass.templatesSection().upload_word_file();
        Thread.sleep(4000);
        BaseClass.templatesSection().enterTemplateDescriptionField();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave();
        Thread.sleep(4000);
        BaseClass.templatesSection().captureAlertMessage();
        BaseClass.templatesSection().clickHereLinkTemplate();
        Thread.sleep(2000);
    }

    @Test
    public void TR_003_assign_template_to_project() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        BaseClass.templatesSection().click_assign_to_projects_button();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_Medium_projFolder_to_template();
        //hover and click first arrow button unassigned package
        BaseClass.staging5().hover_unassigned__dropdown_value();
        Thread.sleep(800);
        BaseClass.staging5().click_unassigned_items_right_arrow();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().getTemplatesPackagesList();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1500);
    }

    @Test
    public void TR_003a_manage_report_tag() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
        Thread.sleep(500);
        BaseClass.reporttagssection().click_ReportTags_manage_settings_icon();
        Thread.sleep(1000);
        BaseClass.reporttagssection().verify_ReportTags_settings_view_isVisible();
        Thread.sleep(500);
        BaseClass.staging5().clickCancel();
        Thread.sleep(1000);


    }
    @Test
    public void TR_003b_create_mediumPriority_report() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        //Go into to QA Automation Parent folder
        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(3500);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(500);

        //Go into to medium priority Project Folder
        BaseClass.projectFolderSection().click_medium_priority_ProjectFolderLink();
        Thread.sleep(500);

        //add medium priority report

        BaseClass.reportfoldersection().clickAddReportButton();
        Thread.sleep(500);
        BaseClass.reportfoldersection().enterReportName_QA_Medium_Priority_Report_Field();
        BaseClass.reportfoldersection().enterReportDescriptionField();
        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
        Thread.sleep(1500);
        BaseClass.reportfoldersection().clickDropdownItem();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(3000);
        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(1000);



    }

    @Test
    public void TR_004_disable_template_enable() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        //go into medium priority template
        BaseClass.templatesSection().clickTemplatesTab();
        BaseClass.templatesSection().enterTemplateSearchField_medium();
        BaseClass.pca_xml_section().clickFirstTemplateLink();

//go to template settings and disable template
        BaseClass.templatesSection().clickTemplateSettingsButton();
        Thread.sleep(500);
        BaseClass.templatesSection().click_templateSettings_detailsTab();
        Thread.sleep(800);
        BaseClass.templatesSection().click_templateSettings_disabled_checkbox();
        Thread.sleep(800);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(800);

        //go to templates section and go into disabled templates , and re-enable template
        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(500);
        BaseClass.templatesSection().click_view_disabled_templates_button();
        Thread.sleep(1500);
        BaseClass.pca_xml_section().clickFirstTemplateLink();
        Thread.sleep(1500);
        BaseClass.templatesSection().clickTemplateSettingsButton();
        Thread.sleep(500);
        BaseClass.templatesSection().click_templateSettings_detailsTab();
        Thread.sleep(800);
        BaseClass.templatesSection().click_templateSettings_disabled_checkbox();
        Thread.sleep(800);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);
    }

    @Test
    public void TR_005_change_template_name_description() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        BaseClass.templatesSection().clickTemplateSettingsButton();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_new_TemplateNameField_medium_priority();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_new_TemplateDescriptionField();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_new_TemplateName_warningMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1500);
    }

    @Test
    public void TR_006_templates_pdf_file_name_format() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        //click text box
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(1000);
        //click report tag icon, switch frame to dropdown, click dropdown, go back to parent frame

        BaseClass.ck5editor().click_report_tag_icon_ck5();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_reportTag_dropDownItem_ck5_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();
        Thread.sleep(500);

        BaseClass.staging5().enter_email_ReportTagField();
        Thread.sleep(500);

        BaseClass.templatesSection().double_click_report_tag_iframe();
        // in yellow report tag, enter text, test@quiretest.com
        BaseClass.staging5().enter_email_ReportTagField();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);


        BaseClass.templatesSection().clickTemplateSettingsButton();
        Thread.sleep(500);
        BaseClass.templatesSection().click_pdf_file_name_format_dropdown();
        Thread.sleep(500);
        BaseClass.templatesSection().click_custom_format_dropdown_value();
        Thread.sleep(500);
        BaseClass.templatesSection().click_insert_reportTag_dropdown_button();
        Thread.sleep(500);

        BaseClass.templatesSection().enter_pdf_file_name_textField();
        Thread.sleep(500);
        BaseClass.templatesSection().click_reportTag_dropdown_value();
        Thread.sleep(500);
        BaseClass.templatesSection().click_insert_variable_dropdown_button();
        Thread.sleep(500);
        BaseClass.templatesSection().click_variable_dropdown_date_value();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().clickGeneratePDFButton();
//        Thread.sleep(400);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(3000);
//        BaseClass.reportfoldersection().captureGeneratedPDF_text();
        Thread.sleep(1000);
    }

    @Test
    public void TR_006a_Headers_Footers() throws InterruptedException, IOException {
//not adding in report, doing to template

//                BaseClass.reportfoldersection().clickReportsTab();
//        BaseClass.reportfoldersection().enterSearchField_QA_Report();
//        Thread.sleep(4500);
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(1000);
//        BaseClass.projectFolderSection().click_projectFolderLink_MediumPriority();
//        Thread.sleep(1000);
//        BaseClass.reportfoldersection().clickReportsFirstLink();


//        //in proj folder, click add new report button
//        BaseClass.reportfoldersection().clickAddReportButton();
//        //new report name and info
//        BaseClass.reportfoldersection().enterReportName_QA_Medium_Priority_Report_Field();
//
//        BaseClass.reportfoldersection().enterReportDescriptionField();
//        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
//        Thread.sleep(2500);
//        BaseClass.reportfoldersection().clickDropdownItem();
//        Thread.sleep(1000);
//        BaseClass.reportfoldersection().clickSave();
//        Thread.sleep(3000);
////capture alert message fore template created
//        BaseClass.templatesSection().capture_created_AlertMessage();
//        BaseClass.templatesSection().clickHereLinkReport();
//        Thread.sleep(3000);

        //click template settings button
   BaseClass.templatesSection().clickTemplateSettingsButton();


        //click header tab
        BaseClass.reportfoldersection().clickHeaderTab_ReportSettings();
        Thread.sleep(500);
//left header textbox - insert report tag
        BaseClass.reportfoldersection().click_left_header_textBox_ReportSettings();
        Thread.sleep(500);
        BaseClass.reportfoldersection().select_header_reportTag_ReportSettings();
        Thread.sleep(500);
//center header textbox - insert month variable tag
        BaseClass.reportfoldersection().click_center_header_textBox_ReportSettings();
        Thread.sleep(500);
        BaseClass.reportfoldersection().select_month_variable_dropdown_ReportSettings();
        Thread.sleep(500);
        //right header textbox - insert text
        BaseClass.reportfoldersection().enter_right_header_textBox_ReportSettings();
        Thread.sleep(500);

        //click footer tab
        BaseClass.reportfoldersection().clickfooterTab_ReportSettings();
        Thread.sleep(500);
//left footer textbox - insert report tag
        BaseClass.reportfoldersection().click_left_footer_textBox_ReportSettings();
        Thread.sleep(500);
        BaseClass.reportfoldersection().select_footer_reportTag_ReportSettings();
        Thread.sleep(500);
//center footer textbox - insert year variable tag
        BaseClass.reportfoldersection().click_center_footer_textBox_ReportSettings();
        Thread.sleep(500);
        BaseClass.reportfoldersection().select_year_variable_dropdown_ReportSettings();
        Thread.sleep(500);
        //right footer textbox - insert text

        BaseClass.reportfoldersection().enter_right_footer_textBox_ReportSettings();
        Thread.sleep(500);
        //click s ave button
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);

        //quick preview button in next tab
        BaseClass.reportfoldersection().click_quick_preview_button();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(500);

        //quick preview tab - capture header and footer data
        BaseClass.reportfoldersection().verify_header_section_quickPreview();
        Thread.sleep(500);
        BaseClass.reportfoldersection().verify_footer_section_quickPreview();
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
//        BaseClass.reportfoldersection().click_GeneratedPDF_button();
        Thread.sleep(2000);

       //  BaseClass.reportfoldersection().open_GeneratedPDF_button();
//        //switch to next tab and capture url
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        BaseClass.staging5().captureURL();
//        Thread.sleep(1500);
//verify if header and footer has contents expected
        BaseClass.staging5().verify_header_footer_PDF_contents();
         Thread.sleep(500);
        //close second tab and go to default tab
//        driver.close();
//         Thread.sleep(500);
//         BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(2000);


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
//        Thread.sleep(500);

    }
    @Test
    public void TR_007_delete_restore_template() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        BaseClass.templatesSection().  clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(1000);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);

        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);
        BaseClass.staging5().click_userProfileTab_viewTrash_dropdownItem();
        Thread.sleep(6000);
        BaseClass.pca_xml_section().click_restore_updated_medium_template_link();
       // Thread.sleep(500);
       // BaseClass.staging5().captureAlertMessage();
        Thread.sleep(4000);

        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().capture_unread_notification();
        Thread.sleep(500);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);

        BaseClass.staging5().mark_all_notifications_as_read();
        Thread.sleep(1000);

    }
    @Test
    public void TR_008_export_templates() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        BaseClass.templatesSection().clickTemplatesTab();
//  Thread.sleep(500);
//  BaseClass.staging5().mark_all_notifications_as_read();
//  Thread.sleep(500);
        BaseClass.staging5().click_export_to_excel();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().capture_unread_notification();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(2500);

    }

    @Test
    public void TR_009_export_wb_to_template() throws InterruptedException, IOException, ParserConfigurationException, SAXException {

        //go into medium priority template
        BaseClass.templatesSection().clickTemplatesTab();
        BaseClass.templatesSection().enterTemplateSearchField_updated_medium();
        BaseClass.pca_xml_section().clickFirstTemplateLink();
        //assign WB item
        BaseClass.staging5().click_wordbank_grey_icon();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().click_recent_row_item_wordBank();
        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(1000);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);

        //clone medium priority template
        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddTemplateButton();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_TemplateNameField_cloned_medium_priority();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(500);
        BaseClass.templatesSection().click_clone_template_dropdown();
        Thread.sleep(500);
        BaseClass.templatesSection().click_clone_updated_template_mediumPriority();
        Thread.sleep(500);
        BaseClass.templatesSection().enterTemplateDescriptionField();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave();
        Thread.sleep(1000);
        BaseClass.templatesSection().capture_created_AlertMessage();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(2000);

        //go into cloned medium priority template, and add another WB item

        //assign WB item
        BaseClass.staging5().click_wordbank_grey_icon();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().click_recent_row_item_wordBank();
        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().getTemplatesPackagesList();
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);

//export cloned template with 2 wb items into original template with 1 wb item
        BaseClass.templatesSection().click_export_content_button();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(1000);
        BaseClass.staging5().mark_all_notifications_as_read();
        Thread.sleep(1000);

        BaseClass.templatesSection().click_export_to_single_template_button();
        Thread.sleep(1000);
        BaseClass.templatesSection().click_target_export_template_dropdown_arrow();
        Thread.sleep(1000);
        BaseClass.templatesSection().click_medium_priority_updated_dropdownValue_export();
        Thread.sleep(2000);
        BaseClass.templatesSection().click_export_default_section_title_1();
        Thread.sleep(1000);
        BaseClass.templatesSection().click_export_now_button();
        Thread.sleep(10000);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(5000);

        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(1000);
        BaseClass.staging5().confirm_export_1_unread_notification();
        Thread.sleep(1000);
        BaseClass.staging5().mark_all_as_read();
        Thread.sleep(500);
        driver.navigate().refresh();
//        BaseClass.templatesSection().verify_export_completed();
        Thread.sleep(1000);
//        BaseClass.templatesSection().click_start_another_export_button();
//        Thread.sleep(2000);

        //export cloned template with 2 wb items into other report
        BaseClass.templatesSection().click_export_to_single_template_button();
        Thread.sleep(1000);
        BaseClass.templatesSection().enter_export_to_report_field();
        Thread.sleep(1000);
        BaseClass.templatesSection().click_first_target_report_dropdown_link();
        Thread.sleep(1000);
        BaseClass.templatesSection().click_export_default_section_title_1();
        Thread.sleep(1000);
        BaseClass.templatesSection().click_export_now_button();
        Thread.sleep(8000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(1000);
        BaseClass.staging5().confirm_export_2_unread_notification();
        Thread.sleep(1000);
        BaseClass.staging5().mark_all_as_read();
        Thread.sleep(500);
        driver.close();

//        BaseClass.templatesSection().verify_export_completed();
//        Thread.sleep(1000);

        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(1000);



        //go to original template and verify there are 2 wb items
        //go into medium priority template
        BaseClass.templatesSection().clickTemplatesTab();
        BaseClass.templatesSection().enterTemplateSearchField_updated_medium();
        Thread.sleep(2000);

        BaseClass.pca_xml_section().clickFirstTemplateLink();
        // WB item
        BaseClass.staging5().click_wordbank_grey_icon();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().getTemplatesPackagesList();
        BaseClass.templatesSection().verify_exported_wb_item();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);

        //go to medium priority report  and verify there are 2 wb items
        //go into medium priority report
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
        Thread.sleep(1000);

        // verify WB item in word
        BaseClass.staging5().click_insert_word_bank_blue_icon();
        Thread.sleep(1000);
        BaseClass.templatesSection().verify_exported_wb_item();
        Thread.sleep(1000);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(2000);

    }

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

        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//enter root user
        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        if (baseUrl.contains("app")) {
            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
        }
        else if (baseUrl.contains("staging3")) {
            driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
        }
        else  {
            driver.navigate().to(baseUrl + "companies/253/company_features");
        }

        BaseClass.staging5().scroll_and_click_unregister_HOT14_feature();


        //log back in as admin

      //  WebDriver driver = getDriver();

        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//enter root user
        BaseClass.quireLogin().enter_admin_Email();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);


        Thread.sleep(500);
        if (baseUrl.contains("staging5")) {
            driver.navigate().to("https://staging5.openquire.com/projects/327971/report_tags");
            Thread.sleep(2000);
        } else if (baseUrl.contains("staging3")) {
            driver.navigate().to("https://staging3.openquire.com/projects/601010/report_tags");
            Thread.sleep(2000);
        } else  {
            driver.navigate().to(baseUrl + "projects/654503/report_tags");
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
     driver.navigate().to("https://staging3.openquire.com/portfolios/9301");
     Thread.sleep(2000);
 }
 else  {
     driver.navigate().to(baseUrl   +"portfolios/10393");
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
     //   WebDriver driver = getDriver();

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
        BaseClass.reportfoldersection().click_fm_1104_report_link();
        Thread.sleep(1500);


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
        BaseClass.reportfoldersection().clickRegeneratePDFButton();
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
        Thread.sleep(3000);
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
    public void TR_017_Wordbank_settings() throws InterruptedException {
        WebDriver driver = getDriver();
        BaseClass.staging5().clickLibrariesTab();
        BaseClass.staging5().click_librariesTab_wordBankDropdown();
        Thread.sleep(500);
        BaseClass.staging5().click_addWordBankItem_button();


        BaseClass.staging5().enter_wordbank_librariesTab_new_title();
        Thread.sleep(900);

        BaseClass.staging5().clickWordBank_label_dropdown_arrow();

        Thread.sleep(400);

        BaseClass.staging5().clickWordBank_label_dropdown_firstLink();
        Thread.sleep(900);


        //add content row
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(400);

        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(400);
        BaseClass.ck5editor().enter_instruction_text_ck5();

//        BaseClass.ck5editor().enter_wb_text_ck5();
        Thread.sleep(400);
        BaseClass.staging5().click_wordBank_add_content_row();
        Thread.sleep(400);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(400);
//        BaseClass.ck5editor().enter_wb_text_ck5();
        BaseClass.ck5editor().enter_instruction_text_ck5();

        Thread.sleep(1000);
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(1000);

        BaseClass.templatesSection().clickSave2();
        Thread.sleep(3000);

        BaseClass.pca_xml_section().clickSearchField();
        Thread.sleep(1000);

        BaseClass.staging5().enter_wb_librariesTab_searchField();
        Thread.sleep(1000);

        BaseClass.staging5().click_filter_by_labels_search_field();
        Thread.sleep(500);
        BaseClass.staging5().click_filter_by_labels_first_dropdown();
        Thread.sleep(500);

        BaseClass.staging5().click_wordBank_libraries_link();
        Thread.sleep(500);

        BaseClass.staging5().click_wordBank_libraries_link();
        Thread.sleep(500);

        BaseClass.ck5editor().verify_wordbank_details_preview_text_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().click_delete_wordbank_item_ck5();
        Thread.sleep(500);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }

    @Test
    public void TR_018_Cloning_ck4_report_in_CK5() throws InterruptedException {
        WebDriver driver = getDriver();
        BaseClass.staging5().navigateTo_automation_report_ck5_HM_folder();
        //create ck5 report folder with ck5 template created

        BaseClass.reportfoldersection().clickAddReportButton();
        Thread.sleep(500);
        BaseClass.reportfoldersection().enterReportName_QA_New_CK4_clone_Field();
        Thread.sleep(500);
        BaseClass.reportfoldersection().enterReportDescriptionField();
        Thread.sleep(500);
        BaseClass.reportfoldersection().click_clone_existing_report_checkbox();
        Thread.sleep(3000);
        BaseClass.reportfoldersection().enter_clone_report_field_ck4report();
        Thread.sleep(2000);
        BaseClass.templatesSection().click_first_target_report_dropdown_link();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(500);
        BaseClass.reportfoldersection().captureAlertMessage();
        Thread.sleep(2000);

        BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(2000);
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.staging5().verify_ck4_editor_toolbar_isVisible();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);
        BaseClass.reportfoldersection().clickReportSettingsButton();
        Thread.sleep(500);
        //   BaseClass.reportfoldersection().clickReportSettingsButton();
        Thread.sleep(500);
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_alertMessage_templateDeleted();
        Thread.sleep(500);

    }

    @Test
    public void TR_018_Atlas_admin_permissions() throws InterruptedException, IOException {

        WebDriver driver = getDriver();
                BaseClass.staging5().clickUserProfileTab();
                Thread.sleep(500);

                BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//enter root user
                BaseClass.quireLogin().enterRootUserEmail();
                BaseClass.quireLogin().enterPassword();
                //Thread.sleep(1000);
                BaseClass.quireLogin().clickLogin();
                Thread.sleep(500);
                BaseClass.staging5().click_modal_close_window();
                Thread.sleep(500);
        if (baseUrl.contains("app")) {
            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
        } else if (baseUrl.contains("staging3")) {
            driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
        }
        else {

                driver.navigate().to(baseUrl + "companies/253/company_features");
        }
        Thread.sleep(1000);
        BaseClass.staging5().add_atlas_feature();
        Thread.sleep(1000);

        BaseClass.staging5().add_company_feature_HOT14();
        Thread.sleep(1000);

//log out current user, log into sysadmin atlas
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        BaseClass.quireLogin().enter_sysadmin_testingInc_email();
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
        BaseClass.quireLogin().enter_admin_Email();
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
        //  WebDriver driver = getDriver();
        driver.navigate().refresh();

        //go to company users
        BaseClass.staging5().clickUsersTab();
        Thread.sleep(500);
        BaseClass.staging5().click_usersTab_companyUsers_dropdownItem();
        Thread.sleep(1000);
        BaseClass.staging5().verify_loading_complete_sideBar();

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

        //remove Atlas feature
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//enter root user
        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        if (baseUrl.contains("app")) {
            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
        } else if (baseUrl.contains("staging3")) {
            driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
        }
        else {

            driver.navigate().to(baseUrl + "companies/253/company_features");
        }
        Thread.sleep(500);

        BaseClass.staging5().scroll_and_click_unregister_atlas_feature();
        Thread.sleep(500);

    }


//    @Test // old with atlas accounts
//    public void TR_017_Atlas_admin_permissions() throws InterruptedException, IOException {
//
////log out current user, log into sysadmin atlas
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        BaseClass.quireLogin().enterEmail_sysadmin_atlas();
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
//        BaseClass.quireLogin().enterEmail_admin_atlas();
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
//        WebDriver driver = getDriver();
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


}
