package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.util.ArrayList;
import java.util.List;

public class QuireHome_New extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public QuireHome_New(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "//div[@class='site-header__logo']//img[@alt='Quire']")
    WebElement quire_home_Button;

    public void click_quire_home_Button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quire_home_Button, logger, "quire_home_Button");}

    @FindBy(xpath = "//a[normalize-space()='TRM Platform']")
WebElement trm_platform_headerButton;
    @FindBy(xpath = "//span[normalize-space()='GET THE PLATFORM']")
    WebElement trm_platform_page_text;
    public void click_and_verify_trm_platform_headerButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, trm_platform_headerButton, logger, "trm_platform_headerButton");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, trm_platform_page_text, true,logger, "trm_platform_page_text");}

    public void verify_trm_platform_Page() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, trm_platform_page_text, true,logger, "trm_platform_page_text");}

        public void hover_trm_platform_headerButton() {
            ReusableMethodsLoggersPOM.mouseHoverMethod(driver, quire_home_Button, logger, "quire_home_Button");
            ReusableMethodsLoggersPOM.mouseHoverMethod(driver, trm_platform_headerButton, logger, "trm_platform_headerButton");
}

    @FindBy(xpath = "//ul[@id='main-menu']//li//li")
    WebElement reportWriting_subHeader_button;
    @FindBy(xpath = "//p[contains(text(),'Stop struggling with tools that were never made fo')]")
    WebElement reportWriting_page_text;
    public void click_and_verify_reportWriting_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportWriting_subHeader_button, logger, "reportWriting_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, reportWriting_page_text, true,logger, "reportWriting_page_text");}

    @FindBy(xpath = "//ul[@id='main-menu']//li[2]")
    WebElement mobile_subHeader_button;
    @FindBy(xpath = "//p[contains(text(),'re on the go. Quire is, too. Get the mobile app th')]")
    WebElement mobile_page_text;
    public void click_and_verify_mobile_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, mobile_subHeader_button, logger, "mobile_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, mobile_page_text, true,logger, "mobile_page_text");}


    @FindBy(xpath = "//ul[@id='main-menu']//li[3]")
    WebElement analytics_subHeader_button;
    @FindBy(xpath = "//p[contains(text(),'You can’t manage what you can’t measure')]")
    WebElement analytics_page_text;
    public void click_and_verify_analytics_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, analytics_subHeader_button, logger, "analytics_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, analytics_page_text, true,logger, "analytics_page_text");}


    @FindBy(xpath = "//ul[@id='main-menu']//li[4]")
    WebElement integrations_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='INTEGRATION CAPABILITIES' and //p[contains(text(),'connects with all your systems and applications th')]]\n")
    WebElement integrations_page_text;
    public void click_and_verify_integrations_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, integrations_subHeader_button, logger, "integrations_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, integrations_page_text, true,logger, "integrations_page_text");}

    @FindBy(xpath = "//ul[@id='main-menu']//li[5]")
    WebElement toolkits_subHeader_button;
    @FindBy(xpath = "//p[contains(text(),'Create your technical reports faster, with less wo')]")
    WebElement toolkits_page_text;
    public void click_and_verify_toolkits_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, toolkits_subHeader_button, logger, "toolkits_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, toolkits_page_text, true,logger, "toolkits_page_text");}

    public void hover_toolkits_subHeader_button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, toolkits_subHeader_button, logger, "toolkits_subHeader_button");
    }

    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]//li[2]")
    WebElement pca_toolkit_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='PCA TOOLKIT']")
    WebElement pca_toolkit_page_text;
    public void click_and_verify_pca_toolkit_sub_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, pca_toolkit_sub_subHeader_button, logger, "pca_toolkit_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, pca_toolkit_page_text, true,logger, "pca_toolkit_page_text");}

    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]//li[3]")
    WebElement fnmae_xml_toolkit_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='FANNIE MAE XML TOOLKIT']")
    WebElement fnmae_xml_toolkit_page_text;
    public void click_and_verify_fnmae_xml_toolkit_sub_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, fnmae_xml_toolkit_sub_subHeader_button, logger, "fnmae_xml_toolkit_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fnmae_xml_toolkit_page_text, true,logger, "fnmae_xml_toolkit_page_text");}


    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]//li[4]")
    WebElement fnmae_4099_toolkit_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='FANNIE MAE 4099 TOOLKIT']")
    WebElement fnmae_4099_toolkit_page_text;
    public void click_and_verify_fnmae_4099_toolkit_sub_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, fnmae_4099_toolkit_sub_subHeader_button, logger, "fnmae_4099_toolkit_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fnmae_4099_toolkit_page_text, true,logger, "fnmae_4099_toolkit_page_text");}

    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]//li[5]")
    WebElement closer_xml_toolkit_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='CLOSER XML TOOLKIT']")
    WebElement closer_xml_toolkit_page_text;
    public void click_and_verify_closer_xml_toolkit_sub_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, closer_xml_toolkit_sub_subHeader_button, logger, "closer_xml_toolkit_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, closer_xml_toolkit_page_text, true,logger, "closer_xml_toolkit_page_text");}

    @FindBy(xpath = "(//ul[@class='sub-menu'])[2]//li[6]")
    WebElement freddie_mac_toolkit_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='FREDDIE MAC TOOLKITS']")
    WebElement freddie_mac_toolkit_page_text;
    public void click_and_verify_freddie_mac_toolkit_sub_subHeader_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, freddie_mac_toolkit_sub_subHeader_button, logger, "freddie_mac_toolkit_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, freddie_mac_toolkit_page_text, true,logger, "freddie_mac_toolkit_page_text");}




    @FindBy(xpath = "//li[@id='menu-item-12611']")
    WebElement benefits_subHeader_button;

    public void hover_benefits_subHeader_button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, benefits_subHeader_button, logger, "benefits_subHeader_button");
    }

    @FindBy(xpath = "(//ul[@class='sub-menu'])[3]//li[2]")
    WebElement quality_sub_subheader_button;
    @FindBy(xpath = "//h1[contains(text(),'HOW QUIRE RAMPS')]")
    WebElement quality_page_text;

    public void click_and_verify_quality_sub_subheaderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, quality_sub_subheader_button, logger, "quality_sub_subheader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quality_page_text, true,logger, "quality_page_text");}




    @FindBy(xpath = "(//ul[@class='sub-menu'])[3]//li[3]")
    WebElement efficiency_sub_subheader_button;
    @FindBy(xpath = "//h1[contains(text(),'HOW QUIRE DRIVES UP')]")
    WebElement efficiency_page_text;

    public void click_and_verify_efficiency_sub_subheaderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, efficiency_sub_subheader_button, logger, "efficiency_sub_subheader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, efficiency_page_text, true,logger, "efficiency_page_text");}


    @FindBy(xpath = "(//ul[@class='sub-menu'])[3]//li[4]")
    WebElement throughput_sub_subheader_button;
    @FindBy(xpath = "//h1[contains(text(),'HOW QUIRE POWERS')]")
    WebElement throughput_page_text;

    public void click_and_verify_throughput_sub_subheaderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, throughput_sub_subheader_button, logger, "throughput_sub_subheader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, throughput_page_text, true,logger, "throughput_page_text");}













    @FindBy(xpath = "//a[normalize-space()='Industries']")
    WebElement industries_header_button;
    @FindBy(xpath = "//h1[normalize-space()='Industry Overview']")
    WebElement industries_page_text;
    public void click_and_verify_industries_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, industries_header_button, logger, "industries_header_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, industries_page_text, true,logger, "industries_page_text");}


    public void hover_industries_headerButton() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, quire_home_Button, logger, "quire_home_Button");

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, industries_header_button, logger, "industries_header_button");}

    @FindBy(xpath = "//a[normalize-space()='AEC']")
    WebElement aec_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='AEC INDUSTRY']")
    WebElement aec_page_text;
    public void click_and_verify_aec_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, aec_subHeader_button, logger, "aec_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, aec_page_text, true,logger, "aec_page_text");}

    @FindBy(xpath = "//a[normalize-space()='Commercial Real Estate']")
    WebElement commercial_real_estate_subHeader_button;
    @FindBy(xpath = "//h1[contains(text(),'Commerical Real')]")
    WebElement commercial_real_estate_page_text; ;
    public void click_and_verify_commercial_real_estate_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, commercial_real_estate_subHeader_button, logger, "commercial_real_estate_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, commercial_real_estate_page_text, true,logger, "commercial_real_estate_page_text");}


    @FindBy(xpath = "//a[normalize-space()='Environmental']")
    WebElement environmental_subHeader_button;
    @FindBy(xpath = "//h1[contains(text(),'Environmental')]")
    WebElement environmental_page_text;
    public void click_and_verify_environmental_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, environmental_subHeader_button, logger, "environmental_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, environmental_page_text, true,logger, "environmental_page_text");}



    @FindBy(xpath = "//a[contains(@href, 'openquire.com/roles/')]")
    WebElement roles_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='Roles Overview']")
    WebElement roles_page_text;
    public void click_and_verify_roles_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, roles_subHeader_button, logger, "roles_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, roles_page_text, true,logger, "roles_page_text");}

    public void hover_roles_subHeader_button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, roles_subHeader_button, logger, "roles_subHeader_button");}


    @FindBy(xpath = "//a[normalize-space()='Executives']")
    WebElement executives_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='Executives and Owners']")
    WebElement executives_page_text;
    public void click_and_verify_executives_sub_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, executives_sub_subHeader_button, logger, "executives_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, executives_page_text, true,logger, "executives_page_text");}


    @FindBy(xpath = "//a[normalize-space()='Service Line Leaders']")
    WebElement service_line_leaders_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='Service Line Leaders']")
    WebElement service_line_leaders_page_text;
    public void click_and_verify_service_line_leaders_sub_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, service_line_leaders_sub_subHeader_button, logger, "service_line_leaders_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, service_line_leaders_page_text, true,logger, "service_line_leaders_page_text");}

    @FindBy(xpath = "//a[normalize-space()='Project Managers']")
    WebElement project_managers_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='Project Managers']")
    WebElement project_managers_page_text;
    public void click_and_verify_project_managers_sub_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, project_managers_sub_subHeader_button, logger, "project_managers_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, project_managers_page_text, true,logger, "project_managers_page_text");}

    @FindBy(xpath = "//a[normalize-space()='Report Writers']")
    WebElement report_writers_sub_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='Report Writers']")
    WebElement report_writers_page_text;
    public void click_and_verify_report_writers_sub_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, report_writers_sub_subHeader_button, logger, "report_writers_sub_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, report_writers_page_text, true,logger, "report_writers_page_text");}







    @FindBy(xpath = "//a[normalize-space()='Resources']")
    WebElement resources_header_button;
    public void hover_resources_header_button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, quire_home_Button, logger, "quire_home_Button");

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver,  resources_header_button, logger, "resources_header_button");}

    @FindBy(xpath = "//a[normalize-space()='Blog']")
    WebElement blog_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='Blog']")
    WebElement blog_page_text;
    public void click_and_verify_blog_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, blog_subHeader_button, logger, "blog_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, blog_page_text, true,logger, "blog_page_text");}

    @FindBy(xpath = "//a[normalize-space()='Case Studies']")
    WebElement case_studies_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='Case Studies']")
    WebElement case_studies_page_text;
    public void click_and_verify_case_studies_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, case_studies_subHeader_button, logger, "case_studies_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, case_studies_page_text, true,logger, "case_studies_page_text");}


    @FindBy(xpath = "//a[normalize-space()='Certifications']")
    WebElement certifications_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='QUIRE CERTIFICATIONS']")
    WebElement certifications_page_text;
    public void click_and_verify_certifications_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, certifications_subHeader_button, logger, "certifications_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, certifications_page_text, true,logger, "certifications_page_text");}


    @FindBy(xpath = "//a[normalize-space()='FAQs']")
    WebElement faqs_subHeader_button;
    @FindBy(xpath = "//p[normalize-space()='Take a browse through our FAQ categories.']")
    WebElement faqs_page_text;
    public void click_and_verify_faqs_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, faqs_subHeader_button, logger, "faqs_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, faqs_page_text, true,logger, "faqs_page_text");}

    @FindBy(xpath = "//a[normalize-space()='Self-Guided Tour']")
    WebElement self_guided_tour_subHeader_button;
    @FindBy(xpath = "//h1[contains(text(),'TAKE A SELF-GUIDED')]")
    WebElement self_guided_tour_page_text;
    public void click_and_verify_self_guided_tour_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, self_guided_tour_subHeader_button, logger, "self_guided_tour_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, self_guided_tour_page_text, true,logger, "self_guided_tour_page_text");
    }


    @FindBy(xpath = "//a[normalize-space()='Partnerships']")
    WebElement partnerships_header_button;
    @FindBy(xpath = "//h1[contains(text(),'PARTNERS AND')]")
    WebElement partnerships_page_text;
    public void click_and_verify_partnerships_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, partnerships_header_button, logger, "partnerships_header_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, partnerships_page_text, true,logger, "partnerships_page_text");}


    @FindBy(xpath = "//a[normalize-space()='Take a Closer Look at Quire TRM']")
    WebElement take_a_closer_look_at_quire_trm_button;
    public void click_take_a_closer_look_at_quire_trm_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, take_a_closer_look_at_quire_trm_button, logger, "take_a_closer_look_at_quire_trm_button");
    }


    @FindBy(xpath = "//a[normalize-space()='Contact Us']")
    WebElement contact_us_header_button;

    @FindBy(xpath = "//h2[normalize-space()='CONTACT SALES']")
    WebElement contact_us_page_text;
    public void click_and_verify_contact_us_header_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver,  contact_us_header_button, logger, "contact_us_header_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, contact_us_page_text, true,logger, "contact_us_page_text");
    }

    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement login_button;



    public void click_login_and_verify() throws InterruptedException {
        ReusableMethodsLoggersPOM.clickMethod(driver, login_button, logger, "login_button");
        Thread.sleep(2000);

        BaseClass.reportfoldersection().change_to_next_tab();
        //click login button and login with prod id
        Thread.sleep(500);
        BaseClass.quireLogin().enterProdEmail();
        Thread.sleep(500);
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(500);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1500);
        ReusableMethodsLoggersPOM.verify_url(driver, "https://app.openquire.com/dashboard", logger);
