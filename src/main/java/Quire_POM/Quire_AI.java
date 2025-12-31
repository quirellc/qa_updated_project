package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.time.Duration;
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

    @FindBy(xpath = "//span[contains(text(), 'Suggest References')]")
    WebElement quire_AI_dropDown_suggest_references_button;
    public void click_quire_AI_dropDown_suggest_references_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_dropDown_suggest_references_button, logger, "quire_AI_dropDown_suggest_references_button");}

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

    @FindBy(xpath = "//p[contains(text(), 'CBRE, Inc.') and contains(text(), 'Phase I Environmental Site Assessment') and contains(text(), 'ASTM E 1527-21') and contains(text(), '40 C.F.R. Part 312')]")
    WebElement quire_AI_summarized_generated_prompt;

    public void verify_quire_AI_summarize_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_summarized_generated_prompt, true, logger, "quire_AI_summarized_generated_prompt");}
    @FindBy(xpath = "//span[contains(@class,'ck-suggestion-marker ck-suggestion-marker-insertion') and contains(text(), 'CBRE, Inc.') and contains(text(), 'Phase I Environmental Site Assessment') and contains(text(), 'ASTM E 1527-21')]")
    WebElement quire_AI_summarize_coverLetter_inserted_text;

    public void verify_quire_AI_summarize_coverLetter_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_summarize_coverLetter_inserted_text, true, logger, "quire_AI_summarize_coverLetter_inserted_text");}
    @FindBy(xpath = "//p[contains(text(), 'Environmental Site Assessment') and contains(text(), 'Wawa') and contains(text(), 'placeholders')]")
    WebElement quire_AI_summarize_titlePage_generated_prompt;
    public void verify_quire_AI_summarize_titlePage_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_summarize_titlePage_generated_prompt, true, logger, "quire_AI_summarize_titlePage_generated_prompt");}

    @FindBy(xpath = "//span[contains(@class,'ck-suggestion-marker ck-suggestion-marker-insertion') and contains(text(), 'Environmental Site Assessment') and contains(text(), 'Wawa') and contains(text(), 'placeholders')]")
    WebElement quire_AI_summarize_titlePage_inserted_text;
    public void verify_quire_AI_summarize_titlePage_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_summarize_titlePage_inserted_text, true, logger, " quire_AI_summarize_titlePage_inserted_text");}

    @FindBy(xpath = "//li[contains(., 'ASTM International') and contains(., 'E1527-21')]")
    WebElement quire_AI_suggest_references_generated_prompt;
    public void verify_quire_AI_suggest_references_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_suggest_references_generated_prompt, true, logger, "quire_AI_suggest_references_generated_prompt");}

    @FindBy(xpath = "//span[contains(@class,'ck-suggestion-marker ck-suggestion-marker-insertion') and contains(text(), 'ASTM International') and contains(text(), 'E1527-21') and contains(text(), 'Environmental Site Assessment')]")
    WebElement quire_AI_suggest_references_inserted_text;
    public void verify_quire_AI_suggest_references_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_suggest_references_inserted_text, true, logger, "quire_AI_suggest_references_inserted_text");}

    @FindBy(xpath = "//div[@class='ck ck-ai-form__content-area']//p[contains(text(), 'Automated Quality Assurance') and contains(text(), 'Validation') and contains(text(), 'Lexical')]")
    WebElement quire_AI_technical_tone_generated_prompt1;
    public void verify_quire_AI_technical_tone_generated_prompt1() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_technical_tone_generated_prompt, true, logger, "quire_AI_technical_tone_generated_prompt");}


    @FindBy(xpath = "//p[contains(text(), 'Automated Quality Assurance') and contains(text(), 'Validation') and contains(text(), 'Lexical')]")
    WebElement quire_AI_technical_tone_generated_text;
    public void verify_quire_AI_technical_tone_generated_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_technical_tone_generated_text, true, logger, "quire_AI_technical_tone_generated_text");}



    @FindBy(xpath = "//span[contains(text(), 'Interior architectural surfaces') and contains(text(), 'gypsum board') and contains(text(), 'resilient flooring') and contains(text(), 'concrete')]")
    WebElement quire_AI_technical_tone_generated_prompt;
    public void verify_quire_AI_technical_tone_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_technical_tone_generated_prompt, true, logger, " quire_AI_technical_tone_generated_prompt");}

    @FindBy(xpath = "//span[contains(@class,'ck-suggestion-marker ck-suggestion-marker-insertion') and contains(text(), 'Interior architectural surfaces') and contains(text(), 'gypsum board') and contains(text(), 'resilient flooring')]")
    WebElement quire_AI_technical_tone_inserted_text;
    public void verify_quire_AI_technical_tone_inserted_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quire_AI_technical_tone_inserted_text, true, logger, " quire_AI_technical_tone_inserted_text");}

    @FindBy(xpath = "//span[contains(text(),'Walls of painted drywall; floors of carpet, resili')]")
    WebElement smartTable_cell_text_to_select;
    public void click_smartTable_cell_text_to_select() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, smartTable_cell_text_to_select, logger, "smartTable_cell_text_to_select");}


    @FindBy(xpath = "//div[@aria-label='Rich Text Editor. Editing area: main. Press ⌥0 for help.']")
    WebElement TC_body_text;
    public void select_all_TC_body_text() {
        ReusableMethodsLoggersPOM.selectAll_method(driver, TC_body_text, logger, "TC_body_text");}




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


    @FindBy(xpath = "//div[contains(@class, 'ai-search-modal-body') and contains(., 'Welcome to Quire AI Search')]")
    WebElement quire_AI_prompt_text;
    public void verify_quire_AI_prompt_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_prompt_text, true, logger, "quire_AI_prompt_text");}

