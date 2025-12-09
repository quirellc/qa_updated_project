import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;


public class Regression_Suite extends ReusableAnnotations {
//	WebDriver driver = getDriver();
//    String browserName = ((RemoteWebDriver) driver).getCapabilities().getBrowserName();
    //@BeforeTest
@Test
public void TR_001_user_login() throws InterruptedException {
    WebDriver driver = getDriver();
    System.out.println(driver.getClass().getSimpleName());
    driver.navigate().to(baseUrl);
    System.out.println("Navigating to: " + baseUrl);
    // logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
//        driver.navigate().to("https://staging5.openquire.com/");
    //     driver.navigate().to("https://app-next.openquire.com/");
//        driver.navigate().to("https://staging5-next.openquire.com/");

    //  WebDriver driver1 = getDriver();

    //   String pageTitle = driver.getTitle();
    if (baseUrl.contains("staging")) {
        BaseClass.quireLogin().enter_admin_Email();

    } else {
        BaseClass.quireLogin().enter_admin_Email();
    }

    Thread.sleep(1000);
    BaseClass.quireLogin().enterPassword();
    Thread.sleep(1000);
    BaseClass.quireLogin().clickLogin();
    Thread.sleep(3000);
    //   } else {
    //       System.out.println("\n" + "Already logged in. Skipping login steps.");
    //      Thread.sleep(3000);
    //  }

    BaseClass.staging5().captureURL();
    Thread.sleep(2000);
    BaseClass.staging5().click_modal_close_window();

}
    @Test
    public void TR_002_uploadtoProfile_current_admin_login() throws InterruptedException {


        //UPLOAD STAMP

        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_editProfile_dropdownItem();
        BaseClass.staging5().click_stamps_tab();
        Thread.sleep(1000);
        BaseClass.staging5().delete_existing_stamps();
        Thread.sleep(1000);

        BaseClass.staging5().upload_stamp_button();
        Thread.sleep(1500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(1500);

        //UPLOAD SIGNATURE
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_editProfile_dropdownItem();
        Thread.sleep(1000);
        BaseClass.staging5().upload_signature_button();
        Thread.sleep(1500);
        BaseClass.templatesSection().clickSave2();
        Thread.sleep(3000);

    }
    @Test
    public void TR_002a_create_regression_folder() throws InterruptedException {


//create proj folder
    BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(3500);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(1500);




        //create RegressionSuite project folder

        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        BaseClass.projectFolderSection().enterProjectFolderNameField_RegressionSuite();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdownssffy
        Thread.sleep(2000);

        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(3500);

        BaseClass.projectFolderSection().click_FM_1104_Template_projectFolder_templatesTab();
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(3000);

        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(4500);
        BaseClass.projectFolderSection().click_RegressionSuite_ProjectFolderLink();

        //create RegressionSuite report folder with fm1104 template created

        Thread.sleep(2000);

        BaseClass.reportfoldersection().clickAddReportButton();

        BaseClass.reportfoldersection().enterReportName_QA_Regression_suite_Field();
        BaseClass.reportfoldersection().enterReportDescriptionField();
        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
        Thread.sleep(2500);
        BaseClass.reportfoldersection().clickDropdownItem();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(3000);

        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.templatesSection().clickHereLinkReport();
        Thread.sleep(2000);

    }

    @Test
    public void TR_002b_stamp_signature_in_report() throws InterruptedException {

        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(2000);
        BaseClass.staging5().click_add_section_toSection();
        Thread.sleep(1000);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(1000);
        BaseClass.staging5().click_Section2_row_editor();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_stamp_icon_ck5();
        Thread.sleep(1500);
        BaseClass.ck5editor().click_stamp_icon_dropdown_ck5();
        Thread.sleep(1500);
        BaseClass.ck5editor().click_signature_icon_ck5();
        Thread.sleep(1500);
        BaseClass.ck5editor().click_stamp_icon_dropdown_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(1000);
        BaseClass.ck5editor().verify_stamp_signature_in_section();
        Thread.sleep(500);

// old ck4
////add a section 2 for stamp and signature
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(2000);
//        BaseClass.staging5().click_add_section_toSection();
//        Thread.sleep(1000);
//        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_Section2_row_editor();
//
//        Thread.sleep(1500);
//        BaseClass.staging5().click_signature_icon_ck_modal();
//        Thread.sleep(500);
//        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().click_reportTag_dropDownItem_ck_modal();
//        Thread.sleep(500);
//        WebDriver driver = getDriver();
//
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//        BaseClass.staging5().click_out_of_section();
//        Thread.sleep(1500);
//        BaseClass.staging5().click_Section2_row_editor();
//        Thread.sleep(1500);
//
//        BaseClass.staging5().click_stamp_icon_ck_modal();
//        Thread.sleep(500);
//        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().click_reportTag_dropDownItem_ck_modal();
//        Thread.sleep(500);
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_ck_editor_admin_permission_level();
//        Thread.sleep(1200);
//         BaseClass.staging5().click_out_of_section();
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_stamp_in_section();
//        Thread.sleep(1000);
//        BaseClass.staging5().verify_signature_in_section();
//        Thread.sleep(1000);

        //        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);

    }
    @Test
    public void TR_003_report_packages() throws InterruptedException {

        BaseClass.reportfoldersection().clickReportSettingsButton();
        BaseClass.pca_xml_section().clickTemplatePackagesTab();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().getTemplatesPackagesList();
        Thread.sleep(1000);

////        //  click aei package
//        BaseClass.templatesSection().enter_PackagesTab_SearchField_ESA_CA();
//        Thread.sleep(800);
//
//        BaseClass.pca_xml_section().click_package_ESA();
//        Thread.sleep(800);
//        BaseClass.staging5().clear_package_SearchField();
//        Thread.sleep(800);
//
//        BaseClass.staging5().click_add_button_unassigned_package();
//        Thread.sleep(800);
        //hover and click first arrow button unassigned package
        BaseClass.staging5().hover_unassigned__dropdown_value();
        Thread.sleep(800);
        BaseClass.staging5().click_unassigned_items_right_arrow();
        Thread.sleep(1000);

        BaseClass.pca_xml_section().getTemplatesPackagesList();
        Thread.sleep(1000);

//remove AEI package
   //     BaseClass.templatesSection().enter_PackagesTab_SearchField_ESA_CA();
     //   Thread.sleep(800);
        //from previous script
        BaseClass.pca_xml_section().click_package_ESA();
        Thread.sleep(1500);
        BaseClass.pca_xml_section().click_remove_button();
        Thread.sleep(500);
//remove other package hovering over checkbox
        BaseClass.pca_xml_section().hover_assigned_packages_second_item();
        Thread.sleep(500);
        BaseClass.pca_xml_section().click_cancel_assigned_package_button();
        Thread.sleep(500);


        BaseClass.pca_xml_section().getTemplatesPackagesList();

        Thread.sleep(1000);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        WebDriver driver = getDriver();
//
BaseClass.staging5().acceptAlert();
Thread.sleep(1500);
     driver.navigate().refresh();
        Thread.sleep(1500);


    }
    @Test
    public void TR_004_lock_unlock_ck5() throws InterruptedException {

        //enter body text iframe
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(2000);
        BaseClass.ck5editor().enter_sc_text_body_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(500);
        BaseClass.staging5().clickSection_row_editor();

        //   BaseClass.ck5editor().click_ck5_body_with_text();
        Thread.sleep(500);
        BaseClass.ck5editor().select_all_text_introPages_body();
        Thread.sleep(500);
        BaseClass.staging5().click_lock_icon_ck5();
        Thread.sleep(500);
        BaseClass.staging5().verify_locked_content_ck5();
        Thread.sleep(1000);
        BaseClass.staging5().click_locked_content_ck5();
        Thread.sleep(1000);
        BaseClass.ck5editor().click_unlock_icon_ck5();
        Thread.sleep(1500);
        BaseClass.staging5().verify_unlocked_content_ck5();
        Thread.sleep(500);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);

    }