//        driver.close();
//        BaseClass.staging5().switchToOriginalTab();

    }





    @FindBy(xpath = "//a[normalize-space()='About']")
    WebElement about_header_button;
    @FindBy(xpath = "//h1[normalize-space()='WHO WE ARE']")
    WebElement about_page_text;
    public void click_and_verify_about_header_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, about_header_button, logger, "about_header_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, about_page_text, true,logger, "about_page_text");}



    public void hover_about_header_button() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, quire_home_Button, logger, "quire_home_Button");

        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, about_header_button, logger, "about_header_button");}


    @FindBy(xpath = "//a[normalize-space()='Our Team']")
    WebElement our_team_header_button;
    @FindBy(xpath = "//h1[normalize-space()='OUR TEAM']")
    WebElement our_team_page_text;
    public void click_and_verify_our_team_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, our_team_header_button, logger, "our_team_header_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, our_team_page_text, true,logger, "our_team_page_text");}


    @FindBy(xpath = "//a[normalize-space()='Our Founder']")
    WebElement our_founder_header_button;
    @FindBy(xpath = "//h1[normalize-space()='MEET OUR FOUNDER']")
    WebElement our_founder_page_text;
    public void click_and_verify_our_founder_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, our_founder_header_button, logger, "our_founder_header_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, our_founder_page_text, true,logger, "our_founder_page_text");}

    @FindBy(xpath = "//a[@href='/join-our-team/']")
    WebElement careers_subHeader_button;
    @FindBy(xpath = "//h1[normalize-space()='CAREERS']")
    WebElement careers_page_text;
    public void click_and_verify_careers_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, careers_subHeader_button, logger, "careers_subHeader_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, careers_page_text, true,logger, "careers_page_text");}

    @FindBy(xpath = "//a[normalize-space()='News']")
    WebElement news_header_button;
    @FindBy(xpath = "//h1[normalize-space()='Newsroom']")
    WebElement news_page_text;
    public void click_and_verify_news_subHeader_page() {
        ReusableMethodsLoggersPOM.clickMethod(driver, news_header_button, logger, "news_header_button");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, news_page_text, true,logger, "news_page_text");}






























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








