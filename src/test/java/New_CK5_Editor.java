import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import reusableLibrary.ReusableAnnotations;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class New_CK5_Editor extends ReusableAnnotations {
    @Test
    public void TR_001_User_Login() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        WebDriver driver = getDriver();

        driver.navigate().to("https://staging5.openquire.com/");
        BaseClass.quireLogin().enterEmail_bv_admin_level();
        BaseClass.quireLogin().enterPassword();
        BaseClass.quireLogin().clickLogin();
    }

    @Test
    public void TR_001a_delete_items() throws InterruptedException {
//delete report
        BaseClass.staging5().clickReportsTab();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(1000);
        BaseClass.templatesSection().delete_automation_folders();
        Thread.sleep(1000);
//delete templates
 BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(1000);
        BaseClass.templatesSection().delete_automation_templates();
        Thread.sleep(1000);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(1000);

        //delete wb items
        BaseClass.staging5().clickLibrariesTab();
        BaseClass.staging5().click_librariesTab_wordBankDropdown();
        Thread.sleep(600);
        BaseClass.templatesSection().enterSearchField_QA_WB();
        Thread.sleep(3000);
        BaseClass.staging5().delete_QA_WB_items();
        Thread.sleep(1000);

    }

    @Test
    public void TR_002a_createTemplate() throws InterruptedException {

    //create ck5 template
        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddTemplateButton();
        Thread.sleep(500);
        BaseClass.templatesSection().enterTemplateNameField_new_ck5();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(1000);
// new ck5 feature enabled will make all templates/reports in ck5
   //     BaseClass.ck5editor().select_ck5_report_dropdown();
   //     Thread.sleep(500);

        BaseClass.templatesSection().enterTemplateDescriptionField();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        BaseClass.templatesSection().clickHereLinkTemplate();
        Thread.sleep(1000);

}
    @Test
    public void TR_002b_new_ck5_intro_pages_and_report_tag() throws InterruptedException {
        //add intro pages to template
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(500);
        BaseClass.staging5().click_add_titlePage_toSection();
        Thread.sleep(500);
        BaseClass.staging5().click_add_coverLetter_toSection();
        Thread.sleep(500);
        BaseClass.staging5().click_add_execSummary_toSection();
        Thread.sleep(1500);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(500);


        //add coverLetter images and instruction text -coverLetter_sectionView
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(1000);
        BaseClass.staging5().upload_footer_image();
        Thread.sleep(2500);
        BaseClass.staging5().upload_header_image();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(500);
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(500);

        //go to text body iframe, enter text
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(2000);
        BaseClass.ck5editor().enter_section_row_1_body_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);





        // NOT WORKING 7/10/24 - GREY INSTRUCTION TEXT
        //click grey icon and add instruction text to cover letter
        BaseClass.ck5editor().click_grey_instruction_Icon_template();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(1000);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);
        //verify ck5 editor contents for  instruction item in template
        BaseClass.ck5editor().capture_ck5_editor_icons();
        Thread.sleep(500);

        //save instruction text
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);
        //verify alert message for instruction text
        BaseClass.templatesSection().verify_instructionText_alertMessage();
        Thread.sleep(2000);
        //verify yellow instruction icon in
        BaseClass.templatesSection().verify_yellow_instruction_icon_introPages_is_Visible();
        Thread.sleep(500);
        BaseClass.templatesSection().click_yellow_instruction_icon_introPages();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_instruction_text_modal();
        Thread.sleep(1000);

        // create comments and verify icon in cover letter
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(500);
        BaseClass.ck5editor().select_all_text_introPages_body();
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

        driver.navigate().refresh();
        Thread.sleep(1000);
        BaseClass.staging5().click_coverLetter_sectionView();
        BaseClass.templatesSection().clickAddContentRow_introPages();


        //add report tag into cover letter
        BaseClass.ck5editor().click_report_tag_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().click_reportTag_dropDownItem_ck5_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();

        // in yellow report tag, enter text, test@quiretest.com
        BaseClass.staging5().enter_email_ReportTagField();
        Thread.sleep(500);
        // click out of section, capture report tag text
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);


        //assign WB item to cover letter from vertical pane
        BaseClass.staging5().click_coverLetter_sectionView();
        BaseClass.staging5().click_introPages_wordbank_grey_icon();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().click_recent_row_item_wordBank();
        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(1000);
        BaseClass.templatesSection().clickSave2();
        BaseClass.templatesSection().verify_wordBank_AlertMessage(); //change to wb alert item
        Thread.sleep(500);
        // BaseClass.staging5().capture_number_of_wordbanks_associated();
        // Thread.sleep(500);
        BaseClass.staging5().verify_blue_WB_icon_introPages_is_Visible();
        Thread.sleep(500);


        //check revision history
        BaseClass.staging5().click_intro_pages_revisions_icon();
        //NOT WORKING
        BaseClass.staging5().capture_revisions_history();
      //  BaseClass.staging5().click_cancel_button_popup();
      //  Thread.sleep(500);
      //  BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();

        Thread.sleep(500);
        //mark complete
        BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().verify_intro_pages_blue_marked_complete_icon_is_Visible();
        Thread.sleep(500);


        //FOOTNOTE - verification not working yet - do in smart tables
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().click_footNote_icon_ck5();
//        Thread.sleep(500);
//
//        BaseClass.ck5editor().enter_footNote_textBox();
//        Thread.sleep(1000);
//        BaseClass.ck5editor().click_save_button_footnote();
//        Thread.sleep(1000);
//
        driver.navigate().refresh();
        Thread.sleep(500);


