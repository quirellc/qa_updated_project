package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quire_AI extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public Quire_AI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "//body")
    WebElement ck4_editor_body;

    public void select_all_text_body() {
        ReusableMethodsLoggersPOM.selectAll_method(driver, ck4_editor_body, logger, " ck4_editor_body");
    }
    public void paste_text_body() {
        ReusableMethodsLoggersPOM.clickEnterThenPaste_method(driver, ck4_editor_body, logger, " ck4_editor_body");
    }

    @FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
    WebElement ck4_editor_iframe;

    public void switch_to_ck4_editor_iframe() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, ck4_editor_iframe, logger, "ck4_editor_iframe");}

    @FindBy(xpath = "//iframe[@class='cke_panel_frame']")
    WebElement ck4_editor_AI_toolbar_iframe;

    public void switch_to_ck4_AI_toolbar_iframe() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, ck4_editor_AI_toolbar_iframe, logger, "ck4_editor_AI_toolbar_iframe");}

    @FindBy(xpath = "//iframe[@class='quire-ai-response-iframe']")
    WebElement quire_AI_prompt_iframe;
    public void switch_to_quire_AI_prompt_iframe() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, quire_AI_prompt_iframe, logger, "quire_AI_prompt_iframe");}

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quireai_icon']")
    WebElement quire_AI_icon_ck4;
    public void click_quire_AI_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_icon_ck4, logger, "quire_AI_icon_ck4");}
    public void verify_quire_AI_icon_isNotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_icon_ck4, false, logger, "quire_AI_icon_ck4");}

    @FindBy(xpath = "(//ul[contains(@class, 'ck') and contains(@class, 'ck-reset')])[1]")
        WebElement quire_AI_dropDownItems;
        public void verify_quire_AI_dropDownItems() {
           String quire_AI_dropDownItems_text = ReusableMethodsLoggersPOM.captureTextMethod(driver, quire_AI_dropDownItems, logger, "quire_AI_dropDownItems");
        if (quire_AI_dropDownItems_text.equals("Generate Content\n" +
                "Content Assistant\n" +
                "Adjust Content Tone")) {
            System.out.println("Test Passed:  quire_AI_dropDownItems  are as expected.");
            logger.log(LogStatus.PASS, "Test Passed:  quire_AI_dropDownItems  are as expected.");
        } else {
            System.out.println("TEST FAILED, UNABLE TO VERIFY quire_AI_dropDownItems: " + quire_AI_dropDownItems_text + " :  NOT as expected.");
            logger.log(LogStatus.FAIL, "TEST FAILED, UNABLE TO VERIFY quire_AI_dropDownItems: " + quire_AI_dropDownItems_text + "  :   NOT expected.");
        }
    }

    @FindBy(xpath = "//span[contains(text(), 'Generate Content')]")
    WebElement quire_AI_dropDown_generateContent_header_button;
    public void click_quire_AI_dropDown_generateContent_header_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_generateContent_header_button, logger, "quire_AI_dropDown_generateContent_header_button");}

    @FindBy(xpath = "//span[contains(text(), 'Content Assistant')]")
    WebElement quire_AI_dropDown_contentAssistant_header_button;
    public void click_quire_AI_dropDown_contentAssistant_header_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_contentAssistant_header_button, logger, "quire_AI_dropDown_contentAssistant_header_button");}

    @FindBy(xpath = "//button[.//span[contains(text(), 'Adjust Content Tone')]]")
    WebElement quire_AI_dropDown_adjustContentTone_header_button;
    public void click_quire_AI_dropDown_adjustContentTone_header_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_adjustContentTone_header_button, logger, "quire_AI_dropDown_adjustContentTone_header_button");}

    @FindBy(xpath = "//button[contains(text(), 'Summarize')]")
    WebElement quire_AI_dropDown_summarize_button;
    public void click_quire_AI_dropDown_summarize_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_summarize_button, logger, "quire_AI_dropDown_summarize_button");}

    @FindBy(xpath = "//button[contains(text(), 'Suggest References')]")
    WebElement quire_AI_dropDown_suggest_references_button;
    public void click_quire_AI_dropDown_suggest_references_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_suggest_references_button, logger, "quire_AI_dropDown_suggest_references_button");}

    @FindBy(xpath = "//button[contains(text(), 'Technical')]")
    WebElement  quire_AI_dropDown_technical_button;
    public void click_quire_AI_dropDown_technical_tone_button() {
        ReusableMethodsLoggersPOM.scrollandClickMethod(driver, quire_AI_dropDown_technical_button, logger, "quire_AI_dropDown_technical_button");}

    @FindBy(xpath = "//div[@class='quire-ai-response-placeholder' and normalize-space()='AI is writing…']")
    WebElement quire_AI_loading_prompt;
    public void click_quire_AI_loading_prompt() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_loading_prompt, logger, "quire_AI_loading_prompt");}

    public void verify_quire_AI_loading_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_loading_prompt, true, logger, "quire_AI_loading_prompt");}

    public void verify_quire_AI_done_loading_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_loading_prompt, false, logger, "quire_AI_loading_prompt");}

    @FindBy(xpath = "//div[@class='quire-ai-response-placeholder']")
    WebElement quire_AI_empty_prompt;
    public void verify_quire_AI_empty_prompt() {
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, quire_AI_empty_prompt, logger, "quire_AI_empty_prompt");}
       // ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_empty_prompt, true, logger, "quire_AI_empty_prompt");}

    @FindBy(xpath = "//p[contains(text(), 'CBRE, Inc.') and contains(text(), 'Phase I Environmental Site Assessment') and contains(text(), 'ASTM E 1527-21') and contains(text(), '40 C.F.R.') and contains(text(), 'Part 312')]")
    WebElement quire_AI_summarize_coverLetter_generated_prompt;
    public void verify_quire_AI_summarize_coverLetter_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_summarize_coverLetter_generated_prompt, true, logger, " quire_AI_summarize_coverLetter_generated_prompt");}

    @FindBy(xpath = "//ins[contains(@class,'ice-ins') and contains(text(), 'CBRE, Inc.') and contains(text(), 'Phase I Environmental Site Assessment') and contains(text(), 'ASTM E 1527-21')]")
    WebElement quire_AI_summarize_coverLetter_inserted_text;
    public void verify_quire_AI_summarize_coverLetter_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_summarize_coverLetter_inserted_text, true, logger, "quire_AI_summarize_coverLetter_inserted_text");}

    @FindBy(xpath = "//p[contains(text(), 'Environmental Site Assessment') and contains(text(), 'Wawa Store') and contains(text(), 'placeholders')]")
    WebElement quire_AI_summarize_titlePage_generated_prompt;
    public void verify_quire_AI_summarize_titlePage_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_summarize_titlePage_generated_prompt, true, logger, "quire_AI_summarize_titlePage_generated_prompt");}

    @FindBy(xpath = "//ins[contains(@class,'ice-ins') and contains(text(), 'Environmental Site Assessment') and contains(text(), 'Wawa Store') and contains(text(), 'placeholders')]")
    WebElement quire_AI_summarize_titlePage_inserted_text;
    public void verify_quire_AI_summarize_titlePage_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_summarize_titlePage_inserted_text, true, logger, " quire_AI_summarize_titlePage_inserted_text");}

    @FindBy(xpath = "//li[contains(., 'ASTM International') and contains(., 'E1527-21')]")
    WebElement quire_AI_suggest_references_generated_prompt;
    public void verify_quire_AI_suggest_references_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_suggest_references_generated_prompt, true, logger, "quire_AI_suggest_references_generated_prompt");}

    @FindBy(xpath = "//ins[contains(@class,'ice-ins') and contains(., 'ASTM International') and contains(., 'E1527-21') and contains(., 'Environmental Site Assessment')]")
    WebElement quire_AI_suggest_references_inserted_text;
    public void verify_quire_AI_suggest_references_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_suggest_references_inserted_text, true, logger, " quire_AI_suggest_references_inserted_text");}


    @FindBy(xpath = "//p[contains(text(), 'Interior architectural surfaces') and contains(text(), 'gypsum board') and contains(text(), 'resilient flooring') and contains(text(), 'concrete')]")
    WebElement quire_AI_technical_tone_generated_prompt;
    public void verify_quire_AI_technical_tone_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_technical_tone_generated_prompt, true, logger, " quire_AI_technical_tone_generated_prompt");}

    @FindBy(xpath = "//ins[contains(@class,'ice-ins') and contains(text(), 'Interior architectural surfaces') and contains(text(), 'gypsum board') and contains(text(), 'resilient flooring')]")
    WebElement quire_AI_technical_tone_inserted_text;
    public void verify_quire_AI_technical_tone_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_technical_tone_inserted_text, true, logger, " quire_AI_technical_tone_inserted_text");}

    @FindBy(xpath = "//span[contains(text(),'Walls of painted drywall; floors of carpet, resili')]")
    WebElement smartTable_cell_text_to_select;
    public void click_smartTable_cell_text_to_select() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, smartTable_cell_text_to_select, logger, "smartTable_cell_text_to_select");}





    @FindBy(xpath = "//span[@class='cke_dialog_ui_button' and contains(text(), 'Replace')]")
    WebElement quire_AI_replace_button;
    public void click_quire_AI_replace_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_replace_button, logger, "quire_AI_replace_button");}


    @FindBy(xpath = "//span[@class='cke_dialog_ui_button' and contains(text(), 'Insert Below')]")
    WebElement quire_AI_insert_below_button;
    public void click_quire_AI_insert_below_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_insert_below_button, logger, "quire_AI_insert_below_button");}


    @FindBy(xpath = "//span[@class='cke_dialog_ui_button' and contains(text(), 'Try Again')]")
    WebElement quire_AI_try_again_button;
    public void click_quire_AI_try_again_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_try_again_button, logger, "quire_AI_try_again_button");}

    @FindBy(xpath = "//span[@class='cke_dialog_ui_button' and contains(text(), 'Stop')]")
    WebElement quire_AI_stop_button;
    public void click_quire_AI_stop_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_stop_button, logger, "quire_AI_stop_button");}

    @FindBy(xpath = "//i[@class='fa-regular fa-copy quire-ai-copy-icon']")
    WebElement quire_AI_copy_text_button;
    public void click_quire_AI_copy_text_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_copy_text_button, logger, "quire_AI_copy_text_button");}


    @FindBy(xpath = "//a[contains(@id, 'cke_dialog_close_button')]")
    WebElement cancel_quire_AI_prompt;
    public void click_cancel_quire_AI_prompt() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancel_quire_AI_prompt, logger, "cancel_quire_AI_prompt");}

    @FindBy(xpath = "//div[@class='ck ck-form__header']//button[@data-cke-tooltip-text='Close']")
    WebElement quire_AI_close_prompt_button;
    public void click_quire_AI_close_prompt_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_close_prompt_button, logger, "quire_AI_close_prompt_button");}

