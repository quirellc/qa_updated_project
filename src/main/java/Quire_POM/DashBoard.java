package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class DashBoard extends ReusableAnnotations {
    //]must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public DashBoard(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor


    @FindBy(xpath = "//div[@class='pinnedItems-contentContainer']")
    WebElement pinnedItem_dashboard_data;

    @FindBy(xpath = "//div[@class='pinnedItems-contentContainer']")
    List<WebElement> pinned_Item_dashboard_data;

    @FindBy(xpath = "//a[@class='js-pinnedItems-toggleAction']//i[@class='fa fa-thumb-tack fa-lg']")
    WebElement pinned_icon_dashboard;


    @FindBy(xpath = "//span[@class='pinnedItems-counter item-count js-pinnedItems-counter text-center']")
    WebElement pinned_Item_dashboard_count;

    public void confirm_pinned_items_dashboard() throws InterruptedException {
        ReusableMethodsLoggersPOM.confirm_dashboard_bubble_count(driver, pinned_Item_dashboard_count, pinned_Item_dashboard_data, logger, "pinned_Items");
    }

//    public void confirm_pinned_items() throws InterruptedException {
//        SoftAssert softAssert = new SoftAssert();
//
//        String pinnedItemsCountText = ReusableMethodsLoggersPOM.captureTextMethod(driver, pinned_Item_dashboard_count, logger, "pinned_Item_bubble_count");
//
//        // Convert the captured text to an integer
//        int pinnedItemsCount;
//        try {
//            pinnedItemsCount = Integer.parseInt(pinnedItemsCountText);
//        } catch (NumberFormatException e) {
//            pinnedItemsCount = -1; // or handle the error as needed
//            softAssert.fail("The captured text is not a valid integer: " + pinnedItemsCountText);
//        }
//        int pinnedItemsSize =pinned_Item_dashboard_data.size();
//        // Use SoftAssert to compare the text integer with the size of the list
//        if (pinnedItemsCount == pinnedItemsSize) {
//            // Print statement if the values match
//            System.out.println("The pinned items bubble (" + pinnedItemsCount + ") matches pinned items (" + pinnedItemsSize + ").");
//            logger.log(LogStatus.PASS, "The pinned items bubble (" + pinnedItemsCount + ") matches pinned items (" + pinnedItemsSize + ").");
//
//        } else {
//            // Assert and fail if the values do not match
//            softAssert.assertEquals(pinnedItemsCount, pinnedItemsSize, "The pinned items bubble DOES NOT match with the size of pinned items.");
//            logger.log(LogStatus.FAIL, "The pinned items bubble (" + pinnedItemsCount + ") DOES NOT match with the size of pinned items (" + pinnedItemsSize + ").");
//
//        }
//        // Report any soft assertion failures
//        softAssert.assertAll();
//    }


    @FindBy(xpath = "//div[@id='widget-recentlyEditedReports']//li")
    List<WebElement> recentlyEditedReports_dashboard_items;

    @FindBy(xpath = "//div[@id='widget-recentlyEditedReports']//div[@class='item-counter js-item-counter text-center item-count']")
    WebElement recentlyEditedReports_bubble_dashboard_count;

    public void confirm_recently_edited_reports_items() throws InterruptedException {
        ReusableMethodsLoggersPOM.confirm_dashboard_bubble_count(driver, recentlyEditedReports_bubble_dashboard_count, recentlyEditedReports_dashboard_items, logger, "recently_edited_reports bubble");


//        SoftAssert softAssert = new SoftAssert();
//
//        String recentlyEditedReportsCountText = ReusableMethodsLoggersPOM.captureTextMethod(driver, recentlyEditedReports_bubble_dashboard_count, logger, "recentlyEditedReports_bubble_dashboard_count");
//
//        // Convert the captured text to an integer
//        int recentlyEditedReportsCount;
//        try {
//            recentlyEditedReportsCount = Integer.parseInt(recentlyEditedReportsCountText);
//        } catch (NumberFormatException e) {
//            recentlyEditedReportsCount = -1; // or handle the error as needed
//            softAssert.fail("The captured text is not a valid integer: " + recentlyEditedReportsCountText);
//        }
//        int recentlyEditedReports_dashboard_items_size =recentlyEditedReports_dashboard_items.size();
//        // Use SoftAssert to compare the text integer with the size of the list
//        if (recentlyEditedReportsCount == recentlyEditedReports_dashboard_items_size) {
//            // Print statement if the values match
//            System.out.println("recently_edited_reports bubble (" + recentlyEditedReportsCount + ") matches items in the widget. (" + recentlyEditedReports_dashboard_items_size + ") ");
//            logger.log(LogStatus.PASS, "recently_edited_reports bubble (" + recentlyEditedReportsCount + ") matches items in the widget. (" + recentlyEditedReports_dashboard_items_size + ") ");
//
//        } else {
//            // Assert and fail if the values do not match
//            softAssert.assertEquals(recentlyEditedReportsCount, recentlyEditedReports_dashboard_items_size, "The recently_edited_reports  bubble DOES NOT match with the items in the widget.(" + recentlyEditedReports_dashboard_items_size + ").");
//            logger.log(LogStatus.FAIL, "The items in the widget  bubble (" + recentlyEditedReportsCount + ") DOES NOT match with the size of items in the widget (" + recentlyEditedReports_dashboard_items_size + ").");
//
//        }
//        // Report any soft assertion failures
//        softAssert.assertAll();
    }


    public void capture_and_delete_pinnedItem_dashboard() throws InterruptedException {
        int pinnedItems_count = pinned_Item_dashboard_data.size();
        for (int i = 0; i < pinnedItems_count; i++) {
            System.out.println("pinned items size :   " + pinned_Item_dashboard_data.size());
            ReusableMethodsLoggersPOM.captureTextMethod(driver, pinnedItem_dashboard_data, logger, "Pinned Item: ");
            Thread.sleep(1000);
            ReusableMethodsLoggersPOM.clickMethod(driver, pinned_icon_dashboard, logger, "unpin dashboard item");
            Thread.sleep(1000);
        }
    }

    @FindBy(xpath = "//div[@class='pinnedReports-initiatorContent report-link-item']")
    WebElement statusChangeIcon_pinnedItems;
    @FindBy(xpath = "//div[@class='report-status has-tooltip js-has-tooltip']//span[@class='status'][normalize-space()='Review']")
    WebElement reportStatus_in_review;

    public void verify_statusChange_to_review_pinnedItems() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, statusChangeIcon_pinnedItems, true, logger, "statusChangeIcon_pinnedItems");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reportStatus_in_review, true, logger, "reportStatus_in_review");
    }


    @FindBy(xpath = "//div[@class='pinnedItems-container js-pinnedItems-body js-widget-body widget-body empty']")
    WebElement pinnedItems_empty_widget;

    public void verify_pinnedItems_is_empty() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, pinnedItems_empty_widget, true, logger, "pinnedItems_empty_widget");
    }


    @FindBy(xpath = "//div[@class='dashboard-column js-dashboard-column flex-container flex-column gap-16']//div[@id='widget-myQuireStats']")
    WebElement myQuireStats_dashboard_data;

    public void capture_myQuireStats_dashboard_data() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, myQuireStats_dashboard_data, logger, "myQuireStats_dashboard_data ");
    }

    @FindBy(xpath = "(//a[@data-remote='true'][normalize-space()='Edit Profile'])[2]")
    WebElement edit_profile_dashboard_button;

    public void click_edit_profile_dashboard_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, edit_profile_dashboard_button, logger, "edit_profile_dashboard_button ");
    }


    @FindBy(xpath = "//div[@id='widget-myCompanies']//a[normalize-space()='Testing Inc.']")
    WebElement contractor_testingInc_link;

    public void click_contractor_testingInc_company_link() {
        ReusableMethodsLoggersPOM.clickMethod(driver, contractor_testingInc_link, logger, "contractor_testingInc_link");
    }

    @FindBy(xpath = "//div[@id='widget-myCompanies']//li")
    List<WebElement> myCompanies_dashboard_items;

    @FindBy(xpath = "//div[@id='widget-myCompanies']//div[@class='item-counter js-item-counter text-center item-count']")
    WebElement myCompanies_bubble_dashboard_count;

    public void confirm_myCompanies_items_dashboard() throws InterruptedException {
        ReusableMethodsLoggersPOM.confirm_dashboard_bubble_count(driver, myCompanies_bubble_dashboard_count, myCompanies_dashboard_items, logger, "pinned_Items");
    }