//TITLE PAGE INTRO PAGE
        //add titlePage  text
        BaseClass.staging5().click_title_page_sectionView();
        Thread.sleep(1500);
        BaseClass.staging5().upload_header_image();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_section_row_1_body_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();

        Thread.sleep(500);

        //click grey icon and add instruction text to cover letter
        BaseClass.ck5editor().click_grey_instruction_Icon_template();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);
        //verify ck5 editor contents for  instruction item in template
        BaseClass.ck5editor().capture_ck5_editor_icons();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);

        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);

        BaseClass.templatesSection().verify_instructionText_alertMessage();
        Thread.sleep(2000);
        //capture how many yellow instruction icons are showing
        BaseClass.templatesSection().verify_yellow_instruction_icon_introPages_is_Visible();
        Thread.sleep(500);
        BaseClass.templatesSection().click_yellow_instruction_icon_introPages();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_instruction_text_modal();
        Thread.sleep(1000);

        // create comments and verify icon in cover letter
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(500);
        BaseClass.ck5editor().select_all_text_introPages_body();
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
        BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
        //  BaseClass.staging5().verify_if_comments_icon_isActive();
        //  Thread.sleep(1000);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(1000);
        BaseClass.ck5editor().verify_resolved_2_comment_is_Visible();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_and_verify_comments_archive_icon();
        Thread.sleep(1000);
        BaseClass.ck5editor().update_comments_in_field();
        Thread.sleep(1000);
        // NEED VERIFICATION STEPS
        BaseClass.ck5editor().reopen_archived_comment_discussion();
        Thread.sleep(1000);
        BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);

        //assign WB item to cover letter from vertical pane
        BaseClass.staging5().click_title_page_sectionView();
        BaseClass.staging5().click_introPages_wordbank_grey_icon();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().click_recent_row_item_wordBank();
        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(1000);
        BaseClass.templatesSection().clickSave2();
        BaseClass.templatesSection().verify_wordBank_AlertMessage(); //change to wb alert item
        Thread.sleep(500);
        // BaseClass.staging5().capture_number_of_wordbanks_associated();
        // Thread.sleep(500);
        BaseClass.staging5().verify_blue_WB_icon_introPages_is_Visible();
        Thread.sleep(500);

        //check revision history
        BaseClass.staging5().click_intro_pages_revisions_icon();
        //NOT WORKING
        BaseClass.staging5().capture_revisions_history();
//        BaseClass.staging5().click_cancel_button_popup();
//        Thread.sleep(500);
//        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();

        Thread.sleep(500);
        //mark complete
        BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().verify_intro_pages_blue_marked_complete_icon_is_Visible();
        Thread.sleep(500);




        //add executive_summary instruction text
        BaseClass.staging5().click_executive_summary_sectionView();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_introPages();

        BaseClass.ck5editor().enter_section_row_1_body_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();


        //click grey icon and add instruction text to cover letter
        BaseClass.ck5editor().click_grey_instruction_Icon_template();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);
        //verify ck5 editor contents for  instruction item in template
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_instructionText_alertMessage();
        Thread.sleep(2000);

        //VERIFY YELLOW ICON - VERIFY INSTRUCTION TEXT
        BaseClass.templatesSection().click_yellow_instruction_icon_introPages();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_instruction_text_modal();
        Thread.sleep(1000);

        // create comments and verify icon in cover letter
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(500);
        BaseClass.ck5editor().select_all_text_introPages_body();
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
        BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
        //  BaseClass.staging5().verify_if_comments_icon_isActive();
        //  Thread.sleep(1000);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(1000);
        BaseClass.ck5editor().verify_resolved_2_comment_is_Visible();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_and_verify_comments_archive_icon();
        Thread.sleep(1000);
        BaseClass.ck5editor().update_comments_in_field();
        Thread.sleep(1000);
        // NEED VERIFICATION STEPS
        BaseClass.ck5editor().reopen_archived_comment_discussion();
        Thread.sleep(1000);
        BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);

        //ASSIGN WORD BANK ITEM
        BaseClass.staging5().click_executive_summary_sectionView();
        BaseClass.staging5().click_introPages_wordbank_grey_icon();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().click_recent_row_item_wordBank();
        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(1000);
        BaseClass.templatesSection().clickSave2();
        BaseClass.templatesSection().verify_wordBank_AlertMessage(); //change to wb alert item
        Thread.sleep(500);

        BaseClass.staging5().verify_blue_WB_icon_introPages_is_Visible();
        Thread.sleep(500);

        //CHECK REVISION HISTORY
        BaseClass.staging5().click_intro_pages_revisions_icon();
        Thread.sleep(500);
        BaseClass.staging5().capture_revisions_history();
//        BaseClass.staging5().click_cancel_button_popup();
//        Thread.sleep(500);
//        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
//        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);

        //MARK COMPLETE
        BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().verify_intro_pages_blue_marked_complete_icon_is_Visible();
        Thread.sleep(500);


    }

    @Test
    public void TR_003_Template_instructionText_wordBank() throws InterruptedException {
        BaseClass.staging5().click_default_section_title();

        Thread.sleep(500);

        //click grey icon and add instruction - to default section title
        BaseClass.templatesSection().clickGreyIcon();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);

        //verify ck5 editor contents for  instruction item in template
        BaseClass.ck5editor().capture_ck5_editor_icons();
        Thread.sleep(500);

        //save instruction text
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);

        //VERIFY YELLOW ICON - VERIFY INSTRUCTION TEXT
        BaseClass.templatesSection().verify_instructionText_alertMessage();
        Thread.sleep(2000);
        BaseClass.templatesSection().verify_yellow_instruction_icon_default_section_is_Visible();
        Thread.sleep(500);

        BaseClass.templatesSection().click_yellow_instruction_defaultSection_icon();
        Thread.sleep(500);

        BaseClass.templatesSection().verify_instruction_text_modal();
        Thread.sleep(500);


        //add wordBank CK modal
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(800);

        BaseClass.ck5editor().click_create_wordBank_icon_ck5();
        Thread.sleep(800);
