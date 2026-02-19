package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

public class ReportTagsSection extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public ReportTagsSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor



    @FindBy(xpath = "//input[@data-tag-id='1398']")
    WebElement reportDate;

    public void enterReportDate() {

        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportDate, "11/9/2023", logger, "reportDate");
        //ReusableMethodsLoggersPOM.submitMethod(driver, reportDate,  logger, "reportDate");

    }


    @FindBy(xpath = "//div[@data-tag-id='1389']//i[@class='fa fa-angle-down fa-lg']")
    WebElement clientContactDropdownButtons;
    public void clickClientContactDropdownButtons() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clientContactDropdownButtons,  logger, "clientContactDropdownButton");
    }
    @FindBy(xpath = "//ul[@id='ui-id-37']//li[3]")
    WebElement clientContactDropdownItem;
    public void clickClientContactDropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clientContactDropdownItem,  logger, "clientContactDropdownItem");
    }



    @FindBy(xpath = "//ul[@id='ui-id-38']//li[4]")
    WebElement clientNameDropdownItem;
    public void clickClientNameDropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clientNameDropdownItem,  logger, "clientNameDropdownItem");
    }


    @FindBy(xpath = "//input[@data-tag-id='2827']")
    WebElement projectName;
    public void enterProjectName() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectName, "QA_Test_Project_Name" , logger, "projectName");
    }


    @FindBy(xpath = "//input[@data-tag-id='1400']")
    WebElement juridstiction_siteCounty;
    public void enterJuridstiction_siteCounty() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, juridstiction_siteCounty, "juridstiction_siteCounty" , logger, "juridstiction_siteCounty");
    }

    @FindBy(xpath = "//input[@data-tag-id='427']")
    WebElement projectCity;
    public void enterProjectCity() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectCity, "Queens" , logger, "projectCity");
    }

    @FindBy(xpath = "//input[@data-tag-id='428']")
    WebElement projectState;
    public void enterProjectState() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectState, "NY" , logger, "projectState");
    }


    @FindBy(xpath = "//input[@data-tag-id='426']")
    WebElement projectStreetAddress;
    public void clickProjectStreetAddress() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectStreetAddress, "123 quire ave", logger, "projectStreetAddress");
    }


    @FindBy(xpath = "//input[@data-tag-id='429']")
    WebElement projectZipCode;
    public void clickProjectZipCode() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectZipCode, "10001", logger, "projectZipCode");
    }

    @FindBy(xpath = "//input[@data-tag-id='1404']")
    WebElement yearConstructed;
    public void enterYearConstructed() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, yearConstructed, "2023", logger, "yearConstructed");
    }

    @FindBy(xpath = "//span[normalize-space()='Property Room Count']/following::input[1]")
    WebElement propertyRoomCount;
    public void enterpropertyRoomCount() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, propertyRoomCount, "191", logger, "propertyRoomCount");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, propertyRoomCount, logger, "propertyRoomCount");

    }

    @FindBy(xpath = "//span[normalize-space()='Units Inspected Count']/following::input[1]")
    WebElement unitInspectedCount;
    public void enterunitInspectedCount() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, unitInspectedCount, "21", logger, "unitInspectedCount");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, unitInspectedCount, logger, "unitInspectedCount");

    }

    @FindBy(xpath = "//span[@id='report-essentials-title' and text()='Report Tags']")
    WebElement sectionView_ReportTags_Button;

    public void hover_to_ReportTags_sections_Button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, sectionView_ReportTags_Button, logger, " section view - report tag button ");}
    public void clickSectionView_ReportTags_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_ReportTags_Button, logger, " section view - report tag button ");}

    @FindBy(xpath = "//a[@class='manage-tags-link js-manage-tags-link has-tooltip']")
    WebElement ReportTags_manage_settings_icon;
    public void click_ReportTags_manage_settings_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ReportTags_manage_settings_icon, logger, "ReportTags_manage_settings_icon");}

    @FindBy(xpath = "//span[normalize-space()='User 1']/following-sibling::i[1]")
    WebElement user1_checkbox;

    @FindBy(xpath = "//li[contains(@class, 'status-active') and .//span[normalize-space()='User 1']]//i[contains(@class,'fa-check-square')]")
    WebElement user1_enabled;

    public void scroll_and_click_and_verify_user1_checkbox() {
        ReusableMethodsLoggersPOM.scrollandClickMethod(driver, user1_checkbox, logger, "user1_checkbox");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, user1_enabled, true, logger, "user1_enabled");
    }

    @FindBy(xpath = "//input[@placeholder='Find users by name...']")
    WebElement signature_field_RT;


    public void scroll_and_enter_user1_field_RT() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollandClickMethod(driver, signature_field_RT, logger, "signature_field_RT");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, signature_field_RT, "qa_admin", logger, "signature_field_RT");
    }

    @FindBy(xpath = "//div[@class='report-tag-block'][.//span[@class='text' and contains(text(), 'User 1')] and .//span[@class='label-name' and text()='qa_admin']]")
    WebElement user1_qaAdmin_signature_RT_loaded;

    public void verify_user1_qaAdmin_signature_RT_loaded() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, user1_qaAdmin_signature_RT_loaded, true, logger, "user1_qaAdmin_signature_RT_loaded");
    }


    @FindBy(xpath = "//span[normalize-space()='Title Page Image']/following-sibling::i[1]")
    WebElement title_page_image_checkbox;

    @FindBy(xpath = "//li[contains(@class, 'status-active') and .//span[normalize-space()='Title Page Image']]//i[contains(@class,'fa-check-square')]")
    WebElement title_page_image_enabled;

    public void scroll_and_click_and_verify_title_page_image_checkbox() {
        ReusableMethodsLoggersPOM.scrollandClickMethod(driver, title_page_image_checkbox, logger, "title_page_image_checkbox");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, title_page_image_enabled, true, logger, "title_page_image_enabled");
    }



    @FindBy(xpath = "//span[normalize-space()='Multiple Cost Tables']/following-sibling::i[1]")
    WebElement multiple_cost_tables_checkbox;

    @FindBy(xpath = "//li[contains(@class, 'status-active') and .//span[normalize-space()='Multiple Cost Tables']]//i[contains(@class,'fa-check-square')]")
    WebElement multiple_cost_tables_checkbox_enabled;

    public void scroll_and_click_and_verify_multiple_cost_tables_checkbox() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollandClickMethod(driver, multiple_cost_tables_checkbox, logger, "multiple_cost_tables_checkbox");
        Thread.sleep(2000);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, multiple_cost_tables_checkbox_enabled, true, logger, "multiple_cost_tables_checkboxt_enabled");
    }


    @FindBy(xpath = "//label[.//span[normalize-space(.)='Multiple Cost Tables']]/following-sibling::div//select")
    WebElement multiple_cost_tables_RT_dropdown;
    @FindBy(xpath = "//div[normalize-space()='site']")
    WebElement site_reportTags_section;

    public void select_multiple_cost_tables_feature_dropdown() {
        ReusableMethodsLoggersPOM.scrollToViewMethod(driver, site_reportTags_section, logger, "site_reportTags_section ");

        ReusableMethodsLoggersPOM.selectByValue(driver, multiple_cost_tables_RT_dropdown, "1", logger, "multiple_cost_tables_feature_dropdown ");
    }

    @FindBy(xpath = "//h1[contains(text(),'Report Tags for')]")
    WebElement ReportTags_settings_view;

    public void verify_ReportTags_settings_view_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, ReportTags_settings_view, true,logger, "ReportTags_manage_settings_icon");}

    @FindBy(xpath = "//span[normalize-space()='Title Page Image']/following::a[1]")
    WebElement title_page_image_button;
    public void click_title_page_image_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, title_page_image_button, logger, "title_page_image_button");
    Thread.sleep(1000);
    ReusableMethodsLoggersPOM.clickMethod(driver, title_page_image_button, logger, "title_page_image_button");
    }


   // @FindBy(xpath = "//img[contains(@alt, 'picture of a') and contains(@alt, 'mapp')]")
   @FindBy(xpath = "//img[@alt='signature' or (contains(@alt, 'picture of a') and contains(@alt, 'mapp'))]")
    WebElement title_page_image_loaded;
    public void verify_title_page_image_loaded() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, title_page_image_loaded,true,  logger," title_page_image_loaded ");
    }

    @FindBy(xpath = "//span[normalize-space()='Form Version']/following::select[1]")
    WebElement formVersion;
    public void scroll_and_enter_FM1104_updated_formVersion() {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, formVersion, logger, "formVersion");
        ReusableMethodsLoggersPOM.selectByValue(driver, formVersion,"2024_12_12", logger, "formVersion");

    }

}








