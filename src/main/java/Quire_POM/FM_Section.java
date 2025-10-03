package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.util.List;

public class FM_Section extends ReusableAnnotations {
    //]must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();

    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public FM_Section(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "//span[normalize-space()='Electrical Conditions']")
    WebElement electricalConditions;
    public void scroll_to_ElectricalConditions() {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, electricalConditions,  logger, "electricalConditions");
    }

    @FindBy(xpath = "//select[@id='60_amps_present_condition']")
    WebElement electricalConditions_60amps_Dropdown;
    public void select_electricalConditions_60amps_Dropdown() {
        ReusableMethodsLoggersPOM.selectByValue(driver, electricalConditions_60amps_Dropdown, "present",  logger, "electricalConditions_60amps_Dropdown");
    }

    @FindBy(xpath = "//select[@name='property_grounds_service_level']")
    WebElement electricalConditions_lessThan40amps_Dropdown;
    public void select_electricalConditions_lessThan40amps_Dropdown() {
        ReusableMethodsLoggersPOM.selectByValue(driver, electricalConditions_lessThan40amps_Dropdown, "1",  logger, "electricalConditions_lessThan40amps_Dropdown");
    }

    @FindBy(xpath = "//input[@name='property_grounds_service_amps']")
    WebElement levelOfService_field;
    public void enter_levelOfService_field() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, levelOfService_field, "QA Automation Text - 35 Amps",  logger, "levelOfService_field");
    }

    @FindBy(xpath = "//div[@class='editor-section-title'][normalize-space()='Describe the results of the load analysis, and identify who completed it:']/following-sibling::div[1]//section")
    WebElement load_analysis_description_field;

    public void click_load_analysis_description_field() {
        ReusableMethodsLoggersPOM.clickMethod(driver, load_analysis_description_field,  logger, "load_analysis_description_field");
    }

    @FindBy(xpath = "//body")
    WebElement instruction_text_iFrame;
    public void enter_loadAnalysis_text() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod2(driver, instruction_text_iFrame, "QA Automation Text - Load Analysis", logger, "instruction_text_iFrame");
    }

    @FindBy(xpath = "//select[@id='electrical_systems_condition']")
    WebElement electricalConditions_condition_Dropdown;
    public void select_electricalConditions_condition_Dropdown() {
        ReusableMethodsLoggersPOM.selectByValue(driver, electricalConditions_condition_Dropdown, "4",  logger, "electricalConditions_condition_Dropdown");
    }

    @FindBy(xpath = "//div[@class='fmac1104-electricalConditions-costContainer']//a[@class='btn btn-subtle btn-sm add-cost-summary'][normalize-space()='Add Cost Recommendation']")
    WebElement add_cost_rec_button_section_III_electrical_conditions;

    public void click_add_cost_rec_button_section_III_electrical_conditions() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_cost_rec_button_section_III_electrical_conditions, logger, " add_cost_rec_button_section_III_electrical_conditions ");
    }


    @FindBy(xpath = "//input[@id='cost_summary_keyword_lookup_id']")
    WebElement item_name_cost_recommendation;

    public void enter_item_name_cost_recommendation() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, item_name_cost_recommendation, "Electrical Capacity Upgrades", logger, " item_name_cost_recommendation ");
    }

    @FindBy(xpath = "//textarea[@id='cost_summary_comments']")
    WebElement cost_summary_comments;

    public void enter_cost_summary_comments() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, cost_summary_comments, "qa cost rec comment - Electrical Capacity Upgrades", logger, " costRec_summary_comments ");
    }


    @FindBy(xpath = "//select[@name='elevators_optional']")
    WebElement are_there_any_elevators_dropDown;
    public void select_are_there_any_elevators_dropDown() {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, are_there_any_elevators_dropDown,  logger, "are_there_any_elevators_dropDown");
        ReusableMethodsLoggersPOM.selectByValue(driver, are_there_any_elevators_dropDown, "0",  logger, "are_there_any_elevators_dropDown");
    }

    @FindBy(xpath = "//select[@name='elevators_investigation_repairs']")
    WebElement elevators_repairs_dropDown;
    public void select_elevators_repairs_dropDown() {
        ReusableMethodsLoggersPOM.selectByValue(driver, elevators_repairs_dropDown, "1",  logger, "elevators_repairs_dropDown");
    }

