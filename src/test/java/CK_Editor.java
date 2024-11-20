import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;
//

public class CK_Editor extends ReusableAnnotations {
	//WebDriver driver = getDriver();
    @Test

    public void TR_001_user_login() throws InterruptedException {
        WebDriver driver = getDriver();

        logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());

//        driver.navigate().to("https://staging5.openquire.com/");
        driver.navigate().to("https://staging5.openquire.com/");

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
        Thread.sleep(1000);
    }

    @Test
    public void TR_001a_delete_wb_items() throws InterruptedException {

        BaseClass.staging5().clickLibrariesTab();
        BaseClass.staging5().click_librariesTab_wordBankDropdown();
        Thread.sleep(600);
        BaseClass.templatesSection().enterSearchField_QA_WB();
        Thread.sleep(3000);
        BaseClass.staging5().delete_QA_WB_items();
        Thread.sleep(1000);

    }

    @Test
    public void TR_002_createTemplate() throws InterruptedException {

        //create ck5 template
        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddTemplateButton();
        Thread.sleep(500);
        BaseClass.templatesSection().enterTemplateNameField_ck5();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(1000);
        BaseClass.templatesSection().enterTemplateDescriptionField();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave();
        Thread.sleep(4000);
        BaseClass.templatesSection().captureAlertMessage();
        BaseClass.templatesSection().clickHereLinkTemplate();
        Thread.sleep(1000);

    }

    @Test
    public void TR_002b_template_intro_pages() throws InterruptedException {
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




        //add coverLetter images and instruction text
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(1000);
        BaseClass.staging5().upload_footer_image();
        Thread.sleep(1000);
        BaseClass.staging5().upload_header_image();
        Thread.sleep(1000);

//add report tag into cover letter
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(1500);
        //click report tag icon, switch frame to dropdown, click dropdown, go back to parent frame
        BaseClass.staging5().click_reportTag_icon_ck_modal();
        Thread.sleep(500);
        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
        BaseClass.staging5().click_reportTag_dropDownItem_ck_modal();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        //go to text body iframe, double click yellow report tag, go to parent frame
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_spellCheck_text_iFrame();
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
        BaseClass.staging5().click_title_page_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(500);
        //click grey icon and add instruction text to cover letter
        BaseClass.templatesSection().click_grey_instruction_Icon_template();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_instruction_text_iFrame();
        Thread.sleep(500);
        //switch to parent frame
        driver.switchTo().parentFrame();

        Thread.sleep(500);
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        BaseClass.staging5().captureAlertMessage();

        Thread.sleep(2000);
        BaseClass.templatesSection().verify_yellow_instruction_icon_introPages_is_Visible();
        Thread.sleep(500);
        BaseClass.templatesSection().click_yellow_instruction_icon_introPages();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_instruction_text_modal();
        Thread.sleep(1000);
        // create comments and verify icon in cover letter
        BaseClass.staging5().click_comment_button_icon_introPages();
        BaseClass.staging5().enter_comments_to_field();
        BaseClass.staging5().capture_comments_content();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_button_popup();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);

        BaseClass.staging5().verify_if_comments_icon_isActive();
        Thread.sleep(1000);
        //assign WB item to cover letter
        BaseClass.staging5().click_coverLetter_sectionView();
        BaseClass.staging5().click_introPages_wordbank_grey_icon();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().click_recent_row_item_wordBank();
        BaseClass.staging5().click_add_button_unassigned_item();
        Thread.sleep(1000);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().capture_number_of_wordbanks_associated();
        Thread.sleep(500);
        BaseClass.staging5().verify_blue_wordBank_icon_is_Visible();
        Thread.sleep(500);
        //check revision history
        BaseClass.staging5().click_intro_pages_revisions_icon();
        BaseClass.staging5().capture_revisions_history();
        driver.navigate().refresh();
        Thread.sleep(500);

        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(1000);
        //mark complete
        BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().verify_intro_pages_blue_marked_complete_icon_is_Visible();
        Thread.sleep(500);

        driver.navigate().refresh();

        Thread.sleep(500);


        //add titlePage instruction text
        BaseClass.staging5().click_title_page_sectionView();
        Thread.sleep(1500);
        BaseClass.staging5().upload_header_image();
        Thread.sleep(500);



