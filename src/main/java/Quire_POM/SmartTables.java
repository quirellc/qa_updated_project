package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.util.List;

public class SmartTables extends ReusableAnnotations {
    //]must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public SmartTables(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor




    @FindBy(xpath = "//a[normalize-space()='Add Column']")
    WebElement add_column_button_smartTable;

    public void click_add_column_button_smartTable() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_column_button_smartTable, logger, " add_column_button_smartTable ");
    }


    @FindBy(xpath = "//input[@id='column_definition_name']")
    WebElement column_name_smartTable;

    public void enter_column_name_richText_smartTable() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, column_name_smartTable, "Rich Text", logger, " column_name_smartTable ");
    }

    public void enter_column_name_toBeDeleted_smartTable() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, column_name_smartTable, "To Be Deleted", logger, " to be deleted column_name_smartTable ");
    }

    public void enter_column_name_plainText_smartTable() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, column_name_smartTable, "Plain text / dropdown", logger, " column_name_smartTable ");
    }

    public void enter_column_name_number_smartTable() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, column_name_smartTable, "Number", logger, " column_name_smartTable ");
    }

    public void enter_column_name_formula_smartTable() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, column_name_smartTable, "Formula", logger, " column_name_smartTable ");
    }

    public void enter_column_name_date_smartTable() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, column_name_smartTable, "Date", logger, " Date ");
    }

    public void enter_column_name_dynamic_smartTable() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, column_name_smartTable, "Dynamic", logger, " Dynamic ");
    }

    // @FindBy(xpath = "//select[@class='js-data-type-selector column-type-selector selectized']")
    @FindBy(xpath = "//div[@class='js-data-type-selector-container']")
    WebElement column_type_smartTable;

    public void select_column_type_smartTable() {
        ReusableMethodsLoggersPOM.clickMethod(driver, column_type_smartTable, logger, " column_type_smartTable ");
    }

    @FindBy(xpath = "//span[normalize-space()='Plain Text / Dropdown']")
    WebElement plainText_dropDown_column_type;

    public void click_plainText_dropDown_column_type() {
        ReusableMethodsLoggersPOM.clickMethod(driver, plainText_dropDown_column_type, logger, " plainText_dropDown_column_type ");
    }

    @FindBy(xpath = "//span[normalize-space()='Number']")
    WebElement number_dropDown_column_type;

    public void click_number_dropDown_column_type() {
        ReusableMethodsLoggersPOM.clickMethod(driver, number_dropDown_column_type, logger, " number_dropDown_column_type ");
    }

    @FindBy(xpath = "//div[normalize-space()='Accepts numerical values only.']")
    WebElement number_dropDown_dynamic_cell;

    public void click_number_dropDown_dynamic_cell() {
        ReusableMethodsLoggersPOM.clickMethod(driver, number_dropDown_dynamic_cell, logger, " number_dropDown_dynamic_cell ");
    }


    @FindBy(xpath = "//i[@class='fa fa-calendar']")
    WebElement date_dropDown_dynamic_cell;

    public void click_date_dropDown_dynamic_cell() {
        ReusableMethodsLoggersPOM.clickMethod(driver, date_dropDown_dynamic_cell, logger, " date_dropDown_dynamic_cell ");
    }

    @FindBy(xpath = "//div[normalize-space()='Displays a checkbox that can be checked or unchecked with a click.']")
