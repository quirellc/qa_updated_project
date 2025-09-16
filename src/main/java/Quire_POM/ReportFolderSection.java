package Quire_POM;
//
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ReportFolderSection extends ReusableAnnotations {
    //
    // must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public ReportFolderSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "//*[text()='Portfolios']")
    WebElement portfoliosTab;



    @FindBy(xpath = "//*[normalize-space()='Reports']")
    WebElement reportsTab;

    @FindBy(xpath = "//span[normalize-space()='Reports']//i[@class='fa fa-caret-down']")
    WebElement reportsCaretIcon;

    @FindBy(xpath = "(//a[contains(text(),'All Folders')])[1]")
    WebElement allFoldersDropdownItem;

    public void clickReportsTab() {
        try {
            // If caret icon is displayed, hover and click All Folders
            if (reportsCaretIcon.isDisplayed()) {
                ReusableMethodsLoggersPOM.mouseHoverMethod(driver, reportsTab, logger, "reports tab");
                //Thread.sleep(500); // Wait for dropdown to appear
                ReusableMethodsLoggersPOM.clickMethod(driver, allFoldersDropdownItem, logger, "All Folders dropdown");
            } else {
                // Default: click Reports tab
                ReusableMethodsLoggersPOM.clickMethod(driver, reportsTab, logger, "reports tab");
            }
        } catch (Exception  e) {
            // Fallback: just click Reports tab if caret or dropdown not present
            ReusableMethodsLoggersPOM.clickMethod(driver, reportsTab, logger, "reports tab");
        }
    }

    @FindBy(xpath = "//*[contains(text(),'Add Folder')]")
    WebElement addFolderButton;

    public void clickAddFolderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addFolderButton, logger, "add folder button");
    }

    @FindBy(xpath = "//*[@name='label[name]']")
    WebElement folderName;

    public void enterFolderNameField_QA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, folderName, "QA Automation Testing Folder-Chrome", logger, "QA automation Reports - search field-chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, folderName, "QA Automation Testing Folder-Firefox", logger, "QA automation Reports - search field-ff");
        }
    }


    @FindBy(xpath = "//*[contains(text(),'QA Automation Testing Folder')]")
    WebElement folderLink;

    public void doubleclickReportFolderLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, folderLink, logger, "double click report folder  ");
    }

    public void scrollAndClickFolderLink() throws InterruptedException {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, folderLink, logger, "hover to folder link");
        Thread.sleep(2000);
        ReusableMethodsLoggersPOM.clickMethod(driver, folderLink, logger, "folder link");
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
        ReusableMethodsLoggersPOM.clickMethod(driver, addReportButton, logger, "reports tab button");}

    @FindBy(xpath = "//a[@title='Report Status']")
    WebElement statusButton;
    public void clickStatusButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, statusButton, logger, "statusButton");}

    @FindBy(xpath = "//div[contains(text(),'Review')]")
    WebElement review_status_button;
    public void click_review_status_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, review_status_button, logger, "review_status_button");}

    @FindBy(xpath = "//div[contains(text(),'Draft')]")
    WebElement draft_status_button;
    public void click_draft_status_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, draft_status_button, logger, "draft_status_button");}

    @FindBy(xpath = "//a[@class='pinnedItems-iconContainer js-pinnedItems-toggleAction']")
    WebElement report_pinned_icon;
    public void verify_report_is_pinned() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, report_pinned_icon, true,  logger, "report_pinned_yellow_icon");}

    @FindBy(xpath = "//a[@class='pinnedItems-iconContainer js-pinnedItems-toggleAction unpinned']")
    WebElement report_unpinned_icon;
    public void verify_report_is_unpinned() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, report_unpinned_icon, true,  logger, "report_unpinned_icon");}

    @FindBy(xpath = "//*[@name='report[name]']")
    WebElement reportNameField;

    public void enterReportName_QA_PCA_Field() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation PCA Test Report-Chrome", logger, "PCA report name field Chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation PCA Test Report-Firefox", logger, "PCA report name field Firefox");
        }
    }

    public void enterReportName_QA_ESA_Field() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation ESA Test Report-Chrome", logger, "ESA report name field");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation ESA Test Report-Firefox", logger, "ESA report name field");
        }
    }


    public void enterReportName_QA_SRA_Field() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation SRA Test Report-Chrome", logger, "SRA report name field");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation SRA Test Report-Firefox", logger, "SRA report name field");
        }
    }

    public void enterReportName_QA_ZON_Field() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation ZON Test Report-Chrome", logger, "ZON report name field");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation ZON Test Report-Firefox", logger, "ZON report name field");
        }
    }

    public void enterReportName_QA_CK5_Field() {

        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation CK5 Test Report", logger, "CK5 report name field");
    }

    public void enterReportName_QA_New_CK5_Field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation New CK5 Test Report", logger, "CK5 report name field");
    }

    public void enterReportName_QA_FM_1104_Field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation Freddie Mac 1104 Test Report", logger, "FM_1104 report name field");
    }


    public void enterReportName_QA_FM_1104_cloned_Field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation Freddie Mac 1104 Cloned Test Report", logger, "FM_1104 cloned report name field");
    }

    public void enterReportName_QA_Regression_suite_Field() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Automation Regression Suite Test Report", logger, " report name field");
    }

    public void enterReportName_QA_Medium_Priority_Report_Field() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Medium Priority Test Report-Chrome", logger, "QA Medium Priority Test Report-chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportNameField, "QA Medium Priority Test Report-Firefox", logger, "QA Medium Priority Test Report-firefox");
        }
    }

    @FindBy(xpath = "//*[@name='report[description]']")
    WebElement reportDescriptionField;

    public void enterReportDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reportDescriptionField, "QA Automation Test Report Creation task", logger, "report description field");
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

    @FindBy(xpath = "//li[@class='list-group-item'][normalize-space()='QA Medium Priority Template']")
    WebElement qa_medium_template_dropdown_item;

    public void click_qa_medium_priority_template_dropdown_item() {
        ReusableMethodsLoggersPOM.clickMethod(driver, qa_medium_template_dropdown_item, logger, "qa_medium_template_dropdown_item");
    }

    @FindBy(xpath = "//input[@id='report_source_type_report']")
    WebElement clone_existing_report_checkbox;

    public void click_clone_existing_report_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clone_existing_report_checkbox, logger, "clone_existing_report_checkbox");
    }

    @FindBy(xpath = "//input[@id='report_source_type_report']")
    WebElement clone_existing_report_text_field;

    public void enter_FM1104_report_to_clone() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, clone_existing_report_text_field, "QA Automation Freddie Mac 1104 Test Report", logger, "clone existing report - FM 1104 ");
    }

    @FindBy(xpath = "//*[@value='Save']")
    WebElement saveButton;

    public void clickSave() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveButton, logger, "save button");
    }


    @FindBy(xpath = "//*[@class='alert alert-notice']")
    WebElement alertMessage;

    public void captureAlertMessage() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, alertMessage, logger, "alert message ");
    }

    @FindBy(xpath = "//a[text()='here']")
    WebElement hereLink;

    public void clickHereLink() throws InterruptedException {
        try {
            ReusableMethodsLoggersPOM.clickMethod(driver, hereLink, logger, "here link");

        } catch (Exception e1) {
            try {
                driver.navigate().refresh();
                Thread.sleep(1000);

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

                WebElement columnHeader;
                for (int i = 0; i < 3; i++) {
                    columnHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//th[.//span[contains(text(), 'Created')]]//span[contains(@class, 'colHeader')]")
                    ));

                    String classAttr = columnHeader.getAttribute("class");

                    if (classAttr.contains("descending")) {
                        break;
                    } else {
                        columnHeader.click();
                        Thread.sleep(1000);
                    }
                }

                BaseClass.reportfoldersection().enterSearchField_QA();
                Thread.sleep(3500);
                BaseClass.reportfoldersection().clickReportsFirstLink();

            } catch (Exception e2) {
                logger.log( LogStatus.FAIL,"Failed in fallback logic for 'here link'. Error: " + e2.getMessage());
                // Optionally take screenshot or throw if critical
                // throw e2;
            }
        }
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

    }


    @FindBy(xpath = "//input[(@class='search')]")
    WebElement searchFieldButton;

    public void enterSearchField_HMReports() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchFieldButton, "HM Reports", logger, "HM Reports - search field");
    }

    @FindBy(xpath = "//span[contains(text(), 'HM Reports')]")
    WebElement hm_reports_folder_link;

    public void clickHMReportsFolder() {
        ReusableMethodsLoggersPOM.clickMethod(driver, hm_reports_folder_link, logger, "hm_reports_folder_link");
    }


    public void enterSearchField_QA_Report() throws InterruptedException {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchFieldButton, "QA Automation Testing Folder-Chrome", logger, "QA automation Reports - search field-chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchFieldButton, "QA Automation Testing Folder-Firefox", logger, "QA automation Reports - search field-ff");
        }
    }
    String browserName = driver.getClass().getSimpleName();

  //  public void enterSearchField_QA_companyUser() throws InterruptedException {
        public void enterSearchField_QA_companyUser() throws InterruptedException {
            // String searchText = browserName.contains("Chrome") ? "QA Dummy User-Chrome" : "QA Dummy User-Firefox";
            ReusableMethodsLoggersPOM.clickMethod(driver, searchFieldButton, logger, "company users - search field");
//
//            for (char c : searchText.toCharArray()) {
//                String s = String.valueOf(c);
//                searchFieldButton.sendKeys(s);
//                Thread.sleep(100); // Mimic human typing
//            }
//Thread.sleep(3000);
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
//        }
            if (browserName.contains("Chrome")) {
                ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchFieldButton, "QA Dummy User-Chrome", logger, "QA Dummy Use - search field chrome");
            } else if (browserName.contains("Firefox")) {
                ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchFieldButton, "QA Dummy User-Firefox", logger, "QA Dummy Users - search field ff");
            }
        //    Thread.sleep(3000);
            //  ReusableMethodsLoggersPOM.submitMethod(driver, searchFieldButton, logger, "company users - search field");
