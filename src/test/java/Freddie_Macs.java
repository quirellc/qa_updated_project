import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;

import java.io.IOException;


public class Freddie_Macs extends ReusableAnnotations {
	//WebDriver driver = getDriver();
    //@BeforeTest
    @Test
    public void TR_001_User_Login() throws InterruptedException {
        WebDriver driver = getDriver();

//        driver.navigate().to("https://staging5.openquire.com/");

        driver.navigate().to("https://staging5.openquire.com");
        String pageTitle = driver.getTitle();

        if (pageTitle.contains("OpenQuire")) {
            BaseClass.quireLogin().enter_admin_Email();
            Thread.sleep(1000);
            //BaseClass.quireLogin().clickNextButton();
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
        } else {
            // The title does not indicate a login page, assume the user is already logged in
            System.out.println("\n" + "Already logged in. Skipping login steps.");
        }
        Thread.sleep(3000);

    }

//    @Test
//    public void TR_002_Global_Search() throws InterruptedException {
////        Thread.sleep(3000);
////
//        BaseClass.staging5().click_report_global_search_field();
//        Thread.sleep(2000);
////        BaseClass.staging5().click_report_global_search_field2();
////        Thread.sleep(2000);
//
//        BaseClass.staging5().enter_report_global_search_field();
//        Thread.sleep(4000);
//        BaseClass.staging5().capture_recent_row_Information();
//        Thread.sleep(500);

//    }

 @Test
    public void TR_002_Freddie_Mac_1104_template() throws InterruptedException {
     BaseClass.templatesSection().clickTemplatesTab();
     Thread.sleep(1000);

     BaseClass.templatesSection().clickAddTemplateButton();
     Thread.sleep(2000);

     BaseClass.templatesSection().enterTemplateNameField_FM_1104();
     Thread.sleep(1000);

     BaseClass.templatesSection().selectTemplateTypeDropdown_FM_1104();
     Thread.sleep(2000);

     BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
     Thread.sleep(1000);
     //   BaseClass.templatesSection().clickTemplateLabel_GeneralOther();

     BaseClass.templatesSection().enterTemplateDescriptionField();
     Thread.sleep(1500);

     BaseClass.templatesSection().clickSave();
     Thread.sleep(1000);


     BaseClass.templatesSection().capture_created_AlertMessage();
     BaseClass.templatesSection().clickHereLinkTemplate();
     //add cover letter and default section 2.0
     Thread.sleep(1500);
 }

    @Test
    public void TR_002a_add_appendix_info_template() throws InterruptedException {

        //add appendix items
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().click_add_appendix_button();

        BaseClass.reportfoldersection().enter_appendix_title();
        BaseClass.reportfoldersection().click_any_appendix_format_checkbox();
        Thread.sleep(500);

        BaseClass.staging5().click_save_button();

        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
        Thread.sleep(1000);

        BaseClass.staging5().upload_header_image();
        Thread.sleep(4500);


        BaseClass.reportfoldersection().enter_appendix_name();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().enter_file_name_appendix();
        Thread.sleep(1000);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);

//        //mark appendix complete
//        BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
//        BaseClass.staging5().captureAlertMessage();