@FindBy(xpath= "//input[@placeholder=\"Tell Quire AI what you're looking for...\"]")
WebElement quire_AI_prompt_search_field;
public void enter_quire_AI_prompt_search_field() {
    ReusableMethodsLoggersPOM.sendKeysMethod(driver, quire_AI_prompt_search_field, "ESA String Package" ,  logger, "quire_AI_prompt_search_field");}

    @FindBy(xpath = "//i[@class='fa fa-filter fa-lg fa-fw']")
    WebElement quire_AI_filter_button;
    public void click_quire_AI_filter_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_filter_button, logger, "quire_AI_filter_button");}




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
    public void confirm_quire_AI_status_value() {

//        List<String> expectedValues = Arrays.asList("Data Entry", "Review", "Draft", "Final", "Final - Locked");
        List<String> expectedValues = Arrays.asList("Writing", "Ready for Review", "In Review", "Draft", "Final", "Final Locked");

        List<String> actualValues = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
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

    @FindBy(xpath= "//sl-option[@value='295']")
    WebElement writing_status_dropdown_option;
    public void click_writing_status_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, writing_status_dropdown_option, logger, "writing_status_dropdown_option");}

    @FindBy(xpath= "//div[contains(@class, 'ai-search-result js-ai-search-result flex items-center gap-8 width-full')]")
    WebElement quire_AI_search_result;
    public void hover_quire_AI_first_search_result() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, quire_AI_search_result, logger, "quire_AI_search_result");
    }

    @FindBy(xpath= "//div[@class='js-ai-search-result-title font-semibold text-lg truncate has-tooltip']")
    WebElement quire_AI_search_result_title;

    @FindBy(xpath= "//a[@title='Click to view all reports in this project']")
    WebElement report_title;
    public void confirm_report_opened_new_tab_and_sameTab() throws InterruptedException {
      String report_name_AI =  ReusableMethodsLoggersPOM.captureTextMethod(driver, quire_AI_search_result_title, logger, "quire_AI_search_result_title");

        BaseClass.quire_AI().click_quire_AI_open_external_button();
        Thread.sleep(500);

        BaseClass.reportfoldersection().change_to_next_tab();

        String report_title_name =  ReusableMethodsLoggersPOM.captureTextMethod(driver, report_title, logger, "report_title");

if (report_name_AI.equals(report_title_name)) {
    System.out.println("Report name matches: " + report_name_AI);
} else {
    System.out.println("Report from AI search " + report_name_AI + " does not match report opened: " + report_title_name);
}
driver.close();
        BaseClass.reportfoldersection().change_to_default_tab();
        BaseClass.quire_AI().hover_quire_AI_first_search_result();


        BaseClass.quire_AI().click_quire_AI_open_link_button();

        String report_title_name_1 =  ReusableMethodsLoggersPOM.captureTextMethod(driver, report_title, logger, "report_title");


        if (report_name_AI.equals(report_title_name_1)) {
            System.out.println("Report name matches: " + report_name_AI);
        } else {
            System.out.println("Report from AI search " + report_name_AI + " does not match report opened: " + report_title_name);
        }
    }

    @FindBy(xpath = "//div[@class='ai-chat-launcher js-ai-chat-launcher']")
    WebElement ask_quire_button;
    public void click_ask_quire_button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, ask_quire_button, logger, "ask_quire_button");

        ReusableMethodsLoggersPOM.clickMethod(driver, ask_quire_button, logger, "ask_quire_button");
    }

    @FindBy(xpath = "//i[@class='fa fa-angle-left fa-lg fa-fw']")
    WebElement AI_chat_back_button;
    public void click_AI_chat_back_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, AI_chat_back_button, logger, "AI_chat_back_button");
    }

    @FindBy(xpath = "//div[@class='ai-chat-body js-ai-chat-body grow-1 overflow-y-auto']")
    WebElement AI_chat_body;
    public void verify_AI_intro_chat_body() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_body, logger, "AI_chat_body");
        if (result.contains("Here are some things you can do:") &&
                result.contains("Find Reports with AI (and chat with them)") &&
                result.contains("Chat from a Report, Project Folder, or Portfolio view")) {
            System.out.println("Chat AI body matches ✅");
            logger.log(LogStatus.PASS, "Chat AI body matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI body does not match ❌");
            System.out.println("Chat AI body does not match ❌");
        }

    }
    @FindBy(xpath= "//button[normalize-space()='All Folders']")
    WebElement quire_AI_all_folders_button;
    public void click_quire_AI_all_folders_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_all_folders_button, logger, "quire_AI_all_folders_button");
    }

    @FindBy(xpath= "//button[normalize-space()='All Portfolios']")
    WebElement quire_AI_all_portfolios_button;
    public void click_quire_AI_all_portfolios_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_all_portfolios_button, logger, "quire_AI_all_portfolios_button");
    }

    @FindBy(xpath= "//button[@class='btn btn-ai-light flex items-center gap-8']")
    WebElement quire_AI_continue_conversation_button;
        public void click_quire_AI_continue_conversation_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_continue_conversation_button, logger, "quire_AI_continue_conversation_button");
    }

    @FindBy(xpath= "//q-chat-session-start-active[@class='ai-chat-response flex gap-8']//div[@class='ai-chat-message js-ai-chat-message flex flex-column gap-12 rounded-2xl width-full p-16']")
    WebElement AI_chat_response;
    public void verify_AI_chat_create_summary_response() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response, logger, "AI_chat_response");
        if (result.contains("How can I help you with") &&
                result.contains("Create Summary") &&
                result.contains("You can also respond by typing in the chat field below.")) {
            System.out.println("Chat AI response matches ✅");
            logger.log(LogStatus.PASS, "Chat AI response matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI response does not match ❌");
            System.out.println("Chat AI response does not match ❌");
        }
    }

    @FindBy(xpath= "(//q-chat-session-start-pending[@class='ai-chat-response flex gap-8'])[1]")
    WebElement AI_chat_intro_loading_message;
    public void verify_AI_chat_intro_loading_message() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_intro_loading_message, logger, "AI_chat_response");
        if (result.contains("Hello automation_sysadmin_cbre!") &&
                result.contains("retrieve the content") &&
                result.contains("This should only take a few moments")) {
            System.out.println("Chat AI response matches ✅");
            logger.log(LogStatus.PASS, "Chat AI response matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI response does not match ❌");
            System.out.println("Chat AI response does not match ❌");
        }
    }

    @FindBy(xpath = "(//q-button[@data-action='summarize'])[2]")
    WebElement quire_AI_create_summary_button;
    public void click_quire_AI_create_summary_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_create_summary_button, logger, "quire_AI_create_summary_button");
    }

    @FindBy(xpath = "(//q-chat-response)[1]")
    WebElement AI_chat_response_text;

    @FindBy(xpath = "(//q-chat-response)[2]")
    WebElement AI_chat_response_2_text;
    public void verify_AI_chat_hideReport_summary_Texas_response_text() throws InterruptedException {
        String result = waitForAIResponse(AI_chat_response_text);

       // String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");
        if ((result.contains("PCA")) && (result.contains("CBRE")) && (result.contains("Fannie Mae")) && (result.contains("Components"))) {
            System.out.println("Chat AI response text matches ✅");
            logger.log(LogStatus.PASS, "Chat AI response text matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI response text does not match ❌");
            System.out.println("Chat AI response text does not match ❌");
        }
    }

    public void verify_AI_chat_summary_ESA_String_Package_response_text() throws InterruptedException {
        String result = waitForAIResponse(AI_chat_response_text);
        String normalized = result.toLowerCase();

        if ((normalized.contains("phase i")) &&
                (normalized.contains("environmental")) &&
                (normalized.contains("cbre")) &&
                (normalized.contains("astm e1527-21"))) {
            System.out.println("Chat AI response text matches ✅");
            logger.log(LogStatus.PASS, "Chat AI response text matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI response text does not match ❌");
            System.out.println("Chat AI response text does not match ❌");
        }
    }