//        Thread.sleep(5000);
//
////        searchFieldButton.sendKeys("\n");
//        searchFieldButton.sendKeys(Keys.RETURN);
//        searchFieldButton.sendKeys(Keys.ENTER);

            //  ReusableMethodsLoggersPOM.clickMethod(driver, searchFieldButton, logger, "company users - search field");

            //   ReusableMethodsLoggersPOM.submitMethod(driver, searchFieldButton, logger, "company users - search field");


        }
    public void enterSearchField_QA_wordbank_Report() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchFieldButton, "QA WordBank", logger, "QA automation Reports - search field");

    }

    @FindBy(xpath = "(//div[@class='assignmentList-item js-assignmentList-item'])[1]")
    WebElement recent_row_item;

    public void click_recent_row_item_wordBank() {
        ReusableMethodsLoggersPOM.clickMethod(driver, recent_row_item, logger, "recent_row_item");
    }

    @FindBy(xpath = "//a[normalize-space()='Delete Selected Items']")
    WebElement delete_selected_items;

    public void click_delete_selected_items() {
        ReusableMethodsLoggersPOM.clickMethod(driver, delete_selected_items, logger, "delete_selected_items");
    }

    @FindBy(xpath = "//input[(@class='search')]")
    WebElement searchField_Search_Button;

    public void enterSearchField_QA() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "QA Automation", logger, "QA automation - search field");
    }

    public void enterSearchField_PCA_Report() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "QA Automation Testing PCA Template", logger, "QA automation Reports - search field");
    }

    public void enterSearchField_ESA_Report() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "QA Automation Testing ESA Template", logger, "QA automation Reports - search field");
    }

    public void enterSearchField_SRA_Report() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "QA Automation Testing SRA Template", logger, "QA automation Reports - search field");
    }

    public void enterSearchField_ZON_Report() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "QA Automation Testing ZON Template", logger, "QA automation Reports - search field");
    }

    public void enterSearchField_CK5_Report() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "QA Automation Testing CK5 Template", logger, "QA automation Reports - search field");
    }

    public void enterSearchField_ibrar() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, searchField_Search_Button, "Ibrar", logger, "Ibrar - search field");
    }


    @FindBy(xpath = "//span[@class='edit-link-text']")
    WebElement reportsFirstLink;

    public void clickReportsFirstLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportsFirstLink, logger, "reportsFirstLink");
    }

    @FindBy(xpath = "(//span[@class='edit-link-text'])[2]")
    WebElement reportSecondLink;

    public void clickReportSecondLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportSecondLink, logger, "reportSecondLink");
    }

    @FindBy(xpath = "//span[normalize-space()='QA Automation Freddie Mac 1104 Test Report']")
    WebElement fm_1104_report_link;

    public void click_fm_1104_report_link() {
        ReusableMethodsLoggersPOM.clickMethod(driver, fm_1104_report_link, logger, "fm_1104_report_link");
    }




    @FindBy(xpath = "//span[normalize-space()='Automation Report']")
    WebElement automationReport_link;

    public void clickAutomationReport_link() {
        ReusableMethodsLoggersPOM.clickMethod(driver, automationReport_link, logger, "automationReport_link");
    }

    @FindBy(xpath = "//span[normalize-space()='QA CK5 Sanity Test Report']")
    WebElement ck5_sanity_test_report_link;

    public void click_ck5_sanity_test_report_link() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ck5_sanity_test_report_link, logger, "ck5_sanity_test_report_link");
    }

    @FindBy(xpath = "//a[@id='report_appendices_outline']")
    WebElement sectionView_Appendices;

    public void clickSectionView_Appendices() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToViewMethod(driver, sectionView_Appendices, logger, "sectionView_Appendices");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, sectionView_Appendices, logger, "sectionView_Appendices");
    }

    @FindBy(xpath = "//div[@class='appendix-item-caption js-appendixItem-caption has-tooltip']")
    WebElement file_name_appendix;

    public void enter_file_name_appendix() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, file_name_appendix, "signatureee", logger, "file_name_appendix");
    }

    @FindBy(xpath = "//div[@title='Edit Title']")
    WebElement appendix_name;

    public void enter_appendix_name() throws InterruptedException {
        ReusableMethodsLoggersPOM.clearMethod(driver, appendix_name, logger, "appendix_title");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, appendix_name, "testinggg", logger, "appendix_title");
    }

    //    @FindBy(xpath = "//a[normalize-space()='Move Appendix to Trash']")
    @FindBy(xpath = "(//i[@class='fa fa-trash-o'])[1]")
    WebElement delete_appendix_button;

    public void click_delete_appendix_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, delete_appendix_button, logger, "delete_appendix_button");
    }

    @FindBy(xpath = "//a[normalize-space()='Add Appendix']")
    WebElement add_appendix_button;

    public void click_add_appendix_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, add_appendix_button, logger, "add_appendix_button");
    }

    @FindBy(xpath = "//div[@class='form-group appendix-title']//input[@id='report_appendix_title']")
    WebElement appendix_title;

    public void enter_appendix_title() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, appendix_title, "Appendixx Itemz", logger, "appendix_title");
    }

    public void enter_gallery_appendix_title() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, appendix_title, "Appendixx Gallery Items", logger, "gallery_appendix_title");
    }

    public void enter_pdf_appendix_title() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, appendix_title, "Appendix PDF Itemss", logger, "pdf_appendix_title");
    }

    @FindBy(xpath = "//input[@id='report_appendix_format_any']")
    WebElement any_format_checkbox_appendix;

    public void click_any_appendix_format_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, any_format_checkbox_appendix, logger, "any_format_checkbox_appendix");
    }


    @FindBy(xpath = "//input[@id='report_appendix_format_gallery']")
    WebElement gallery_format_checkbox_appendix;

    public void click_gallery_format_checkbox_appendix() {
        ReusableMethodsLoggersPOM.clickMethod(driver, gallery_format_checkbox_appendix, logger, "gallery_format_checkbox_appendix");
    }


    @FindBy(xpath = "//div[@class='actions dropzone file_drop_target dz-clickable']")
    WebElement upload_appendix_section;

    //src/main/java/downloads/123456_PCA.xml
    public void upload_pdf_to_appendix() {
        // ReusableMethodsLoggersPOM.uploadFile_robot_method(driver, upload_appendix_section, "./maptest.pdf",logger, "upload_appendix_section");
        ReusableMethodsLoggersPOM.clickMethod(driver, upload_appendix_section, logger, "upload_appendix_section");
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, upload_appendix_section, "maptest.pdf", logger, "upload_appendix_section");

        // ReusableMethodsLoggersPOM.uploadFileMethod(driver, upload_appendix_section, "maptest.pdf",logger, "upload_appendix_section");
    }

    public void upload_image_to_appendix() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, any_format_checkbox_appendix, "map.png", logger, "upload_appendix_section");
    }

