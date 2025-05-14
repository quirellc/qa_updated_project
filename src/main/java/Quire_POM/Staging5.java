package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Logger;

//
public class Staging5 extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public Staging5(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    String browserName = driver.getClass().getSimpleName();

    @FindBy(xpath = "//*[text()='Portfolios']")
    WebElement portfoliosTab;

    public void clickPortfoliosTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, portfoliosTab, logger, "portfolios tab");
    }

    @FindBy(xpath = "//span[normalize-space()='QA Automation PCA Portfolio']")
    WebElement QA_PCA_portfolio;

    public void click_QA_PCA_portfolio() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, QA_PCA_portfolio, logger, "QA_PCA_portfolio");
        Thread.sleep(1000);

        ReusableMethodsLoggersPOM.clickMethod(driver, QA_PCA_portfolio, logger, "QA_PCA_portfolio");
    }

    @FindBy(xpath = "//span[@class='current-portfolio-view js-current-portfolio-view']")
    WebElement change_porfolio_view_button;
    public void click_change_porfolio_view_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, change_porfolio_view_button, logger, "change_porfolio_view_button");}

    @FindBy(xpath = "//table//tr/td[3][@class='htLeft htMiddle']")
    List<WebElement> pca_portfolio_project_name_cells;
    public void capture_pca_portfolio_project_name_cells() throws InterruptedException {
            for (WebElement element : pca_portfolio_project_name_cells) {
                String text = element.getText();
                System.out.println(text);
            }
    }
    public void confirm_copied_pca_portfolio_project_name_cells() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        if (!pca_portfolio_project_name_cells.isEmpty()) {
            String firstText = pca_portfolio_project_name_cells.get(0).getText();

            for (WebElement element : pca_portfolio_project_name_cells) {
                String text = element.getText();
                System.out.println(text);

                // Compare each text with the first one
                softAssert.assertEquals(text, firstText, "Texts are not the same.");
            }
            // Perform a final assertion to ensure all texts are the same
            try {
                softAssert.assertAll();
                System.out.println("Copied Texts are the same");
                logger.log(LogStatus.PASS, "Copied Texts are the same");
            } catch (AssertionError e) {
                System.out.println("Copied Texts are NOT the same");
                logger.log(LogStatus.FAIL, "Copied Texts are NOT the same");
                throw e;
            }        } else {
            System.out.println("List is empty.");
        }
    }

    public void confirm_undo_afterCopied_pca_portfolio_project_name_cells() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        if (!pca_portfolio_project_name_cells.isEmpty()) {
            String secondText = pca_portfolio_project_name_cells.get(1).getText();

            for (int i = 1; i < pca_portfolio_project_name_cells.size(); i++) {
                String currentText = pca_portfolio_project_name_cells.get(i).getText();

                System.out.println(currentText);

                // Compare each text with the first one
                softAssert.assertEquals(currentText, secondText, "Texts are not the same.");
            }
            // Perform a final assertion to ensure all texts are the same
            try {
                softAssert.assertAll();
                System.out.println("Previous Texts are the same");
                logger.log(LogStatus.PASS, "Previous Texts are the same");
            } catch (AssertionError e) {
                System.out.println("Copied Texts are NOT the same");
                logger.log(LogStatus.FAIL, "Copied Texts are NOT the same");
                throw e;
            }        } else {
            System.out.println("List is empty.");
        }
    }
    @FindBy(xpath = "(//td[@class='htLeft htMiddle'])[1]")
    WebElement pca_portfolio_project_name_cell;
    public void click_pca_portfolio_project_name_cell() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, pca_portfolio_project_name_cell, logger, "pca_portfolio_project_name_cell");}

    public void right_click_pca_portfolio_project_name_cell() throws InterruptedException {
        ReusableMethodsLoggersPOM.rightClickMethod(driver, pca_portfolio_project_name_cell, logger, "pca_portfolio_project_name_cell");}


    @FindBy(xpath = "//table[@class='htCore']//tbody//td[2]")
    WebElement reportTagMatrix_first_cell;
    public void click_reportTagMatrix_first_cell() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportTagMatrix_first_cell, logger, "reportTagMatrix_first_cell");}
    public void right_click_reportTagMatrix_first_cell() throws InterruptedException {
        ReusableMethodsLoggersPOM.rightClickMethod(driver, reportTagMatrix_first_cell, logger, "reportTagMatrix_first_cell");}

    @FindBy(xpath = "//table[@class='htCore']//tbody//td[2]")
    List<WebElement>  reportTagMatrix_first_column_cells;

    public void confirm_copied_reportTagMatrix_cells_are_the_same() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        if (!reportTagMatrix_first_column_cells.isEmpty()) {
            String firstText = reportTagMatrix_first_column_cells.get(0).getText();

            for (WebElement element : reportTagMatrix_first_column_cells) {
                String text = element.getText();
                System.out.println(text);

                // Compare each text with the first one
                softAssert.assertEquals(text, firstText, "Texts are not the same.");
            }
            // Perform a final assertion to ensure all texts are the same
            try {
                softAssert.assertAll();
                System.out.println("Copied Texts are the same");
                logger.log(LogStatus.PASS, "Copied Texts are the same");
            } catch (AssertionError e) {
                System.out.println("Copied Texts are NOT the same");
                logger.log(LogStatus.FAIL, "Copied Texts are NOT the same");
                throw e;
            }        } else {
            System.out.println("List is empty.");
        }
    }
    String generatedPortfolioName;

    @FindBy(xpath = "//textarea[@class='handsontableInput']")
    WebElement pca_portfolio_project_name_textBox;
    public void enter_pca_portfolio_project_name_textBox() throws InterruptedException {
        generatedPortfolioName =  dateOfSystem;
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, pca_portfolio_project_name_textBox, "QA_" + generatedPortfolioName, logger, "pca_portfolio_project_name_textBox");}

    @FindBy(xpath = "//div[@class='htItemWrapper']")
    WebElement copy_data_across_rows_button;
    public void click_copy_data_across_rows_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, copy_data_across_rows_button, logger, "copy_data_across_rows_button");}

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement ok_button;
    public void click_ok_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, ok_button, logger, "ok_button");}


    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirm_button;
    public void click_confirm_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, confirm_button, logger, "confirm_button");}

    @FindBy(xpath = "//a[@class='js-tagMatrixInfoTable-undo bg-color-white border-0 color-black cursor-pointer']")
    WebElement undo_button;
    public void click_undo_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, undo_button, logger, "undo_button");}

    @FindBy(xpath = "//div[@class='js-tagMatrixInfoTable-confirmModal-contentContainer flexContainer flex-column flex-align-center text-lg']")
    WebElement copy_data_confirmation_text;
    public void capture_copy_data_confirmation_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, copy_data_confirmation_text, logger, "copy_data_confirmation_text");}


    @FindBy(xpath = "//select[@id='active_view_id']")
    WebElement change_porfolio_view_dropdown_list;

    public void select_porfolio_view_default() {
            ReusableMethodsLoggersPOM.selectByText(driver, change_porfolio_view_dropdown_list, "Default View ", "Individual LH");}

    public void select_porfolio_view_individual() {
        String currentURL = driver.getCurrentUrl();
        // Check if current URL contains "staging5"
        if (currentURL.contains("staging5")) {
            ReusableMethodsLoggersPOM.selectByText(driver, change_porfolio_view_dropdown_list, "rj - pca (individual)", "rj - pca (individual)");}
        // Check if current URL contains "staging2"
        else if (currentURL.contains("staging2")) {
            ReusableMethodsLoggersPOM.selectByText(driver, change_porfolio_view_dropdown_list, "Individual LH", "Individual LH");}
    }

    public void select_porfolio_view_aggregated() {
        String currentURL = driver.getCurrentUrl();
        // Check if current URL contains "staging5"
        if (currentURL.contains("staging5")) {
            ReusableMethodsLoggersPOM.selectByText(driver, change_porfolio_view_dropdown_list, "rj - pca (aggregated)", "rj - pca (aggregated)");
        }
        // Check if current URL contains "staging2"
        else if (currentURL.contains("staging2")) {
            ReusableMethodsLoggersPOM.selectByText(driver, change_porfolio_view_dropdown_list, "Aggregated", "Aggregated");}}

    @FindBy(xpath = "//select[@id='template_filter_id']")
    WebElement filter_by_template_dropdown;

    public void select_template_dropdown_pca_elise(){
            ReusableMethodsLoggersPOM.selectByText(driver, filter_by_template_dropdown, "PCA - Elise", "template_dropdown_pca_elise");}
    public void select_template_dropdown_phase_1_esa_proposal(){
        ReusableMethodsLoggersPOM.selectByText(driver, filter_by_template_dropdown, "Phase I ESA Proposal - Non-Tiered E1527-21", "select_template_dropdown_phase_1_esa_proposal");}

    @FindBy(xpath = "//button[normalize-space()='×']")
    WebElement cancel_alert_message;

    public void click_cancel_alert_message() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancel_alert_message, logger, "cancel_alert_message");
    }

    @FindBy(xpath = "//*[text()='Dashboard']")
    WebElement dashboardTab;

    public void clickDashboardTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, dashboardTab, logger, "dashboardTab");
    }

    @FindBy(xpath = "//*[normalize-space()='Reports']")
    WebElement reportsTab;

    public void clickReportsTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportsTab, logger, "reports tab");
    }

    @FindBy(xpath = "//*[contains(text(),'All Folders')]")
    WebElement reportsTab_allFolders_dropDown;

    public void click_reportsTab_allFolders_dropDown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportsTab_allFolders_dropDown, logger, "reportsTab_allFolders_dropDown");
    }

    @FindBy(xpath = "//div[@class='dashboard-companies widget clearfix']//div[@class='widget-body']//a")
    WebElement contractor_company_link;

    public void click_contractor_company_link() {
        ReusableMethodsLoggersPOM.clickMethod(driver, contractor_company_link, logger, "contractor_company_link");
    }


    public void switchToAutomationReportTab() {
        ReusableMethodsLoggersPOM.changeTabs(driver, 1, logger, "automation report tab");
    }

    public void switchToOriginalTab() {
        ReusableMethodsLoggersPOM.changeTabs(driver, 0, logger, "Main Tab");
    }

    public void navigateTo_automation_report_HM_folder() throws InterruptedException {

//        driver.navigate().to("https://staging5.openquire.com/reports/666234");
//        driver.navigate().to("https://staging3.openquire.com/reports/1330028");

        BaseClass.staging5().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_HMReports();
         Thread.sleep(2000);
//
//        BaseClass.reportfoldersection().captureRecentReportName();
        BaseClass.reportfoldersection().clickReportsFirstLink();
        BaseClass.projectFolderSection().clickProjectFolderLink_2023QAReport();
        BaseClass.reportfoldersection().clickAutomationReport_link();
    }


    @FindBy(xpath = "//*[contains(text(),'Add Folder')]")
    WebElement addFolderButton;

    public void clickAddFolderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addFolderButton, logger, "add folder button");
    }

    @FindBy(xpath = "//*[@name='label[name]']")
    WebElement folderName;

    public void enterFolderNameField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, folderName, "QA Automation Testing Folder!", logger, "Folder name field");
    }

    @FindBy(xpath = "//*[contains(text(),'QA Automation Testing Folder')]")
    WebElement folderLink;

    public void clickFolderLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, folderLink, logger, "folder link");
    }


    @FindBy(xpath = "//*[contains(text(),'Add Project Folder')]")
    WebElement addProjectFolderButton;

    public void clickAddProjectFolderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addProjectFolderButton, logger, "add project folder button");
    }

    @FindBy(xpath = "//*[@name='project[name]']")
    WebElement projectFolderName;

    public void enterProjectFolderNameField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing Project Folder", logger, "Project Folder name field");
    }

    @FindBy(xpath = "//*[@name='project[description]']")
    WebElement projectFolderDescription;

    public void enterProjectFolderDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderDescription, "QA Automation Testing project folder Creation", logger, "project folder description field");
    }

    @FindBy(xpath = "//*[@href='#templates-tab-content']")
    WebElement projectFolderTemplatesTab;

    public void clickProjectFolder_TemplatesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolderTemplatesTab, logger, " project folder templates tab");
    }

    @FindBy(xpath = "(//input[@id='unassigned_items_search'])[2]")
    WebElement projectFolder_Template_SearchField;

    public void enterProjectFolder_Template_SearchField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolder_Template_SearchField, "QA", logger, "project folder-template search field ");}

    public void enter_quire_CA_ProjectFolder_Template_SearchField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolder_Template_SearchField, "Quire ESA Condition Action", logger, "quire ESA Condition Action");}

    public void clear_package_SearchField() {
        ReusableMethodsLoggersPOM.clearMethod(driver, projectFolder_Template_SearchField, logger, "quire ESA Condition Action");
        ReusableMethodsLoggersPOM.submitMethod(driver, projectFolder_Template_SearchField, logger, "quire ESA Condition Action");


    }

    @FindBy(xpath = "//*[contains(text(),'QA Automation Testing Template')]")
    WebElement projectFolder_QATemplate;

    public void clickQATemplate_projectFolder_templatesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_QATemplate, logger, "QA template");
    }

    @FindBy(xpath = "(//*[@data-action='add'])[2]")
    WebElement projectFolder_AddTemplateButton;

    public void clickProjectFolder_AddTemplateButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_AddTemplateButton, logger, "Project Folder Add template button");
    }


    @FindBy(xpath = "//*[contains(text(),'QA Automation Testing Project Folder')]")
    WebElement projectFolderLink;

    public void clickProjectFolderLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolderLink, logger, "project folder link");
    }


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
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing Template", logger, "template name field");
    }

    @FindBy(xpath = "//select[@class='form-control']")
    WebElement templateTypeDropdown;

    public void selectTemplateTypeDropdown() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, templateTypeDropdown, 1, logger, "templateTypeDropdown");
    }

    @FindBy(xpath = "(//*[@placeholder='Choose a System Label'])[2]")
    WebElement templateLabelDropdown;

    public void clickTemplateLabelDropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateLabelDropdown, logger, "template label dropdown button");
    }

    //  @FindBy(xpath = "(//*[text()='General Other'])[7]")
    // @FindBy(xpath = "(//*[text()='General Other' and @data-value='15'])[4]")
    @FindBy(xpath = "//div[@class='optgroup']//div[@class='option'][normalize-space()='General Other']")
    WebElement templateLabel_GeneralOther;

    public void clickTemplateLabel_GeneralOther() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateLabel_GeneralOther, logger, "template label - General Other");