    @Test
    public void TR_005_ck5_admin_status_trigger_pinnedItems() throws InterruptedException {
        WebDriver driver = getDriver();
        String browserName = driver.getClass().getSimpleName();

//
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        System.out.println("Browser name: " + browserName);
//        if (browserName.contains("Chrome")) {
//            driver.navigate().to("https://staging5.openquire.com/reports/666419");
//        } else if (browserName.contains("Firefox")) {
//            driver.navigate().to("https://staging5.openquire.com/reports/666418");
//        }

        BaseClass.quireLogin().enter_admin_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.quireLogin().navigate_to_admin_pinnedStatus_reports();


        Thread.sleep(2000);
        BaseClass.reportfoldersection().clickStatusButton();
        BaseClass.reportfoldersection().click_review_status_button();
        BaseClass.staging5().click_save_button();
        BaseClass.templatesSection().verify_alertMessage_reportStatus();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().verify_report_is_pinned();
        Thread.sleep(1000);

        BaseClass.staging5().clickDashboardTab();
        Thread.sleep(1000);

        BaseClass.dashBoard().verify_statusChange_to_review_pinnedItems();
        Thread.sleep(2000);
//unpinned status trigger check

        BaseClass.quireLogin().navigate_to_admin_pinnedStatus_reports();

        Thread.sleep(2000);
        BaseClass.reportfoldersection().clickStatusButton();
        BaseClass.reportfoldersection().click_draft_status_button();
        BaseClass.staging5().click_save_button();
        BaseClass.templatesSection().verify_alertMessage_reportStatus();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().verify_report_is_unpinned();
        Thread.sleep(1000);
        BaseClass.staging5().clickDashboardTab();
        BaseClass.dashBoard().verify_pinnedItems_is_empty();
        Thread.sleep(2500);

//pin portfolio
        BaseClass.staging5().clickPortfoliosTab();
        Thread.sleep(2500);
        BaseClass.staging5().click_second_pinned_Item_portfolios();
//pin reports
        BaseClass.staging5().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_HMReports();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().captureRecentReportName();
        Thread.sleep(2000);

        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(2000);

        BaseClass.projectFolderSection().clickProjectFolderLink_2023QAReport();
        Thread.sleep(2000);
        BaseClass.staging5().click_all_pin_icons();
        Thread.sleep(500);
        //go back to dashboard
        BaseClass.staging5().clickDashboardTab();
        Thread.sleep(1500);
        //confirm pinned items match,
        BaseClass.dashBoard().confirm_pinned_items_dashboard();
        Thread.sleep(500);
        // capture and unpin items
        BaseClass.dashBoard().capture_and_delete_pinnedItem_dashboard();
        Thread.sleep(500);
//
//            BaseClass.staging5().clickDashboardTab();
        BaseClass.dashBoard().verify_pinnedItems_is_empty();
        Thread.sleep(1000);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);
        BaseClass.dashBoard().verify_dashboard_first_column();
        BaseClass.dashBoard().verify_dashboard_second_column();
        BaseClass.dashBoard().verify_dashboard_third_column_pm();
        Thread.sleep(1000);
    }
    @Test
    public void TR_006_ck5_author_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_author_Email();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.dashBoard().confirm_recentlySharedReports_items();
        Thread.sleep(500);

        BaseClass.dashBoard().verify_dashboard_first_column();
        BaseClass.dashBoard().verify_dashboard_second_column();
        BaseClass.dashBoard().verify_dashboard_third_column_author();
        Thread.sleep(1000);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);

        BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
        Thread.sleep(1000);
        BaseClass.staging5().click_modal_close_window();

          BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(1000);

        BaseClass.ck5editor().verify_ck5_lower_permission_level();

    }

    @Test
    public void TR_007_ck5_editor_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_editor_Email();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(1000);
        BaseClass.dashBoard().confirm_recentProjects_items();
        Thread.sleep(500);

        BaseClass.dashBoard().verify_dashboard_first_column();
        BaseClass.dashBoard().verify_dashboard_second_column();
        BaseClass.dashBoard().verify_dashboard_third_column_author();
        Thread.sleep(1000);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);

        BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
        Thread.sleep(1000);
        BaseClass.staging5().click_modal_close_window();

        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(1000);

        BaseClass.ck5editor().verify_ck5_lower_permission_level();

    }

    @Test
    public void TR_008_ck5_PM_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_pm_Email();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        Thread.sleep(500);
        BaseClass.dashBoard().verify_dashboard_first_column();
        BaseClass.dashBoard().verify_dashboard_second_column();
        BaseClass.dashBoard().verify_dashboard_third_column_pm();

        Thread.sleep(1000);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);
        BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
        Thread.sleep(1000);
        BaseClass.staging5().click_modal_close_window();

          BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(1000);

        BaseClass.ck5editor().verify_ck_editor_PM_permission_level();
    }

    @Test
    public void TR_009_ck5_root_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        Thread.sleep(500);

        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
        WebDriver driver = getDriver();
        driver.navigate().to(baseUrl + "analytics");

        //   driver.navigate().to("https://staging5.openquire.com/analytics");
        Thread.sleep(1000);
        BaseClass.quireLogin().VERIFY_NO_something_went_wrong_MESSAGE();
        Thread.sleep(1000);