//    public void upload_PDF_appendix_section() throws InterruptedException {
//        File file = new File("./maptest.pdf");
//        System.out.println(file.getAbsolutePath());
//     //   ReusableMethodsLoggersPOM.clickMethod(driver, pdf_upload_appendix_section, logger, "pdf_upload_appendix_section");
////Thread.sleep(2000);
//        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pdf_upload_appendix_section, file.getAbsolutePath(), logger, "pdf_upload_appendix_section");
//
//    }


    @FindBy(xpath = "//ul[@class='appendix-filelist appendix-grid js-appendix-filelist ui-sortable']")
    WebElement pdf_items_appendix_section;

    public void capture_pdf_items_appendix_section() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, pdf_items_appendix_section, logger, "PDF Items");
        //  System.out.println("PDF Items: " +"\n" + result+ "\n" );
    }

    @FindBy(xpath = "//div[@class='appendix-item-caption-container js-appendixItem-captionContainer test-appendix']")
//    WebElement items_appendix_section;
    List<WebElement> items_appendix_sections;

    public void number_of_items_appendix_section() {
        int appendix_items = items_appendix_sections.size();
        System.out.println("There are: " + appendix_items + " items in the appendix");
        logger.log(LogStatus.PASS, "There are: " + appendix_items + " items in the appendix");


    }

    public void capture_all_items_appendix_section() {
        List<String> expectedItems = Arrays.asList("maptest", "maptest2", "picture of a", "signature");

        int appendixItemsCount = items_appendix_sections.size();
        System.out.println("There are: " + appendixItemsCount + " items in the appendix");
     //   System.out.println(items_appendix_sections);

        if (appendixItemsCount != expectedItems.size()) {
            System.out.println("Mismatch in expected count! Expected: " + expectedItems.size() + ", Found: " + appendixItemsCount);
            return;
        }

        for (int i = 0; i < appendixItemsCount; i++) {
            WebElement item = items_appendix_sections.get(i);
            String actualText = ReusableMethodsLoggersPOM.saveTextMethod(driver, item, logger, "appendix Item at index: " + i).trim();
            String expectedText = expectedItems.get(i);

            if (actualText.contains(expectedText)) {
                System.out.println("✅ Match at index " + i + ": " + actualText);
            } else {
                System.out.println("❌ Mismatch at index " + i + ": Expected '" + expectedText + "', but found '" + actualText + "'");
            }
        }
    }

    @FindBy(xpath = "//p[normalize-space()='There are no Appendices in this report.']")
    WebElement empty_appendix_section;

    public void verify_empty_appendix_section() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, empty_appendix_section, true,  logger, "empty_appendix_section");
    }

    @FindBy(xpath = "//button[normalize-space()='Yes, continue editing.']")
    WebElement continue_editing_yes_modal_button;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    List<WebElement> delete_appendix_buttons;

    public void deleteAllAppendixItems() throws InterruptedException {
        while (!delete_appendix_buttons.isEmpty()) {
            ReusableMethodsLoggersPOM.clickMethod(driver, delete_appendix_buttons.get(0), logger, "delete_appendix_buttons");
            Thread.sleep(500); // allow DOM to refresh
        }
    }


    @FindBy(xpath = "(//div[@class='appendix-item-caption-container'])[1]")
    WebElement image_1_report_section;
    @FindBy(xpath = "(//div[@class='appendix-item-caption-container'])[2]")
    WebElement image_2_report_section;
    @FindBy(xpath = "//div[@class='pdf-link-title']")
    WebElement pdf_link_name_report_section;

    public void capture_items_added_in_report_section() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, image_1_report_section, logger, "image_1_name");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, image_2_report_section, logger, "image_2_name");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, pdf_link_name_report_section, logger, "pdf_link_name");

    }

    @FindBy(xpath = "//div[@data-original-caption='signature']")
    WebElement image_1_signature_section_name;

    public void enter_image1_updated_name() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod2(driver, image_1_signature_section_name, "signature_updated_caption", logger, "image_1_signature_section_name");
    }

    @FindBy(xpath = "(//div[@class='appendix-item-caption js-appendixItem-caption has-tooltip'][normalize-space()='signature'])[1]")
    WebElement image_1_signature_appendix;

    public void verify_image1_original_name_appendix() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, image_1_signature_appendix, true, logger, "image_1_signature_appendix");
    }

    @FindBy(xpath = "//div[@class='appendix-item-caption js-appendixItem-caption has-tooltip custom-caption']")
    WebElement custom_image1_caption;

    public void verify_custom_image1_caption() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, custom_image1_caption, true, logger, "custom_image1_caption ");
    }

    @FindBy(xpath = "//*[contains(@src,'_processing.')]")
    WebElement processing_items_appendix_section;

    public void verify_no_processing_items_appendix_section() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, processing_items_appendix_section, false, logger, "processing_items_appendix_section ");
    }