//Thread.sleep(2000);
        // ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateLabel_GeneralOther, "General Other" , logger, "template label - General Other");
    }

    @FindBy(xpath = "//*[@name='template[description]']")
    WebElement templateDescription;

    public void enterTemplateDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateDescription, "QA Automation Testing Template Creation!", logger, "template description field");
    }


    @FindBy(xpath = "//*[normalize-space()='Shared Reports']")
    WebElement sharedReportsTab;

    public void clickSharedReportsTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sharedReportsTab, logger, "shared Reports Tab ");
    }

    @FindBy(xpath = "//a[contains(text(),'Shared with Contractors')]")
    WebElement sharedReportsTab_with_contractors_dropdown;

    public void clicksharedReportsTab_with_contractors_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sharedReportsTab_with_contractors_dropdown, logger, "sharedReportsTab_with_contractors_dropdown");
    }


    @FindBy(xpath = "//a[contains(text(),'Emails')]")
    WebElement pdf_link_emails_tab;

    public void click_pdf_link_emails_tab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, pdf_link_emails_tab, logger, "PDF Link Emails Tab ");
    }

    @FindBy(xpath = "//span[contains(text(),'Libraries')]")
    WebElement librariesTab;

    public void clickLibrariesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, librariesTab, logger, "Libraries tab button");
    }

    @FindBy(xpath = "//a[text()='WordBank']")
    WebElement librariesTab_wordBankDropdown;
    public void click_librariesTab_wordBankDropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, librariesTab_wordBankDropdown, logger, "libraries Tab - Word Bank Dropdown ");}

    @FindBy(xpath = "//a[text()='Cost Recommendations']")
    WebElement librariesTab_costRec_Dropdown;
    public void click_librariesTab_costRec_Dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, librariesTab_costRec_Dropdown, logger, "librariesTab_costRec_Dropdown");}

    @FindBy(xpath = "//input[@placeholder='Filter by Labels...']")
    WebElement filter_by_labels_search_field;
    public void click_filter_by_labels_search_field() {
        ReusableMethodsLoggersPOM.clickMethod(driver, filter_by_labels_search_field, logger, "filter_by_labels_search_field");}

    @FindBy(xpath = "//div[normalize-space()='alan']")
    WebElement filter_by_labels_alan_dropdown;
    public void     click_filter_by_labels_alan_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, filter_by_labels_alan_dropdown, logger, "filter_by_labels_alan_dropdown");}

    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback' and contains(text(), '0 results')]")
    WebElement filter_by_labels_no_results;
    public void verify_filter_has_0_results() {
        ReusableMethodsLoggersPOM.clickMethod(driver, filter_by_labels_no_results, logger, "filter_by_labels_no_results");}

    @FindBy(xpath = "(//a[@title='Remove'][normalize-space()='×'])[1]")
    WebElement remove_first_label;
    public void click_remove_first_label() {
        ReusableMethodsLoggersPOM.clickMethod(driver, remove_first_label, logger, "remove_first_label");}

    @FindBy(xpath = "//a[normalize-space()='587']")
    WebElement cost_rec_alan_label_587;
    @FindBy(xpath = "//a[normalize-space()='aallaann']")
    WebElement cost_rec_alan_label_aallaann;
    public void verify_cost_rec_alan_label_587() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, cost_rec_alan_label_587, true, logger, "cost_rec_alan_label_587");}
    public void verify_cost_rec_alan_label_name() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, cost_rec_alan_label_aallaann, true, logger, "cost_rec_alan_label_aallaann");}


    @FindBy(xpath = "//input[@id='tag-matrix-search']")
    WebElement searchField;

    public void enter_587_cost_rec_searchField() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField, "587", logger, "587");
    }

    @FindBy(xpath = "//div[@class='option active']")
    WebElement filter_by_labels_first_dropdown;
    public void     click_filter_by_labels_first_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, filter_by_labels_first_dropdown, logger, "filter_by_labels_first_dropdown");}

    @FindBy(xpath = "//a[text()='SmartTable Dropdown Values']")
    WebElement librariesTab_smartTableValues_Dropdown;
    public void click_librariesTab_smartTableValues_Dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, librariesTab_smartTableValues_Dropdown, logger, "librariesTab_smartTableValues_Dropdown");}

    @FindBy(xpath = "//div[@class='persistent-notification unread']//a[contains(text(), 'keyword_definition') and contains(text(), '.xlsx')]")
    WebElement ST_dropdownvalue_excel_file_generated;
    public void verify_ST_dropdownvalue_excel_file_generated() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, ST_dropdownvalue_excel_file_generated, true, logger, "ST_dropdownvalue_excel_file_generated");}






    @FindBy(xpath = "//tr/td[@class='htLeft q-readonly' and position()=1]")
    List <WebElement> wordbank_items_filtered;

    public void delete_QA_WB_items() throws InterruptedException {
        // Click on each element
        if (!wordbank_items_filtered.isEmpty()) {
            for (WebElement element : wordbank_items_filtered) {
            element.click();
            Thread.sleep(500);
        }
            BaseClass.reportfoldersection().click_delete_selected_items();
            Thread.sleep(500);
            driver.switchTo().alert().accept();



        } else {
        System.out.println("No links found.");
    }}
    @FindBy(xpath = "//span[contains(text(),'Settings')]")
    WebElement settingsTab;

    public void clickSettingsTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, settingsTab, logger, "Settings tab button");
    }

    @FindBy(xpath = "//a[text()='PDF File Name Formats']")
    WebElement settingsTab_pdf_filenameformat_dropdownItem;

    public void click_settingsTab_pdf_filenameformat_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, settingsTab_pdf_filenameformat_dropdownItem, logger, "Settings Tab - PDF Formats Dropdown ");
    }

    @FindBy(xpath = "//div[@class='report-search-container']")
    WebElement find_a_report_global_field;


    public void click_report_global_search_field() {
        ReusableMethodsLoggersPOM.clickMethod(driver, find_a_report_global_field, logger, "find_a_report_global_field");
    }

    @FindBy(xpath = "//li[@id='global-report-search-nav-item']")
    WebElement find_a_report_global_field3;

    public void click_report_global_search_field3() {
        ReusableMethodsLoggersPOM.clickMethod(driver, find_a_report_global_field3, logger, "find_a_report_global_field3");
    }

    @FindBy(xpath = "//i[@class='fa fa-search fa-lg']")
    WebElement find_a_report_global_field2;

    public void click_report_global_search_field2() {
        ReusableMethodsLoggersPOM.clickMethod(driver, find_a_report_global_field2, logger, "find_a_report_global_field2");
    }

    @FindBy(xpath = "//input[@placeholder='Find a report...']")
    WebElement find_a_report_global_search_field;

    public void enter_report_global_search_field() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, find_a_report_global_search_field, logger, "find_a_report_global_field2");
        Thread.sleep(1500);
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, find_a_report_global_search_field, "Automation Report", logger, "find_a_report_global_search_field");
    }

    @FindBy(xpath = "(//table[@class='htCore'])[1]")
    WebElement global_search_field_results;

    public void capture_global_search_field_results() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, global_search_field_results,  logger, "global_search_field_results");
    }


    @FindBy(xpath = "//a[normalize-space()='Automation Report']")
    WebElement automation_report_link;

    public void click_automation_report_link() {
        ReusableMethodsLoggersPOM.clickMethod(driver, automation_report_link, logger, "automation_report_link");
    }


    @FindBy(xpath = "//i[@class='fa fa-bell fa-lg']")
    // and text()='1'
    WebElement notification_button;

    public void click_notification_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, notification_button, logger, "notification_button");
    }

    @FindBy(xpath = "//a[@id='persistent-notifications-link'][//span[@class='noty-manager-bubble' and normalize-space(text()) != '0']]")
    // and text()='1'
    WebElement active_notification_button;
    public void click_active_notification_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, active_notification_button, logger, "active_notification_button");}

    @FindBy(xpath = "//a[@id='persistent-notifications-link'][//span[@class='noty-manager-bubble' and normalize-space(text()) != '0']]")
    // and text()='1'
    WebElement active_notification_visible;
    public void verify_active_notification_button() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, active_notification_visible,true, logger, "active_notification_visible");}

    @FindBy(xpath = "//span[@class='async-fetch-status-display js-async-fetch-status-display' and contains(text(),'100%')]")
    // and text()='1'
    WebElement fetching_company_data_message;
    public void verify_loading_complete_sideBar() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, fetching_company_data_message,true, logger, "loading_sideBar");}

    public void verify_and_markRead_if_notification_is_active() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = null;
        try {
            // Wait for the active notification button to be visible
            element = wait.until(ExpectedConditions.visibilityOf(active_notification_button));

            // If the notification is displayed, perform actions
            BaseClass.staging5().click_active_notification_button();
            Thread.sleep(500);  // Pause to allow for interactions (can be replaced with waits)
            BaseClass.staging5().mark_all_as_read();
            Thread.sleep(500);  // Pause to allow for interactions (can be replaced with waits)
            BaseClass.staging5().click_notification_button();
            Thread.sleep(500);  // Pause to allow for interactions (can be replaced with waits)

        } catch (TimeoutException e) {
            // Handle the case where the element is not found within the timeout
            System.out.println("Notification element not found, no action taken.");
        } catch (NoSuchElementException e) {
            // Handle case where the element is not found in the DOM
            System.out.println("No active notification found, no action taken.");
        } catch (InterruptedException e) {
            // Handle interruption exceptions
            e.printStackTrace();
            Thread.currentThread().interrupt();  // Restore interrupted status
        }
    }




    @FindBy(xpath = "//div[@class='persistent-notification unread']//a[@target='_blank'][normalize-space()='QA Automation PCA Portfolio'][1]")
    WebElement first_active_notification_link;
    public void open_pca_portfolio_pdf_notification_link() throws InterruptedException {
        ReusableMethodsLoggersPOM.open_href_attribute_link(driver, first_active_notification_link, logger, "first_active_notification_link");}


    @FindBy(xpath = "//div[@class='persistent-notification unread']//a[@target='_blank'][normalize-space()='Jen Test']")
    WebElement jenTest_active_notification_link;
    public void open_jenTest_pdf_notification_link() throws InterruptedException {
        ReusableMethodsLoggersPOM.open_href_attribute_link(driver, jenTest_active_notification_link, logger, "first_active_notification_link");}

    @FindBy(xpath = "//div[@class='persistent-notification unread']//a[contains(normalize-space(), 'company_usage_reports')]")
    WebElement company_usage_reports_link;
    public void open_company_usage_reports_link() throws InterruptedException {
        ReusableMethodsLoggersPOM.open_href_attribute_link(driver, company_usage_reports_link, logger, "company_usage_reports_link");}
    @FindBy(xpath = "//div[@class='persistent-notification unread']")
    WebElement unread_notification;
    public void capture_unread_notification() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, unread_notification, logger, "unread_notification");
    }

    @FindBy(xpath = "//div[@class='persistent-notification unread']//td[contains(text(), 'Excel file generated:')]")
    WebElement unread_excel_notification;
    public void verify_unread_excel_notification() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, unread_excel_notification, logger, "unread_excel_notification");
    }

    @FindBy(xpath = "//div[@class='persistent-notification unread']//a[contains(text(), 'info_table_section')]")
    WebElement unread_ST_excel_file;
    public void verify_unread_ST_excel_file() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unread_ST_excel_file,true,  logger, "unread_notification");
    }

    @FindBy(xpath = "//a[normalize-space()='Export Complete']")
    WebElement export_complete;

    @FindBy(xpath = "//div[@class='target-container']//span[@class='view-source']")
    WebElement target_report_view_link;
public void click_target_report_view_link() {
    ReusableMethodsLoggersPOM.clickMethod(driver, target_report_view_link, logger, "target_report_view_link");
}



    public void confirm_export_1_unread_notification() {

        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, export_complete,true,  logger, "export_complete");


        String export_1_message = ReusableMethodsLoggersPOM.saveTextMethod(driver, unread_notification, logger, "unread_notification");

        if (browserName.contains("Chrome")) {


        if (export_1_message.contains("Export from QA Automation Testing Cloned Medium Priority Template-Chrome to QA Automation Testing New Updated Medium Priority Template-Chrome completed successfully")) {
            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "Export from Cloned Medium Priority Template to New Updated Medium Priority Template completed ");
            System.out.println("Export from Cloned Medium Priority Template to New Updated Medium Priority Template completed ");
        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "Unable to see notification for - Export from Cloned Medium Priority Template to New Updated Medium Priority Template");
            System.out.println("Unable to see notification for - Export from Cloned Medium Priority Template to New Updated Medium Priority Template");

            // Optionally, fail the test or take other actions
        }
        } else if (browserName.contains("Firefox")) {
            if (export_1_message.contains("Export from QA Automation Testing Cloned Medium Priority Template-Firefox to QA Automation Testing New Updated Medium Priority Template-Firefox completed successfully")) {
                // Log success if all conditions are met
                logger.log(LogStatus.PASS, "Export from Cloned Medium Priority Template to New Updated Medium Priority Template completed ");
                System.out.println("Export from Cloned Medium Priority Template to New Updated Medium Priority Template completed ");
            } else {
                // Log failure if any condition is not met
                logger.log(LogStatus.FAIL, "Unable to see notification for - Export from Cloned Medium Priority Template to New Updated Medium Priority Template");
                System.out.println("Unable to see notification for - Export from Cloned Medium Priority Template to New Updated Medium Priority Template");

                // Optionally, fail the test or take other actions
            }
        }
        }

    public void confirm_export_2_unread_notification() {
        String export_2_message = ReusableMethodsLoggersPOM.saveTextMethod(driver, unread_notification, logger, "unread_notification");
        if (browserName.contains("Chrome")) {

            if (export_2_message.contains("Export from QA Automation Testing Cloned Medium Priority Template-Chrome to QA Medium Priority Test Report-Chrome completed successfully")) {
                // Log success if all conditions are met
                logger.log(LogStatus.PASS, "Export from Cloned Medium Priority Template to Medium Priority Report completed ");
                System.out.println("Export from Cloned Medium Priority Template to  Medium Priority Report completed ");
            } else {
                // Log failure if any condition is not met
                logger.log(LogStatus.FAIL, "Unable to see notification for - Export from Cloned Medium Priority Template to Medium Priority Report ");
                System.out.println("Unable to see notification for - Export from Cloned Medium Priority Template to Medium Priority Report");// Optionally, fail the test or take other actions
            }

        } else if (browserName.contains("Firefox")) {
            if (export_2_message.contains("Export from QA Automation Testing Cloned Medium Priority Template-Firefox to QA Medium Priority Test Report-Firefox completed successfully")) {
                // Log success if all conditions are met
                logger.log(LogStatus.PASS, "Export from Cloned Medium Priority Template to Medium Priority Report completed ");
                System.out.println("Export from Cloned Medium Priority Template to  Medium Priority Report completed ");
            } else {
                // Log failure if any condition is not met
                logger.log(LogStatus.FAIL, "Unable to see notification for - Export from Cloned Medium Priority Template to Medium Priority Report ");
                System.out.println("Unable to see notification for - Export from Cloned Medium Priority Template to Medium Priority Report");// Optionally, fail the test or take other actions
            }

        }
    }

    public void confirm_export_3_unread_notification() {
        String export_3_message = ReusableMethodsLoggersPOM.saveTextMethod(driver, unread_notification, logger, "unread_notification");

        if (browserName.contains("Chrome")) {

            if (export_3_message.contains("Export from QA Automation PCA Test Report-Chrome to QA Medium Priority Test Report-Chrome completed successfully")) {
            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "Export from PCA Test Report to Medium Priority  Report completed successfully completed ");
            System.out.println("Export from PCA Test Report to Medium Priority  Report completed successfully completed ");
        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "Unable to see notification for - Export from PCA Test Report to Medium Priority  Report");
            System.out.println("Unable to see notification for - Export from PCA Test Report to Medium Priority  Report");}

        } else if (browserName.contains("Firefox")) {

            if (export_3_message.contains("Export from QA Automation PCA Test Report-Firefox to QA Medium Priority Test Report-Firefox completed successfully")) {
                // Log success if all conditions are met
                logger.log(LogStatus.PASS, "Export from PCA Test Report to Medium Priority  Report completed successfully completed ");
                System.out.println("Export from PCA Test Report to Medium Priority  Report completed successfully completed ");
            } else {
                // Log failure if any condition is not met
                logger.log(LogStatus.FAIL, "Unable to see notification for - Export from PCA Test Report to Medium Priority  Report");
                System.out.println("Unable to see notification for - Export from PCA Test Report to Medium Priority  Report");
            }

        }
        }


    @FindBy(xpath = "//a[@id='persistent-notifications-mark-all-read-action']")
    WebElement mark_all_as_read;

    public void mark_all_as_read() {
        ReusableMethodsLoggersPOM.clickMethod(driver, mark_all_as_read, logger, "mark_all_as_read");
    }

    public void mark_all_notifications_as_read() throws InterruptedException {
        BaseClass.staging5().click_notification_button();
        Thread.sleep(1000);
        BaseClass.staging5().mark_all_as_read();
        Thread.sleep(1000);
        BaseClass.staging5().click_notification_button();
        Thread.sleep(500);

        return;


    }

    @FindBy(xpath = "//span[contains(text(),'Users')]")
    WebElement usersTab;

    public void clickUsersTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, usersTab, logger, "users tab button");
    }

    @FindBy(xpath = "//a[text()='Company Users']")
    WebElement usersTab_companyUsers_dropdownItem;

    public void click_usersTab_companyUsers_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, usersTab_companyUsers_dropdownItem, logger, "Users Tab - Company Users Dropdown ");
    }

    @FindBy(xpath = "//a[normalize-space()='Export PDF']")
    WebElement export_pdf_button;

    public void click_export_pdf_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_pdf_button, logger, "export_pdf_button ");
    }

    @FindBy(xpath = "//a[normalize-space()='Export Excel']")
    WebElement export_to_excel_fm1105_button;

    public void click_export_to_excel_fm1105() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_to_excel_fm1105_button, logger, "export_to_excel_button ");
    }

    @FindBy(xpath = "//a[normalize-space()='Export to Excel']")
    WebElement export_to_excel_button;

    public void click_export_to_excel() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_to_excel_button, logger, "export_to_excel_button ");
    }

    @FindBy(xpath = "//a[normalize-space()='Add Company User']")
    WebElement add_company_user;

    public void click_add_company_user() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_company_user, logger, "add_company_user ");
    }

    @FindBy(xpath = "//input[@id='company_user_user_attributes_name']")
    WebElement company_user_name_field;

    public void enter_company_user_name_field() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, company_user_name_field, "QA Dummy User-Chrome", logger, "company_user_name_field ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, company_user_name_field, "QA Dummy User-Firefox", logger, "company_user_name_field ");
        }}

    public void create_10_company_users_jmeter() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            BaseClass.staging5().click_add_company_user();
            Thread.sleep(500);
        // Construct username
        String username = "Jmeter_User_" + i;
        // Enter username
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, company_user_name_field, username, logger, "jmeter_user_name_field");
        // Construct email
        String email = username + "@test.com";
        // Enter email
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, company_user_email_field, email, logger, "company_user_email_field");
            BaseClass.staging5().enter_company_user_pw_field();
            BaseClass.staging5().enter_company_user_pw_confirmation_field();
            Thread.sleep(500);
            BaseClass.staging5().select_company_user_permission_level_editor();
            Thread.sleep(1000);
            BaseClass.staging5().clickSave();
            Thread.sleep(1000);
    }
    }



    @FindBy(xpath = "//h2[normalize-space()='Quire Help Center']")
    WebElement email_support_popup_header;
    @FindBy(xpath = "//iframe[@id='widget-frame']")
    WebElement email_support_iframe;
    @FindBy(xpath = "//div[@class='app-support js-app-support']")
    WebElement email_support_button;

    public void confirm_email_support_button() {

        ReusableMethodsLoggersPOM.clickMethod(driver, email_support_button, logger, "email_support_button ");
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, email_support_iframe, logger, "email_support_iframe ");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, email_support_popup_header, logger, "Email Support Window - Title Header: ");
        driver.switchTo().parentFrame();
        ReusableMethodsLoggersPOM.clickMethod(driver, email_support_button, logger, "minimize_email_support_button");
    }

    @FindBy(xpath = "//button[@aria-label='Minimize window']")
    WebElement minimize_chat_support_window;
    @FindBy(xpath = "//h1[text()='Quire Chat Support']")
    WebElement chat_support_popup_header;
    @FindBy(xpath = "//iframe[@id='chat-widget']")
    WebElement chat_support_iframe;
    @FindBy(xpath = "//div[normalize-space()='']//a[@href='#']")
    WebElement chat_support_button;

    public void confirm_chat_support_button() {

        ReusableMethodsLoggersPOM.clickMethod(driver, chat_support_button, logger, "chat_support_button ");
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, chat_support_iframe, logger, "chat_support_iframe ");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, chat_support_popup_header, logger, "Chat Support Window - Title Header: ");
        ReusableMethodsLoggersPOM.clickMethod(driver, minimize_chat_support_window, logger, "minimize_chat_support_window ");

        driver.switchTo().parentFrame();

    }


    @FindBy(xpath = "//div[@class='app-viewTrash']")
    WebElement view_trash_button;

    @FindBy(xpath = "//div[@class='app-footer-group']")
    WebElement ask_quire_button;

    public void click_view_trash_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ask_quire_button, logger, "ask_quire_button");

        ReusableMethodsLoggersPOM.clickMethod(driver, view_trash_button, logger, "view_trash_button");
    }

    @FindBy(xpath = "//td[@class='htLeft q-readonly pinnedItems-iconContainer']")
    WebElement pinned_item;
    @FindBy(xpath = "(//i[@class='fa fa-thumb-tack fa-lg'])[2]")
    WebElement second_portfolio_Pin_icon;

    public void click_second_pinned_Item_portfolios() {
        ReusableMethodsLoggersPOM.clickMethod(driver, second_portfolio_Pin_icon, logger, "second_portfolio_Pin_icon");
    }


    @FindBy(xpath = "//i[@class='fa fa-thumb-tack fa-lg']")
    List<WebElement> pin_button;

    public void click_all_pin_icons() throws InterruptedException {
        int pin_icon_count = pin_button.size();
        for (int i = 0; i < pin_icon_count/2; i++) {
            ReusableMethodsLoggersPOM.clickMethod(driver, pin_button.get(i), logger, "pin_button at index: " + i);
            Thread.sleep(500);

        }
    }


    @FindBy(xpath = "//div[@class='widget dashboard-reports dashboard-reports-edited js-dashboard-reports']//div[@class='widget-body js-widget-body']")
    WebElement recentlyEditedReport_dashboard_data;

    public void capture_recentlyEditedReports_dashboard() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, recentlyEditedReport_dashboard_data, logger, "recentlyEditedReport_dashboard_data");
    }

    @FindBy(xpath = "//div[@class='dashboard-projects widget clearfix']//div[@class='widget-body']")
    WebElement recentProjects_dashboard_data;

    public void capture_recentProjects_dashboard_data() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, recentProjects_dashboard_data, logger, "recentProjects_dashboard_data");
    }

    @FindBy(xpath = "//i[@class='fa fa-angle-right fa-lg fa-fw']")
    WebElement tip_dashboard_right_arrow;

    @FindBy(xpath = "//span[@class='widget-title-text js-widget-title-text']")
    WebElement tip_dashboard_header_data;

    public void capture_tip_dashboard_header_data() throws InterruptedException {
        //   WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

        for (int i = 1; i < 7; i++) {
            ReusableMethodsLoggersPOM.captureTextMethod(driver, tip_dashboard_header_data, logger, "Dashboard Tip: " + i);
            tip_dashboard_right_arrow.click();
            //  wait.until(ExpectedConditions.elementToBeClickable(tip_dashboard_right_arrow)).click();
            // Thread.sleep(200);
            //  ReusableMethodsLoggersPOM.clickMethod(driver, pinned_icon_dashboard, logger, "pinned_icon_dashboard");

            // System.out.println(tip_dashboard_header_data.getText());
            Thread.sleep(200);

        }
    }

    @FindBy(xpath = "//div[@class='widget dashboard-stats']//ul[@class='widget-list']")
    WebElement myQuireStats_dashboard_data;

    public void capture_myQuireStats_dashboard_data() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, myQuireStats_dashboard_data, logger, "myQuireStats_dashboard_data ");
    }

    @FindBy(xpath = "//a[@class='btn btn-highlight']")
    WebElement edit_profile_dashboard_button;

    public void click_edit_profile_dashboard_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, edit_profile_dashboard_button, logger, "edit_profile_dashboard_button ");
    }

    @FindBy(xpath = "//a[normalize-space()='Cancel']")
    WebElement cancelButton_profile;
    public void click_cancelButton_profile() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancelButton_profile, logger, "cancelButton_profile");}
    @FindBy(xpath = "//button[@class='btn btn-link cancel-link']")
  WebElement cancelButton_popup;
    public void clickCancel() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancelButton_popup, logger, "cancel button");}


    String className = this.getClass().getSimpleName();
    DateFormat formatDate = new SimpleDateFormat("(MM_dd_yyyy_HH_mm_ss)");
    DateFormat formatTime = new SimpleDateFormat("MM_dd_yyyy");
    Date systemDate = new Date();
    String dateOfSystem = formatDate.format(systemDate);
    String timeOfSystem = formatTime.format(systemDate);

    @FindBy(xpath = "//input[@id='company_user_user_attributes_email']")
    WebElement company_user_email_field;

    public void enter_company_user_email_field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, company_user_email_field, "QAdummyuser" + dateOfSystem + "@quiretest.com", logger, "company_user_email_field ");
    }

    @FindBy(xpath = "//input[@id='company_user_user_attributes_password']")
    WebElement company_user_password_field;

    public void enter_company_user_pw_field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, company_user_password_field, "testing321", logger, "company_user_password_field ");
    }


    @FindBy(xpath = "//input[@id='company_user_user_attributes_password_confirmation']")
    WebElement company_user_password_confirmation_field;

    public void enter_company_user_pw_confirmation_field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, company_user_password_confirmation_field, "testing321", logger, "company_user_password_confirmation_field ");
    }

    @FindBy(xpath = "//select[@id='company_user_permission_level']")
    WebElement company_user_permission_level;

    public void select_company_user_permission_level() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, company_user_permission_level, 2, logger, "company_user_permission_level ");
    }
    public void select_company_user_permission_level_editor() {
        ReusableMethodsLoggersPOM.selectByText(driver, company_user_permission_level, "Editor","company_user_permission_level_editor");
    }

    @FindBy(xpath = "//a[text()='Contractors']")
    WebElement usersTab_contractors_dropdownItem;

    public void click_usersTab_contractors_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, usersTab_contractors_dropdownItem, logger, "Users Tab - Contractors Dropdown ");
    }


    @FindBy(xpath = "//*[text()='98070987']")
    WebElement folder;


    public void clickFolder() {
        ReusableMethodsLoggersPOM.clickMethod(driver, folder, logger, "folder button");
    }

    @FindBy(xpath = "//*[text()='072521']")
    WebElement project;

    public void clickProject() {
        ReusableMethodsLoggersPOM.clickMethod(driver, project, logger, "project button");
    }


    @FindBy(xpath = "//*[contains(text(),'Add Report')]")
    WebElement addReportButton;

    public void clickAddReportButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addReportButton, logger, "reports tab button");
    }

    @FindBy(xpath = "//*[@name='report[name]']")
    WebElement reportNameField;

    public void enterReportNameField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation Testing Report", logger, "report name field");
    }

    @FindBy(xpath = "//*[@name='report[description]']")
    WebElement reportDescriptionField;

    public void enterReportDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportDescriptionField, "QA Automation Test Report Creation task!", logger, "report description field");
    }

    @FindBy(xpath = "//i[@class='fa fa-angle-down fa-lg']")
    WebElement reportTemplateDropdown;

    public void clickReport_TemplateDropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportTemplateDropdown, logger, "template dropdown button");
    }

    //@FindBy(xpath = "//*[contains(text(),'PCA Fannie Mae')]")
    @FindBy(xpath = "//*[@class='list-group-item']")
    WebElement firstDropDown;

    public void clickDropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, firstDropDown, logger, "first dropdown item");
    }

    @FindBy(xpath = "//*[@value='Save']")
    WebElement saveButton;

    public void clickSave() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveButton, logger, "save button");
    }


    @FindBy(xpath = "//*[@class='alert alert-notice']")
    WebElement alertMessage;

    public void captureAlertMessage() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, alertMessage, logger, "alert message ");
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


    @FindBy(xpath = "//*[@class='edit-link-text']")
    WebElement recentReportName;

    public void captureRecentReportName() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, recentReportName, logger, "recent report name ");
        System.out.println("\n" + "Report name: " + result);
    }


    @FindBy(xpath = "//h1[contains(text(),'dashboard')]")
    WebElement dashboardName;

    public void captureURL() {
        WebDriver driver = getDriver();

        String strUrl = driver.getCurrentUrl();
        String title2 = driver.getTitle();
        System.out.println("\n" + "Current Url:  " + strUrl);
        System.out.println("\n" + "Current Page:  " + title2 + "\n");
        logger.log(LogStatus.PASS, "Current Url is:     " + strUrl + "\n");

        logger.log(LogStatus.PASS, "Current Page is:    " + title2 + "\n");

        // ReusableMethodsLoggersPOM.captureTextMethod(driver, dashboardName, logger, "dashboardName");

    }

    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_template_items;

    public void capture_number_of_template_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_template_items, logger, "Number of templates");
    }

    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_portfolio_items;

    public void capture_number_of_portfolio_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_portfolio_items, logger, "Number of portfolios");
    }

    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_PDFLinkEMails_items;

    public void capture_number_of_PDFLinkEMails_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_PDFLinkEMails_items, logger, "Number of PDF Link Emails");
    }


    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_wordBank_items;

    public void capture_number_of_wordBank_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_wordBank_items, logger, "Number of WordBank Items");}


    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_pdf_file_name_formats_items;

    public void capture_number_of_pdf_file_name_formats_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_pdf_file_name_formats_items, logger, "Number of PDF File Name Formats");
    }

    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_companyUsers;

    public void capture_number_of_companyUsers_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_companyUsers, logger, "Number of Company Users");
    }

    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_contractors;

    public void capture_number_of_contractors_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_contractors, logger, "Number of Contractors ");
    }


    @FindBy(xpath = "//span[contains(text(),'Danielle')]")
    WebElement danielles_portfolio;

    public void clickDanielles_portfolio() {
        ReusableMethodsLoggersPOM.clickMethod(driver, danielles_portfolio, logger, "danielles portfolio");
    }

    @FindBy(xpath = "//input[@id='company_user_user_attributes_password' and @disabled='disabled']")
    WebElement locked_password_field;

    @FindBy(xpath = "//input[@id='company_user_user_attributes_password_confirmation' and @disabled='disabled']")
    WebElement locked_password_confirmation_field;

    @FindBy(xpath = "//input[@id='company_user_permission_level' and @disabled='disabled']")
    WebElement locked_permission_level_field;

    public void verify_locked_companyUser_fields() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, locked_password_field,true, logger, "locked_password_field ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, locked_password_confirmation_field,true, logger, "locked_password_confirmation_field ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, locked_permission_level_field,true, logger, "locked_permission_level_field ");}


    @FindBy(xpath = "//select[@id='company_user_status']")
    WebElement company_user_status;
    public void select_company_user_status() {
        ReusableMethodsLoggersPOM.selectByText(driver, company_user_status, "Inactive", "company_user_status ");}

    @FindBy(xpath = "(//span[@role='presentation'][normalize-space()='Created'])[2]")
    WebElement created_filter_button;

    public void click_created_filter_button_twice() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, created_filter_button, logger, "created_filter_button ");
        Thread.sleep(2500);
        ReusableMethodsLoggersPOM.clickMethod(driver, created_filter_button, logger, "created_filter_button ");

    }
    @FindBy(xpath = "//*[normalize-space()='QA Dummy User-Chrome']")
    WebElement qa_dummy_user_link_chrome;

    @FindBy(xpath = "//*[normalize-space()='QA Dummy User-Firefox']")
    WebElement qa_dummy_user_link_ff;
    public void click_qa_dummy_user_link() throws InterruptedException {
//        try {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, qa_dummy_user_link_chrome, logger, "qa_dummy_user_link ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, qa_dummy_user_link_ff, logger, "qa_dummy_user_link ");
        }