//    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-813'])[5]")
//    WebElement whoWeServe_headerButton;
//
//    public void click_whoWeServe_headerButton() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, whoWeServe_headerButton, logger, "whoWeServe_headerButton");}
//    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Industries'])[5]")
//    WebElement industries_subHeaderButton;
//    @FindBy(xpath = "//h6[normalize-space()='INDUSTRIES WE SERVE']")
//    WebElement industries_page_text;
//    public void click_and_confirm_industries_subHeaderButton() throws InterruptedException {
//        ReusableMethodsLoggersPOM.clickMethod(driver, industries_subHeaderButton, logger, "industries_subHeaderButton");
//        Thread.sleep(1000);
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, industries_page_text, true,logger, "industries_page_text");
//        ReusableMethodsLoggersPOM.verify_url(driver, "https://openquire.com/industries", logger);
//    }

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
//
//////////////////// resources header ////////////////////////////////
//
//    @FindBy(xpath = "(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-816'])[5]//span[@class='sub-arrow']")
//    WebElement resources_headerButton;
//    public void click_resources_headerButton() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, resources_headerButton, logger, "resources_headerButton");}
//
//    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Quire vs. Word'])[5]")
//    WebElement quireVsWord_subHeaderButton;
//    @FindBy(xpath = "//h6[contains(text(),'QUIRE VS MICROSOFT WORD™')]")
//    WebElement quireVsWord_page_text;
//    public void click_and_confirm_quireVsWord_subHeaderButton() throws InterruptedException {
//        ReusableMethodsLoggersPOM.clickMethod(driver, quireVsWord_subHeaderButton, logger, "quireVsWord_subHeaderButton");
//        Thread.sleep(1000);
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, quireVsWord_page_text, true,logger, "quireVsWord_page_text");
//        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/quire-vs-word", logger);}
//
//    @FindBy(xpath = "//div[contains(@id, 'elementor-tab-title-255')]")
//    List <WebElement> tabItems_quireVsWord_page;
//
//    @FindBy(xpath = "//h3[normalize-space()='Report Setup']")
//    WebElement Setup_text;
//    @FindBy(xpath = "//h3[normalize-space()='Report Writing']")
//    WebElement Writing_text;
//    @FindBy(xpath = "//h3[normalize-space()='Managing the Project']")
//    WebElement management_text;
//    @FindBy(xpath = "//h3[normalize-space()='Reviewing the Report']")
//    WebElement reviews_text;
//    @FindBy(xpath = "//h3[normalize-space()='Assembly & Delivery']")
//    WebElement assemblyAndDelivery_text;
//    @FindBy(xpath = "//h3[normalize-space()='Client-Mandated Revisions']")
//    WebElement revisions_text;
//
//    public void performActions_quireVsWord_page() throws InterruptedException {
//        List<WebElement> elementsList = new ArrayList<>();
//        elementsList.add(Setup_text);
//        elementsList.add(Writing_text);
//        elementsList.add(management_text);
//        elementsList.add(reviews_text);
//        elementsList.add(assemblyAndDelivery_text);
//        elementsList.add(revisions_text);
//
//        ReusableMethodsLoggersPOM.scrollToElementMethod(driver, tabItems_quireVsWord_page.get(1), logger, "tabItems_quireVsWord_page");
//        Thread.sleep(1500);
//
//        for (int i = 0; i < 6; i++) {
//            ReusableMethodsLoggersPOM.clickMethod(driver, tabItems_quireVsWord_page.get(i), logger, "Item at index: " + i);
//            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, elementsList.get(i), true,logger, String.valueOf(elementsList.get(i)));
//        }}
//
//
//
//
//
//    @FindBy(xpath = "(//a[@class='elementor-sub-item'][normalize-space()='Help Center'])[5]")
//    WebElement helpCenter_subHeaderButton;
//    public void click_helpCenter_subHeaderButton() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, helpCenter_subHeaderButton, logger, "helpCenter_subHeaderButton");}
//    @FindBy(xpath = "//span[text()='Visit Quire Help Center']")
//    WebElement visit_quire_helpCenter_button;
//    public void click_visit_quire_helpCenter_button() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, visit_quire_helpCenter_button, logger, "visit_quire_helpCenter_button");}
//
//    @FindBy(xpath = "//div[@class='customer-login-link']//a[contains(text(),'Login here')]")
//    WebElement login_here_to_supportPortal_button;
//    public void click_login_here_to_supportPortal_button() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, login_here_to_supportPortal_button, logger, "login_here_to_supportPortal_button");}
//
//
//
//


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

    @FindBy(xpath = "//span[normalize-space()='GET THE PLATFORM']")
    public WebElement trmPlatform;
    @FindBy(xpath = "//h6[normalize-space()='HOW IT HELPS']")
    public WebElement howItHelps;
    @FindBy(xpath = "//h6[normalize-space()='INTEGRATIONS']")
    public WebElement integrations;
    @FindBy(xpath = "//h1[normalize-space()='CAREERS']")
    public WebElement careersPage;

    @FindBy(xpath = "//h1[normalize-space()='Privacy Policy']")
    public WebElement privacyPolicy;
    @FindBy(xpath = "//h6[normalize-space()='SEE QUIRE IN ACTION']")
    public WebElement seeQuireInAction;

    @FindBy(xpath = "//h1[contains(text(),'READY TO TAKE THE NEXT STEP?')]")
    public WebElement contactUsPage;
    @FindBy(xpath = "//h6[normalize-space()='XML Ready']")
    public WebElement xmlReady;

    @FindBy(xpath = "//h1[normalize-space()='FANNIE MAE XML TOOLKIT']")
    public WebElement fannieMaeXmlToolkit;
    @FindBy(xpath = "//h1[normalize-space()='Got XML?']")
    public WebElement gotXml;


    public void navigate_to_urls() throws InterruptedException {
        WebDriver driver = getDriver();

        driver.navigate().to("https://openquire.com/features");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, trmPlatform, true,logger, "trmPlatform");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/trm-platform", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/why_quire");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, trmPlatform, true,logger, "trmPlatform");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/trm-platform", logger);
        Thread.sleep(1000);