//        if (baseUrl.contains("staging5")) {
//            driver.navigate().to("https://staging5.openquire.com/companies/20/company_email_templates?filter=report%3Astatus_chang");
//
//    } else if (baseUrl.contains("staging3") || baseUrl.contains("app")) {
            driver.navigate().to(baseUrl + "companies/253/company_email_templates?filter=report%3Astatus_change");
//        }
//        else if (baseUrl.contains("devops")) {
//            driver.navigate().to("https://app.openquire.com/companies/253/company_email_templates?filter=report%3Astatus_change");
//        }
//        else  {
//            driver.navigate().to(baseUrl + "companies/253/company_email_templates?filter=report%3Astatus_change");
//        }
        Thread.sleep(1000);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.staging5().captureURL();
        Thread.sleep(500);

        BaseClass.ck5editor().click_status_Email_Notification_Template();
        Thread.sleep(500);
        BaseClass.ck5editor().click_email_template_message();
        Thread.sleep(500);
        BaseClass.ck5editor().verify_ck_editor_root_emailStatusTemplate_permission_level();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);
driver.navigate().refresh();
Thread.sleep(1000);



    }
    @Test
    public void TR_010_ck5_dashboard_contractor_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        Thread.sleep(500);

        BaseClass.quireLogin().enter_contractor_Email();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        //Thread.sleep(2000);

        BaseClass.dashBoard().verify_dashboard_first_column();
        BaseClass.dashBoard().verify_dashboard_second_column();
        BaseClass.dashBoard().verify_dashboard_third_column_contractor();
        Thread.sleep(500);
        BaseClass.dashBoard().confirm_recentlySharedReports_items();
        Thread.sleep(500);
        BaseClass.dashBoard().confirm_recently_edited_reports_items();
        Thread.sleep(500);
        BaseClass.dashBoard().confirm_myCompanies_items_dashboard();
        Thread.sleep(500);
        BaseClass.dashBoard().confirm_contractor_company_reports();
        Thread.sleep(500);
        BaseClass.dashBoard().capture_myQuireStats_dashboard_data();
        Thread.sleep(1000);
        BaseClass.dashBoard().click_edit_profile_dashboard_button();
        Thread.sleep(500);
        BaseClass.staging5().click_cancelButton_profile();
        Thread.sleep(500);

        //verify email  support functionality works
        BaseClass.staging5().confirm_email_support_button();
        Thread.sleep(1000);
        //verify  chat support functionality works
        BaseClass.staging5().confirm_chat_support_button();
        Thread.sleep(1000);
        BaseClass.dashBoard().capture_tip_dashboard_header_data();
        Thread.sleep(500);

        BaseClass.dashBoard().refresh_all_widgets();
        Thread.sleep(5000);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);
        BaseClass.dashBoard().capture_quire_release_notes_recentData();
        Thread.sleep(1000);





        BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();

        // BaseClass.staging5().click_testing_inc_company();
     //   BaseClass.ck5editor().click_ck5_permissions_report_link();
        //Thread.sleep(1000);
        // BaseClass.staging5().switchToAutomationReportTab();
        Thread.sleep(1000);
        //    BaseClass.staging5().clickSection_row_editor();
        BaseClass.ck5editor().verify_ck5_lower_permission_level();
        //   WebDriver driver = getDriver();

        //Thread.sleep(1000);
        //    driver.close();
        //Thread.sleep(1000);
        //    BaseClass.staging5().switchToOriginalTab();

    }
    @Test
    public void TR_011_ck5_sysadmin_login_analytics_check() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_sysadmin_testingInc_email();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.navigate().to(baseUrl+"analytics");
        Thread.sleep(1000);
        BaseClass.quireLogin().VERIFY_NO_something_went_wrong_MESSAGE();
        Thread.sleep(1000);

        //Thread.sleep(2000);

        BaseClass.ck5editor().navigateTo_ck5_report_HM_folder();
        BaseClass.staging5().click_modal_close_window();

        //Thread.sleep(1000);

        //  BaseClass.staging5().clickSection_row_editor();
        BaseClass.ck5editor().verify_ck5_admin_permission_level();
    }

    @Test
    public void TR_012_Company_users() throws InterruptedException {
        WebDriver driver = getDriver();

        //export company users to excel
        BaseClass.staging5().clickUsersTab();
        Thread.sleep(500);

        BaseClass.staging5().click_usersTab_companyUsers_dropdownItem();
        Thread.sleep(500);
//clear notifications
        BaseClass.staging5().mark_all_notifications_as_read();
        Thread.sleep(500);

        BaseClass.staging5().click_export_to_excel();
        BaseClass.staging5().captureAlertMessage();

        Thread.sleep(1000);

//add company user

        BaseClass.staging5().click_add_company_user();
        Thread.sleep(500);
        BaseClass.staging5().enter_company_user_name_field();
        Thread.sleep(500);
        BaseClass.staging5().enter_company_user_email_field();
        Thread.sleep(500);
        BaseClass.staging5().enter_company_user_pw_field();
        BaseClass.staging5().enter_company_user_pw_confirmation_field();
        Thread.sleep(500);
        BaseClass.staging5().select_company_user_permission_level();
        Thread.sleep(1500);
        BaseClass.staging5().clickSave();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().enterSearchField_QA_companyUser();
        Thread.sleep(3000);
        BaseClass.staging5().click_qa_dummy_user_link();
        Thread.sleep(500);
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(1000);

        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(1000);

        BaseClass.staging5().capture_unread_notification();
        Thread.sleep(2500);

    }

    @Test
    public void TR_013_portfolios() throws InterruptedException {

        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//enter root user
        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        WebDriver driver = getDriver();
//        if (baseUrl.contains("staging5")) {
//            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//
//    } else if (baseUrl.contains("staging3") || baseUrl.contains("app")) {
            driver.navigate().to(baseUrl +"/companies/253/company_features");
//        }

        BaseClass.staging5().scroll_and_click_unregister_HOT14_feature();
        Thread.sleep(500);


//        else if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/companies/253/company_email_templates?filter=report%3Astatus_change");
//        }

        //go to portfolios tab and into qa automation pca portfolio
        BaseClass.staging5().clickPortfoliosTab();
        BaseClass.staging5().click_QA_PCA_portfolio();
        Thread.sleep(2500);

        //change to individual cost view
        BaseClass.staging5().click_change_porfolio_view_button();
        Thread.sleep(500);
        BaseClass.staging5().select_porfolio_view_individual();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1500);


        //capture portfolio text and click export pdf and export excel button...and capture green banner
        BaseClass.staging5().capture_portfolio_text();
        Thread.sleep(1000);

        BaseClass.staging5().click_export_to_excel_fm1105();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(500);
        BaseClass.staging5().click_export_pdf_button();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(500);
        //change to aggregated cost view
        BaseClass.staging5().click_change_porfolio_view_button();
        Thread.sleep(1000);
        BaseClass.staging5().select_porfolio_view_aggregated();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1500);

        //capture portfolio text and click export pdf and export excel button...and capture green banner
        BaseClass.staging5().capture_portfolio_text();
        Thread.sleep(1000);
        BaseClass.staging5().click_export_to_excel_fm1105();
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(500);
        BaseClass.staging5().click_export_pdf_button();
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(500);

