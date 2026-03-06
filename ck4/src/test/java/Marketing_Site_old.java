import Quire_POM.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import reusableLibrary.ReusableAnnotations;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Marketing_Site_old extends ReusableAnnotations {

    @Test
    public void TR_001_URL_REDIRECTS() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        WebDriver driver = getDriver();

        driver.navigate().to("https://openquire.com");
        Thread.sleep(500);


        // TC5 - Old URLs are Redirected Appropriately

        BaseClass.quireHome().navigate_to_urls();
        Thread.sleep(1000);
    }

    @Test
    public void TR_002_User_Login() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        WebDriver driver = getDriver();

        driver.navigate().to("https://openquire.com");
        Thread.sleep(500);
        //click learn more button on home page
        BaseClass.quireHome().click_learnMore_home_Button();
        Thread.sleep(500);
        //click_download_brochure_button, change next tab, capture url, go back ot original tab
        BaseClass.quireHome().click_download_brochure_button();
        Thread.sleep(2000);
        //click on 4 section items, and verify the text in body
        BaseClass.quireHome().performActions_dataAnalytics_page();
        Thread.sleep(500);
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);


        //scroll down to how it works button from main page
        BaseClass.quireHome().click_howItWorks_button();
        Thread.sleep(500);
        //click on 3 side section items, and verify the video opens
        BaseClass.quireHome().verify_howItWorks_sideTabs();
        Thread.sleep(500);

        //click get upto speed button
        BaseClass.quireHome().click_getUptoSpeedOnFeatures_button();
        Thread.sleep(500);
        BaseClass.quireHome().verify_viewPlansPage();
        Thread.sleep(2000);
        BaseClass.quireHome().click_priceYourPackage_button();
        Thread.sleep(500);
        BaseClass.quireHome().verify_talkToSalesPage();
        Thread.sleep(500);

        //scroll down to how it helps button from main page
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);
        BaseClass.quireHome().scroll_and_click_howItHelps_button();
        Thread.sleep(1000);
        //click on 4 section items, and verify the text in body
        BaseClass.quireHome().performActions_howItHelps_page();
        Thread.sleep(500);
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);


        //who we serve header
        BaseClass.quireHome().click_whoWeServe_headerButton();
        Thread.sleep(500);
        //click_industries_subHeaderButton and confirm next page text
        BaseClass.quireHome().click_and_confirm_industries_subHeaderButton();
        Thread.sleep(500);
        //click learn more button and verify youre on env consulting report page
        BaseClass.quireHome().scroll_and_click_learnMore_button_industriesPage();
        Thread.sleep(500);
        BaseClass.quireHome().verify_env_consulting_report_page();
        Thread.sleep(500);


        //who we serve header
        BaseClass.quireHome().click_whoWeServe_headerButton();
        Thread.sleep(500);
        //click_industries_subHeaderButton and confirm next page text
        BaseClass.quireHome().click_and_confirm_industries_subHeaderButton();
        Thread.sleep(500);
        //scroll_and_click_last_learnMore_button_industriesPage verify_industrialHygienePage_text
        BaseClass.quireHome().scroll_and_click_last_learnMore_button_industriesPage();
        Thread.sleep(500);
        BaseClass.quireHome().verify_industrialHygienePage_text();
        Thread.sleep(500);
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);


        //capabilities header
        BaseClass.quireHome().click_capabilities_headerButton();
        Thread.sleep(500);
        //specializations sub-header
        BaseClass.quireHome().click_specializations_subHeader_dropdown();
        Thread.sleep(500);
        //click and verify xml ready page
        BaseClass.quireHome().click_and_verify_xmlReady_subHeader_button();
        Thread.sleep(500);
        //scroll down to click button, redirects to how it works page
        BaseClass.quireHome().scroll_and_click_andMoreSeeWhyButton();
        Thread.sleep(500);
        BaseClass.quireHome().verify_howItWorks_page();
        Thread.sleep(1000);


        //capabilities header-specializations-pca-toolkit
        BaseClass.quireHome().click_capabilities_headerButton();
        Thread.sleep(500);
        //specializations sub-header
        BaseClass.quireHome().click_specializations_subHeader_dropdown();
        Thread.sleep(500);
        //click and verify xml ready page
        BaseClass.quireHome().click_and_verify_pcaToolkit_subHeader_button();
        Thread.sleep(500);
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);

        //capabilities header-specializations-fm1104-toolkit
        BaseClass.quireHome().click_capabilities_headerButton();
        Thread.sleep(500);
        //specializations sub-header
        BaseClass.quireHome().click_specializations_subHeader_dropdown();
        Thread.sleep(500);
        //click and verify xml ready page
        BaseClass.quireHome().click_and_verify_fm1104_subHeader_button();
        Thread.sleep(500);
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);



        //capabilities header
        BaseClass.quireHome().click_capabilities_headerButton();
        Thread.sleep(500);
        //click_reportWorkFlowManagement_subHeaderButton
        BaseClass.quireHome().click_reportWorkFlowManagement_subHeaderButton();
        Thread.sleep(500);
        //click on 4 section items, and verify the text in body
        BaseClass.quireHome().verify_reportWorkFlowManagement_page_text();
        Thread.sleep(500);

        BaseClass.quireHome().scroll_to_click_learnMoreButton_reportWorkFlowManagement_page();
        Thread.sleep(500);
        //verify field data collection page text
        BaseClass.quireHome().verify_FIELD_DATA_COLLECTION_page_text();
        Thread.sleep(500);
        //verify field data collection side tab items
        BaseClass.quireHome().performActions_fieldDataCollection_page();
        Thread.sleep(500);

        //scroll to leaarn more button at end of page for integrations
        BaseClass.quireHome().scroll_to_click_learnMoreButton_fieldDataCollectionPage();
        Thread.sleep(500);
        //verify integrations page text
        BaseClass.quireHome().verify_integrations_page_text();
        Thread.sleep(500);

        //resources header
        BaseClass.quireHome().click_resources_headerButton();
        Thread.sleep(500);
        //click_and_confirm_quireVsWord_subHeaderButton and confirm next page text
        BaseClass.quireHome().click_and_confirm_quireVsWord_subHeaderButton();
        Thread.sleep(1500);
        //performActions_quireVsWord_page_page
        BaseClass.quireHome().performActions_quireVsWord_page();
        Thread.sleep(500);
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);


