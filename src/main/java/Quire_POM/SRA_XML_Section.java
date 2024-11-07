package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

public class SRA_XML_Section extends ReusableAnnotations {
    //]must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public SRA_XML_Section(WebDriver driver) {
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


    @FindBy(xpath = "//a[contains(text(),'+ Add Section')]")
    WebElement addSectionButton;

    public void clickAddSectionButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addSectionButton, logger, " add section button ");
    }
    @FindBy(xpath = "//span[contains(text(),'FNMA XML Data Standard (SRA)')]")
    WebElement sectionView_SRA_XML;

    public void clickSectionView_SRA_XML() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_SRA_XML, logger, " section view - sra xml ");

    }


    @FindBy(xpath = "//a[contains(text(),'FNMA XML Data Standard (SRA)')]")
    WebElement add_SRA_XMLPackage_toSection;

    public void clickAddSRAXMLPackage_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_SRA_XMLPackage_toSection, logger, " add SRA xml package to section ");
    }

    @FindBy(xpath = "//a[@class='js-export-package-action document-generate']")
    WebElement generateXMLButton;

    public void clickGenerateXMLButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, generateXMLButton, logger, " generate xml button ");

    }

    @FindBy(xpath = "//a[@class='download-non-pdf document-download js-download']")
    WebElement XMLButtonText;


    public void getXMLButtonText() {

     ReusableMethodsLoggersPOM.captureTextMethod(driver, XMLButtonText, logger, "  xml button text");

    }

    @FindBy(xpath = "//div[@class='modal-body']")
    WebElement errorMessage_XMLPackageData;

    public void getErrorPage_XMLPackageData() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, errorMessage_XMLPackageData, logger, " error message- xml list ");

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][scope_standard_description]']")
    WebElement thirdPartyReport_ScopeStandard;

    public void selectThirdPartyReport_ScopeStandard() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, thirdPartyReport_ScopeStandard, 1, logger, "thirdPartyReport_ScopeStandard");
    }




    @FindBy(xpath = "//select[@name='package_summary_item[package_data][hazard_concerns]']")
    WebElement tank_concerns;

    public void selectTank_concerns() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, tank_concerns, 2, logger, "ast_tank_concerns");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][tank_concerns]']")
    WebElement hazard_concerns;

    public void selectHazard_concerns() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, hazard_concerns, 2, logger, "hazard_concerns");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][pcb_concern]']")
    WebElement pcb_concerns;

    public void selectPcb_concerns() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, pcb_concerns, 2, logger, "pcb_concerns");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][acm_concern]']")
    WebElement acm_concerns;

    public void selectAcm_concerns() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, acm_concerns, 2, logger, "acm_concerns");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][lbp_concern]']")
    WebElement lbp_concerns;

    public void selectLbp_concerns() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, lbp_concerns, 2, logger, "lbp_concerns");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][radon_concern]']")
    WebElement radon_concern;

    public void selectRadon_concern() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, radon_concern, 2, logger, "radon_concern");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][air_quality_concern]']")
    WebElement air_quality_concern;

    public void selectAir_quality_concern() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, air_quality_concern, 2, logger, "air_quality_concern");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][lead_water_concern]']")
    WebElement lead_water_concern;

    public void selectLead_water_concern() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, lead_water_concern, 2, logger, "lead_water_concern");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][mold_concern]']")
    WebElement mold_concern;

    public void selectMold_concern() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, mold_concern, 2, logger, "mold_concern");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][adjacent_property_concern]']")
    WebElement adjacent_property_concern;

    public void selectAdjacent_property_concern() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, adjacent_property_concern, 2, logger, "adjacent_property_concern");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][dus_compliance]']")
    WebElement dus_compliance;

    public void selectDUS_compliance() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, dus_compliance, 4, logger, "dus_compliance");
    }


    @FindBy(xpath = "//input[@name='package_summary_item[package_data][ust_count]']")
    WebElement number_of_UST;

    public void enterNumber_of_UST() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, number_of_UST, "1", logger, "number_of_UST");
    }

    @FindBy(xpath = "//input[@name='package_summary_item[package_data][lust_count]']")
    WebElement number_of_LUST;

    public void enterNumber_of_LUST() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, number_of_LUST, "2", logger, "number_of_LUST");
    }

    @FindBy(xpath = "//input[@name='package_summary_item[package_data][ast_count]']")
    WebElement number_of_AST;

    public void enterNumber_of_AST() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, number_of_AST, "3", logger, "number_of_AST");
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

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_number_of_other_buildings']")
    WebElement number_of_other_buildings;

    public void enterNumber_of_other_buildings() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, number_of_other_buildings, "1", logger, "number_of_other_buildings");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][4099c_indicator]' and @value='0']")
    WebElement form_4099c_indicator_checkBox;

    public void clickForm_4099c_indicator_checkBox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, form_4099c_indicator_checkBox, logger, "form_4099c_indicator_checkBox");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_risk_assessment_date']")
    WebElement seismicRisk_Assessment_Date;

    String driverClassName = driver.getClass().getSimpleName();

    public void enterSeismicRisk_Assessment_Date() {
        if (driverClassName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, seismicRisk_Assessment_Date, "11102023", logger, "seismicRisk_Assessment_Date");
        } else if (driverClassName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, seismicRisk_Assessment_Date, "2023-10-11", logger, "seismicRisk_Assessment_Date");

        }
        }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][use_of_ground_floor]']")
    WebElement use_of_ground_floor_dropdown;

    public void selectUse_of_ground_floor_dropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, use_of_ground_floor_dropdown, 1, logger, "use_of_ground_floor_dropdown");
    }
    @FindBy(xpath = "//select[@name='package_summary_item[package_data][multifamily_construction_type]']")
    WebElement Multifamily_Building_Construction_Type;

    public void selectMultifamily_Building_Construction_Type() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, Multifamily_Building_Construction_Type, 1, logger, "Multifamily_Building_Construction_Type");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][other_construction_type]']")
    WebElement other_construction_type;

    public void selectOther_construction_type() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, other_construction_type, 1, logger, "other_construction_type");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][site_soil_class]']")
    WebElement site_soil_class;

    public void selectSite_soil_class() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, site_soil_class, 1, logger, "site_soil_class");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_pga_gravity_percent']")
    WebElement pga_gravity_percent;

    public void enterPga_gravity_percent() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pga_gravity_percent, "0", logger, "pga_gravity_percent");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][mercali_intensity]']")
    WebElement mercali_intensity;

    public void selectMercali_intensity() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, mercali_intensity, 2, logger, "mercali_intensity");
    }







    @FindBy(xpath = "//select[@name='package_summary_item[package_data][surface_fault_potential]']")
    WebElement surface_fault_potential;

    public void selectSurface_fault_potential() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, surface_fault_potential, 2, logger, "surface_fault_potential");
    }



    @FindBy(xpath = "//select[@name='package_summary_item[package_data][liquefaction_potential]']")
    WebElement liquefaction_potential;

    public void selectLiquefaction_potential() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, liquefaction_potential, 2, logger, "liquefaction_potential");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][landslide_potential]']")
    WebElement landslide_potential;

    public void selectLandslide_potential() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, landslide_potential, 2, logger, "landslide_potential");
    }



    @FindBy(xpath = "//select[@name='package_summary_item[package_data][tsunami_inundation_potential]']")
    WebElement tsunami_inundation_potential;

    public void selectTsunami_inundation_potential() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, tsunami_inundation_potential, 1, logger, "tsunami_inundation_potential");
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][seiche_failure_potential]']")
    WebElement seiche_failure_potential;

    public void selectSeiche_failure_potential() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, seiche_failure_potential, 1, logger, "seiche_failure_potential");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][short_column]']")
    WebElement shortColumn;

    public void selectShortColumn() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, shortColumn, 1, logger, "shortColumn");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][tilt_up_anchoring]']")
    WebElement tiltUpAnchoring;

    public void selectTiltUpAnchoring() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, tiltUpAnchoring, 1, logger, "tiltUpAnchoring");
    }
    @FindBy(xpath = "//input[@id='package_summary_item_package_data_pml_sel_475_mf_building']")
    WebElement pml_sel_475_mf_building;

    public void enterPml_sel_475_mf_building() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pml_sel_475_mf_building, "0", logger, "pml_sel_475_mf_building");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_pml_sel_475_property']")
    WebElement pml_sel_475_property;

    public void enterPml_sel_475_property() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pml_sel_475_property, "2", logger, "pml_sel_475_property");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_pml_sel_475_other_building']")
    WebElement pml_sel_475_otherBuilding;

    public void enterPml_sel_475_otherBuilding() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pml_sel_475_otherBuilding, "0", logger, "pml_sel_475_otherBuilding");
    }

    @FindBy(xpath = "//*[@name='package_summary_item[package_data][building_20percent_indicator]' and @value='0']")
    WebElement building_20percent_indicator_checkbox;

    public void clickBuilding_20percent_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, building_20percent_indicator_checkbox, logger, "building_20percent_indicator_checkbox");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_pml_sul_475_mf_building']")
    WebElement pml_sul_475_mf_building;

    public void enterPml_sul_475_mf_building() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pml_sul_475_mf_building, "0", logger, "pml_sul_475_mf_building");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_pml_sul_475_other_building']")
    WebElement pml_sul_475_other_building;

    public void enterPml_sul_475_otherBuilding() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pml_sul_475_other_building, "0", logger, "pml_sul_475_other_building");
    }
    @FindBy(xpath = "//input[@id='package_summary_item_package_data_pml_sul_475_property']")
    WebElement pml_sul_475_property;

    public void enterPml_sul_475_property() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pml_sul_475_property, "0", logger, "pml_sul_475_property");
    }





    @FindBy(xpath = "//*[@name='package_summary_item[package_data][acceptable_indicator]' and @value='0']")
    WebElement acceptable_indicator_checkbox;

    public void acceptable_building_stability_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, acceptable_indicator_checkbox, logger, "acceptable_indicator_checkbox");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_building_code_desc']")
    WebElement building_code;

    public void enterBuilding_code() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, building_code, "41", logger, "building_code");
    }

    @FindBy(xpath = "//td[@data-display='physical_occupancy_percent']//span[@class='reportTag js-reportTag']")
    WebElement occupancyPercentage_ReportTagButton;

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement occupancyPercentage_ReportTagField;


    public void enterOccupancyPercentage_ReportTag() throws InterruptedException {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, occupancyPercentage_ReportTagButton, logger, "occupancyPercentage_ReportTagButton");
//        Thread.sleep(500);
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, occupancyPercentage_ReportTagField, "50", logger, "occupancyPercentage_ReportTagField");
    }


}