//    @FindBy(xpath = "//div[@class='fmac1104-optionalContainer js-fmac-question-container-with-response fmac1104-optionalContainer-elevatorsInvestigationRepairs']//div[@class='fmac1104-questionAnswer-labelResponseContainer']/following-sibling::div[1]//section")

    @FindBy(xpath = "//textarea[@name='elevators_investigation_repairs_description']")
    WebElement elevators_description_field;

    public void enter_elevators_description_field() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, elevators_description_field, logger, " elevators_description_field ");
Thread.sleep(1500);
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, elevators_description_field, "QA Automation Text - Elevator Description", logger, "elevators_description_field");
    }


//    public void enter_elevator_ck4_text() {
//        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, instruction_text_iFrame, "QA Automation Text - Elevator Description", logger, "instruction_text_iFrame");
//    }


    @FindBy(xpath = "//input[@name='elevators_investigation_repairs_cost_to_cure']")
    WebElement elevator_costToCure_field;

    public void enter_elevator_costToCure_field() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, elevator_costToCure_field, "5000", logger, " elevator_costToCure_field ");
    }


    @FindBy(xpath = "(//*[contains(text(),'QA Automation Text - Elevator Description')])[2]")
    WebElement elevator_description_field_qp;


    @FindBy(xpath = "//span[@class='fmac1104-questionAnswer-label' and normalize-space()='Cost to cure:']/following-sibling::span[contains(text(), '5,000')]")
    WebElement elevator_costToCure_field_qp;

    @FindBy(xpath = "//span[normalize-space(text())='QA Automation Text - 35 Amps']")
    WebElement electricalConditions_levelOfService_field_qp;

    @FindBy(xpath = "//p[normalize-space()='QA Automation Text - Load Analysis']")
    WebElement electricalConditions_description_field_qp;

    @FindBy(xpath = "//span[normalize-space()='qa cost rec comment - Electrical Capacity Upgrades']")
    WebElement electricalConditions_costRec_summary_field_qp;
    @FindBy(xpath = "//div[@class='fmac-form-version-footer' and contains(text(), 'Freddie Mac Form 1104 (v12, 08/2025)')]")
    WebElement fm1104_v12_footer_text_qp;

    @FindBy(xpath = "//span[@class='fmac1104-questionAnswer-label' and normalize-space()='What is the rating of this component?']/following-sibling::span[normalize-space(.)='4']")
    WebElement electricalSystems_conditionRating_dropDownValue;

    @FindBy(xpath = "//label[normalize-space()='2 - Very Good/Good']")
   WebElement numerical_conditionRatings_1104;


    public void verify_fm1104_v12_QP() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, electricalConditions_levelOfService_field_qp, true, logger, " electricalConditions_levelOfService_field_qp ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, electricalConditions_description_field_qp, true, logger, " electricalConditions_description_field_qp ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, elevator_description_field_qp, true, logger, " elevator_description_field_qp ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, elevator_costToCure_field_qp, true, logger, " elevator_costToCure_field_qp ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, electricalConditions_costRec_summary_field_qp, true, logger, " electricalConditions_costRec_summary_field_qp ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, electricalSystems_conditionRating_dropDownValue, true, logger, " electricalSystems_conditionRating_dropDownValue ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, numerical_conditionRatings_1104, true, logger, " numerical_conditionRatings_1104 ");

        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fm1104_v12_footer_text_qp, true, logger, " fm1104_v11_footer_text_qp ");
    }

    @FindBy(xpath = "//div[normalize-space()='Year(s) of construction']")
    WebElement fm1105_v11_yearOfConstruction_field;

    @FindBy(xpath = "//label[normalize-space()='T1-11']")
    WebElement fm1105_t1_11_field_v11;

    @FindBy(xpath = "//label[contains(normalize-space(), 'Large areas of mold that are beyond typical housekeeping observed')]")
    WebElement fm1105_v11_mold_field;
    public void verify_fm1105_section1_v11() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fm1105_v11_yearOfConstruction_field, true, logger, " fm1105_v11_yearOfConstruction_field ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fm1105_t1_11_field_v11, true, logger, " fm1105_t1_11_field_v11 ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fm1105_v11_mold_field, true, logger, " fm1105_v11_mold_field ");
    }

    @FindBy(xpath = "//input[@id='seismic_checklist_1_yes']")
    WebElement sectionI_seismic_checklist_v11_fm1105;
    public void verify_sectionI_seismic_checklist_v11_fm1105() {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, sectionI_seismic_checklist_v11_fm1105,  logger, "sectionI_seismic_checklist_v11_fm1105");
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionI_seismic_checklist_v11_fm1105,  logger, "sectionI_seismic_checklist_v11_fm1105");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, sectionI_reinforcedConcretePre2000, true, logger, "sectionI_reinforcedConcretePre2000");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, sectionI_reinforcedMasonryPre2000, true, logger, "sectionI_reinforcedMasonryPre2000");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, sectionI_retrofittedURM, true, logger, "sectionI_retrofittedURM");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, sectionI_woodFramedPre1960, true, logger, "sectionI_woodFramedPre1960");
    }


    @FindBy(xpath = "//td[contains(text(),'Reinforced concrete buildings constructed prior to 2000')]")
    WebElement sectionI_reinforcedConcretePre2000;

    @FindBy(xpath = "//td[contains(text(),'Reinforced concrete masonry bearing wall buildings constructed prior to 2000')]")
    WebElement sectionI_reinforcedMasonryPre2000;

    @FindBy(xpath = "//td[normalize-space()='Retrofitted, unreinforced masonry (URM) buildings']")
    WebElement sectionI_retrofittedURM;

    @FindBy(xpath = "//td[normalize-space()='Wood-framed buildings constructed prior to 1960']")
    WebElement sectionI_woodFramedPre1960;



    //td[normalize-space()='Wood-framed buildings constructed prior to 1960']
    @FindBy(xpath = "//input[@name='overall_condition_description']")
    WebElement sectionII_overall_property_conditionRating_v11_fm1105;
    public void enter_sectionII_overall_property_conditionRating_v11_fm1105() {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, sectionII_overall_property_conditionRating_v11_fm1105,  logger, "sectionII_overall_property_conditionRating_v11_fm1105");
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, sectionII_overall_property_conditionRating_v11_fm1105, "QA Automation text - Overall property condition rating",  logger, "sectionII_overall_property_conditionRating_v11_fm1105");
    }

    @FindBy(xpath = "//select[@id='overall_condition_rating']")
    WebElement overall_condition_rating_dropDown;
    public void select_overall_condition_rating_dropDown_v11_fm1105() {
        ReusableMethodsLoggersPOM.selectByValue(driver, overall_condition_rating_dropDown, "1 - Excellent",  logger, "overall_condition_rating_dropDown");
    }

    @FindBy(xpath = "//input[@value='site' and @checked='checked']")
    WebElement siteCheckbox;
    public void verify_section_III_repairs_identification_v11() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, siteCheckbox, true,  logger, "section_III_repairs_identification_v11");
    }

    @FindBy(xpath = "//div[@class='fmac-form-version-footer js-fmacFormVersionFooter' and contains(text(), 'Freddie Mac Multifamily Form 1105 (08/2025)')]")
    WebElement fm1105_v11_footer_text;

    public void verify_fm1105_v11_footer_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fm1105_v11_footer_text, true,  logger, "fm1105_v11_footer_text");
    }

    @FindBy(xpath = "//table[@class='fmac-critical-priority-cost-table fmac-table']")
    WebElement cost_rec_table_v11_fm1105_qp;

    public void verify_cost_rec_table_v11_fm1105_qp() {
        String cost_rec_table_v11_fm1105_qp_string = ReusableMethodsLoggersPOM.saveTextMethod(driver, cost_rec_table_v11_fm1105_qp, logger, "cost_rec_table_v11_fm1105_qp");
        if (cost_rec_table_v11_fm1105_qp_string.contains("Carports CR EA 10 $5.00 $50.00 QA Automation Test") &&
                cost_rec_table_v11_fm1105_qp_string.contains("Garages CR EA 10 $5.00 $50.00 QA Automation Test") &&
                cost_rec_table_v11_fm1105_qp_string.contains("Subtotal $100.00")) {

            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "Successfully verified FM1105 QP- Critical and Priority Repairs - As Expected ");
            System.out.println("Successfully verified FM1105 QP- Critical and Priority Repairs - As Expected ");

        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "Unable to confirm FM1105 QP- Critical and Priority Repairs - NOT AS EXPECTED");
            System.out.println("Unable to confirm FM1105 QP- Critical and Priority Repairs - NOT AS EXPECTED");
        }
    }

    @FindBy(xpath = "//table[@data-category='site']//th[contains(normalize-space(.), 'Condition (1, 2, 3, 4, 5)')]")
    WebElement section_II_numerical_condition_rating;
    public void verify_section_II_numerical_condition_rating() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, section_II_numerical_condition_rating, true,  logger, " section_II_numerical_condition_rating ");}


    @FindBy(xpath = "//span[contains(text(),'QA Automation text - Overall property condition rating')]")
    WebElement sectionII_overall_property_condition_description_v11_fm1105_qp;

    @FindBy(xpath = "//span[contains(text(),'1 - Excellent')]")
    WebElement sectionII_overall_property_conditionRating_v12_fm1105_qp;

    @FindBy(xpath = "//th[contains(normalize-space(.), 'Condition (1, 2, 3, 4, 5)')]")
    List <WebElement> numerical_conditionRatings_list;

    public void verify_1104_sectionII_numerical_conditionRatings_list() {
        if (numerical_conditionRatings_list.size() == 4) {
            System.out.println("✅ Found exactly 4 instances of numerical_conditionRatings_list");
            logger.log(LogStatus.PASS, "✅Found exactly 4 instances of numerical_conditionRatings_list");


        } else {
            logger.log(LogStatus.FAIL, "❌ Expected 4 instances of numerical_conditionRatings_list, but found " + numerical_conditionRatings_list.size());
            System.out.println("❌ Expected 4 instances of numerical_conditionRatings_list, but found " + numerical_conditionRatings_list.size());
        }}

    public void verify_fm1105_v12_qp() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, sectionII_overall_property_condition_description_v11_fm1105_qp, true,  logger, "sectionII_overall_property_condition_description_v11_fm1105_qp");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, sectionII_overall_property_conditionRating_v12_fm1105_qp, true,  logger, "sectionII_overall_property_conditionRating_v12_fm1105_qp");
      //  verify_section_II_numerical_condition_rating();
        verify_1104_sectionII_numerical_conditionRatings_list();

    }

    @FindBy(xpath = "//label[.//span[normalize-space(.)='Form Version']]/following-sibling::div//select")
    WebElement FM_form_version_dropdown;

    public void select_FM_form_version_v11() {
        ReusableMethodsLoggersPOM.selectByValue(driver, FM_form_version_dropdown, "2024_12_12", logger, "FM_form_version_dropdown v11 ");
    }
    public void select_FM_form_version_v12() {
        ReusableMethodsLoggersPOM.selectByValue(driver, FM_form_version_dropdown, "2025_08_01", logger, "FM_form_version_dropdown v11 ");
    }


    @FindBy(xpath = "(//div[@class='fmac-validation-data invalid-condition-rating-error'])[2]")
    WebElement FM_form_conditionRating_errors;

    @FindBy(xpath = "//div[@class='tooltip-inner' and contains(text(),'Values from an incompatible form version were included in this rating and have been omitted.')]")
    WebElement FM_form_conditionRating_error_hover_message;


    public void verify_FM1105_v12_conditionRating_errors() throws InterruptedException {
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, FM_form_conditionRating_errors, true,  logger, "FM_form_conditionRating_errors");
        Thread.sleep(200);

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, FM_form_conditionRating_errors, logger, "FM_form_conditionRating_error");
        Thread.sleep(200);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, FM_form_conditionRating_error_hover_message, true,  logger, "FM_form_conditionRatingError_hover_message");
        Thread.sleep(500);


    }

    public void verify_no_FM1105_v12_conditionRating_errors() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, FM_form_conditionRating_errors, false,  logger, "FM_form_conditionRating_errors");

    }

}