//        } catch (Exception e) {
//            driver.navigate().refresh();
//            ReusableMethodsLoggersPOM.clickMethod(driver, searchFieldButton, logger, "searchFieldButton ");
//            Thread.sleep(1500);
//            String searchText = browserName.contains("Chrome") ? "QA Dummy User-Chrome" : "QA Dummy User-Firefox";
//
//            for (char c : searchText.toCharArray()) {
//                String s = String.valueOf(c);
//                searchFieldButton.sendKeys(s);
//                Thread.sleep(100); // Mimic human typing
//            }
//            Thread.sleep(3000);
//            // Fire a real ENTER key event via JavaScript (works for most web apps)
//            ((JavascriptExecutor) driver).executeScript(
//                    "arguments[0].dispatchEvent(new KeyboardEvent('keydown', {key: 'Enter', code: 'Enter', which: 13, keyCode: 13, bubbles: true}));",
//                    searchFieldButton
//            );
//            ((JavascriptExecutor) driver).executeScript(
//                    "arguments[0].dispatchEvent(new KeyboardEvent('keyup', {key: 'Enter', code: 'Enter', which: 13, keyCode: 13, bubbles: true}));",
//                    searchFieldButton
//            );
//            // Optionally, add an explicit wait here for results
//
////
//            Thread.sleep(3000);
//            ReusableMethodsLoggersPOM.submitMethod(driver, searchFieldButton, logger, "company users - search field");
//
////        searchFieldButton.sendKeys("\n");
//            searchFieldButton.sendKeys(Keys.RETURN);
//            searchFieldButton.sendKeys(Keys.ENTER);
//            Thread.sleep(5000);
//            ReusableMethodsLoggersPOM.clickMethod(driver, qa_dummy_user_link, logger, "qa_dummy_user_link ");
//
////
//            //  ReusableMethodsLoggersPOM.clickMethod(driver, searchFieldButton, logger, "company users - search field");
//
//            //   ReusableMethodsLoggersPOM.submitMethod(driver, searchFieldButton, logger, "company users - search field");
//
//
//        }
    }



    @FindBy(xpath = "//span[contains(text(),'Firestone')]")
    WebElement firestone_report_danielles_portfolio;

    public void click_firestone_report_danielles_portfolio() {
        ReusableMethodsLoggersPOM.clickMethod(driver, firestone_report_danielles_portfolio, logger, " firestone report - danielles portfolio");
    }

    @FindBy(xpath = "//body/header[@class='app-header']/nav[@class='nav-subheader clearfix']/ul[1]")
    WebElement reportLocation;

    public void capture_current_report_location() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, reportLocation, logger, "Current Report location -> ");
    }


    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement number_of_shared_reports_items;

    public void capture_number_of_sharedReports_items() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, number_of_shared_reports_items, logger, "Number of Shared Reports");
    }

    @FindBy(xpath = "//table[@class='htCore']//tbody//tr")
    WebElement recent_row_Information;

    public void capture_recent_row_Information() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, recent_row_Information, logger, "Most Recent Details:");
    }


    @FindBy(xpath = "//span[@class='edit-link-text']")
    WebElement recent_SharedReport_Link;

    public void clickRecentSharedReportLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, recent_SharedReport_Link, logger, "Recent Shared Report Link");
    }


    @FindBy(xpath = "//nav[@class='nav-header']")
    WebElement userProfileTab;

    public void clickUserProfileTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, userProfileTab, logger, "userProfile Tab ");
    }

    @FindBy(xpath = "//a[normalize-space()='Edit Profile']")
    WebElement userProfileTab_editProfile_dropdownItem;

    public void click_userProfileTab_editProfile_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, userProfileTab_editProfile_dropdownItem, logger, "User Profile Tab - Edit Profile Dropdown ");
    }

    @FindBy(xpath = "//a[@id='stamps_tab']")
    WebElement editProfile_stamps_tab;

    public void click_stamps_tab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, editProfile_stamps_tab, logger, "editProfile_stamps_tab ");
    }

    @FindBy(xpath = "//button[normalize-space()='Add Stamp']")
    WebElement add_stamp_button;

    @FindBy(xpath = "//div[@class='stamps-list-actions']//img[@class='image-stamp js-image-stamp']")
    WebElement stamp_image;
    @FindBy(xpath = "//div[@class='stamps-list-actions']//img[@class='image-stamp js-image-stamp']")
    List <WebElement> stamp_images;
    @FindBy(xpath = "//i[@class='fa fa-times fa-lg']")
    WebElement delete_stamp_button;

    public void delete_existing_stamps() throws InterruptedException {
        int size = stamp_images.size();
        for (int i = 0; i < size; i++) {
            ReusableMethodsLoggersPOM.mouseHoverMethod(driver, stamp_image, logger, "stamp_image");
            Thread.sleep(500);
            ReusableMethodsLoggersPOM.clickMethod(driver, delete_stamp_button, logger, "delete_stamp_button");
            Thread.sleep(500);
            BaseClass.staging5().acceptAlert();
            Thread.sleep(500);

        }
    }



    public void upload_stamp_file() {
        //  ReusableMethodsLoggersPOM.sendKeysMethod(driver, stamp_file,"src/main/java/images/map.png",logger, "stamp_file ");
        //  ReusableMethodsLoggersPOM.uploadFileMethod(driver, stamp_file, "map.png" ,logger, "stamp_file");

        // ReusableMethodsLoggersPOM.sendKeysMethod(driver, any_format_checkbox_appendix, "map.png",logger, "upload_appendix_section");
    }



    // @FindBy(xpath = "(//input[@type='file'])[2]")
    String insert_file_1 = "(//input[@type='file'])[1]";
    String insert_file_2 = "(//input[@type='file'])[2]";
    String insert_file_3 = "(//input[@type='file'])[3]";


    public void upload_signature_button() {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_2, "signature.jpg", logger, "add_signature_file");
    }

    public void upload_stamp_button() {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_3, "signature.jpg", logger, "insert_file_3");
    }

    public void upload_header_image() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_1, "signature.jpg", logger, "Header_image");
        BaseClass.staging5().captureAlertMessage();
    }

    public void upload_signature_attachment() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_1, "signature.jpg", logger, "Header_image");
    }

    public void upload_files_to_pdf_first_appendix() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_1, "maptest.pdf", logger, "maptest pdf");
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(1000);

        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_1, "maptest2.pdf", logger, "maptest2 pdf");

    }

        public void upload_files_to_gallery_2nd_appendix() throws InterruptedException {
            ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_2, "picture of a---------------------------------------------mapp.png", logger, "map picture - spellcheck");
            Thread.sleep(1500);

            ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_2, "signature.jpg", logger, "signature");
          //  Thread.sleep(500);
    }

    public void upload_footer_image() throws InterruptedException {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_2, "signature.jpg", logger, "Footer_image");
        Thread.sleep(500);
        //ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_2, "signature.jpg", logger, "Footer_image");

        BaseClass.staging5().captureAlertMessage();
    }


    @FindBy(xpath = "//a[@id='toggle-changes']")
    WebElement track_changes_button;

    public void click_and_capture_track_changes_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, track_changes_button, logger, "track_changes_button ");
        Thread.sleep(1500);
        ReusableMethodsLoggersPOM.captureTextMethod(driver, track_changes_button, logger, "Track_Changes Button Text: ");
    }

    @FindBy(xpath = "//a[@id='toggle-spellcheck']")
    WebElement spell_check_button;

    public void click_and_capture_spell_check_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, spell_check_button, logger, "spell_check_button ");
        Thread.sleep(5000);
        ReusableMethodsLoggersPOM.captureTextMethod(driver, spell_check_button, logger, "spell check Button Text: ");
    }



    @FindBy(xpath = "//*[contains(@class, 'spellCheck-problems')]")
    List<WebElement> spellCheck_error_sections;
    @FindBy(xpath = "//*[contains(@class, 'wsc-') and contains(@class, '-problem')]")
    WebElement spellCheck_error;

    public void hover_to_spellCheck_error() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, spellCheck_error, logger, "spellCheck_error");
    }

    @FindBy(xpath = "//*[contains(@class, 'wsc-') and contains(@class, '-problem')]")
    List<WebElement> spellCheck_errors;

    public void capture_spellCheck_error_sections() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(spellCheck_error));
        int spell_check_errors = spellCheck_errors.size();
        int spell_check_error_sections = spellCheck_error_sections.size();

        System.out.println("\n" + "There are: " + spell_check_errors + " spell check errors");
        System.out.println("There are: " + spell_check_error_sections + " sections with spell check errors" + "\n");
    }

    public void capture_spellCheck_errors() {
        int spell_check_errors = spellCheck_errors.size();
        System.out.println("\n" + "There are: " + spell_check_errors + " spell check errors" + "\n");
    }
    public void verify_no_spellCheck_errors() {
   ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, spellCheck_error, false, logger, "spell check errors");
    }
    public void fix_all_spellCheck_errors() throws InterruptedException {
        int spell_check_errors = spellCheck_errors.size();

        for (int i = 0; i < spell_check_errors; i++) {
           // Thread.sleep(1500);
            BaseClass.staging5().hover_to_spellCheck_error();
            Thread.sleep(1500);
            BaseClass.staging5().click_first_spellcheck_suggestion();
            Thread.sleep(1000);
           BaseClass.staging5().click_out_of_section();
            Thread.sleep(3000);
        }
//                   BaseClass.staging5().click_out_of_section();

    }

    public void fix_all_spellCheck_errors_sanity() throws InterruptedException {
        int spell_check_errors = spellCheck_errors.size();

        for (int i = 0; i < spell_check_errors ; i++) {
            Thread.sleep(1000);

            BaseClass.staging5().hover_to_spellCheck_error();
            Thread.sleep(1500);
            BaseClass.staging5().click_first_spellcheck_suggestion_prod();
            Thread.sleep(1000);
            BaseClass.staging5().click_default_section_title();
            Thread.sleep(2000);
        }
    }


    @FindBy(xpath = "//section[@class='switchboard CT-hide']//*[contains(@class, 'wsc-') and contains(@class, '-problem')]")
    List<WebElement> intro_spellCheck_errors;

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//*[contains(@class, 'wsc-') and contains(@class, '-problem')]")
    WebElement intro_spellCheck_error;

    public void hover_to_intro_spellCheck_error() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, intro_spellCheck_error, logger, "spellCheck_error");
        Thread.sleep(1000);

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, intro_spellCheck_error, logger, "spellCheck_error");
    }
    public void fix_intro_spellCheck_errors() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(intro_spellCheck_error));
        int spell_check_errors = intro_spellCheck_errors.size();
        for (int i = 0; i < spell_check_errors; i++) {
            // BaseClass.templatesSection().clickAddContentRow();
            BaseClass.staging5().hover_to_intro_spellCheck_error();
            Thread.sleep(1000);
            BaseClass.staging5().click_first_spellcheck_suggestion();
            Thread.sleep(2000);
            BaseClass.staging5().click_out_of_section();
            Thread.sleep(2000);


        }

    }

    public void hover_to_appendix_spellCheck_error() throws InterruptedException {
//        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, intro_spellCheck_error, logger, "spellCheck_error");
//        Thread.sleep(200);

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, intro_spellCheck_error, logger, "spellCheck_error");
    }

    public void fix_appendix_spellCheck_errors() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(intro_spellCheck_error));
        int appendix_spell_check_errors = intro_spellCheck_errors.size();
        System.out.println(appendix_spell_check_errors + "errors to be fixed");
        for (int i = 0; i < appendix_spell_check_errors; i++) {
//            Thread.sleep(1000);
            // BaseClass.templatesSection().clickAddContentRow();
            BaseClass.staging5().hover_to_appendix_spellCheck_error();
//            ReusableMethodsLoggersPOM.mouseHoverMethod(driver, intro_spellCheck_error, logger, "spellCheck_error");

            Thread.sleep(1500);
            BaseClass.staging5().click_first_spellcheck_suggestion();
          //  Thread.sleep(1500);

          //  BaseClass.reportfoldersection().clickSectionView_Appendices();
            Thread.sleep(1000);

        }
    }

    @FindBy(xpath = "(//li[@class='report_appendix pdf-appendix js-report-appendix stores-pdfs']//div[@class='appendix-item-thumb'])[1]")
    WebElement first_pdf_file_appendix;
    @FindBy(xpath = "(//li[@class='report_appendix pdf-appendix js-report-appendix stores-pdfs']//i[@class='fa fa-trash-o has-tooltip'])")
    WebElement first_pdf_file_appendix_delete;
    @FindBy(xpath = "(//li[@class='report_appendix pdf-appendix js-report-appendix stores-pdfs']//i[@class='fa fa-minus-circle has-tooltip'])[1]")
    WebElement first_pdf_file_appendix_exclude;
    @FindBy(xpath = "(//li[@class='report_appendix pdf-appendix js-report-appendix stores-pdfs']//div[@class='appendix-item-excluded-label'])")
    WebElement verify_pdf_file_appendix_excluded;
    public void hover_to_delete_first_pdf_appendix_file() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, first_pdf_file_appendix, logger, "first_gallery_file_appendix");

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, first_pdf_file_appendix, logger, "first_pdf_file_appendix");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, first_pdf_file_appendix_delete, logger, "first_pdf_file_appendix_delete");
        Thread.sleep(500);
    }
    public void hover_to_exclude_first_pdf_appendix_file() throws InterruptedException {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, first_pdf_file_appendix, logger, "first_pdf_file_appendix");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, first_pdf_file_appendix_exclude, logger, "second_pdf_file_appendix_exclude");
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, verify_pdf_file_appendix_excluded, true, logger, "verify_pdf_file_appendix_excluded");

    }



    @FindBy(xpath = "(//li[@class='report_appendix gallery-appendix js-report-appendix stores-images']//div[@class='appendix-item-thumb'])[1]")
    WebElement first_gallery_file_appendix;
    @FindBy(xpath = "(//li[@class='report_appendix gallery-appendix js-report-appendix stores-images']//i[@class='fa fa-trash-o has-tooltip'])[1]")
    WebElement first_gallery_file_appendix_delete;
    @FindBy(xpath = "(//li[@class='report_appendix gallery-appendix js-report-appendix stores-images']//i[@class='fa fa-minus-circle has-tooltip'])[1]")
    WebElement first_gallery_file_appendix_exclude;
    @FindBy(xpath = "(//li[@class='report_appendix gallery-appendix js-report-appendix stores-images']//div[@class='appendix-item-excluded-label'])")
    WebElement verify_gallery_file_appendix_excluded;
    public void hover_to_delete_first_gallery_appendix_file() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, first_gallery_file_appendix, logger, "first_gallery_file_appendix");

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, first_gallery_file_appendix, logger, "first_gallery_file_appendix");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, first_gallery_file_appendix_delete, logger, "first_gallery_file_appendix_delete");
        Thread.sleep(500);

    }
    public void hover_to_exclude_first_gallery_appendix_file() throws InterruptedException {

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, first_gallery_file_appendix, logger, "first_gallery_file_appendix");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, first_gallery_file_appendix_exclude, logger, "first_gallery_file_appendix_exclude");
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, verify_gallery_file_appendix_excluded, true, logger, "verify_gallery_file_appendix_excluded");

    }



    @FindBy(xpath = "//button[@class='wsc-button wsc-button--clear wsc--focusable wsc-item__content wsc-item__button wsc-contextmenu__button wsc-contextmenu__button--suggestion']")
    WebElement first_spellcheck_suggestion_prod;
    public void click_first_spellcheck_suggestion_prod() {
        ReusableMethodsLoggersPOM.clickMethod(driver, first_spellcheck_suggestion_prod, logger, "first_spellcheck_suggestion_prod");}


    @FindBy(xpath = "//*[contains(@aria-label, 'Replace') and contains(@aria-label, 'with')]")
    WebElement first_spellcheck_suggestion;
    public void click_first_spellcheck_suggestion() {
        ReusableMethodsLoggersPOM.clickMethod(driver, first_spellcheck_suggestion, logger, "first_spellcheck_suggestion");}

    @FindBy(xpath = "//span[@class='wsc-icon wsc-icon-addWord wsc-action-items__icon wsc-button__icon']")
    WebElement add_word_spellCheck_suggestion;

    public void click_add_word_spellCheck_suggestion() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_word_spellCheck_suggestion, logger, "add_word_spellCheck_suggestion");
    }

    @FindBy(xpath = "//div[@class='wsc-action-items__second-action']")
    WebElement ignore_word_spellCheck_suggestion;

    public void click_ignore_word_spellCheck_suggestion() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ignore_word_spellCheck_suggestion, logger, "ignore_word_spellCheck_suggestion");
    }


    @FindBy(xpath = "//a[text()=' View Trash']")
    WebElement userProfileTab_viewTrash_dropdownItem;

    public void click_userProfileTab_viewTrash_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, userProfileTab_viewTrash_dropdownItem, logger, "User Profile Tab - View Trash Dropdown ");
    }

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement userProfileTab_logOut_dropdownItem;
    public void click_userProfileTab_logOut_dropdownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, userProfileTab_logOut_dropdownItem, logger, "User Profile Tab - Log Out Dropdown Item ");
    }


    @FindBy(xpath = "(//a[@data-remote='true'][normalize-space()='Restore'])[1]")
    WebElement restore_first_deleted_item;
    public void click_restore_first_deleted_item() {
        ReusableMethodsLoggersPOM.clickMethod(driver, restore_first_deleted_item, logger, "restore_first_deleted_item ");
        BaseClass.staging5().captureAlertMessage();
    }


    public void click_permanentlyDelete_first_deleted_item() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, deletePermanentlyToTrash_link, logger, "deletePermanentlyToTrash_link ");
        Thread.sleep(500);
       driver.switchTo().alert().accept();
        BaseClass.staging5().captureAlertMessage();
    }


    @FindBy(xpath = "//a[@data-method='delete']")
    WebElement deletePermanentlyToTrash_link;

    @FindBy(xpath = "//div[@class='list-search-feedback js-list-search-feedback']")
    WebElement trashItems;

    public void clickDeletePermanentlyButton_AllItems() throws InterruptedException {
        String integerElement = ReusableMethodsLoggersPOM.captureTextMethod(driver, trashItems, logger, "trash items ");
        //   int integerValue = Integer.parseInt(integerElement);
        int integerValue = Integer.parseInt(integerElement.replaceAll("\\D", ""));


        System.out.println("Items in trash to be deleted:    " + integerValue);
        logger.log(LogStatus.PASS, "Items in trash to be deleted: " + integerValue + "\n");

        for (int i = 0; i < integerValue; i++) {
            deletePermanentlyToTrash_link.click();
            //ReusableMethodsLoggersPOM.clickMethod(driver, deletePermanentlyToTrash_link, logger, "deleteToTrashButton");
            driver.switchTo().alert().accept();
            Thread.sleep(300);
            // Thread

        }
    }
    @FindBy(xpath = "(//table[@class='table info-table'])[1]")
    WebElement smartTable_text_firstIteration;

    @FindBy(xpath = "(//table[@class='table info-table'])[2]")
    WebElement smartTable_text_secondIteration;

    public void compare_smartTable_text() {
        String textFirstIteration = ReusableMethodsLoggersPOM.captureTextMethod(driver, smartTable_text_firstIteration, logger, "smartTable_text_firstIteration");
        String textSecondIteration = ReusableMethodsLoggersPOM.captureTextMethod(driver, smartTable_text_secondIteration, logger, "smartTable_text_secondIteration");

        // Compare text from first and second iteration
        if(textFirstIteration.equals(textSecondIteration)) {
            System.out.println("Smart Table has duplicated successfully. Text Matches");
            logger.log(LogStatus.PASS, "Smart Table has duplicated successfully. Text Matches");

        } else {
            System.out.println("Smart Table has NOT duplicated successfully. Text is different");
            logger.log(LogStatus.FAIL, "Smart Table has NOT duplicated successfully. Text is different");

        }
    }


    @FindBy(xpath = "//button[@class='ck ck-button quireToogleLock ck-off']")
    WebElement lock_icon_ck5;

    public void click_lock_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, lock_icon_ck5, logger, "lock_icon_ck5");
    }

    public void verify_lock_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, lock_icon_ck5, true, logger, "lock_icon_ck5 ");
    }

    public void verify_lock_icon_is_NotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, lock_icon_ck5, false, logger, "lock_icon_ck5 ");
    }

    @FindBy(xpath = "//span[contains(@class, 'mceNonEditable')]")
    WebElement locked_content_ck5;
    List<WebElement> locked_content_list_ck5;

    public void click_locked_content_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, locked_content_ck5, logger, "locked content ck5 ");
    }

    public void verify_locked_content_ck5() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, locked_content_ck5, true, logger, "locked content ck5 ");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, locked_content_ck5, logger, "locked_content_in_textbox_ck5: ");
    }

    public void verify_unlocked_content_ck5() {
       // ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, locked_content_ck5, false, logger, "No Locked content ck5 ");
        int itemCount;
        if (locked_content_list_ck5 != null) {
            itemCount = locked_content_list_ck5.size();
            System.out.println("Failed: There are " + itemCount + " locked items in Text Box.");
            logger.log(LogStatus.FAIL, "Failed: There are " + itemCount + " locked items in Text Box.");
        } else {
            itemCount = 0;
            System.out.println("Passed. There are " + itemCount + " locked items in Text Box.");
            logger.log(LogStatus.PASS, "Passed. There are +" + itemCount + " locked items in Text Box.");

        }
    }


    @FindBy(xpath = "//a[@class='cke_button cke_button__quire_unlock_content cke_button_off']")
    WebElement unlock_icon_ck5;

    public void click_unlock_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, unlock_icon_ck5, logger, "unlock_icon_ck5");
    }

    public void verify_unlock_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unlock_icon_ck5, true, logger, "unlock_icon_ck5");
    }

    public void verify_unlock_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, unlock_icon_ck5, false, logger, "unlock_icon_ck5");
    }

    @FindBy(xpath = "//a[@class='cke_button cke_button__sourcedialog cke_button_off']")
    WebElement source_icon_ck5;

    public void verify_source_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, source_icon_ck5, true, logger, "source_icon_ck5");
    }

    public void verify_source_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, source_icon_ck5, false, logger, "source_icon_ck5");
    }

    @FindBy(xpath = "//a[@class='cke_button cke_button__quire_create_word_bank_content cke_button_off']")
    WebElement wordBank_icon_ck5;

    public void verify_wordBank_icon_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, wordBank_icon_ck5, true, logger, "wordBank_icon_ck5");
    }

    public void verify_wordBank_icon_is_notVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, wordBank_icon_ck5, false, logger, "wordBank_icon_ck5");
    }

    @FindBy(xpath = "//*[contains(@class,'cke_button cke_button__')]")
    List<WebElement> ck_editor_items;


    public void capture_ck_editor_items() {
        int itemCount = ck_editor_items.size();

        // Check the count and print accordingly
        if (itemCount % 39 == 0) {
            System.out.println("\n" + "This is either a Editor,Author,Contractor account.  There are: " + itemCount + " items in CK Editor." + "\n");
            logger.log(LogStatus.PASS, "This is either a Editor,Author,or Contractor account.  There are: " + itemCount + " items in CK Editor. ");
        } else if (itemCount % 43 == 0) {
            System.out.println("\n" + "This is an Admin Level Account.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This is an Admin Level Account.  There are: " + itemCount + " items in CK Editor. ");

        } else if (itemCount % 42 == 0) {
            System.out.println("\n" + "This is a PM  Account.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This is a PM  Account.  There are: " + itemCount + " items in CK Editor. ");

        } else if (itemCount % 26 == 0) {
            System.out.println("\n" + "This CK Editor is for Instruction Items.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK Editor is for Instruction Items.  There are: " + itemCount + " items in CK Editor. ");
        } else if (itemCount % 34 == 0) {
            System.out.println("\n" + "This CK Editor is for Email Notification Template Items.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK Editor is for Email Notification Template Items.  There are: " + itemCount + " items in CK Editor. ");
        } else {
            System.out.println("Unknown number of items in CK Editor.  There are: " + itemCount + " items in CK Editor. ");
        }
    }

    @FindBy(xpath = "//span[@class='cke_top cke_reset_all']//*[contains(@class,'cke_button cke_button__')]")
    List<WebElement> ck_editor_footnote_items;

    public void verify_ck_editor_footNote_icons() throws InterruptedException {
//        BaseClass.staging5().verify_lock_icon_is_NotVisible();
//        BaseClass.staging5().verify_unlock_icon_is_notVisible();
//        BaseClass.staging5().verify_source_icon_is_notVisible();
//        BaseClass.staging5().verify_wordBank_icon_is_notVisible();
        int itemCount = ck_editor_footnote_items.size();

        if (itemCount % 7 == 0) {
            System.out.println("\n" + "This CK Editor is for Footnote Items.  There are: " + itemCount + " items in CK Editor. " + "\n");
            logger.log(LogStatus.PASS, "This CK Editor is for Footnote Items.  There are: " + itemCount + " items in CK Editor. ");
        } else {
            System.out.println("Unknown number of Footnote items in CK Editor.  There are: " + itemCount + " items in CK Editor. ");
        }
    }

    public void verify_ck_editor_instruction_icons() throws InterruptedException {
        BaseClass.staging5().verify_lock_icon_is_NotVisible();
        BaseClass.staging5().verify_unlock_icon_is_notVisible();
        BaseClass.staging5().verify_source_icon_isVisible();
        BaseClass.staging5().verify_wordBank_icon_is_notVisible();
        BaseClass.staging5().capture_ck_editor_items();
        Thread.sleep(1000);
    }

    public void verify_ck_editor_wordBank_icons() throws InterruptedException {
        BaseClass.staging5().verify_lock_icon_isVisible();
        BaseClass.staging5().verify_unlock_icon_isVisible();
        BaseClass.staging5().verify_source_icon_isVisible();
        BaseClass.staging5().verify_wordBank_icon_is_notVisible();
        BaseClass.staging5().capture_ck_editor_items();
        Thread.sleep(1000);
    }

    public void verify_ck_editor_lower_permission_level() throws InterruptedException {
        BaseClass.staging5().click_Section_row_editor_browser();

        BaseClass.staging5().verify_lock_icon_is_NotVisible();
        BaseClass.staging5().verify_unlock_icon_is_notVisible();
        BaseClass.staging5().verify_source_icon_is_notVisible();
        BaseClass.staging5().verify_wordBank_icon_is_notVisible();


        BaseClass.staging5().capture_ck_editor_items();
        Thread.sleep(1000);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
    }

    public void verify_ck_editor_admin_permission_level() throws InterruptedException {
        BaseClass.staging5().click_Section_row_editor_browser();

        BaseClass.staging5().verify_lock_icon_isVisible();
        BaseClass.staging5().verify_unlock_icon_isVisible();
        BaseClass.staging5().verify_source_icon_isVisible();
        BaseClass.staging5().verify_wordBank_icon_isVisible();

        BaseClass.staging5().capture_ck_editor_items();
        Thread.sleep(1000);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
    }

    public void verify_ck_editor_root_emailStatusTemplate_permission_level() throws InterruptedException {
        BaseClass.staging5().verify_lock_icon_isVisible();
        BaseClass.staging5().verify_unlock_icon_isVisible();
        BaseClass.staging5().verify_source_icon_isVisible();
        BaseClass.staging5().verify_wordBank_icon_is_notVisible();

        BaseClass.staging5().capture_ck_editor_items();
        Thread.sleep(1000);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
    }

    public void verify_ck_editor_PM_permission_level() throws InterruptedException {
        BaseClass.staging5().click_Section_row_editor_browser();

        BaseClass.staging5().verify_lock_icon_isVisible();
        BaseClass.staging5().verify_unlock_icon_isVisible();
        BaseClass.staging5().verify_source_icon_isVisible();
        BaseClass.staging5().verify_wordBank_icon_is_notVisible();

        BaseClass.staging5().capture_ck_editor_items();
        Thread.sleep(1000);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
    }

    @FindBy(xpath = "//input[(@class='search')]")
    WebElement searchField_Search_Button;
    @FindBy(xpath = "//span[@class='edit-link-text']")
    WebElement templateLink;

    @FindBy(xpath = "//span[@class='edit-link-text']")
    List<WebElement> templateItems;
    @FindBy(xpath = "//a[contains(text(),'Template Settings')]")
    WebElement templateSettingsButton;

    @FindBy(xpath = "//a[@data-method='delete']")
    WebElement deleteToTrashButton;

    public void click_delete_templates_to_trash() throws InterruptedException {
        System.out.println("Items in template:    " + templateItems.size());
        logger.log(LogStatus.PASS, "Items in template to be deleted: " + templateItems.size() + "\n");

        for (int i = 0; i <= templateItems.size(); i++) {

            //    ReusableMethodsLoggersPOM.captureTextMethod(driver, recent_row_Information, logger, "Most Recent Details:");

            ReusableMethodsLoggersPOM.clickMethod(driver, templateLink, logger, "templateLink");
            Thread.sleep(1000);
            ReusableMethodsLoggersPOM.clickMethod(driver, templateSettingsButton, logger, "templateSettingsButton");
            ReusableMethodsLoggersPOM.clickMethod(driver, deleteToTrashButton, logger, "deleteToTrashButton");
            Thread.sleep(3000);
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "QA Automation Testing ZON Template", logger, "QA automation Reports - search field");


        }
    }

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__lite-toggleshow_icon']")
    WebElement tracked_changes_icon_ck5;

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__lite-acceptall_icon']")
    WebElement accept_all_changes_icon_ck5;
    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__lite-rejectall_icon']")
    WebElement reject_all_changes_icon_ck5;
    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__lite-acceptone_icon']")
    WebElement accept_change_icon_ck5;
    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__lite-rejectone_icon']")
    WebElement reject_change_icon_ck5;

    public void verify_tracked_changes_ck_editor_icon() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, tracked_changes_icon_ck5, true, logger, "tracked_changes_icon_ck5 ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, accept_all_changes_icon_ck5, true, logger, "accept_all_changes_icon_ck5 ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reject_all_changes_icon_ck5, true, logger, "reject_all_changes_icon_ck5 ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, accept_change_icon_ck5, true, logger, "accept_change_icon_ck5 ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reject_change_icon_ck5, true, logger, "reject_change_icon_ck5 ");
    }


    public void click_accept_change_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, accept_change_icon_ck5, logger, "accept_change_icon_ck5 ");
    }

    public void click_accept_all_change_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, accept_all_changes_icon_ck5, logger, "accept_all_changes_icon_ck5 ");
    }

    public void click_reject_change_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reject_change_icon_ck5, logger, "reject_change_icon_ck5");
    }

    public void click_reject_all_change_icon_ck5() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reject_all_changes_icon_ck5, logger, "reject_all_changes_icon_ck5");
    }

