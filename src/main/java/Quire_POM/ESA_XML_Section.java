package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

public class ESA_XML_Section extends ReusableAnnotations {
    //]must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public ESA_XML_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor


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


    @FindBy(xpath = "//a[contains(text(),'FNMA XML Data Standard (ESA)')]")
    WebElement add_ESA_XMLPackage_toSection;

    public void clickAddESAXMLPackage_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_ESA_XMLPackage_toSection, logger, " add esa xml package to section ");
    }

    @FindBy(xpath = "//span[contains(text(),'FNMA XML Data Standard (ESA)')]")
    WebElement sectionView_ESA_XML;

    public void clickSectionView_ESA_XML() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_ESA_XML, logger, " section view - esa xml ");
      //  String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, sectionView_ESA_XML, logger, "  xml button text");
      //  System.out.println("Generated file:: " + "\n" + result + "\n");
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
        ReusableMethodsLoggersPOM.clickMethod(driver, XMLButtonText, logger, " generate xml button ");


    }

    @FindBy(xpath = "//div[@class='modal-body']")
    WebElement errorMessage_XMLPackageData;

    public void getErrorPage_XMLPackageData() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, errorMessage_XMLPackageData, logger, " error message- xml list ");
        System.out.println("Error Info: " + "\n" + result + "\n");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][scope_standard_description]']")
    WebElement thirdPartyReport_ScopeStandard;

    public void selectThirdPartyReport_ScopeStandard() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, thirdPartyReport_ScopeStandard, 1, logger, "thirdPartyReport_ScopeStandard");
    }


    @FindBy(xpath = "//input[@id='package_summary_item_package_data_phase_1_date']")
    WebElement phase_1_Site_Assessment_Date;
    String driverClassName = driver.getClass().getSimpleName();

    public void enterPhase_1_Site_Assessment_Date() {
        if (driverClassName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, phase_1_Site_Assessment_Date, "11102024", logger, "phase_1_Site_Assessment_Date");
        } else if (driverClassName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, phase_1_Site_Assessment_Date, "2024-10-11", logger, "phase_1_Site_Assessment_Date");
        }
    }


    @FindBy(xpath = "//select[@name='package_summary_item[package_data][hazard_concerns]']")
    WebElement hazard_concerns;

    public void selectHazard_concerns() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, hazard_concerns, 2, logger, "hazard_concerns");
    }

    @FindBy(xpath = "//select[@name='package_summary_item[package_data][tank_concerns]']")
    WebElement tank_concerns;

    public void selectTank_concerns() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, tank_concerns, 2, logger, "tank_concerns");
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

    public void selectDUS_compliance() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, dus_compliance, logger, "dus_compliance");
        Thread.sleep(1000);

        ReusableMethodsLoggersPOM.selectByIndex(driver, dus_compliance, 3, logger, "dus_compliance");
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


    @FindBy(xpath = "//span[@class='reportTag js-reportTag computed']")
    WebElement percent_of_units_inspected_reportTag;

    public void capture_percent_of_units_inspected_reportTag() {
        ReusableMethodsLoggersPOM.captureAttributeMethod(driver, percent_of_units_inspected_reportTag,  logger, "percent_of_units_inspected_reportTag", "data-value");
    }

    @FindBy(xpath = "//input[@id='package_summary_item_package_data_year_built']")
    WebElement yearBuilt;

    public void enterYearBuilt() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, yearBuilt, "1700", logger, "yearBuilt");
    }
}