//@FindBy(xpath = "(//i[@class='fa fa-check-square'])[3]")
    WebElement checkbox_dropDown_dynamic_cell;

    public void click_checkbox_dropDown_dynamic_cell() {
        ReusableMethodsLoggersPOM.clickMethod(driver, checkbox_dropDown_dynamic_cell, logger, " checkbox_dropDown_dynamic_cell ");
    }

    @FindBy(xpath = "//div[normalize-space()='Accepts one or more plain text values. Pre-defined choices can be included as a dropdown menu.']")
    WebElement plaintext_dropDown_dynamic_cell;

    public void click_plaintext_dropDown_dynamic_cell() {
        ReusableMethodsLoggersPOM.clickMethod(driver, plaintext_dropDown_dynamic_cell, logger, " plaintext_dropDown_dynamic_cell ");
    }

    @FindBy(xpath = "//div[@class='selectize-dropdown single js-data-type-selector column-type-selector']//div[@class='selectize-dropdown-content']//i[@class='fa fa-line-chart']")
    WebElement formula_dropDown_dynamic_cell;

    public void click_formula_dropDown_dynamic_cell() {
        ReusableMethodsLoggersPOM.clickMethod(driver, formula_dropDown_dynamic_cell, logger, " formula_dropDown_dynamic_cell ");
    }


    @FindBy(xpath = "//span[normalize-space()='Formula']")
    WebElement formula_dropDown_column_type;

    public void click_formula_column_type() {
        ReusableMethodsLoggersPOM.clickMethod(driver, formula_dropDown_column_type, logger, " formula_dropDown_column_type ");
    }


    @FindBy(xpath = "//div[@class='selectize-dropdown single js-data-type-selector column-type-selector']//div[7]")
    WebElement dynamic_dropdown_column_type;

    public void click_dynamic_column_type() {
        ReusableMethodsLoggersPOM.clickMethod(driver, dynamic_dropdown_column_type, logger, " dynamic_dropdown_column_type ");
    }


    @FindBy(xpath = "//span[normalize-space()='Date']")
    WebElement date_column_type;

    public void click_date_column_type() {
        ReusableMethodsLoggersPOM.clickMethod(driver, date_column_type, logger, " date_column_type ");
    }


    @FindBy(xpath = "//a[@class='btn btn-sm btn-ghost js-info-table-table-footer-add-row-action']")
    WebElement add_rows_to_bottom_button;

    public void click_add_rows_to_bottom_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_rows_to_bottom_button, logger, " add_rows_to_bottom_button ");
    }

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    WebElement smart_table;

    public void click_smart_table() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, smart_table, logger, " smart_table ");
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, continue editing.']")
    WebElement continue_editing_window;

    public void click_continue_editing() {
        ReusableMethodsLoggersPOM.click_modal(driver, continue_editing_window, logger, " continue_editing_popup_screen ");
    }

    @FindBy(xpath = "(//div[@class='column-heading-wrap'])[1]")
    WebElement column1_header;

    public void click_c1_header() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, column1_header, logger, " column1_header ");
    }

    //@FindBy(xpath = "(//td[@class='text-left q_type_richtext'])[1]")
    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[1]")
    WebElement row1_column1;