//    public void verify_AI_chat_asbestos_state_response_text() throws InterruptedException {
//        int maxRetries = 5; // safety limit
//        int attempt = 0;
//        String result = "";
//
//        while (attempt < maxRetries) {
//            attempt++;
//            System.out.println("🔄 Attempt " + attempt);
//
//            result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");
//
//            if (result.contains("Michigan")) {
//                System.out.println("Chat AI response text matches ✅ (found on attempt " + attempt + ")");
//                logger.log(LogStatus.PASS, "Chat AI response text matches ✅ (found on attempt " + attempt + ")");
//                return; // success, exit method
//            }
//
//            if (result.contains("I apologize, but I cannot provide an answer")) {
//                System.out.println("⚠️ AI gave no-documents response. Retrying...");
//                driver.navigate().refresh();
//                BaseClass.quire_AI().hover_and_click_ask_AI_lazarus_Button();
//                Thread.sleep(3000);
//                BaseClass.quire_AI().enter_AI_conversate_field_locationOfDocument();
//                Thread.sleep(6000);
//            } else {
//                System.out.println("⚠️ AI response did not contain expected text. Retrying...");
//                Thread.sleep(3000); // wait a bit before retry
//            }
//        }
//
//        // If we got here, all retries failed
//        System.out.println("❌ Chat AI response text does not match after " + maxRetries + " attempts");
//        logger.log(LogStatus.FAIL, "Chat AI response text does not match after " + maxRetries + " attempts ❌");
//    }

    @FindBy(xpath = "(//q-chat-response)")
    List<WebElement> AI_chat_responses;