//wordBank details
        BaseClass.staging5().enter_wordbank_new_title();
        Thread.sleep(900);

        BaseClass.staging5().clickWordBank_label_dropdown_arrow();

        Thread.sleep(800);

        BaseClass.staging5().clickWordBank_label_dropdown_firstLink();
        Thread.sleep(900);


        //add content row
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);

        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_wordBank_add_content_row();
        Thread.sleep(500);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_wordBank_assign_to_section();
        Thread.sleep(400);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(800);

        //capture how many blue wordbanks are showing

        BaseClass.staging5().verify_blue_wordBank_icon_is_Visible();
        Thread.sleep(800);

        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
    }

        @Test
        public void TR_003a_new_ck5_report_creation() throws InterruptedException{

        //Go into to QA Automation Parent folders

        BaseClass.reportfoldersection().clickReportsTab();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(3500);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(1000);


        //create ck5 project folder

        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        Thread.sleep(500);
        BaseClass.projectFolderSection().enterProjectFolderNameField_New_CK5();
        Thread.sleep(500);
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        Thread.sleep(500);
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdownssffy
        Thread.sleep(1000);

        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(3000);
        BaseClass.projectFolderSection().click_CK5_Template_projectFolder_New_templatesTab();
        Thread.sleep(1000);
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(1000);

        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(2000);
        BaseClass.projectFolderSection().click_CK5_ProjectFolderLink();
        Thread.sleep(1000);

        //create ck5 report folder with ck5 template created

        BaseClass.reportfoldersection().clickAddReportButton();
        Thread.sleep(500);
        BaseClass.reportfoldersection().enterReportName_QA_New_CK5_Field();
        Thread.sleep(500);
        BaseClass.reportfoldersection().enterReportDescriptionField();
        Thread.sleep(500);
        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
        Thread.sleep(3000);
        BaseClass.reportfoldersection().clickDropdownItem();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(4500);
        BaseClass.reportfoldersection().captureAlertMessage();
        BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(2000);

    }

    //@add smart table creation with track changes, link/unlink report link

    @Test
    public void TR_003b_insert_stamp_signature_report() throws InterruptedException {
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(2000);
        BaseClass.staging5().click_add_section_toSection();
        Thread.sleep(1000);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(1000);
        BaseClass.staging5().click_Section2_row_editor();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_stamp_icon_ck5();
        Thread.sleep(1500);
        BaseClass.ck5editor().click_stamp_icon_dropdown_ck5();
        Thread.sleep(1500);
        BaseClass.ck5editor().click_signature_icon_ck5();
        Thread.sleep(1500);
        BaseClass.ck5editor().click_stamp_icon_dropdown_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(1000);
        BaseClass.ck5editor().verify_stamp_signature_in_section();
        Thread.sleep(500);
    }

        @Test
    public void TR_003c_report_packages_projSummary() throws InterruptedException {
        BaseClass.reportfoldersection().clickReportSettingsButton();
        BaseClass.pca_xml_section().clickTemplatePackagesTab();
        Thread.sleep(1000);
        //hover and click first arrow button unassigned package
        BaseClass.staging5().hover_unassigned__dropdown_value();
        Thread.sleep(800);
        BaseClass.staging5().click_unassigned_items_right_arrow();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().getTemplatesPackagesList();
       Thread.sleep(1000);
      BaseClass.staging5().click_save_button();
     Thread.sleep(1500);
            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(2000);
            BaseClass.staging5().click_add_projSummary_toSection();
            Thread.sleep(1000);
            BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
            Thread.sleep(1000);
            BaseClass.staging5().click_section_row_editor_projectSummary();
            Thread.sleep(500);
            BaseClass.ck5editor().enter_section_row_1_body_ck5();
            Thread.sleep(500);
            // click out of section, capture proj summary alert message
            BaseClass.staging5().click_out_of_section();
            Thread.sleep(500);
            BaseClass.templatesSection().verify_alertMessage_projectSummary();
            Thread.sleep(500);
            BaseClass.templatesSection().verify_spellCheck_text();

        }


        @Test
        public void TR_004_ck5_author_login() throws InterruptedException {
            BaseClass.staging5().clickUserProfileTab();
            BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

            BaseClass.quireLogin().enter_author_BV_Email();
            BaseClass.quireLogin().enterPassword();
            //Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(500);
            BaseClass.staging5().click_modal_close_window();
            Thread.sleep(500);

            BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
          //  BaseClass.staging5().clickSection_row_editor();
            BaseClass.ck5editor().verify_ck5_lower_permission_level();

        }

        @Test
        public void TR_005_ck5_editor_login() throws InterruptedException {
            BaseClass.staging5().clickUserProfileTab();
            BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

            BaseClass.quireLogin().enter_editor_BV_Email();
            BaseClass.quireLogin().enterPassword();
            //Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(500);
            BaseClass.staging5().click_modal_close_window();
            Thread.sleep(500);

            BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
          //  BaseClass.staging5().clickSection_row_editor();
            BaseClass.ck5editor().verify_ck5_lower_permission_level();

        }

        @Test
        public void TR_006_ck5_PM_login() throws InterruptedException {
            BaseClass.staging5().clickUserProfileTab();
            BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

            BaseClass.quireLogin().enter_pm_BV_Email();
            BaseClass.quireLogin().enterPassword();
            //Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(500);
            BaseClass.staging5().click_modal_close_window();
            Thread.sleep(500);

            BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
            //Thread.sleep(1000);

          //  BaseClass.staging5().clickSection_row_editor();
            BaseClass.ck5editor().verify_ck_editor_PM_permission_level();
        }

    @Test
    public void TR_06b_ck5_root_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
        WebDriver driver = getDriver();


        driver.navigate().to("https://staging5.openquire.com/companies/20/company_email_templates?filter=report%3Astatus_chang");

        Thread.sleep(1000);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.staging5().captureURL();
        Thread.sleep(500);

        BaseClass.ck5editor().click_status_Email_Notification_Template();
        Thread.sleep(500);
        BaseClass.ck5editor().click_email_template_message();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_ck_editor_root_emailStatusTemplate_permission_level();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);



    }

        @Test
        public void TR_007_ck5_contractor_login() throws InterruptedException {
            BaseClass.staging5().clickUserProfileTab();
            BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

            BaseClass.quireLogin().enter_contractor_Email();
            BaseClass.quireLogin().enterPassword();
            //Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(500);
            BaseClass.staging5().click_modal_close_window();
            Thread.sleep(500);
            //Thread.sleep(2000);

           // BaseClass.staging5().click_testing_inc_company();
            BaseClass.ck5editor().click_ck5_permissions_report_link();
            //Thread.sleep(1000);
           // BaseClass.staging5().switchToAutomationReportTab();
            Thread.sleep(1000);
        //    BaseClass.staging5().clickSection_row_editor();
            BaseClass.ck5editor().verify_ck5_lower_permission_level();
         //   WebDriver driver = getDriver();

            //Thread.sleep(1000);
        //    driver.close();
            //Thread.sleep(1000);
        //    BaseClass.staging5().switchToOriginalTab();

        }
        @Test
        public void TR_008_ck5_sysadmin_login() throws InterruptedException {
            BaseClass.staging5().clickUserProfileTab();
            BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

            BaseClass.quireLogin().enterEmail_bv_sysadmin_level();
            BaseClass.quireLogin().enterPassword();
            //Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(500);
            BaseClass.staging5().click_modal_close_window();
            Thread.sleep(500);
            //Thread.sleep(2000);

            BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
            //Thread.sleep(1000);

          //  BaseClass.staging5().clickSection_row_editor();
            BaseClass.ck5editor().verify_ck5_admin_permission_level();
        }