//    public void enter_row1_long_richText() throws InterruptedException {
//        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row1_column1, "qa automation rich rich text roww 1 columm 1", logger, " row1_column1 ");
//    }
    public void enter_row1_richText() {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row1_column1, "QA Automation line 1\n\nQA Automation line 3", logger, "row1_column1");
    }

    public void enter_row1_Spellcheck_richText() {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row1_column1, "QA Automationn Testing Script - Spell Check Check Section", logger, "row1_column1");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[10]//td[1]")
    WebElement row8_column1;

    public void enter_r10_c1_richtext() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row8_column1, "automation rich text roww 10 columm 1", logger, " row10_column1 ");
    }

    public void click_r1_c1() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row1_column1, logger, " row1_column1 ");
    }

    @FindBy(xpath = "//textarea[@class='handsontableInput']")
    WebElement dynamic_cell_with_data;

    public void click_escape_dynamic_cell_with_data() {
        ReusableMethodsLoggersPOM.escapeMethod(driver, dynamic_cell_with_data, logger, "dynamic_cell_with_data");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[5]")
    WebElement row1_column5_number;

    public void enter_row1_dynamic_number() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row1_column5_number, "0.99", logger, " row1_column5_number ");
    }

    public void click_r1_c5_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row1_column5_number, logger, " row1_column5_dynamic ");
    }

    public void verify_r1_empty() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, row1_column5_number, logger, " row1_column5_text");
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, row1_column1, logger, " row1_column1_text");
    }

    public void verify_r2_empty() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, row2_column1, logger, " row1_column5_text");
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, row2_column5, logger, " row1_column1_text");
    }


    @FindBy(xpath = "(//th[@role='rowheader']//span[@class='rowHeader' and text()='4'])[2]")
    WebElement row4_header_ST;
    @FindBy(xpath = "(//tr[@aria-rowindex='6']//span[@class='rowHeader'])[2]")
    WebElement row4_header_ST1;

    public void right_click_row4_header_ST() throws InterruptedException {
       // ReusableMethodsLoggersPOM.clickMethod(driver, row4_header_ST, logger, " row2_header_ST ");
//Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, row4_header_ST, logger, " row4_header_ST ");
        ReusableMethodsLoggersPOM.rightClickMethod(driver, row4_header_ST, logger, " row4_header_ST ");

        try {
    if (merge_cells.isDisplayed()) {
        return;
    }
    } catch(Exception e){
        ReusableMethodsLoggersPOM.rightClickMethod(driver, row4_header_ST1, logger, " row4_header_ST ");
    }

}

    @FindBy(xpath = "//div[normalize-space()='Merge cells']")
    WebElement merge_cells;

    public void click_merge_cells() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, merge_cells, logger, " merge_cells ");
    }

    @FindBy(xpath = "//td[contains(@class, 'smartTable-cellMerged') and contains(@class, 'smartTable-cellMergedParent')][1]")
    WebElement merged_row_ST_preview_mode;

    public void verify_merged_row_ST_preview_mode() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, merged_row_ST_preview_mode, true, logger, " merged_row_ST_preview_mode ");
    }

    @FindBy(xpath = "//div[@class='ht_clone_top handsontable']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//table[@role='presentation']//thead[@role='rowgroup']//tr[2]//th[@role='columnheader']//div[@role='presentation']//span[@role='presentation']")
    List<WebElement> ST_edit_mode_header;

    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[1]")
    WebElement sorted_column_first_cell;

    public void click_sort_columns_except_formula_and_date() throws InterruptedException {
        String[] expectedTexts = {"automation rich text roww 10 columm 1", "1", "0.01", "0.99"};

        int column_count = ST_edit_mode_header.size();
        for (int i = 0; i < column_count; i++) {
            // Skip the 4th (index 3) and 6th (index 5) elements
            if (i == 3 || i == 5) {
                continue;
            }
            ReusableMethodsLoggersPOM.clickMethod(driver, ST_edit_mode_header.get(i), logger, " header column title #: " + (i + 1));
            BaseClass.smartTables().click_smartTable_sectionView();
            Thread.sleep(1500); // Use with caution, prefer WebDriverWait if possible

            WebElement sortedColumnFirstCell = driver.findElement(By.xpath("//table[@class='table info-table']//tr[1]//td[" + (i + 1) + "]"));

            String actualText = sorted_column_first_cell.getText();
            String expectedText = expectedTexts[i];
            if (actualText.equals(expectedText)) {
                System.out.println("Sorted first cell matches expected:  " + actualText);
                logger.log(LogStatus.PASS, "Sorted first cell matches expected:  " + actualText);
            } else {
                System.out.println("Unable to confirm sorted first cellExpected: " + expectedText + ", Actual: " + actualText);
                logger.log(LogStatus.FAIL, "Unable to confirm sorted first cellExpected: " + expectedText + ", Actual: " + actualText);
            }
            BaseClass.smartTables().click_c1_header();
            Thread.sleep(1500); // Use with caution, prefer WebDriverWait if possible

        }
    }
    public void Verify_ST_edit_mode() throws InterruptedException {
        String[] expectedTexts = {"Rich Text", "Plain text / dropdown", "Number", "Formula", "Dynamic", "Date"};

        // Ensure sizes match before proceeding
        if (ST_edit_mode_header.size() != expectedTexts.length) {
            System.out.println("Header size does not match the expected number of headers.");
            System.out.println("Expected size: " + expectedTexts.length + ", Actual size: " + ST_edit_mode_header.size());
            logger.log(LogStatus.FAIL, "Expected size: " + expectedTexts.length + ", Actual size: " + ST_edit_mode_header.size());

            return;
        }
        // Using a standard for loop to track the index
        for (int i = 0; i < ST_edit_mode_header.size(); i++) {
            String actualText = ST_edit_mode_header.get(i).getText().trim();
            String expectedText = expectedTexts[i];
            if (actualText.equals(expectedText)) {
                System.out.println("Header " + (i + 1) + " matches: " + actualText);
                logger.log(LogStatus.PASS, "Header " + (i + 1) + " matches: " + actualText);
            } else {
                System.out.println("Header " + (i + 1) + " does not match.");
                System.out.println("Expected: " + expectedText + ", Actual: " + actualText);
                logger.log(LogStatus.FAIL, "UNABLE TO CONFIRM , Header " + (i + 1) + " Expected: " + expectedText + ", Actual: " + actualText);
            }
        }
    }


    @FindBy(xpath = "//table[@class='table info-table']//thead/tr[@class='column_headers']")
    WebElement ST_preview_mode_header;

    public void capture_ST_preview_mode() throws InterruptedException {
        String text = ReusableMethodsLoggersPOM.captureTextMethod(driver, ST_preview_mode_header, logger, " header_row_1 ");

        if (text.contains("Rich Text\n" +
                "Plain text / dropdown\n" +
                "Number\n" +
                "Formula\n" +
                "Dynamic\n" +
                "Date")) {
            System.out.println("Headers text matches whats expected");
            logger.log(LogStatus.PASS, "Headers text matches whats expected");
        }else{
            System.out.println("UNABLE TO VERIFY MATCH, Headers are not same");
            logger.log(LogStatus.FAIL, "UNABLE TO VERIFY MATCH, Headers are not same: text found:  " + text );
        }
    }




    @FindBy(xpath = "(//tr[@class='qit-header-row mergeCells-ignore'])[1]")
    WebElement row_1_header_content;

    public void verify_r1_header_is_empty() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, row_1_header_content, logger, " header_row_1 ");
    }

    public void click_r1_header() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row_1_header_content, logger, " header_row_1 ");
    }

    @FindBy(xpath = "(//tr[@class='qit-header-row mergeCells-ignore'])[2]")
    WebElement row_2_header_content;

    public void verify_r2_header_is_empty() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, row_2_header_content, logger, " row_2_header_content ");
    }
    @FindBy(xpath = "//table[@class='htCore']//tr[1]//td[2]")
    WebElement row1_column2_inside_ST;
    public void click_row1_plainText_inside_ST() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row1_column2_inside_ST, logger, " row1_column2_inside_ST ");
        Thread.sleep(1000);
        if (!BaseClass.smartTables().verify_comment_appears_to_ST()) {
            ReusableMethodsLoggersPOM.doubleClickMethod(driver, row1_column2_inside_ST, logger, " row1_column2_inside_ST ");
        }
     //   Thread.sleep(1000);
      //  ReusableMethodsLoggersPOM.clickMethod(driver, row1_column2_inside_ST, logger, " row1_column2_inside_ST ");

    }

    @FindBy(xpath = "//table[@class='htCore']//tr[1]//td[3]")
    WebElement row1_column3_inside_ST;
    public void click_row1_number_inside_ST() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row1_column3_inside_ST, logger, " row1_column3_inside_ST ");
        Thread.sleep(1000);
        if (!BaseClass.smartTables().verify_comment_appears_to_ST()) {
            ReusableMethodsLoggersPOM.clickMethod(driver, row1_column3_inside_ST, logger, " row1_column3_inside_ST ");
        }

    }

    @FindBy(xpath = "//table[@class='htCore']//tr[1]//td[4]")
    WebElement row1_column4_inside_ST;
    public void click_row1_formula_inside_ST() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row1_column4_inside_ST, logger, " row1_column4_inside_ST ");
        Thread.sleep(1000);
        if (!BaseClass.smartTables().verify_comment_appears_to_ST()) {
            ReusableMethodsLoggersPOM.clickMethod(driver, row1_column4_inside_ST, logger, " row1_column4_inside_ST ");
        }
    }

    @FindBy(xpath = "//table[@class='htCore']//tr[1]//td[5]")
    WebElement row1_column5_inside_ST;
    public void click_row1_dynamic_inside_ST() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row1_column5_inside_ST, logger, " row1_column5_inside_ST ");
        Thread.sleep(1000);
        if (!BaseClass.smartTables().verify_comment_appears_to_ST()) {
            ReusableMethodsLoggersPOM.clickMethod(driver, row1_column5_inside_ST, logger, " row1_column5_inside_ST ");
        }

    }
    @FindBy(xpath = "//div[@id='comments-createNewThreadAction']")
    WebElement add_new_comment_button;

    @FindBy(xpath = "//li[@class='section-comments js-sectionComments flex-container flex-align-center flex-content-center js-commentsActionTooltipProvider unresolved-comments comments-unresolvedIcon']")
    WebElement unresolved_comments_icon;
    public boolean verify_comment_appears_to_ST() throws InterruptedException {
        try {
            if (add_new_comment_button.isDisplayed()) {
                return true;
            }
        } catch (Exception e) {
            // Element not found or not attached to DOM
        }

        // Recovery actions
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(1000);
        ReusableMethodsLoggersPOM.clickMethod(driver, unresolved_comments_icon, logger, "unresolved_comments_icon");

        return false;
    }


    @FindBy(xpath = "//table[@class='htCore']//tr[1]//td[6]")
    WebElement row1_column6_inside_ST;
    public void click_row1_date_inside_ST() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver,row1_column6_inside_ST , logger, " row1_column6_inside_ST ");
        Thread.sleep(1000);
        if (!BaseClass.smartTables().verify_comment_appears_to_ST()) {
            ReusableMethodsLoggersPOM.clickMethod(driver,row1_column6_inside_ST , logger, " row1_column6_inside_ST ");
        }
    }




    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[2]")
    WebElement row1_column2;

    public void enter_row1_plainText() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row1_column2, "qa plain text r1c2", logger, " row1_column2 ");
    }


    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[3]")
    WebElement row1_column3;

    public void update_row1_number_99() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row1_column3,  logger, " row1_column3 ");

        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, dynamic_cell_with_data, "99.99", logger, " 99.99 ");    }

    public void enter_row1_number_999() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row1_column3, "999.99", logger, " 999.99 ");

    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[5]")
    WebElement row1_column5;

    public void click_row1_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row1_column5, logger, " row1_column5 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[6]")
    WebElement row1_column6_date;

    public void click_row1_date() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row1_column6_date, logger, " row1_column6_date ");
    }

    @FindBy(xpath = "//div[@class='ht_clone_top handsontable']//div[@class='wtHolder']//div[@class='wtHider']//div[@class='wtSpreader']//table[@class='htCore']//thead//tr//th//span[@class='colHeader'][normalize-space()='Date']//a[@class='column-definition-settings-dropdown js-column-definition-settings-dropdown']")
    WebElement date_column_dropdown;

    public void click_date_column_dropdown() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, date_column_dropdown, logger, " date_column_dropdown ");
    }

