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
        //  System.out.println(driver.getClass().getSimpleName());
        // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
        driver.navigate().to("https://staging5.openquire.com/reports/669267");
        //  WebDriver driver1 = getDriver();

        BaseClass.quireLogin().enterEmail_bv_sysadmin_level();
        Thread.sleep(1000);
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(3000);

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

            Thread.sleep(600);
            driver.navigate().refresh();
            Thread.sleep(600);


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
            BaseClass.ck5editor().click_escape_current_cell();
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

// click r5c5 dynamic cell - formu