//    @FindBy(xpath = "//img[contains(@src,'_processing.gif')]")
//   // List<WebElement> processing_gallery_items_appendix_section;
//    WebElement processing_gallery_item_appendix_section;
//
//    public void verify_no_processing_gallery_items_appendix_section() {
//
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, processing_gallery_item_appendix_section, false, logger, "processing_gallery_item_appendix_section ");
//
//     //   System.out.println("\n" + "There are: " + processing_gallery_items_appendix_section.size() + " unrendered gallery items" + "\n");
//      //  logger.log(LogStatus.PASS, "There are:  " + processing_gallery_items_appendix_section.size() + " unrendered gallery items" + "\n");
//    }
//
//    @FindBy(xpath = "//img[contains(@src,'_processing.pdf')]")
//    WebElement processing_pdf_item_appendix_section;
//
//   // List<WebElement> processing_pdf_items_appendix_section;
//
//    public void verify_no_processing_pdf_items_appendix_section() {
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, processing_pdf_item_appendix_section, false, logger, "processing_pdf_item_appendix_section ");
//
//     //   System.out.println("\n" + "There are: " + processing_pdf_items_appendix_section.size() + " unrendered pdf files" + "\n");
//      //  logger.log(LogStatus.PASS, "There are:  " + processing_pdf_items_appendix_section.size() + " unrendered pdf files " + "\n");
//    }


    @FindBy(xpath = "//img[@class='appendix-item-thumb-img']")
    List<WebElement> appendix_images;
    int iBrokenImageCount = 0;

    public void capture_broken_link() {

        try {
            //  List<WebElement> image_list = driver.findElements(By.c("img"));
            /* Print the total number of images on the page */
            System.out.println("The page under test has " + appendix_images.size() + " images");
//            logger.log(LogStatus.PASS, "There are:  " +appendix_images.size() +" images" + "\n");

            for (WebElement img : appendix_images) {
                if (img != null) {
                    if (img.getAttribute("naturalWidth").equals("0")) {
                        System.out.println(img.getAttribute("outerHTML") + " is broken.");
//                        logger.log(LogStatus.FAIL,img.getAttribute("outerHTML") + " is broken.");

                        iBrokenImageCount++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            // status = "failed";
            System.out.println(e.getMessage());
        }
        //  status = "passed";
        if (iBrokenImageCount == 0) {
            logger.log(LogStatus.PASS, "The page " + " has " + iBrokenImageCount + " broken images");
        } else {
            logger.log(LogStatus.FAIL, "The page " + " has " + iBrokenImageCount + " broken images");
        }
        System.out.println("The page " + " has " + iBrokenImageCount + " broken images");
    }


    public void capture_broken_link_api() {
        //  List<WebElement> images = driver.findElements(By.tagName("img"));
        for (WebElement image : appendix_images) {
            String imageURL = image.getAttribute("src");
            if (imageURL != null && !imageURL.isEmpty()) {
                try {
                    URL url = new URL(imageURL);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode != HttpURLConnection.HTTP_OK) {
                        System.out.println("Broken image link: " + imageURL);
                        logger.log(LogStatus.FAIL, "Broken image link found from API Request: " + imageURL);
                    }
                    connection.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @FindBy(xpath = "//a[contains(text(),'Generate PDF')]")
    WebElement generatePDF_Button;

    public void clickGeneratePDFButton() {
        try {
            ReusableMethodsLoggersPOM.clickMethod(driver, generatePDF_Button, logger, "generatePDF_Button");
        }
        catch (Exception e) {
            System.out.println("Exception in clickGeneratePDFButton");        }
    }

    public void clickGeneratePDFButton_projfolderview() {
        try {
            if (generatePDF_Button.isDisplayed()) {
                generatePDF_Button.click();
            } else {
                click_regenerate_button_second_report_project_folder_view();
            }
        } catch (Exception e) {
            // Element not found or any other issue — safely run fallback
            click_regenerate_button_second_report_project_folder_view();
        }
    }


    @FindBy(xpath = "//span[@class='link-title']")
    WebElement regeneratePDF_Button;

    public void clickRegeneratePDFButton() {
        if (ReusableMethodsLoggersPOM.isElementPresent( regeneratePDF_Button)) {
            ReusableMethodsLoggersPOM.clickMethod(driver, regeneratePDF_Button, logger, "regeneratePDF_Button");
        } else {
            ReusableMethodsLoggersPOM.clickMethod(driver, generatePDF_Button, logger, "generatePDF_Button");
        }
    }

    @FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle']")
    WebElement pdf_dropdown_button;

    public void click_regenerate_button_project_folder_view() {
        ReusableMethodsLoggersPOM.clickMethod(driver, pdf_dropdown_button, logger, "pdf_dropdown_button");

        ReusableMethodsLoggersPOM.clickMethod(driver, regeneratePDF_Button, logger, "regeneratePDF_Button");
    }

    @FindBy(xpath = "(//button[@class='btn btn-default dropdown-toggle'])[2]")
    WebElement second_pdf_dropdown_button;

    @FindBy(xpath = "(//span[@class='link-title'])[2]")
    WebElement regenerate_second_PDF_Button;

    public void click_regenerate_button_second_report_project_folder_view() {
        ReusableMethodsLoggersPOM.clickMethod(driver, second_pdf_dropdown_button, logger, "pdf_dropdown_button");

        ReusableMethodsLoggersPOM.clickMethod(driver, regenerate_second_PDF_Button, logger, "regenerate_second_PDF_Button");
    }


    @FindBy(xpath = "//i[@class='fa fa-repeat fa-fw']")
    WebElement regeneratePDF_Button1;

    public void clickRegeneratePDFButton1() {
        ReusableMethodsLoggersPOM.clickMethod(driver, regeneratePDF_Button1, logger, "regeneratePDF_Button");
    }

    @FindBy(xpath = "//span[contains(text(),'Generate JSON')]")
    WebElement generate_JSON_Button;

    public void click_generate_JSON_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, generate_JSON_Button, logger, "generate_JSON_Button");
    }

    @FindBy(xpath = "//*[@class='download js-download']")
    WebElement generatedPDF_text;

    public void captureGeneratedPDF_text() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, generatedPDF_text, logger, "Generated PDF info");
    }

    public void click_GeneratedPDF_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, generatedPDF_text, logger, "Generated PDF");
    }


    @FindBy(xpath = "//div[@class='document-generator-container document-generator-state-complete']")
    WebElement generated_JSON_text;

    public void capture_generated_JSON_text() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, generated_JSON_text, logger, "Generated JSON info");
    }

    public void click_generated_JSON_text() {
        ReusableMethodsLoggersPOM.clickMethod(driver, generated_JSON_text, logger, "Generated JSON info");
    }

    @FindBy(xpath = "//a[@title='Save and Copy Link']")
    WebElement saveAndCopyLinkButton;

    public void clickSaveAndCopyLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveAndCopyLinkButton, logger, "saveAndCopyLink");
    }

    @FindBy(xpath = "//a[@class='saved-pdf-links js-saved-pdf-links']")
    WebElement savedLinksButton;

    public void clickSavedLinksButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, savedLinksButton, logger, "savedLinksButton");
    }

    @FindBy(xpath = "//span[text()='Email Link']")
    WebElement emailLink_hyperlink;

    public void clickEmailLink_hyperLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, emailLink_hyperlink, logger, "emailLink_hyperlink");
    }


    @FindBy(xpath = "//input[@id='company_email_message_send_to']")
    WebElement send_To_email_address;

    public void enter_SendTo_EmailAddress() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, send_To_email_address, "ibrarj@openquire.com", logger, "send_To_email_address");
    }


    @FindBy(xpath = "//textarea[@id='company_email_message_custom_message']")
    WebElement email_message_body;

    public void enter_email_message_body() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, email_message_body, "QA Automation Script - Test Email", logger, "email_message_body");
    }


    @FindBy(xpath = "//a[normalize-space()='QA Automation New CK5 Test Report.pdf']")
    WebElement report_email_pdf_link;
    public void open_report_email_pdf_link() throws InterruptedException {
        ReusableMethodsLoggersPOM.open_href_attribute_link(driver, report_email_pdf_link, logger, "report_email_pdf_link");}

    @FindBy(xpath = "//input[@value='Send']")
    WebElement send_email_button;

    public void clickSendEmailButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, send_email_button, logger, "send_email_button");
    }

    @FindBy(xpath = "//a[@id='quick-preview']")
    WebElement quick_preview_button;

    public void click_quick_preview_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quick_preview_button, logger, "quick_preview_button");
    }

    public void change_to_next_tab() {
        ReusableMethodsLoggersPOM.changeTabs(driver, 1, logger, "next_tab");
    }

    public void change_to_default_tab() {
        ReusableMethodsLoggersPOM.changeTabs(driver, 0, logger, "default tab");
    }

    @FindBy(xpath = "//a[contains(text(),'Report Settings')]")
    WebElement reportSettingsButton;

    public void clickReportSettingsButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportSettingsButton, logger, "reportSettingsButton");
    }

    @FindBy(xpath = "//a[normalize-space()='Header']")
    WebElement headerTab_ReportSettings;

    public void clickHeaderTab_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, headerTab_ReportSettings, logger, "headerTab_ReportSettings");
    }

    @FindBy(xpath = "//a[normalize-space()='Footer']")
    WebElement footerTab_ReportSettings;

    public void clickfooterTab_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, footerTab_ReportSettings, logger, "footerTab_ReportSettings");
    }


    @FindBy(xpath = "//div[@id='header-tab']//select[@class='insert-report-tag form-control']")
    WebElement insert_header_reportTag_ReportSettings;

    public void select_header_reportTag_ReportSettings() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, insert_header_reportTag_ReportSettings, 1, logger, "insert_header_reportTag_ReportSettings");
    }

    @FindBy(xpath = "//div[@id='footer-tab']//select[@class='insert-report-tag form-control']")
    WebElement insert_footer_reportTag_ReportSettings;

    public void select_footer_reportTag_ReportSettings() {
        ReusableMethodsLoggersPOM.selectByIndex(driver, insert_footer_reportTag_ReportSettings, 1, logger, "insert_footer_reportTag_ReportSettings");
    }

    @FindBy(xpath = "//div[@id='footer-tab']//select[@class='edge_variable_selector form-control']")
    WebElement insert_footer_variable_dropdown_ReportSettings;

    public void select_year_variable_dropdown_ReportSettings() {
        ReusableMethodsLoggersPOM.selectByValue(driver, insert_footer_variable_dropdown_ReportSettings, "current-year", logger, "current-year variable dropdown");
    }

    @FindBy(xpath = "//div[@id='header-tab']//select[@class='edge_variable_selector form-control']")
    WebElement insert_header_variable_dropdown_ReportSettings;

    public void select_month_variable_dropdown_ReportSettings() {
        ReusableMethodsLoggersPOM.selectByValue(driver, insert_header_variable_dropdown_ReportSettings, "current-month", logger, "current-month variable dropdown");
    }


    @FindBy(xpath = "//label[normalize-space()='Report Header Left']/following-sibling::textarea")
    WebElement left_header_textbox_ReportSettings;

    public void click_left_header_textBox_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, left_header_textbox_ReportSettings, logger, "left_header_textbox_ReportSettings");
    }

    @FindBy(xpath = "//label[normalize-space()='Report Footer Left']/following-sibling::textarea")
    WebElement left_footer_textbox_ReportSettings;

    public void click_left_footer_textBox_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, left_footer_textbox_ReportSettings, logger, "left_footer_textbox_ReportSettings");
    }


    @FindBy(xpath = "//label[normalize-space()='Report Header Center']/following-sibling::textarea")
    WebElement center_header_textbox_ReportSettings;

    public void click_center_header_textBox_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, center_header_textbox_ReportSettings, logger, "center_header_textbox_ReportSettings");
    }

    @FindBy(xpath = "//label[normalize-space()='Report Footer Center']/following-sibling::textarea")
    WebElement center_footer_textbox_ReportSettings;

    public void click_center_footer_textBox_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, center_footer_textbox_ReportSettings, logger, "center_footer_textbox_ReportSettings");
    }

    @FindBy(xpath = "//label[normalize-space()='Report Header Right']/following-sibling::textarea")
    WebElement right_header_textBox_ReportSettings;

    public void enter_right_header_textBox_ReportSettings() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, right_header_textBox_ReportSettings, "QA - Right Header Text Sample", logger, "right_header_textBox_ReportSettings");
    }

    @FindBy(xpath = "//label[normalize-space()='Report Footer Right']/following-sibling::textarea")
    WebElement right_footer_textBox_ReportSettings;

    public void enter_right_footer_textBox_ReportSettings() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, right_footer_textBox_ReportSettings, "QA - Right Footer Text Sample", logger, "right_footer_textBox_ReportSettings");
    }


    @FindBy(xpath = "//div[@class='region--top-center']//div[@class='header-left'][normalize-space()='test@quiretest.com']")
    WebElement header_section_left_quickPreview;
    @FindBy(xpath = "//div[@class='region--top-center']//div[@class='header-right'][normalize-space()='QA - Right Header Text Sample']")
    WebElement header_section_right_quickPreview;

    String currentMonth = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM"));
    @FindBy(xpath = "//div[@class='region--top-center']//div[@class='header-center']")
    WebElement header_section_center_quickPreview;

    public void verify_header_section_quickPreview() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, header_section_left_quickPreview, true, logger, "Quick Preview - Header Section Left: ");
        String header_date = ReusableMethodsLoggersPOM.captureTextMethod(driver, header_section_center_quickPreview, logger, "Quick Preview - Header Section Center: ");
        if (header_date.contains(currentMonth)) {
            System.out.println("Center Header contains the current month: " + currentMonth + " as expected");
        } else {
            System.out.println("Center Header does NOT contain the current month: " + currentMonth);
        }
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, header_section_right_quickPreview, true, logger, "Quick Preview - Header Section Right: ");
    }


    @FindBy(xpath = "(//div[@class='region--bottom-center']//div[@class='footer-left'][normalize-space()='test@quiretest.com'])[1]")
    WebElement footer_section_left_quickPreview;
    @FindBy(xpath = "(//div[@class='region--bottom-center']//div[@class='footer-right'][normalize-space()='QA - Right Footer Text Sample'])[1]")
    WebElement footer_section_right_quickPreview;

    String currentYear = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy"));
    @FindBy(xpath = "(//div[@class='region--bottom-center']//div[@class='footer-center'])[1]")
    WebElement footer_section_center_quickPreview;

    public void verify_footer_section_quickPreview() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, footer_section_left_quickPreview, true, logger, "Quick Preview - Footer Section Left: ");
        String header_date = ReusableMethodsLoggersPOM.captureTextMethod(driver, footer_section_center_quickPreview, logger, "Quick Preview - Footer Section Center: ");
        if (header_date.contains(currentYear)) {
            System.out.println("Center Header contains the current month: " + currentYear + " as expected");
        } else {
            System.out.println("Center Header does NOT contain the current month: " + currentYear);
        }
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, footer_section_right_quickPreview, true, logger, "Quick Preview - Footer Section Right: ");
    }


    @FindBy(xpath = "//p[contains(normalize-space(), 'signature_updated_caption')]")
    WebElement qp_updated_image_caption;

    public void verify_qp_updated_image_caption() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, qp_updated_image_caption, true, logger, "quick preview updated_image_caption ");
    }


    @FindBy(xpath = "//td[contains(text(),'No')][preceding-sibling::td[contains(text(),'Do buildings have interior common stairways or hal')]]")
    WebElement quick_preview_pca_quickFactsTable_commonStairways;
    @FindBy(xpath = "//td[contains(text(),'No')][preceding-sibling::td[contains(text(),'Do buildings have covered common breezeways?')]]")
    WebElement quick_preview_pca_quickFactsTable_commonBreezeways;
    @FindBy(xpath = "//td[contains(text(),'No')][preceding-sibling::td[contains(text(),'Were units inspected selected by PCA Consultant?')]]")
    WebElement quick_preview_pca_quickFactsTable_unitsInspectedbyConsultants;
    @FindBy(xpath = "//span[normalize-space()='Other'][preceding::td[@class='fannie-mae-table-cell-data'][1]][preceding::td[@class='fannie-mae-table-cell-data'][2]]")
    WebElement quick_preview_pca_quickFactsTable_roofs_pitched_or_flat_dropdown;


    public void verify_quick_preview_pca_quickFactsTable() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quick_preview_pca_quickFactsTable_commonBreezeways, true, logger, "quick_preview_pca_quickFactsTable_commonBreezeways ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quick_preview_pca_quickFactsTable_commonStairways, true, logger, "quick_preview_pca_quickFactsTable_commonStairways ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quick_preview_pca_quickFactsTable_unitsInspectedbyConsultants, true, logger, "quick_preview_pca_quickFactsTable_unitsInspectedbyConsultants ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quick_preview_pca_quickFactsTable_roofs_pitched_or_flat_dropdown, true, logger, "quick_preview_pca_quickFactsTable_roofs_pitched_or_flat_dropdown ");
    }


    @FindBy(xpath = "//h2[normalize-space()='Updated Project Summary Tablee']")
    WebElement verify_qp_updated_projectSummary_headerName;


    @FindBy(xpath = "//td[contains(text(), 'Default Section Title')]")
    WebElement verify_qp_projectSummary_name;
    @FindBy(xpath = "//i[@class='fa fa-check']")
    WebElement verify_qp_projectSummary_check;

    @FindBy(xpath = "//a[contains(@class, 'quire-section-link') and contains(text(), 'Updated Project Summary Table')]")
    WebElement quick_preview_project_summary_link;


    public void verify_quick_preview_projectSummary() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, verify_qp_updated_projectSummary_headerName, true, logger, "verify_qp_updated_projectSummary_headerName ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, verify_qp_projectSummary_name, true, logger, "verify_qp_projectSummary_name ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, verify_qp_projectSummary_check, true, logger, "verify_qp_projectSummary_check ");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quick_preview_project_summary_link, true, logger, "quick_preview_project_summary_link ");
    }


    @FindBy(xpath = "//*[@id=\"edit_report_settings\"]/ul/li[8]/a")
    WebElement detailsTab_ReportSettings;

    public void clickDetailsTab_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, detailsTab_ReportSettings, logger, "detailsTab_ReportSettings");
    }

    @FindBy(xpath = "//a[@class='blueprint-link']")
    WebElement templateLink_detailsTab_ReportSettings;

    public void clickTemplateLink_detailsTab_ReportSettings() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateLink_detailsTab_ReportSettings, logger, "templateLink_detailsTab_ReportSettings");
    }


    @FindBy(xpath = "//*[@class='edit-link-text']")
    List<WebElement> linkItem;

    public void countLinkItem() throws InterruptedException {

        //   System.out.println(linkItem.getT;

        for (int i = 0; i <= linkItem.size(); i++) {
//
            System.out.println(linkItem.get(i).getText());
            linkItem.get(i).click();

            BaseClass.templatesSection().clickTemplateSettingsButton();
            BaseClass.templatesSection().clickdeleteToTrash();


            Thread.sleep(3000);

            BaseClass.reportfoldersection().enterSearchField_QA_Report();
            Thread.sleep(2000);

        }
        //  ReusableMethodsLoggersPOM.captureTextMethodByIndex(driver, linkItem,linkItem.get(i) ,logger, "QA automation Reports - search field");}
    }
