import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;

import java.io.IOException;
import java.util.ArrayList;

public class SanityCheck_Prod extends ReusableAnnotations {

// new
@Test
public void TC_006_Prod_login() throws InterruptedException {
    WebDriver driver = getDriver();

    driver.navigate().to("https://app.openquire.com/");
    Thread.sleep(1000);

    BaseClass.quireLogin().enterProdEmail();
    Thread.sleep(1500);
    //  BaseClass.quireLogin().clickNextButton();
    BaseClass.quireLogin().enterPassword();
    Thread.sleep(1000);
    BaseClass.quireLogin().clickLogin();
    Thread.sleep(2500);
//

    BaseClass.staging5().click_modal_close_window();
    Thread.sleep(500);
    BaseClass.staging5().captureURL();
    Thread.sleep(1000);
}


    @Test
    public void TC_007_open_reports() throws InterruptedException {
        BaseClass.staging5().clickReportsTab();
        Thread.sleep(500);
        // BaseClass.staging5().click_reportsTab_allFolders_dropDown();
        Thread.sleep(500);

        BaseClass.reportfoldersection().enterSearchField_HMReports();
        Thread.sleep(3000);
        BaseClass.reportfoldersection().captureRecentReportName();
        Thread.sleep(1500);
//
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(3000);

        BaseClass.projectFolderSection().clickProjectFolderLink_2023QAReport();
        Thread.sleep(1500);
        BaseClass.reportfoldersection().clickAutomationReport_link();
        Thread.sleep(1500);
        BaseClass.staging5().capture_current_report_location();
        Thread.sleep(2000);

    }

    @Test
    public void TC_008_appendices() throws InterruptedException {

        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(5000);

        BaseClass.reportfoldersection().capture_all_items_appendix_section();
        Thread.sleep(500);

        BaseClass.reportfoldersection().capture_processing_gallery_items_appendix_section();
        Thread.sleep(500);

        BaseClass.reportfoldersection().capture_processing_pdf_items_appendix_section();
        Thread.sleep(500);

        // Thread.sleep(1000);
        BaseClass.reportfoldersection().capture_broken_link();
        Thread.sleep(1000);
        // BaseClass.reportfoldersection().capture_broken_link_api();
        //  Thread.sleep(2000);

    }
//     @Test
//    public void TC_009_generatePDF() throws InterruptedException {
//         BaseClass.reportfoldersection().clickRegeneratePDFButton();
//         Thread.sleep(500);
//         BaseClass.reportfoldersection().clickRegeneratePDFButton1();
//         Thread.sleep(500);
//         BaseClass.staging5().captureAlertMessage();
//         Thread.sleep(4000);
//         BaseClass.reportfoldersection().captureGeneratedPDF_text();
//         Thread.sleep(500);
//
//     }

    @Test
    public void TC_010_templates() throws InterruptedException {

        BaseClass.staging5().clickTemplatesTab();
        Thread.sleep(3000);

        BaseClass.staging5().capture_number_of_template_items();
        Thread.sleep(500);

    }

    @Test
    public void TC_011_portfolios() throws InterruptedException {
        WebDriver driver = getDriver();

        BaseClass.staging5().clickPortfoliosTab();
        Thread.sleep(3500);

        BaseClass.staging5().capture_number_of_portfolio_items();
        BaseClass.staging5().clickDanielles_portfolio();
        Thread.sleep(3000 );

        //click report in new tab
        BaseClass.staging5().click_firestone_report_danielles_portfolio();
        Thread.sleep(1500);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(1000);
        BaseClass.staging5().capture_current_report_location();
        driver.close();
        BaseClass.staging5().switchToOriginalTab();
        Thread.sleep(1000);
    }
    @Test
    public void TC_012_shared_reports() throws InterruptedException {
        WebDriver driver = getDriver();
        BaseClass.staging5().clickSharedReportsTab();
        //  Thread.sleep(500);

        //  BaseClass.staging5().clicksharedReportsTab_with_contractors_dropdown();

        Thread.sleep(2500);

        BaseClass.staging5().capture_number_of_sharedReports_items();
        BaseClass.staging5().capture_recent_row_Information();
        // Thread.sleep(2000);

        //click report in new tab and get report location
        BaseClass.staging5().clickRecentSharedReportLink();
        Thread.sleep(1500);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(1000);
        BaseClass.staging5().capture_current_report_location();
        driver.close();
        BaseClass.staging5().switchToOriginalTab();
        Thread.sleep(1500);
        // Thread.sleep(2000);
    }

    @Test
    public void TC_013_pdf_Link_emails() throws InterruptedException {

        BaseClass.staging5().click_pdf_link_emails_tab();
        Thread.sleep(2500);

        BaseClass.staging5().capture_number_of_PDFLinkEMails_items();
        Thread.sleep(500);

        BaseClass.staging5().capture_recent_row_Information();
    }

    @Test
    public void TC_014_wordBank_libraries() throws InterruptedException {

        BaseClass.staging5().clickLibrariesTab();
        BaseClass.staging5().click_librariesTab_wordBankDropdown();
        Thread.sleep(2500);

        BaseClass.staging5().capture_number_of_wordBank_items();
        Thread.sleep(500);

        BaseClass.staging5().capture_recent_row_Information();
    }