@FindBy(xpath = "//div[@class='ht_clone_top handsontable']//div[@class='wtHolder']//div[@class='wtHider']//div[@class='wtSpreader']//table[@class='htCore']//thead//tr//th//span[@class='colHeader'][normalize-space()='To Be Deleted']//a[@class='column-definition-settings-dropdown js-column-definition-settings-dropdown']")
//@FindBy(xpath = "(//a[@class='column-definition-settings-dropdown js-column-definition-settings-dropdown'])[14]")
WebElement toBeDeleted_column_dropdown;

    public void click_toBeDeleted_column_dropdown() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, toBeDeleted_column_dropdown, logger, " toBeDeleted_column_dropdown ");
    }

    public void verify_toBeDeletedColumn_isNot_visible() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, toBeDeleted_column_dropdown, false, logger, " toBeDeleted_column_dropdown ");
    }



    @FindBy(xpath = "//span[normalize-space()='Delete Column']")
    WebElement delete_column_dropdown;

    public void click_delete_column_dropdown() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, delete_column_dropdown, logger, " delete_column_dropdown ");
    }

    @FindBy(xpath = "//span[normalize-space()='Add Column to the Right']")
    WebElement add_column_to_right_dropdown;

    public void click_add_column_to_right_dropdown() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, add_column_to_right_dropdown, logger, " add_column_to_right_dropdown ");
    }

    @FindBy(xpath = "//span[normalize-space()='Add Column to the Left']")
    WebElement add_column_to_left_dropdown;

    public void click_add_column_to_left_dropdown() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, add_column_to_left_dropdown, logger, " add_column_to_left_dropdown ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[2]//td[5]")
    WebElement row2_column5;

    public void click_row2_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row2_column5, logger, " row2_column5 ");
    }

    @FindBy(xpath = "//button[normalize-space()='1']")
    WebElement row2_column5_date;

    public void click_row2_dynamic_date() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row2_column5_date, logger, " row2_column5_date ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[3]//td[5]")
    WebElement row3_column5;

    public void click_row3_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row3_column5, logger, " row3_column5 ");
    }

    @FindBy(xpath = "//input[@class='htCheckboxRendererInput']")
    WebElement row3_column5_checkbox;

    public void click_row3_dynamic_checkbox() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row3_column5_checkbox, logger, " row3_column5_checkbox ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[4]//td[5]")
    WebElement row4_column5;

    public void click_row4_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row4_column5, logger, " row4_column5 ");
    }

    @FindBy(xpath = "//*[normalize-space()='Manage Dropdown Values...']")
    WebElement manage_dropDown_values_dynamic_cell_dropDown_plaintext;

    public void click_manage_dropDown_values_dynamic_cell_dropDown_plaintext() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, manage_dropDown_values_dynamic_cell_dropDown_plaintext, logger, " manage_dropDown_values_dynamic_cell_dropDown_plaintext ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[5]//td[5]")
    WebElement row5_column5;

    public void click_row5_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row5_column5, logger, " row5_column5 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[6]//td[5]")
    WebElement row6_column5;

    public void click_row6_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row6_column5, logger, " row6_column5 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[7]//td[5]")
    WebElement row7_column5;

    public void click_row7_column5_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row7_column5, logger, " row7_column5_dynamic");
    }

    @FindBy(xpath = "//table[@class='htCore']//tr[7]//td[5]")
    WebElement row7_column5_inside_ST;

    public void hover_row7_column5_inside_ST() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, row7_column5_inside_ST, logger, " row7_column5_inside_ST ");
    }


    @FindBy(xpath = "//table[@class='table info-table']//tr[8]//td[5]")
    WebElement row8_column5;

    public void click_row8_column5_dynamic() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, row8_column5, logger, " row8_column5_dynamic");
    }

    @FindBy(xpath = "//div[normalize-space()='Add Instruction']")
    WebElement add_instruction_dynamic_cell_dropdown_value;

    public void click_add_instruction_dynamic_cell_dropdown_value() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_instruction_dynamic_cell_dropdown_value, logger, " add_instruction_dynamic_cell_dropdown_value");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[10]//td[5]")
    WebElement row9_column5;

    public void enter_r10_c5_dynamic_richtext() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row9_column5, "automation rich text roww 10 columm 5", logger, " row10_column5_dynamic");
    }


    @FindBy(xpath = "//td[@class='htLeft htCommentCell']")
    WebElement red_corner_instruction_cell;

    public void verify_red_corner_instruction_cell() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, red_corner_instruction_cell, true, logger, " red_corner_instruction_comment_cell");
    }

    @FindBy(xpath = "//textarea[@class='htCommentTextArea']")
    WebElement smartTable_instruction_text;

    public void enter_smartTable_instruction_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, smartTable_instruction_text, "QA Automation - SmartTable Instruction text ", logger, " add_instruction_dynamic_cell_dropdown_value");
    }

    public void verify_smartTable_instruction_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, smartTable_instruction_text, true, logger, " smartTable_instruction_text");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[2]//td[3]")
    WebElement row2_column3;

    public void enter_row2_number() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, row2_column3, "0.01", logger, " row2_column3 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[2]//td[1]")
    WebElement row2_column1;

    public void click_row2_richText() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row2_column1, logger, " row2_column1 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[2]//td[2]")
    WebElement row2_column2;

    public void click_row2_plainText() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row2_column2, logger, " row2_column2 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[3]//td[1]")
    WebElement row3_column1;

    public void click_row3_richText() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row3_column1, logger, " row3_column1 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[4]//td[1]")
    WebElement row4_column1;

    public void click_row4_richText() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row4_column1, logger, " row4_column1 ");
    }


    @FindBy(xpath = "//table[@class='table info-table']//tr[5]//td[1]")
    WebElement row5_column1;

    public void click_row5_richText() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row5_column1, logger, " row5_column1 ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//thead")
    WebElement smartTable_header;

    public void click_smartTable_header() {
        ReusableMethodsLoggersPOM.clickMethod(driver, smartTable_header, logger, " smartTable_header ");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[6]//td[1]")
    WebElement row6_column1;

    public void click_row6_richText_formula_link() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row6_column1, logger, " row6_column1 ");
    }


    @FindBy(xpath = "//a[normalize-space()='SmartTable Actions']")
    WebElement smartTable_actions_button;

    public void click_smartTable_actions_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, smartTable_actions_button, logger, " smartTable_actions_button ");
    }


    @FindBy(xpath = "//span[normalize-space()='Add Column...']")
    WebElement add_column_ST_dropdown_button;
    public void click_add_column_ST_dropdown_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_column_ST_dropdown_button, logger, " add_column_ST_dropdown_button ");}

    @FindBy(xpath = "//span[normalize-space()='SmartTable Settings...']")
    WebElement smartTable_settings_dropdown_button;
    public void click_smartTable_settings_dropdown_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, smartTable_settings_dropdown_button, logger, " smartTable_settings_dropdown_button ");}

    @FindBy(xpath = "//input[@id='info_table_section_flags_256']")
    WebElement allow_column_sorting_checkbox;
    public void click_allow_column_sorting_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, allow_column_sorting_checkbox, logger, " allow_column_sorting_checkbox ");}

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quire_insert_reference_tag_icon']")
    WebElement reference_tag_ck_modal;

    public void click_reference_tag_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reference_tag_ck_modal, logger, "reference_tag_ck_modal ");
    }

    @FindBy(xpath = "//li[@class='quire_cke_menuitem']")