//need to add pdf file
    //add gallery file




    public void ck4PackagesCheck() throws InterruptedException {
int linkItemCount = linkItem.size();

        if (browserName.contains("Chrome")) {
            Thread.sleep(100);
        } else if (browserName.contains("Firefox")) {
            Thread.sleep(4000);
        }
        for (int i = 0; i <( linkItemCount-1); i++) {

            // Skip index 3 and 7
            if (i == 0 || i == 4) {
                continue; // Skip this iteration and go to the next one
            }
            ReusableMethodsLoggersPOM.captureTextMethod(driver, linkItem.get(i), logger, "report link name at index: " + i);
            ReusableMethodsLoggersPOM.scrollToElementMethod(driver, linkItem.get(i), logger, "report link at index: " + i);
            ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);

            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(1000);
            BaseClass.staging5().click_add_conditionAction_toSection();
            Thread.sleep(800);
            BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
            Thread.sleep(800);

            //change name for section title
            BaseClass.staging5().enter_section_2_title_text();


            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);


            if (i != 5) {
                BaseClass.staging5().click_conditionAction_dropdown();
                Thread.sleep(500);
                BaseClass.staging5().click_conditionAction_dropdown_first_item();
            }

//    BaseClass.staging5().click_conditionAction_dropdown_items();



            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(500);

            BaseClass.staging5().enter_conditionAction_comment_field();
            Thread.sleep(500);

            BaseClass.staging5().click_out_of_section();
            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(500);

            //quick preview button in next tab
            BaseClass.reportfoldersection().click_quick_preview_button();
            Thread.sleep(1000);
            BaseClass.reportfoldersection().change_to_next_tab();
            Thread.sleep(500);
            //quick preview tab - capture header and footer data
            BaseClass.staging5().verify_QP_CA_section();
          //  Thread.sleep(500);
            WebDriver driver = getDriver();

            //close second tab and go back to default tab
            driver.close();
            Thread.sleep(500);
            BaseClass.reportfoldersection().change_to_default_tab();
            Thread.sleep(1000);
            //  ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);

            BaseClass.staging5().click_project_summary_sectionView();


            BaseClass.staging5().click_section_row_editor_projectSummary();

            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();

            BaseClass.templatesSection().select_all_body_and_delete_iFrame();

            BaseClass.templatesSection().enter_spellCheck_text_time_iFrame();

            Thread.sleep(500);
            driver.switchTo().parentFrame();
            Thread.sleep(500);
            // click out of section, capture report tag text
            BaseClass.staging5().click_out_of_section();
            BaseClass.templatesSection().verify_alertMessage_projectSummary();
           // driver.navigate().refresh();
           // Thread.sleep(500);
           // BaseClass.staging5().click_project_summary_sectionView();
           // Thread.sleep(500);
            BaseClass.templatesSection().verify_spellCheck_text();
            BaseClass.staging5().verify_QP_CA_section();

            Thread.sleep(500);

            //delete c/a section 2
            BaseClass.staging5().hover_and_click_section_2_checkbox();
            Thread.sleep(500);
            BaseClass.staging5().click_trash_icon_sectionView();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);

            BaseClass.projectFolderSection().clickPrevProjectButton();
            Thread.sleep(1000);

        }
        //  ReusableMethodsLoggersPOM.captureTextMethodByIndex(driver, linkItem,linkItem.get(i) ,logger, "QA automation Reports - search field");}

        //  @FindBy(xpath = "//*[@class='htLeft q-readonly current highlight']")
        //  WebElement dateCreatedReport;