@Test
public void TR_009_navigate_ck5_report() throws InterruptedException {
//
    BaseClass.reportfoldersection().clickReportsTab();
    BaseClass.reportfoldersection().enterSearchField_QA_Report();
    Thread.sleep(4500);
    BaseClass.reportfoldersection().clickReportsFirstLink();
    Thread.sleep(1000);
    BaseClass.projectFolderSection().click_new_CK5_ProjectFolderLink();
    Thread.sleep(1000);
    //cloned fm 1104 report
    BaseClass.reportfoldersection().clickReportsFirstLink();
    Thread.sleep(2000);
}
    @Test
    public void TR_010_assign_wb() throws InterruptedException {
//add smart table to section and add columns
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);


        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.staging5().click_insert_word_bank_blue_icon();
        Thread.sleep(500);
        BaseClass.staging5().click_insert_wordbank_add_item_arrow();
        Thread.sleep(500);
        BaseClass.staging5().click_section_1_header();
        Thread.sleep(500);
    }
    @Test
    public void TR_011_create_ST() throws InterruptedException {
//        BaseClass.staging5().capture_Section_row_editor();
//        Thread.sleep(500);
        WebDriver driver = getDriver();
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(500);
        BaseClass.staging5().click_add_smartTable_toSection();
        Thread.sleep(500);
        BaseClass.smartTables().click_add_column_button_smartTable();
        Thread.sleep(500);

        //add rich text column, rich text column default

        BaseClass.smartTables().enter_column_name_richText_smartTable();
        Thread.sleep(500);
        BaseClass.staging5().click_save_and_add_another_button();
        Thread.sleep(500);

        //add plain text column

        BaseClass.smartTables().enter_column_name_plainText_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_plainText_dropDown_column_type();
        Thread.sleep(500);
        BaseClass.staging5().click_save_and_add_another_button();
        Thread.sleep(500);


        //add number column
        BaseClass.smartTables().enter_column_name_number_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_number_dropDown_column_type();
        Thread.sleep(500);
        BaseClass.staging5().click_save_and_add_another_button();
        Thread.sleep(500);

        //add formula column
        BaseClass.smartTables().enter_column_name_formula_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_formula_column_type();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1500);




        BaseClass.smartTables().click_add_rows_to_bottom_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);

        Thread.sleep(500);

        driver.navigate().refresh();

        Thread.sleep(500);


        //    add date column
        BaseClass.smartTables().click_c1_header();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_actions_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_add_column_ST_dropdown_button();
        Thread.sleep(500);

        BaseClass.smartTables().enter_column_name_date_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_date_column_type();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

        driver.navigate().refresh();

        Thread.sleep(500);

        //     click date column, add to left, add dynamic column
        BaseClass.smartTables().click_c1_header();
        Thread.sleep(500);
        BaseClass.smartTables().click_date_column_dropdown();
        Thread.sleep(500);
        BaseClass.smartTables().click_add_column_to_left_dropdown();
        Thread.sleep(500);

        BaseClass.smartTables().enter_column_name_dynamic_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_dynamic_column_type();

        Thread.sleep(1000);
        //  BaseClass.staging5().click_out_of_modal();
        //   Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        //Thread.sleep(1500);
