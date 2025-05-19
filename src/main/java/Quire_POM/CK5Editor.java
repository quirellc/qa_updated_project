package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.util.List;

public class CK5Editor extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public CK5Editor(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor


    @FindBy(xpath = "//select[@id='template_engine']")
    WebElement ckeditor_report_dropdown;
    public void select_ck5_report_dropdown() {
        ReusableMethodsLoggersPOM.selectByText(driver, ckeditor_report_dropdown, "CKEditor 5", "select_ck5_report_dropdown");}

//    @FindBy(xpath = "//body")
//    WebElement instruction_text_iFrame;
//

    @FindBy(xpath = "(//p)[1]")
    WebElement section_row_1_body;
    public void enter_intro_page_body_ck5() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, section_row_1_body,"QA Automationn Testng Script - Spell Check Check Section" , logger, "section_row_1_body");}
//   @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p")
@FindBy(xpath = "//section[@class='switchboard CT-hide']//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p")
WebElement text_body;
    public void enter_text_body_ck5() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body,"QA Automationn Testing Script - Spell Check Check Section_" , logger, "text_body");}


    public void enter_long_text_body_ck5() {
        if(driver instanceof ChromeDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body1,"QA Automation line 1\n\nQA Automation line 3" , logger, "text_body1");
        }
        else {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body1_ff,"QA Automation line 1\n\nQA Automation line 3" , logger, "text_body1_ff");
     //   ReusableMethodsLoggersPOM.sendKeysMethod(driver, section_row_1_body, "QA Automation line 1\n\nQA Automation line 3", logger, "long text_body");
    }}

    public void paste_text_introPages_body() {
        ReusableMethodsLoggersPOM.clickEnterThenPaste_method(driver, text_body, logger, " text_introPages_body");
    }

    //div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']
    @FindBy(xpath = "//div[@class='quire-smarttable-rt-editor-container']//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p[contains(text(),'QA Automation line 1')]")
    WebElement text_body_firstLine_cell;

    @FindBy(xpath = "(//p[contains(text(),'QA Automation line 1')])[4]")
    WebElement text_body_firstLine_cell_chrome;
    public void double_click_first_line_cell() {
// JavaScript to select the entire contents of the specified paragraph
        String script = "var element = arguments[0];" +
                "var range = document.createRange();" +
                "var sel = window.getSelection();" +
                "range.selectNodeContents(element);" + // Select the entire content of the paragraph
                "sel.removeAllRanges();" +
                "sel.addRange(range);";

// Execute the script to select the paragraph
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if (driver instanceof ChromeDriver) {
            js.executeScript(script, text_body_firstLine_cell_chrome);
            System.out.println("Successfully double clicked on: " + text_body_firstLine_cell_chrome.getText());

        } else  {
            js.executeScript(script, text_body_firstLine_cell);
            System.out.println("Successfully double clicked on: " + text_body_firstLine_cell.getText());

        }
        //   ReusableMethodsLoggersPOM.doubleClickMethod(driver, text_body_thirdLine, logger, "text_body_thirdLine");
    }
    //div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']
    @FindBy(xpath = "//div[@class='quire-smarttable-rt-editor-container']//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p[contains(text(),'QA Automation line 3')]")
    WebElement text_body_thirdLine_cell;


    @FindBy(xpath = "(//p[contains(text(),'QA Automation line 3')])[4]")
    WebElement text_body_thirdLine_cell_chrome;
    public void double_click_third_line_cell() {
// JavaScript to select the entire contents of the specified paragraph
     try {
        String script = "var element = arguments[0];" +
                "var range = document.createRange();" +
                "var sel = window.getSelection();" +
                "range.selectNodeContents(element);" + // Select the entire content of the paragraph
                "sel.removeAllRanges();" +
                "sel.addRange(range);";

// Execute the script to select the paragraph
        JavascriptExecutor js = (JavascriptExecutor) driver;
         if (driver instanceof ChromeDriver) {
             js.executeScript(script, text_body_thirdLine_cell_chrome);
             System.out.println("Successfully double clicked on: " + text_body_thirdLine_cell_chrome.getText());
             logger.log(LogStatus.PASS, "Successfully double clicked on: " + text_body_thirdLine_cell_chrome.getText());

         } else  {
             js.executeScript(script, text_body_thirdLine_cell);
             System.out.println("Successfully double clicked on: " + text_body_thirdLine_cell.getText());
             logger.log(LogStatus.PASS, "Successfully double clicked on: " + text_body_thirdLine_cell.getText());
         }

    } catch (Exception e) {
        // Retry the click if StaleElementReferenceException is caught
        System.out.println("\n" + "Unable to  double click on: " + text_body_thirdLine_cell.getText());
        logger.log(LogStatus.INFO, "Unable to  double click on: " + text_body_thirdLine_cell.getText());
      }}


    @FindBy(xpath = "//section[@class='reportbody CT-hide']//div[@class='section-block']//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p[contains(text(),'QA Automation line 1')]")
    WebElement text_body_firstLine;
    public void double_click_first_line() {
// JavaScript to select the entire contents of the specified paragraph
        String script = "var element = arguments[0];" +
                "var range = document.createRange();" +
                "var sel = window.getSelection();" +
                "range.selectNodeContents(element);" + // Select the entire content of the paragraph
                "sel.removeAllRanges();" +
                "sel.addRange(range);";

// Execute the script to select the paragraph
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script, text_body_firstLine);
        //   ReusableMethodsLoggersPOM.doubleClickMethod(driver, text_body_thirdLine, logger, "text_body_thirdLine");
    }

    @FindBy(xpath = "//section[@class='reportbody CT-hide']//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p[contains(text(),'QA Automation line 3')]")
    WebElement text_body_thirdLine;
    public void double_click_third_line() {
// JavaScript to select the entire contents of the specified paragraph
        String script = "var element = arguments[0];" +
                "var range = document.createRange();" +
                "var sel = window.getSelection();" +
                "range.selectNodeContents(element);" + // Select the entire content of the paragraph
                "sel.removeAllRanges();" +
                "sel.addRange(range);";

// Execute the script to select the paragraph
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(script, text_body_thirdLine);
        //   ReusableMethodsLoggersPOM.doubleClickMethod(driver, text_body_thirdLine, logger, "text_body_thirdLine");
    }

//    @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p")
//    WebElement text_body_ST;
//    public void clear_current_text_body() {
//        ReusableMethodsLoggersPOM.selectAllandDelete_method(driver, section_row_1_body, logger, " text body");
//    }
    @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//p")
    WebElement text_body_ST;
    public void clear_current_text_body_ST() {
        ReusableMethodsLoggersPOM.selectAllandDelete_method(driver, text_body_ST, logger, "text_body_ST");
    }

    @FindBy(xpath = "//div[@class='quire-smarttable-rt-editor-container']//p")
    WebElement ST_cell;

    public void click_escape_current_cell() {
        ReusableMethodsLoggersPOM.escapeMethod(driver, ST_cell, logger, " ST_cell");
    }

    public void select_all_and_backspace_section_body() throws InterruptedException {
        ReusableMethodsLoggersPOM.selectAll_method(driver, text_body, logger, " text_introPages_body");
        // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(1000);
        //  mouseActions.sendKeys(Keys.BACK_SPACE).perform();
        text_body.sendKeys(String.valueOf(Keys.BACK_SPACE));
        Thread.sleep(500);
    }

    @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']")
    WebElement text_body1_ff;

    @FindBy(xpath = "(//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.'])[2]")
    WebElement wb_body_ff;


    @FindBy(xpath = "(//p)[1]")
