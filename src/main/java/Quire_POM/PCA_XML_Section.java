package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

public class PCA_XML_Section extends ReusableAnnotations {
    //
    //
    // must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public PCA_XML_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor


    @FindBy(xpath = "//*[text()='Templates']")
    WebElement templatesTab;

    public void clickTemplatesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templatesTab, logger, "templates tab");
    }

    @FindBy(xpath = "//*[contains(text(),'Add Template')]")
    WebElement addTemplateButton;

    public void clickAddTemplateButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addTemplateButton, logger, "Add template button");
    }

    @FindBy(xpath = "//*[@name='template[name]']")
    WebElement templateName;

    public void enterTemplateNameField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing - Fannie Mae Template", logger, "template name field");
    }

    @FindBy(xpath = "(//*[@name='template[template_class]']")
    WebElement templateTypeDropdown;

    public void clickTemplateTypeDropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateTypeDropdown, logger, "template label dropdown button");
    }
//
//    @FindBy(xpath = "(//div[@class='form-group row template-type']")
//    WebElement templateTypeDropdown2;
//    public void clickTemplateTypeDropdown2() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, templateTypeDropdown2, logger, "template label dropdown button");
//    }
//
//
//    @FindBy(xpath = "(//div[@class='form-group row template-type']")
//    WebElement templateTypeDropdown3;
//    public void clickTemplateTypeDropdown3() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, templateTypeDropdown2, logger, "template label dropdown button");
//    }

    @FindBy(xpath = "(//select[@class='form-control']")
    WebElement templateTypeDropdown4;

    public void clickTemplateTypeDropdown4() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateTypeDropdown4, logger, "template label dropdown button");
    }

    public void selectTemplateTypeDropdown4() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, templateTypeDropdown4, 1, logger, "template label dropdown button");
    }


    @FindBy(xpath = "(//*[@placeholder='Choose a System Label'])[2]")
    WebElement templateLabelDropdown;

    public void clickTemplateLabelDropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateLabelDropdown, logger, "template label dropdown button");
    }

    @FindBy(xpath = "(//*[text()='General Other'])[7]")
    WebElement templateLabel_GeneralOther;

    public void clickTemplateLabel_GeneralOther() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateLabel_GeneralOther, logger, "template label - General Other");
    }

    @FindBy(xpath = "//*[@name='template[description]']")
    WebElement templateDescription;

    public void enterTemplateDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateDescription, "QA Automation Fannie Mae Testing Template Creation", logger, "template description field");
    }

    @FindBy(xpath = "//a[text()='Back to Form']")
    WebElement backToFormButton;

    public void clickBackToFormButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, backToFormButton, logger, "back to form button");
    }



    @FindBy(xpath = "//*[@value='Save']")
    WebElement saveButton;

    public void clickSave() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveButton, logger, "save button");
    }

    @FindBy(xpath = "//button[@class='btn btn-primary js-tag-widget-commit']//i[@class='fa fa-check']")
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


    @FindBy(xpath = "//input[@id='tag-matrix-search']")
    WebElement searchField;

    public void sendSearchField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, searchField, "QA automation test template - Fannie Mae", logger, "search field");
    }

    public void submitSearchField() {
        ReusableMethodsLoggersPOM.submitMethod(driver, searchField, logger, "search field");
    }

    public void clickSearchField() {
        ReusableMethodsLoggersPOM.clickMethod(driver, searchField, logger, "search field");
    }


    @FindBy(xpath = "//span[@class='edit-link-text']")
    WebElement templateFirstLink;

    public void clickFirstTemplateLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateFirstLink, logger, "fannie mae - template link");
    }

    @FindBy(xpath = "//*[contains(text(),'Template Settings')]")
    WebElement templateSettingsButton;

    public void clickTemplateSettingsButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettingsButton, logger, " template settings button");
    }

    @FindBy(xpath = "//a[@id='packages-tab']")
    WebElement templatePackagesTab;

    public void clickTemplatePackagesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templatePackagesTab, logger, " template packages tab ");
    }

    @FindBy(xpath = "(//div[@class='ht_master handsontable'])[2]//table[@class='htCore']")
    WebElement templatePackagesList;
    public void getTemplatesPackagesList() {
       ReusableMethodsLoggersPOM.captureTextMethod(driver, templatePackagesList, logger, "Assigned Packages List ");}

    @FindBy(xpath = "(//div[@class='ht_master handsontable'])[2]//table[@class='htCore']//tbody//tr[1]")
    WebElement assigned_packages_first_item;
    public void hover_assigned_packages_first_item() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, assigned_packages_first_item, logger, "assigned_packages_first_item");}
    @FindBy(xpath = "(//div[@class='ht_master handsontable'])[2]//table[@class='htCore']//tbody//tr[2]")
    WebElement assigned_packages_second_item;
    public void hover_assigned_packages_second_item() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, assigned_packages_second_item, logger, "assigned_packages_second_item");}
    @FindBy(xpath = "//div[contains(text(),'Quire ESA Condition Action')]")
    WebElement ESA_CA_package;
    public void click_package_ESA() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, ESA_CA_package, logger, "ESA_CA_package");}

    @FindBy(xpath = "(//div[@class='ht_master handsontable'])[2]//table[@class='htCore']//tbody//tr[1]//i[@class='fa fa-times']")
    WebElement cancel_button_first_assigned_package;
    public void click_cancel_button_first_assigned_package_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancel_button_first_assigned_package, logger, "cancel_button_first_assigned_package");}
    @FindBy(xpath = "(//div[@class='ht_master handsontable'])[2]//table[@class='htCore']//tbody//tr[2]//i[@class='fa fa-times']")
    WebElement cancel_button_assigned_package;
    public void click_cancel_assigned_package_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancel_button_assigned_package, logger, "cancel_button_assigned_package");}

    @FindBy(xpath = "//div[@class='form-group list-manager custom-packages']//button[@type='button'][normalize-space()='Remove']")
    WebElement remove_button;
    public void click_remove_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, remove_button, logger, "remove_button");}

    @FindBy(xpath = "//a[contains(text(),'+ Add Section')]")
    WebElement addSectionButton;

    public void clickAddSectionButton() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, addSectionButton, logger, " add section button ");

        ReusableMethodsLoggersPOM.clickMethod(driver, addSectionButton, logger, " add section button ");
    }

    @FindBy(xpath = "//a[contains(text(),'FNMA XML Data Standard (PCA)')]")
    WebElement add_PCA_XMLPackage_toSection;

    public void clickAddPCAXMLPackage_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_PCA_XMLPackage_toSection, logger, " add pca xml package to section ");
    }


    @FindBy(xpath = "//span[contains(text(),'Quick Facts Table')]")
    WebElement sectionView_quickFactsTable;

    public void clickSectionView_QuickFactsTable() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_quickFactsTable, logger, " section view - quick facts table ");
    }

    @FindBy(xpath = "//span[contains(text(),'Executive Summary - Title Page')]")
    WebElement sectionView_ExecutiveSummary;

    public void clickSectionView_ExecutiveSummary() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_ExecutiveSummary, logger, " section view - ExecutiveSummary ");
    }

    @FindBy(xpath = "//span[contains(text(),'Summary of Known Problematic Building Materials')]")
    WebElement sectionView_KnownProblems;

    public void clickSectionView_KnownProblems() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_KnownProblems, logger, " section view - KnownProblems ");
    }

    @FindBy(xpath = "//input[@name='common_stairways' and @value='0']")
    WebElement common_stairways_checkBox;

    public void clickCommon_stairways_checkbox_quickFactsTable() {
        ReusableMethodsLoggersPOM.clickMethod(driver, common_stairways_checkBox, logger, "common_stairways_checkBox");
    }

    @FindBy(xpath = "//input[@name='common_breezeways' and @value='0']")
    WebElement common_breezeways_checkBox;

    public void clickCommon_breezeways_checkbox_quickFactsTable() {
        ReusableMethodsLoggersPOM.clickMethod(driver, common_breezeways_checkBox, logger, "common_breezeways_checkBox");
    }

    @FindBy(xpath = "//input[@name='units_selected' and @value='0']")
    WebElement units_selected_checkBox;

    public void clickUnits_selected_quickFactsTable() {
        ReusableMethodsLoggersPOM.clickMethod(driver, units_selected_checkBox, logger, "units_selected_checkBox");
    }


    @FindBy(xpath = "//span[contains(text(),'FNMA XML Data Standard (PCA)')]")
    WebElement sectionView_PCA_XML;

    public void clickSectionView_PCA_XML() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_PCA_XML, logger, " section view - pca xml ");
    }

    @FindBy(xpath = "//span[contains(text(),'FNMA XML Data Standard (ESA)')]")
    WebElement sectionView_ESA_XML;

    public void clickSectionView_ESA_XML() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_ESA_XML, logger, " section view - esa xml ");
    }

    @FindBy(xpath = "//span[@id='report-essentials-title' and text()='Report Tags']")
    WebElement sectionView_ReportTags_Button;

    public void clickSectionView_ReportTags_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_ReportTags_Button, logger, " section view - report tag button ");
    }


    @FindBy(xpath = "//i[@class='fa fa-fw fa-lg fa-file-code-o']")
    WebElement generateXMLButton;

    public void clickGenerateXMLButton() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, generateXMLButton, logger, " generate xml button ");
        Thread.sleep(700);
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, generateXMLButton, logger, " generate xml button ");
    }

    @FindBy(xpath = "//a[@class='download-non-pdf document-download js-download']")
    WebElement XMLButtonText;


    public void getXMLButtonText() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, XMLButtonText, logger, "  xml button text");
    }

    public void downloadGeneratedXML_ZIP() {
        ReusableMethodsLoggersPOM.clickMethod(driver, XMLButtonText, logger, "  xml button generated text download button");
    }



    @FindBy(xpath = "//div[@class='modal-body']")
    WebElement errorMessage_XMLPackageData;

    public void getErrorPage_XMLPackageData() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, errorMessage_XMLPackageData, logger, " error message- xml list ");
        System.out.println("Error Info: " + "\n" + result + "\n");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_deal_identifier']")
    WebElement dealIdentifier;

    public void enterDealIdentifier() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, dealIdentifier, "123456", logger, "deal Identifier");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][ada_fha_compliance]' and @value='0']")
    WebElement ada_FHA_Compliance_Issues_checkbox;

    public void clickADA_FHA_Compliance_Issues_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ada_FHA_Compliance_Issues_checkbox, logger, "ada_FHA_Compliance_Issues_checkbox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][catastrophic_event_prone]' and @value='0']")
    WebElement catastrophicEvent_checkbox;

    public void clickCatastrophicEvent_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, catastrophicEvent_checkbox, logger, "catastrophicEvent_checkbox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][energy_compliance_reporting]' and @value='0']")
    WebElement energy_compliance_reporting_checkbox;

    public void clickEnergy_compliance_reporting_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, energy_compliance_reporting_checkbox, logger, "energy_compliance_reporting_checkbox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][moisture_or_microbial_growth]' and @value='0']")
    WebElement moisture_or_microbial_growth_checkbox;

    public void clickMoisture_or_microbial_growth_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, moisture_or_microbial_growth_checkbox, logger, "moisture_or_microbial_growth_checkbox");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][seismic_risk_assessment_required]' and @value='0']")
    WebElement seismic_risk_assessment_required;

    public void click_seismic_risk_assessment_required_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, seismic_risk_assessment_required, logger, "seismic_risk_assessment_required");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][multifamily]']")
    WebElement Multifamily_Building_Construction_Type;

    public void selectMultifamily_Building_Construction_Type() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, Multifamily_Building_Construction_Type, 1, logger, "Multifamily_Building_Construction_Type");
    }


    @FindBy(xpath = "//span[@data-name='Down Unit Count']")
    WebElement downUnitCount_ReportTagButton;

    public void clickDownUnitCount_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, downUnitCount_ReportTagButton, logger, "downUnitCount_ReportTagButton");
    }

    @FindBy(xpath = "//input[@placeholder='Down Unit Count']")
    WebElement downUnitCount_ReportTagField;

    public void enterDownUnitCount_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, downUnitCount_ReportTagField, "1", logger, "downUnitCount_EnterReportTagField");
    }


    @FindBy(xpath = "//span[@data-name='Number of Parking Spaces']")
    WebElement parkingSpaces_ReportTagButton;

    public void clickParkingSpaces_ReportTagButton() {
        ReusableMethodsLoggersPOM.scrollandDoubleClickMethod(driver, parkingSpaces_ReportTagButton, logger, "parkingSpaces_ReportTagButton");
    }

    @FindBy(xpath = "//input[@placeholder='Number of Parking Spaces']")
    WebElement parkingSpaces_ReportTagField;

    public void enterParkingSpaces_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, parkingSpaces_ReportTagField, "2", logger, "parkingSpaces_ReportTagField");
    }


    @FindBy(xpath = "//span[@data-name='Number of Handicap Parking Spaces']")
    WebElement HandicapParkingSpaces_ReportTagButton;

    public void clickHandicapParkingSpaces_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, HandicapParkingSpaces_ReportTagButton, logger, "HandicapParkingSpaces_ReportTagButton");
    }

    @FindBy(xpath = "//input[@placeholder='Number of Handicap Parking Spaces']")
    WebElement HandicapParkingSpaces_ReportTagField;

    public void enterHandicapParkingSpaces_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, HandicapParkingSpaces_ReportTagField, "2", logger, "HandicapParkingSpaces_ReportTagField");
    }


    @FindBy(xpath = "//span[@data-name='Units Inspected Count']")
    WebElement unitsInspectedCount_ReportTagButton;

    public void clickUnitsInspectedCount_ReportTagButton() {
        ReusableMethodsLoggersPOM.scrollandDoubleClickMethod(driver, unitsInspectedCount_ReportTagButton, logger, "unitsInspectedCount_ReportTagButton");
    }

    @FindBy(xpath = "//input[@placeholder='Units Inspected Count']")
    WebElement unitsInspectedCount_ReportTagField;

    public void enterUnitsInspectedCount_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, unitsInspectedCount_ReportTagField, "21", logger, "unitsInspectedCount_ReportTagField");
    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][pest_present]' and @value='0']")
    WebElement pest_present_checkbox;

    public void clickPest_present_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, pest_present_checkbox, logger, "pest_present_checkbox");
    }


    @FindBy(xpath = "//span[@data-name='Overall Property Rating']")
    WebElement overallPropertyRating_ReportTagButton;

    public void clickOverallPropertyRating_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, overallPropertyRating_ReportTagButton, logger, "overallPropertyRating_ReportTagButton");
    }

    @FindBy(xpath = "//div[@class='floating-panel-content js-floating-panel-content']//select[@class='form-control']")
    WebElement overallPropertyRating_ReportTagDropdown;

    public void selectOverallPropertyRating_ReportTagDropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, overallPropertyRating_ReportTagDropdown, 3, logger, "overallPropertyRating_ReportTagDropdown");
    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][property_high_seismisk_risk]' and @value='0']")
    WebElement property_high_seismisk_risk_checkbox;

    public void clickProperty_high_seismisk_risk_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, property_high_seismisk_risk_checkbox, logger, "property_high_seismisk_risk_checkbox");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_net_rentable_sf']")
    WebElement totalNetRentableSF;

    public void enterTotalNetRentableSF() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, totalNetRentableSF, "50", logger, "totalNetRentableSF");
    }