//    --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -------
    //    --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- -------

    @FindBy(xpath = "//span[@class='label-full truncate']")
    WebElement quire_AI_search_field;
    public void click_quire_AI_search_field() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_search_field, logger, "quire_AI_search_field");}

@FindBy(xpath= "//input[@placeholder=\"Tell Quire AI what you're looking for...\"]")
WebElement quire_AI_prompt_search_field;
public void enter_quire_AI_prompt_search_field() {
    ReusableMethodsLoggersPOM.sendKeysMethod(driver, quire_AI_prompt_search_field, "texas" ,  logger, "quire_AI_prompt_search_field");}

    @FindBy(xpath= "//button[normalize-space()='Search']")
    WebElement quire_AI_search_button;
    public void click_quire_AI_search_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_search_button, logger, "quire_AI_search_button");}

    @FindBy(xpath= "//sl-select[@placeholder='Status']")
    WebElement quire_AI_status_field;
    public void click_quire_AI_status_field() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_status_field, logger, "quire_AI_status_field");}

    @FindBy(xpath= "//sl-select[@placeholder='System Label']")
    WebElement quire_AI_system_label_field;
    public void click_quire_AI_system_label_field() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_system_label_field, logger, "quire_AI_system_label_field");}

    @FindBy(xpath= "//sl-option[contains(@role, 'option')]")
    List<WebElement> quire_AI_status_dropdown_values;
    public void capture_quire_AI_status_value() {

        List<String> expectedValues = Arrays.asList("Data Entry", "Review", "Draft", "Final", "Final - Locked");
        List<String> actualValues = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            String text =ReusableMethodsLoggersPOM.saveTextMethod(driver, quire_AI_status_dropdown_values.get(i), logger, "quire_AI_status_dropdown_values");
            actualValues.add(text);
        }
        if (actualValues.equals(expectedValues)) {
            System.out.println("Dropdown values match expected values ✅");
        } else {
            System.out.println("Mismatch in dropdown values ❌");
            System.out.println("Expected: " + expectedValues);
            System.out.println("Actual: " + actualValues);
        }
    }

    @FindBy(xpath= "//div[contains(@class, 'ai-search-result js-ai-search-result flex items-center gap-8 width-full')]")
    WebElement quire_AI_search_result;
    public void hover_quire_AI_first_search_result() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, quire_AI_search_result, logger, "quire_AI_search_result");
    }

    @FindBy(xpath= "//button[contains(@data-original-title, 'Ask AI about this Report')]")
    WebElement quire_AI_ask_about_report_button;
    public void click_quire_AI_ask_ai_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_ask_about_report_button, logger, "quire_AI_ask_about_report_button");
    }

    @FindBy(xpath = "//button[contains(@data-action, 'open-external')]")
    WebElement quire_AI_open_external_button;
    public void click_quire_AI_open_external_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_open_external_button, logger, "quire_AI_open_external_button");
    }

    @FindBy(xpath = "//button[@data-action='open']")
    WebElement quire_AI_open_link_button;
    public void click_quire_AI_open_link_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_open_link_button, logger, "quire_AI_open_link_button");
    }

}