//    public void captureRecentFolderDateCreated() {
//        //String reportDate= dateCreatedReport.getAttribute("text");
//       // System.out.println("date created: " + reportDate);
//        String result2 = ReusableMethodsLoggersPOM.captureTextMethod(driver, dateCreatedReport, logger, "date created message ");
//        System.out.println("\n" + "Date Created: " + result2);
//    }


    }

    public void ck5PackagesCheck() throws InterruptedException {
        int linkItemCount = linkItem.size();

        if (browserName.contains("Chrome")) {
            Thread.sleep(100);
        } else if (browserName.contains("Firefox")) {
            Thread.sleep(8000);
        }
        for (int i = 0; i <( linkItemCount); i++) {

            // Skip index 3 and 7
//            if (i == 0 || i == 4) {
//                continue; // Skip this iteration and go to the next one
//            }
            ReusableMethodsLoggersPOM.captureTextMethod(driver, linkItem.get(i), logger, "report link name at index: " + i);
            ReusableMethodsLoggersPOM.scrollToElementMethod(driver, linkItem.get(i), logger, "report link at index: " + i);
            ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);
            Thread.sleep(1500);
            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(1000);
            BaseClass.staging5().click_add_conditionAction_toSection();
            Thread.sleep(800);
            driver.navigate().refresh();
           Thread.sleep(800);

            //change name for section title
            BaseClass.staging5().enter_section_2_title_text();


            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);


      //      if (i != 5) {
                BaseClass.staging5().click_conditionAction_dropdown();
         //       Thread.sleep(500);
            Thread.sleep(500);
            driver.navigate().refresh();


            //   }

         //   BaseClass.staging5().captureAlertMessage();
         //   Thread.sleep(500);

         //   Thread.sleep(500);

            Thread.sleep(500);


            //  ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);

            BaseClass.staging5().click_project_summary_sectionView();


        //    BaseClass.staging5().click_section_row_editor_projectSummary();