//    @FindBy(xpath = "//ins[@class='ice-ins ice-cts-1']")
//    WebElement green_highlighted_text;

    @FindBy(xpath = "//ins[@class='ice-ins ice-cts-1']")
    WebElement green_highlighted_text;

    public void verify_green_track_changes_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, green_highlighted_text, true, logger, "green_highlighted_text ");

//        int green_count = green_highlighted_text_list.size();
//        System.out.println("\n" + "There are: " + green_count + " green highlighted changes");
    }

    @FindBy(xpath = "//ins[normalize-space()='123']")
    WebElement green_highlighted_wb_item;

    public void verify_green_highlighted_wb_item_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, green_highlighted_wb_item, true, logger, "green_highlighted_wb_item ");
    }


//    public void verify_2_green_tracked_changes() {
//        int green_count = green_highlighted_text_list.size();
//        if (green_count == 2) {
//            System.out.println("\n" + "There are: " + green_count + " green highlighted changes - As Expected");
//            logger.log(LogStatus.INFO, "There are: " + green_count + " green highlighted changes - As Expected");
//
//        } else {
//            System.out.println("\n" + "There are: " + green_count + " green highlighted changes - NOT the expected value of 2");}
//        logger.log(LogStatus.FAIL, "There are: " + green_count + " green highlighted changes - NOT the expected value of 2");
//    }




    @FindBy(xpath = "//del[@class='ice-del ice-cts-1']")
    WebElement red_highlighted_text;

    public void verify_red_tracked_changes_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, red_highlighted_text, true, logger, "red_highlighted_text ");
    }

    public void verify_red_tracked_changes_is_NotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, red_highlighted_text, false, logger, "red_highlighted_text after deleting");
    }

    @FindBy(xpath = "//section[contains(@class, 'editor-section lockable')]")
    WebElement section_row_editor;

    @FindBy(xpath = "(//section[contains(@class, 'editor-section lockable')])[2]")
    WebElement section2_row_editor;

    @FindBy(xpath = "(//section[@class='editor-section lockable'])[3]")
    WebElement section3_row_editor;

    @FindBy(xpath = "(//section[@class='editor-section lockable'])[4]")
    WebElement section4_row_editor;

    public void clickSection_row_editor() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_row_editor, logger, "section_row_editor ");
    }

    public void click_Section2_row_editor() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section2_row_editor, logger, "section2_row_editor ");
    }

    public void click_Section_row_editor_browser() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, section_row_editor, logger, "section1_row_editor ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, section2_row_editor, logger, "section2_row_editor ");
        }}


    public void click_Section4_row_editor() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section4_row_editor, logger, "section4_row_editor ");
    }

    @FindBy(xpath = "//section[contains(@class,'editor-section computed-page')]")
    WebElement section_row_editor_projectSummary;

    public void click_section_row_editor_projectSummary() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_row_editor_projectSummary, logger, "section_row_editor_projectSummary ");
    }

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quire_create_word_bank_content_icon']")
    WebElement wordbank_icon_ck_modal;
    public void clickWordBank_icon_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, wordbank_icon_ck_modal, logger, "wordbank_icon_ck_modal ");}

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quire_insert_stamp_icon']")
    WebElement stamp_icon_ck_modal;
    public void click_stamp_icon_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, stamp_icon_ck_modal, logger, "stamp_icon_ck_modal");}

    @FindBy(xpath = "//img[@class='user-stamp']")
    WebElement stamp_icon_report_section;
    public void verify_stamp_in_section() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, stamp_icon_report_section, true, logger, "stamp_icon_report_section");}

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quire_insert_signature_icon']")
    WebElement signature_icon_ck_modal;
    public void click_signature_icon_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, signature_icon_ck_modal, logger, "signature_icon_ck_modal");}

    @FindBy(xpath = "//img[@class='user-signature']")
    WebElement signature_icon_report_section;
    public void verify_signature_in_section() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, signature_icon_report_section, true, logger, "signature_icon_report_section");}
    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quire_insert_report_tags_icon']")
    WebElement reportTag_icon_ck_modal;

    public void click_reportTag_icon_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportTag_icon_ck_modal, logger, "reportTag_icon_ck_modal ");
    }


    @FindBy(xpath = "//iframe[@class='cke_panel_frame']")
    WebElement reportTag_dropdownItems_ck5_iFrame;

    public void switchTo_reportTag_dropdownItems_ck5_iFrame() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, reportTag_dropdownItems_ck5_iFrame, logger, "reportTag_dropdownItems_ck5_iFrame ");
    }

    @FindBy(xpath = "//input[@class='form-control js-tag-widget-editor']")
    WebElement ReportTagField;

    public void enter_email_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ReportTagField, "test@quiretest.com", logger, "email_ReportTagField");
    }

    public void enter_edited_email_ReportTagField() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, ReportTagField, "automation_new_test@quiretest.com", logger, "email_ReportTagField");
    }

    public void select_all_and_delete_ReportTagField() {
        ReusableMethodsLoggersPOM.clearMethod(driver, ReportTagField, logger, "select all ReportTagField");
    }

    @FindBy(xpath = "//span[@class='mceNonEditable reportTag']")
    WebElement ReportTagText;

    //using attribute method to capture report tag text fireld
    public void capture_ReportTagField() {
      String ReportTag =  ReusableMethodsLoggersPOM.captureAttributeMethod(driver, ReportTagText, logger, "ReportTagText", "data-value");

        if (ReportTag.equals("test@quiretest.com")) {
            System.out.println(ReportTag + ": PASSED - AS expected");
        }
        else if (ReportTag.equals("automation_new_test@quiretest.com")) {
            System.out.println(ReportTag + ": PASSED - AS expected");
        } else if ("undefined".equals(ReportTag) || ReportTag == null) {
            System.out.println(ReportTag + ": PASSED - AS expected");
        }
        else {
            System.out.println(ReportTag + " does not match any expected values");
        }

    }

    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quire_insert_footnote_icon']")
    WebElement footNote_icon_ck_modal;

    public void click_footNote_icon_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, footNote_icon_ck_modal, logger, "footNote_icon_ck_modal ");
    }

    @FindBy(xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[2]")
    WebElement footnote_field_ck5_iFrame;

    public void switchTo_footnote_field_ck5_iFrame() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, footnote_field_ck5_iFrame, logger, "footnote_field_ck5_iFrame ");
    }


    @FindBy(xpath = "(//li[@class='quire_cke_menuitem'])")
    WebElement reportTag_dropDownItem_ck_modal;

    public void click_reportTag_dropDownItem_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportTag_dropDownItem_ck_modal, logger, "reportTag_dropDownItem_ck_modal ");
    }

    @FindBy(xpath = "//span[normalize-space()='Title Page Image']")
    WebElement titlePageImage_RT_dropDownItem;

    public void click_titlePageImage_RT_dropDownItem() {
        ReusableMethodsLoggersPOM.scrollandClickMethod(driver, titlePageImage_RT_dropDownItem, logger, "titlePageImage_RT_dropDownItem ");
    }

    @FindBy(xpath = "//input[@id='word_bank_definition_keyword']")
    WebElement wordBank_New_Title;

    public void enter_wordbank_new_title() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, wordBank_New_Title, "QA WordBank Item", logger, "wordBank_New_Title ");
    }

    public void enter_wordbank_ST_new_title() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, wordBank_New_Title, "QA WordBank Smart Table New Item", logger, "wordBank_New_Title ");
    }


    @FindBy(xpath = "//i[@class='fa fa-angle-down fa-lg']")
    WebElement wordBank_label_dropdown_arrow;

    public void clickWordBank_label_dropdown_arrow() {
        ReusableMethodsLoggersPOM.clickMethod(driver, wordBank_label_dropdown_arrow, logger, "wordBank_label_dropdown_arrow ");
    }

    @FindBy(xpath = "//*[@class='list-group dropdown-list']/li[1]")
    WebElement wordBank_label_dropdown_firstLink;

    public void clickWordBank_label_dropdown_firstLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, wordBank_label_dropdown_firstLink, logger, "wordBank_label_dropdown_firstLink ");
    }

    @FindBy(xpath = "//section[@id='word_bank_definition']")
    WebElement wordBank_add_content_row;

    public void click_wordBank_add_content_row() {
        ReusableMethodsLoggersPOM.clickMethod(driver, wordBank_add_content_row, logger, "wordBank_add_content_row ");
    }

    @FindBy(xpath = "//div[@class='toggle-checkbox assign_checkbox']//label[@for='assign']")
    WebElement wordBank_assign_to_section;

    public void click_wordBank_assign_to_section() {
        ReusableMethodsLoggersPOM.clickMethod(driver, wordBank_assign_to_section, logger, "wordBank_assign_to_section ");
    }


    @FindBy(xpath = "//li[@class='assign-word-bank has-wb-items']")
    List<WebElement> wordbanks_associated;

    @FindBy(xpath = "//li[@class='assign-word-bank has-wb-items']")
    WebElement blue_wordbank_icon;

    public void capture_number_of_wordbanks_associated() {

        System.out.println("\n" + "There are: " + wordbanks_associated.size() + " blue sections with wordbank items" + "\n");
        logger.log(LogStatus.PASS, "There are:  " + wordbanks_associated.size() + "blue sections with wordbank items" + "\n");
    }

    public void verify_blue_wordBank_icon_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, blue_wordbank_icon, true, logger, "blue_wordbank_icon ");
    }


    @FindBy(xpath = "//section[@class='switchboard CT-hide']//li[@class='assign-word-bank has-wb-items']")
    WebElement blue_wordbank_icon_introPages;

    public void verify_blue_WB_icon_introPages_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, blue_wordbank_icon_introPages, true, logger, "blue_wordbank_icon_introPages ");
    }

    @FindBy(xpath = "//a[@title='Assign WordBank Items']//i[contains(@class, 'fa fa-book')]")
    WebElement introPages_wordbank_grey_icon;
    public void click_introPages_wordbank_grey_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, introPages_wordbank_grey_icon, logger, "introPages_wordbank_grey_icon");}

    @FindBy(xpath = "//a[@data-original-title='Assign WordBank Items']//i[contains(@class, 'fa fa-book')]\n")
    WebElement wordbank_grey_icon;
    public void click_wordbank_grey_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, wordbank_grey_icon, logger, "wordbank_grey_icon");}

    @FindBy(xpath = "//a[@data-original-title='Mark complete']//i[contains(@class, 'fa fa-check-square')]")
    WebElement mark_complete_grey_icon;

    public void click_mark_complete_grey_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, mark_complete_grey_icon, logger, "mark_complete_grey_icon");
    }

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//i[contains(@class, 'fa fa-check-')]")
    WebElement mark_intro_pages_complete_grey_icon_;

    public void click_mark_intro_pages_complete_grey_icon_() {
        ReusableMethodsLoggersPOM.clickMethod(driver, mark_intro_pages_complete_grey_icon_, logger, "mark_intro_pages_complete_grey_icon_");
    }


    @FindBy(xpath = "//a[@class='has-tooltip completed']//i[@class='fa fa-check-square']")
    WebElement mark_complete_blue_icon;

    public void verify_blue_marked_complete_icon_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, mark_complete_blue_icon, true, logger, "mark_complete_blue_icon ");
    }

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//a[@class='has-tooltip completed']")
    WebElement intro_pages_complete_blue_icon;

    public void verify_intro_pages_blue_marked_complete_icon_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, intro_pages_complete_blue_icon, true, logger, "intro_pages_complete_blue_icon ");
    }

    @FindBy(xpath = "//li[@class='show-revisions js-show-revisions js-revision-info-table-container-editor has-revisions']//a[@class='has-tooltip js-revision-action-link']")
    WebElement smartTable_revisions_blue_icon;

    public void click_smartTable_revisions_blue_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, smartTable_revisions_blue_icon, logger, "smartTable_revisions_blue_icon");
    }

    @FindBy(xpath = "(//a[contains(text(),'Revert')])[1]")
    WebElement revert_button_firstLink;

    public void click_revert_button_firstLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, revert_button_firstLink, logger, "revert_button_firstLink");
    }

    @FindBy(xpath = "//a[normalize-space()='Done!']")
    WebElement done_icon_after_revision;

    public void verify_done_icon_after_revision_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, done_icon_after_revision, true, logger, "Done button - after revision");
    }

    public void verify_done_icon_after_revision_isNotVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, done_icon_after_revision, false, logger, "Done button - after revision completed");
    }


    @FindBy(xpath = "(//div[@class='revision-item-title slidePanel-item-title list-group-item-label'])[1]")
    WebElement recent_revision_history;

    public void capture_recent_revisions_history() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, recent_revision_history, logger, "recent_revision_history");
    }


    @FindBy(xpath = "//a[@data-original-title='Revisions']//i[@class='fa fa-history']")
    WebElement revisions_grey_icon;

    public void click_revisions_grey_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, revisions_grey_icon, logger, "revisions_grey_icon");
    }

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//i[contains(@class, 'fa fa-history')]")
    WebElement intro_pages_revisions_icon;

    public void click_intro_pages_revisions_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, intro_pages_revisions_icon, logger, "intro_pages_revisions_icon");
    }

    @FindBy(xpath = "//ul[@class='insert_revision_items list-group js-revisions-container']")
    WebElement revisions_history;

    public void capture_revisions_history() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, revisions_history, logger, "revisions_history");
    }

    @FindBy(xpath = "(//i[@class='fa fa-comment'])[1]")
    WebElement comment_button;

    public void click_comment_button_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comment_button, logger, "comment_button");
    }

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//li[contains(@class, 'section-comments js-sectionComments')]")
    WebElement comment_button_template;
    public void click_comment_button_icon_introPages() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comment_button_template, logger, "comment_button_template");
    }

