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


    @FindBy(xpath = "//button[@data-cke-tooltip-text='AI Commands']")
    WebElement quire_AI_icon_ck5;
    public void click_quire_AI_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_icon_ck5, logger, "quire_AI_icon_ck5");}
    public void verify_quire_AI_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_icon_ck5, true, logger, "quire_AI_icon_ck5");}
    public void verify_quire_AI_icon_isNotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_icon_ck5, false, logger, "quire_AI_icon_ck5");}

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

    @FindBy(xpath = "//span[contains(text(), 'Adjust Content Tone')]")
    WebElement quire_AI_dropDown_adjustContentTone_header_button;
    public void click_quire_AI_dropDown_adjustContentTone_header_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_adjustContentTone_header_button, logger, "quire_AI_dropDown_adjustContentTone_header_button");}

    @FindBy(xpath = "//span[contains(text(), 'Summarize')]")
    WebElement quire_AI_dropDown_summarize_button;
    public void click_quire_AI_dropDown_summarize_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_summarize_button, logger, "quire_AI_dropDown_summarize_button");}

    @FindBy(xpath = "//span[contains(text(), 'Thesaurus')]")
    WebElement quire_AI_dropDown_thesaurus_button;
    public void click_quire_AI_dropDown_thesaurus_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_thesaurus_button, logger, "quire_AI_dropDown_thesaurus_button");}

    @FindBy(xpath = "//span[contains(text(), 'Technical')]")
    WebElement  quire_AI_dropDown_technical_button;
    public void click_quire_AI_dropDown_technical_tone_button() {
        ReusableMethodsLoggersPOM.scrollandClickMethod(driver, quire_AI_dropDown_technical_button, logger, "quire_AI_dropDown_technical_button");}

    @FindBy(xpath = "//div[@class='ck ck-ai-form__loader']")
    WebElement quire_AI_loading_prompt;
    public void click_quire_AI_loading_prompt() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_loading_prompt, logger, "quire_AI_loading_prompt");}

    public void verify_quire_AI_loading_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_loading_prompt, true, logger, "quire_AI_loading_prompt");}

    public void verify_quire_AI_done_loading_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_loading_prompt, false, logger, "quire_AI_loading_prompt");}

    @FindBy(xpath = "//div[@class='ck ck-content ck-reset_all-excluded ck-ai-form__content-field']")
    WebElement quire_AI_empty_prompt;
    public void verify_quire_AI_empty_prompt() {
        ReusableMethodsLoggersPOM.verifyEmptyText(driver, quire_AI_empty_prompt, logger, "quire_AI_empty_prompt");}
       // ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_empty_prompt, true, logger, "quire_AI_empty_prompt");}

    @FindBy(xpath = "QA Automation Testing")
    WebElement quire_AI_summarized_generated_prompt;
    public void verify_quire_AI_summarize_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_summarized_generated_prompt, true, logger, "quire_AI_summarized_generated_prompt");}

    @FindBy(xpath = "//li[contains(text(),': quality assurance, quality control, inspection')]")
    WebElement quire_AI_thesaurus_generated_prompt;
    public void verify_quire_AI_thesaurus_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_thesaurus_generated_prompt, true, logger, "quire_AI_thesaurus_generated_prompt");}


    @FindBy(xpath = "//div[@class='ck ck-content ck-reset_all-excluded ck-ai-form__content-field']//h2[contains(text(), 'Systematic') and contains(text(), 'Automation') and contains(text(), 'Framework')]")
    WebElement quire_AI_technical_tone_generated_prompt;
    public void verify_quire_AI_technical_tone_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_technical_tone_generated_prompt, true, logger, "quire_AI_technical_tone_generated_prompt");}


    @FindBy(xpath = "//h2[contains(text(), 'Systematic') and contains(text(), 'Automation')]")
    WebElement quire_AI_technical_tone_generated_text;
    public void verify_quire_AI_technical_tone_generated_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_technical_tone_generated_text, true, logger, "quire_AI_technical_tone_generated_text");}





    @FindBy(xpath = "//div[@class='ck ck-toolbar ck-ai-form__toolbar']//span[contains(text(), 'Replace')]")
    WebElement quire_AI_replace_button;
    public void click_quire_AI_replace_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_replace_button, logger, "quire_AI_replace_button");}


    @FindBy(xpath = "//div[@class='ck ck-toolbar ck-ai-form__toolbar']//span[contains(text(), 'Insert below')]")
    WebElement quire_AI_insert_below_button;
    public void click_quire_AI_insert_below_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_insert_below_button, logger, "quire_AI_insert_below_button");}


    @FindBy(xpath = "//div[@class='ck ck-toolbar ck-ai-form__toolbar']//span[contains(text(), 'Try again')]")
    WebElement quire_AI_try_again_button;
    public void click_quire_AI_try_again_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_try_again_button, logger, "quire_AI_try_again_button");}

    @FindBy(xpath = "//div[@class='ck ck-toolbar ck-ai-form__toolbar']//span[contains(text(), 'Stop')]")
    WebElement quire_AI_stop_button;
    public void click_quire_AI_stop_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_stop_button, logger, "quire_AI_stop_button");}

    @FindBy(xpath = "//button[@class='ck ck-button ck-ai-form__copy-button ck-off']")
    WebElement quire_AI_copy_text_button;
    public void click_quire_AI_copy_text_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_copy_text_button, logger, "quire_AI_copy_text_button");}


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