//    public void verify_AI_chat_asbestos_state_response_text1() throws InterruptedException {
//        int maxRetries = 5; // safety limit
//        int attempt = 0;
//        String result = "";
//        int previousResponseCount = 0; // to track new responses
//
//        while (attempt < maxRetries) {
//            attempt++;
//            System.out.println("🔄 Attempt " + attempt);
//
//            // Wait until at least one response exists
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait.until(d -> AI_chat_responses.size() > 0);
//
//            // Get the latest response safely
//            List<WebElement> responses = AI_chat_responses;
//            WebElement latestResponse = responses.get(responses.size() - 1);
//
//            result = ReusableMethodsLoggersPOM.captureTextMethod(driver, latestResponse, logger, "AI_chat_response_text");
//            System.out.println("Latest AI Response:\n" + result);
//
//            // Check if the response contains expected text
//            if (result.contains("Michigan")) {
//                System.out.println("Chat AI response text matches ✅ (found on attempt " + attempt + ")");
//                logger.log(LogStatus.PASS, "Chat AI response text matches ✅ (found on attempt " + attempt + ")");
//                return; // success
//            }
//
//            // If response is not what we expect, click regenerate
//            System.out.println("⚠️ AI response did not contain expected text. Clicking Regenerate...");
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            WebElement regenerateBtn = (WebElement) js.executeScript(
//                    "return document.querySelector('sl-icon-button[data-action=\"regenerate_response\"]').shadowRoot.querySelector('button')"
//            );
//            regenerateBtn.click();
//
//            // Wait for a new response to appear (size increases)
//            wait.until(d -> AI_chat_responses.size() > responses.size());
//            Thread.sleep(1000); // short buffer for content to fully render
//        }
//
//        // If all retries failed
//        System.out.println("❌ Chat AI response text does not match after " + maxRetries + " attempts");
//        logger.log(LogStatus.FAIL, "Chat AI response text does not match after " + maxRetries + " attempts ❌");
//    }
public void verify_AI_chat_asbestos_state_response_text1() throws InterruptedException {
    // Capture initial response
    String result = waitForAIResponse(AI_chat_response_text);

    // Retry once if "Michigan" is not present
    if (!result.toLowerCase().contains("michigan")) {
        System.out.println("⚠️ 'Michigan' not found. Retrying once...");
        enter_AI_conversate_field_locationOfDocument();

        // Capture new response after retry
        result = waitForAIResponse(AI_chat_response_2_text);
    }

    // Verify final response
    if (result.toLowerCase().contains("michigan")) {
        System.out.println("AI_chat_asbestos_state_response_text matches ✅");
        logger.log(LogStatus.PASS, "AI_chat_asbestos_state_response_text matches ✅");
    } else {
        System.out.println("AI_chat_asbestos_state_response_text does not match ❌");
        logger.log(LogStatus.FAIL, "AI_chat_asbestos_state_response_text does not match ❌");
    }
}
    private String waitForAIResponse(WebElement aiResponseElement) throws InterruptedException {
        // Wait until AI response starts appearing
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(d -> !aiResponseElement.getText().trim().isEmpty());

        // Wait until text stabilizes (AI finished typing)
        String previousText = "";
        for (int i = 0; i < 15; i++) { // max ~15 seconds
            String currentText = aiResponseElement.getText().trim();
            if (!currentText.isEmpty() && currentText.equals(previousText)) {
                break; // AI finished typing
            }
            previousText = currentText;
            Thread.sleep(3000);
        }

        // Capture final text
        return ReusableMethodsLoggersPOM.captureTextMethod(driver, aiResponseElement, logger, "AI_chat_response_text");
    }

    public void verify_AI_chat_asbestos_summary_response_text() throws InterruptedException {
        // Capture initial response
        String result = waitForAIResponse(AI_chat_response_text);

        // Retry once if "Michigan" is not present
        if (!result.toLowerCase().contains("asbestos inspection")) {
            System.out.println("⚠️ 'asbestos inspection' not found. Retrying once...");
            enter_AI_conversate_field_locationOfDocument();

            // Capture new response after retry
            result = waitForAIResponse(AI_chat_response_2_text);
        }

        // Verify final response
        if (result.toLowerCase().contains("asbestos inspection")) {
            System.out.println("AI_chat_asbestos_summary_response_text matches ✅");
            logger.log(LogStatus.PASS, "AI_chat_asbestos_summary_response_text matches ✅");
        } else {
            System.out.println("AI_chat_asbestos_summary_response_text does not match ❌");
            logger.log(LogStatus.FAIL, "AI_chat_asbestos_summary_response_text does not match ❌");
        }
    }

//    public void verify_AI_chat_asbestos_state_response_text1() throws InterruptedException {
//        // Capture initial response
//        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");
//
//        // If AI says no documents, retry once
//        if (result.contains("I apologize, but I cannot provide an answer")) {
//            System.out.println("⚠️ AI gave no-documents response. Retrying once...");
//            enter_AI_conversate_field_locationOfDocument();
//
//            // Wait for AI to generate new response
//            Thread.sleep(7000);
//
//            // Re-capture the new response
//            result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");
//        }
//
//        // Check if the response contains expected text
//        if (result.toLowerCase().contains("asbestos inspection")) {
//            System.out.println("Chat AI response text matches ✅");
//            logger.log(LogStatus.PASS, "Chat AI response text matches ✅");
//        } else {
//            System.out.println("Chat AI response text does not match ❌");
//            logger.log(LogStatus.FAIL, "Chat AI response text does not match ❌");
//        }
//    }

//public void verify_AI_chat_asbestos_summary_response_text() throws InterruptedException {
//    // Wait until AI response has some text
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25)); // declare here
//    wait.until(d -> !AI_chat_response_text.getText().trim().isEmpty());
//
//    // Wait until text stops changing (AI finished typing)
//    String previousText = "";
//    for (int i = 0; i < 10; i++) { // up to ~10 seconds
//        String currentText = AI_chat_response_text.getText().trim();
//        if (!currentText.isEmpty() && currentText.equals(previousText)) {
//            break; // text stabilized
//        }
//        previousText = currentText;
//        Thread.sleep(1000);
//    }
//
//    // Capture final text
//    String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");
//
//    if (result.contains("I apologize, but I cannot provide an answer")) {
//        System.out.println("⚠️ AI gave no-documents response. Retrying once...");
//        enter_AI_conversate_field_locationOfDocument();
//        Thread.sleep(7000);
//    }
//
//    if (result.contains("asbestos inspection")) {
//        System.out.println("Chat AI response text matches ✅");
//        logger.log(LogStatus.PASS, "Chat AI response text matches ✅");
//    } else {
//        logger.log(LogStatus.FAIL, "Chat AI response text does not match ❌");
//        System.out.println("Chat AI response text does not match ❌");
//        enter_AI_conversate_field_locationOfDocument();
//        Thread.sleep(7000);
//    }
//}

    public void verify_AI_chat_author_fnmae_response_text() throws InterruptedException {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");

        // Retry once if the AI says no documents uploaded
        if (result.contains("I apologize, but I cannot provide an answer")) {
            System.out.println("⚠️ AI gave no-documents response. Retrying once...");
            enter_AI_conversate_field_authorOfDocument();
            Thread.sleep(7000);

        }

        if ((result.contains("FANNIE MAE PHASE ONE")) && (result.contains("ENVIRONMENTAL SITE ASSESSMENT")) && (result.contains("Consulting Solutions")) && (result.contains("Mallory Seagraves"))) {
            System.out.println("Chat AI response text matches ✅");
            logger.log(LogStatus.PASS, "Chat AI response text matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI response text does not match ❌");
            System.out.println("Chat AI response text does not match ❌");
        }
    }

    public void verify_AI_chat_issues_fnmae_response_text() throws InterruptedException {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");

        // Retry once if the AI says no documents uploaded
        if (result.contains("I apologize, but I cannot provide an answer")) {
            System.out.println("⚠️ AI gave no-documents response. Retrying once...");
            enter_AI_conversate_field_authorOfDocument();
            Thread.sleep(7000);

        }

        if ((result.contains("FANNIE MAE PHASE ONE")) && (result.contains("ENVIRONMENTAL SITE ASSESSMENT")) && (result.contains("Water Intrusion")) && (result.contains("Radon")) && (result.contains("Lead")) &&(result.contains("Asbestos"))) {
            System.out.println("Chat AI response text matches ✅");
            logger.log(LogStatus.PASS, "Chat AI response text matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI response text does not match ❌");
            System.out.println("Chat AI response text does not match ❌");
        }
    }

    @FindBy(xpath = "//i[@class='fa fa-times fa-lg']")
    WebElement AI_chat_close_button;
    public void click_AI_chat_close_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, AI_chat_close_button, logger, "AI_chat_close_button");
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


    @FindBy(xpath = "//a[normalize-space()='Upload Files']")
    WebElement upload_files_button;
    public void click_upload_files_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, upload_files_button, logger, "upload_files_button");}

    String insert_lazarus_file = "(//input[@type='file'])[2]";
    public void upload_fnmae_pdf_file_to_lazarus() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_lazarus_file, "fnmae.pdf", logger, "fnmae.pdf");
    }

    public void upload_asbestosSummary_doc_file_to_lazarus() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_lazarus_file, "asbestos_summary.docx", logger, "asbestos_summary.docx");
    }

    public void verify_4_items_uploading_lazarus2() throws InterruptedException {
        // Confirm all 4 Pending are present
        List<WebElement> pendingList = driver.findElements(By.xpath("//td[normalize-space()='Pending']"));
        if (pendingList.size() == 4) {
            System.out.println("✅ Exactly 4 Pending found");
        } else {
            throw new AssertionError("Expected 4 Pending but found: " + pendingList.size());
        }

// Loop until all Pending are gone or timeout
        long startTime = System.currentTimeMillis();
        long timeoutMillis = 120_000; // 2 minutes total

        while (System.currentTimeMillis() - startTime < timeoutMillis) {
            pendingList = driver.findElements(By.xpath("//td[normalize-space()='Pending']"));

            if (pendingList.isEmpty()) {
                System.out.println("✅ All 4 statuses changed to Ready");
                break; // exit loop
            } else {
                System.out.println("⏳ Still pending: " + pendingList.size());
                Thread.sleep(20000); // wait 20 seconds before refresh
                driver.navigate().refresh();
                Thread.sleep(1000); // give page a moment to load
            }
        }
    }

    @FindBy(xpath = "//table[@class='htCore']//tbody//tr[2]/td[2]")
    WebElement second_report_link;

    @FindBy(xpath = "//a[normalize-space()='asbestos summary']")
    WebElement asbestos_summary_doc_link;
    @FindBy(xpath = "//a[normalize-space()='asbestos summary']/following::button[1]")
    WebElement asbestos_summary_ask_AI;
    @FindBy(xpath = "(//button[normalize-space()='Ask AI'])[2]")
    WebElement ask_AI_second_hoverButton;
    public void hover_and_click_second_report_ask_AI_Button() throws InterruptedException {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, second_report_link, logger, "second_report_link");