//    public void confirm_myCompanies_items() throws InterruptedException {
//        SoftAssert softAssert = new SoftAssert();
//
//        String myCompaniesCountText = ReusableMethodsLoggersPOM.captureTextMethod(driver, myCompanies_bubble_dashboard_count, logger, "myCompanies_bubble_dashboard_count");
//
//        // Convert the captured text to an integer
//        int myCompaniesCount;
//        try {
//            myCompaniesCount = Integer.parseInt(myCompaniesCountText);
//        } catch (NumberFormatException e) {
//            myCompaniesCount = -1; // or handle the error as needed
//            softAssert.fail("The captured text is not a valid integer: " + myCompaniesCountText);
//        }
//        int myCompaniesCount_dashboard_items_size =myCompanies_dashboard_items.size();
//        // Use SoftAssert to compare the text integer with the size of the list
//        if (myCompaniesCount == myCompaniesCount_dashboard_items_size) {
//            // Print statement if the values match
//            System.out.println("recently_edited_reports bubble (" + myCompaniesCount + ") matches items in the widget. (" + myCompaniesCount_dashboard_items_size + ") ");
//            logger.log(LogStatus.PASS, "recently_edited_reports bubble (" + myCompaniesCount + ") matches items in the widget. (" + myCompaniesCount_dashboard_items_size + ") ");
//
//        } else {
//            // Assert and fail if the values do not match
//            softAssert.assertEquals(myCompaniesCount, myCompaniesCount_dashboard_items_size, "The recently_edited_reports  bubble DOES NOT match with the items in the widget.(" + myCompaniesCount_dashboard_items_size + ").");
//            logger.log(LogStatus.FAIL, "The items in the widget  bubble (" + myCompaniesCount + ") DOES NOT match with the size of items in the widget (" + myCompaniesCount_dashboard_items_size + ").");
//
//        }
//        // Report any soft assertion failures
//        softAssert.assertAll();
//    }


    @FindBy(xpath = "//div[@id='widget-recentProjects']//li")
    List<WebElement> recentProjects_dashboard_items;

    @FindBy(xpath = "//div[@id='widget-recentProjects']//div[@class='item-counter js-item-counter text-center item-count']")
    WebElement recentProjects_bubble_dashboard_count;

    public void confirm_recentProjects_items() throws InterruptedException {
        ReusableMethodsLoggersPOM.confirm_dashboard_bubble_count(driver, recentProjects_bubble_dashboard_count, recentProjects_dashboard_items, logger, "recentProjects bubble");
    }

    @FindBy(xpath = "//div[@id='widget-recentlySharedReports']//li")
    List<WebElement> recentlySharedReports_dashboard_items;

    @FindBy(xpath = "//div[@id='widget-recentlySharedReports']//div[@class='item-counter js-item-counter text-center item-count']")
    WebElement recentlySharedReports_bubble_dashboard_count;

    public void confirm_recentlySharedReports_items() throws InterruptedException {
        ReusableMethodsLoggersPOM.confirm_dashboard_bubble_count(driver, recentlySharedReports_bubble_dashboard_count, recentlySharedReports_dashboard_items, logger, "recently_shared_reports bubble");
    }


    @FindBy(xpath = "//div[contains(@class, 'company-name-dashboard')]//a")
    List<WebElement> company_reports_link;

    @FindBy(xpath = "//tbody/tr")
    List<WebElement> reports_size;

    @FindBy(xpath = "//div[contains(@class, 'company-report-count')]")
    List<WebElement> company_reports_bubble_count;

    public void confirm_contractor_company_reports() throws InterruptedException {
        int companies_in_dashboard = company_reports_link.size();
        System.out.println(companies_in_dashboard + "reports in folder");

        for (int i = 0; i < companies_in_dashboard; i++) {

            String bubble_company_reports_count_string = ReusableMethodsLoggersPOM.captureTextMethod(driver, company_reports_bubble_count.get(i), logger, "bubble_dashboard_count at index: " + i);
            int bubble_company_reports_count_int = Integer.parseInt(bubble_company_reports_count_string);

            Thread.sleep(500);
            ReusableMethodsLoggersPOM.clickMethod(driver, company_reports_link.get(i), logger, "company_reports_link at index: " + i);
            Thread.sleep(1500);
            int reports_count = reports_size.size();
            System.out.println(reports_count + " reports in folder");
            Thread.sleep(1500);

            // Use soft assert to check if the values are the same
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(bubble_company_reports_count_int, reports_count, "The numbers are not the same!");

            // Print out a statement if the assertion fails
            if (bubble_company_reports_count_int == reports_count) {
                logger.log(LogStatus.PASS, "Company Reports" + " (" + reports_count + ") matches bubble report count in the widget. (" + bubble_company_reports_count_int + ") ");
                System.out.println("Company Reports" + " (" + reports_count + ") matches bubble report count in the widget. (" + bubble_company_reports_count_int + ") ");
            } else {
                logger.log(LogStatus.FAIL, "Company Reports" + " (" + reports_count + ") DOES NOT match bubble report count in the widget. (" + bubble_company_reports_count_int + ") ");

                System.out.println("Company Reports" + " (" + reports_count + ") DOES NOT match bubble report count in the widget. (" + bubble_company_reports_count_int + ") ");
            }

            // Call assertAll to report all failed assertions
            softAssert.assertAll();

            Thread.sleep(500);
            BaseClass.staging5().clickDashboardTab();
            Thread.sleep(500);
        }
    }


