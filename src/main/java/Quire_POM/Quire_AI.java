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


    @FindBy(xpath = "//div[contains(@class, 'ai-search-modal-body') and contains(., 'Welcome to Quire AI Search')]")
    WebElement quire_AI_prompt_text;
    public void verify_quire_AI_prompt_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_prompt_text, true, logger, "quire_AI_prompt_text");}

@FindBy(xpath= "//input[@placeholder=\"Tell Quire AI what you're looking for...\"]")
WebElement quire_AI_prompt_search_field;
public void enter_quire_AI_prompt_search_field() {
    ReusableMethodsLoggersPOM.sendKeysMethod(driver, quire_AI_prompt_search_field, "hide" ,  logger, "quire_AI_prompt_search_field");}

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
    public void confirm_report_opened_new_tab() throws InterruptedException {
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
        if (result.contains("Continue our current conversation") &&
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

    @FindBy(xpath = "(//q-button[@data-action='summarize'])[2]")
    WebElement quire_AI_create_summary_button;
    public void click_quire_AI_create_summary_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_AI_create_summary_button, logger, "quire_AI_create_summary_button");
    }

    @FindBy(xpath = "(//q-chat-response)[1]")
    WebElement AI_chat_response_text;
    public void verify_AI_chat_response_text() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, AI_chat_response_text, logger, "AI_chat_response_text");
        if ((result.contains("PCA")) && (result.contains("CBRE")) && (result.contains("100-unit")) && (result.contains("Texas"))) {
            System.out.println("Chat AI response text matches ✅");
            logger.log(LogStatus.PASS, "Chat AI response text matches ✅");
        } else {
            logger.log(LogStatus.FAIL, "Chat AI response text does not match ❌");
            System.out.println("Chat AI response text does not match ❌");
        }
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
    public void upload_pdf_file_to_lazarus() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_lazarus_file, "maptest.pdf", logger, "maptest pdf");
    }

    public void upload_pdf_file_2_to_lazarus() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_lazarus_file, "maptest2.pdf", logger, "maptest pdf 2");
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

    @FindBy(xpath = "//table[@class='htCore']//tbody//td[2]")
    WebElement first_report_link;

    @FindBy(xpath = "//button[@data-original-title='Ask AI']")
    WebElement ask_AI_lazarus_hoverButton;
    public void hover_and_click_ask_AI_lazarus_Button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, first_report_link, logger, "first_report_link");

        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_lazarus_hoverButton, logger, "ask_AI_lazarus_hoverButton");
    }


    @FindBy(xpath = "//textarea[@placeholder='Ask Quire AI about this Report...']")
    WebElement ask_AI_conversate_field;
    public void enter_AI_conversate_field() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ask_AI_conversate_field, logger, "ask_AI_conversate_field");

        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ask_AI_conversate_field, "summarize this document", logger, "ask_AI_conversate_field");
    }

}