//click ‘Get Started’ headerButton→ click ‘ask a question’ subHeader and confirm page text
        BaseClass.quireHome().click_getStarted_headerButton();
        Thread.sleep(500);
        BaseClass.quireHome().click_ask_a_question_subHeaderButton();
        Thread.sleep(500);
        BaseClass.quireHome().verify_ask_a_question_page_text();
        Thread.sleep(500);
        // in ‘ask a question’ page, click ‘check out our faq page’ and confirm page text

        BaseClass.quireHome().click_check_out_our_faq_page();
        Thread.sleep(500);
        BaseClass.quireHome().verify_faq_page();
        Thread.sleep(500);
        BaseClass.quireHome().click_quire_home_Button();
        Thread.sleep(500);







        //TC7 - Login to Help Center as a Company User
//resources tab -> help center -> change to next tab
        BaseClass.quireHome().click_resources_headerButton();
        Thread.sleep(500);
        BaseClass.quireHome().click_helpCenter_subHeaderButton();
        Thread.sleep(500);
        BaseClass.quireHome().click_visit_quire_helpCenter_button();
        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_next_tab();
        // click login to support portal, enter log in details, capture url
        BaseClass.quireHome().click_login_here_to_supportPortal_button();
        Thread.sleep(500);
        BaseClass.quireLogin().enterProdEmail2();
        Thread.sleep(500);
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(500);
        BaseClass.quireLogin().clickSignIn();
        Thread.sleep(500);
        BaseClass.staging5().captureURL();
        Thread.sleep(500);
        BaseClass.quireHome().confirm_quire_help_center_titlePage();
        // close tab, go to original tab
        driver.close();
        BaseClass.staging5().switchToOriginalTab();
        Thread.sleep(500);



        //click login button and login with prod id
        BaseClass.quireHome().click_login_button();
        Thread.sleep(500);
        BaseClass.quireLogin().enterProdEmail();
        Thread.sleep(500);
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(500);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1500);
        BaseClass.quireHome().verify_prod_site();
        Thread.sleep(500);
    }

}
