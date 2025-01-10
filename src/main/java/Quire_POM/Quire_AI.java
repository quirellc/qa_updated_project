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

    @FindBy(xpath = "(//ul[@class='ck ck-reset ck-list'])[1]")
        WebElement quire_AI_dropDownItems;
        public void verify_quire_AI_dropDownItems() {
           String quire_AI_dropDownItems_text = ReusableMethodsLoggersPOM.saveTextMethod(driver, quire_AI_dropDownItems, logger, "quire_AI_dropDownItems");
        if (quire_AI_dropDownItems_text.equals("Generate Content\n" +
                "Summarize\n" +
                "Expand\n" +
                "Content Assistant\n" +
                "Thesaurus\n" +
                "Dictionary\n" +
                "Suggest References\n" +
                "Insert/Suggest ReportTags\n" +
                "Adjust Content Tone\n" +
                "Professional\n" +
                "Technical\n" +
                "Non-Technical\n" +
                "Legal")) {
            System.out.println("Test Passed:  quire_AI_dropDownItems  are as expected.");
            logger.log(LogStatus.PASS, "Test Passed:  quire_AI_dropDownItems  are as expected.");
        } else {
            System.out.println("TEST FAILED, UNABLE TO VERIFY quire_AI_dropDownItems: " + quire_AI_dropDownItems_text + " :  NOT as expected.");
            logger.log(LogStatus.FAIL, "TEST FAILED, UNABLE TO VERIFY quire_AI_dropDownItems: " + quire_AI_dropDownItems_text + "  :   NOT expected.");
        }
    }


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

    @FindBy(xpath = "//p[contains(text(),'content appears to be a brief title or header')]")
    WebElement quire_AI_summarized_generated_prompt;
    public void verify_quire_AI_summarize_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_summarized_generated_prompt, true, logger, "quire_AI_summarized_generated_prompt");}

    @FindBy(xpath = "//li[contains(text(),': quality assurance, quality control, inspection')]")
    WebElement quire_AI_thesaurus_generated_prompt;
    public void verify_quire_AI_thesaurus_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_thesaurus_generated_prompt, true, logger, "quire_AI_thesaurus_generated_prompt");}


    @FindBy(xpath = "//p[contains(text(),'implements a comprehensive spell-checking mechanism designed to systematically validate')]")
    WebElement quire_AI_technical_tone_generated_prompt;
    public void verify_quire_AI_technical_tone_generated_prompt() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, quire_AI_technical_tone_generated_prompt, true, logger, "quire_AI_technical_tone_generated_prompt");}







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

}