//            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();

//            BaseClass.templatesSection().select_all_body_and_delete_iFrame();

//            BaseClass.templatesSection().enter_spellCheck_text_time_iFrame();
//
//            Thread.sleep(500);
//            driver.switchTo().parentFrame();
            Thread.sleep(500);

            BaseClass.staging5().click_section_row_editor_projectSummary();
            Thread.sleep(1000);
            BaseClass.ck5editor().enter_and_verify_project_summary_text();
            Thread.sleep(500);
            BaseClass.staging5().click_default_section_title();
            Thread.sleep(500);
            BaseClass.staging5().verify_ConditionAction_ProjSummary_and_QP();
            Thread.sleep(500);


//            //quick preview button in next tab
//            BaseClass.reportfoldersection().click_quick_preview_button();
//            Thread.sleep(1000);
//            BaseClass.reportfoldersection().change_to_next_tab();
//            Thread.sleep(500);
//            //quick preview tab - capture header and footer data
//            BaseClass.staging5().verify_QP_CA_section();
            //  Thread.sleep(500);
            WebDriver driver = getDriver();

            //close second tab and go back to default tab
            driver.close();
            Thread.sleep(500);
            BaseClass.reportfoldersection().change_to_default_tab();
            Thread.sleep(1000);
            // click out of section, capture report tag text
         //   BaseClass.staging5().click_out_of_section();
         //   BaseClass.templatesSection().verify_alertMessage_projectSummary();
            // driver.navigate().refresh();
            // Thread.sleep(500);
            // BaseClass.staging5().click_project_summary_sectionView();
            // Thread.sleep(500);
          //  BaseClass.templatesSection().verify_spellCheck_text();
        //    BaseClass.staging5().verify_QP_proj_summary_section();

        //    Thread.sleep(500);

            //delete c/a section 2
            BaseClass.staging5().hover_and_click_section_2_checkbox();
            Thread.sleep(500);
            BaseClass.staging5().click_trash_icon_sectionView();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(1500);
            try {
                if (ok_button.isDisplayed()) {
                    BaseClass.staging5().click_ok_button();

                }
            } catch (Exception e) {
                System.out.println("no ok button");            }

            Thread.sleep(500);

            BaseClass.projectFolderSection().clickPrevProjectButton();
            Thread.sleep(2500);

        }
        //  ReusableMethodsLoggersPOM.captureTextMethodByIndex(driver, linkItem,linkItem.get(i) ,logger, "QA automation Reports - search field");}

        //  @FindBy(xpath = "//*[@class='htLeft q-readonly current highlight']")
        //  WebElement dateCreatedReport;

