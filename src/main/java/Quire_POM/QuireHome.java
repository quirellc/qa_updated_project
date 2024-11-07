package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class QuireHome extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public QuireHome(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "(//a[@href='https://openquire.com'])[3]")
    WebElement quire_home_Button;
    public void click_quire_home_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_home_Button, logger, "quire_home_Button");}

    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-808'])[5]")
    WebElement whyQuire_headerButton;
    public void click_whyQuire_headerButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, whyQuire_headerButton, logger, "whyQuire_headerButton");}

    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='How It Works'])[5]")
    WebElement howItWorks_subHeader_button;
    public void click_howItWorks_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, howItWorks_subHeader_button, logger, "howItWorks_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, howItWorks, true,logger, "howItWorks");
    }
    public void click_and_verify_howItWorks_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, howItWorks_subHeader_button, logger, "howItWorks_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, howItWorks, true,logger, "howItWorks");
    }
    public void verify_howItWorks_page() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, howItWorks, true,logger, "howItWorks");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/how-it-works", logger);
    }

    @FindBy(xpath = "(//a[@class='elementor-button elementor-slide-button elementor-size-lg'][normalize-space()='Learn More'])[2]")
    WebElement learnMore_home_Button;
    @FindBy(xpath = "//h6[normalize-space()='DATA ANALYTICS']")
    WebElement dataAnalytics_page;
    public void click_learnMore_home_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, learnMore_home_Button, logger, "learnMore_home_Button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, dataAnalytics_page, true, logger, "dataAnalytics_page");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/data-analytics", logger);
    }

    @FindBy(xpath = "//span[contains(text(),'Download Brochure')]")
    WebElement download_brochure_button;
    public void click_download_brochure_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, download_brochure_button, logger, "download_brochure_button");
        Thread.sleep(1000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(1000);
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/wp-content/uploads/2023/02/Quire-Data-Analyst-Role-5.pdf", logger);
        Thread.sleep(500);
        driver.close();
        BaseClass.reportfoldersection().change_to_default_tab();
    }

    @FindBy(xpath = "//div[contains(@id, 'elementor-tab-title-120')]")
    List <WebElement> topTabItems_dataAnalytics;

    @FindBy(xpath = "//strong[normalize-space()='For the Bottleneck Busters.']")
    WebElement detailed_report_metrics_text;
    @FindBy(xpath = "//strong[normalize-space()='For non-stop workflow improvements.']")
    WebElement monthly_metrics_text;
    @FindBy(xpath = "//strong[normalize-space()='For out-pacing the competition.']")
    WebElement Industry_Benchmarks_text;
    @FindBy(xpath = "//strong[normalize-space()='A never-before-seen data analytics experience.']")
    WebElement QuireSight_Analytics_text;

    public void performActions_dataAnalytics_page() throws InterruptedException {
        List<WebElement> elementsList = new ArrayList<>();
        elementsList.add(detailed_report_metrics_text);
        elementsList.add(monthly_metrics_text);
        elementsList.add(Industry_Benchmarks_text);
        elementsList.add(QuireSight_Analytics_text);

        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, topTabItems_dataAnalytics.get(1), logger, "top Item");
Thread.sleep(1500);
        for (int i = 0; i < 4; i++) {
            ReusableMethodsLoggersPOM.clickMethod(driver, topTabItems_dataAnalytics.get(i), logger, "Item at index: " + i);
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, elementsList.get(i), true,logger, String.valueOf(elementsList.get(i)));
            Thread.sleep(1000);

        }}