        BaseClass.reportfoldersection().click_delete_appendix_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

    }
    @Test
    public void TR_003_report_Tags_template_FM_1104() throws InterruptedException {

        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        //click text box
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(1000);
        //click report tag icon, switch frame to dropdown, click dropdown, go back to parent frame

        BaseClass.staging5().click_reportTag_icon_ck_modal();
        Thread.sleep(1000);
        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
        BaseClass.staging5().click_reportTag_dropDownItem_ck_modal();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.switchTo().defaultContent();
        Thread.sleep(500);

        //go to text body iframe, double click yellow report tag, go to parent frame
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(500);
        // in yellow report tag, enter text, test@quiretest.com
        BaseClass.staging5().enter_email_ReportTagField();
        Thread.sleep(500);
        // click out of section, capture report tag text
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);


        //go to text body iframe, double click and edit blue report tag
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(500);
        // in blue report tag, enter text, automation_new_test@quiretest.com
        BaseClass.staging5().enter_edited_email_ReportTagField();
        Thread.sleep(500);
        // click out of section, capture edited blue report tag text
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);


        //go to text body iframe, double click and delete text blue report tag
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(500);
        // in blue report tag, select all and delete
        BaseClass.staging5().select_all_and_delete_ReportTagField();
        Thread.sleep(1000);
        //click blue check box to save empty field
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);
        // click out of section, capture edited blue report tag text
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);


        //go to text body iframe, and delete yellow report tag from text
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().select_all_body_and_delete_iFrame();
        Thread.sleep(1000);
        //go back to parent frame
        driver.switchTo().parentFrame();
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(1000);
    }
    @Test
    public void TR_004a_Packages_template_FM1104() throws InterruptedException {

        //go to template
        BaseClass.templatesSection().clickTemplateSettingsButton();
        Thread.sleep(500);
        BaseClass.pca_xml_section().clickTemplatePackagesTab();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().getTemplatesPackagesList();
        Thread.sleep(1000);

        //  click aei package
        BaseClass.pca_xml_section().click_package_ESA();
        Thread.sleep(800);

        //hover and click first arrow button unassigned package
        BaseClass.staging5().hover_unassigned__dropdown_value();
        Thread.sleep(800);
        BaseClass.staging5().click_unassigned_items_right_arrow();
        Thread.sleep(1000);

        BaseClass.pca_xml_section().getTemplatesPackagesList();
        Thread.sleep(1000);

//remove AEI package
        BaseClass.pca_xml_section().click_package_ESA();
        Thread.sleep(500);
        BaseClass.pca_xml_section().click_remove_button();
        Thread.sleep(500);
//remove other package hovering over checkbox
        BaseClass.pca_xml_section().hover_assigned_packages_second_item();
        Thread.sleep(500);
        BaseClass.pca_xml_section().click_cancel_assigned_package_button();

        Thread.sleep(500);

        //add Quire ESA C/A Package for report testing
        BaseClass.staging5().enter_quire_CA_ProjectFolder_Template_SearchField();
        Thread.sleep(500);
        BaseClass.staging5().hover_unassigned__dropdown_value();
        Thread.sleep(800);
        BaseClass.staging5().click_unassigned_items_right_arrow();
        Thread.sleep(1000);

        BaseClass.pca_xml_section().getTemplatesPackagesList();

        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();

        Thread.sleep(1000);


    }
    @Test
    public void TR_004b_intro_sections_FM_1104_template() throws InterruptedException {



      //  BaseClass.pca_xml_section().clickFirstTemplateLink();
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(2000);
        BaseClass.staging5().click_add_projSummary_toSection();
        Thread.sleep(1000);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(1000);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(2000);
        BaseClass.staging5().click_add_conditionAction_toSection();
        Thread.sleep(1500);
        BaseClass.staging5().click_add_execSummary_toSection();
        Thread.sleep(1500);
        BaseClass.staging5().click_add_coverLetter_toSection();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_titlePage_toSection();
        Thread.sleep(1500);


        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);

        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);

        BaseClass.staging5().click_conditionAction_dropdown();
        Thread.sleep(500);

        BaseClass.staging5().click_conditionAction_dropdown_value_HREC();
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.staging5().enter_conditionAction_opinion_field();
        Thread.sleep(500);

        BaseClass.staging5().click_out_of_section();
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.staging5().click_projSummary_sectionView_button();
        Thread.sleep(500);
        BaseClass.staging5().verify_projSummary_details_FM_1104_isVisible();
        Thread.sleep(500);


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
        Thread.sleep(500);

        //quick preview button in next tab
        BaseClass.reportfoldersection().click_quick_preview_button();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(500);
        //quick preview tab - capture header and footer data
        BaseClass.staging5().verify_projSummary_details_FM_1104_isVisible();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        //close second tab and go back to default tab
        driver.close();
        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(1000);







        // click on section II unit details section view
        BaseClass.staging5().click_section_II_unit_details_sectionView();
        Thread.sleep(500);

        BaseClass.staging5().enter_occupied_field_section_II_unit_details();
        BaseClass.staging5().captureAlertMessage();

        Thread.sleep(500);

        BaseClass.staging5().click_section_I_general_details_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().click_section_IV_esa_details_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().click_section_V_repair_details_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().click_section_VI_details();
        Thread.sleep(1000);


        // click on section III property details section view
        BaseClass.staging5().click_section_III_property_details_sectionView();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_cost_recommendation_button();
        Thread.sleep(500);

        BaseClass.staging5().enter_item_name_cost_recommendation();
        Thread.sleep(500);
        BaseClass.staging5().enter_cost_summary_quantity();
        BaseClass.staging5().enter_cost_summary_unit_cost();
        BaseClass.staging5().click_critical_repair_cost_checkbox();
        Thread.sleep(500);
        BaseClass.staging5().enter_cost_summary_comments();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);
        BaseClass.staging5().capture_fm_1104_table_cost_summary();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().clickGeneratePDFButton();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().captureGeneratedPDF_text();
        Thread.sleep(1000);

    }

    @Test
    public void TR_004c_FM1104_report_creation_and_comments() throws InterruptedException {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         //create report for FM 1104
        //Go into to QA Automation Parent folder


        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(3500);

        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(500);


        // create new project folder with  FM 1104 templete created from previous step
        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        BaseClass.projectFolderSection().enterProjectFolderNameField_FM_1104();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdown
        Thread.sleep(2000);
        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(2000);

        BaseClass.projectFolderSection().click_FM_1104_Template_projectFolder_templatesTab();
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(2000);

        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(1000);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(1000);

        BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();

        Thread.sleep(2000);

        // create new FM 1104 report folder inside FM_1104 project folder w  template

        BaseClass.reportfoldersection().clickAddReportButton();
        BaseClass.reportfoldersection().enterReportName_QA_FM_1104_Field();
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

        //comments
        BaseClass.staging5().click_comment_button_icon();
        BaseClass.staging5().enter_comments_to_field();
        BaseClass.staging5().capture_comments_content();
        BaseClass.staging5().click_cancel_button_popup();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(500);

        BaseClass.staging5().verify_if_comments_icon_isActive();
        Thread.sleep(1000);
    }
    @Test
    public void TR_004d_TrackChanges_SpellCheck_unlink_in_SmartTable_FM1104_report() throws InterruptedException, IOException {

        // create comments and verify icon

        //enter text to section 2.0 - wrong grammar
      //  BaseClass.staging5().click_Section2_row_editor();

        BaseClass.staging5().click_and_capture_spell_check_button();
        Thread.sleep(2000);
        //insert track changes
        BaseClass.staging5().click_and_capture_track_changes_button();
        Thread.sleep(1500);


        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(1500);
        BaseClass.staging5().click_add_section_toSection();
        Thread.sleep(1000);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);


        //enter section 2.0 , wrong spelling
        BaseClass.staging5().click_Section2_row_editor();
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        BaseClass.templatesSection().enter_spellCheck_text_iFrame();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.switchTo().defaultContent();
        Thread.sleep(500);
        BaseClass.staging5().click_accept_change_icon_ck5();

        //second default  section - add smart table
        BaseClass.staging5().click_default_section_2();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_smartTable_toSection();
        Thread.sleep(1000);
        BaseClass.smartTables().click_add_column_button_smartTable();
        Thread.sleep(1000);

        //add rich text column, rich text column default

        BaseClass.smartTables().enter_column_name_richText_smartTable();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1500);

        BaseClass.smartTables().click_add_rows_to_bottom_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);

        BaseClass.smartTables().click_smartTable_sectionView();

        Thread.sleep(1000);