//
//        driver.navigate().to("https://openquire.com/integrations");
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, integrations, true, logger, "integrations");
//        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/integrations", logger);
//        Thread.sleep(1000);
//
//        driver.navigate().to("https://openquire.com/integrations/rims");
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, integrations, true, logger, "integrations");
//        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/integrations", logger);
//        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/join-our-team");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, careersPage, true, logger, "careersPage");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/careers", logger);

        driver.navigate().to("https://openquire.com/media-kit");
        Thread.sleep(2000);
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com", logger);
        Thread.sleep(1000);

//        driver.navigate().to("https://openquire.com/privacy");
//        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, privacyPolicy, true, logger, "privacyPolicy");
//        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/privacy", logger);
//        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/see-how-it-works");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, contactUsPage, true, logger, "contactUsPage");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/contact-us", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/covid");
        Thread.sleep(2000);
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/xml-ready");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fannieMaeXmlToolkit, true, logger, "fannieMaeXmlToolkit");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/fannie-mae-xml-toolkit", logger);
        Thread.sleep(1000);

        driver.navigate().to("https://openquire.com/xml-data-standards");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, fannieMaeXmlToolkit, true, logger, "fannieMaeXmlToolkit");
        ReusableMethodsLoggersPOM.verify_url(driver, "openquire.com/fannie-mae-xml-toolkit", logger);

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
//
//    @FindBy(xpath = "(//span[@class='elementor-icon-list-text'][normalize-space()='Login'])[3]")
//    WebElement login_button;
//    public void    click_login_button() throws InterruptedException {
//        ReusableMethodsLoggersPOM.clickMethod(driver, login_button, logger, "login_button");}
//
//    public void verify_prod_site() throws InterruptedException {
//        ReusableMethodsLoggersPOM.verify_url(driver, "https://openquire.com/frequently-asked-questions", logger);
    }