//    @FindBy(xpath = "a[title='SUM OF NUMBERS - QA AUTOMATION']")
    WebElement reference_tag_dropDown_ck_modal;

    public void click_reference_tag_dropDown_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reference_tag_dropDown_ck_modal, logger, "reference_tag_dropDown_ck_modal ");
    }

    @FindBy(xpath = "//span[@class='mceNonEditable referenceTag' and text()='100']")
//    @FindBy(xpath = "a[title='SUM OF NUMBERS - QA AUTOMATION']")
    WebElement reference_tag_value_100;
    public void verify_reference_tag_value_100() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reference_tag_value_100, true, logger, "reference_tag_value_100");
    }

    @FindBy(xpath = "//span[@class='mceNonEditable referenceTag' and text()='1000']")
//    @FindBy(xpath = "a[title='SUM OF NUMBERS - QA AUTOMATION']")
    WebElement reference_tag_value_1000;

    public void verify_reference_tag_value_1000() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reference_tag_value_1000, true, logger, "reference_tag_value_1000");
    }

    @FindBy(xpath = "//td[@class='htLeft quire-rich-text']//span[@class='mceNonEditable referenceTag orphaned' and @data-value='undefined']")
    WebElement reference_tag_deleted_value;

    public void verify_deleted_reference_tag_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reference_tag_deleted_value, true, logger, "Red reference tag deleted value");
    }

    @FindBy(xpath = "//table[@class='table info-table']//tr[1]//td[4]")
    WebElement row1_column4;

    public void click_row1_formula() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, row1_column4, logger, " row1_column4 ");
    }

    @FindBy(xpath = "(//li[@class='formulaEditor-itemContainer ui-menu-item'])[1]")
    WebElement sum_button_formula_smartTable;

    public void click_sum_button_formula() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sum_button_formula_smartTable, logger, " sum_button_formula_smartTable ");


    }

    @FindBy(xpath = "//textarea[@type='text']")
    WebElement sum_formula_smartTable;

    public void enter_sum_formula_smartTable() throws InterruptedException {
        sum_formula_smartTable.clear();
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, sum_formula_smartTable, "=SUM(C1:C9)", logger, " sum_formula_smartTable ");
    }

    public void click_escape_button_formula_smartTable() throws InterruptedException {
        ReusableMethodsLoggersPOM.escapeMethod(driver, sum_formula_smartTable, logger, " sum_formula_smartTable ");
    }

    @FindBy(xpath = "//td[contains(@class, 'quire-formula') and contains(@class, 'htLeft') and contains(@class, 'current')]")
    WebElement formula_cell_smartTable;

    public void rightClick_formula_cell_smartTable() {
        ReusableMethodsLoggersPOM.rightClickMethod(driver, formula_cell_smartTable, logger, " formula_cell_smartTable ");
    }

    @FindBy(xpath = "//td[contains(@class, 'quire-formula htLeft htNumeric hasFunction hasReferenceTag current')]")
    WebElement formula_cell_hasReferenceTag_smartTable;

    public void rightClick_formula_cell_hasReferenceTag_smartTable() {
        ReusableMethodsLoggersPOM.rightClickMethod(driver, formula_cell_hasReferenceTag_smartTable, logger, " formula_cell_hasReferenceTag_smartTable ");
    }

    @FindBy(xpath = "//td[contains(@class, 'htLeft') and contains(@class, 'current')]")

    WebElement dynamic_cell_smartTable;

    public void rightClick_dynamic_cell_smartTable() {
        ReusableMethodsLoggersPOM.rightClickMethod(driver, dynamic_cell_smartTable, logger, " dynamic_cell_smartTable ");
    }