//        BaseClass.staging5().click_smartTable_sectionView();
        Thread.sleep(500);

        driver.navigate().refresh();

        Thread.sleep(500);

        // add column to right of date- TO BE DELETED

        //   BaseClass.staging5().click_r1_c1();
        //   Thread.sleep(500);
        BaseClass.smartTables().click_c1_header();
        Thread.sleep(500);
        BaseClass.smartTables().click_date_column_dropdown();
        Thread.sleep(500);
        BaseClass.smartTables().click_add_column_to_right_dropdown();

        BaseClass.smartTables().enter_column_name_toBeDeleted_smartTable();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        // Thread.sleep(500);
        Thread.sleep(500);

        driver.navigate().refresh();

        Thread.sleep(500);
//           Thread.sleep(500);
        BaseClass.smartTables().click_c1_header();
        Thread.sleep(500);
        BaseClass.smartTables().click_toBeDeleted_column_dropdown();
        Thread.sleep(500);
        BaseClass.smartTables().click_delete_column_dropdown();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(500);
        BaseClass.smartTables().verify_toBeDeletedColumn_isNot_visible();
        Thread.sleep(1500);


    }

    @Test
    public void TR_012_reportTag_richtext() throws InterruptedException {
        WebDriver driver = getDriver();

        BaseClass.smartTables().click_smartTable_sectionView();

        Thread.sleep(1000);

        //enter rich text
        BaseClass.smartTables().enter_row1_richText();
        Thread.sleep(1000);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);
   // enter rich text
        BaseClass.smartTables().enter_r10_c1_richtext();
        Thread.sleep(1000);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1500);


        //enter rich text - report tag
        BaseClass.smartTables().click_row2_richText();
        Thread.sleep(500);
        BaseClass.ck5editor().click_report_tag_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().click_reportTag_dropDownItem_ck5_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();

        // in yellow report tag, enter text, test@quiretest.com
        BaseClass.staging5().enter_email_ReportTagField();
        Thread.sleep(500);
        // click out of section, capture report tag text
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);



        //go to text body iframe, double click and edit blue report tag
        BaseClass.smartTables().click_row2_richText();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();
        Thread.sleep(500);
        // in blue report tag, enter text, automation_new_test@quiretest.com
        BaseClass.staging5().enter_edited_email_ReportTagField();
        Thread.sleep(500);
        // click out of section, capture edited blue report tag text
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);


        //go to text body iframe, double click and delete text blue report tag
        BaseClass.smartTables().click_row2_richText();
        Thread.sleep(500);
        BaseClass.templatesSection().double_click_report_tag_iframe();
        Thread.sleep(500);
        // in blue report tag, select all and delete
        BaseClass.staging5().select_all_and_delete_ReportTagField();
        Thread.sleep(1000);
        //click blue check box to save empty field
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);
        // click out of section, capture edited blue report tag text
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);


     //   go to text body iframe, and delete yellow report tag from text
        BaseClass.smartTables().click_row2_richText();
        Thread.sleep(500);
        BaseClass.ck5editor().clear_current_text_body();
        Thread.sleep(500);
        //go back to parent frame
            BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);
    }
    @Test
    public void TR_013_richtext_column() throws InterruptedException {

        WebDriver driver = getDriver();
//enter rich text - footnote

        BaseClass.smartTables().click_row3_richText();
        Thread.sleep(500);
        BaseClass.ck5editor().click_footNote_icon_ck5();
    Thread.sleep(500);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
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

//enter rich text - section link

        BaseClass.smartTables().click_row4_richText();
        BaseClass.ck5editor().click_report_link_icon_ck5();

        BaseClass.staging5().click_link_to_section_defaultSectionTitle();
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);
    }

    @Test
    public void TR_014_plaintext_column() throws InterruptedException {

//enter plain text - r1c2

        BaseClass.smartTables().enter_row1_plainText();
        Thread.sleep(1000);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();

//enter dropdown value of 1 text - r2c2
        Thread.sleep(1000);
        BaseClass.smartTables().click_row2_plainText();
        Thread.sleep(2000);

        BaseClass.smartTables().click_second_column_dropdown_smartTable();
        Thread.sleep(1000);

        BaseClass.smartTables().click_manage_dropDown_values_smartTable_dropDown();
        Thread.sleep(500);

        BaseClass.staging5().click_unassigned_smartTable_dropdown_values();
        Thread.sleep(500);

        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);
        BaseClass.smartTables().click_row2_plainText();
        BaseClass.smartTables().click_plainText_dropdown_arrow_in_cell_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
    }
    @Test
    public void TR_015_number_and_formula_column() throws InterruptedException {
//enter number value r1c3
        BaseClass.smartTables().enter_row1_number_999();
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1500);

        //enter number value r2c3
        BaseClass.smartTables().enter_row2_number();
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1500);

        //    enter formula value r1c4
        BaseClass.smartTables().click_row1_formula();
        Thread.sleep(1000);
        BaseClass.smartTables().click_sum_button_formula();
        Thread.sleep(1000);
        BaseClass.smartTables().enter_sum_formula_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);

        BaseClass.smartTables().rightClick_formula_cell_smartTable();
        BaseClass.smartTables().click_add_or_edit_cell_reference_tag_button();
        Thread.sleep(1000);
        BaseClass.smartTables().enter_cell_name_reference_tag();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
    }
    @Test
    public void TR_016_referenceTag_column() throws InterruptedException {
        WebDriver driver = getDriver();
        //enter rich text - reference tag formula link r6c1

        BaseClass.smartTables().click_row6_richText_formula_link();
        Thread.sleep(500);
        BaseClass.ck5editor().click_reference_tag_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().click_reference_tag_dropDown_item_ck5();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.smartTables().verify_reference_tag_value_1000();
        Thread.sleep(500);
        BaseClass.smartTables().update_row1_number_99();
        Thread.sleep(500);
        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);
        BaseClass.smartTables().verify_reference_tag_value_100();
        Thread.sleep(1500);




        //QP and verify Reference tag value and Section Link
        BaseClass.reportfoldersection().click_quick_preview_button();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(500);
        //quick preview tab - capture header and footer data
        BaseClass.smartTables().verify_qp_ST_reference_tag();
        BaseClass.smartTables().verify_quickPreview_linked_section_is_visible();
        Thread.sleep(500);
        //close second tab and go back to default tab
        driver.close();
        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(1000);




        // unlink section link
        BaseClass.smartTables().click_row4_richText();
        Thread.sleep(500);
        BaseClass.ck5editor().doubleclick_linked_section_text();
        Thread.sleep(500);
        BaseClass.ck5editor().click_unlink_button_sectionLinkView();
        Thread.sleep(500);
        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);
        BaseClass.smartTables().click_row4_richText();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_linked_sectionLink_isNot_visible();
        Thread.sleep(500);
        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);

        //delete reference tag value
        //rightclick formula cell with reference tag included
        BaseClass.smartTables().click_row1_formula();
        Thread.sleep(1000);
        BaseClass.smartTables().click_escape_button_formula_smartTable();


        BaseClass.smartTables().rightClick_formula_cell_hasReferenceTag_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_add_or_edit_cell_reference_tag_button();

        //delete reference tag value
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(500);
        BaseClass.smartTables().verify_deleted_reference_tag_is_Visible();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();


        //QP and verify Reference tag value and Section Link
        BaseClass.reportfoldersection().click_quick_preview_button();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(500 );
        //quick preview tab - capture header and footer data
        BaseClass.smartTables().verify_qp_ST_reference_tag_not_visible();
        Thread.sleep(500);

        BaseClass.smartTables().verify_quickPreview_linked_section_isNot_visible();
        Thread.sleep(500);
        //close second tab and go back to default tab
        driver.close();
        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(1000);



        //enter number for dynamic r1c5

        BaseClass.smartTables().click_row1_dynamic();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1500);
    }
    @Test
    public void TR_017_create_assign_WB() throws InterruptedException {
//enter rich text - wordbank r5c1
        WebDriver driver = getDriver();
        //wordbank create item
        BaseClass.smartTables().click_row5_richText();
        Thread.sleep(500);
        BaseClass.smartTables().click_first_column_dropdown_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_create_wordBank_item_smartTable_dropdown();
        Thread.sleep(500);
        BaseClass.staging5().enter_wordbank_ST_new_title();
        Thread.sleep(900);
        BaseClass.staging5().clickWordBank_label_dropdown_arrow();
        Thread.sleep(800);
        BaseClass.staging5().clickWordBank_label_dropdown_firstLink();
        Thread.sleep(900);
        //add content row
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_wordBank_add_content_row();
        Thread.sleep(500);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_instruction_text_ck5();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(800);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);


        //wordbank assign item
        BaseClass.smartTables().click_row5_richText();
        Thread.sleep(1000);

        BaseClass.smartTables().click_first_column_dropdown_smartTable();
        Thread.sleep(500);

        BaseClass.smartTables().click_assign_wordBank_item_smartTable_dropdown();
        Thread.sleep(500);

        BaseClass.staging5().enter_QA_ST_wordBank_unassigned_items();
        Thread.sleep(800);

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
//        BaseClass.staging5().click_smartTable_sectionView();