//    @FindBy(xpath = "//section[@class='switchboard CT-hide']//i[@class='fa fa-comment'])")
//    List<WebElement> intro_spellCheck_errors;
//
//    @FindBy(xpath = "(//i[@class='fa fa-comment'])[2]")
//    WebElement comment_button_template;
//
//    public void click_comment_button_icon_template() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, comment_button_template, logger, "comment_button_template");
//    }

    @FindBy(xpath = "//textarea[@id='new_comment_content']")
    WebElement add_a_comment_field;

    public void enter_comments_to_field() throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, add_a_comment_field, "QA Automation Comment Test Message - Iteration: " + i, logger, "add_a_comment_field");
            ReusableMethodsLoggersPOM.clickMethod(driver, comment_add_button, logger, "add_button");
            Thread.sleep(1000);

        }
    }

    @FindBy(xpath = "//input[@value='Add']")
    WebElement comment_add_button;

    public void click_add_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, comment_add_button, logger, "add_button");
    }

    @FindBy(xpath = "//li[@class='comment comment_self']")
    WebElement comments_content;

    public void capture_comments_content() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, comments_content, logger, "Comments Section:");
    }

    @FindBy(xpath = "//a[@data-dismiss='popup']")
    WebElement cancel_button_popup;

    public void click_cancel_button_popup() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancel_button_popup, logger, "cancel_button_popup");
    }

    @FindBy(xpath = "//li[contains(@class, 'section-comments') and contains(@class, 'has-comments')]")
    WebElement active_comment_icon;

    public void verify_if_comments_icon_isActive() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, active_comment_icon, true, logger, "Blue Comment Icon");
    }

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//li[@class='section-comments js-sectionComments has-comments']")
    WebElement introPages_blue_comment_icon;

    public void verify_introPages_comments_icon_isActive() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, introPages_blue_comment_icon, true, logger, "Blue Comment Icon");
    }


    @FindBy(xpath = "//a[@title='Insert WordBank Items']")
    WebElement insert_word_bank_blue_icon;

    public void click_insert_word_bank_blue_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_word_bank_blue_icon, logger, "insert_word_bank_blue_icon");
    }

    @FindBy(xpath = "//a[@class='wordBank-item-insert insert_content_action list-group-item-insert has-tooltip']")
    WebElement qa_wordbank_add_item_arrow;

    public void click_insert_wordbank_add_item_arrow() {
        ReusableMethodsLoggersPOM.clickMethod(driver, qa_wordbank_add_item_arrow, logger, "qa_wordbank_add_item_arrow");
    }


    //
    @FindBy(xpath = "//div[@id='step-0']//button[@class='btn btn-default btn-sm'] | //a[normalize-space()='Close window']\n")
    WebElement modal_close_window;

    public void click_modal_close_window() {
        ReusableMethodsLoggersPOM.click_modal(driver, modal_close_window, logger, "New Modal Window");
    }

    @FindBy(xpath = "//a[@id='whats_new_announcement_link']")
    WebElement whats_new_in_quire_dropdown_Button;

    public void click_whats_new_in_quire_dropdown_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, whats_new_in_quire_dropdown_Button, logger, "whats_new_in_quire_dropdown_Button");
    }

    @FindBy(xpath = "//span[normalize-space()='1.0']")
    WebElement default_section_title;

    public void click_default_section_title() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, default_section_title, logger, "default_section_title ");
    }

    public void hoverto_default_section_title() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, default_section_title, logger, "default_section_title ");
    }

    @FindBy(xpath = "//span[normalize-space()='2.0']")
    WebElement second_default_section_title;

    public void click_default_section_2() {
        ReusableMethodsLoggersPOM.clickMethod(driver, second_default_section_title, logger, "second_default_section_title ");
    }

    public void verify_default_section_2_isNot_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, second_default_section_title, false, logger, "verify_default_section_2_isNot_Visible ");
    }

    @FindBy(xpath = "//span[normalize-space()='2.0']/following::input[@value='1'][1]")
    WebElement default_section_2_pca_report_checkbox;

    public void click_default_section_2_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, default_section_2_pca_report_checkbox, logger, "default_section_2_checkbox ");
    }

    public void hover_and_click_section_2_checkbox() throws InterruptedException {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, second_default_section_title, logger, "second_default_section_title");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, default_section_2_pca_report_checkbox, logger, "default_section_2_pca_report_checkbox");
    }

    @FindBy(xpath = "//a[@title='Recommendation']/following-sibling::div[@class='outlineItem-actions']//input[@value='1']")
    WebElement cost_rec_section_checkbox;

    public void click_cost_rec_section_checkbox() {
        //   ReusableMethodsLoggersPOM.mouseHoverMethod(driver, fannie_mae_ConditionAction_section_checkbox, logger, "fannie_mae_ConditionAction_section");
        ReusableMethodsLoggersPOM.clickMethod(driver, cost_rec_section_checkbox, logger, "cost_rec_section_checkbox");
    }

    @FindBy(xpath = "(//input[@value='1'])[5]")
    WebElement default_section_2_pca_template_checkbox;

    public void click_default_section_2_pca_template_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, default_section_2_pca_template_checkbox, logger, "default_section_2_pca_template_checkbox ");
    }

    @FindBy(xpath = "//div[normalize-space()='2.0']/following-sibling::div[1]")
    WebElement default_section_2_title_text_box;

    public void enter_section_2_title_text() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, default_section_2_title_text_box, "C/A section", logger, "default_section_2_title_text_box ");

    }
    @FindBy(xpath = "//span[normalize-space()='3.0']")
    WebElement third_default_section_title;

    public void click_default_section_3() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, third_default_section_title, logger, "third_default_section_title ");
    }

    @FindBy(xpath = "//div[@id='add-section-container']//a[normalize-space()='Section']")
    WebElement add_section_toSection;

    public void click_add_section_toSection_300_times() throws InterruptedException {
        Actions mouseActions = new Actions(driver);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        int totalClicks = 300;
        for (int i = 0; i < totalClicks; i++) {
            add_section_toSection.click();
            Thread.sleep(700);

            if ((i + 1) % 20 == 0) {
                WebElement custom_default_section = driver.findElement(By.xpath("//span[normalize-space()='" + (i - 5) + ".0']"));
                jse.executeScript("arguments[0].scrollIntoView(true)", custom_default_section);
                Thread.sleep(700);
                mouseActions.doubleClick(custom_default_section).perform();
                Thread.sleep(700);
                BaseClass.pca_xml_section().clickAddSectionButton();
            }
        }
        System.out.println("Clicked 'Add Section' button: " + totalClicks + " times");
        logger.log(LogStatus.PASS, "Clicked 'Add Section' button: " + totalClicks + " times");

    }

    public void click_add_section_toSection() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, add_section_toSection, logger, " add_section_toSection ");

        ReusableMethodsLoggersPOM.clickMethod(driver, add_section_toSection, logger, " add_section_toSection ");
    }


    @FindBy(xpath = "//a[normalize-space()='Sub-section']")
    WebElement add_sub_section_toSection;

    public void click_add_sub_section_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_sub_section_toSection, logger, " add_sub_section_toSection ");
    }

    public void click_add_sub_section_toSection_15_times() throws InterruptedException {
        int totalClicks = 15;
        for (int i = 0; i < totalClicks; i++) {
            add_sub_section_toSection.click();
            Thread.sleep(500);
        }
        System.out.println("Clicked the button " + totalClicks + " times.");
    }

    public void click_add_sub_section_toSection_50_times() throws InterruptedException {
        int totalClicks = 50;
        for (int i = 0; i < totalClicks; i++) {
            add_sub_section_toSection.click();
            Thread.sleep(500);
        }
        System.out.println("Clicked the button " + totalClicks + " times.");
    }

    @FindBy(xpath = "//span[normalize-space()='1.1']")
    WebElement default_section_1_1;

    public void click_default_section_1_1() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_1_1, logger, " default_section_1.1 ");
    }

    @FindBy(xpath = "//span[normalize-space()='1.1']/following::input[@value='1'][1]")
    WebElement default_section_1_1_checkbox;

    public void click_default_section_1_1_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, default_section_1_1_checkbox, logger, " default_section_1_1_checkbox");
    }

    @FindBy(xpath = "//span[normalize-space()='2.1']")
    WebElement default_section_2_1;

    public void click_default_section_2_1() {
        //   ReusableMethodsLoggersPOM.mouseHoverMethod(driver, default_section_2_1, logger, "default_section_2_1");

        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_2_1, logger, " default_section_2.1 ");
    }

    @FindBy(xpath = "//span[normalize-space()='10.0']")
    WebElement default_section_10_0;

    public void click_default_section_10_0() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_10_0, logger, " default_section_10_0 ");
    }

    @FindBy(xpath = "//span[normalize-space()='50.0']")
    WebElement default_section_50_0;

    public void click_default_section_50_0() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_50_0, logger, " default_section_50_0 ");
    }

    @FindBy(xpath = "//span[normalize-space()='100.0']")
    WebElement default_section_100_0;

    public void click_default_section_100_0() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_100_0, logger, " default_section_100_0 ");
    }

    @FindBy(xpath = "//span[normalize-space()='150.0']")
    WebElement default_section_150_0;

    public void click_default_section_150_0() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_150_0, logger, " default_section_150_0 ");
    }

    @FindBy(xpath = "//span[normalize-space()='200.0']")
    WebElement default_section_200_0;

    public void click_default_section_200_0() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_200_0, logger, " default_section_200_0 ");
    }

    @FindBy(xpath = "//span[normalize-space()='250.0']")
    WebElement default_section_250_0;

    public void click_default_section_250_0() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_250_0, logger, " default_section_250_0 ");
    }

    @FindBy(xpath = "//span[normalize-space()='10.1']")
    WebElement default_section_10_1;

    public void click_default_section_10_1() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, default_section_10_1, logger, " default_section_10.1 ");
    }

    @FindBy(xpath = "//a[@data-action='add:info_table_sections']")
    WebElement add_smartTable_toSection;

    public void click_add_smartTable_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_smartTable_toSection, logger, " add_smartTable_toSection ");
    }

    @FindBy(xpath = "//select[contains(@id, 'fannie_mae_condition_action_item_')]")
    WebElement fannie_mae_CA_category_dropdown;

    public void select_fannie_mae_CA_category_dropdown() {
        ReusableMethodsLoggersPOM.selectByValue(driver, fannie_mae_CA_category_dropdown, "ie", logger, "fannie_mae_CA_category_dropdown");
    }

    @FindBy(xpath = "//a[normalize-space()='Fannie Mae Details']")
    WebElement add_fannie_mae_ConditionAction_section;

    public void click_add_fannie_mae_ConditionAction_section() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_fannie_mae_ConditionAction_section, logger, "fannie_mae_ConditionAction_section");
    }

    @FindBy(xpath = "//a[@title='Fannie Mae Details']/following-sibling::div[@class='outlineItem-actions']//input[@value='1']")
    WebElement fannie_mae_ConditionAction_section_checkbox;

    public void click_fannie_mae_conditionAction_section_checkbox() {
        //   ReusableMethodsLoggersPOM.mouseHoverMethod(driver, fannie_mae_ConditionAction_section_checkbox, logger, "fannie_mae_ConditionAction_section");
        ReusableMethodsLoggersPOM.clickMethod(driver, fannie_mae_ConditionAction_section_checkbox, logger, "fannie_mae_ConditionAction_section");
    }


    @FindBy(xpath = "//a[normalize-space()='Fannie Mae Details Sub Section']")
    WebElement add_fannie_mae_ConditionAction_sub_section;

    public void click_add_fannie_mae_ConditionAction_sub_section() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_fannie_mae_ConditionAction_sub_section, logger, "add_fannie_mae_ConditionAction_sub_section");
    }

    @FindBy(xpath = "(//a[@title='Fannie Mae Details']/following-sibling::div[@class='outlineItem-actions']//input[@value='1'])[2]")
    WebElement fannie_mae_ConditionAction_sub_section_checkbox;

    public void click_fannie_mae_conditionAction_sub_section_checkbox() {
        //  ReusableMethodsLoggersPOM.mouseHoverMethod(driver, fannie_mae_ConditionAction_sub_section_checkbox, logger, "fannie_mae_ConditionAction_sub_section");
        ReusableMethodsLoggersPOM.clickMethod(driver, fannie_mae_ConditionAction_sub_section_checkbox, logger, "fannie_mae_ConditionAction_sub_section");
    }

    @FindBy(xpath = "//a[@data-action='add:pdf_link_sections']")
    WebElement add_pdf_link_section;
    public void click_add_pdf_link_section() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_pdf_link_section, logger, "add_pdf_link_section");}

    @FindBy(xpath = "//a[normalize-space()='Select PDF']")
    WebElement select_pdf_link_button;
    public void click_select_pdf_link_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, select_pdf_link_button, logger, "select_pdf_link_button");}

    @FindBy(xpath = "//img[@class='appendix-item-thumb-img']")
    WebElement PDF_Link_popup;
    public void click_PDF_Link_in_popup() {
        ReusableMethodsLoggersPOM.clickMethod(driver, PDF_Link_popup, logger, "PDF_Link_popup");}


    @FindBy(xpath = "//a[@title='PDF Link']")
    WebElement pdf_link_section;
    @FindBy(xpath = "//a[@title='PDF Link']/following-sibling::div[@class='outlineItem-actions']//input[@value='1']")
    WebElement pdf_link_section_checkbox;

    public void hover_and_click_pdf_link_section_checkbox() throws InterruptedException {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, pdf_link_section, logger, "pdf_link_section");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, pdf_link_section_checkbox, logger, "pdf_link_section_checkbox");
    }


    @FindBy(xpath = "//a[normalize-space()='Image Section']")
    WebElement add_imageSection_toSection;
    public void click_add_imageSection_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_imageSection_toSection, logger, " add_imageSection_toSection ");}

    @FindBy(xpath = "//a[normalize-space()='Choose Photos from Gallery']")
    WebElement choose_photo_from_gallery_button;
    public void click_choose_photo_from_gallery_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, choose_photo_from_gallery_button, logger, " choose_photo_from_gallery_button");}


    @FindBy(xpath = "//li[contains(@class,'appendix_file js-imageSelectionItem js-leavesTableOpen')]")
    List <WebElement> gallery_images_popup;
    public void click_all_gallery_images_in_popup() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for (WebElement element : gallery_images_popup) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            Thread.sleep(500);
        }
    }

    @FindBy(xpath = "//div[@class='appendix-item-caption'][normalize-space()='signature']")
    WebElement signature_image_popup;
    public void click_signature_image_in_popup() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, signature_image_popup, logger, " signature_image_popup ");
    }


    @FindBy(xpath = "//span[contains(@data-title,'Section I:')]")
    //  @FindBy(xpath = "//a[@id='gen_info_form_outline']")
    WebElement section_I_general_details;

    public void click_section_I_general_details_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_I_general_details, logger, " section_I_general_details ");
    }

    //    @FindBy(xpath = "//a[@id='unit_details_form_outline']")
    @FindBy(xpath = "//span[contains(@data-title,'Section II:')]")
    WebElement section_II_unit_details;
    public void click_section_II_unit_details_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_II_unit_details, logger, " section_II_unit_details ");}



    @FindBy(xpath = "//span[@class='multiselect-selected-text']")
    WebElement conditionAction_dropdown_button;
    public void click_conditionAction_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, conditionAction_dropdown_button, logger, " conditionAction_dropdown_button ");}

    @FindBy(xpath = "//label[normalize-space()='HREC']")
    WebElement conditionAction_dropdown_value_HREC;
    public void click_conditionAction_dropdown_value_HREC() {
        ReusableMethodsLoggersPOM.clickMethod(driver, conditionAction_dropdown_value_HREC, logger,  " conditionAction_dropdown_value_HREC ");}


    @FindBy(xpath = "//ul[@class='multiselect-container dropdown-menu']//li")
    WebElement conditionAction_dropdown_list;


    public void click_conditionAction_dropdown_first_item() {
        ReusableMethodsLoggersPOM.clickMethod(driver, conditionAction_dropdown_list, logger, " conditionAction_dropdown_list ");
    }

    @FindBy(xpath = "//select[contains(@name,'package_data_item[')]")
