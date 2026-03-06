package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

public class ZON_XML_Section extends ReusableAnnotations {
    //]must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public ZON_XML_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor


    @FindBy(xpath = "//a[text()='Back to Form']")
    WebElement backToFormButton;

    public void clickBackToFormButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, backToFormButton, logger, "back to form button");
    }

    @FindBy(xpath = "//a[text()='Cancel']")
    WebElement cancelButton;

    public void clickCancel() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancelButton, logger, "cancel button");
    }


    @FindBy(xpath = "//*[@value='Save']")
    WebElement saveButton;

    public void clickSave() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveButton, logger, "save button");
    }

    @FindBy(xpath = "(//i[@class='fa fa-check'])[2]")
    WebElement saveCheckButton;

    public void clickSaveCheckButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveCheckButton, logger, "saveCheckButton");
    }

    @FindBy(xpath = "//i[@class='fa fa-close']")
    WebElement closeWindowButton;

    public void clickCloseWindowButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, closeWindowButton, logger, "closeWindowButton");
    }


    @FindBy(xpath = "//*[@class='alert alert-notice']")
    WebElement alertMessage;

    public void captureAlertMessage() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, alertMessage, logger, "alert message ");
        System.out.println("Alert Message: " + result);
    }

    @FindBy(xpath = "//a[text()='here']")
    WebElement hereLink;

    public void clickHereLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, hereLink, logger, "here link");
    }

    @FindBy(xpath = "//*[contains(@href,'/projects/')]")
    WebElement prevProjectButton;

    public void clickPrevProjectButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, prevProjectButton, logger, "prev project link");
    }


    @FindBy(xpath = "//a[contains(text(),'FNMA XML Data Standard (ZON)')]")
    WebElement add_ZON_XMLPackage_toSection;

    public void clickAddZONXMLPackage_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_ZON_XMLPackage_toSection, logger, " add ZON xml package to section ");
    }

    @FindBy(xpath = "//span[contains(text(),'FNMA XML Data Standard (ZON)')]")
    WebElement sectionView_ZON_XML;

    public void clickSectionView_ZON_XML() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_ZON_XML, logger, " section view - ZON xml ");

    }

    @FindBy(xpath = "//span[@id='report-essentials-title' and text()='Report Tags']")
    WebElement sectionView_ReportTags_Button;

    public void clickSectionView_ReportTags_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_ReportTags_Button, logger, " section view - report tag button ");
    }

    @FindBy(xpath = "//a[contains(text(),'+ Add Section')]")
    WebElement addSectionButton;

    public void clickAddSectionButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addSectionButton, logger, " add section button ");
    }


    @FindBy(xpath = "//i[@class='fa fa-fw fa-lg fa-file-code-o']")
    WebElement generateXMLButton;

    public void clickGenerateXMLButton() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, generateXMLButton, logger, " generate xml button ");
    }

    @FindBy(xpath = "//a[@class='download-non-pdf document-download js-download']")
    WebElement XMLButtonText;


    public void getXMLButtonText() {

         ReusableMethodsLoggersPOM.captureTextMethod(driver, XMLButtonText, logger, "  xml button text");


    }

    @FindBy(xpath = "//div[@class='modal-body']")
    WebElement errorMessage_XMLPackageData;

    public void getErrorPage_XMLPackageData() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, errorMessage_XMLPackageData, logger, " error message- xml list ");
        System.out.println("Error Info: " + "\n" + result + "\n");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @FindBy(xpath = "//input[@name='package_summary_item[package_data][scope_standard_description]']")
    WebElement thirdPartyReport_ScopeStandard;

    public void enterThirdPartyReport_ScopeStandardDescription() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, thirdPartyReport_ScopeStandard, "qa automation script", logger, "thirdPartyReport_ScopeStandard");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_land_area_acres']")
    WebElement property_land_area_acres;

    public void enterProperty_land_area_acres() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, property_land_area_acres, "500", logger, "property_land_area_acres");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_designation_description']")
    WebElement zoning_designation;

    public void enterZoning_designation() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, zoning_designation, "Zoning designation test", logger, "zoning_designation");
    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][land_use_indicator]' and @value='0']")
    WebElement existing_land_use_indicator_checkBox;

    public void click_existing_land_use_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, existing_land_use_indicator_checkBox, logger, "existing_land_use_indicator_checkBox");
    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][building_set_back_lines_indicator]' and @value='0']")
    WebElement existing_building_set_back_lines_indicator_checkBox;

    public void click_existing_building_set_back_lines_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, existing_building_set_back_lines_indicator_checkBox, logger, "existing_building_set_back_lines_indicator_checkBox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][building_size_indicator]' and @value='0']")
    WebElement existing_building_size_indicator_checkBox;

    public void click_existing_building_size_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, existing_building_size_indicator_checkBox, logger, "existing_building_size_indicator_checkBox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][building_density_coverage_indicator]' and @value='0']")
    WebElement existing_building_density_coverage_indicator_checkBox;

    public void click_existing_building_density_coverage_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, existing_building_density_coverage_indicator_checkBox, logger, "existing_building_density_coverage_indicator_checkBox");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_parking_space_count']")
    WebElement existing_parking_spaces;

    public void enter_existing_parking_spaces() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, existing_parking_spaces, "5", logger, "existing_parking_spaces");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_number_required_parking_spaces']")
    WebElement required_parking_spaces;

    public void enter_required_parking_spaces() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, required_parking_spaces, "10", logger, "required_parking_spaces");
    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][parking_indicator]' and @value='0']")
    WebElement existing_parking_conformance_checkBox;
    public void click_existing_parking_conformance_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, existing_parking_conformance_checkBox, logger, "existing_parking_conformance_checkBox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][special_zoning_indicator]' and @value='0']")
    WebElement special_zoning_indicator;
    public void click_special_zoning_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, special_zoning_indicator, logger, "special_zoning_indicator");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][recorded_violations_indicator]' and @value='0']")
    WebElement recorded_zoning_violation_checkBox;
    public void click_recorded_violations_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, recorded_zoning_violation_checkBox, logger, "recorded_zoning_violation_checkBox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][recorded_building_code_violations_indicator]' and @value='0']")
    WebElement recorded_building_code_violation_checkBox;
    public void click_recorded_building_code_violations_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, recorded_building_code_violation_checkBox, logger, "recorded_building_code_violation_checkBox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][recorded_fire_code_violations_indicator]' and @value='0']")
    WebElement recorded_fire_code_violation_checkBox;
    public void click_recorded_fire_code_violations_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, recorded_fire_code_violation_checkBox, logger, "recorded_fire_code_violation_checkBox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][available_certificates_occupancy_indicator]' and @value='0']")
    WebElement certificate_of_occupancy_checkBox;
    public void click_certificate_of_occupancy_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, certificate_of_occupancy_checkBox, logger, "certificate_of_occupancy_checkBox");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][conforming_status]']")
    WebElement conforming_status;

    public void select_concluding_zoning_conformance_status() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, conforming_status, 1, logger, "conforming_status");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_property_damage_threshold_percent']")
    WebElement property_damage_threshold_percent;

    public void enter_property_damage_threshold_percent() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, property_damage_threshold_percent, "20", logger, "property_damage_threshold_percent");
    }




    @FindBy(xpath = "//select[@name='package_summary_item[package_data][dus_lender_name]']")
    WebElement clientName;

    public void select_ClientName_DUS_Lender() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, clientName, 10, logger, "clientName");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_deal_identifier']")
    WebElement dealIdentifier;

    public void enterDealIdentifier() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, dealIdentifier, "123456", logger, "deal Identifier");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_signatory_name']")
    WebElement thirdParty_signatory_name;

    public void enterThirdParty_signatory_name() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, thirdParty_signatory_name, "thirdParty_signatory_name_submit", logger, "thirdParty_signatory_name");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_assessor_name']")
    WebElement thirdPartyAssessorName;

    public void enterThirdPartyAssessorName() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, thirdPartyAssessorName, "third party test name", logger, "thirdPartyAssessorName");
    }



    @FindBy(xpath = "//input[@id='package_summary_item_package_data_number_of_parcels']")
    WebElement numberOfParcels;

    public void enterNumberOfParcels() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, numberOfParcels, "2", logger, "numberOfParcels");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_property_ownership_years']")
    WebElement yearsOfPropertyOwnership;

    public void enterYearsOfPropertyOwnership() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, yearsOfPropertyOwnership, "5", logger, "yearsOfPropertyOwnership");
    }
}