//    @FindBy(xpath = "//input[@placeholder='Total Net Rentable SF']")
//    WebElement totalNetRentableSF_ReportTagField;
//
//    public void enterTotalNetRentableSF_ReportTagField() {
//        ReusableMethodsLoggersPOM.sendKeysMethod(driver, totalNetRentableSF_ReportTagField, "100", logger, "totalNetRentableSF_ReportTagField");
//    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_building_area_sf']")
    WebElement buildingSquareFeet;

    public void enterBuildingSquareFeet_ReportTagButton() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, buildingSquareFeet, "100", logger, "buildingSquareFeet");
    }

    @FindBy(xpath = "//input[@placeholder='Building Square Feet']")
    WebElement buildingSquareFeet_ReportTagField;

    public void clickBuildingSquareFeet_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, buildingSquareFeet_ReportTagField, "20", logger, "buildingSquareFeet_ReportTagField");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][walkway]']")
    WebElement walkwayDropdown;

    public void selectWalkwayDropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, walkwayDropdown, 2, logger, "walkwayDropdown");
    }

    //  @FindBy(xpath = "//*[@class='htLeft q-readonly current highlight']")
    //  WebElement dateCreatedReport;

//    public void captureRecentFolderDateCreated() {
//        //String reportDate= dateCreatedReport.getAttribute("text");
//       // System.out.println("date created: " + reportDate);
//        String result2 = ReusableMethodsLoggersPOM.captureTextMethod(driver, dateCreatedReport, logger, "date created message ");
//        System.out.println("\n" + "Date Created: " + result2);
//    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][zoning_building_or_fire_code_violation]' and @value='0']")
    WebElement codeViolation_checkbox;

    public void clickCodeViolation_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, codeViolation_checkbox, logger, "codeViolation_checkbox");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_assessor_name']")
    WebElement thirdPartyAssessorName;

    public void enterThirdPartyAssessorName() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, thirdPartyAssessorName, "third party assessor test name", logger, "thirdPartyAssessorName");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_report_signature_date']")
    WebElement third_Party_ReportSignature_Date ;


    String driverClassName = driver.getClass().getSimpleName();


    public void enter_third_Party_ReportSignature_Date() {


        if (driverClassName.contains("Chrome")) {
            // Run test case for Chrome
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, third_Party_ReportSignature_Date,"01292024" , logger, "third_Party_ReportSignature_Date");
        } else if (driverClassName.contains("Firefox")) {
            // Run test case for Firefox
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, third_Party_ReportSignature_Date,"2024-03-20" , logger, "third_Party_ReportSignature_Date_FF");
            // Handle other types of WebDriver if needed
        }


    }









    @FindBy(xpath = "//input[@id='package_summary_item_package_data_signatory_name']")
    WebElement thirdParty_signatory_name;

    public void enterThirdParty_signatory_name() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, thirdParty_signatory_name, "signatory-test", logger, "thirdParty_signatory_name_submit");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][report_subtype]']")
    WebElement report_subtype_dropdown;

    public void selectReport_subtype_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, report_subtype_dropdown, 2, logger, "report_subtype_dropdown");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_requester_name']")
    WebElement thirdParty_requestor_Name;

    public void enter_thirdParty_requestor_name() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, thirdParty_requestor_Name, "thirdParty_requestor_Name", logger, "thirdParty_requestor_Name");
    }

    @FindBy(xpath = "//i[@class='fa fa-angle-down fa-lg']")
    WebElement clientContact_ReportTagField_dropdownButton;

    public void clickClientContact_ReportTagField_dropdownButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clientContact_ReportTagField_dropdownButton, logger, "clientContact_ReportTagField_dropdownButton");
    }

    @FindBy(xpath = "//div[text()='Leela']")
    WebElement clientContact_ReportTagField_dropdownItem;

    public void clickClientContact_ReportTagField_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clientContact_ReportTagField_dropdownItem, logger, "clientContact_ReportTagField_dropdownItem");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][dus_lender_name]']")
    WebElement clientName;

    public void select_ClientName_DUS_Lender() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, clientName, 10, logger, "clientName");
    }


    @FindBy(xpath = "//input[@class='form-control ui-autocomplete-input']")
    WebElement clientName_ReportTagField;


    @FindBy(xpath = "//i[@class='fa fa-angle-down fa-lg']")
    WebElement clientName_ReportTagField_dropdownButton;

    public void clickClientName_ReportTagField_dropdownButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clientName_ReportTagField_dropdownButton, logger, "clientName_ReportTagField_dropdownButton");
    }

    @FindBy(xpath = "//div[text()='Big Client!']")
    WebElement clientName_ReportTagField_dropdownItem;

    public void clickClientName_ReportTagField_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clientName_ReportTagField_dropdownItem, logger, "clientName_ReportTagField_dropdownItem");
    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][adjoining_parcel]' and @value='0']")
    WebElement adjoining_parcel_checkBox;

    public void clickAdjoining_parcel_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, adjoining_parcel_checkBox, logger, "adjoining_parcel_checkBox");
    }


    @FindBy(xpath = "//*[contains(@data-name,'County')]")
    WebElement siteCounty_ReportTagButton;

    public void clickSiteCounty_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, siteCounty_ReportTagButton, logger, "siteCounty_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement siteCounty_ReportTagField;

    public void enterSiteCounty_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, siteCounty_ReportTagField, "county test name", logger, "siteCounty_ReportTagField");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_number_of_beds']")
    WebElement number_of_beds;

    public void enterNumber_of_beds() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, number_of_beds, "4", logger, "number_of_beds");
    }


    @FindBy(xpath = "//select[@id='building_type']")
    WebElement buildingType_dropdown;

    public void selectBuildingType_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, buildingType_dropdown, 2, logger, "buildingType_dropdown");
    }