List<WebElement> conditionAction_dropdown_items;
    @FindBy(xpath = "//input[contains(@name,'cost')]")
    WebElement CA_section_cost;

    public void click_conditionAction_dropdown_items() {
        for (WebElement element : conditionAction_dropdown_items) {
            // Ensure each element is visible and clickable
            ReusableMethodsLoggersPOM.selectByIndex(driver, element, 1, logger," conditionAction_dropdown_items ");
        }
    }
public void enter_ca_section_cost() {
    ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, CA_section_cost, "1000", logger, " CA_section_cost ");
}


    @FindBy(xpath = "//td[@class='hrec']//i[@class='fa fa-check']")
    WebElement projSummary_HREC_checked;

    @FindBy(xpath = "//td[@class='opinion' and contains(text(), 'QA automation testing condition/action text script')]")
    WebElement projSummary_opinion_field;
    public void verify_projSummary_details_FM_1104_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, projSummary_HREC_checked, true, logger, " projSummary_HREC_check_isVisible ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, projSummary_opinion_field, true, logger, " projSummary_opinion_field ");
    }

    @FindBy(xpath = "//table[contains(@class, 'table itemization')]//thead/following-sibling::tbody/tr")
    WebElement QP_proj_summary_section;

    @FindBy(xpath = "//td[normalize-space()='C/A section']/following-sibling::*//i[@class='fa fa-check']")
    WebElement QP_proj_summary_noAction_checked;

    @FindBy(xpath = "//td[normalize-space()='C/A section']/following-sibling::*//span[normalize-space()='Yes']")
    WebElement QP_proj_summary_yes_field;

    @FindBy(xpath = "//td[@class='estimated-cost' and normalize-space(text())='1000']")
    WebElement QP_proj_summary_cost_field;

    public void verify_QP_proj_summary_section() {

            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, QP_proj_summary_noAction_checked, true, logger, " QP_proj_summary_noAction_checked ");

        String QP_proj_summary_text = ReusableMethodsLoggersPOM.captureTextMethod(driver, QP_proj_summary_section, logger, " QP_proj_summary_section ");
        if (QP_proj_summary_text.contains("QA automation testing condition/action text script") && QP_proj_summary_text.contains("C/A section")) {
            System.out.println("QA automation testing condition/action text script is displayed");
            logger.log(LogStatus.PASS, "QA automation testing condition/action text script is displayed");
        } else {
            System.out.println("QA automation testing condition/action text script is not displayed");
            logger.log(LogStatus.FAIL, "QA automation testing condition/action text script is not displayed");
        }

    }
    @FindBy(xpath = "//span[normalize-space()='QA automation testing condition/action text script']")
    WebElement QP_proj_summary_text;

        public void verify_QP_proj_summary_section2() {
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, QP_proj_summary_yes_field, true, logger, " QP_proj_summary_yes_field ");
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, QP_proj_summary_cost_field, true, logger, " QP_proj_summary_cost_field ");
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, QP_proj_summary_text, true, logger, " QP_proj_summary_text ");
        }

    @FindBy(xpath = "//table[contains(@class, 'table-bordered')]")

 //   @FindBy(xpath = "//table[@class='table summary-immediate table-bordered']")
    WebElement QP_proj_summary_repairs_text;
    public void verify_QP_proj_summary_section_matrix() {

        String QP_proj_summary_text = ReusableMethodsLoggersPOM.saveTextMethod(driver, QP_proj_summary_section, logger, " verify_QP_proj_summary_section_matrix ");
        if (QP_proj_summary_text.contains("C/A section")) {
            System.out.println("QA automation testing condition/action text script is displayed");
            logger.log(LogStatus.PASS, "QA automation testing condition/action text script is displayed");
        } else {
            System.out.println("QA automation testing condition/action text script is not displayed");
            logger.log(LogStatus.FAIL, "QA automation testing condition/action text script is not displayed");
        }


        String QP_proj_summary_text_repairs = ReusableMethodsLoggersPOM.saveTextMethod(driver, QP_proj_summary_repairs_text, logger, " QP_proj_summary_repairs_text ");
        if ( QP_proj_summary_text_repairs.contains("$50")) {
            System.out.println("Successful - QA automation testing C/A repairs - text AS Expected");
            logger.log(LogStatus.PASS, "Successful - QA automation testing C/A repairs - text AS Expected");
        } else {
            System.out.println("QA automation testing C/A repairs - text NOT AS Expected");
            logger.log(LogStatus.FAIL, "QA automation testing C/A repairs - text NOT AS Expected");
        }
    }


    @FindBy(xpath = "//textarea[contains(@name,'package_data_item[')]")
    WebElement conditionAction_comment_field;
    public void enter_conditionAction_comment_field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, conditionAction_comment_field, "QA automation testing condition/action text script" , logger,  " conditionAction_opinion_field ");}

    @FindBy(xpath = "//i[@class='fa fa-exclamation-circle js-has-warning-tooltip']")
    WebElement section_II_error_message;
    public void verify_section_II_error_message() {
        ReusableMethodsLoggersPOM.errorDisplayed(driver, section_II_error_message, logger, " section_II_items ");


    }

    @FindBy(xpath = "//input[@name='unit_mix_purpose_occupied_count']")
    WebElement occupied_field_section_II_unit_details;

    public void enter_occupied_field_section_II_unit_details() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, occupied_field_section_II_unit_details, "10", logger, " occupied_field_section_II_unit_details ");
    }

    @FindBy(xpath = "//a[normalize-space()='Carports']")
    WebElement carport_item__section_II;

    public void click_carport_item__section_II() {
        ReusableMethodsLoggersPOM.clickMethod(driver, carport_item__section_II, logger, " carport_item__section_II ");
    }

    @FindBy(xpath = "//a[normalize-space()='Garages']")
    WebElement garages_item__section_II;

    public void click_garages_item__section_II() {
        ReusableMethodsLoggersPOM.clickMethod(driver, garages_item__section_II, logger, " garages_item__section_II ");
    }

    public void enter_costItem_details_sectionII() throws InterruptedException {
        BaseClass.staging5().enter_eul_propertyItem();
        Thread.sleep(500);
        BaseClass.staging5().enter_rul_propertyItem();
        Thread.sleep(500);
        BaseClass.staging5().click_condition_dropDown_propertyItem();
        Thread.sleep(500);
        BaseClass.staging5().select_condition_dropDown_propertyItem();
        Thread.sleep(500);
        BaseClass.staging5().click_action_dropDown_propertyItem();
        Thread.sleep(500);
        BaseClass.staging5().select_action_dropDown_propertyItem();
        Thread.sleep(500);
        BaseClass.staging5().enter_item_comments_propertyItem();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
    }

    @FindBy(xpath = "//input[@name='feature_item[data][eul]']")
    WebElement eul_propertyItem;

    public void enter_eul_propertyItem() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, eul_propertyItem, "10", logger, " eul_propertyItem ");
    }

    @FindBy(xpath = "//input[@name='feature_item[data][rul]']")
    WebElement rul_propertyItem;

    public void enter_rul_propertyItem() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, rul_propertyItem, "5", logger, " rul_propertyItem ");
    }


    @FindBy(xpath = "(//span[@class='multiselect-native-select'])[1]")
    WebElement condition_dropDown_propertyItem;

    public void click_condition_dropDown_propertyItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, condition_dropDown_propertyItem, logger, " condition_dropDown_propertyItem ");
    }

    @FindBy(xpath = "//label[normalize-space()='A']")
    WebElement condition_dropDown_item_propertyItem;

    public void select_condition_dropDown_propertyItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, condition_dropDown_item_propertyItem, logger, " condition_dropDown_item_propertyItem ");
    }


    @FindBy(xpath = "(//span[@class='multiselect-native-select'])[2]")
    WebElement action_dropDown_propertyItem;

    public void click_action_dropDown_propertyItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, action_dropDown_propertyItem, logger, " action_dropDown_propertyItem ");
    }

    @FindBy(xpath = "//input[@value='cr']")
    WebElement action_dropDown_item_propertyItem;

    public void select_action_dropDown_propertyItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, action_dropDown_item_propertyItem, logger, " action_dropDown_item_propertyItem ");
    }

    @FindBy(xpath = "//textarea[@id='feature_item_data_comments']")
    WebElement item_comments_propertyItem;

    public void enter_item_comments_propertyItem() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, item_comments_propertyItem, "QA Automation Test", logger, " item_comments_propertyItem ");
    }


    @FindBy(xpath = "//span[contains(@data-title,'Section III:')]")
