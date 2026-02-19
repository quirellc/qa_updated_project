import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import reusableLibrary.ReusableAnnotations;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Marketing_Site extends ReusableAnnotations {

//    @Test
//    public void TR_001_URL_REDIRECTS() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//        WebDriver driver = getDriver();
//
//        driver.navigate().to("https://next.openquire.com/");
//        Thread.sleep(500);
//
//
//        // TC5 - Old URLs are Redirected Appropriately
//
//        BaseClass.quireHome().navigate_to_urls();
//        Thread.sleep(1000);
//    }

    @Test
    public void TR_001_Marketing_Site_Regression() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        WebDriver driver = getDriver();
        driver.navigate().to("https://openquire.com/");
        Thread.sleep(500);

        BaseClass.quireHomeNew().click_and_verify_trm_platform_headerButton();

//        Thread.sleep(3000);

        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().click_and_verify_reportWriting_subHeader_page();
//        Thread.sleep(3000);
        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().click_and_verify_mobile_subHeader_page();
//        Thread.sleep(3000);
        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().click_and_verify_analytics_subHeader_page();
        //Thread.sleep(500);
        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().click_and_verify_integrations_subHeader_page();
        //Thread.sleep(500);
        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().click_and_verify_toolkits_subHeader_button();
        //Thread.sleep(500);

        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().hover_toolkits_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_fnmae_xml_toolkit_sub_subHeader_button();
        //Thread.sleep(500);
        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().hover_toolkits_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_fnmae_4099_toolkit_sub_subHeader_button();
        //Thread.sleep(500);
        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().hover_toolkits_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_closer_xml_toolkit_sub_subHeader_button();
        //Thread.sleep(500);
        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().hover_toolkits_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_freddie_mac_toolkit_sub_subHeader_button();
        //Thread.sleep(500);

        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().hover_benefits_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_quality_sub_subheaderButton();
        //Thread.sleep(500);

        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().hover_benefits_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_efficiency_sub_subheaderButton();
        //Thread.sleep(500);

        BaseClass.quireHomeNew().hover_trm_platform_headerButton();
        BaseClass.quireHomeNew().hover_benefits_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_throughput_sub_subheaderButton();
        //Thread.sleep(500);

        BaseClass.quireHomeNew().click_and_verify_industries_page();

        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().click_and_verify_aec_subHeader_page();

        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().click_and_verify_commercial_real_estate_subHeader_page();

        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().click_and_verify_environmental_subHeader_page();

        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().click_and_verify_roles_subHeader_page();

        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().hover_roles_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_executives_sub_subHeader_page();

        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().hover_roles_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_service_line_leaders_sub_subHeader_page();

        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().hover_roles_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_project_managers_sub_subHeader_page();


        BaseClass.quireHomeNew().hover_industries_headerButton();
        BaseClass.quireHomeNew().hover_roles_subHeader_button();
        BaseClass.quireHomeNew().click_and_verify_report_writers_sub_subHeader_page();

        BaseClass.quireHomeNew().hover_resources_header_button();
        BaseClass.quireHomeNew().click_and_verify_blog_subHeader_page();


        BaseClass.quireHomeNew().hover_resources_header_button();
        BaseClass.quireHomeNew().click_and_verify_case_studies_subHeader_page();

        BaseClass.quireHomeNew().hover_resources_header_button();
        BaseClass.quireHomeNew().click_and_verify_certifications_subHeader_page();

        BaseClass.quireHomeNew().hover_resources_header_button();
        BaseClass.quireHomeNew().click_and_verify_faqs_subHeader_page();

        BaseClass.quireHomeNew().hover_resources_header_button();
        BaseClass.quireHomeNew().click_and_verify_self_guided_tour_subHeader_page();

        BaseClass.quireHomeNew().click_and_verify_partnerships_subHeader_page();
        BaseClass.quireHomeNew().click_take_a_closer_look_at_quire_trm_button();
        BaseClass.quireHomeNew().verify_trm_platform_Page();

        BaseClass.quireHomeNew().click_and_verify_about_header_page();

        BaseClass.quireHomeNew().hover_about_header_button();
        BaseClass.quireHomeNew().click_and_verify_our_team_subHeader_page();

        BaseClass.quireHomeNew().hover_about_header_button();
        BaseClass.quireHomeNew().click_and_verify_our_founder_subHeader_page();

        BaseClass.quireHomeNew().hover_about_header_button();
        BaseClass.quireHomeNew().click_and_verify_careers_subHeader_page();

        BaseClass.quireHomeNew().hover_about_header_button();
        BaseClass.quireHomeNew().click_and_verify_news_subHeader_page();

        BaseClass.quireHomeNew().click_and_verify_contact_us_header_button();

        BaseClass.quireHomeNew().click_login_and_verify();


    }

    }


