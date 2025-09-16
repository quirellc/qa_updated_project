package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

public class Company_Connections extends ReusableAnnotations {
    //]must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();

    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public Company_Connections(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "//a[@id='share_report_action']")
    WebElement share_settings_button;

    public void clickSharingSettingsButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, share_settings_button, logger,"Share Settings Button");
    }

    @FindBy(xpath = "//div[contains(@class,'js-shareWithCompanySelector')]//div[contains(@class,'selectize-input')]/input")
    WebElement company_name_dropdown_field;

    public void clickandEnter_cbre_CompanyNameDropdownField() throws InterruptedException {

        ReusableMethodsLoggersPOM.clickMethod(driver, company_name_dropdown_field, logger,"Company Name Dropdown Field");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, company_name_dropdown_field, "cbre", logger,"Company Name Dropdown Field");

    }



    @FindBy(xpath = "//input[@value='Save Sharing Settings']")
    WebElement save_sharing_settings_button;
    public void clickSaveSharingSettingsButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, save_sharing_settings_button, logger,"Save Sharing Settings Button");
    }

@FindBy(xpath = "//a[contains(@class,'list-on-table-tab')][normalize-space()='All Companies']")
WebElement all_companies_tab;
public void clickAllCompaniesTab() {
    ReusableMethodsLoggersPOM.clickMethod(driver, all_companies_tab, logger, "All Companies Tab");
}

@FindBy(xpath = "(//a[normalize-space()='Testing Inc.'])[1]")
WebElement testing_inc_link;
public void clickTestingIncLink() {
    ReusableMethodsLoggersPOM.clickMethod(driver, testing_inc_link, logger, "Testing Inc Link");}

    @FindBy(xpath = "//span[normalize-space()='QA Automation Testing Medium Report']")
    WebElement qa_automation_testing_medium_report;
    public void clickQA_Automation_Testing_Medium_Report() {
        ReusableMethodsLoggersPOM.clickMethod(driver, qa_automation_testing_medium_report, logger, "QA Automation Testing Medium Report");
    }





}