//    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
//    WebElement siteTypeUse_ReportTagField;
//
//    public void enterSiteTypeUse_ReportTagField() {
//        ReusableMethodsLoggersPOM.sendKeysMethod(driver, siteTypeUse_ReportTagField, "Garden", logger, "siteTypeUse_ReportTagField");
//    }


    @FindBy(xpath = "//span[@data-name='Total # of apartment buildings']")
    WebElement totalNumberofAptBuildings_ReportTagButton;

    public void clickTotalNumberofAptBuildings_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, totalNumberofAptBuildings_ReportTagButton, logger, "total Number of Apt Buildings_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement totalNumberofAptBuildings_ReportTagField;

    public void enterTotalNumberofAptBuildings_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, totalNumberofAptBuildings_ReportTagField, "5", logger, "totalNumberofAptBuildings_ReportTagField");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_number_of_other_buildings']")
    WebElement number_of_other_buildings;

    public void enterNumber_of_other_buildings() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, number_of_other_buildings, "1", logger, "number_of_other_buildings");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_number_of_parcels']")
    WebElement number_of_parcels;

    public void enterNumberOfParcels() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, number_of_parcels, "5", logger, "number_of_parcels");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement numberOfParcels_ReportTagField;

    public void enterNumberOfParcels_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, numberOfParcels_ReportTagField, "2", logger, "numberOfParcels_ReportTagField");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement numberOfParcels_ReportTag_SectionView;

    public void enterNumberOfParcels_ReportTag_SectionView() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, numberOfParcels_ReportTag_SectionView, "2", logger, "numberOfParcels_ReportTag_SectionView");
    }

    @FindBy(xpath = "//span[@data-name='No. of Stories (if multiple provide each)']")
    WebElement numberOfStories_ReportTagButton;

    public void clickNumberOfStories_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, numberOfStories_ReportTagButton, logger, "numberOfStories_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement numberOfStories_ReportTagField;

    public void enterNumberOfStories_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, numberOfStories_ReportTagField, "2", logger, "numberOfStories_ReportTagField");
    }


    @FindBy(xpath = "//span[@data-name='Property Room Count']")
    WebElement propertyRoomCount_ReportTagButton;

    public void clickPropertyRoomCount_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, propertyRoomCount_ReportTagButton, logger, "propertyRoomCount_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement propertyRoomCount_ReportTagField;

    public void enterPropertyRoomCount_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, propertyRoomCount_ReportTagField, "191", logger, "propertyRoomCount_ReportTagField");
    }


    @FindBy(xpath = "//*[@name='package_summary_item[package_data][scattered_parcel]' and @value='0']")
    WebElement scattered_parcel_checkBox;

    public void clickScattered_parcel_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, scattered_parcel_checkBox, logger, "scattered_parcel_checkBox");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][use_of_ground_floor]']")
    WebElement use_of_ground_floor_dropdown;

    public void selectUse_of_ground_floor_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, use_of_ground_floor_dropdown, 1, logger, "use_of_ground_floor_dropdown");
    }


    @FindBy(xpath = "//span[@data-name='Year Constructed']")
    WebElement yearConstructed_ReportTagButton;

    public void clickYearConstructed_ReportTagButton() {
        ReusableMethodsLoggersPOM.scrollandDoubleClickMethod(driver, yearConstructed_ReportTagButton, logger, "yearConstructed_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement yearConstructed_ReportTagField;

    public void enterYearConstructed_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, yearConstructed_ReportTagField, "2020", logger, "yearConstructed_ReportTagField");
    }


    @FindBy(xpath = "//*[contains(@data-name,'City')]")

    WebElement projectCity_ReportTagButton;

    public void clickProjectCity_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, projectCity_ReportTagButton, logger, "projectCity_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement projectCity_ReportTagField;

    public void enterProjectCity_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectCity_ReportTagField, "NY", logger, "projectCity_ReportTagField");
    }

    @FindBy(xpath = "//h4[normalize-space()='Property Location']")
    WebElement property_location_section;
    public void scrollto_property_location_section() {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, property_location_section, logger, "property_location_section");}

    @FindBy(xpath = "//*[contains(@data-name,'Street Address')]")
    WebElement projectStreetAddress_ReportTagButton;
    public void clickProjectStreetAddress_ReportTagButton() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, projectStreetAddress_ReportTagButton, logger, "projectStreetAddress_ReportTagButton");}

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement projectStreetAddress_ReportTagField;
    public void enterProjectStreetAddress_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectStreetAddress_ReportTagField, "1234  ave", logger, "projectStreetAddress_ReportTagField");}


    @FindBy(xpath = "//*[contains(@data-name,'State')]")
    WebElement projectState_ReportTagButton;

    public void clickProjectState_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, projectState_ReportTagButton, logger, "projectState_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement projectState_ReportTagField;

    public void enterProjectState_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectState_ReportTagField, "PA", logger, "projectState_ReportTagField");
    }


    @FindBy(xpath = "//*[contains(@data-name,'Zip')]")
    WebElement projectZip_ReportTagButton;

    public void clickProjectZip_ReportTagButton() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, projectZip_ReportTagButton, logger, "projectZip_ReportTagButton");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement projectZip_ReportTagField;

    public void enterProjectZip_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectZip_ReportTagField, "11779", logger, "projectZip_ReportTagField");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_assessment_date']")
    WebElement property_Condition_Assessment_Date ;

    public void enter_property_Condition_Assessment_Date() {
        if (driverClassName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, property_Condition_Assessment_Date, "01022024" ,  logger, "property_Condition_Assessment_Date");

            // Run test case for Chrome
        } else if (driverClassName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, property_Condition_Assessment_Date, "2024-01-02" ,  logger, "property_Condition_Assessment_Date");

            // Run test case for Firefox
            // Handle other types of WebDriver if needed
        }
    }


    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement assessmentDate_ReportTagField;

    public void enterAssessmentDate_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, assessmentDate_ReportTagField, "1/13/2024", logger, "assessmentDate_ReportTagField");
    }


    @FindBy(xpath = "//select[@id='cladding_type']")
    WebElement claddingType_dropdown;

    public void select_claddingType_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, claddingType_dropdown, 2, logger, "claddingType_dropdown");
    }

    @FindBy(xpath = "//select[@id='roof_geometry_type']")
    WebElement roofGeometryType_dropdown;
    public void select_roofGeometryType_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, roofGeometryType_dropdown, 2, logger, "roofGeometryType_dropdown");
    }

    @FindBy(xpath = "//select[@id='plumbing_insulation_present']")
    WebElement plumbing_insulation_present;

    public void select_plumbing_insulation_present_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, plumbing_insulation_present, 2, logger, "plumbing_insulation_present");
    }

    @FindBy(xpath = "//input[@name='package_summary_item[package_data][roof_ventilation_present]' and @value='0']")
    WebElement roof_ventilation_present_checkBox;

    public void click_roof_ventilation_present_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, roof_ventilation_present_checkBox, logger, "roof_ventilation_present_checkBox");
    }

    @FindBy(xpath = "//select[@id='openings_heat_wildfire_resistant']")
    WebElement openings_heat_wildfire_resistant_dropdown;

    public void select_openings_heat_wildfire_resistant_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, openings_heat_wildfire_resistant_dropdown, 1, logger, "openings_heat_wildfire_resistant_dropdown");
    }

    @FindBy(xpath = "//select[@id='storm_drainage_system']")
    WebElement storm_drainage_system_dropdown;

    public void select_storm_drainage_system_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, storm_drainage_system_dropdown, 1, logger, "storm_drainage_system_dropdown");
    }

    @FindBy(xpath = "//select[@id='wildfire_resistant_roof_vents']")
    WebElement wildfire_resistant_roof_vents_dropdown;

    public void select_wildfire_resistant_roof_vents_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, wildfire_resistant_roof_vents_dropdown, 1, logger, "wildfire_resistant_roof_vents_dropdown");
    }

    @FindBy(xpath = "//select[@id='roof_anchor']")
    WebElement roof_anchor_dropdown;

    public void select_roof_anchor_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, roof_anchor_dropdown, 3, logger, "roof_anchor_dropdown");
    }

    @FindBy(xpath = "//select[@id='patio_deck']")
    WebElement patio_deck_dropdown;

    public void select_patio_deck_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, patio_deck_dropdown, 2, logger, "patio_deck_dropdown");
    }

    @FindBy(xpath = "//input[@name='package_summary_item[package_data][observed_structural_distress]' and @value='0']")
    WebElement observed_structural_distress;

    public void click_observed_structural_distress_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, observed_structural_distress, logger, "observed_structural_distress");
    }


    @FindBy(xpath = "//select[@id='site_plan_geometry']")
    WebElement site_plan_geometry_dropdown;

    public void select_site_plan_geometry_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, site_plan_geometry_dropdown, 1, logger, "site_plan_geometry_dropdown");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_lowest_floor_level_occupied']")
    WebElement lowest_floor_level_occupied;

    public void enter_lowest_floor_level_occupied() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, lowest_floor_level_occupied, "1", logger, "lowest_floor_level_occupied");
    }

    @FindBy(xpath = "//input[@name='package_summary_item[package_data][interior_sprinkler_system_present]' and @value='0']")
    WebElement interior_sprinkler_system_present;

    public void click_interior_sprinkler_system_present_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, interior_sprinkler_system_present, logger, "interior_sprinkler_system_present");
    }


    @FindBy(xpath = "//select[@id='sprinkler_system_type']")
    WebElement sprinkler_system_type_dropdown;

    public void select_sprinkler_system_type_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, sprinkler_system_type_dropdown, 3, logger, "sprinkler_system_type_dropdown");
    }


    @FindBy(xpath = "//input[@name='package_summary_item[package_data][ember_accumulators]' and @value='0']")
    WebElement ember_accumulators;

    public void click_ember_accumulators_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ember_accumulators, logger, "ember_accumulators");
    }


    @FindBy(xpath = "//select[@id='first_floor_height']")
    WebElement first_floor_height_dropdown;

    public void select_first_floor_height_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, first_floor_height_dropdown, 1, logger, "first_floor_height_dropdown");
    }

    @FindBy(xpath = "//select[@id='ice_dam_protection']")
    WebElement ice_dam_protection;

    public void select_ice_dam_protection_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, ice_dam_protection, 1, logger, "ice_dam_protection");
    }

    @FindBy(xpath = "//select[@id='snow_guards']")
    WebElement snow_guards;

    public void select_snow_guards_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, snow_guards, 1, logger, "snow_guards");
    }

    @FindBy(xpath = "//select[@id='fire_service_accessibility']")
    WebElement fire_service_accessibility;

    public void select_fire_service_response_type_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, fire_service_accessibility, 1, logger, "fire_service_accessibility");
    }


    @FindBy(xpath = "//select[@id='building_retrofitted_for_flood_resiliency']")
    WebElement building_retrofitted_for_flood_resiliency;

    public void select_building_retrofitted_for_flood_resiliency_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, building_retrofitted_for_flood_resiliency, 1, logger, "building_retrofitted_for_flood_resiliency");
    }


    @FindBy(xpath = "//select[@id='roof_equipment_hurricane_bracing']")
    WebElement roof_equipment_hurricane_bracing;

    public void select_roof_equipment_hurricane_bracing_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, roof_equipment_hurricane_bracing, 1, logger, "roof_equipment_hurricane_bracing");
    }

    @FindBy(xpath = "//select[@id='heating_fuel_type']")
    WebElement heating_fuel_type;

    public void select_heating_fuel_type_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, heating_fuel_type, 2, logger, "heating_fuel_type");
    }


    @FindBy(xpath = "//select[@id='hot_water_fuel_type']")
    WebElement hot_water_fuel_type;

    public void select_hot_water_fuel_type_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, hot_water_fuel_type, 2, logger, "hot_water_fuel_type");
    }


    @FindBy(xpath = "//select[@id='heating_fuel_paid_by']")
    WebElement heating_fuel_paid_by;

    public void select_heating_fuel_paid_by_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, heating_fuel_paid_by, 2, logger, "heating_fuel_paid_by");
    }


    @FindBy(xpath = "//select[@id='hot_water_fuel_paid_by']")
    WebElement hot_water_fuel_paid_by;

    public void select_hot_water_fuel_paid_by_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, hot_water_fuel_paid_by, 2, logger, "hot_water_fuel_paid_by");
    }


    @FindBy(xpath = "//select[@id='foundation_type']")
    WebElement foundation_type;

    public void select_foundation_type_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, foundation_type, 2, logger, "foundation_type");
    }


}