WebElement text_body1;

    @FindBy(xpath = "(//p)[2]")
    WebElement text_body2;


    public void select_all_and_backspace_sc_tc_section() throws InterruptedException {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.selectAll_method(driver, text_body1_ff, logger, " text_body");
            Thread.sleep(1000);
            text_body1_ff.sendKeys(String.valueOf(Keys.BACK_SPACE));
        }
        else {
            ReusableMethodsLoggersPOM.selectAll_method(driver, text_body2, logger, " text_body");
            Thread.sleep(1000);
            text_body2.sendKeys(Keys.DELETE);

        }
        // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);
    }

    @FindBy(xpath = "//div[@role='textbox']//p")
    WebElement RT_cell_ST;

    public void select_all_and_backspace_RT_cell() throws InterruptedException {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.selectAll_method(driver, text_body1_ff, logger, " text_body");
            Thread.sleep(1000);
            text_body1_ff.sendKeys(String.valueOf(Keys.BACK_SPACE));
        }
        else {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, RT_cell_ST,"delete" , logger, "text_body");
            Thread.sleep(500);
            ReusableMethodsLoggersPOM.selectAll_method(driver, RT_cell_ST, logger, " text_body");
            Thread.sleep(500);
            RT_cell_ST.sendKeys(Keys.DELETE);

            //  toDoList_body.sendKeys(String.valueOf(Keys.BACK_SPACE));

        }
        // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);
    }
    public void click_ck5_body_with_text() throws InterruptedException {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.clickMethod(driver, text_body1_ff, logger, "text_body1_ff");
        }
        else {
            ReusableMethodsLoggersPOM.clickMethod(driver, text_body2, logger, "text_body2");
            //  toDoList_body.sendKeys(String.valueOf(Keys.BACK_SPACE));

        }
        // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);
    }



    public void select_all_text_introPages_body() {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.selectAll_method(driver, text_body1_ff, logger, " text_body");

        }
        else {
            ReusableMethodsLoggersPOM.selectAll_method(driver, text_body2, logger, " text_body");
        }    }


    public void enter_sc_text_body_ck5() {
        if(driver instanceof ChromeDriver) {
                ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body1,"QA Automationn Testng Script - Spell Check Check Section" , logger, "text_body1");
        }
        else {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body1_ff,"QA Automationn Testng Script - Spell Check Check Section" , logger, "text_body1_ff");
    }}

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//p")
    WebElement proj_summary_text_body;
    public void enter_proj_summary_text_body() {
        if(driver instanceof ChromeDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, proj_summary_text_body,"QA Automationn Testng Script - Project Summary" , logger, "proj_summary_text_body");
        }
        else {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body1_ff,"QA Automationn Testng Script - Project Summary" , logger, "text_body1_ff");
        }}

    @FindBy(xpath = "(//section[@class='switchboard CT-hide']//p)[2]")
    WebElement projectSummaryText;

    public void select_all_text_projSummary_section_body() {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.selectAll_method(driver, text_body1_ff, logger, " text_body");

        }
        else {
            ReusableMethodsLoggersPOM.selectAll_method(driver, projectSummaryText, logger, " projectSummaryText");
        }    }
    @FindBy(xpath = "(//p)[9]")
    WebElement loadAnalysis_text_field;

    public void enter_loadAnalysis_text() throws InterruptedException {
        if(driver instanceof ChromeDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, loadAnalysis_text_field,"QA Automation Text - Load Analysis" , logger, "loadAnalysis_text_field");
        }
        else {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body1_ff,"QA Automation Text - Load Analysis" , logger, "loadAnalysis_text_field_ff");
        }}


    @FindBy(xpath = "//section[@class='switchboard CT-hide']//i[@class='fa fa-exclamation-circle fa-lg fa-fw']")
    WebElement grey_instruction_Icon_template;
    public void click_grey_instruction_Icon_template() {
        ReusableMethodsLoggersPOM.clickMethod(driver, grey_instruction_Icon_template, logger, "grey_instruction_Icon_template");
    }




//    @FindBy(xpath = "//div[@aria-label='Editor editing area: main. Press ⌥0 for help.']")
@FindBy(xpath = "//p[@class='ck-placeholder']")
WebElement instruction_text_ck5;

    public void enter_instruction_text_ck5() {
        if (driver instanceof ChromeDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_ck5, "QA Test Automation - Instructions", logger, "instruction_text_ck5");
        }
        else{
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_body1_ff, "QA Test Automation - Instructions", logger, "instruction_text_iFrame");
    }}

    public void enter_wb_text_ck5() {
        if (driver instanceof ChromeDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_ck5, "QA Test Automation - WordBank Content", logger, "instruction_text_ck5");
        }
        else{
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, wb_body_ff, "QA Test Automation - WordBank Content", logger, "wb_body_ff");
        }}
    public void enter_footnote_text_ck5() {
        if (driver instanceof ChromeDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, footNote_textBox,"QA Automation Footnote text" ,  logger, "footNote_textBox");
        }
        else{
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, wb_body_ff, "QA Test Automation - WordBank Content", logger, "wb_body_ff");
        }}

    @FindBy(xpath = "//button[@data-cke-tooltip-text='To-do List']")
    WebElement to_do_list_icon_ck5;
    public void click_to_do_list_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, to_do_list_icon_ck5, logger, "To_do_list_icon_ck5");}

    @FindBy(xpath = "//input[@checked='checked' and @type='checkbox']")
    List <WebElement> to_do_list_checked_items_ck5;
    public void count_to_do_list_checked_items_ck5() {
        int itemCount = to_do_list_checked_items_ck5.size();
        System.out.println("There are: " + itemCount + " Checked/Completed Items in the To-Do List");
    }
    @FindBy(xpath = "//button[@data-cke-tooltip-text='Link (⌘K)']")
    WebElement link_icon_ck5;
    public void click_link_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, link_icon_ck5, logger, "link_icon_ck5");}

    @FindBy(xpath = "(//label[normalize-space()='Link URL'])[1]")
    WebElement link_url_field_ck5;
    public void enter_link_url_field_ck5() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, link_url_field_ck5,"google.com" , logger, "link_url_field_ck5");}

    @FindBy(xpath = "//a[@class='ck-link_selected']")
    WebElement linked_url_text_ck5;
    public void capture_linked_url_text_ck5() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, link_url_field_ck5,logger, "linked_url_text_ck5");}
    public void click_linked_url_text_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, link_url_field_ck5,logger, "linked_url_text_ck5");}

    @FindBy(xpath = "ck ck-button ck-off ck-button_with-text ck ck-link-actions__preview")
    WebElement linked_url_goto_popup_link_ck5;
    public void click_linked_url_goto_popup_link_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, linked_url_goto_popup_link_ck5,logger, "linked_url_goto_popup_link_ck5");}

    @FindBy(xpath = "//button[@data-cke-tooltip-text='Edit link']")
    WebElement edit_url_link;
    public void verify_edit_url_link_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, edit_url_link, true, logger, "edit_url_link ");}

    @FindBy(xpath = "//button[@data-cke-tooltip-text='Edit link']")
    WebElement unlink_url_link;
    public void verify_unlink_url_link_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unlink_url_link, true, logger, "unlink_url_link ");}


    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Report Tag']")
    WebElement report_tag_icon_ck5;
    public void click_report_tag_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, report_tag_icon_ck5, logger, "report_tag_icon_ck5");}
    public void verify_report_tag_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, report_tag_icon_ck5, true, logger, "report_tag_icon_ck5 ");}
    public void verify_report_tag_icon_is_NotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, report_tag_icon_ck5, false, logger, "report_tag_icon_ck5 ");}

    @FindBy(xpath = "//div[@id='report_section_editor_toolbar']//li[1]")
    WebElement reportTag_dropDownItem_ck5_modal;

    public void click_reportTag_dropDownItem_ck5_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportTag_dropDownItem_ck5_modal, logger, "reportTag_dropDownItem_ck5_modal ");

    }

    @FindBy(xpath = "//div[@id='report_section_editor_toolbar']//li[2]")
    WebElement reportTag_second_dropDownItem_ck5_modal;

    public void click_reportTag_second_dropDownItem_ck5_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportTag_second_dropDownItem_ck5_modal, logger, "reportTag_second_dropDownItem_ck5_modal ");
    }