    @Test
    public void TC_015_PDF_File_Name_Formats() throws InterruptedException {

        BaseClass.staging5().clickSettingsTab();
        BaseClass.staging5().click_settingsTab_pdf_filenameformat_dropdownItem();
        Thread.sleep(2500);

        BaseClass.staging5().capture_number_of_pdf_file_name_formats_items();
        BaseClass.staging5().capture_recent_row_Information();
    }

    @Test
    public void TC_016_Company_Users() throws InterruptedException {

        BaseClass.staging5().clickUsersTab();
        BaseClass.staging5().click_usersTab_companyUsers_dropdownItem();
        Thread.sleep(3000);

        BaseClass.staging5().capture_number_of_companyUsers_items();
        BaseClass.staging5().capture_recent_row_Information();
    }

    @Test
    public void TC_017_Contractors() throws InterruptedException {

        BaseClass.staging5().clickUsersTab();

        BaseClass.staging5().click_usersTab_contractors_dropdownItem();
        Thread.sleep(2500);

        BaseClass.staging5().capture_number_of_contractors_items();
        BaseClass.staging5().capture_recent_row_Information();
        Thread.sleep(500);

    }

    @Test
    public void TC_018_Spellcheck_trackChanges_ck4() throws InterruptedException {
        WebDriver driver = getDriver();

        //navigate to empty report-automation testing report
        driver.navigate().to("https://app.openquire.com/reports/1119498");
        Thread.sleep(500);
        BaseClass.staging5().captureURL();
        Thread.sleep(500);


        //enable track changes button
        BaseClass.staging5().click_and_capture_track_changes_button();
        Thread.sleep(1000);

        // go to section 1 and type spellcheck error text
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().enter_spellCheck_text_iFrame();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        BaseClass.staging5().click_accept_change_icon_ck5();
        Thread.sleep(500);

//        // go to section 2 and type spellcheck
//        BaseClass.staging5().click_Section2_row_editor();
//        Thread.sleep(500);
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.templatesSection().enter_spellCheck_text_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(500);

        //turn on spell check and fix all issues
        BaseClass.staging5().click_and_capture_spell_check_button();
        Thread.sleep(500);
        BaseClass.staging5().capture_spellCheck_error_sections();
        Thread.sleep(2000);
        BaseClass.staging5().fix_all_spellCheck_errors_sanity();
        Thread.sleep(500);

        //track changes delete section - red - section 1

        BaseClass.staging5().clickSection_row_editor();

        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.templatesSection().select_all_and_backspace_Section_section_row_iFrame();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        BaseClass.staging5().click_section_1_header();
        Thread.sleep(500);

        //verify green and red track change showing
//        BaseClass.staging5().verify_green_tracked_changes_is_Visible();
//        Thread.sleep(500);
        BaseClass.staging5().verify_red_tracked_changes_is_Visible();
        Thread.sleep(500);
        //delete section 1 by accepting red cross change

        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.staging5().click_accept_all_change_icon_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_section_1_header();
        Thread.sleep(1000);

//        //delete section 2 by rejecting green change
//
//        BaseClass.staging5().click_Section2_row_editor();
//        Thread.sleep(500);
//        BaseClass.staging5().click_reject_change_icon_ck5();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_default_section_title();
//        BaseClass.staging5().capture_spellCheck_errors();

        //       Thread.sleep(500);


    }
    @Test
    public void TR_019_portfolios_filterByTemplate() throws InterruptedException, IOException {
        WebDriver driver = getDriver();
        driver.navigate().to("https://app.openquire.com/portfolios/3891");
        Thread.sleep(1000);
        BaseClass.staging5().click_export_to_excel_fm1105();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(500);

        //change to default view
        BaseClass.staging5().click_change_porfolio_view_button();
        Thread.sleep(1000);
        BaseClass.staging5().select_porfolio_view_default();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1500);
        BaseClass.staging5().select_template_dropdown_pca_elise();
        Thread.sleep(2400);

        BaseClass.staging5().click_export_pdf_button();
        // Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        // Thread.sleep(500);
        //  BaseClass.staging5().click_cancel_alert_message();
        //    Thread.sleep(500);
//click notification icon and click first link, and open new tab with link
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().mark_all_as_read();
        Thread.sleep(7000);
        driver.navigate().refresh();
        Thread.sleep(500);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().open_jenTest_pdf_notification_link();
        Thread.sleep(500);
        BaseClass.staging5().verify_report_names_from_jen_portfolio_PDF();
        Thread.sleep(500);
    }

    @Test
    public void TR_020_dashboard_contractor_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_contractor_prod_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1500);
        BaseClass.dashBoard().confirm_recentlySharedReports_items();
        Thread.sleep(500);
        BaseClass.dashBoard().refresh_all_widgets();
        Thread.sleep(3500);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(500);
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        Thread.sleep(500);
    }

    @Test
    public void TR_021_analytics_page_check() throws InterruptedException {
        WebDriver driver = getDriver();


        driver.navigate().to("https://app.openquire.com/analytics");
        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
        BaseClass.quireLogin().VERIFY_NO_something_went_wrong_MESSAGE();
        Thread.sleep(500);
        driver.navigate().to("https://app.openquire.com/dashboard");
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        Thread.sleep(500);
        driver.navigate().to("https://app.openquire.com/analytics");
        Thread.sleep(500);
        BaseClass.quireLogin().enterProdEmail();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
        BaseClass.quireLogin().VERIFY_NO_something_went_wrong_MESSAGE();
        Thread.sleep(500);

    }
}