//        if (baseUrl.contains("app")) {
//            driver.navigate().to("https://app.openquire.com/companies/253/company_features");
//        }
//        else if (baseUrl.contains("staging3")) {
//            driver.navigate().to("https://staging3.openquire.com/companies/4/company_features");
//        }
//        Thread.sleep(500);
//
//        BaseClass.staging5().add_company_feature_HOT14();
//        Thread.sleep(500);
//


        BaseClass.staging5().clickUserProfileTab();
        Thread.sleep(500);

        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//enter root user
        BaseClass.quireLogin().enter_sysadmin_testingInc_email();
        BaseClass.quireLogin().enterPassword();
        //Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);

    }

    @Test
    public void TR_014_delete_projFolders() throws InterruptedException {
        BaseClass.staging5().clickReportsTab();
        Thread.sleep(500);

        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);

        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(2000);

        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(2000);

        //create proj folder to be deleted -
//create proj folder

        //create RegressionSuite project folder

        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        BaseClass.projectFolderSection().enterProjectFolderNameField_TBD();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdownssffy
        Thread.sleep(2000);

        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(3500);

        BaseClass.projectFolderSection().click_FM_1104_Template_projectFolder_templatesTab();
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(3000);

        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(4500);

        //create RegressionSuite report folder with fm1104 template created

        BaseClass.projectFolderSection().click_TBD_ProjectFolderLink();
        Thread.sleep(500);

        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        Thread.sleep(500);

        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.staging5().click_view_trash_button();
        Thread.sleep(500);
        BaseClass.staging5().click_restore_first_deleted_item();
        Thread.sleep(500);


        //go back and refresh
        BaseClass.staging5().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(2500);

        //go back and permanently delete zon project folder

        BaseClass.projectFolderSection().click_TBD_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);

        BaseClass.staging5().click_view_trash_button();
        Thread.sleep(500);
        BaseClass.staging5().click_permanentlyDelete_first_deleted_item();
        Thread.sleep(500);

        //go back and refresh
        BaseClass.staging5().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(500);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(1500);

        BaseClass.projectFolderSection().verify_TBD_ProjectFolderLink_isNotVisible();
        Thread.sleep(500);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().capture_unread_notification();
        Thread.sleep(1500);


    }

    @Test
    public void TR_015_generate_PDF_projFolders() throws InterruptedException {
        BaseClass.staging5().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(4500);
        BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();
        Thread.sleep(2000);
        BaseClass.reportfoldersection().clickGeneratePDFButton_projfolderview();

//regenerate existing report already from previous test steps
      //  BaseClass.reportfoldersection().click_regenerate_button_project_folder_view();
        //verify green banner
        BaseClass.templatesSection().verify_PDF_generating_AlertMessage();
    //    Thread.sleep(2000);
        //verify loading sign disappeared for pdf status
      //  BaseClass.templatesSection().verify_PDF_finished_generating();
//click generate pdf, if not available, will re generate second report
        BaseClass.reportfoldersection().clickGeneratePDFButton_projfolderview();
        BaseClass.templatesSection().verify_PDF_generating_AlertMessage();
        Thread.sleep(2000);

        BaseClass.templatesSection().verify_PDF_finished_generating();

    }

    @Test
    public void TR_016_ck5_packages_ProjSummary_section() throws InterruptedException {
        WebDriver driver = getDriver();
        if (baseUrl.contains("staging5")) {
            driver.navigate().to("https://staging5.openquire.com/folders/275681/projects/328759");

        } else if (baseUrl.contains("staging3") || baseUrl.contains("app")) {

        driver.navigate().to(baseUrl + "/folders/545421/projects/601025");
        } else if (baseUrl.contains("devops")) {
            driver.navigate().to("https://app.openquire.com/projects/658267");
        }
        else {
            driver.navigate().to(baseUrl + "projects/658267");
        }

        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);

        BaseClass.reportfoldersection().ck5PackagesCheck();
        Thread.sleep(500);

    }