//    @FindBy(xpath = "//video[@class='elementor-video']")
//    WebElement howItWorks_view_mainPage;
    @FindBy(xpath = "(//span[@class='elementor-button-text'][normalize-space()='How it Works'])[1]")
    WebElement howItWorks_button;
    @FindBy(xpath = "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-e248eee elementor-section-boxed elementor-section-height-default elementor-section-height-default']")
    WebElement howItWorks_buttonView;
    public void click_howItWorks_button() throws InterruptedException {
        //ReusableMethodsLoggersPOM.scrollByPixelMethod(driver, 0, 1500);

       ReusableMethodsLoggersPOM.scrollToElementMethod(driver, howItWorks_buttonView, logger, "howItWorks_view_mainPage");
        Thread.sleep(1000);
        ReusableMethodsLoggersPOM.clickMethod(driver, howItWorks_button, logger, "howItWorks_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, howItWorks, true,logger, "howItWorks");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/how-it-works", logger);
    }


    @FindBy(xpath = "//span[contains(text(),'See How it Helps')]")
    WebElement howItHelps_button;
    @FindBy(xpath = "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-dd54643 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")
    WebElement howItHelps_buttonView;
    public void scroll_and_click_howItHelps_button() throws InterruptedException {
        //ReusableMethodsLoggersPOM.scrollByPixelMethod(driver, 0, 5500);
         ReusableMethodsLoggersPOM.scrollToElementMethod(driver, howItHelps_buttonView, logger, "howItHelps_buttonView");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, howItHelps_button, logger, "howItHelps_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, howItHelps, true,logger, "howItHelps");}



    @FindBy(xpath = "//div[contains(@id, 'elementor-tab-title-195')]")
    List <WebElement> topTabItems_howItHelps;

    @FindBy(xpath = "//h3[normalize-space()='Executives']")
    WebElement Executives_text;
    @FindBy(xpath = "//h3[normalize-space()='Product Owners']")
    WebElement productOwner_text;
    @FindBy(xpath = "//h3[normalize-space()='Senior Reviews']")
    WebElement seniorReviews_text;
    @FindBy(xpath = "//h3[normalize-space()='Report Writers']")
    WebElement reportWriters_text;


    public void performActions_howItHelps_page() throws InterruptedException {
        List<WebElement> elementsList = new ArrayList<>();
        elementsList.add(Executives_text);
        elementsList.add(productOwner_text);
        elementsList.add(seniorReviews_text);
        elementsList.add(reportWriters_text);

        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, topTabItems_howItHelps.get(1), logger, "top Item");
Thread.sleep(1500);
        for (int i = 0; i < 4; i++) {
            ReusableMethodsLoggersPOM.clickMethod(driver, topTabItems_howItHelps.get(i), logger, "Item at index: " + i);
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, elementsList.get(i), true,logger, String.valueOf(elementsList.get(i)));
        }}
    @FindBy(xpath = "//li[@role='presentation']")
    WebElement presentationItems;
    @FindBy(xpath = "//div[contains(@id, 'elementor-tab-title-22')]")
    List <WebElement> sideTabItems_howItWorks;
    @FindBy(xpath = "(//i[@class='fas fa-chevron-right'])")
    List <WebElement>  sideArrowButton;
    // Define WebElement for //div[@class='premium-carousel-template item-wrapper slick-slide slick-current slick-active']
    @FindBy(xpath = "//div[@class='premium-carousel-template item-wrapper slick-slide slick-current slick-active']")
    List <WebElement>  activeCarouselItem;
    @FindBy(xpath = "//i[@class='eicon-close']")
    WebElement closeButton;
    @FindBy(xpath = "//video[contains(@src, 'https://openquire.com/wp-content/uploads')]")
    WebElement video_verification;
    public void verify_howItWorks_sideTabs() throws InterruptedException {
        int sideTabItems_count = sideTabItems_howItWorks.size();
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, sideTabItems_howItWorks.get(1), logger, "side Item");
Thread.sleep(2000);
        for (int i = 0; i < sideTabItems_count -1 ; i++) {
            WebElement sideItem = sideTabItems_howItWorks.get(i);

            ReusableMethodsLoggersPOM.clickMethod(driver, sideItem, logger, "Item at index: " + i);
            Thread.sleep(500);
            ReusableMethodsLoggersPOM.clickMethod(driver, sideArrowButton.get(i), logger, "sideArrowButton");
            Thread.sleep(1500);
            // Click the active carousel item
            ReusableMethodsLoggersPOM.clickMethod(driver, activeCarouselItem.get(i), logger, "activeCarouselItem");
            Thread.sleep(500);

            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, video_verification, true,logger, "video_verification");
            Thread.sleep(500);
         //   JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//                boolean isPlaying = (boolean) jsExecutor.executeScript("return arguments[0].paused === false;", video_verification);