//add refresh for semaphore   for      BaseClass.staging5().click_number_dropDown_dynamic_cell();

        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(500);
    }
    @Test
    public void TR_018_dynamic_column_cells() throws InterruptedException {
        WebDriver driver = getDriver();
     //   click r1c5 dynamic cell - number
        BaseClass.smartTables().click_row1_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(500);
        //right click r1c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click edit cell properties
        BaseClass.smartTables().click_edit_cell_properties_button();
        Thread.sleep(500);
//select dynamic cell type - number dropdown
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(1000);
        BaseClass.smartTables().click_number_dropDown_dynamic_cell();
        Thread.sleep(600);
        BaseClass.staging5().click_save_button();

        //enter in number - r1c5

        Thread.sleep(600);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(600);
        BaseClass.smartTables().enter_row1_dynamic_number();
        Thread.sleep(600);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(600);


        //  click r2c5 dynamic cell - date
        BaseClass.smartTables().click_row2_dynamic();
        Thread.sleep(500);
//switch r2c5 dynamic cell to iframe - to click escape button
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(500);
        //  right click r2c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        // dynamic cell - after right click - click edit cell properties
        Thread.sleep(600);
        BaseClass.smartTables().click_edit_cell_properties_button();
        Thread.sleep(600);
//select dynamic cell type - date dropdown
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(1000);
        BaseClass.smartTables().click_date_dropDown_dynamic_cell();
        //  BaseClass.staging5().click_checkbox_dropDown_dynamic_cell();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();

        //click back into cell and select date of 1st
        Thread.sleep(600);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(600);
        BaseClass.smartTables().click_row2_dynamic();
        Thread.sleep(600);
        BaseClass.smartTables().click_row2_dynamic_date();
        Thread.sleep(600);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(600);


        //click r3c5 dynamic cell - checkbox

        BaseClass.smartTables().click_row3_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(500);
        // right click r3c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click edit cell properties
        BaseClass.smartTables().click_edit_cell_properties_button();
        Thread.sleep(500);
//select dynamic cell type - checkbox dropdown
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(1000);

        BaseClass.smartTables().click_checkbox_dropDown_dynamic_cell();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(600);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(600);
        BaseClass.smartTables().click_row3_dynamic();
        Thread.sleep(600);
        BaseClass.smartTables().click_row3_dynamic_checkbox();
        Thread.sleep(600);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(600);


        //click r4c5 dynamic cell - plain text/dropdown

        BaseClass.smartTables().click_row4_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(500);
        //right click r4c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click edit cell properties
        BaseClass.smartTables().click_edit_cell_properties_button();
        Thread.sleep(500);
//select dynamic cell type - plAINTEXTDROPDOWN dropdown
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(1000);
        BaseClass.smartTables().click_plaintext_dropDown_dynamic_cell();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(600);

        //go into dynamic Plain Text cell - right click and add dropdown value to cell


        BaseClass.smartTables().rightClick_dynamic_cell_plainText_smartTable();
        Thread.sleep(600);

        BaseClass.smartTables().click_manage_dropDown_values_dynamic_cell_dropDown_plaintext();
        Thread.sleep(600);

        BaseClass.staging5().click_unassigned_smartTable_dropdown_values();
        Thread.sleep(500);

        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

        BaseClass.smartTables().click_row4_dynamic();
        Thread.sleep(500);

        BaseClass.smartTables().click_plainText_dropdown_arrow_in_cell_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();

        BaseClass.smartTables().click_smartTable_sectionView();
//for formula dropdown
          driver.navigate().refresh();
        Thread.sleep(1000);

        // click r5c5 dynamic cell - formula

        BaseClass.smartTables().click_row5_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(500);
        //right click r5c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click edit cell properties
        BaseClass.smartTables().click_edit_cell_properties_button();
        Thread.sleep(500);
//select dynamic cell type - formula dropdown
        BaseClass.smartTables().select_column_type_smartTable();
        Thread.sleep(1000);
        BaseClass.smartTables().click_formula_dropDown_dynamic_cell();
        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(600);

        BaseClass.smartTables().click_smartTable_sectionView();

        Thread.sleep(500);
        BaseClass.smartTables().click_row5_dynamic();
        Thread.sleep(500);

        BaseClass.smartTables().click_sum_button_formula();
        Thread.sleep(500);
        BaseClass.smartTables().enter_sum_formula_smartTable();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);

        Thread.sleep(600);
        driver.navigate().refresh();
        Thread.sleep(600);


       // wordbank assign items

        BaseClass.smartTables().click_row6_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(1000);
        //right click r5c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(2000);
        BaseClass.smartTables().click_assign_wordBank_item_smartTable_dropdown();
        Thread.sleep(500);
        BaseClass.staging5().enter_QA_ST_wordBank_unassigned_items();
        Thread.sleep(500);
        BaseClass.staging5().click_QA_wordBank_unassigned_item();
        Thread.sleep(500);
        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1500);
        BaseClass.smartTables().click_row6_dynamic();
        Thread.sleep(500);
        BaseClass.staging5().click_insert_wordbank_arrow_button();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_button_popup();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