//    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
//    WebElement ReportTagField;
//
//    public void enter_number_ReportTagField() {
//        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ReportTagField, "123", logger, "email_ReportTagField");
//    }

    @FindBy(xpath = "//li[@class='assign-word-bank has-wb-items']//a[@class='has-tooltip']")
    WebElement assign_word_bank_blue_icon;

    public void click_assign_word_bank_blue_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, assign_word_bank_blue_icon, logger, "assign_word_bank_blue_icon");
    }

    @FindBy(xpath = "//div[contains(text(), 'Accessibility  Restroom/s')]")
    WebElement export_1_wb_item1;

    @FindBy(xpath = "//div[normalize-space()='Accessibility ADA Assessment - EXTERIOR CIRCULATION ACCEPTABLE']")
    WebElement export_1_wb_item2;
    public void verify_export1_items_wb_assigned_packages() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, export_1_wb_item1, true, logger, "export_1_wb_item1");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, export_1_wb_item2, true, logger, "export_1_wb_item2");
    }
    @FindBy(xpath = "//button[@data-cke-tooltip-text='Create Word Bank Item']")
    WebElement wordBank_icon_ck5;
    public void click_create_wordBank_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, wordBank_icon_ck5, logger, "wordBank_icon_ck5");}
    public void verify_wordBank_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, wordBank_icon_ck5, true, logger, "wordBank_icon_ck5");}
    public void verify_wordBank_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, wordBank_icon_ck5, false, logger, "wordBank_icon_ck5");}


    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Gallery Image']")
    WebElement gallery_image_icon_ck5;
    public void verify_gallery_image_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, gallery_image_icon_ck5, true, logger, "gallery_image_icon_ck5 ");}
    public void verify_gallery_image_icon_is_NotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, gallery_image_icon_ck5, false, logger, "gallery_image_icon_ck5 ");}

    @FindBy(xpath = "//button[@data-cke-tooltip-text='Lock Content']")
    WebElement lock_icon_ck5;
    public void verify_lock_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, lock_icon_ck5, true, logger, "lock_icon_ck5 ");}
    public void verify_lock_icon_is_NotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, lock_icon_ck5, false, logger, "lock_icon_ck5 ");}

      @FindBy(xpath = "//button[@class='ck ck-button quireToogleLock ck-on']")
    WebElement unlock_icon_ck5;

    public void click_unlock_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, unlock_icon_ck5, logger, "unlock_icon_ck5");
    }
    public void verify_unlock_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unlock_icon_ck5, true,  logger, "unlock_icon_ck5");}
    public void verify_unlock_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unlock_icon_ck5, false,  logger, "unlock_icon_ck5");}

    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Stamp']")
    WebElement stamp_icon_ck5;
    public void verify_stamp_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, stamp_icon_ck5, true, logger, "stamp_icon_ck5");}
    public void verify_stamp_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, stamp_icon_ck5, false, logger, "stamp_icon_ck5");}
    public void click_stamp_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, stamp_icon_ck5, logger, "stamp_icon_ck5");}

    @FindBy(xpath = "//img[@class='q-dropdownItem-image']")
    WebElement stamp_icon_dropdown_ck5;
    public void click_stamp_icon_dropdown_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, stamp_icon_dropdown_ck5, logger, "stamp_icon_dropdown_ck5");}


    @FindBy(xpath = "//span[@class='mceNonEditable stamp-container']")
    WebElement stamp_in_body;

    @FindBy(xpath = "//img[@class='user-signature']")
    WebElement signature_in_body;
    public void verify_stamp_signature_in_section() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, stamp_in_body, true, logger, "stamp_in_body");

        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, signature_in_body, true, logger, "signature_in_body");
    }


    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Signature']")
    WebElement signature_icon_ck5;
    public void verify_signature_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, signature_icon_ck5, true, logger, "signature_icon_ck5");}
    public void verify_signature_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, signature_icon_ck5, false, logger, "signature_icon_ck5");}
    public void click_signature_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, signature_icon_ck5, logger, "signature_icon_ck5");}


    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Footnote']")
    WebElement footnote_icon_ck5;
    public void verify_footnote_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, footnote_icon_ck5, true, logger, "footnote_icon_ck5");}
    public void verify_footnote_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, footnote_icon_ck5, false, logger, "footnote_icon_ck5");}
    public void click_footNote_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, footnote_icon_ck5, logger, "footnote_icon_ck5");}

    @FindBy(xpath = "//div[@aria-label='Create Footnote']//div[@class='ck ck-editor__main']//p")