//enter rich text - wrong spelling
        BaseClass.smartTables().enter_row1_richText();
        Thread.sleep(1000);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);


////enter rich text - section link
//
//        BaseClass.smartTables().click_row4_richText();
//        BaseClass.staging5().click_section_link_ck_modal();
//        BaseClass.staging5().click_link_to_section_defaultSectionTitle();
//        BaseClass.staging5().click_submit_button();
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1000);


        //enter rich text - wordbank r5c1
        //wordbank assign items
        BaseClass.smartTables().click_row5_richText();
        Thread.sleep(1500);

        BaseClass.staging5().click_column_dropdown_smartTable();
        Thread.sleep(500);

        BaseClass.smartTables().click_assign_wordBank_item_smartTable_dropdown();
        Thread.sleep(2000);
        BaseClass.staging5().enter_QA_ST_wordBank_unassigned_items();

        Thread.sleep(500);

        BaseClass.staging5().click_QA_wordBank_unassigned_item();
        Thread.sleep(500);

        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);


//add wordbank assigned item to cell
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

        BaseClass.smartTables().click_row5_richText();
        Thread.sleep(500);

        BaseClass.staging5().click_insert_wordbank_arrow_button();
        Thread.sleep(500);
        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);
        BaseClass.staging5().verify_green_highlighted_wb_item_is_Visible();
        Thread.sleep(1500);
        BaseClass.smartTables().click_row5_richText();
        Thread.sleep(1000);

        //export to excel from smart table actions
        BaseClass.smartTables().click_smartTable_actions_button();
        Thread.sleep(500);
        BaseClass.staging5().click_export_to_excel_file_dropdown_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);


        //turn on spell check and fix all issues

        BaseClass.staging5().capture_spellCheck_error_sections();
        Thread.sleep(1500);

        BaseClass.staging5().fix_all_spellCheck_errors();
        Thread.sleep(1000);
        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);


        //click first row cell, accept changes, then cross out changes, print red items
        BaseClass.smartTables().click_r1_c1();
        BaseClass.staging5().click_accept_change_icon_ck5();
        Thread.sleep(1000);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().select_all_and_backspace_Section_section_row_iFrame();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(1500);
        BaseClass.staging5().click_section_2_header();
        Thread.sleep(1500);

        //capture green , red , and spell check count

        BaseClass.staging5().capture_green_tracked_changes();
        Thread.sleep(500);
        BaseClass.staging5().capture_red_tracked_changes();
        Thread.sleep(1000);
        BaseClass.staging5().capture_spellCheck_errors();
        Thread.sleep(500);