Thread.sleep(6000);
//        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, ask_AI_lazarus_hoverButton, logger, "ask_AI_lazarus_hoverButton");
//        Thread.sleep(2000);

        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_second_hoverButton, logger, "ask_AI_second_hoverButton");
    }

    @FindBy(xpath = "//table[@class='htCore']//tbody//td[2]")
    WebElement first_report_link;

    @FindBy(xpath = "(//button[@title='Ask AI'][normalize-space()='Ask AI'])[1]")
    WebElement ask_AI_lazarus_hoverButton;
    public void hover_and_click_ask_AI_lazarus_Button() throws InterruptedException {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, first_report_link, logger, "first_report_link");
        Thread.sleep(1000);
//        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, ask_AI_lazarus_hoverButton, logger, "ask_AI_lazarus_hoverButton");
//        Thread.sleep(2000);

        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_lazarus_hoverButton, logger, "ask_AI_lazarus_hoverButton");
    }


    @FindBy(xpath = "//textarea[@placeholder='Ask Quire AI about this Report...']")
    WebElement ask_AI_conversate_field;
    public void enter_AI_conversate_field_summarizeDocument() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_conversate_field, logger, "ask_AI_conversate_field");
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ask_AI_conversate_field, "summarize this document", logger, "ask_AI_conversate_field");
    }
    public void enter_AI_conversate_field_locationOfDocument() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_conversate_field, logger, "ask_AI_conversate_field");
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ask_AI_conversate_field, "what state is mentioned in the document", logger, "ask_AI_conversate_field");
    }

    public void enter_AI_conversate_field_authorOfDocument() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_conversate_field, logger, "ask_AI_conversate_field");
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ask_AI_conversate_field, "Who wrote this report", logger, "ask_AI_conversate_field");
    }

    public void enter_AI_conversate_field_issues_or_concerns() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_conversate_field, logger, "ask_AI_conversate_field");
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ask_AI_conversate_field, "Are there any issues of concern in the Project Summary ", logger, "ask_AI_conversate_field");
    }

    @FindBy(xpath = "(//div[@class='ai-legacy-reports-system-label-container js-ai-legacy-reports-system-label-container'])[1]")
    WebElement first_link_systemLabel_dropdownButtonr;
    public void click_first_link_systemLabel_dropdownButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, first_link_systemLabel_dropdownButtonr, logger, "first_link_systemLabel_dropdownButton");
    }

    @FindBy(xpath = "(//option[@value='13'][normalize-space()='Reliance Letter'])[1]")
    WebElement reliance_letter_dropdown_option;
    public void click_reliance_letter_dropdown_option() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reliance_letter_dropdown_option, logger, "reliance_letter_dropdown_option");
    }

    @FindBy(xpath = "//a[@title='Remove']")
    WebElement remove_label_button;
    public void click_remove_label_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, remove_label_button, logger, "remove_label_button");
    }

    @FindBy(xpath = "//input[@placeholder='Label: All']")
    WebElement label_field;
    public void enter_label_field_relianceLetter() {
        ReusableMethodsLoggersPOM.clickMethod(driver, label_field, logger, "label_field");

        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, label_field, "Reliance Letter", logger, "label_field");}

    @FindBy(xpath = "//a[normalize-space()='asbestos summary']")
    WebElement automation_asbestos_report_link;
    public void verify_automation_asbestos_report_link() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, automation_asbestos_report_link, true, logger, "automation_asbestos_report_link");
    }

    @FindBy(xpath = "//a[normalize-space()='fnmae']")
    WebElement automation_fnmae_report_link;
    public void verify_automation_fnmae_report_link() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, automation_fnmae_report_link, true, logger, "automation_fnmae_report_link");
    }

    @FindBy(xpath = "//div[@class='ht_clone_top handsontable']//i[@class='fa fa-square-o']")
    WebElement all_reports_checkbox;
    public void click_all_reports_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, all_reports_checkbox, logger, "all_reports_checkbox");
    }

    @FindBy(xpath = "//li[@class='bulk-action-item download-action js-bulk-actions-download-selection']")
    WebElement compress_and_download_button;
    public void click_compress_and_download_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, compress_and_download_button, logger, "compress_and_download_button");
    }

    @FindBy(xpath = "//input[@name='commit']")
    WebElement commit_button;
    public void click_commit_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, commit_button, logger, "commit_button");
    }

    @FindBy(xpath = "//div[@class='alert alert-notice' and contains(normalize-space(), 'Your download link will be available in your Notifications when ready.')]")
    WebElement download_link_notification;
    public void verify_download_link_notification() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, download_link_notification, true, logger, "download_link_notification");
    }

    @FindBy(xpath = "//li[@class='bulk-action-item clear-action js-bulk-actions-clear-selection']")
    WebElement clear_selection_button;
    public void click_clear_selection_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clear_selection_button, logger, "clear_selection_button");
    }

    @FindBy(xpath = "//li[@class='bulk-action-item delete-action js-bulk-actions-delete_selection']")
    WebElement delete_button;
    public void click_delete_files_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, delete_button, logger, "delete_button");
    }

    @FindBy(xpath = "//div[@class='alert alert-notice' and contains(normalize-space(), 'deleted')]")
    WebElement files_deleted_notification;
    public void verify_files_deleted_notification() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, files_deleted_notification, true, logger, "files_deleted_notification");
    }

}