//    public void captureRecentFolderDateCreated() {
//        //String reportDate= dateCreatedReport.getAttribute("text");
//       // System.out.println("date created: " + reportDate);
//        String result2 = ReusableMethodsLoggersPOM.captureTextMethod(driver, dateCreatedReport, logger, "date created message ");
//        System.out.println("\n" + "Date Created: " + result2);
//    }


    }
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement ok_button;
    public void ck4PackagesCheck2() throws InterruptedException {
        int linkItemCount = linkItem.size();

        if (browserName.contains("Chrome")) {
            Thread.sleep(100);
        } else if (browserName.contains("Firefox")) {
            Thread.sleep(4000);
        }
        for (int i = 0; i < linkItemCount; i++) {

            // Skip index 3 and 7
            if (i != 0 && i != 4) {
                continue; // Skip this iteration and go to the next one

            }
            ReusableMethodsLoggersPOM.captureTextMethod(driver, linkItem.get(i), logger, "report link name at index: " + i);
            ReusableMethodsLoggersPOM.scrollToElementMethod(driver, linkItem.get(i), logger, "report link at index: " + i);
            ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);

            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(1000);
            BaseClass.staging5().click_add_conditionAction_toSection();
            Thread.sleep(800);
            BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
            Thread.sleep(800);

            //change name for section title
            BaseClass.staging5().enter_section_2_title_text();


            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);




    BaseClass.staging5().click_conditionAction_dropdown_items();

            BaseClass.staging5().enter_ca_section_cost();


            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(500);

            BaseClass.staging5().enter_conditionAction_comment_field();
            Thread.sleep(500);

            BaseClass.staging5().click_out_of_section();
            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(500);

            //quick preview button in next tab
            BaseClass.reportfoldersection().click_quick_preview_button();
            Thread.sleep(1000);
            BaseClass.reportfoldersection().change_to_next_tab();
            Thread.sleep(500);
            //quick preview tab - capture header and footer data
            BaseClass.staging5().verify_QP_proj_summary_section2();
            //  Thread.sleep(500);
            WebDriver driver = getDriver();

            //close second tab and go back to default tab
            driver.close();
            Thread.sleep(500);
            BaseClass.reportfoldersection().change_to_default_tab();
            Thread.sleep(1000);
            //  ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);

            BaseClass.staging5().click_project_summary_sectionView();


            BaseClass.staging5().click_section_row_editor_projectSummary();

            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();

            BaseClass.templatesSection().select_all_body_and_delete_iFrame();

            BaseClass.templatesSection().enter_spellCheck_text_time_iFrame();

            Thread.sleep(500);
            driver.switchTo().parentFrame();
            Thread.sleep(500);
            // click out of section, capture report tag text
            BaseClass.staging5().click_out_of_section();
            BaseClass.templatesSection().verify_alertMessage_projectSummary();
            // driver.navigate().refresh();
            // Thread.sleep(500);
            // BaseClass.staging5().click_project_summary_sectionView();
            // Thread.sleep(500);
            BaseClass.templatesSection().verify_spellCheck_text();
            BaseClass.staging5().verify_QP_proj_summary_section2();

            Thread.sleep(500);

            //delete c/a section 2
            BaseClass.staging5().hover_and_click_section_2_checkbox();
            Thread.sleep(500);
            BaseClass.staging5().click_trash_icon_sectionView();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);

            BaseClass.projectFolderSection().clickPrevProjectButton();
            Thread.sleep(1000);

        }
        //  ReusableMethodsLoggersPOM.captureTextMethodByIndex(driver, linkItem,linkItem.get(i) ,logger, "QA automation Reports - search field");}

        //  @FindBy(xpath = "//*[@class='htLeft q-readonly current highlight']")
        //  WebElement dateCreatedReport;

//    public void captureRecentFolderDateCreated() {
//        //String reportDate= dateCreatedReport.getAttribute("text");
//       // System.out.println("date created: " + reportDate);
//        String result2 = ReusableMethodsLoggersPOM.captureTextMethod(driver, dateCreatedReport, logger, "date created message ");
//        System.out.println("\n" + "Date Created: " + result2);
//    }


    }


    public void ck4PackagesCheck_matrix() throws InterruptedException {
        int linkItemCount = linkItem.size();

        if (browserName.contains("Chrome")) {
            Thread.sleep(100);
        } else if (browserName.contains("Firefox")) {
            Thread.sleep(4000);
        }
        for (int i = 0; i < linkItemCount; i++) {

            // Skip index 3 and 7
//            if (i == 0 || i == 4) {
//                continue; // Skip this iteration and go to the next one
//            }
            ReusableMethodsLoggersPOM.captureTextMethod(driver, linkItem.get(i), logger, "report link name at index: " + i);
            ReusableMethodsLoggersPOM.scrollToElementMethod(driver, linkItem.get(i), logger, "report link at index: " + i);
            ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);

            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(1000);
            BaseClass.staging5().click_add_conditionAction_toSection();
            Thread.sleep(2000);
            BaseClass.staging5().click_add_costRecommendation_toSection();
            Thread.sleep(2000);

            BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
            Thread.sleep(800);

            //change name for section title
            BaseClass.staging5().enter_section_2_title_text();


            BaseClass.staging5().click_default_section_title();
            Thread.sleep(1000);

//
//            if (i != 5) {
//                BaseClass.staging5().click_conditionAction_dropdown();
//                Thread.sleep(500);
//                BaseClass.staging5().click_conditionAction_dropdown_first_item();
//            }

    BaseClass.staging5().click_conditionAction_dropdown_items();



//            BaseClass.staging5().captureAlertMessage();
//            Thread.sleep(500);

    //        BaseClass.staging5().enter_conditionAction_comment_field();
            Thread.sleep(500);

            BaseClass.staging5().click_out_of_section();
            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(500);

            //add cost rec
            BaseClass.staging5().click_add_cost_recommendation_button();
            BaseClass.staging5().enter_item_name_cost_recommendation();
            Thread.sleep(500);
            BaseClass.staging5().enter_cost_summary_quantity();
            BaseClass.staging5().enter_cost_summary_unit_cost();
            BaseClass.staging5().click_critical_repair_cost_checkbox();
            Thread.sleep(500);
            BaseClass.staging5().enter_cost_summary_comments();
            Thread.sleep(500);
            BaseClass.staging5().click_save_button();
            Thread.sleep(500);

            //quick preview button in next tab
            BaseClass.reportfoldersection().click_quick_preview_button();
            Thread.sleep(1000);
            BaseClass.reportfoldersection().change_to_next_tab();
            Thread.sleep(1000);
            //quick preview tab - capture header and footer data
            BaseClass.staging5().verify_QP_proj_summary_section_matrix();
            //  Thread.sleep(500);
            WebDriver driver = getDriver();

            //close second tab and go back to default tab
            driver.close();
            Thread.sleep(500);
            BaseClass.reportfoldersection().change_to_default_tab();
            Thread.sleep(1000);
            //  ReusableMethodsLoggersPOM.clickMethod(driver, linkItem.get(i), logger, "report link at index: " + i);

            BaseClass.staging5().click_project_summary_sectionView();


            BaseClass.staging5().click_section_row_editor_projectSummary();

            BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();

            BaseClass.templatesSection().select_all_body_and_delete_iFrame();

            BaseClass.templatesSection().enter_spellCheck_text_time_iFrame();

            Thread.sleep(500);
            driver.switchTo().parentFrame();
            Thread.sleep(500);
            // click out of section, capture report tag text
            BaseClass.staging5().click_out_of_section();
            Thread.sleep(500);

            BaseClass.templatesSection().verify_alertMessage_projectSummary();
            // driver.navigate().refresh();
            // Thread.sleep(500);
            // BaseClass.staging5().click_project_summary_sectionView();
            // Thread.sleep(500);
            BaseClass.templatesSection().verify_spellCheck_text();
            BaseClass.staging5().verify_QP_proj_summary_section_matrix();

            Thread.sleep(500);

            //delete c/a section 2
            BaseClass.staging5().hover_and_click_section_2_checkbox();
            BaseClass.staging5().click_cost_rec_section_checkbox();

            Thread.sleep(500);
            BaseClass.staging5().click_trash_icon_sectionView();
            Thread.sleep(500);
            driver.switchTo().alert().accept();
            Thread.sleep(500);

            BaseClass.projectFolderSection().clickPrevProjectButton();
            Thread.sleep(1000);

        }
        //  ReusableMethodsLoggersPOM.captureTextMethodByIndex(driver, linkItem,linkItem.get(i) ,logger, "QA automation Reports - search field");}

        //  @FindBy(xpath = "//*[@class='htLeft q-readonly current highlight']")
        //  WebElement dateCreatedReport;

//    public void captureRecentFolderDateCreated() {
//        //String reportDate= dateCreatedReport.getAttribute("text");
//       // System.out.println("date created: " + reportDate);
//        String result2 = ReusableMethodsLoggersPOM.captureTextMethod(driver, dateCreatedReport, logger, "date created message ");
//        System.out.println("\n" + "Date Created: " + result2);
//    }


    }

}