//    @Test
//    public void TR_015_ck4_packages_ProjSummary_section() throws InterruptedException {
//        WebDriver driver = getDriver();
//        if (baseUrl.contains("staging5")) {
//            driver.navigate().to("https://staging5.openquire.com/folders/275681/projects/328759");
//        }
//        else if (baseUrl.contains("staging3")) {
//            driver.navigate().to("https://staging3.openquire.com/folders/545421/projects/601025");
//        }
//
//        Thread.sleep(500);
//        BaseClass.staging5().click_modal_close_window();
//
//
//        BaseClass.reportfoldersection().ck4PackagesCheck();
//
//
//        if (baseUrl.contains("staging5")) {
//            driver.navigate().to("https://staging5.openquire.com/folders/275681/projects/328759");
//
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//
//        Thread.sleep(1000);
//
//        driver.navigate().to("https://staging5.openquire.com/projects/328760");
//        Thread.sleep(500);
//
//
//
//        BaseClass.quireLogin().enter_admin_matrix_Email();
//        Thread.sleep(1000);
////        BaseClass.quireLogin().clickNextButton();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(1500);
//
//        BaseClass.reportfoldersection().ck4PackagesCheck();
//        Thread.sleep(1000);
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//        }
//        else if (baseUrl.contains("staging3")) {
//            return;
//        }
//
//
//    }
    }