//            if (isPlaying) {
//                System.out.println("Video is playing.");
//            } else {
//                System.out.println("Video is paused or not playing.");
//          }
            // Click the close button
            ReusableMethodsLoggersPOM.clickMethod(driver, closeButton, logger, "closeButton");
            Thread.sleep(1000);
        }
    }

    @FindBy(xpath = "//span[contains(text(),'Get up-to-speed on all the features')]")
    WebElement getUptoSpeedOnFeatures_button;
    public void click_getUptoSpeedOnFeatures_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, getUptoSpeedOnFeatures_button, logger, "getUptoSpeedOnFeatures_button");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, getUptoSpeedOnFeatures_button, logger, "getUptoSpeedOnFeatures_button");
}

    @FindBy(xpath = "//h6[normalize-space()='VIEW PLANS']")
    public WebElement viewPlansPage;
    public void verify_viewPlansPage() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, viewPlansPage, true, logger, "viewPlansPage");
ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/view-plans", logger);
    }
    @FindBy(xpath = "(//span[@class='elementor-button-text'][normalize-space()='Price Your Package Today'])[1]")
    public WebElement priceYourPackage_button;
    public void click_priceYourPackage_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, priceYourPackage_button, logger, "priceYourPackage_button");
Thread.sleep(1500);
        ReusableMethodsLoggersPOM.clickMethod(driver, priceYourPackage_button, logger, "priceYourPackage_button");}
    @FindBy(xpath = "//h6[normalize-space()='TALK TO SALES']")
    public WebElement talkToSalesPage;
    public void verify_talkToSalesPage() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, talkToSalesPage, true, logger, "talkToSalesPage");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/talk-to-sales", logger);}






    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='How it Helps'])[5]")
    WebElement howItHelps_subHeader_button;
    public void click_howItHelps_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, howItHelps_subHeader_button, logger, "howItHelps_subHeader_button");}
    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Who We Are'])[5]")
    WebElement whoWeAre_subHeader_button;
    public void click_whoWeAre_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, whoWeAre_subHeader_button, logger, "whoWeAre_subHeader_button");}
    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Working with Quire'])[5]")
    WebElement workingWithQuire_subHeader_button;
    public void click_workingWithQuire_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, workingWithQuire_subHeader_button, logger, "workingWithQuire_subHeader_button");}



    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-809'])[5]")
    WebElement capabilities_headerButton;
    public void click_capabilities_headerButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, capabilities_headerButton, logger, "capabilities_headerButton");}

    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-5609'])[5]")
    WebElement specializations_subHeader_dropdown;
    public void  click_specializations_subHeader_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, specializations_subHeader_dropdown, logger, "specializations_subHeader_dropdown");}
    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='XML Ready'])[5]")
    WebElement xmlReady_subHeader_dropdown_button;
    public void  click_and_verify_xmlReady_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, xmlReady_subHeader_dropdown_button, logger, "xmlReady_subHeader_dropdown_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, xmlReady, true, logger, "xmlReady");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/xml-ready", logger);}



    @FindBy(xpath = "//span[contains(text(),'And More - See Why Quire')]")
    WebElement andMoreSeeWhy_Button;

    @FindBy(xpath = "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-4649717 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")
    WebElement andMoreSeeWhy_ButtonView;
    public void scroll_and_click_andMoreSeeWhyButton() throws InterruptedException {
     //   ReusableMethodsLoggersPOM.scrollByPixelMethod(driver, 0, 3500);
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, andMoreSeeWhy_ButtonView, logger, "andMoreSeeWhy_ButtonView");

        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, andMoreSeeWhy_Button, logger, "andMoreSeeWhy_Button");}


    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='PCA Toolkit'])[5]")
    WebElement pcaToolkit_subHeader_dropdown_button;
    @FindBy(xpath = "//h6[normalize-space()='PCA TOOLKIT']")
    WebElement pcaToolkit_page_text;
    public void  click_and_verify_pcaToolkit_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, pcaToolkit_subHeader_dropdown_button, logger, "pcaToolkit_subHeader_dropdown_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, pcaToolkit_page_text, true, logger, "pcaToolkit_page_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/pca-toolkit", logger);}

    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Freddie Mac 1104 Toolkit'])[5]")
    WebElement fm1104_subHeader_dropdown_button;
    @FindBy(xpath = "//h6[normalize-space()='FREDDIE MAC']")
    WebElement fm1104_page_text;

    @FindBy(xpath = "//video[contains(@src, '/openquire.com/wp-content/uploads/2021/07/1104Video0721f.mp4')]")
    WebElement  video_verification_fm1104;
    public void  click_and_verify_fm1104_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, fm1104_subHeader_dropdown_button, logger, "fm1104_subHeader_dropdown_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fm1104_page_text, true, logger, "fm1104_page_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/freddie-mac-1104-toolkit", logger);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, video_verification_fm1104, true, logger, "video_verification_fm1104");
    }

    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Report Workflow Management'])[5]")
    WebElement reportWorkFlowManagement_subHeaderButton;
    public void click_reportWorkFlowManagement_subHeaderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportWorkFlowManagement_subHeaderButton, logger, "reportWorkFlowManagement_subHeaderButton");}

    @FindBy(xpath = "//h6[normalize-space()='REPORT WORKFLOW MANAGEMENT']")
    WebElement reportWorkFlowManagement_page_text;
    public void verify_reportWorkFlowManagement_page_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reportWorkFlowManagement_page_text, true,logger, "reportWorkFlowManagement_page_text");
    ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/report-workflow-management", logger);}

    @FindBy(xpath = "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-49492b8 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")
    WebElement learnMoreButton_reportWorkFlowManagement_pageView;
    public void scroll_to_click_learnMoreButton_reportWorkFlowManagement_page() throws InterruptedException {
        //  ReusableMethodsLoggersPOM.scrollByPixelMethod(driver, 0, 8000);
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, learnMoreButton_reportWorkFlowManagement_pageView, logger, "learnMoreButton_reportWorkFlowManagement_pageView");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, learnMoreButton, logger, "learnMoreButton");}

    @FindBy(xpath = "//span[contains(text(),'Learn More')]")
    WebElement learnMoreButton;
    @FindBy(xpath = "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-1799262 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")
    WebElement learnMoreButton_fieldDataCollectionPageView;
    public void scroll_to_click_learnMoreButton_fieldDataCollectionPage() throws InterruptedException {
      //  ReusableMethodsLoggersPOM.scrollByPixelMethod(driver, 0, 8000);
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, learnMoreButton_fieldDataCollectionPageView, logger, "learnMoreButton_fieldDataCollectionPageView");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, learnMoreButton, logger, "learnMoreButton");}

    @FindBy(xpath = "//h6[normalize-space()='FIELD DATA COLLECTION']")
    WebElement FIELD_DATA_COLLECTION_page_text;
    public void verify_FIELD_DATA_COLLECTION_page_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, FIELD_DATA_COLLECTION_page_text, true,logger, "FIELD_DATA_COLLECTION_page_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/field-data-collection", logger);}



    @FindBy(xpath = "//div[contains(@id, 'elementor-tab-title-107')]")
    List <WebElement> sideTabItems_fieldDataCollection_page;

    @FindBy(xpath = "//video[contains(@src, 'https://openquire.com/wp-content/uploads')]")
    List <WebElement>  video_verification_fieldDataCollection;
    @FindBy(xpath = "//h3[normalize-space()='Collecting Data']")
    WebElement Collecting_Data_text;
    @FindBy(xpath = "//h3[normalize-space()='Edit Report Tags']")
    WebElement edit_reportTags_text;
    @FindBy(xpath = "//h3[normalize-space()='Add Notes from the Field']")
    WebElement addNotesFromTheField_text;
    @FindBy(xpath = "//h3[normalize-space()='Managing Photos']")
    WebElement managingPhotos_text;
    @FindBy(xpath = "//h3[normalize-space()='Viewing Image Meta Data']")
    WebElement viewImagesMetaData_text;
    @FindBy(xpath = "//h3[normalize-space()='Managing App Settings']")
    WebElement managingAppSettings_text;
    @FindBy(xpath = "//h3[normalize-space()='Scanning = Winning']")
    WebElement scanningWinning_text;
    @FindBy(xpath = "//h3[contains(text(),'See What’s in the Area')]")
    WebElement seeWhatsInArea_text;
    public void performActions_fieldDataCollection_page() throws InterruptedException {
        List<WebElement> elementsList = new ArrayList<>();
        elementsList.add(Collecting_Data_text);
        elementsList.add(edit_reportTags_text);
        elementsList.add(addNotesFromTheField_text);
        elementsList.add(managingPhotos_text);
        elementsList.add(viewImagesMetaData_text);
        elementsList.add(managingAppSettings_text);
        elementsList.add(scanningWinning_text);
        elementsList.add(seeWhatsInArea_text);
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, sideTabItems_fieldDataCollection_page.get(1), logger, "sideTabItems_fieldDataCollection_page");
        Thread.sleep(1500);
        for (int i = 0; i < 8; i++) {
            ReusableMethodsLoggersPOM.clickMethod(driver, sideTabItems_fieldDataCollection_page.get(i), logger, "Item at index: " + i);

                ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, video_verification_fieldDataCollection.get(i), true, logger, "video_verification_fieldDataCollection");

            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, elementsList.get(i), true,logger, String.valueOf(elementsList.get(i)));

        }

    }



    public void verify_integrations_page_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, integrations, true,logger, "integrations");
    ReusableMethodsLoggersPOM.verify_url(driver, "https://openquire.com/integrations", logger);}








    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-813'])[5]")
    WebElement whoWeServe_headerButton;

    public void click_whoWeServe_headerButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, whoWeServe_headerButton, logger, "whoWeServe_headerButton");}
    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Industries'])[5]")
    WebElement industries_subHeaderButton;
    @FindBy(xpath = "//h6[normalize-space()='INDUSTRIES WE SERVE']")
    WebElement industries_page_text;
    public void click_and_confirm_industries_subHeaderButton() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, industries_subHeaderButton, logger, "industries_subHeaderButton");
        Thread.sleep(1000);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, industries_page_text, true,logger, "industries_page_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "https://openquire.com/industries", logger);
    }

    @FindBy(xpath = "(//span[@class='elementor-button-text'][normalize-space()='Learn More'])[1]")
    WebElement learnMore_button_industriesPage;
    @FindBy(xpath = "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-2613765 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")
    WebElement learnMore_button_industriesPageView;
    public void scroll_and_click_learnMore_button_industriesPage() throws InterruptedException {
       // ReusableMethodsLoggersPOM.scrollByPixelMethod(driver, 0, 1000);
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, learnMore_button_industriesPageView, logger, "learnMore_button_industriesPageView");

        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, learnMore_button_industriesPage, logger, "learnMore_button_industriesPage");}
    @FindBy(xpath = "//h6[contains(text(),'TECHNICAL REPORT SOFTWARE FOR ENVIRONMENTAL CONSUL')]")
    WebElement env_consulting_report_page_text;
    public void verify_env_consulting_report_page() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, env_consulting_report_page_text, true,logger, "env_consulting_report_page_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/industries/environmental-consulting-reporting", logger);}

    @FindBy(xpath = "(//span[@class='elementor-button-text'][normalize-space()='Learn More'])[10]")
    WebElement last_learnMore_button_industriesPage;
    @FindBy(xpath = "//section[@class='elementor-section elementor-top-section elementor-element elementor-element-d863708 elementor-section-boxed elementor-section-height-default elementor-section-height-default']")
    WebElement last_learnMore_button_industriesPageView;
    public void scroll_and_click_last_learnMore_button_industriesPage() throws InterruptedException {
     //   ReusableMethodsLoggersPOM.scrollByPixelMethod(driver, 0, 10500);
        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, last_learnMore_button_industriesPageView, logger, "last_learnMore_button_industriesPageView");

        Thread.sleep(500);
        ReusableMethodsLoggersPOM.clickMethod(driver, last_learnMore_button_industriesPage, logger, "last_learnMore_button_industriesPage");}
    @FindBy(xpath = "//h6[normalize-space()='The New Word in Occupational Health']")
    WebElement industrialHygienePage_text;
    public void verify_industrialHygienePage_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, industrialHygienePage_text, true,logger, "industrialHygienePage_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/industries/industrial-hygiene", logger);}