//last date column
        BaseClass.smartTables().click_row1_date();
        Thread.sleep(1500);
        BaseClass.smartTables().click_row2_dynamic_date();
        Thread.sleep(600);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);
    }

    @Test
    public void TR_018a_comments_ST_testing_ck5() throws InterruptedException{
//click r1c1 rich text cell and add 2 comments
        BaseClass.smartTables().click_r1_c1();
        Thread.sleep(1000);
        //        Add 2 new comments
        BaseClass.ck5editor().double_click_first_line();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comment_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_comment_to_field();
        Thread.sleep(500);
        BaseClass.ck5editor().double_click_third_line();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comment_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_comment_highlight_is_Visible();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_comment_to_field();
        Thread.sleep(500);
        //resolve second comment
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(1000);
        BaseClass.staging5().click_smartTable_title_header();

        //     BaseClass.ck5editor().click_unresolved_1_comment_icon();
        Thread.sleep(1000);
        BaseClass.smartTables().click_c1_header();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_unresolved_1_comment_icon();
        Thread.sleep(1500);

//click next cell, pl,aintext to add comment to
        BaseClass.smartTables().click_row1_plainText_inside_ST();
        Thread.sleep(500);

        BaseClass.ck5editor().add_new_comment_to_ST();
        Thread.sleep(500);

        //click next cell, number column to add comment to
        BaseClass.smartTables().click_row1_number_inside_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().add_new_comment_to_ST();
        Thread.sleep(500);

//click next cell, formula column to add comment to
        BaseClass.smartTables().click_row1_formula_inside_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().add_new_comment_to_ST();
        Thread.sleep(500);

//click next cell, dynamic column to add comment to and resolve comment
        BaseClass.smartTables().click_row1_dynamic_inside_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().add_new_comment_to_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(500);

//click next cell, date column to add comment to and resolve comment
        BaseClass.smartTables().click_row1_date_inside_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().add_new_comment_to_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(500);

        //click out of ST, double clicking ST header title twice
        BaseClass.staging5().click_smartTable_title_header();
        BaseClass.staging5().click_smartTable_title_header();

        //verify you see yellow comment icon with number 4
        BaseClass.ck5editor().verify_unresolved_4_comment_is_Visible();
//hover over unresolved yellow 4 comment icon and verify
        BaseClass.ck5editor().hover_unresolved_4_comments_icon();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_comments_hover_icon();
        Thread.sleep(500);
//hover over comments side bar status button and verify
        BaseClass.ck5editor().hover_comments_icon_statusBar();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_comments_hover_icon();
        Thread.sleep(500);
//click yellow 4 comment icon
        BaseClass.ck5editor().click_unresolved_4_comments_icon();
        Thread.sleep(1500);
        //verify yellow icons in cells match the comments panel
        BaseClass.ck5editor().verify_unresolved_comments_smartTable();
        Thread.sleep(1500);
        //verify green icons in cells match and so does the the comments panel
        BaseClass.ck5editor().verify_resolved_comments_smartTable();
        Thread.sleep(500);
        BaseClass.ck5editor().click_close_button_popup();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

    }
    @Test
    public void TR_019_revisions_and_notepadInstructions() throws InterruptedException {
        WebDriver driver = getDriver();
        //click revert blue icon and revert to most recent

        BaseClass.staging5().click_smartTable_revisions_blue_icon();
        Thread.sleep(600);
        BaseClass.staging5().click_revert_button_firstLink();
        Thread.sleep(500);
        BaseClass.staging5().verify_done_icon_after_revision_isVisible();
        BaseClass.staging5().capture_recent_revisions_history();
        Thread.sleep(2500);
        BaseClass.staging5().verify_done_icon_after_revision_isNotVisible();

        Thread.sleep(500);

        //right click and add instruction - yellow notepad

        BaseClass.smartTables().click_row7_column5_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(1000);
        //right click r7c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_add_instruction_dynamic_cell_dropdown_value();
        Thread.sleep(500);
        BaseClass.smartTables().enter_smartTable_instruction_text();
        Thread.sleep(500);
        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);
        //click  r8c5 dynamic cell
        BaseClass.smartTables().click_row8_column5_dynamic();
        Thread.sleep(500);
        //verify red corner instruction comment exists on  r7c5 dynamic cell
        BaseClass.smartTables().verify_red_corner_instruction_cell();
        Thread.sleep(500);
        //hover r7c5 dynamic cell - verify instruction text
        BaseClass.smartTables().hover_row7_column5_inside_ST();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
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
    @Test
    public void TR_021_rows_and_headerRows() throws InterruptedException {
        WebDriver driver = getDriver();

//INSERT ROW ABOVE
        BaseClass.smartTables().click_r1_c5_dynamic();
        Thread.sleep(500);
//click escape dynamic cell with data
        BaseClass.smartTables().click_escape_dynamic_cell_with_data();

        Thread.sleep(500);
        //right click r1c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click insert row above
        BaseClass.smartTables().click_insert_row_above_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.smartTables().verify_r1_empty();
        Thread.sleep(500);

        //DELETE ROW 1 - no data
        BaseClass.smartTables().click_r1_c5_dynamic();
        Thread.sleep(500);
//switch r5c5 dynamic cell to iframe
   //     BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
    //    Thread.sleep(500);
//switch r5c5 dynamic cell to iframe - to click escape button
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(500);
        //right click r1c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click insert row above
        BaseClass.smartTables().click_delete_row_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        //   BaseClass.smartTables().verify_con();
        //   Thread.sleep(500);


//INSERT ROW Below
        BaseClass.smartTables().click_r1_c5_dynamic();
        Thread.sleep(500);
        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
        Thread.sleep(500);
        //right click r1c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click insert row above
        BaseClass.smartTables().click_insert_row_below_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.smartTables().verify_r2_empty();
        Thread.sleep(500);


//INSERT Header Above in R1
        BaseClass.smartTables().click_r1_c5_dynamic();
        Thread.sleep(500);
        BaseClass.smartTables().click_escape_dynamic_cell_with_data();
        Thread.sleep(500);
        //right click r1c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click insert row above
        BaseClass.smartTables().click_insert_header_above_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.smartTables().verify_r1_header_is_empty();
        Thread.sleep(500);


        //INSERT Header below empty R1 Header
        BaseClass.smartTables().click_r1_header();
        Thread.sleep(500);
//switch r1c5 dynamic cell to iframe
    //    BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
//switch r1c5 dynamic cell to iframe - to click escape button
        BaseClass.ck5editor().click_escape_current_text();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(500);
        //right click r1_header_smartTable - after escape is clicked
        BaseClass.smartTables().rightClick_r1_header_smartTable();
        Thread.sleep(500);
        // dynamic cell - after right click - click insert row above
        BaseClass.smartTables().click_insert_header_below_button();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.smartTables().verify_r2_header_is_empty();
        Thread.sleep(500);
    }


    @Test
    public void TR_022_duplicate_ST() throws InterruptedException {
        WebDriver driver = getDriver();

        //DUPLICATE
        BaseClass.smartTables().click_smartTable_sectionView_checkbox();
        Thread.sleep(500);
        BaseClass.smartTables().click_duplicate_button_sectionView();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        BaseClass.staging5().compare_smartTable_text();
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