//    @FindBy(xpath = "//a[@id='pca_form_outline']")
    WebElement section_III_property_details;

    public void click_section_III_property_details_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_III_property_details, logger, " section_III_property_details ");
    }

    @FindBy(xpath = "//span[contains(@data-title,'Section IV:')]")
//    @FindBy(xpath = "//a[@id='esa_form_outline']")
    WebElement section_IV_esa_details;

    public void click_section_IV_esa_details_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_IV_esa_details, logger, " section_IV_esa_details ");
    }

    @FindBy(xpath = "//span[contains(@data-title,'Section V:')]")
//    @FindBy(xpath = "//a[@id='repair_form_outline']")
    WebElement section_V_repair_details;

    public void click_section_V_repair_details_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_V_repair_details, logger, " section_V_repair_details ");
    }

//    @FindBy(xpath = "//a[@id='definition_form_outline']")
//    WebElement section_VI_definition_details;
//    public void click_section_VI_definition_details_sectionView() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, section_VI_definition_details, logger, " section_VI_definition_details ");
//    }

    // @FindBy(xpath = "//span[normalize-space()='Section IV: Capital Needs Over the Loan Term']")
    @FindBy(xpath = "//span[contains(@data-title,'Section VI:')]")
    WebElement section_VI_capital_details;

    public void click_section_VI_details() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_VI_capital_details, logger, " section_VI_capital_details ");
    }


    @FindBy(xpath = "//a[@class='btn btn-subtle btn-sm add-cost-summary'][normalize-space()='Add Cost Recommendation']")
    WebElement add_cost_recommendation_button_section_III;

    public void click_add_cost_recommendation_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_cost_recommendation_button_section_III, logger, " add_cost_recommendation_button_section_III ");
    }


    @FindBy(xpath = "//input[@id='cost_summary_keyword_lookup_id']")
    WebElement item_name_cost_recommendation;

    public void enter_item_name_cost_recommendation() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, item_name_cost_recommendation, "test item", logger, " item_name_cost_recommendation ");
    }

    @FindBy(xpath = "//select[@id='cost_summary_custom_item_name']")
    WebElement item_name_dropdown_cost_recommendation;

    public void select_carportItem_cost_recommendation() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, item_name_dropdown_cost_recommendation, 1, logger, " carport item name dropdown ");
    }

    public void select_garagesItem_cost_recommendation() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, item_name_dropdown_cost_recommendation, 1, logger, " garages item name dropdown ");
    }

    @FindBy(xpath = "//table[@class='table cost-summary js-fmac1104-costSummaryTable']//tbody")
    WebElement fm_1104_table_cost_summary;

    public void capture_fm_1104_table_cost_summary() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, fm_1104_table_cost_summary, logger, " fm_1104_table_cost_summary ");
    }

    @FindBy(xpath = "//table[@class='table cost-summary']//tbody")
    WebElement fm_1105_table_cost_summary;

    public void verify_fm_1105_table_cost_summary() {
      String fm_1105_table_cost_summary_text =  ReusableMethodsLoggersPOM.captureTextMethod(driver, fm_1105_table_cost_summary, logger, " fm_1105_table_cost_summary ");
        if (fm_1105_table_cost_summary_text.equalsIgnoreCase("Carports\n" +
                "Critical\n" +
                "$50\n" +
                "Garages\n" +
                "Critical\n" +
                "$50\n" +
                "Total $100") )
                {

            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "cost rec table matches whats expected");
            System.out.println("cost rec table matches whats expected");

        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "cost rec DOES NOT match of whats expected");
            System.out.println("cost rec DOES NOT  match of whats expected");

            // Optionally, fail the test or take other actions
        }
    }

    @FindBy(xpath = "//input[@id='cost_summary_quantity']")
    WebElement cost_summary_quantity;

    public void enter_cost_summary_quantity() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, cost_summary_quantity, "10", logger, " cost_summary_quantity ");
    }


    @FindBy(xpath = "//input[@id='cost_summary_unit_cost']")
    WebElement cost_summary_unit_cost;

    public void enter_cost_summary_unit_cost() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, cost_summary_unit_cost, "5", logger, " cost_summary_unit_cost ");
    }

    @FindBy(xpath = "//input[@id='enable_cost_data_immediate']")
    WebElement critical_repair_cost_checkbox;

    public void click_critical_repair_cost_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, critical_repair_cost_checkbox, logger, " critical_repair_cost_checkbox ");
    }

    @FindBy(xpath = "//input[@id='enable_cost_data_short_term_1']")
    WebElement critical_repair_cost_checkbox_fm1105;

    public void click_critical_repair_cost_checkbox_fm1105() {
        ReusableMethodsLoggersPOM.clickMethod(driver, critical_repair_cost_checkbox_fm1105, logger, " critical_repair_cost_checkbox_fm1105 ");
    }

    @FindBy(xpath = "//textarea[@id='cost_summary_comments']")
    WebElement cost_summary_comments;

    public void enter_cost_summary_comments() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, cost_summary_comments, "qa test script", logger, " cost_summary_comments ");
    }

    @FindBy(xpath = "//li[@class='insert-title-page js-add-intro-page-action']")
    WebElement add_titlePage_toSection;

    public void click_add_titlePage_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_titlePage_toSection, logger, " add_titlePage_toSection ");
    }

    @FindBy(xpath = "//a[contains(text(),'Cover Letter')]")
    WebElement add_coverLetter_toSection;

    public void click_add_coverLetter_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_coverLetter_toSection, logger, " add_coverLetter_toSection ");
    }

    @FindBy(xpath = "//a[@data-action='add:cost_summary_sections']")
    WebElement add_costRecommendation_toSection;

    public void click_add_costRecommendation_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_costRecommendation_toSection, logger, " add_costRecommendation_toSection ");
    }

    @FindBy(xpath = "//li[@class='insert-executive-summary js-add-intro-page-action']")
    WebElement add_execSummary_toSection;
    public void click_add_execSummary_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_execSummary_toSection, logger, " add_execSummary_toSection ");}

    @FindBy(xpath = "//li[@class='insert-package-summary js-add-intro-page-action']")
    WebElement add_projSummary_toSection;
    public void click_add_projSummary_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_projSummary_toSection, logger, " add_projSummary_toSection ");}

    @FindBy(xpath = "//span[normalize-space()='Project Summary']")
    WebElement projSummary_sectionView;
    public void click_projSummary_sectionView_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projSummary_sectionView, logger, " projSummary_sectionView ");}

    @FindBy(xpath = "//a[@data-action='add:package_data_items/create_as_section']")
    WebElement add_conditionAction_toSection;
    public void click_add_conditionAction_toSection() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_conditionAction_toSection, logger, " add_conditionAction_toSection ");}

    @FindBy(xpath = "//input[@value='Save' and @class='btn btn-primary']")
    WebElement save_button_new;

    public void click_save_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, save_button_new, logger, " save_button_new ");
    }

    @FindBy(xpath = "//a[@id='save-and-add-another']")
    WebElement save_and_add_another_button;

    public void click_save_and_add_another_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, save_and_add_another_button, logger, " save_and_add_another_button ");
    }

    @FindBy(xpath = "//span[normalize-space()='Export to Excel File']")
    WebElement export_to_excel_file_dropdown_button;

    public void click_export_to_excel_file_dropdown_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_to_excel_file_dropdown_button, logger, " export_to_excel_file_dropdown_button ");
    }



    @FindBy(xpath = "//a[@id='cover_letter_outline']")
    WebElement coverLetter_sectionView;

    public void click_coverLetter_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, coverLetter_sectionView, logger, " coverLetter_sectionView ");
    }

    @FindBy(xpath = "//a[@id='title_page_outline']")
    WebElement title_page_sectionView;

    public void click_title_page_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, title_page_sectionView, logger, " title_page_sectionView ");
    }

    @FindBy(xpath = "//a[@id='report_summary_outline']")
    WebElement executive_summary_sectionView;
    public void click_executive_summary_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, executive_summary_sectionView, logger, " executive_summary_sectionView ");}

    @FindBy(xpath = "//a[contains(@id, 'condition_action_') and contains(@id, '_outline') and contains(@id, 'summary_')]")
    WebElement project_summary_sectionView;

    @FindBy(xpath = "//a[@id='quire_esa_condition_action_summary_outline']/following::input[@value='1']")
    WebElement project_summary_sectionView_checkBox;

    public void hover_and_click_project_summary_sectionView_checkbox() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, project_summary_sectionView, logger, " project_summary_sectionView");
        ReusableMethodsLoggersPOM.clickMethod(driver, project_summary_sectionView_checkBox, logger, " project_summary_sectionView_checkBox");}
    public void click_project_summary_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, project_summary_sectionView, logger, " project_summary_sectionView");} //

    @FindBy(xpath = "//span[@class='editor-title editable-submit js-sectionTitleDisplay']")
    WebElement introPage_title_field;
    public void enter_introPage_title_field() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, introPage_title_field, "Updated Project Summary Tablee", logger, " introPage_title_field");}

    @FindBy(xpath = "//span[normalize-space()='Updated Project Summary Tablee']")
    WebElement updated_name_projectSummary_sectionView;

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//span[contains(text(), 'Updated Project Summary Tablee')]")
    WebElement updated_name_projectSummary_title;

    public void verify_updated_name_projectSummary_sectionView() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, updated_name_projectSummary_title, true ,  logger, " updated_name_projectSummary_title ");

        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, updated_name_projectSummary_sectionView, true ,  logger, " updated_name_projectSummary_sectionView ");}

    @FindBy(xpath = "//a[contains(text(),'Updated Project Summary Tablee') and @class='js-sectionLink']")
    WebElement link_updated_project_summary_to_section;
    public void click_link_updated_project_summary_to_section() {
        ReusableMethodsLoggersPOM.clickMethod(driver, link_updated_project_summary_to_section, logger, " link_updated_project_summary_to_section ");}



    @FindBy(xpath = "//a[@class='outline-action--export outline-action--btn js-outline-action has-tooltip']")
    WebElement sectionView_export;
    public void click_sectionView_export() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_export, logger, " sectionView_export ");}

    @FindBy(xpath = "//div[@class='js-exportSections-exportAsCheckboxField exportSections-exportAsCheckboxField cursor-pointer text-lg font-bold height-percent-40 flexContainer flex-align-center']")
    WebElement sectionView_export_to_word_button;
    public void click_sectionView_export_to_word_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_export_to_word_button, logger, " sectionView_export_to_word_button");
    }

    @FindBy(xpath = "//div[contains(text(), 'Appendices are not included when exporting to Word, so they have been removed/disabled')]")
    WebElement verify_export_to_word_message;
    public void verify_export_to_word_message() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, verify_export_to_word_message, true,  logger, " verify_export_to_word_message");
    }

    @FindBy(xpath = "//input[@value='Export Sections']")
    WebElement export_sections_button;
    public void click_export_sections_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_sections_button,logger, " export_sections_button");
    }



    @FindBy(xpath = "//li[@class='outlineItem info_table_section sortable-body-item linkable indent-level-1 ui-sortable-handle active']//input[@value='1']")
    WebElement smartTable_check_box_sectionView;
    public void click_smartTable_check_box_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, smartTable_check_box_sectionView, logger, " smartTable_check_box_sectionView ");
    }

    @FindBy(xpath = "//i[@class='fa fa-trash']")
    WebElement trash_icon_sectionView;

    public void click_trash_icon_sectionView() {
        ReusableMethodsLoggersPOM.clickMethod(driver, trash_icon_sectionView, logger, " trash_icon_sectionView ");
    }


    @FindBy(xpath = "//a[@class='cke_dialog_ui_button cke_dialog_ui_button_ok']")
    WebElement ok_button_footNote;

    public void click_ok_button_footNote() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ok_button_footNote, logger, " ok_button_footNote ");
    }

    @FindBy(xpath = "//div[@class='ht_clone_top handsontable']//a[@class='column-definition-settings-dropdown js-column-definition-settings-dropdown']")
    WebElement column_dropdown;

    public void click_column_dropdown_smartTable() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, column_dropdown, logger, " column_dropdown ");
        Thread.sleep(1000);

        ReusableMethodsLoggersPOM.clickMethod(driver, column_dropdown, logger, " column_dropdown ");
    }

    public void click_column_dropdown_smartTable_prod() {
        ReusableMethodsLoggersPOM.clickMethod(driver, column_dropdown, logger, " column_dropdown ");
    }



    @FindBy(xpath = "//input[@id='unassigned_items_search']")
    WebElement QA_wordBank_searchField;

    public void enter_QA_wordBank_unassigned_items() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, QA_wordBank_searchField, "QA_wordBank", logger, " QA_wordBank_searchField ");

        //  ReusableMethodsLoggersPOM.clickMethod(driver, QA_wordBank_searchField, logger, " QA_wordBank_searchField ");
        ReusableMethodsLoggersPOM.submitMethod(driver, QA_wordBank_searchField, logger, " QA_wordBank_searchField ");
    }

    public void enter_QA_ST_wordBank_unassigned_items() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, QA_wordBank_searchField, "QA_WordBank_Smart_Table_New_Item", logger, " QA_wordBank_searchField ");
        ReusableMethodsLoggersPOM.submitMethod(driver, QA_wordBank_searchField, logger, " QA_wordBank_searchField ");

    }


    @FindBy(xpath = "(//div[@class='assignmentList-item js-assignmentList-item'])[1]")
    WebElement unassigned_smartTable_dropdown_values;

    public void hover_unassigned__dropdown_value() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, unassigned_smartTable_dropdown_values, logger, " unassigned__dropdown_value ");}
    public void click_unassigned_smartTable_dropdown_values() {
        ReusableMethodsLoggersPOM.clickMethod(driver, unassigned_smartTable_dropdown_values, logger, " unassigned_smartTable_dropdown_values ");}
    @FindBy(xpath = "//div[@class='item-controls']//i[@class='fa fa-arrow-right']")
    WebElement unassigned_items_right_arrow;

    public void click_unassigned_items_right_arrow() {
        ReusableMethodsLoggersPOM.clickMethod(driver, unassigned_items_right_arrow, logger, " unassigned_item_right_arrow ");
    }



    @FindBy(xpath = "//*[contains(text(),'QA WordBank')]")
    WebElement QA_wordBank_unassigned_item;

    public void click_QA_wordBank_unassigned_item() {

        ReusableMethodsLoggersPOM.clickMethod(driver, QA_wordBank_unassigned_item, logger, "QA_wordBank_unassigned_item");
    }


    @FindBy(xpath = "//button[@type='button'][normalize-space()='Add']")
    WebElement add_button;

    public void click_add_button_unassigned_item() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_button, logger, "add_button");
    }

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[2]")
    WebElement add_button_package;

    public void click_add_button_unassigned_package() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_button_package, logger, "add_button_package");
    }
    @FindBy(xpath = "//a[@title='Insert']")
    WebElement insert_wordbank_arrow_button;

    public void click_insert_wordbank_arrow_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_wordbank_arrow_button, logger, "insert_wordbank_arrow_button");
    }

  //  @FindBy(xpath = "(//div[@class='editor-section-title spellCheck-pending'])[2]")
  @FindBy(xpath = "//div[@id='modal']")
  WebElement out_of_modal;
    public void click_out_of_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, out_of_modal, logger, "out_of_modal");}

    @FindBy(xpath = "//div[@class='report-appendices-title']")
    WebElement appendix_header;
    public void click_appendix_header() {
        ReusableMethodsLoggersPOM.clickMethod(driver, appendix_header, logger, "appendix_header");}

    @FindBy(xpath = "//div[@class='content-positioner']")
    WebElement out_of_section;
    public void click_out_of_section() {
        ReusableMethodsLoggersPOM.clickMethod(driver, out_of_section, logger, "out_of_section");}

    @FindBy(xpath = "//div[@title='Expand']")
    WebElement pixel_out_of_section;

    public void click_pixel_out_of_section() {

// Move to the element and offset 10 pixels to the right (x: +10, y: 0)
        Actions actions = new Actions(driver);
        actions.moveToElement(pixel_out_of_section, 10, 0).click().perform();}

    @FindBy(xpath = "//div[normalize-space()='1.0']")
    WebElement default_section_case;

    public void click_section_1_header() {
        ReusableMethodsLoggersPOM.clickMethod(driver, default_section_case, logger, "1.0 Default_section_title");
    }

    @FindBy(xpath = "//div[normalize-space()='2.0']")
    WebElement section_2_header;

    public void click_section_2_header() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_2_header, logger, "section_2_header");
    }

    @FindBy(xpath = "//div[contains(text(), 'mart') and contains(text(), 'able')]")
    WebElement smart_table_title_header;

    public void click_smartTable_title_header() {
        ReusableMethodsLoggersPOM.clickMethod(driver, smart_table_title_header, logger, "smart_table_title_header");
    }


    @FindBy(xpath = "//span[@class='cke_button_icon cke_button__quire_insert_section_link_icon']")
    WebElement section_link_ck_modal;

    public void click_section_link_ck_modal() {
        ReusableMethodsLoggersPOM.clickMethod(driver, section_link_ck_modal, logger, "section_link_ck_modal ");
    }


    @FindBy(xpath = "//li[@class='sectionPicker-section outlineItem report_section sortable-body-item indent-level-0 can-export-into-prohibited-import-sections linkable ui-sortable-handle']//a[1]")
    WebElement link_to_section_defaultSectionTitle;

    public void click_link_to_section_defaultSectionTitle() {
        ReusableMethodsLoggersPOM.clickMethod(driver, link_to_section_defaultSectionTitle, logger, "link_to_section_defaultSectionTitle ");
    }