//    @FindBy(xpath = "//td[@class='htLeft htAutocomplete current highlight']")   maybe for ck5
    @FindBy(xpath = "//td[contains(@class, 'qit-header-row') and contains(@class, 'mergeCells-ignore') and contains(@class, 'current')]")
    WebElement r1_header_smartTable;


    public void rightClick_r1_header_smartTable() {
        ReusableMethodsLoggersPOM.rightClickMethod(driver, r1_header_smartTable, logger, " r1_header_smartTable ");
    }

    public void click_dynamic_cell_smartTable() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, dynamic_cell_smartTable, logger, " dynamic_cell_smartTable ");
    }

    // @FindBy(xpath = "//td[@class='htLeft htAutocomplete current highlight']")
    @FindBy(xpath = "//table[@class='htCore']//tr[4]//td[5]")
    WebElement dynamic_cell_plainText_smartTable;

    public void rightClick_dynamic_cell_plainText_smartTable() {
        ReusableMethodsLoggersPOM.rightClickMethod(driver, dynamic_cell_plainText_smartTable, logger, " dynamic_cell_plainText_smartTable ");
    }

    @FindBy(xpath = "//td[@class='quire-numeric htLeft current highlight']")
    WebElement dynamic_cell_number_highlighted;

    public void click_dynamic_cell_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, dynamic_cell_smartTable, logger, " dynamic_cell_smartTable ");
    }

    public void enter_current_dynamic_cell_number() {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, dynamic_cell_smartTable, "0.99", logger, " dynamic_cell_smartTable ");
    }

    public void enter_current_dynamic_cell_date() {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, dynamic_cell_smartTable, "02/28/24", logger, " dynamic_cell_smartTable ");
    }

    @FindBy(xpath = "//div[normalize-space()='Add or Edit Cell Reference Tag']")
    WebElement add_or_edit_cell_reference_tag_button;

    public void click_add_or_edit_cell_reference_tag_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_or_edit_cell_reference_tag_button, logger, " add_or_edit_cell_reference_tag_button ");
    }

    @FindBy(xpath = "//div[normalize-space()='Edit cell properties...']")
    WebElement edit_cell_properties_button;

    public void click_edit_cell_properties_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, edit_cell_properties_button, logger, " edit_cell_properties_button ");
    }


    @FindBy(xpath = "//div[normalize-space()='Insert Header Above']")
    WebElement insert_header_above_button;

    public void click_insert_header_above_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_header_above_button, logger, " insert_header_above_button ");
    }

    @FindBy(xpath = "//div[normalize-space()='Insert Header Below']")
    WebElement insert_header_below_button;

    public void click_insert_header_below_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_header_below_button, logger, " insert_header_below_button ");
    }

    @FindBy(xpath = "//div[normalize-space()='Insert Row Above']")
    WebElement insert_row_above_button;

    public void click_insert_row_above_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_row_above_button, logger, " insert_row_above_button ");
    }

    @FindBy(xpath = "//div[normalize-space()='Insert Row Below']")
    WebElement insert_row_below_button;

    public void click_insert_row_below_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_row_below_button, logger, " insert_row_below_button ");
    }

    @FindBy(xpath = "//div[normalize-space()='Delete Row']")
    WebElement delete_row_button;

    public void click_delete_row_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, delete_row_button, logger, " delete_row_button ");
    }

    @FindBy(xpath = "//input[@name='feature_item[data][cell_name]']")
    WebElement cell_name_reference_tag_field;

    public void enter_cell_name_reference_tag() {
        ReusableMethodsLoggersPOM.doubleClickandSendKeysMethod(driver, cell_name_reference_tag_field, "SUM OF NUMBERS - QA AUTOMATION", logger, " cell_name_reference_tag_field ");
    }

    @FindBy(xpath = "//a[@title='SmartTable']")
    WebElement smartTable_sectionView;

    public void click_smartTable_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, smartTable_sectionView, logger, " smartTable_sectionView ");

    }
    @FindBy(xpath = "//li[@class='outlineItem info_table_section sortable-body-item linkable indent-level-1 ui-sortable-handle active']//input[@value='1']")
    WebElement smartTable_sectionView_checkbox;

    public void click_smartTable_sectionView_checkbox() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, smartTable_sectionView_checkbox, logger, " smartTable_sectionView_checkbox ");

        ReusableMethodsLoggersPOM.clickMethod(driver, smartTable_sectionView_checkbox, logger, " smartTable_sectionView_checkbox ");
    }


    @FindBy(xpath = "//i[@class='fa fa-copy']")
    WebElement duplicate_button_sectionView;

    public void click_duplicate_button_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, duplicate_button_sectionView, logger, " duplicate_button_sectionView ");
    }
    @FindBy(xpath = "//iframe[@class='cke_panel_frame']")
    WebElement reference_tag_ck5_iFrame;

    public void switchTo_reference_tag_ck5_iFrame() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, reference_tag_ck5_iFrame, logger, "reference_tag_ck5_iFrame ");
    }

    @FindBy(xpath = "(//a[@class='column-definition-settings-dropdown js-column-definition-settings-dropdown'])[7]")
    WebElement first_column_dropdown;

    public void click_first_column_dropdown_smartTable() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, first_column_dropdown, logger, " first_column_dropdown ");
        Thread.sleep(500);

        ReusableMethodsLoggersPOM.clickMethod(driver, first_column_dropdown, logger, " first_column_dropdown ");
    }


    @FindBy(xpath = "(//a[@class='column-definition-settings-dropdown js-column-definition-settings-dropdown'])[8]")
    WebElement second_column_dropdown;

    public void click_second_column_dropdown_smartTable() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, second_column_dropdown, logger, " second_column_dropdown ");
        Thread.sleep(500);

        ReusableMethodsLoggersPOM.clickMethod(driver, second_column_dropdown, logger, " second_column_dropdown ");
    }

    @FindBy(xpath = "//span[normalize-space()='Create WordBank Item...']")
    WebElement create_wordBank_item_smartTable_dropDown;

    public void click_create_wordBank_item_smartTable_dropdown() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, create_wordBank_item_smartTable_dropDown, logger, " create_wordBank_item_smartTable_dropDown ");
    }

    @FindBy(xpath = "//*[normalize-space()='Assign WordBank Items...']")
    WebElement assign_wordBank_item_smartTable_dropDown;

    public void click_assign_wordBank_item_smartTable_dropdown() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, assign_wordBank_item_smartTable_dropDown, logger, " assign_wordBank_item_smartTable_dropDown ");
    }

    @FindBy(xpath = "//span[normalize-space()='Manage Dropdown Values...']")
    WebElement manage_dropDown_values_smartTable_dropDown;

    public void click_manage_dropDown_values_smartTable_dropDown() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, manage_dropDown_values_smartTable_dropDown, logger, " manage_dropDown_values_smartTable_dropDown ");
    }


    @FindBy(xpath = "//div[@class='ui-menu-item-wrapper']")
    WebElement plainText_dropdown_arrow_in_cell_smartTable;

    public void click_plainText_dropdown_arrow_in_cell_smartTable() {
        ReusableMethodsLoggersPOM.clickMethod(driver, plainText_dropdown_arrow_in_cell_smartTable, logger, " plainText_dropdown_arrow_in_cell_smartTable ");
    }

    @FindBy(xpath = "//span[@title=\"SUM OF NUMBERS - QA AUTOMATION\" and text()=\"100\"]")
    WebElement qp_ST_reference_tag;

    public void verify_qp_ST_reference_tag() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, qp_ST_reference_tag, true, logger, "qp_ST_reference_tag");
    }

    public void verify_qp_ST_reference_tag_not_visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, qp_ST_reference_tag, false, logger, "qp_ST_reference_tag");
    }
    @FindBy(xpath = "//a[@class='quire-section-link']")
    WebElement quick_preview_section_link;

    public void verify_quickPreview_linked_section_isNot_visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quick_preview_section_link, false, logger, "quick_preview_section_link ");
    }

    public void verify_quickPreview_linked_section_is_visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quick_preview_section_link, true, logger, "quick_preview_section_link ");
    }
}