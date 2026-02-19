import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;
//

public class Smart_Tables_CK5 extends ReusableAnnotations {

    @Test
    public void TR_001_user_login() throws InterruptedException {
        WebDriver driver = getDriver();
        System.out.println(driver.getClass().getSimpleName());
        driver.navigate().to(baseUrl);
        System.out.println("Navigating to: " + baseUrl);
        // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
//        driver.navigate().to("https://staging5.openquire.com/");
        //     driver.navigate().to("https://app-next.openquire.com/");

        //  WebDriver driver1 = getDriver();

        //   String pageTitle = driver.getTitle();
        if (baseUrl.contains("staging")) {
            BaseClass.quireLogin().enter_admin_Email();

        } else {
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
//        driver.navigate().to("https://staging3.openquire.com/reports/1595300");

        BaseClass.staging5().click_modal_close_window();

    }

    @Test
    public void TR_009_navigate_ck5_report() throws InterruptedException {
//
        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(4500);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(3000);
        BaseClass.projectFolderSection().click_new_CK5_ProjectFolderLink();
        Thread.sleep(4500);
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
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(500);
    }
    @Test
    public void TR_011b_toDo_List() throws InterruptedException {
        WebDriver driver = getDriver();
//delete wb item
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(1500);

        BaseClass.ck5editor().select_all_and_backspace_sc_tc_section();

        //   Thread.sleep(500);
        //   BaseClass.ck5editor().clear_current_text_body_ST();
        Thread.sleep(1000);

        BaseClass.ck5editor().click_to_do_list_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_text_toDoList_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);
        BaseClass.reportfoldersection().click_quick_preview_button();
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(2000);

        BaseClass.ck5editor().verify_toDoList_items_ck5_qp();
        driver.close();
        BaseClass.staging5().switchToOriginalTab();
        Thread.sleep(1000);
    }
    @Test
    public void TR_011c_create_ST() throws InterruptedException {
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
    public void TR_011d_verify_report_header_text() throws InterruptedException {
        BaseClass.smartTables().Verify_ST_edit_mode();
        Thread.sleep(1500);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1500);

        BaseClass.smartTables().capture_ST_preview_mode();
        Thread.sleep(500);


    }
    @Test
    public void TR_012_reportTag_richtext() throws InterruptedException {
        //  WebDriver driver = getDriver();

        //   BaseClass.smartTables().click_smartTable_sectionView();

        // Thread.sleep(1000);

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
        Thread.sleep(1500);
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
        Thread.sleep(1500);
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
        Thread.sleep(1500);
        BaseClass.staging5().capture_ReportTagField();
        Thread.sleep(500);


        // go to text body iframe, and delete yellow report tag from text
        BaseClass.smartTables().click_row2_richText();
        Thread.sleep(2500);
        // System.out.println(driver.getPageSource());  // Log page source
        //Thread.sleep(500);

        BaseClass.ck5editor().select_all_and_backspace_RT_cell();
        Thread.sleep(500);
        //go back to parent frame
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(1000);
    }
    @Test
    public void TR_013_richtext_column() throws InterruptedException {

        //   WebDriver driver = getDriver();
//enter rich text - footnote

        BaseClass.smartTables().click_row3_richText();
        Thread.sleep(500);
        BaseClass.ck5editor().click_footNote_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        BaseClass.ck5editor().enter_footnote_text_ck5();
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
        Thread.sleep(2000);

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
        BaseClass.smartTables().click_row1_formula();
        Thread.sleep(1000);

        BaseClass.smartTables().click_escape_button_formula_smartTable();
        Thread.sleep(1000);

        BaseClass.smartTables().rightClick_formula_cell_smartTable();
        Thread.sleep(500);

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
        Thread.sleep(1000);
        //close second tab and go back to default tab
        driver.close();
        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(2500);




        // unlink section link
        BaseClass.smartTables().click_row4_richText();
        Thread.sleep(2000);
        BaseClass.ck5editor().doubleclick_linked_section_text();
        Thread.sleep(500);
        BaseClass.ck5editor().click_unlink_button_sectionLinkView();
        Thread.sleep(500);
        BaseClass.staging5().click_pixel_out_of_section();
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
        Thread.sleep(2500);
        BaseClass.smartTables().verify_deleted_reference_tag_is_Visible();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();

        Thread.sleep(1000);

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
        BaseClass.ck5editor().enter_wb_text_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_wordBank_add_content_row();
        Thread.sleep(500);
        BaseClass.ck5editor().capture_ck5_editor_inner_icons();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_wb_text_ck5();
        Thread.sleep(500);
        BaseClass.templatesSection().clickAddContentRow_instruction();

        //    BaseClass.staging5().click_out_of_modal();
        Thread.sleep(500);

        BaseClass.templatesSection().clickSave2();
        Thread.sleep(5000);
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
        BaseClass.ck5editor().click_escape_current_cell();
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
        BaseClass.ck5editor().click_escape_current_cell();
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
        BaseClass.ck5editor().click_escape_current_cell();
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
        BaseClass.ck5editor().click_escape_current_cell();
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
        Thread.sleep(2000);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(2000);

        BaseClass.smartTables().click_row4_dynamic();
        Thread.sleep(500);

        BaseClass.smartTables().click_plainText_dropdown_arrow_in_cell_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

//for formula dropdown
        driver.navigate().refresh();
        Thread.sleep(1000);

        // click r5c5 dynamic cell - formula

        BaseClass.smartTables().click_row5_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_cell();
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

        //  Thread.sleep(600);
        // driver.navigate().refresh();
        // Thread.sleep(600);


        // wordbank assign items

        BaseClass.smartTables().click_row6_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_cell();
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
        BaseClass.ck5editor().double_click_first_line_cell();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comment_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_comment_to_field();
        Thread.sleep(500);
        BaseClass.ck5editor().double_click_third_line_cell();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comment_icon_ck5();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_comment_highlight_is_Visible();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_second_comment_to_field();
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
        Thread.sleep(1000);

//click next cell, dynamic column to add comment to and resolve comment
        BaseClass.smartTables().click_row1_dynamic_inside_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().add_new_comment_to_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(1000);

//click next cell, date column to add comment to and resolve comment
        BaseClass.smartTables().click_row1_date_inside_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().add_new_comment_to_ST();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(3000);

        //click out of ST, double clicking ST header title twice
        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);

        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);

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
        BaseClass.staging5().click_cancel_button_popup();
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);
        Thread.sleep(500);

        //right click and add instruction - yellow notepad

        BaseClass.smartTables().click_row7_column5_dynamic();
        Thread.sleep(500);
        BaseClass.ck5editor().click_escape_current_cell();
        Thread.sleep(1000);
        //right click r7c5 dynamic cell - after escape is clicked
        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
        Thread.sleep(500);
        BaseClass.smartTables().click_add_instruction_dynamic_cell_dropdown_value();
        Thread.sleep(500);
        BaseClass.smartTables().enter_smartTable_instruction_text();
        Thread.sleep(500);
        BaseClass.smartTables().click_smartTable_sectionView();