//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][1]//div[@id='widget-pinnedItems']")
//    WebElement widget_dashboard_first_column;
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][1]//div[@id='widget-myEditingTimeByDate']")
//    WebElement myEditingTimeByDate_dashboard_first_column;
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][1]//div[@id='widget-releaseNotes']")
//    WebElement releaseNotes_dashboard_first_column;
//
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][2]//div[@id='widget-recentlyEditedReports']")
//    WebElement recentlyEditedReports_dashboard_second_column;
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][2]//div[@id='widget-myEditingTimeByReportLabel']")
//    WebElement myEditingTimeByReportLabel_dashboard_second_column;
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][2]//div[@id='widget-tips']")
//    WebElement tips_dashboard_second_column;
//
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][3]//div[@id='widget-recentProjects']")
//    WebElement recentProjects_dashboard_third_column;
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][3]//div[@id='widget-recentlySharedReports']")
//    WebElement recentlySharedReports_dashboard_third_column;
//
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][3]//div[@id='widget-myEditingTimeByStatus']")
//    WebElement myEditingTimeByStatus_dashboard_third_column;
//    @FindBy(xpath = "//div[contains(@class, 'dashboard-column') and contains(@class, 'js-dashboard-column')][3]//div[@id='widget-myQuireStats']")
//    WebElement myQuireStats_dashboard_third_column;
//
//    public void verify_dashboard_widgets_editor_author() {
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, statusChangeIcon_pinnedItems, true, logger, "statusChangeIcon_pinnedItems");
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reportStatus_in_review, true, logger, "reportStatus_in_review");
//    }

    @FindBy(xpath = "(//div[@class='dashboard-column js-dashboard-column flex-container flex-column gap-16'])[1]")
    WebElement dashboard_first_column;
    @FindBy(xpath = "(//div[@class='dashboard-column js-dashboard-column flex-container flex-column gap-16'])[2]")
    WebElement dashboard_second_column;
    @FindBy(xpath = "(//div[@class='dashboard-column js-dashboard-column flex-container flex-column gap-16'])[3]")
    WebElement dashboard_third_column;


    public void verify_dashboard_first_column() {
        String dashboard_first_column_text = ReusableMethodsLoggersPOM.saveTextMethod(driver, dashboard_first_column, logger, "dashboard_first_column" );
        // Define the substrings you want to check for
        // Check if all required substrings are present in the captured text
        if (dashboard_first_column_text.contains("My Pinned Items") &&
                dashboard_first_column_text.contains("My Editing Time (by Date)") &&
                dashboard_first_column_text.contains("Quire Release Notes")) {

            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "First column widgets matches layout expected for author  ");
            System.out.println("First column widgets layout matches expected for author   ");

        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "First column widgets layout DOES NOT match whats expected for author ");
            System.out.println("First column widgets layout DOES NOT match whats expected for author ");

            // Optionally, fail the test or take other actions
        }

    }
    public void verify_dashboard_second_column() {
        String dashboard_second_column_text = ReusableMethodsLoggersPOM.saveTextMethod(driver, dashboard_second_column, logger, "dashboard_second_column" );
        // Define the substrings you want to check for
        // Check if all required substrings are present in the captured text
        if (dashboard_second_column_text.contains("My Recently Edited Reports") &&
                dashboard_second_column_text.contains("My Editing Time (by Report/Label)") &&
                (dashboard_second_column_text.contains("Tip:") || dashboard_second_column_text.contains("Live Training"))) {
            // your code here

            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "Second column widgets matches layout expected  for author ");
            System.out.println("Second column widgets layout matches expected   ");

        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "Second column widgets layout DOES NOT match whats expected  ");
            System.out.println("Second column widgets layout DOES NOT match whats expected   ");

            // Optionally, fail the test or take other actions
        }}

    public void verify_dashboard_third_column_author() {
        String dashboard_third_column_text = ReusableMethodsLoggersPOM.saveTextMethod(driver, dashboard_third_column, logger, "dashboard_third_column" );
        // Define the substrings you want to check for
        // Check if all required substrings are present in the captured text
        if (dashboard_third_column_text.contains("My Recent Project Folders") &&
                dashboard_third_column_text.contains("Reports Recently Shared with Me") &&
                dashboard_third_column_text.contains("My Editing Time (by Status)") &&
                dashboard_third_column_text.contains("My Quire Stats")) {

            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "Third column widgets matches layout expected  for author  ");
            System.out.println("Third column widgets layout matches expected  for author ");

        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "Third column widgets layout does not match whats expected  for author ");
            System.out.println("Third column widgets layout DOES NOT match whats expected  for author ");

            // Optionally, fail the test or take other actions
        }
}

    public void verify_dashboard_third_column_pm() {
        String dashboard_third_column_text = ReusableMethodsLoggersPOM.saveTextMethod(driver, dashboard_third_column, logger, "dashboard_third_column" );
        // Define the substrings you want to check for
        // Check if all required substrings are present in the captured text
        if (dashboard_third_column_text.contains("My Recent Project Folders") &&
                dashboard_third_column_text.contains("My Editing Time (by Status)") &&
                dashboard_third_column_text.contains("My Quire Stats")) {

            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "Third column widgets matches layout expected  for PM  ");
            System.out.println("Third column widgets layout matches expected  for PM ");

        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "Third column widgets layout does not match whats expected  for PM ");
            System.out.println("Third column widgets layout DOES NOT match whats expected  for PM ");

            // Optionally, fail the test or take other actions
        }
    }

    public void verify_dashboard_third_column_contractor() {
        String dashboard_third_column_text = ReusableMethodsLoggersPOM.saveTextMethod(driver, dashboard_third_column, logger, "dashboard_third_column" );
        // Define the substrings you want to check for
        // Check if all required substrings are present in the captured text
        if (dashboard_third_column_text.contains("My Companies") &&
                dashboard_third_column_text.contains("Reports Recently Shared with Me") &&
                dashboard_third_column_text.contains("My Editing Time (by Company)") &&
                dashboard_third_column_text.contains("My Quire Stats")) {

            // Log success if all conditions are met
            logger.log(LogStatus.PASS, "Third column widgets matches layout expected for contractor  ");
            System.out.println("Third column widgets layout matches expected  for author ");

        } else {
            // Log failure if any condition is not met
            logger.log(LogStatus.FAIL, "Third column widgets layout does not match whats expected for contractor ");
            System.out.println("Third column widgets layout DOES NOT match whats expected  for author ");

            // Optionally, fail the test or take other actions
        }
    }

    @FindBy(xpath = "//i[@class='fa fa-angle-right fa-lg fa-fw']")
    WebElement tip_dashboard_right_arrow;

    @FindBy(xpath = "//div[@class='widget-footer-index flex-grow-1 text-right text-md font-medium js-footer-index']")
    WebElement tips_number_count;
    @FindBy(xpath = "//div[@id='widget-tips']//div[@class='widget-title-text js-widget-title-text']")
    WebElement tip_dashboard_header_data;

    public void capture_tip_dashboard_header_data() throws InterruptedException {
        //   WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));

        String number_of_tips_string = ReusableMethodsLoggersPOM.saveTextMethod(driver, tips_number_count, logger, "Number_of_tips ");

        String[] parts = number_of_tips_string.split("of");
        int tip_count = Integer.parseInt(parts[1].trim());
        System.out.println("number of tips: " + tip_count);


        for (int i = 1; i <= tip_count; i++) {
            ReusableMethodsLoggersPOM.captureTextMethod(driver, tip_dashboard_header_data, logger, "Dashboard Tip: " + i);
            tip_dashboard_right_arrow.click();
            //  wait.until(ExpectedConditions.elementToBeClickable(tip_dashboard_right_arrow)).click();
            // Thread.sleep(200);
            //  ReusableMethodsLoggersPOM.clickMethod(driver, pinned_icon_dashboard, logger, "pinned_icon_dashboard");

            // System.out.println(tip_dashboard_header_data.getText());
            Thread.sleep(200);


        }
    }

        @FindBy(xpath = "//div[contains(@class, 'js-widget-loading')]//div[@class='quireWaitingUI-animation']")
        WebElement fetching_data_animation;

        public void verify_no_fetching_data_messages() {
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fetching_data_animation, false, logger, "fetching_data_animation");
        }

    @FindBy(xpath = "//div[contains(@class,'widget-refresh js-widget-refresh js-widget-action has-tooltip')]")
    List<WebElement> refresh_widget_button;

    public void refresh_all_widgets() throws InterruptedException {
        int refresh_widget_buttons = refresh_widget_button.size();
        System.out.println("dashboard refresh buttons :   " + refresh_widget_buttons);
Thread.sleep(2000);
        for (int i = 0; i < refresh_widget_buttons; i++) {
            ReusableMethodsLoggersPOM.scrollToElementMethod(driver, refresh_widget_button.get(i), logger, "refresh_widget_button: " + i );
            ReusableMethodsLoggersPOM.clickMethod(driver, refresh_widget_button.get(i), logger, "refresh_widget_button: " + i );

            // Thread.sleep(200);
        }
    }

    @FindBy(xpath = "//div[@id='widget-releaseNotes']//h3")
    WebElement recent_release_note_header;

    @FindBy(xpath = "//div[@id='widget-releaseNotes']//ul")
    WebElement recent_release_note_data;


    public void capture_quire_release_notes_recentData() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, recent_release_note_header, logger, "Quire Release Notes most recent Header");
        ReusableMethodsLoggersPOM.captureTextMethod(driver, recent_release_note_data, logger, "Quire Release Notes most recent Data");
    }
    }