////////////////// resources header ////////////////////////////////

    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-816'])[5]//span[@class='sub-arrow']")
    WebElement resources_headerButton;
    public void click_resources_headerButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, resources_headerButton, logger, "resources_headerButton");}

    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Quire vs. Word'])[5]")
    WebElement quireVsWord_subHeaderButton;
    @FindBy(xpath = "//h6[contains(text(),'QUIRE VS MICROSOFT WORD™')]")
    WebElement quireVsWord_page_text;
    public void click_and_confirm_quireVsWord_subHeaderButton() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, quireVsWord_subHeaderButton, logger, "quireVsWord_subHeaderButton");
        Thread.sleep(1000);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quireVsWord_page_text, true,logger, "quireVsWord_page_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/quire-vs-word", logger);}

    @FindBy(xpath = "//div[contains(@id, 'elementor-tab-title-255')]")
    List <WebElement> tabItems_quireVsWord_page;

    @FindBy(xpath = "//h3[normalize-space()='Report Setup']")
    WebElement Setup_text;
    @FindBy(xpath = "//h3[normalize-space()='Report Writing']")
    WebElement Writing_text;
    @FindBy(xpath = "//h3[normalize-space()='Managing the Project']")
    WebElement management_text;
    @FindBy(xpath = "//h3[normalize-space()='Reviewing the Report']")
    WebElement reviews_text;
    @FindBy(xpath = "//h3[normalize-space()='Assembly & Delivery']")
    WebElement assemblyAndDelivery_text;
    @FindBy(xpath = "//h3[normalize-space()='Client-Mandated Revisions']")
    WebElement revisions_text;

    public void performActions_quireVsWord_page() throws InterruptedException {
        List<WebElement> elementsList = new ArrayList<>();
        elementsList.add(Setup_text);
        elementsList.add(Writing_text);
        elementsList.add(management_text);
        elementsList.add(reviews_text);
        elementsList.add(assemblyAndDelivery_text);
        elementsList.add(revisions_text);

        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, tabItems_quireVsWord_page.get(1), logger, "tabItems_quireVsWord_page");
        Thread.sleep(1500);

        for (int i = 0; i < 6; i++) {
            ReusableMethodsLoggersPOM.clickMethod(driver, tabItems_quireVsWord_page.get(i), logger, "Item at index: " + i);
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, elementsList.get(i), true,logger, String.valueOf(elementsList.get(i)));
        }}





    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Help Center'])[5]")
    WebElement helpCenter_subHeaderButton;
    public void click_helpCenter_subHeaderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, helpCenter_subHeaderButton, logger, "helpCenter_subHeaderButton");}
    @FindBy(xpath = "//span[text()='Visit Quire Help Center']")
    WebElement visit_quire_helpCenter_button;
    public void click_visit_quire_helpCenter_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, visit_quire_helpCenter_button, logger, "visit_quire_helpCenter_button");}

    @FindBy(xpath = "//div[@class='customer-login-link']//a[contains(text(),'Login here')]")
    WebElement login_here_to_supportPortal_button;
    public void click_login_here_to_supportPortal_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, login_here_to_supportPortal_button, logger, "login_here_to_supportPortal_button");}






    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-820'])[5]")
    WebElement getStarted_headerButton;

    public void click_getStarted_headerButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, getStarted_headerButton, logger, "getStarted_headerButton");}

    @FindBy(xpath = "//iframe[@id='hs-form-iframe-0']")
    WebElement form_field_iFrame;
    @FindBy(xpath = "//input[@name='email']")
    WebElement email_address;
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstname;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastname;
    @FindBy(xpath = "//input[@name='company']")
    WebElement company;
    @FindBy(xpath = "//select[@name='which_industry_best_describes_your_reporting_needs']")
    WebElement industry_dropDown;
    @FindBy(xpath = "//textarea[@name='please_describe_your_current_report_writing_methods_']")
    WebElement textField_reportWritingMethods;
    @FindBy(xpath = "//input[@value='Contact Me to Schedule My Demo']")
    WebElement contactMeToScheduleDemo_button;
    public void fill_out_requestDemo_form() throws InterruptedException {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, form_field_iFrame, logger, "form_field_iFrame");
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, email_address, "test2@quiretest.com", logger, "email_address");
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, firstname, "QA", logger, "firstname");
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, lastname, "Automation", logger, "lastname");
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, company, "OpenQuire Testing", logger, "company");
        ReusableMethodsLoggersPOM.selectByValue(driver, industry_dropDown, "Other", logger, "industry_dropDown");
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, textField_reportWritingMethods, "QA Automation Testing script", logger, "textField_reportWritingMethods");
        ReusableMethodsLoggersPOM.clickMethod(driver, contactMeToScheduleDemo_button, logger, "contactMeToScheduleDemo_button");

    }



    // WebElements for different pages
    @FindBy(xpath = "//h6[normalize-space()='HOW IT WORKS']")
    public WebElement howItWorks;
    @FindBy(xpath = "//h6[normalize-space()='HOW IT HELPS']")
    public WebElement howItHelps;
    @FindBy(xpath = "//h6[normalize-space()='INTEGRATIONS']")
    public WebElement integrations;
    @FindBy(xpath = "//h1[normalize-space()='Join Our Team']")
    public WebElement joinOurTeam;

    @FindBy(xpath = "//h1[normalize-space()='Privacy Policy']")
    public WebElement privacyPolicy;
    @FindBy(xpath = "//h6[normalize-space()='SEE QUIRE IN ACTION']")
    public WebElement seeQuireInAction;
    @FindBy(xpath = "//h6[normalize-space()='XML Ready']")
    public WebElement xmlReady;
    @FindBy(xpath = "//h1[normalize-space()='Got XML?']")
    public WebElement gotXml;


    public void navigate_to_urls() throws InterruptedException {
        WebDriver driver = getDriver();

        driver.navigate().to("https://openquire.com/features");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, howItWorks, true,logger, "howItWorks");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/how-it-works", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/why_quire");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, howItHelps, true,logger, "howItHelps");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/how-it-helps", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/integrations");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, integrations, true, logger, "integrations");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/integrations", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/integrations/rims");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, integrations, true, logger, "integrations");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/integrations", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/join-our-team");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, joinOurTeam, true, logger, "joinOurTeam");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/join-our-team", logger);

        driver.navigate().to("https://openquire.com/media-kit");
        Thread.sleep(2000);
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/privacy");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, privacyPolicy, true, logger, "privacyPolicy");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/privacy", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/see-how-it-works");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, seeQuireInAction, true, logger, "seeQuireInAction");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/see-quire-in-action", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/covid");
        Thread.sleep(2000);
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/xml-ready");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, xmlReady, true, logger, "xmlReady");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/xml-ready", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/xml-data-standards");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, gotXml, true, logger, "gotXml");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/xml-were-ready", logger);
        Thread.sleep(1000);

    }

    @FindBy(xpath = "//div[contains(text(),'Search Quire Help Center')]")
    WebElement help_center_title;
    public void confirm_quire_help_center_titlePage() {
      ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, help_center_title, true, logger, "help_center_title");
        ReusableMethodsLoggersPOM.verify_url(driver, "https://quire.freshdesk.com/support/home", logger);
    }


    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Ask a Question'])[5]")
    WebElement ask_a_Question_subHeaderButton;
    public void click_ask_a_question_subHeaderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, ask_a_Question_subHeaderButton, logger, "ask_a_Question_subHeaderButton");}

    @FindBy(xpath = "//h6[normalize-space()='ASK A QUESTION']")
    WebElement ask_a_Question_page_text;
    public void verify_ask_a_question_page_text() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, ask_a_Question_page_text, true,logger, "ask_a_Question_page_text");
    ReusableMethodsLoggersPOM.verify_url(driver, "https://openquire.com/ask-a-question", logger);
    }


    @FindBy(xpath = "//a[normalize-space()='Check out our FAQ page']")
    WebElement check_out_our_faq_page;
    public void click_check_out_our_faq_page() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, check_out_our_faq_page, logger, "check_out_our_faq_page");}

    @FindBy(xpath = "//h6[normalize-space()='FREQUENTLY ASKED QUESTIONS']")
    WebElement faq_page_text;
    public void verify_faq_page() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, faq_page_text, true,logger, "faq_page_text");
        ReusableMethodsLoggersPOM.verify_url(driver, "https://openquire.com/frequently-asked-questions", logger);
    }

    @FindBy(xpath = "(//span[@class='elementor-icon-list-text'][normalize-space()='Login'])[3]")
    WebElement login_button;
    public void    click_login_button() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, login_button, logger, "login_button");}

    public void verify_prod_site() throws InterruptedException {
        ReusableMethodsLoggersPOM.verify_url(driver, "https://openquire.com/frequently-asked-questions", logger);
    }

}