//    @FindBy(xpath = "(//p)[1]")

    WebElement footNote_textBox;
    public void enter_footNote_textBox() {
      //  ReusableMethodsLoggersPOM.clickMethod(driver, footNote_textBox, logger, "footNote_textBox");

        ReusableMethodsLoggersPOM.sendKeysMethod(driver, footNote_textBox,"QA Automation Footnote text" ,  logger, "footNote_textBox");}
    @FindBy(xpath = "//div[@class='ck ck-dialog__actions']//button[2]")
    WebElement save_button_footnote;
    public void click_save_button_footnote() {
        ReusableMethodsLoggersPOM.clickMethod(driver, save_button_footnote, logger, "save_button_footnote");}

    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Report Link']")
    WebElement report_link_icon_ck5;
    public void verify_report_link_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, report_link_icon_ck5, true, logger, "report_link_icon_ck5");}
    public void verify_report_link_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, report_link_icon_ck5, false, logger, "report_link_icon_ck5");}

    public void click_report_link_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, report_link_icon_ck5, logger, "report_link_icon_ck5");}
    @FindBy(xpath = "//div[@id='modal']//li[3]//a[1]")
    WebElement link_to_section_defaultSectionTitle;

    public void click_link_to_section_defaultSectionTitle() {
        ReusableMethodsLoggersPOM.clickMethod(driver, link_to_section_defaultSectionTitle, logger, "link_to_section_defaultSectionTitle ");
    }

    @FindBy(xpath = "//a[@id='id-modal-unlink']")
    WebElement unlink_button_sectionLink_view;

    public void click_unlink_button_sectionLinkView() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, unlink_button_sectionLink_view, logger, "unlink_button_sectionLink_view ");
    }


    @FindBy(xpath = "//td[contains(@class,'htLeft quire-rich-text current')]//p")
    WebElement linked_section_text_smartTable;

    public void doubleclick_linked_section_text() {
//        if (driver instanceof ChromeDriver) {
//            ReusableMethodsLoggersPOM.sendKeysMethod(driver, RT_cell_ST," " , logger, "text_body");
//
//        }

        ReusableMethodsLoggersPOM.doubleClickMethod(driver, linked_section_text_smartTable, logger, "linked_section_text ");
    }

    @FindBy(xpath = "//td[contains(@class,'htLeft quire-rich-text current')]//span[@class='has-tooltip mceNonEditable quire-section-link js-quire-section-link']")
    WebElement linked_section_text_smartTable1;

    public void verify_sectionLink_smartTable_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, linked_section_text_smartTable, true, logger, "linked_section_text_smartTable ");}

    public void verify_linked_sectionLink_isNot_visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, linked_section_text_smartTable1, false, logger, "linked_section_text_smartTable1 ");
    }

    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Variable']")
    WebElement insert_variable_tag_icon_ck5;
    public void verify_insert_variable_tag_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, insert_variable_tag_icon_ck5, true, logger, "insert_variable_tag_icon_ck5");}

    @FindBy(xpath = "//button[@data-cke-tooltip-text='Insert Reference Tag']")
    WebElement reference_tag_icon_ck5;
    public void verify_reference_tag_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reference_tag_icon_ck5, true, logger, "reference_tag_icon_ck5");}
    public void verify_reference_tag_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reference_tag_icon_ck5, false, logger, "reference_tag_icon_ck5");}
    public void click_reference_tag_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reference_tag_icon_ck5, logger, "reference_tag_icon_ck5");}
    @FindBy(xpath = "//button[@role='menuitemradio']")
    WebElement reference_tag_dropDown_item_ck5;
    public void click_reference_tag_dropDown_item_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reference_tag_dropDown_item_ck5, logger, "reference_tag_dropDown_item_ck5");}
    @FindBy(xpath = "//button[@data-cke-tooltip-text='Comment']")
    WebElement comment_icon_ck5;
    public void verify_comment_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, comment_icon_ck5, true, logger, "comment_icon_ck5");}
    public void verify_comment_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, comment_icon_ck5, false, logger, "comment_icon_ck5");}
    public void click_comment_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comment_icon_ck5, logger, "comment_icon_ck5");}
    @FindBy(xpath = "//span[contains(@class, 'ck-comment-marker')]")
    WebElement comment_highlight_ck5;
    public void verify_comment_highlight_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, comment_highlight_ck5, true, logger, "comment_highlight_ck5");}


    @FindBy(xpath = "(//span[@class='ck-comment-marker'])[2]")
    WebElement comment_2_highlight_ck5;
    public void verify_second_comment_highlight_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, comment_2_highlight_ck5, true, logger, "comment_2_highlight_ck5");}

    @FindBy(xpath = "//ul[@class='section-actions unstyled js-leaves-editor-open']//li[contains(@class, 'unresolved-comments') and @data-comment-count='1']")
    WebElement unresolved_1_comment_icon;
    public void verify_unresolved_1_comment_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unresolved_1_comment_icon, true, logger, "unresolved_1_comment_icon");}

    public void click_unresolved_1_comment_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, unresolved_1_comment_icon,  logger, "unresolved_1_comment_icon");}
    @FindBy(xpath = "//li[@class='section-comments js-sectionComments flex-container flex-align-center flex-content-center js-commentsActionTooltipProvider']")
    WebElement empty_comments_icon;
    public void verify_grey_empty_comments_icon() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, empty_comments_icon, true, logger, "empty_comments_icon");}

    public void click_grey_empty_comments_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, empty_comments_icon,  logger, "empty_comments_icon");}

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//li[@class='section-comments js-sectionComments flex-container flex-align-center flex-content-center js-commentsActionTooltipProvider']")
    WebElement section_empty_comments_icon;
    public void click_section_grey_empty_comments_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_empty_comments_icon,  logger, "section_empty_comments_icon");}
    public void verify_section_grey_empty_comments_icon() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, section_empty_comments_icon, true, logger, "section_empty_comments_icon");}
    @FindBy(xpath = "(//li[@class='section-comments js-sectionComments flex-container flex-align-center flex-content-center js-commentsActionTooltipProvider'])[2]")
    WebElement second_empty_comments_icon;
    public void click_second_empty_comments_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, second_empty_comments_icon, logger, "second_empty_comments_icon");}

    @FindBy(xpath = "//ul[@class='section-actions unstyled js-leaves-editor-open']//li[contains(@class, 'unresolved-comments') and @data-comment-count='2']")
    WebElement unresolved_2_comments_icon;
    public void click_unresolved_2_comments_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, unresolved_2_comments_icon, logger, "unresolved_2_comments_icon");}
    public void verify_unresolved_2_comment_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unresolved_2_comments_icon, true, logger, "unresolved_2_comments_icon");}
    @FindBy(xpath = "//ul[@class='section-actions unstyled js-leaves-editor-open']//li[contains(@class, 'archived-comments') and @data-comment-count='1']")
    WebElement resolved_1_comment_icon;
    public void verify_resolved_1_comment_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, resolved_1_comment_icon, true, logger, "resolved_1_comment_icon");}



    @FindBy(xpath = "//ul[@class='section-actions unstyled js-leaves-editor-open']//li[contains(@class, 'archived-comments') and @data-comment-count='2']")
    WebElement resolved_2_comments_icon;
    public void verify_resolved_2_comment_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, resolved_2_comments_icon, true, logger, "resolved_2_comments_icon");}

    public void click_resolved_2_comments_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, resolved_2_comments_icon,  logger, "resolved_2_comments_icon");}

    @FindBy(xpath = "//ul[@class='section-actions unstyled js-leaves-editor-open']//li[contains(@class, 'unresolved-comments') and @data-comment-count='4']")
    WebElement unresolved_4_comments_icon;
    public void click_unresolved_4_comments_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, unresolved_4_comments_icon, logger, "unresolved_4_comments_icon");}
    public void verify_unresolved_4_comment_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unresolved_4_comments_icon, true, logger, "unresolved_4_comments_icon");}

    public void hover_unresolved_4_comments_icon() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, unresolved_4_comments_icon, logger, "unresolved_4_comments_icon");}

    @FindBy(xpath = "//button[@class='ck ck-button ck-off ck-button_with-text ck-comment__input-actions--submit']")
    WebElement submit_comment_button;
    public void click_submit_comment_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, submit_comment_button, logger, "submit_comment_button");}

    @FindBy(xpath = "//p[@data-placeholder='Reply to reopen discussion...']")
    WebElement reopen_discussion_comments_field;

    public void reopen_archived_comment_discussion() {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field, "QA Automation updated comment - on archived comment", logger, "reopen_archived_comment");

        }
        else {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_ck5, "QA Automation Comment Test Message: ", logger, "reopen_archived_comment");

        }
        BaseClass.ck5editor().click_submit_comment_button();

    }

    public void reopen_second_archived_comment_discussion() {
        if (driver instanceof FirefoxDriver) {
           // ReusableMethodsLoggersPOM.clickMethod(driver, add_a_comment_field1, logger, "reopen_archived_comment");

            ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field1, "QA Automation updated comment - on archived comment", logger, "reopen_archived_comment");

        }
        else {
         //   ReusableMethodsLoggersPOM.clickMethod(driver, instruction_text_ck5, logger, "reopen_archived_comment");

            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reopen_discussion_comments_field, "QA Automation Comment Test Message: ", logger, "reopen_archived_comment");

        }
        BaseClass.ck5editor().click_submit_comment_button();

    }

    @FindBy(xpath = "//p[@data-placeholder='Write a comment...']")
    WebElement add_a_comment_field1;

    @FindBy(xpath = "//div[@aria-label='Comment editor']")
    WebElement add_a_comment_field;
    @FindBy(xpath = "(//div[@aria-label='Comment editor'])[2]")
    WebElement add_a_comment_field_second_comment;

    @FindBy(xpath = "//div[@class='ck-comment ck-annotation']")
    WebElement comment_box;

    public void enter_comments_to_field() throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            if (driver instanceof FirefoxDriver) {
                ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field, "QA Automation Comment Test Message - Iteration: " + i, logger, "add_a_comment_field");
                Thread.sleep(500);
                BaseClass.ck5editor().click_submit_comment_button();
                Thread.sleep(500);
                ReusableMethodsLoggersPOM.clickMethod(driver, comment_box, logger, "comment_box");
                Thread.sleep(500);
            }
            else {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_ck5, "QA Automation Comment Test Message - Iteration: " + i, logger, "instruction_text_ck5");
            Thread.sleep(500);
            BaseClass.ck5editor().click_submit_comment_button();
            Thread.sleep(500);
            ReusableMethodsLoggersPOM.clickMethod(driver, comment_box, logger, "comment_box");
            Thread.sleep(500);
        }
        }
        }

    public void enter_comment_to_field() throws InterruptedException {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field, "QA Automation Comment Test Message:", logger, "add_a_comment_field");
        }
        else {
//            ReusableMethodsLoggersPOM.clickMethod(driver, instruction_text_ck5 , logger, "instruction_text_ck5");

            ReusableMethodsLoggersPOM.clickMethod(driver, add_a_comment_field1 , logger, "instruction_text_ck5");
            Thread.sleep(500);
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field1, "QA Automation Comment Test Message: " , logger, "instruction_text_ck5");
        }
            Thread.sleep(500);
            BaseClass.ck5editor().click_submit_comment_button();
            Thread.sleep(500);
        }

    public void enter_second_comment_to_field() throws InterruptedException {
        if (driver instanceof FirefoxDriver) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field_second_comment, "QA Automation Comment Test Message:", logger, "add_a_comment_field");
        }
        else {
//            ReusableMethodsLoggersPOM.clickMethod(driver, instruction_text_ck5 , logger, "instruction_text_ck5");
//            Thread.sleep(500);
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field1, "QA Automation Comment Test Message: " , logger, "add_a_comment_field_second_comment");
        }
        Thread.sleep(500);
        BaseClass.ck5editor().click_submit_comment_button();
        Thread.sleep(500);
    }

    @FindBy(xpath = "//div[@class='ck-comment__actions ck-annotation__actions']//div[@class='ck ck-dropdown']/button[1]")
    WebElement comments_detail_button;
    public void click_comments_detail_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comments_detail_button, logger, "comments_detail_button");}

    @FindBy(xpath = "(//ul[@class='ck-thread__comments']//button[@class='ck ck-button ck-off ck-dropdown__button'])[2]")
    WebElement comments_detail_second_button;
    public void click_comments_detail_second_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comments_detail_second_button, logger, "comments_detail_second_button");}
    @FindBy(xpath = "//div[@class='ck ck-reset ck-dropdown__panel ck-dropdown__panel_sw ck-dropdown__panel-visible']//li[1]//button")
    WebElement comments_edit_button;
    public void click_comments_edit_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comments_edit_button, logger, "comments_edit_button");}
    @FindBy(xpath = "//div[@class='ck ck-reset ck-dropdown__panel ck-dropdown__panel_sw ck-dropdown__panel-visible']//li[2]//button")
    WebElement comments_remove_button;
    public void click_comments_remove_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comments_remove_button, logger, "comments_remove_button");}

    @FindBy(xpath = "//p[normalize-space()='Delete comment?']")
    WebElement delete_comment_warning_message;
    @FindBy(xpath = "//button[@class='ck ck-button ck-off ck-thread__remove-confirm-submit']")
    WebElement delete_comment_button;
    public void verify_and_click_delete_comment_button() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, delete_comment_warning_message,true, logger, "delete_comment_warning_message");
        ReusableMethodsLoggersPOM.clickMethod(driver, delete_comment_button, logger, "delete_comment_button");
    }

    public void click_delete_comment_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, delete_comment_button, logger, "delete_comment_button");
    }

        public void update_comments_in_field() throws InterruptedException {
//            BaseClass.ck5editor().click_comments_detail_button();
//        BaseClass.ck5editor().click_comments_edit_button();
//        ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field, " - edited comment" , logger, "add_a_comment_field");
//        BaseClass.ck5editor().click_submit_comment_button();

        BaseClass.ck5editor().click_comments_detail_second_button();
        BaseClass.ck5editor().click_comments_remove_button();
        BaseClass.ck5editor().verify_and_click_delete_comment_button();
    }

    public void delete_comments_in_field() throws InterruptedException {
        BaseClass.ck5editor().click_comments_detail_button();
       // Thread.sleep(1000);

       // BaseClass.ck5editor().click_comments_detail_button();

       // BaseClass.ck5editor().click_comments_edit_button();
        BaseClass.ck5editor().click_comments_remove_button();
        BaseClass.ck5editor().click_delete_comment_button();

    }


        @FindBy(xpath = "//button[@class='ck ck-button ck-off ck-comment--resolve']")
    WebElement comments_resolve_button;
    public void click_comments_resolve_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comments_resolve_button, logger, "comments_resolve_button");}



    //@FindBy(xpath = "//button[@data-cke-tooltip-text='Comments archive']")
    @FindBy(xpath = "//div[@id='comments-resolvedContainer']")
    WebElement comments_archive_message_ck5;
    public void verify_comments_archive_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, comments_archive_message_ck5, true, logger, "comments_archive_icon_ck5");}
    public void verify_comments_archive_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, comments_archive_message_ck5, false, logger, "comments_archive_icon_ck5");}
    @FindBy(xpath = "//div[contains(text(),'Marked as resolved')]")
    WebElement comments_archive_marked_as_resolved_message;
    public void click_and_verify_comments_archive_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comments_archive_message_ck5, logger, "comments_archive_icon_ck5");
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, comments_archive_marked_as_resolved_message,true,  logger, "comments_archive_marked_as_resolved_message");
}

    @FindBy(xpath = "//button[@class='ck ck-button quireHideTrackChangesMarkup ck-on']")
    WebElement TC_markup_icon_ck5;
    @FindBy(xpath = "//button[@class='ck ck-button ck-on ck-splitbutton__action' and @data-cke-tooltip-text='Track changes']")
    WebElement TC_enabled_icon_ck5;
    public void verify_TC_enabled_icon_isVisible() throws InterruptedException {


        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, TC_enabled_icon_ck5, true, logger, "TC_enabled_icon_ck5");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, TC_markup_icon_ck5, true, logger, "TC_markup_enabled_icon_ck5");
}

    @FindBy(xpath = "(//button[@data-cke-tooltip-text='Track changes'])[2]")
    WebElement TC_dropdown_arrow_icon_ck5;
    public void click_TC_dropdown_arrow_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, TC_dropdown_arrow_icon_ck5, logger, "TC_dropdown_arrow_icon_ck5");}

    @FindBy(xpath = "//span[contains(@class, 'ck-suggestion-marker ck-suggestion-marker-')]")
    List <WebElement> TC_highlights;
    public void count_TC_highlights() {
int count = TC_highlights.size();
        System.out.println("Number of track change highlights: " + count);
    }

    @FindBy(xpath = "//span[@class='ck-suggestion-marker ck-suggestion-marker-insertion']")
    WebElement TC_green_highlight;
    public void verify_TC_green_highlight() {
                ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, TC_green_highlight, true, logger, "TC_green_highlight");}

    @FindBy(xpath = "//span[@class='ck-suggestion-marker ck-suggestion-marker-deletion']")
    WebElement TC_red_highlight;
    public void click_TC_red_highlight() {
        ReusableMethodsLoggersPOM.clickMethod(driver, TC_red_highlight, logger, "TC_red_highlight");}

    public void verify_TC_red_highlight() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, TC_red_highlight, true, logger, "TC_red_highlight");}