//click notification button and read the smart table  excel file information
        BaseClass.staging5().click_active_notification_button();
        BaseClass.staging5().capture_unread_notification();
        Thread.sleep(1000);

        //turn off track changes
        BaseClass.staging5().click_and_capture_track_changes_button();
        Thread.sleep(1000);

//        //unlink - section link
//
//        BaseClass.smartTables().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().doubleclick_linked_section_text();
//        Thread.sleep(500);
//        BaseClass.staging5().click_unlink_button_sectionLinkView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_row4_richText();
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
//driver.close();
//        BaseClass.reportfoldersection().change_to_default_tab();
//        Thread.sleep(500);

   //     open pdf - unable to open pdf and verify if section link has been removed
//        BaseClass.reportfoldersection().clickGeneratePDFButton();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().captureAlertMessage();
//        Thread.sleep(3500);
//        BaseClass.reportfoldersection().captureGeneratedPDF_text();
//        BaseClass.reportfoldersection().click_GeneratedPDF_button();
//        Thread.sleep(2000);
//        //switch to next tab and capture url
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        BaseClass.staging5().captureURL();
//        Thread.sleep(500);
////verify if header and footer has contents expected
//     BaseClass.staging5().verify_header_footer_PDF_contents();
//        Thread.sleep(500);
//        //close second tab and go to default tab
//        driver.close();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().change_to_default_tab();
//        Thread.sleep(2000);


    }
    @Test
    public void TR_004e_FM1104_new_cloned_template_and_report() throws InterruptedException {

        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddTemplateButton();
        Thread.sleep(500);
        BaseClass.templatesSection().enterTemplateNameField_cloned_FM_1105();
        Thread.sleep(500);
        BaseClass.templatesSection().selectTemplateTypeDropdown_FM_1104();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(500);
        BaseClass.templatesSection().click_clone_template_dropdown();
        Thread.sleep(500);
        BaseClass.templatesSection().click_clone_existing_template_fm_1104_dropdown();
        Thread.sleep(500);
        BaseClass.templatesSection().enterTemplateDescriptionField();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave();
        Thread.sleep(1000);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //create report for FM 1104
        //Go into to QA Automation Parent folder

        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(3500);

        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(500);



        BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();

        Thread.sleep(2000);

        // create new FM 1104 report folder inside FM_1104 project folder w  template

        BaseClass.reportfoldersection().clickAddReportButton();
        BaseClass.reportfoldersection().enterReportName_QA_FM_1104_cloned_Field();
        BaseClass.reportfoldersection().enterReportDescriptionField();
        Thread.sleep(500);

        BaseClass.templatesSection().click_clone_template_dropdown();
        Thread.sleep(1000);

        BaseClass.templatesSection().click_clone_existing_report_first_dropdown();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(3000);
        BaseClass.templatesSection().capture_created_AlertMessage();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(1000);

        //comments
        BaseClass.staging5().click_comment_button_icon();
        BaseClass.staging5().enter_comments_to_field();
        BaseClass.staging5().capture_comments_content();
        BaseClass.staging5().click_cancel_button_popup();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(500);

        BaseClass.staging5().verify_if_comments_icon_isActive();
        Thread.sleep(1000);


    }
    @Test
    public void TR_005a_Freddie_Mac_1105_generate_json_in_template() throws InterruptedException {
            BaseClass.templatesSection().clickTemplatesTab();
            Thread.sleep(500);

            BaseClass.templatesSection().clickAddTemplateButton();
            Thread.sleep(500);

            BaseClass.templatesSection().enterTemplateNameField_FM_1105();
            Thread.sleep(500);

            BaseClass.templatesSection().selectTemplateTypeDropdown_FM_1105();
            Thread.sleep(500);

            BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
            Thread.sleep(1000);
        BaseClass.templatesSection().enterTemplateDescriptionField();
            Thread.sleep(500);

        BaseClass.templatesSection().clickSave();
            Thread.sleep(1000);


            BaseClass.templatesSection().capture_created_AlertMessage();
            BaseClass.templatesSection().clickHereLinkTemplate();
            //add cover letter and default section 2.0
            Thread.sleep(500);
            BaseClass.staging5().click_section_I_general_details_sectionView();
            Thread.sleep(500);
            BaseClass.staging5().click_section_III_property_details_sectionView();
            Thread.sleep(500);
            BaseClass.staging5().click_section_IV_esa_details_sectionView();
            Thread.sleep(500);
            BaseClass.staging5().click_section_V_repair_details_sectionView();
            Thread.sleep(500);
            BaseClass.staging5().click_section_VI_details();
            Thread.sleep(1000);
            BaseClass.staging5().click_section_II_unit_details_sectionView();
            Thread.sleep(500);
            BaseClass.staging5().click_carport_item__section_II();
            Thread.sleep(500);
            //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
            BaseClass.staging5().enter_costItem_details_sectionII();
            Thread.sleep(500);
            BaseClass.staging5().click_garages_item__section_II();
            Thread.sleep(500);
            //collection of test cases to enter in eul,rul,condition, actiondropdowns, comments, save
            BaseClass.staging5().enter_costItem_details_sectionII();
            Thread.sleep(500);
            BaseClass.staging5().click_default_section_title();

            Thread.sleep(500);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(500);
            BaseClass.staging5().click_add_costRecommendation_toSection();

            Thread.sleep(1000);
        WebDriver driver = getDriver();

            driver.navigate().refresh();
            Thread.sleep(500);
            BaseClass.staging5().click_add_cost_recommendation_button();
            Thread.sleep(500);


            BaseClass.staging5().select_carportItem_cost_recommendation();
            Thread.sleep(500);
            BaseClass.staging5().enter_cost_summary_quantity();
            Thread.sleep(500);
            BaseClass.staging5().enter_cost_summary_unit_cost();
            Thread.sleep(500);
            BaseClass.staging5().click_critical_repair_cost_checkbox_fm1105();
            Thread.sleep(500);

            BaseClass.staging5().click_save_and_add_another_button();
            Thread.sleep(500);

            BaseClass.staging5().select_garagesItem_cost_recommendation();
            Thread.sleep(500);
            BaseClass.staging5().enter_cost_summary_quantity();
            Thread.sleep(500);
            BaseClass.staging5().enter_cost_summary_unit_cost();
            Thread.sleep(500);
            BaseClass.staging5().click_critical_repair_cost_checkbox_fm1105();
            Thread.sleep(500);
            BaseClass.staging5().click_save_button();

            Thread.sleep(1000);
            BaseClass.staging5().capture_fm_1105_table_cost_summary();
            Thread.sleep(1000);
            BaseClass.staging5().click_section_II_unit_details_sectionView();
            Thread.sleep(2000);
            BaseClass.staging5().verify_section_II_error_message();


//generate json , capture generated json text
            BaseClass.reportfoldersection().click_generate_JSON_Button();
            Thread.sleep(5000);
            BaseClass.reportfoldersection().capture_generated_JSON_text();
            Thread.sleep(2000);
//generate json , capture generated json text

            BaseClass.staging5().click_export_to_excel_fm1105();
            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(4000);

            BaseClass.staging5().click_active_notification_button();
            BaseClass.staging5().capture_unread_notification();
            Thread.sleep(2500);
            driver.navigate().refresh();
            Thread.sleep(2500);

        }