//                        BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);
        //click  r8c5 dynamic cell
        BaseClass.smartTables().click_row8_column5_dynamic();
        Thread.sleep(500);
        //verify red corner instruction comment exists on  r7c5 dynamic cell
        BaseClass.smartTables().verify_red_corner_instruction_cell();
        Thread.sleep(500);
        //hover r7c5 dynamic cell - verify instruction text
        BaseClass.smartTables().hover_row7_column5_inside_ST();
        //   Thread.sleep(500);
        //      BaseClass.staging5().click_smartTable_title_header();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
    }

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
        BaseClass.ck5editor().click_escape_current_cell();
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




        //merge row 2


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
        BaseClass.ck5editor().click_escape_current_cell();
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


        //  Thread.sleep(500);
        BaseClass.smartTables().click_r1_header();
        Thread.sleep(2500);
        BaseClass.smartTables().right_click_row4_header_ST();
        Thread.sleep(2500);
        BaseClass.smartTables().click_merge_cells();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);
        BaseClass.smartTables().verify_merged_row_ST_preview_mode();
        Thread.sleep(500);
    }

    @Test
    public void TR_022_duplicate_ST() throws InterruptedException {
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(500);

        //DUPLICATE
        BaseClass.smartTables().click_smartTable_sectionView();
        Thread.sleep(500);

        BaseClass.smartTables().click_smartTable_sectionView_checkbox();
        Thread.sleep(500);
        BaseClass.smartTables().click_duplicate_button_sectionView();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        BaseClass.staging5().compare_smartTable_text();
        Thread.sleep(3000);


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


//    @Test
//    public void TR_002_navigate_ck5_report() throws InterruptedException {
////
//        BaseClass.reportfoldersection().clickReportsTab();
//        BaseClass.reportfoldersection().enterSearchField_QA_Report();
//        Thread.sleep(4500);
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(1000);
//        BaseClass.projectFolderSection().click_CK5_ProjectFolderLink();
//        Thread.sleep(1000);
//        //cloned fm 1104 report
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(2000);
//    }
//    @Test
//    public void TR_003_assign_wb() throws InterruptedException {
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
//    }
//    @Test
//    public void TR_004_create_ST() throws InterruptedException {
//            WebDriver driver = getDriver();
//
////        BaseClass.staging5().capture_Section_row_editor();
////        Thread.sleep(500);
//
//
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(500);
//        BaseClass.staging5().click_add_smartTable_toSection();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_add_column_button_smartTable();
//        Thread.sleep(500);
//
//        //add rich text column, rich text column default
//
//        BaseClass.smartTables().enter_column_name_richText_smartTable();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//        //add plain text column
//
//        BaseClass.smartTables().enter_column_name_plainText_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_plainText_dropDown_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//
//        //add number column
//        BaseClass.smartTables().enter_column_name_number_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_number_dropDown_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_and_add_another_button();
//        Thread.sleep(500);
//
//        //add formula column
//        BaseClass.smartTables().enter_column_name_formula_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_formula_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1500);
//
//
//
//
//        BaseClass.smartTables().click_add_rows_to_bottom_button();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//        Thread.sleep(500);
//
//        driver.navigate().refresh();
//
//        Thread.sleep(500);
//
//
//        //    add date column
//        BaseClass.smartTables().click_c1_header();
//            Thread.sleep(500);
//
//     BaseClass.smartTables().click_smartTable_actions_button();
//        Thread.sleep(500);
//     BaseClass.smartTables().click_add_column_ST_dropdown_button();
//        Thread.sleep(500);
//
//            BaseClass.smartTables().enter_column_name_date_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_date_column_type();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(500);
//                BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        driver.navigate().refresh();
//
//        Thread.sleep(500);
//
//       //     click date column, add to left, add dynamic column
//            BaseClass.smartTables().click_c1_header();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_date_column_dropdown();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_add_column_to_left_dropdown();
//        Thread.sleep(500);
//
//        BaseClass.smartTables().enter_column_name_dynamic_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().select_column_type_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_dynamic_column_type();
//
//        Thread.sleep(1000);
//      //  BaseClass.staging5().click_out_of_modal();
//     //   Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//        //Thread.sleep(1500);
////        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        driver.navigate().refresh();
//
//        Thread.sleep(500);
//
//   // add column to right of date- TO BE DELETED
//
//         //   BaseClass.staging5().click_r1_c1();
//         //   Thread.sleep(500);
//        BaseClass.smartTables().click_c1_header();
//        Thread.sleep(500);
//            BaseClass.smartTables().click_date_column_dropdown();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_add_column_to_right_dropdown();
//
//            BaseClass.smartTables().enter_column_name_toBeDeleted_smartTable();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_save_button();
//       // Thread.sleep(500);
//        Thread.sleep(500);
//
//        driver.navigate().refresh();
//
//        Thread.sleep(500);
////           Thread.sleep(500);
//        BaseClass.smartTables().click_c1_header();
//        Thread.sleep(500);
//      BaseClass.smartTables().click_toBeDeleted_column_dropdown();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_delete_column_dropdown();
//            Thread.sleep(500);
//            driver.switchTo().alert().accept();
//            Thread.sleep(500);
//           BaseClass.smartTables().verify_toBeDeletedColumn_isNot_visible();
//            Thread.sleep(1500);
//
//
//
//
//
//        }
//
//        @Test
//    public void TR_004a_verify_report_header_text() throws InterruptedException {
//            BaseClass.smartTables().Verify_ST_edit_mode();
//            Thread.sleep(1500);
//
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(1500);
//
//            BaseClass.smartTables().capture_ST_preview_mode();
//            Thread.sleep(500);
//
//
//        }
//
//    @Test
//    public void TR_005_richtext_and_reportTag() throws InterruptedException {
//        WebDriver driver = getDriver();
//
//   //     BaseClass.staging5().click_smartTable_sectionView();
//
//       // Thread.sleep(1000);
//
//
////enter rich text
//        BaseClass.smartTables().enter_row1_richText();
//        Thread.sleep(1000);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//        //enter rich text
//        BaseClass.smartTables().enter_r10_c1_richtext();
//        Thread.sleep(1000);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//
//        //enter rich text - report tag
//        BaseClass.smartTables().click_row2_richText();
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
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_ReportTagField();
//        Thread.sleep(500);
//
//
//        //go to text body iframe, double click and edit blue report tag
//        BaseClass.smartTables().click_row2_richText();
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
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_ReportTagField();
//        Thread.sleep(500);
//
//        //go to text body iframe, double click and delete text blue report tag
//        BaseClass.smartTables().click_row2_richText();
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
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().capture_ReportTagField();
//        Thread.sleep(500);
//
//
//        //go to text body iframe, and delete yellow report tag from text
//        BaseClass.smartTables().click_row2_richText();
//        Thread.sleep(500);
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().select_all_body_and_delete_iFrame();
//        Thread.sleep(1000);
//        //go back to parent frame
//        driver.switchTo().parentFrame();
//        BaseClass.staging5().click_section_1_header();
//        Thread.sleep(1000);
//    }
//    @Test
//    public void TR_006_richtext_column() throws InterruptedException {
//
//        WebDriver driver = getDriver();
////enter rich text - footnote
//
//        BaseClass.smartTables().click_row3_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().click_footNote_icon_ck_modal();
//        Thread.sleep(500);
//        BaseClass.staging5().switchTo_footnote_field_ck5_iFrame();
//        BaseClass.templatesSection().enter_instruction_text_iFrame();
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().click_ok_button_footNote();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//
////enter rich text - section link
//
//        BaseClass.smartTables().click_row4_richText();
//        BaseClass.staging5().click_section_link_ck_modal();
//        BaseClass.staging5().click_link_to_section_defaultSectionTitle();
//        BaseClass.staging5().click_submit_button();
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1000);
//    }
//
//    @Test
//    public void TR_007_plaintext_column() throws InterruptedException {
//
////enter plain text - r1c2
//
//            BaseClass.smartTables().enter_row1_plainText();
//            Thread.sleep(1000);
//
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_smartTable_sectionView();
//
////enter dropdown value of 1 text - r2c2
//            Thread.sleep(1000);
//            BaseClass.smartTables().click_row2_plainText();
//            Thread.sleep(2000);
//
//            BaseClass.smartTables().click_second_column_dropdown_smartTable();
//            Thread.sleep(1000);
//
//            BaseClass.smartTables().click_manage_dropDown_values_smartTable_dropDown();
//            Thread.sleep(500);
//
//            BaseClass.staging5().click_unassigned_smartTable_dropdown_values();
//            Thread.sleep(500);
//
//            BaseClass.staging5().click_add_button_unassigned_item();
//            Thread.sleep(500);
//            BaseClass.templatesSection().clickSave2();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_row2_plainText();
//            BaseClass.smartTables().click_plainText_dropdown_arrow_in_cell_smartTable();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//        }
//    @Test
//    public void TR_008_number_and_formula_column() throws InterruptedException {
//
////enter number value r1c3
//        BaseClass.smartTables().enter_row1_number_999();
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1500);
//
//        //enter number value r2c3
//        BaseClass.smartTables().enter_row2_number();
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1500);
//
//        //    enter formula value r1c4
//        BaseClass.smartTables().click_row1_formula();
//        Thread.sleep(1000);
//        BaseClass.smartTables().click_sum_button_formula();
//        Thread.sleep(1000);
//        BaseClass.smartTables().enter_sum_formula_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1000);
//
//        BaseClass.smartTables().rightClick_formula_cell_smartTable();
//        BaseClass.smartTables().click_add_or_edit_cell_reference_tag_button();
//        Thread.sleep(1000);
//        BaseClass.smartTables().enter_cell_name_reference_tag();
//        Thread.sleep(500);
//        BaseClass.staging5().click_save_button();
//        Thread.sleep(1000);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//    }
//    @Test
//    public void TR_009_referenceTag_column() throws InterruptedException {
//        WebDriver driver = getDriver();
//        //enter rich text - reference tag formula link r6c1
////
//        BaseClass.smartTables().click_row6_richText_formula_link();
//        BaseClass.smartTables().click_reference_tag_ck_modal();
//        BaseClass.smartTables().switchTo_reference_tag_ck5_iFrame();
//        BaseClass.smartTables().click_reference_tag_dropDown_ck_modal();
//        Thread.sleep(500);
//
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().click_section_1_header();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_reference_tag_value_1000();
//        Thread.sleep(500);
//        BaseClass.smartTables().update_row1_number_99();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        BaseClass.smartTables().verify_reference_tag_value_100();
//        Thread.sleep(1500);
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
//        // unlink section link
//        BaseClass.smartTables().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().doubleclick_linked_section_text();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
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
//        //enter number for dynamic r1c5
//
//        BaseClass.smartTables().click_row1_dynamic();
//        Thread.sleep(500);
//
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(1500);
//    }
//    @Test
//    public void TR_010_create_assign_WB() throws InterruptedException {
////enter rich text - wordbank r5c1
//            WebDriver driver = getDriver();
//            //wordbank create item
//            BaseClass.smartTables().click_row5_richText();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_first_column_dropdown_smartTable();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_create_wordBank_item_smartTable_dropdown();
//            Thread.sleep(500);
//            BaseClass.staging5().enter_wordbank_ST_new_title();
//            Thread.sleep(900);
//
//            BaseClass.staging5().click_wordBank_add_content_row();
//            Thread.sleep(500);
//
//            BaseClass.templatesSection().switchTo_wordBank_text_field_ck5_iFrame();
//            Thread.sleep(500);
//            BaseClass.templatesSection().enter_wb_text_iFrame();
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
//            Thread.sleep(500);
//            BaseClass.templatesSection().clickSave2();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//
//
//            //wordbank assign item
//            BaseClass.smartTables().click_row5_richText();
//            Thread.sleep(1000);
//
//            BaseClass.smartTables().click_first_column_dropdown_smartTable();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_assign_wordBank_item_smartTable_dropdown();
//            Thread.sleep(500);
//
//            BaseClass.staging5().enter_QA_ST_wordBank_unassigned_items();
//            Thread.sleep(800);
//
//            BaseClass.staging5().click_QA_wordBank_unassigned_item();
//            Thread.sleep(500);
//
//            BaseClass.staging5().click_add_button_unassigned_item();
//            Thread.sleep(500);
//            BaseClass.templatesSection().clickSave2();
//            Thread.sleep(500);
//
//
////add wordbank assigned item to cell
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_row5_richText();
//            Thread.sleep(500);
//
//            BaseClass.staging5().click_insert_wordbank_arrow_button();
//            Thread.sleep(500);
//
//            BaseClass.staging5().click_smartTable_title_header();
////        BaseClass.staging5().click_smartTable_sectionView();
//
////add refresh for semaphore   for      BaseClass.staging5().click_number_dropDown_dynamic_cell();
//
//            Thread.sleep(500);
//            driver.navigate().refresh();
//            Thread.sleep(500);
//        }
//    @Test
//    public void TR_011_dynamic_column_cells() throws InterruptedException {
//            WebDriver driver = getDriver();
//            //click r1c5 dynamic cell - number
//            BaseClass.smartTables().click_row1_dynamic();
//            Thread.sleep(500);
////switch r1c5 dynamic cell to iframe
//            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//            Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//            BaseClass.templatesSection().click_escape_cell_iFrame();
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
//            Thread.sleep(500);
//            //right click r1c5 dynamic cell - after escape is clicked
//            BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//            Thread.sleep(500);
//            // dynamic cell - after right click - click edit cell properties
//            BaseClass.smartTables().click_edit_cell_properties_button();
//            Thread.sleep(500);
////select dynamic cell type - number dropdown
//            BaseClass.smartTables().select_column_type_smartTable();
//            Thread.sleep(1000);
//            BaseClass.smartTables().click_number_dropDown_dynamic_cell();
//            Thread.sleep(600);
//            BaseClass.staging5().click_save_button();
//
//            //enter in number - r1c5
//
//            Thread.sleep(600);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(600);
//            BaseClass.smartTables().enter_row1_dynamic_number();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//            driver.navigate().refresh();
//            Thread.sleep(600);
//
//
//            //  click r2c5 dynamic cell - date
//            BaseClass.smartTables().click_row2_dynamic();
//            Thread.sleep(500);
////switch r2c5 dynamic cell to iframe
//            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//            Thread.sleep(500);
////switch r2c5 dynamic cell to iframe - to click escape button
//            BaseClass.templatesSection().click_escape_cell_iFrame();
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
//            Thread.sleep(500);
//            //  right click r2c5 dynamic cell - after escape is clicked
//            BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//            // dynamic cell - after right click - click edit cell properties
//            Thread.sleep(600);
//            BaseClass.smartTables().click_edit_cell_properties_button();
//            Thread.sleep(600);
////select dynamic cell type - date dropdown
//            BaseClass.smartTables().select_column_type_smartTable();
//            Thread.sleep(1000);
//            BaseClass.smartTables().click_date_dropDown_dynamic_cell();
//            //  BaseClass.staging5().click_checkbox_dropDown_dynamic_cell();
//            Thread.sleep(1000);
//            BaseClass.staging5().click_save_button();
//
//            //click back into cell and select date of 1st
//            Thread.sleep(600);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_row2_dynamic();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_row2_dynamic_date();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//            driver.navigate().refresh();
//            Thread.sleep(600);
//
//
//            //click r3c5 dynamic cell - checkbox
//
//            BaseClass.smartTables().click_row3_dynamic();
//            Thread.sleep(500);
////switch r3c5 dynamic cell to iframe
//            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//            Thread.sleep(500);
////switch r3c5 dynamic cell to iframe - to click escape button
//            BaseClass.templatesSection().click_escape_cell_iFrame();
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
//            Thread.sleep(500);
//            // right click r3c5 dynamic cell - after escape is clicked
//            BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//            Thread.sleep(500);
//            // dynamic cell - after right click - click edit cell properties
//            BaseClass.smartTables().click_edit_cell_properties_button();
//            Thread.sleep(500);
////select dynamic cell type - checkbox dropdown
//            BaseClass.smartTables().select_column_type_smartTable();
//            Thread.sleep(1000);
//
//            BaseClass.smartTables().click_checkbox_dropDown_dynamic_cell();
//            Thread.sleep(1000);
//            BaseClass.staging5().click_save_button();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_row3_dynamic();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_row3_dynamic_checkbox();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//            driver.navigate().refresh();
//            Thread.sleep(600);
//
//
//            //click r4c5 dynamic cell - plain text/dropdown
//
//            BaseClass.smartTables().click_row4_dynamic();
//            Thread.sleep(500);
////switch r4c5 dynamic cell to iframe
//            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//            Thread.sleep(500);
////switch r4c5 dynamic cell to iframe - to click escape button
//            BaseClass.templatesSection().click_escape_cell_iFrame();
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
//            Thread.sleep(500);
//            //right click r4c5 dynamic cell - after escape is clicked
//            BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//            Thread.sleep(500);
//            // dynamic cell - after right click - click edit cell properties
//            BaseClass.smartTables().click_edit_cell_properties_button();
//            Thread.sleep(500);
////select dynamic cell type - plAINTEXTDROPDOWN dropdown
//            BaseClass.smartTables().select_column_type_smartTable();
//            Thread.sleep(1000);
//            BaseClass.smartTables().click_plaintext_dropDown_dynamic_cell();
//            Thread.sleep(1000);
//            BaseClass.staging5().click_save_button();
//            Thread.sleep(600);
//
//            //go into dynamic Plain Text cell - right click and add dropdown value to cell
//
//
//            BaseClass.smartTables().rightClick_dynamic_cell_plainText_smartTable();
//            Thread.sleep(600);
//
//            BaseClass.smartTables().click_manage_dropDown_values_dynamic_cell_dropDown_plaintext();
//            Thread.sleep(600);
//
//            BaseClass.staging5().click_unassigned_smartTable_dropdown_values();
//            Thread.sleep(500);
//
//            BaseClass.staging5().click_add_button_unassigned_item();
//            Thread.sleep(500);
//            BaseClass.templatesSection().clickSave2();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_row4_dynamic();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_plainText_dropdown_arrow_in_cell_smartTable();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_smartTable_sectionView();
//
//            BaseClass.smartTables().click_smartTable_sectionView();
////formula dropdown
//              driver.navigate().refresh();
//            Thread.sleep(1000);
//
//            // click r5c5 dynamic cell - formula
//
//            BaseClass.smartTables().click_row5_dynamic();
//            Thread.sleep(500);
////switch r5c5 dynamic cell to iframe
//            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//            Thread.sleep(500);
////switch r5c5 dynamic cell to iframe - to click escape button
//            BaseClass.templatesSection().click_escape_cell_iFrame();
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
//            Thread.sleep(500);
//            //right click r5c5 dynamic cell - after escape is clicked
//            BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//            Thread.sleep(500);
//            // dynamic cell - after right click - click edit cell properties
//            BaseClass.smartTables().click_edit_cell_properties_button();
//            Thread.sleep(500);
////select dynamic cell type - formula dropdown
//            BaseClass.smartTables().select_column_type_smartTable();
//            Thread.sleep(1000);
//            BaseClass.smartTables().click_formula_dropDown_dynamic_cell();
//            Thread.sleep(1000);
//            BaseClass.staging5().click_save_button();
//            Thread.sleep(600);
//
//            BaseClass.smartTables().click_smartTable_sectionView();
//
//            Thread.sleep(500);
//            BaseClass.smartTables().click_row5_dynamic();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_sum_button_formula();
//            Thread.sleep(500);
//            BaseClass.smartTables().enter_sum_formula_smartTable();
//            Thread.sleep(500);
//
//            BaseClass.smartTables().click_smartTable_sectionView();
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(1000);
//
////        Thread.sleep(600);
////        driver.navigate().refresh();
////        Thread.sleep(600);
//
//
//            //wordbank assign items
//
//            BaseClass.smartTables().click_row6_dynamic();
//            Thread.sleep(500);
////switch r5c5 dynamic cell to iframe
//            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//            Thread.sleep(500);
////switch r5c5 dynamic cell to iframe - to click escape button
//            BaseClass.templatesSection().click_escape_cell_iFrame();
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
//            Thread.sleep(1000);
//            //right click r5c5 dynamic cell - after escape is clicked
//            BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//            Thread.sleep(2000);
//            BaseClass.smartTables().click_assign_wordBank_item_smartTable_dropdown();
//            Thread.sleep(500);
//
//        BaseClass.staging5().enter_QA_ST_wordBank_unassigned_items();
//        Thread.sleep(800);
//         BaseClass.staging5().click_QA_wordBank_unassigned_item();
//            Thread.sleep(500);
//            BaseClass.staging5().click_add_button_unassigned_item();
//            Thread.sleep(500);
//            BaseClass.templatesSection().clickSave2();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(500);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(1500);
//            BaseClass.smartTables().click_row6_dynamic();
//            Thread.sleep(500);
//            BaseClass.staging5().click_insert_wordbank_arrow_button();
//            Thread.sleep(500);
//            BaseClass.staging5().click_smartTable_title_header();
//            Thread.sleep(500);
//        BaseClass.smartTables().click_smartTable_sectionView();
//        Thread.sleep(500);
//
////last date column
//            BaseClass.smartTables().click_row1_date();
//            Thread.sleep(1500);
//            BaseClass.smartTables().click_row2_dynamic_date();
//            Thread.sleep(600);
//            BaseClass.smartTables().click_smartTable_sectionView();
//            Thread.sleep(1000);
//        }
//
//    @Test
//    public void TR_012_revisions_and_notepadInstructions() throws InterruptedException {
//        WebDriver driver = getDriver();
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
//        BaseClass.staging5().click_cancel_button_popup();
//        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
//        Thread.sleep(500);
//
//
//        //right click and add instruction - yellow notepad
//
//        BaseClass.smartTables().click_row7_column5_dynamic();
//        Thread.sleep(500);
//        //switch  dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1c5 dynamic cell - after escape is clicked
//        BaseClass.smartTables().rightClick_dynamic_cell_smartTable();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_add_instruction_dynamic_cell_dropdown_value();
//        Thread.sleep(500);
//        BaseClass.smartTables().enter_smartTable_instruction_text();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        //click  r8c5 dynamic cell
//        BaseClass.smartTables().click_row8_column5_dynamic();
//        Thread.sleep(500);
//        //verify red corner instruction comment exists on  r7c5 dynamic cell
//        BaseClass.smartTables().verify_red_corner_instruction_cell();
//        Thread.sleep(500);
//        //hover r7c5 dynamic cell - verify instruction text
//        BaseClass.smartTables().hover_row7_column5_inside_ST();
//        Thread.sleep(500);
//        //remove the WB modal on left
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        driver.navigate().refresh();
//        Thread.sleep(500);
////        BaseClass.staging5().click_smartTable_sectionView();
////        Thread.sleep(500);
//    }
//
////    @Test
////    public void TR_013_sort_columns() throws InterruptedException{
////
////
////
////        BaseClass.smartTables().click_c1_header();
////        Thread.sleep(1000);
////
////        BaseClass.smartTables().click_sort_columns_except_formula_and_date();
////        Thread.sleep(1000);
////
////        BaseClass.smartTables().click_smartTable_sectionView();
////        Thread.sleep(500);
////
////
////
////    }
//    @Test
//    public void TR_014_rows_and_headerRows() throws InterruptedException {
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
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r5c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
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
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
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
//
//
//    @Test
//    public void TR_015_duplicate_ST() throws InterruptedException {
//        WebDriver driver = getDriver();
//
//        //DUPLICATE
//        BaseClass.smartTables().click_smartTable_sectionView_checkbox();
//        Thread.sleep(500);
//        BaseClass.smartTables().click_duplicate_button_sectionView();
//        Thread.sleep(500);
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//        BaseClass.staging5().compare_smartTable_text();
//        Thread.sleep(3000);
//
//
//    }

}