//    @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//span[contains(@class, 'ck-suggestion-marker ck-suggestion-marker-')]")
   @FindBy(xpath = "//span[@class='ck-suggestion-marker ck-suggestion-marker-insertion']")
     WebElement current_section_TC_highlight;
    public void click_current_section_TC_highlight() {
        ReusableMethodsLoggersPOM.clickMethod(driver, current_section_TC_highlight, logger, "current_section_TC_highlight");}

    @FindBy(xpath = "//button[@class='ck ck-button ck-off ck-suggestion--accept']")
    WebElement accept_TC_suggestion;
    public void click_accept_TC_suggestion() {
        ReusableMethodsLoggersPOM.clickMethod(driver, accept_TC_suggestion, logger, "accept_TC_suggestion");}

    @FindBy(xpath = "//button[@class='ck ck-button ck-off ck-suggestion--discard']")
    WebElement reject_TC_suggestion;
    public void click_discard_TC_suggestion() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reject_TC_suggestion, logger, "discard_TC_suggestion");}



//    @FindBy(xpath = "//button[@data-cke-tooltip-text='WProofreader text checker']")
//    WebElement SC_icon_ck5;
//    public void verify_SC_icon_isVisible() {
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, TC_icon_ck5, true, logger, "SC_icon_ck5");}
//    public void verify_SC_icon_is_notVisible() {
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, TC_icon_ck5, false, logger, "SC_icon_ck5");}