//td[@class='htLeft quire-rich-text current highlight']//span[contains(@class, 'has-tooltip') and contains(@class, 'js-quire-section-link') and contains(@class, 'mceNonEditable')]


    @FindBy(xpath = "//span[@class='has-tooltip js-quire-section-link mceNonEditable quire-section-link cke_widget_element']")
    WebElement linked_section_text_smartTable;


    public void doubleclick_linked_section_text() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, linked_section_text_smartTable, logger, "linked_section_text ");
    }

    public void verify_sectionLink_smartTable_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, linked_section_text_smartTable, true, logger, "linked_section_text_smartTable ");}

    public void verify_linked_sectionLink_isNot_visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, linked_section_text_smartTable, false, logger, "linked_section_text ");
    }

    @FindBy(xpath = "//span[contains(@class, 'has-tooltip') and contains(@class, 'js-quire-section-link') and contains(@class, 'mceNonEditable') and contains(@class, 'quire-section-link')]")
    WebElement linked_section_text;

    public void verify_sectionLink_isVisible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, linked_section_text, true, logger, "linked_section_text ");}






    @FindBy(xpath = "//td[@class='cke_dialog_ui_hbox_first']")
    WebElement unlink_button_sectionLink_view;

    public void click_unlink_button_sectionLinkView() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, unlink_button_sectionLink_view, logger, "unlink_button_sectionLink_view ");
    }

    @FindBy(xpath = "//a[@class='cke_dialog_ui_button cke_dialog_ui_button_ok']")
    WebElement submit_button;
    public void click_submit_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, submit_button, logger, "submit_button ");
    }

    @FindBy(xpath = "(//table[@class='htCore'])[1]")
    WebElement portfolio_text;

    public void capture_portfolio_text() {
        // Get all rows of the table
        List<WebElement> rows = portfolio_text.findElements(By.tagName("tr"));
       // System.out.println("Number of rows in the table: " + rows.size());

        // Loop through each row
        for (WebElement row : rows) {
            // Get all columns of the current row
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Loop through each column
            for (WebElement column : columns) {
                // Capture and print the text of the cell
                System.out.print(column.getText() + "\t");
                logger.log(LogStatus.PASS, column.getText() + "\t");

            }
            System.out.println(); // Move to the next line after each row
        }
    }// include printing out table header


    @FindBy(xpath = "(//table[@class='htCore'])[2]")
    WebElement header_text;

    public void capture_header_text() {
        // Get all rows of the table
        List<WebElement> rows = header_text.findElements(By.tagName("tr"));
        // System.out.println("Number of rows in the table: " + rows.size());

        // Loop through each row
        for (WebElement row : rows) {
            // Get all columns of the current row
            List<WebElement> columns = row.findElements(By.tagName("td"));

            // Loop through each column
            for (WebElement column : columns) {
                // Capture and print the text of the cell
                System.out.print(column.getText() + "\t");
                logger.log(LogStatus.PASS, column.getText() + "\t");

            }
            System.out.println(); // Move to the next line after each row
        }
    }// include printing out table header
    @FindBy(xpath = "(//thead)[2]")
    WebElement table_header2;
    public void capture_table_header() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable((table_header2)));
        String tableHeaderText = element.getText();
        String[] headerWords = tableHeaderText.split("\\s+"); // Split the header text by whitespace
        String headerWithTabs = String.join("\t", headerWords); // Join the words with tabs between them
        System.out.println("\n" + headerWithTabs);
        logger.log(LogStatus.PASS, headerWithTabs);
    }


    //String zipFilePath = System.getProperty("user.dir") + "/src/main/java/downloads/123456_SRA.zip";

    public void unZip_SRA_XML_Folder() {
        try {
            ReusableMethodsLoggersPOM.unzipMethod("src/main/java/downloads/", "src/main/java/downloads/123456_SRA.zip");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void unZip_ESA_XML_Folder() {
        try {
            ReusableMethodsLoggersPOM.unzipMethod("src/main/java/downloads/", "src/main/java/downloads/123456_ESA.zip");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void unZip_PCA_XML_Folder() {
        try {
            ReusableMethodsLoggersPOM.unzipMethod("src/main/java/downloads/", "src/main/java/downloads/123456_PCA.zip");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void unZip_ZON_XML_Folder() {
        try {
            ReusableMethodsLoggersPOM.unzipMethod("src/main/java/downloads/", "src/main/java/downloads/123456_ZON.zip");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public void capture_PCA_version_from_XML() {
        ReusableMethodsLoggersPOM.captureXMLdata("nns1:noNamespaceSchemaLocation", "src/main/java/downloads/123456_PCA.xml", logger, "PCA Version ");
    }

    public void capture_SRA_version_from_XML() {
        ReusableMethodsLoggersPOM.captureXMLdata("nns1:noNamespaceSchemaLocation", "src/main/java/downloads/123456_SRA.xml", logger, "SRA Version ");
    }

    public void capture_ESA_version_from_XML() {
        ReusableMethodsLoggersPOM.captureXMLdata("nns1:noNamespaceSchemaLocation", "src/main/java/downloads/123456_ESA.xml", logger, "ESA Version ");
    }

    public void capture_ZON_version_from_XML() {
        ReusableMethodsLoggersPOM.captureXMLdata("nns1:noNamespaceSchemaLocation", "src/main/java/downloads/123456_ZON.xml", logger, "ZON Version ");
    }

    @FindBy(xpath = "//a[contains(@title, '!@#$%^&*()test@quiretest.com')]")
    WebElement generated_pdf_header_footer_link;
    public void verify_header_footer_PDF_contents() throws IOException, InterruptedException {

     //  String pdf_url = ReusableMethodsLoggersPOM.captureAttributeMethod(driver, generated_pdf_header_footer_link, logger, "generated_pdf_href_link", "href");
         BaseClass.reportfoldersection().click_GeneratedPDF_button();
        Thread.sleep(4000);


//        //switch to next tab and capture url
     //   BaseClass.reportfoldersection().change_to_next_tab();
    //    Thread.sleep(500);
     //   BaseClass.staging5().captureURL();
     //   Thread.sleep(1500);


        String currentMonth = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM"));
        String currentYear = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy"));

       // String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
       // String pdfContent=   ReusableMethodsLoggersPOM.getPdfContent_from_downloads("!@#$%^&*()test@quiretest.com" + currentDate + ".pdf");
        String pdfContent=   ReusableMethodsLoggersPOM.getPDFContent_from_most_recent_download();

        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);


// Assertion 1
        boolean assertionResult1 = pdfContent.contains("QA - Right Header Text Sample") && pdfContent.contains("test@quiretest.com") && pdfContent.contains(currentMonth);
        ;
        softAssert.assertTrue(assertionResult1);
        if (assertionResult1) {
            System.out.println("Header Text Verification passed for: " + currentMonth + " , " + "QA - Right Header Text Sample , test@quiretest.com");
            logger.log(LogStatus.PASS, "Assertion 1 passed: The Header texts are present in the PDF content." + currentMonth);
        } else {
            System.out.println("Assertion 1 failed: The Header texts are NOT present in the PDF content.");
            logger.log(LogStatus.FAIL, "Assertion 1 failed: The Header texts are NOT present in the PDF content.");
        }

        // Assertion 2
        boolean assertionResult2 = pdfContent.contains("QA - Right Footer Text Sample") && pdfContent.contains("test@quiretest.com") && pdfContent.contains(currentYear);
        softAssert.assertTrue(assertionResult2);
        if (assertionResult2) {
            System.out.println("Footer Text Verification passed for: " + currentYear + " , " + "QA - Right Footer Text Sample , Report_tag_value");
            logger.log(LogStatus.PASS, "Assertion 2 passed: The Footer texts are present in the PDF content.");
        } else {
            System.out.println("Assertion 2 failed: The Footer texts are NOT present in the PDF content.");
            logger.log(LogStatus.FAIL, "Assertion 1 failed: The Header texts are NOT present in the PDF content.");
        }
// Assert all
        softAssert.assertAll();

            // BaseClass.reportfoldersection().change_to_default_tab();
        // Switch back to the original window if no PDF viewer tab was found

    }

    @FindBy(xpath = "//a[@title='Automation Report.pdf']")
    WebElement generated_pdf_appendices_link;
    public void verify_appendices_PDF_contents() throws IOException, InterruptedException {

       // String pdf_url = ReusableMethodsLoggersPOM.captureAttributeMethod(driver, generated_pdf_appendices_link, logger, "generated_pdf_appendices_link", "href");
        BaseClass.reportfoldersection().click_GeneratedPDF_button();
        Thread.sleep(5000);
//        //switch to next tab and capture url
     //   BaseClass.reportfoldersection().change_to_next_tab();
      //  Thread.sleep(500);
       // BaseClass.staging5().captureURL();
       // Thread.sleep(1500);

     //   String pdfContent=   ReusableMethodsLoggersPOM.getPdfContent_from_browser_href(pdf_url);
      //  String pdfContent=   ReusableMethodsLoggersPOM.getPdfContent_from_downloads("Automation Report");
          String pdfContent=   ReusableMethodsLoggersPOM.getPDFContent_from_most_recent_download();


        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(1000);

// Define expected appendix items
        List<String> expectedAppendixItems = Arrays.asList( "picture of a---------------------------------------------mapp", "signature");

// Check if all expected items are present in pdfContent
        boolean allItemsPresent = expectedAppendixItems.stream().allMatch(pdfContent::contains);

// Perform assertion
        softAssert.assertTrue(allItemsPresent);

        if (allItemsPresent) {
            System.out.println("✅ Appendix items verification passed. All expected items are present in the PDF.");
            logger.log(LogStatus.PASS, "Assertion Passed: All expected appendix items are found in the PDF content.");
        } else {
            System.out.println("❌ Assertion failed: Some expected appendix items are missing in the PDF.");
            logger.log(LogStatus.FAIL, "Assertion Failed: Some expected appendix items are missing in the PDF.");

            // Log missing items for debugging
            for (String item : expectedAppendixItems) {
                if (!pdfContent.contains(item)) {
                    System.out.println("❌ Missing item: " + item);
                    logger.log(LogStatus.FAIL, "Missing appendix item: " + item);
                }
            }
        }
// Assert all
        softAssert.assertAll();

     //   ReusableMethodsLoggersPOM.closePDFViewer(driver);
//BaseClass.reportfoldersection().change_to_default_tab();
    }

    public void verify_portfolio_from_PDF() throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPDFContent_from_most_recent_download();
        SoftAssert softAssert = new SoftAssert();
        // Assertion 1
        boolean assertionResult1 = pdfContent.contains("QA_"+generatedPortfolioName);
                //&& pdfContent.contains("New") && pdfContent.contains("New1") ;
        softAssert.assertTrue(assertionResult1);
        if (assertionResult1) {
            System.out.println("Portfolio cells in PDF Verification passed ");
            logger.log(LogStatus.PASS, "Portfolio cells Verification passed");
        } else {
            System.out.println("Assertion 1 failed: Portfolio cells do not match");
            logger.log(LogStatus.FAIL, "Assertion 1 failed: Portfolio cells do not match");
        }
    }


    public void verify_email_link_PDF() throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPDFContent_from_most_recent_download();
        SoftAssert softAssert = new SoftAssert();
        // Assertion 1
        boolean assertionResult1 = pdfContent.contains("test@quiretest.com") && pdfContent.contains("QA Automation Testing Script - Spell Check Section") ;
        softAssert.assertTrue(assertionResult1);
        if (assertionResult1) {
            System.out.println("PDF Email Link Verification passed ");
            logger.log(LogStatus.PASS, "PDF Email Link Verification passed");
        } else {
            System.out.println("Assertion 1 failed: PDF Email Link Verification does not match");
            logger.log(LogStatus.FAIL, "Assertion 1 failed: PDF Email Link Verification does not match");
        }
    }


    public void verify_downloadedPDFContent() throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPdfContent_from_downloads("QA Automation Testing ZON Template.pdf");
        SoftAssert softAssert = new SoftAssert();

        // Assertion 1
        boolean assertionResult1 = pdfContent.contains("refresh text");
        softAssert.assertTrue(assertionResult1);
        if (assertionResult1) {
            System.out.println("Header Text Verification passed for: ");
            logger.log(LogStatus.PASS, "Assertion 1 passed:");

        } else {
            System.out.println("Assertion 1 failed: The Header texts are NOT present in the PDF content.");
            logger.log(LogStatus.FAIL, "Assertion 1 failed: The Header texts are NOT present in the PDF content.");
        }
    }

    @FindBy(xpath = "(//td[@class='htLeft htMiddle row-header'])[7]")
    WebElement pca_portfolio_report_name_cell7;

    @FindBy(xpath = "(//td[@class='htLeft htMiddle row-header'])[14]")
    WebElement pca_portfolio_report_name_cell12;

    @FindBy(xpath = "(//td[@class='htLeft htMiddle row-header'])[16]")
    WebElement pca_portfolio_report_name_cell15;
    public void scroll_pca_portfolio_report_name_last_cell() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToViewMethod(driver, pca_portfolio_report_name_cell7, logger, "pca_portfolio_report_name_cell7");
        ReusableMethodsLoggersPOM.scrollToViewMethod(driver, pca_portfolio_report_name_cell12, logger, "pca_portfolio_report_name_cell12");
        //   ReusableMethodsLoggersPOM.scrollToViewMethod(driver, pca_portfolio_report_name_cell15, logger, "pca_portfolio_report_name_cell15");

    }


    @FindBy(xpath = "(//table[@class='htCore'])//tr//td[2]")
    List<WebElement> pca_portfolio_report_name_cells;
    List<String> tableTextList = new ArrayList<>();
    public void verify_report_names_from_jen_portfolio_PDF() throws IOException, InterruptedException {
        //String pdfContent = ReusableMethodsLoggersPOM.getPdfContent_from_browser();
       // String pdfContent=   ReusableMethodsLoggersPOM.getPdfContent_from_downloads("-");
        String pdfContent=   ReusableMethodsLoggersPOM.getPDFContent_from_most_recent_download();


        Thread.sleep(1000);
        driver.navigate().to("https://app.openquire.com/portfolios/3891");
        Thread.sleep(2000);
        BaseClass.staging5().select_template_dropdown_pca_elise();
        Thread.sleep(2000);
        BaseClass.staging5().scroll_pca_portfolio_report_name_last_cell();
        Thread.sleep(1500);

        for (WebElement element : pca_portfolio_report_name_cells) {
            String text = element.getText();
            // System.out.println(text);
            tableTextList.add(text);
        }
        System.out.println(tableTextList);

        Thread.sleep(1000);

        // Initialize SoftAssert
        SoftAssert softAssert = new SoftAssert();
        // assert pdfContent != null;
        // Compare each item in the list with the text extracted from the PDF
        //  System.out.println("Finding text: " + tableTextList );
        for (String tableText : tableTextList) {
            //  System.out.println("Finding text: " + tableText);
            boolean assertionResult1 = pdfContent.contains(tableText);
            softAssert.assertTrue(assertionResult1);
            // Compare each text with the first one
            //   softAssert.assertEquals(text, firstText, "Texts are not the same.");
            //   softAssert.assertEquals(pdfContent.contains(tableText), "Text '" + tableText + "' not found in PDF");
        }
        try {
            // Perform all assertions
            softAssert.assertAll();
            // If assertAll() does not throw any exception, all assertions passed
            System.out.println("All report names in portfolio match with pdf");
            logger.log(LogStatus.PASS, "All report names in portfolio match with pdf");

        } catch (AssertionError e) {
            // If assertAll() throws an exception, at least one assertion failed
            System.out.println("report names in portfolio DO NOT match with pdf");
            logger.log(LogStatus.FAIL, "some report name in portfolio DO NOT match with pdf");
        }
    }


    @FindBy(xpath = "(//table[@class='htCore'])//tr//td[3]")
    List<WebElement> qa_pca_portfolio_project_name_cells;

    public void verify_report_names_from_qa_portfolio_PDF() throws IOException, InterruptedException {
        String pdfContent = ReusableMethodsLoggersPOM.getPdfContent_from_browser();
        Thread.sleep(1000);
        driver.navigate().to("https://staging5.openquire.com/portfolios/4699");
        Thread.sleep(2000);
        BaseClass.staging5().select_template_dropdown_phase_1_esa_proposal();
        // Thread.sleep(2000);
        //BaseClass.staging5().scroll_pca_portfolio_report_name_last_cell();
        Thread.sleep(1500);

        for (WebElement element : qa_pca_portfolio_project_name_cells) {
            String text = element.getText();
            // System.out.println(text);
            tableTextList.add(text);
        }

        System.out.println(tableTextList);
        System.out.println(pdfContent);

        Thread.sleep(1000);

        // Initialize SoftAssert
        SoftAssert softAssert = new SoftAssert();


        for (String tableText : tableTextList) {
            //  System.out.println("Finding text: " + tableText);
            boolean assertionResult1 = pdfContent.contains(tableText);
            softAssert.assertTrue(assertionResult1);
        }
        try {
            // Perform all assertions
            softAssert.assertAll();
            // If assertAll() does not throw any exception, all assertions passed
            System.out.println("All report names in portfolio match with pdf");
            logger.log(LogStatus.PASS, "All report names in portfolio match with pdf");

        } catch (AssertionError e) {
            // If assertAll() throws an exception, at least one assertion failed
            System.out.println("report names in portfolio DO NOT match with pdf");
            logger.log(LogStatus.FAIL, "some report name in portfolio DO NOT match with pdf");
        }
    }

    @FindBy(xpath = "//div[@role='dialog']//div[@class='modal-body']")
    WebElement error_message;

    @FindBy(xpath = "//button[normalize-space()='Yes, continue editing.']")
    WebElement continue_editing_yes_modal_button;
    public void skip_if_error_message_appears() throws InterruptedException {
        if (ReusableMethodsLoggersPOM.isElementPresent(driver, error_message)) {
            ReusableMethodsLoggersPOM.clickMethod(driver, continue_editing_yes_modal_button, logger, "continue_editing_yes_modal_button");
            Thread.sleep(1000);
            BaseClass.staging5().click_default_section_title();

        } else {
            System.out.println("No error message present.");
            logger.log(LogStatus.PASS, "No error message present.");


        }
    }




        public void acceptAlert() {
            try {
                // Switch to alert
                Alert alert = driver.switchTo().alert();
                // Accept the alert
                alert.accept();
                System.out.println("Alert accepted successfully.");
            } catch (Exception e) {
                // No alert is present
                System.out.println("No alert present.");
            }
        }

//    @FindBy(xpath = "(//table[@class='htCore'])//tr//td[2]")
//    List<WebElement> pca_portfolio_report_name_cells;
//     List<String> tableTextList = new ArrayList<>();
//        public void verify_report_names_from_portfolio_PDF() throws IOException, InterruptedException {
//            String pdfContent = ReusableMethodsLoggersPOM.getPdfContent_from_browser();
//             Thread.sleep(1000);
//            driver.navigate().to("https://app.openquire.com/portfolios/3891");
//        Thread.sleep(2000);
//            BaseClass.staging5().select_template_dropdown_pca_elise();
//            Thread.sleep(2000);
//            BaseClass.staging5().scroll_pca_portfolio_report_name_last_cell();
//            Thread.sleep(1500);
//
//        for (WebElement element : pca_portfolio_report_name_cells) {
//            String text = element.getText();
//            // System.out.println(text);
//            tableTextList.add(text);
//        }
//               System.out.println(tableTextList);
//        Thread.sleep(1000);
//
//
//        // Initialize SoftAssert
//        SoftAssert softAssert = new SoftAssert();
//       // assert pdfContent != null;
//        // Compare each item in the list with the text extracted from the PDF
//      //  System.out.println("Finding text: " + tableTextList );
//
//        for (String tableText : tableTextList) {
//          //  System.out.println("Finding text: " + tableText);
//            boolean assertionResult1 = pdfContent.contains(tableText);
//            softAssert.assertTrue(assertionResult1);
//
//            // Compare each text with the first one
//         //   softAssert.assertEquals(text, firstText, "Texts are not the same.");
//            //   softAssert.assertEquals(pdfContent.contains(tableText), "Text '" + tableText + "' not found in PDF");
//        }
//        try {
//            // Perform all assertions
//            softAssert.assertAll();
//            // If assertAll() does not throw any exception, all assertions passed
//            System.out.println("All report names in portfolio match with pdf");
//            logger.log(LogStatus.PASS, "All report names in portfolio match with pdf");
//
//        } catch (AssertionError e) {
//            // If assertAll() throws an exception, at least one assertion failed
//            System.out.println("report names in portfolio DO NOT match with pdf");
//            logger.log(LogStatus.FAIL, "some report name in portfolio DO NOT match with pdf");
//
//        }
//
//        }
    }




//    WebElement table = driver.findElement(By.xpath("//table[@id=’myTable’]"));
//    List rows = table.findElements(By.xpath(".//tr"));
//                for (WebElement row : rows) {
//        List cells = row.findElements(By.xpath(".//td"));
//        for (WebElement cell : cells) { System.out.println(cell.getText()); } }
//}