//add report tag into title page
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(500);
        //click report tag icon, switch frame to dropdown, click dropdown, go back to parent frame
        BaseClass.staging5().click_reportTag_icon_ck_modal();
        Thread.sleep(500);
        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
        Thread.sleep(500);

        BaseClass.staging5().click_reportTag_dropDownItem_ck_modal();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        //go to text body iframe, double click yellow report tag, go to parent frame
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_spellCheck_text_iFrame();
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
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().click_title_page_sectionView();
        Thread.sleep(500);
        //click grey icon and add instruction text to title_page
        BaseClass.templatesSection().click_grey_instruction_Icon_template();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_instruction_text_iFrame();
        Thread.sleep(500);
        //switch to parent frame
        driver.switchTo().parentFrame();

        Thread.sleep(500);
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        BaseClass.staging5().captureAlertMessage();

        Thread.sleep(2000);
        BaseClass.templatesSection().verify_yellow_instruction_icon_introPages_is_Visible();
        Thread.sleep(500);
        BaseClass.templatesSection().click_yellow_instruction_icon_introPages();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_instruction_text_modal();
        Thread.sleep(1000);
        // create comments and verify icon in cover letter
        BaseClass.staging5().click_comment_button_icon_introPages();
        BaseClass.staging5().enter_comments_to_field();
        BaseClass.staging5().capture_comments_content();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_button_popup();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);
        BaseClass.staging5().verify_if_comments_icon_isActive();
        Thread.sleep(1000);
        //assign WB item to cover letter
        BaseClass.staging5().click_title_page_sectionView();
        BaseClass.staging5().click_introPages_wordbank_grey_icon();
        Thread.sleep(1500);

        BaseClass.reportfoldersection().click_recent_row_item_wordBank();
        BaseClass.staging5().click_add_button_unassigned_item();
        BaseClass.templatesSection().clickSave2();
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().capture_number_of_wordbanks_associated();
        Thread.sleep(500);
        BaseClass.staging5().verify_blue_wordBank_icon_is_Visible();
        Thread.sleep(500);
        //check revision history
        BaseClass.staging5().click_intro_pages_revisions_icon();
        BaseClass.staging5().capture_revisions_history();
        Thread.sleep(500);

        driver.navigate().refresh();
        BaseClass.staging5().click_title_page_sectionView();
        Thread.sleep(1000);
        //mark complete
        BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
        Thread.sleep(500);

        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().verify_intro_pages_blue_marked_complete_icon_is_Visible();
        Thread.sleep(500);


        //add executive_summary instruction text
        BaseClass.staging5().click_executive_summary_sectionView();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_spellCheck_text_iFrame();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(500);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);
    }
    @Test
    public void TR_003b_spellcheck_intro_pages_template() throws InterruptedException{
        //turn on spell check and fix all issues - cover letter
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(500);

        BaseClass.staging5().click_and_capture_spell_check_button();
        Thread.sleep(500);
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(4000);
        BaseClass.staging5().capture_spellCheck_errors();
        BaseClass.staging5().fix_intro_spellCheck_errors();
        Thread.sleep(1000);
        BaseClass.staging5().capture_spellCheck_errors();
        Thread.sleep(500);

        //Thread.sleep(1000);

        //turn on spell check and fix all issues - title page
        BaseClass.staging5().click_title_page_sectionView();
        Thread.sleep(3500);
        BaseClass.staging5().capture_spellCheck_errors();
        BaseClass.staging5().fix_intro_spellCheck_errors();
        Thread.sleep(1000);
        BaseClass.staging5().capture_spellCheck_errors();
        Thread.sleep(500);

        //turn on spell check and fix all issues - executive summary page
        BaseClass.staging5().click_executive_summary_sectionView();
        Thread.sleep(4000);
        BaseClass.staging5().capture_spellCheck_errors();
        BaseClass.staging5().fix_intro_spellCheck_errors();
        Thread.sleep(1000);
        BaseClass.staging5().capture_spellCheck_errors();
        Thread.sleep(1000);
    }
    @Test
    public void TR_003c_Template_instructionText_wordBank() throws InterruptedException {

        //click grey icon and add instruction
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);
        BaseClass.templatesSection().clickGreyIcon();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_instruction_text_iFrame();
        Thread.sleep(500);
        WebDriver driver = getDriver();

//switch to parent frame
        driver.switchTo().parentFrame();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);
        BaseClass.templatesSection().clickSave2();
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(2000);
        BaseClass.templatesSection().verify_yellow_instruction_icon_default_section_is_Visible();
        Thread.sleep(500);
        BaseClass.templatesSection().click_yellow_instruction_defaultSection_icon();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_instruction_text_modal();
        Thread.sleep(1000);

        //add wordBank CK modal
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(800);

        BaseClass.staging5().clickWordBank_icon_ck_modal();
        Thread.sleep(800);