//    public void click_accept_change_icon_ck5() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, accept_change_icon_ck5, logger, "accept_change_icon_ck5 ");}
//    public void click_accept_all_change_icon_ck5() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, accept_all_changes_icon_ck5, logger, "accept_all_changes_icon_ck5 ");}
//    public void click_reject_change_icon_ck5() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, reject_change_icon_ck5, logger, "reject_change_icon_ck5");}
//    public void click_reject_all_change_icon_ck5() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, reject_all_changes_icon_ck5, logger, "reject_all_changes_icon_ck5");}


    @FindBy(xpath = "//button[@data-cke-tooltip-text='Source']")
    WebElement source_icon_ck5;
    public void verify_source_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, source_icon_ck5, true, logger, "source_icon_ck5");}
    public void verify_source_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, source_icon_ck5, false, logger, "source_icon_ck5");}


    @FindBy(xpath = "//div[@class='ck ck-toolbar__items']//button[contains(@class,'ck ck-button')]")
    List<WebElement> ck5_editor_items;

    public void capture_ck5_editor_icons() {
        int itemCount = ck5_editor_items.size();
        // Check the count and print accordingly
        if (itemCount % 40 == 0) {
            System.out.println("\n" + "This is either a Editor,Author,Contractor account.  There are: " + itemCount + " items in CK Editor." + "\n");
            logger.log(LogStatus.PASS, "This is either a Editor,Author,or Contractor account.  There are: " + itemCount + " items in CK Editor. ");
        } else if (itemCount % 42 == 0) {
            System.out.println("\n" + "This is an Admin Level Account.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This is an Admin Level Account.  There are: " + itemCount + " items in CK Editor. ");

        } else if (itemCount % 41 == 0) {
            System.out.println("\n" + "This is a PM  Account.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This is a PM  Account.  There are: " + itemCount + " items in CK Editor. ");

        } else if (itemCount % 34 == 0) {
            System.out.println("\n" + "This CK Editor is for Email Notification Template Items.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK Editor is for Email Notification Template Items.  There are: " + itemCount + " items in CK Editor. ");
        } else if (itemCount % 29 == 0) {
            System.out.println("\n" + "This CK5 Editor is for Instruction Items in templates.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK5 Editor is for Instruction Items in templates.  There are: " + itemCount + " items in CK Editor. ");
        } else {
            System.out.println("Unknown number of items in CK Editor.  There are: " + itemCount + " items in CK Editor. ");
        }
    }


    @FindBy(xpath = "(//div[@class='ck ck-toolbar__items'])[2]//button[contains(@class,'ck ck-button')]")
    List<WebElement> ck5_editor_inner_items;

    public void capture_ck5_editor_inner_icons() {
        int itemCount = ck5_editor_inner_items.size();
        // Check the count and print accordingly
        if (itemCount % 33 == 0) {
            System.out.println("\n" + "This CK5 Editor is for WordBank Content Icons.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK5 Editor is for WordBank Content Icons.  There are: " + itemCount + " items in CK Editor. ");
        } else if (itemCount % 29 == 0) {
            System.out.println("\n" + "This CK5 Editor is for Instruction Icons inside Create WB item.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK5 Editor is for Instruction Icons inside Create WB item.  There are: " + itemCount + " items in CK Editor. ");
        } else if (itemCount % 6 == 0) {
            System.out.println("\n" + "This CK5 Editor is for Footnote Icons.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK5 Editor is for Footnote Icons.  There are: " + itemCount + " items in CK Editor. ");
        } else {
            logger.log(LogStatus.FAIL, "Unable to recognize number toolbar items in CK Editor.  There are: " + itemCount + " items in CK Editor. ");
            System.out.println("Unknown number of items in CK Editor.  There are: " + itemCount + " items in CK Editor. ");
        }
    }


    public void verify_ck_editor_root_emailStatusTemplate_permission_level() throws InterruptedException {

        BaseClass.ck5editor().verify_report_tag_icon_isVisible();
        BaseClass.ck5editor().verify_footnote_icon_isVisible();
        BaseClass.ck5editor().verify_lock_icon_isVisible();
        BaseClass.ck5editor().verify_insert_variable_tag_icon_isVisible();
        BaseClass.ck5editor().verify_reference_tag_icon_isVisible();

        BaseClass.ck5editor().capture_ck5_editor_icons();
        Thread.sleep(1000);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
    }
    public void verify_ck5_admin_permission_level() throws InterruptedException {
        BaseClass.staging5().click_and_capture_track_changes_button();
        BaseClass.staging5().click_Section_row_editor_browser();

        BaseClass.ck5editor().verify_report_tag_icon_isVisible();
        BaseClass.ck5editor().verify_gallery_image_icon_isVisible();
        BaseClass.ck5editor().verify_signature_icon_isVisible();
        BaseClass.ck5editor().verify_wordBank_icon_isVisible();
        BaseClass.ck5editor().verify_stamp_icon_isVisible();
        BaseClass.ck5editor().verify_report_link_icon_isVisible();


        BaseClass.ck5editor().verify_footnote_icon_isVisible();
        BaseClass.ck5editor().verify_lock_icon_isVisible();

        BaseClass.ck5editor().verify_reference_tag_icon_isVisible();
        BaseClass.ck5editor().verify_TC_enabled_icon_isVisible();


        //  BaseClass.ck5editor().verify_unlock_icon_is_notVisible();

        BaseClass.ck5editor().capture_ck5_editor_icons();
        Thread.sleep(1000);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
    }

    public void verify_ck5_lower_permission_level() throws InterruptedException {
        BaseClass.staging5().click_and_capture_track_changes_button();
        BaseClass.staging5().click_Section_row_editor_browser();


        BaseClass.ck5editor().verify_report_tag_icon_isVisible();
        BaseClass.ck5editor().verify_gallery_image_icon_isVisible();
        BaseClass.ck5editor().verify_stamp_icon_isVisible();
        BaseClass.ck5editor().verify_signature_icon_isVisible();
        BaseClass.ck5editor().verify_footnote_icon_isVisible();
        BaseClass.ck5editor().verify_report_link_icon_isVisible();
        BaseClass.ck5editor().verify_reference_tag_icon_isVisible();
        BaseClass.ck5editor().verify_TC_enabled_icon_isVisible();


        BaseClass.ck5editor().verify_lock_icon_is_NotVisible();
        //BaseClass.ck5editor().verify_unlock_icon_is_notVisible();
        BaseClass.ck5editor().verify_source_icon_is_notVisible();
        BaseClass.ck5editor().verify_wordBank_icon_is_notVisible();

        BaseClass.ck5editor().capture_ck5_editor_icons();
        Thread.sleep(1000);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
    }



    public void verify_ck_editor_PM_permission_level() throws InterruptedException {
        BaseClass.staging5().click_and_capture_track_changes_button();
        BaseClass.staging5().click_Section_row_editor_browser();

        BaseClass.ck5editor().verify_report_tag_icon_isVisible();
        BaseClass.ck5editor().verify_gallery_image_icon_isVisible();
        BaseClass.ck5editor().verify_signature_icon_isVisible();
        BaseClass.ck5editor().verify_stamp_icon_isVisible();
        BaseClass.ck5editor().verify_report_link_icon_isVisible();
        BaseClass.ck5editor().verify_footnote_icon_isVisible();
        BaseClass.ck5editor().verify_lock_icon_isVisible();
        BaseClass.ck5editor().verify_reference_tag_icon_isVisible();
        BaseClass.ck5editor().verify_comment_icon_isVisible();
       // BaseClass.ck5editor().verify_comments_archive_icon_isVisible();
       // BaseClass.ck5editor().verify_TC_icon_isVisible();
     //   BaseClass.ck5editor().verify_source_icon_isVisible();
        BaseClass.ck5editor().verify_TC_enabled_icon_isVisible();
       // BaseClass.ck5editor().verify_SC_icon_isVisible();

        BaseClass.ck5editor().verify_wordBank_icon_is_notVisible();

        BaseClass.ck5editor().capture_ck5_editor_icons();
        Thread.sleep(1000);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
    }

        public void verify_ck5_wordBank_icons () throws InterruptedException {
            BaseClass.ck5editor().verify_report_tag_icon_isVisible();
            BaseClass.ck5editor().verify_footnote_icon_isVisible();
            BaseClass.ck5editor().verify_lock_icon_isVisible();


            BaseClass.ck5editor().verify_source_icon_isVisible();
            BaseClass.ck5editor().verify_wordBank_icon_is_notVisible();
            BaseClass.ck5editor().capture_ck5_editor_inner_icons();
            Thread.sleep(1000);
        }

    @FindBy(xpath = "//a[normalize-space()='QA Automation permission level test report']")
    WebElement ck5_permissions_report_link;

    public void click_ck5_permissions_report_link() {
      //  driver.navigate().to("https://staging5.openquire.com/reports/666610");

         ReusableMethodsLoggersPOM.clickMethod(driver, ck5_permissions_report_link, logger, "ck5_permissions_report_link");
    }

        public void navigateTo_ck5_report_HM_folder () throws InterruptedException {
           // driver.navigate().to("https://staging5.openquire.com/reports/666610");

            if (baseUrl.contains("staging5")) {
                driver.navigate().to("https://staging5.openquire.com/reports/668855");
            }
            else if (baseUrl.contains("staging3")) {
                                driver.navigate().to("https://staging3.openquire.com/reports/1330243");

//                driver.navigate().to("https://staging3.openquire.com/reports/1330083");
            }

//            BaseClass.staging5().clickReportsTab();
//            BaseClass.reportfoldersection().enterSearchField_HMReports();
//            // Thread.sleep(4500);
//
//            BaseClass.reportfoldersection().captureRecentReportName();
//            BaseClass.reportfoldersection().clickReportsFirstLink();
//            BaseClass.projectFolderSection().clickProjectFolderLink_2023QAReport();
//            BaseClass.reportfoldersection().click_ck5_report_link();
        }

    @FindBy(xpath = "//a[normalize-space()='Alan 091323']")
    WebElement status_Email_Notification_Template;
    public void click_status_Email_Notification_Template() {
        ReusableMethodsLoggersPOM.clickMethod(driver, status_Email_Notification_Template,  logger, "status_Email_Notification_Template");}

    @FindBy(xpath = "//section[@id='email_template_message']")
    WebElement email_template_message;
    public void click_email_template_message() {
        ReusableMethodsLoggersPOM.clickMethod(driver, email_template_message,  logger, "email_template_message");}

    public void ck5_multiple_comments_test() throws InterruptedException {
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);

        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.ck5editor().enter_long_text_body_ck5();
        //   BaseClass.staging5().click_default_section_title();
        //       BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(1500);
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

        BaseClass.ck5editor().enter_second_comment_to_field();
        Thread.sleep(500);
        //        Refresh page

        driver.navigate().refresh();
        // BaseClass.staging5().click_out_of_section();
        Thread.sleep(1000);
        //        Resolve both comments added in step 2
        //  BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
        //  Thread.sleep(500);

        BaseClass.ck5editor().click_unresolved_2_comments_icon();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(500);
        BaseClass.ck5editor().click_comments_resolve_button();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(500);
        //  BaseClass.ck5editor().verify_resolved_2_comment_is_Visible();
        //  Thread.sleep(500);
        BaseClass.ck5editor().click_resolved_2_comments_icon();
        Thread.sleep(500);
        BaseClass.ck5editor().click_and_verify_comments_archive_icon();
        Thread.sleep(500);
        BaseClass.ck5editor().reopen_archived_comment_discussion();
        Thread.sleep(500);
        BaseClass.ck5editor().reopen_second_archived_comment_discussion();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_unresolved_4_comment_is_Visible();
        Thread.sleep(500);
        //delete both comments
        BaseClass.ck5editor().delete_comments_in_field();
        Thread.sleep(500);
        BaseClass.ck5editor().delete_comments_in_field();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_grey_empty_comments_icon();
        Thread.sleep(500);
        BaseClass.ck5editor().select_all_and_backspace_sc_tc_section();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(1000);
    }

    public void ck5_special_section_comments_test() throws InterruptedException {
        BaseClass.ck5editor().click_section_grey_empty_comments_icon();
        Thread.sleep(1000);
        BaseClass.ck5editor().add_new_comment_to_ST();
        BaseClass.ck5editor().verify_unresolved_1_comment_is_Visible();
        BaseClass.ck5editor().click_comments_resolve_button();
        BaseClass.ck5editor().verify_resolved_1_comment_is_Visible();

        BaseClass.ck5editor().click_and_verify_comments_archive_icon();

        BaseClass.ck5editor().reopen_archived_comment_discussion();
        BaseClass.ck5editor().verify_unresolved_2_comment_is_Visible();
        BaseClass.ck5editor().delete_comments_in_field();
        BaseClass.ck5editor().verify_section_grey_empty_comments_icon();
        BaseClass.ck5editor().click_close_button_popup();

    }
    @FindBy(xpath = "//div[@id='comments-createNewThreadAction']")
    WebElement add_new_comment_button;

    @FindBy(xpath = "//li[@class='section-comments js-sectionComments flex-container flex-align-center flex-content-center js-commentsActionTooltipProvider unresolved-comments comments-unresolvedIcon']")
    WebElement unresolved_comments_icon;
    public void add_new_comment_to_ST() throws InterruptedException {

        ReusableMethodsLoggersPOM.clickMethod(driver, add_new_comment_button, logger, " add_new_comment_button ");
        BaseClass.ck5editor().enter_comment_to_field();
    }

    @FindBy(xpath = "//td[contains(@class, 'htLeft') and contains(@class, 'unresolved-comments')]")
    List <WebElement> unresolved_cells;

    @FindBy(xpath = "//div[@class='comments-unresolvedIcon cursor-default text-center height-22 width-22 text-tiny line-height-2 js-item-unresolvedCommentCount'][normalize-space()='1']")
    List <WebElement> unresolved_comments_comment_panel;
    public void verify_unresolved_comments_smartTable() throws InterruptedException {
        int unresolved_comments_panel_count = unresolved_comments_comment_panel.size();
        int unresolved_cells_count = unresolved_cells.size();
        if (unresolved_comments_panel_count == unresolved_cells_count) {
            System.out.println("Test Passed: There are exactly " + unresolved_comments_panel_count + " unresolved comments in the comment panel and the cells.");
            logger.log(LogStatus.PASS, "Test Passed: There are exactly " + unresolved_comments_panel_count + " unresolved comments in the comment panel and the cells.");
        } else {
            System.out.println("Unable to verify same number of unresolved comments in the comment panel (" + unresolved_comments_panel_count + ") and the cells  (" + unresolved_cells_count + ").");
            logger.log(LogStatus.FAIL, "Unable to verify same number of unresolved comments in the comment panel (" + unresolved_comments_panel_count + ") and the cells  (" + unresolved_cells_count + ").");
        }
    }

    @FindBy(xpath = "//td[contains(@class, 'htLeft') and contains(@class, 'archived-comments')]")
    List <WebElement> resolved_cells;
    @FindBy(xpath = "//div[@class='comments-resolvedIcon cursor-default text-center height-22 width-22 text-tiny line-height-2 js-item-resolvedCommentCount'][normalize-space()='1']")
    List <WebElement> resolved_comments_comment_panel;
    public void verify_resolved_comments_smartTable() throws InterruptedException {
        int resolved_comments_panel_count = resolved_comments_comment_panel.size();
        int resolved_cells_count = resolved_cells.size();
        if (resolved_comments_panel_count == 3 && resolved_cells_count == 2) {
            System.out.println("Test Passed: There are  " + resolved_comments_panel_count + " resolved comments in the comment panel and " + resolved_cells_count + " resolved comments in the cells.");
            logger.log(LogStatus.PASS, "Test Passed: There are  " + resolved_comments_panel_count + " resolved comments in the comment panel and " + resolved_cells_count + " resolved comments in the cells.");
        } else {
            System.out.println("Unable to verify 3 resolved comments in the comment panel (" + resolved_comments_panel_count + ") and the 2 resolved cells  (" + resolved_cells_count + ").");
            logger.log(LogStatus.FAIL, "Unable to verify 3 resolved comments in the comment panel (" + resolved_comments_panel_count + ") and the 2 resolved cells  (" + resolved_cells_count + ").");
        }
    }

    @FindBy(xpath = "//span[@class='badge-count color-black text-small font-semibold bg-color-yellow-bright' and contains(text(), '4')]")
    WebElement unresolved_4_comments_hover_icon;
    @FindBy(xpath = "//span[@class='badge-count color-black text-small font-semibold bg-color-green-bright' and contains(text(), '3')]")
    WebElement resolved_3_comments_hover_icon;

    public void verify_comments_hover_icon() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unresolved_4_comments_hover_icon,true,  logger, " unresolved_4_comments_hover_icon ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, resolved_3_comments_hover_icon,true,  logger, " resolved_3_comments_hover_icon ");
    }

    @FindBy(xpath = "//div[@class='js-commentsActionTooltipProvider height-20 width-20 unresolved-comments comments-unresolvedIcon']")
    WebElement comments_icon_statusBar;

    public void hover_comments_icon_statusBar() throws InterruptedException {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, comments_icon_statusBar,  logger, " comments_icon_statusBar ");
    }

    @FindBy(xpath = "//a[@class='js-closePanel']")
    WebElement close_button_popup;

    public void click_close_button_popup() {
        ReusableMethodsLoggersPOM.clickMethod(driver, close_button_popup, logger, "close_button_popup");
    }


    @FindBy(xpath = "//button[@data-cke-tooltip-text='To-do List']")
    WebElement to_do_list_ck5;
    public void click_to_do_list_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, to_do_list_ck5,  logger, "to_do_list_ck5");}

    @FindBy(xpath = "//ul[@class='todo-list']//li")
    List <WebElement> to_do_list_textBox_ck5;

    @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//ul[@class='todo-list']//input[@type='checkbox']")
    List <WebElement> to_do_list_checkBox_ck5;

    @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']//ul[@class='todo-list']//input[@type='checkbox']")
    WebElement to_do_list_checkBox1_ck5;

    public void enter_text_toDoList_ck5() throws InterruptedException {

        for (int i = 0; i <= 3; i++) {
            String text = "QA 'Automation' Notes Text " + i; // Ensures left-to-right order
            if (driver instanceof ChromeDriver) {
                ReusableMethodsLoggersPOM.sendKeysandSubmitMethod2(driver, to_do_list_textBox_ck5.get(i), text, logger, "toDo List iteration " + i);
            }
            else if (driver instanceof FirefoxDriver) {
                ReusableMethodsLoggersPOM.sendKeysandSubmitMethod2(driver, text_body1_ff, text, logger, "toDo List iteration " + i);
            }

//                ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, to_do_list_textBox_ck5.get(i), text, logger, "toDo List iteration " + i);
            // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        }
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//        BaseClass.staging5().clickSection_row_editor();
      //  Thread.sleep(9000);
       // System.out.println("Number of checkboxes found: " + to_do_list_checkBox_ck5.size());

          //  ReusableMethodsLoggersPOM.clickMethod(driver, to_do_list_checkBox1_ck5, logger, "to_do_list_checkBox1_ck5");
Thread.sleep(2000);
        String osName = System.getProperty("os.name").toLowerCase();
       // System.out.println(osName);
        if (!osName.contains("linux")) {
            for (int i = 0; i <= 1; i++) {
                ReusableMethodsLoggersPOM.clickMethod(driver, to_do_list_checkBox_ck5.get(i), logger, "toDo checkbox # " + i);
            }
        } else {
            System.out.println("Skipping checkbox clicks on Linux environment");
            logger.log(LogStatus.PASS, "Skipping checkbox clicks on Linux environment");
        }
    }


    @FindBy(xpath = "//input[@checked]")
    WebElement checked_toDOList_item1_ck5_qp;
    @FindBy(xpath = "(//input[@checked])[2]")
    WebElement checked_toDOList_item2_ck5_qp;

    @FindBy(xpath = "//ul[@class='todo-list']")
    WebElement toDoList_text_ck5_qp;

    public void verify_toDoList_items_ck5_qp() throws InterruptedException {
        String osName = System.getProperty("os.name").toLowerCase();
      //  System.out.println(osName);
        if (!osName.contains("linux")) {
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, checked_toDOList_item1_ck5_qp,true,  logger, " checked_toDOList_item1_ck5_qp ");
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, checked_toDOList_item2_ck5_qp, true, logger, " checked_toDOList_item2_ck5_qp ");

        } else {
            System.out.println("Skipping verification on filled to-do items on Linux environment");
            logger.log(LogStatus.PASS, "Skipping verification on filled to-do items on Linux environment");
        }

        String toDoList_text_string = ReusableMethodsLoggersPOM.captureTextMethod(driver, toDoList_text_ck5_qp,  logger, " toDoList_text_ck5_qp ");

        if (toDoList_text_string.contains("QA ‘Automation’ Notes Text 0") &&
                toDoList_text_string.contains("QA ‘Automation’ Notes Text 3")) {
            logger.log(LogStatus.PASS, "Successfully verified - To-Do List items - as expected.");
            System.out.println("Successfully verified - To-Do List items - as expected.");
        } else {
            logger.log(LogStatus.FAIL, "Failed to verify - To-Do List items - NOT as expected.");
            System.out.println("Failed to verify - To-Do List items - NOT as expected.");
        }
    }



}