//    @Test
//    public void TR_005c_ck5_and_uploadtoProfile_current_admin_login() throws InterruptedException {
//
//
//        //UPLOAD STAMP
//
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_editProfile_dropdownItem();
//        BaseClass.staging5().click_stamps_tab();
//        Thread.sleep(1000);
//        BaseClass.staging5().upload_stamp_button();
//        Thread.sleep(1500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(1500);
//
//        //UPLOAD SIGNATURE
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_editProfile_dropdownItem();
//        Thread.sleep(1000);
//        BaseClass.staging5().upload_signature_button();
//        Thread.sleep(1500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(3000);
//
//        //verify ck editor toolbar
//        BaseClass.staging5().navigateTo_automation_report_HM_folder();
//        Thread.sleep(1000);
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.staging5().verify_ck_editor_admin_permission_level();
//        Thread.sleep(1200);
//        //        BaseClass.staging5().click_default_section_title();
////        Thread.sleep(1000);
//
//    }
//    @Test
//    public void TR_006_report_packages() throws InterruptedException {
//
//        BaseClass.reportfoldersection().clickReportSettingsButton();
//        BaseClass.pca_xml_section().clickTemplatePackagesTab();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().getTemplatesPackagesList();
//        Thread.sleep(1000);
//
//        //  click aei package
//        BaseClass.pca_xml_section().click_package_AEI();
//        Thread.sleep(800);
//
//        //hover and click first arrow button unassigned package
//        BaseClass.staging5().hover_unassigned__dropdown_value();
//        Thread.sleep(800);
//        BaseClass.staging5().click_unassigned_items_right_arrow();
//        Thread.sleep(1000);
//
//        BaseClass.pca_xml_section().getTemplatesPackagesList();
//        Thread.sleep(1000);
//
////remove AEI package
//        BaseClass.pca_xml_section().click_package_AEI();
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().click_remove_button();
//        Thread.sleep(500);
////remove other package hovering over checkbox
//        BaseClass.pca_xml_section().hover_assigned_packages_second_item();
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().click_cancel_assigned_package_button();
//
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().getTemplatesPackagesList();
//
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//
//        Thread.sleep(1500);
//
//
//    }
//    @Test
//    public void TR_007_lock_unlock_ck5() throws InterruptedException {
//
//        //enter body text iframe
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        BaseClass.templatesSection().enter_instruction_text_iFrame();
//
//        //double click last word and leave iframe and click lock icon
//        BaseClass.templatesSection().double_click_body_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().defaultContent();
//        BaseClass.staging5().click_lock_icon_ck5();
//
//        //switch back into iframe and verify locked content - leave iframe
//
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_locked_content_ck5();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_locked_content_ck5();
//
//        driver.switchTo().defaultContent();
//
//        BaseClass.staging5().click_unlock_icon_ck5();
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_unlocked_content_ck5();
//        Thread.sleep(500);
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//        BaseClass.staging5().click_default_section_title();
//
//
//    }
//    @Test
//    public void TR_008_ck5_author_login() throws InterruptedException {
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//
//        BaseClass.quireLogin().enter_author_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//        BaseClass.staging5().navigateTo_automation_report_HM_folder();
//        Thread.sleep(1500);
//
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.staging5().verify_ck_editor_lower_permission_level();
//
//    }
//    @Test
//    public void TR_009_ck5_editor_login() throws InterruptedException {
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//
//        BaseClass.quireLogin().enter_editor_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//        BaseClass.staging5().navigateTo_automation_report_HM_folder();
//        Thread.sleep(1500);
//
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.staging5().verify_ck_editor_lower_permission_level();
//    }
//    @Test
//    public void TR_010_ck5_PM_login() throws InterruptedException {
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//
//        BaseClass.quireLogin().enter_pm_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//        BaseClass.staging5().navigateTo_automation_report_HM_folder();
//        Thread.sleep(1500);
//
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.staging5().verify_ck_editor_PM_permission_level();
//    }
//    @Test
//    public void TR_011_ck5_root_login() throws InterruptedException {
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//
//        BaseClass.quireLogin().enterRootUserEmail();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(1000);
//
//        String currentURL = driver.getCurrentUrl();
//        // Check if current URL contains "staging5"
//        if (currentURL.contains("staging5")) {
//            driver.navigate().to("https://staging5.openquire.com/companies/4/company_email_templates?filter=report%3Astatus_change");
//        }
//        // Check if current URL contains "staging2"
//        else if (currentURL.contains("staging2")) {
//            driver.navigate().to("https://staging2.openquire.com/companies/43/company_email_templates?filter=report%3Astatus_change");
//        }
//        Thread.sleep(1000);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//        BaseClass.staging5().captureURL();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().click_status_Email_Notification_Template();
//        Thread.sleep(500);
//        BaseClass.ck5editor().click_email_template_message();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_ck_editor_root_emailStatusTemplate_permission_level();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1000);
//
//
//    }
//    @Test
//    public void TR_012_ck5_contractor_login() throws InterruptedException {
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//
//        BaseClass.quireLogin().enter_contractor_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_contractor_company_link();
//        BaseClass.staging5().click_automation_report_link();
//        Thread.sleep(1000);
//        BaseClass.staging5().switchToAutomationReportTab();
//        Thread.sleep(1000);
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.staging5().verify_ck_editor_lower_permission_level();
//        Thread.sleep(1000);
//        driver.close();
//        Thread.sleep(1000);
//        BaseClass.staging5().switchToOriginalTab();
//        Thread.sleep(1000);
//
//    }
//    @Test
//    public void TR_013_ck5_sysadmin_login() throws InterruptedException {
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//
//        BaseClass.quireLogin().enterEmail2();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);
//
//        BaseClass.staging5().navigateTo_automation_report_HM_folder();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.staging5().verify_ck_editor_admin_permission_level();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//
//        //click body and click locked content iframe
////        Thread.sleep(500);
////        BaseClass.staging5().clickSection_row_editor();
////        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
////        Thread.sleep(500);
////        BaseClass.staging5().verify_locked_content_ck5();
////        Thread.sleep(1000);
////        BaseClass.staging5().click_locked_content_ck5();
////        //leave iframe and click unlock icon
////        driver.switchTo().defaultContent();
////        BaseClass.staging5().click_unlock_icon_ck5();
////        //switch to body iframe and check confirm unlocked content iframe
////
////        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
////        Thread.sleep(500);
////        BaseClass.staging5().verify_unlocked_content_ck5();
////        Thread.sleep(500);
////        BaseClass.templatesSection().select_all_body_and_delete_iFrame();
////        Thread.sleep(500);
//
//
//
//    }
//    @Test
//    public void TR_014_Company_users() throws InterruptedException {
//
//        //export company users to excel
//        BaseClass.staging5().clickUsersTab();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_usersTab_companyUsers_dropdownItem();
//        Thread.sleep(500);
////clear notifications
//        BaseClass.staging5().mark_all_notifications_as_read();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_export_to_excel();
//        BaseClass.staging5().captureAlertMessage();
//
//        Thread.sleep(1000);
//
////add company user
//
//        BaseClass.staging5().click_add_company_user();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_company_user_name_field();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_company_user_email_field();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_company_user_pw_field();
//        BaseClass.staging5().enter_company_user_pw_confirmation_field();
//        Thread.sleep(500);
//        BaseClass.staging5().select_company_user_permission_level();
//        Thread.sleep(1500);
//        BaseClass.staging5().clickSave();
//        Thread.sleep(1000);
//        BaseClass.reportfoldersection().enterSearchField_QA_companyUser();
//        Thread.sleep(3000);
//        BaseClass.staging5().click_qa_dummy_user_link();
//        Thread.sleep(500);
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(1000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().click_active_notification_button();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().capture_unread_notification();
//        Thread.sleep(2500);
//
//    }
//    @Test
//    public void TR_015_smoke_test() throws InterruptedException {
//
////pin portfolio
//        BaseClass.staging5().clickPortfoliosTab();
//        Thread.sleep(2500);
//        BaseClass.staging5().click_second_pinned_Item_portfolios();
////pin report
//        BaseClass.staging5().clickReportsTab();
//        BaseClass.reportfoldersection().enterSearchField_HMReports();
//        BaseClass.reportfoldersection().captureRecentReportName();
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        BaseClass.projectFolderSection().clickProjectFolderLink_2023QAReport();
//        BaseClass.staging5().click_second_pinned_Item_portfolios();
////go back to dashboard
//        BaseClass.staging5().clickDashboardTab();
////pinned items
//        BaseClass.staging5().capture_and_delete_pinnedItem_dashboard();
////capture_recentlyEditedReports_dashboard
//        BaseClass.staging5().capture_recentlyEditedReports_dashboard();
//        BaseClass.staging5().capture_recentProjects_dashboard_data();
//        Thread.sleep(4000);
////click on all 6 tips and capture title
//        BaseClass.staging5().capture_tip_dashboard_header_data();
//        BaseClass.staging5().capture_myQuireStats_dashboard_data();
//        BaseClass.staging5().click_edit_profile_dashboard_button();
//        BaseClass.staging5().clickCancel();
//        //verify email  support functionality works
//        BaseClass.staging5().confirm_email_support_button();
//        Thread.sleep(1000);
//        //verify  chat support functionality works
//        BaseClass.staging5().confirm_chat_support_button();
//        Thread.sleep(1000);
//    }
//    @Test
//    public void TR_016_portfolios() throws InterruptedException {
//        //go to portfolios tab and into qa automation pca portfolio
//        BaseClass.staging5().clickPortfoliosTab();
//        BaseClass.staging5().click_QA_PCA_portfolio();
//        Thread.sleep(2500);
//
//        //change to individual cost view
//        BaseClass.staging5().click_change_porfolio_view_button();
//        Thread.sleep(500);
//        BaseClass.staging5().select_porfolio_view_individual();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1500);
//
//
//        //capture portfolio text and click export pdf and export excel button...and capture green banner
//        BaseClass.staging5().capture_portfolio_text();
//        Thread.sleep(1000);
//
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
//        //change to aggregated cost view
//        BaseClass.staging5().click_change_porfolio_view_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().select_porfolio_view_aggregated();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1500);
//
//        //capture portfolio text and click export pdf and export excel button...and capture green banner
//        BaseClass.staging5().capture_portfolio_text();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_export_to_excel_fm1105();
//        BaseClass.templatesSection().captureAlertMessage();
//        Thread.sleep(500);
//        BaseClass.staging5().click_cancel_alert_message();
//        Thread.sleep(500);
//        BaseClass.staging5().click_export_pdf_button();
//        BaseClass.templatesSection().captureAlertMessage();
//        Thread.sleep(500);
//        BaseClass.staging5().click_cancel_alert_message();
//        Thread.sleep(500);
//    }

    }