//wordBank details
        BaseClass.staging5().enter_wordbank_new_title();
        Thread.sleep(700);

        BaseClass.staging5().clickWordBank_label_dropdown_arrow();

        Thread.sleep(700);

        BaseClass.staging5().clickWordBank_label_dropdown_firstLink();
        Thread.sleep(700);

        //add content row
        BaseClass.templatesSection().clickAddContentRow_instruction();

        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_wordBank_text_field_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_instruction_text_iFrame();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(700);
        BaseClass.staging5().click_wordBank_add_content_row();
        Thread.sleep(500);

        BaseClass.templatesSection().switchTo_wordBank_text_field_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_instruction_text_iFrame();
        Thread.sleep(500);
        driver.switchTo().parentFrame();
        Thread.sleep(100);
        BaseClass.staging5().click_wordBank_assign_to_section();
        Thread.sleep(400);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(800);

        //capture how many blue wordbanks are showing

        BaseClass.staging5().capture_number_of_wordbanks_associated();
        Thread.sleep(1000);

        BaseClass.staging5().click_default_section_title();
        Thread.sleep(700);

    }
    @Test
    public void TR_003d_proj_folder_report_creation() throws InterruptedException {

        //Go into to QA Automation Parent folders

        BaseClass.reportfoldersection().clickReportsTab();
        Thread.sleep(700);
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(3500);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(700);


        //create ck5 project folder

        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        Thread.sleep(500);
        BaseClass.projectFolderSection().enterProjectFolderNameField_CK5();
        Thread.sleep(500);
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        Thread.sleep(500);
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdownssffy
        Thread.sleep(700);

        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(3000);
        BaseClass.projectFolderSection().click_CK5_Template_projectFolder_templatesTab();
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
        BaseClass.reportfoldersection().enterReportName_QA_CK5_Field();
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

    @Test
    public void TR_004_generate_and_email_PDF_Link() throws InterruptedException {
        BaseClass.reportfoldersection().clickGeneratePDFButton();
        Thread.sleep(4500);

        BaseClass.reportfoldersection().captureGeneratedPDF_text();
        Thread.sleep(2000);
        BaseClass.reportfoldersection().clickSaveAndCopyLink();
        Thread.sleep(800);
        BaseClass.reportfoldersection().clickSavedLinksButton();
        Thread.sleep(800);
        BaseClass.reportfoldersection().clickEmailLink_hyperLink();
        Thread.sleep(800);

        BaseClass.reportfoldersection().enter_SendTo_EmailAddress();
        Thread.sleep(800);

        BaseClass.reportfoldersection().enter_email_message_body();
        Thread.sleep(800);

        BaseClass.reportfoldersection().clickSendEmailButton();
        Thread.sleep(800);

        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(2000);


    }

//    @Test
//    public void TR_005_smarttable() throws InterruptedException {
//
////add smart table to section and add columns
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//
//
//        BaseClass.staging5().clickSection_row_editor();
//        Thread.sleep(500);
//        BaseClass.staging5().click_insert_word_bank_blue_icon();
//        Thread.sleep(500);
//        BaseClass.staging5().click_insert_wordbank_add_item_arrow();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_1_header();
//        Thread.sleep(500);
////        BaseClass.staging5().capture_Section_row_editor();
////        Thread.sleep(500);
//
//
//
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_smartTable_toSection();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_column_button_smartTable();
//        Thread.sleep(500);
//
//        //add rich text column, rich text column default
//
//        BaseClass.staging5().enter_column_name_richText_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//        //add plain text column
//
//        BaseClass.staging5().enter_column_name_plainText_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_plainText_dropDown_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//
//        //add number column
//        BaseClass.staging5().enter_column_name_number_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_number_dropDown_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//        //add formula column
//        BaseClass.staging5().enter_column_name_formula_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_formula_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(1500);
//
//        //add dynamic column
//        BaseClass.staging5().enter_column_name_dynamic_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_dynamic_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(1500);
//
//        //add data column
//        BaseClass.staging5().enter_column_name_date_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_date_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1500);
//
//        BaseClass.staging5().click_add_rows_to_bottom_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//
//        Thread.sleep(1000);
//
//
////enter rich text
//        BaseClass.staging5().enter_row1_richText();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//
//        //enter rich text - report tag
//        BaseClass.staging5().click_row2_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().click_reportTag_icon_ck_modal();
//        Thread.sleep(500);
//        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
//        BaseClass.staging5().click_reportTag_dropDownItem_ck_modal();
//        driver.switchTo().defaultContent();
//        //   BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().double_click_report_tag_iframe();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        // in yellow report tag, enter text, test@quiretest.com
//        BaseClass.staging5().enter_email_ReportTagField();
//        Thread.sleep(500);
//        // click out of section, capture report tag text
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_ReportTagField();
//        Thread.sleep(500);
//
//
//        //go to text body iframe, double click and edit blue report tag
//        BaseClass.staging5().click_row2_richText();
//        Thread.sleep(500);
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().double_click_report_tag_iframe();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        // in blue report tag, enter text, automation_new_test@quiretest.com
//        BaseClass.staging5().enter_edited_email_ReportTagField();
//        Thread.sleep(500);
//        // click out of section, capture edited blue report tag text
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_ReportTagField();
//        Thread.sleep(500);
//
//        //go to text body iframe, double click and delete text blue report tag
//        BaseClass.staging5().click_row2_richText();
//        Thread.sleep(500);
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().double_click_report_tag_iframe();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        // in blue report tag, select all and delete
//        BaseClass.staging5().select_all_and_delete_ReportTagField();
//        Thread.sleep(1000);
//        //click blue check box to save empty field
//        BaseClass.pca_xml_section().clickSaveCheckButton();
//        Thread.sleep(500);
//        // click out of section, capture edited blue report tag text
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_ReportTagField();
//        Thread.sleep(500);
//
//
//        //go to text body iframe, and delete yellow report tag from text
//        BaseClass.staging5().click_row2_richText();
//        Thread.sleep(500);
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().select_all_body_and_delete_iFrame();
//        Thread.sleep(1000);
//        //go back to parent frame
//        driver.switchTo().parentFrame();
//        BaseClass.staging5().click_section_1_header();
//        Thread.sleep(1000);
//
//
//
//
//
//
//
//
//
////enter rich text - footnote
//
//        BaseClass.staging5().click_row3_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().click_footNote_icon_ck_modal();
//        Thread.sleep(500);
//        BaseClass.staging5().switchTo_footnote_field_ck5_iFrame();
//        BaseClass.templatesSection().enter_instruction_text_iFrame();
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().click_ok_button_footNote();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
////enter rich text - section link
//
//        BaseClass.staging5().click_row4_richText();
//        BaseClass.staging5().click_section_link_ck_modal();
//        BaseClass.staging5().click_link_to_section_defaultSectionTitle();
//        BaseClass.staging5().click_submit_button();
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
////enter plain text - r1c2
//
//        BaseClass.staging5().enter_row1_plainText();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//
////enter dropdown value of 1 text - r2c2
//        Thread.sleep(1000);
//        BaseClass.staging5().click_row2_plainText();
//        Thread.sleep(2000);
//
//        BaseClass.staging5().click_second_column_dropdown_smartTable();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().click_manage_dropDown_values_smartTable_dropDown();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_unassigned_smartTable_dropdown_values();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_add_button_unassigned_item();
//        Thread.sleep(500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(500);
//        BaseClass.staging5().click_row2_plainText();
//        BaseClass.staging5().click_plainText_dropdown_arrow_in_cell_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
////enter number value r1c3
//        BaseClass.staging5().enter_row1_number();
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1500);
//
//        //enter number value r2c3
//        BaseClass.staging5().enter_row2_number();
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1500);
//
//        //    enter formula value r1c4
//        BaseClass.staging5().click_row1_formula();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_sum_button_formula();
//        Thread.sleep(1000);
//        BaseClass.staging5().enter_sum_formula_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().rightClick_formula_cell_smartTable();
//        BaseClass.staging5().click_add_or_edit_cell_reference_tag_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().enter_cell_name_reference_tag();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//
//        //enter rich text - reference tag formula link r6c1
////
//        BaseClass.staging5().click_row6_richText_formula_link();
//        BaseClass.staging5().click_reference_tag_ck_modal();
//        BaseClass.staging5().switchTo_reference_tag_ck5_iFrame();
//        BaseClass.staging5().click_reference_tag_dropDown_ck_modal();
//        Thread.sleep(500);
//
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_1_header();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_reference_tag_value();
//        Thread.sleep(500);
//
//        //delete reference tag value
//
//
//        //rightclick formula cell with reference tag included
//        BaseClass.staging5().click_row1_formula();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_escape_button_formula_smartTable();
//
//
//        BaseClass.staging5().rightClick_formula_cell_hasReferenceTag_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_or_edit_cell_reference_tag_button();
//
//        //delete reference tag value
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_deleted_reference_tag_is_Visible();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//
//        //enter number for dynamic r1c5
//
//        BaseClass.staging5().click_row1_dynamic();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1500);
//
//
////enter rich text - wordbank r5c1
//
//        //wordbank create item
//        BaseClass.staging5().click_row5_richText();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_first_column_dropdown_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_create_wordBank_item_smartTable_dropdown();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_wordbank_ST_new_title();
//        Thread.sleep(900);
//
//        BaseClass.staging5().click_wordBank_add_content_row();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().switchTo_wordBank_text_field_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().enter_wb_text_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//
//
//
//
//        //wordbank assign item
//        BaseClass.staging5().click_row5_richText();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_first_column_dropdown_smartTable();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_assign_wordBank_item_smartTable_dropdown();
//        Thread.sleep(500);
//
//        BaseClass.staging5().enter_QA_ST_wordBank_unassigned_items();
//        Thread.sleep(800);
//
//        BaseClass.staging5().click_QA_wordBank_unassigned_item();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_add_button_unassigned_item();
//        Thread.sleep(500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(500);
//
//
////add wordbank assigned item to cell
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_row5_richText();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_insert_wordbank_arrow_button();
//        Thread.sleep(500);
//
//    BaseClass.staging5().click_smartTable_title_header();
////        BaseClass.staging5().click_smartTable_sectionView();
//
////add refresh for semaphore   for      BaseClass.staging5().click_number_dropDown_dynamic_cell();
//
//        Thread.sleep(500);
//        driver.navigate().refresh();
//        Thread.sleep(500);
//        //click r1c5 dynamic cell - number
//
//        BaseClass.staging5().click_row1_dynamic();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.staging5().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click edit cell properties
//        BaseClass.staging5().click_edit_cell_properties_button();
//        Thread.sleep(500);
////select dynamic cell type - number dropdown
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_number_dropDown_dynamic_cell();
//        Thread.sleep(600);
//        BaseClass.staging5().click_save_button();
//
//        //enter in number - r1c5
//
//        Thread.sleep(600);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(600);
//        BaseClass.staging5().enter_row1_dynamic_number();
//        Thread.sleep(600);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        driver.navigate().refresh();
//        Thread.sleep(600);
//
//
//        //  click r2c5 dynamic cell - date
//        BaseClass.staging5().click_row2_dynamic();
//        Thread.sleep(500);
////switch r2c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r2c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //  right click r2c5 dynamic cell - after escape is clicked
//        BaseClass.staging5().rightClick_dynamic_cell_smartTable();
//        // dynamic cell - after right click - click edit cell properties
//        Thread.sleep(600);
//        BaseClass.staging5().click_edit_cell_properties_button();
//        Thread.sleep(600);
////select dynamic cell type - date dropdown
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_date_dropDown_dynamic_cell();
//        //  BaseClass.staging5().click_checkbox_dropDown_dynamic_cell();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//
//        //click back into cell and select date of 1st
//        Thread.sleep(600);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(600);
//        BaseClass.staging5().click_row2_dynamic();
//        Thread.sleep(600);
//        BaseClass.staging5().click_row2_dynamic_date();
//        Thread.sleep(600);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        driver.navigate().refresh();
//        Thread.sleep(600);
//
//
//        //click r3c5 dynamic cell - checkbox
//
//        BaseClass.staging5().click_row3_dynamic();
//        Thread.sleep(500);
////switch r3c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r3c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        // right click r3c5 dynamic cell - after escape is clicked
//        BaseClass.staging5().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click edit cell properties
//        BaseClass.staging5().click_edit_cell_properties_button();
//        Thread.sleep(500);
////select dynamic cell type - checkbox dropdown
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().click_checkbox_dropDown_dynamic_cell();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(600);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(600);
//        BaseClass.staging5().click_row3_dynamic();
//        Thread.sleep(600);
//        BaseClass.staging5().click_row3_dynamic_checkbox();
//        Thread.sleep(600);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        driver.navigate().refresh();
//        Thread.sleep(600);
//
//
//        //click r4c5 dynamic cell - plain text/dropdown
//
//        BaseClass.staging5().click_row4_dynamic();
//        Thread.sleep(500);
////switch r4c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r4c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r4c5 dynamic cell - after escape is clicked
//        BaseClass.staging5().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click edit cell properties
//        BaseClass.staging5().click_edit_cell_properties_button();
//        Thread.sleep(500);
////select dynamic cell type - plAINTEXTDROPDOWN dropdown
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_plaintext_dropDown_dynamic_cell();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(600);
//
//        //go into dynamic Plain Text cell - right click and add dropdown value to cell
//
//
//        BaseClass.staging5().rightClick_dynamic_cell_plainText_smartTable();
//        Thread.sleep(600);
//
//        BaseClass.staging5().click_manage_dropDown_values_dynamic_cell_dropDown_plaintext();
//        Thread.sleep(600);
//
//        BaseClass.staging5().click_unassigned_smartTable_dropdown_values();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_add_button_unassigned_item();
//        Thread.sleep(500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_row4_dynamic();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_plainText_dropdown_arrow_in_cell_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//
//        BaseClass.staging5().click_smartTable_sectionView();
//
//      //  driver.navigate().refresh();
//        Thread.sleep(1000);
//
//        // click r5c5 dynamic cell - formula
//
//        BaseClass.staging5().click_row5_dynamic();
//        Thread.sleep(500);
////switch r5c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r5c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r5c5 dynamic cell - after escape is clicked
//        BaseClass.staging5().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click edit cell properties
//        BaseClass.staging5().click_edit_cell_properties_button();
//        Thread.sleep(500);
////select dynamic cell type - formula dropdown
//        BaseClass.staging5().select_column_type_smartTable();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_formula_dropDown_dynamic_cell();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(600);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//
//        Thread.sleep(500);
//        BaseClass.staging5().click_row5_dynamic();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_sum_button_formula();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_sum_formula_smartTable();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
////        Thread.sleep(600);
////        driver.navigate().refresh();
////        Thread.sleep(600);
//
//
//        //wordbank assign items
//
//        BaseClass.staging5().click_row6_dynamic();
//        Thread.sleep(500);
////switch r5c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r5c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(1000);
//        //right click r5c5 dynamic cell - after escape is clicked
//        BaseClass.staging5().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_assign_wordBank_item_smartTable_dropdown();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_QA_wordBank_unassigned_items();
//        Thread.sleep(500);
//        BaseClass.staging5().click_QA_wordBank_unassigned_item();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_button_unassigned_item();
//        Thread.sleep(500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1500);
//        BaseClass.staging5().click_row6_dynamic();
//        Thread.sleep(500);
//        BaseClass.staging5().click_insert_wordbank_arrow_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
////        BaseClass.staging5().click_smartTable_sectionView();
////        Thread.sleep(500);
//
////last date column
//        BaseClass.staging5().click_row1_date();
//        Thread.sleep(1500);
//        BaseClass.staging5().click_row2_dynamic_date();
//        Thread.sleep(600);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//
//        //click revert blue icon and revert to most recent
//
//        BaseClass.staging5().click_smartTable_revisions_blue_icon();
//        Thread.sleep(600);
//        BaseClass.staging5().click_revert_button_firstLink();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_done_icon_after_revision_isVisible();
//        BaseClass.staging5().capture_recent_revisions_history();
//        Thread.sleep(2500);
//        BaseClass.staging5().verify_done_icon_after_revision_isNotVisible();
//
//
//
//
//        //right click and add instruction - yellow notepad
//
//        BaseClass.staging5().click_row7_column5_dynamic();
//        Thread.sleep(500);
//        //switch  dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        //switch  dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(1000);
//        //right click r7c5 dynamic cell - after escape is clicked
//        BaseClass.staging5().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_instruction_dynamic_cell_dropdown_value();
//        Thread.sleep(500);
//        BaseClass.staging5().enter_smartTable_instruction_text();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        //click  r8c5 dynamic cell
//        BaseClass.staging5().click_row8_column5_dynamic();
//        Thread.sleep(500);
//        //verify red corner instruction comment exists on  r7c5 dynamic cell
//        BaseClass.staging5().verify_red_corner_instruction_cell();
//        Thread.sleep(500);
//        //hover r7c5 dynamic cell - verify instruction text
//        BaseClass.staging5().hover_row7_column5_inside_ST();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        driver.navigate().refresh();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_smartTable_sectionView_checkbox();
//        Thread.sleep(500);
//        BaseClass.staging5().click_duplicate_button_sectionView();
//        Thread.sleep(500);
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//        BaseClass.staging5().compare_smartTable_text();
//        Thread.sleep(3000);
//
//
//
//    }

}

