import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;


public class Regression_Suite extends ReusableAnnotations {
	//WebDriver driver = getDriver();
    String browserName = driver.getClass().getSimpleName();

    //@BeforeTest
    @Test
    public void TR_001_User_Login() throws InterruptedException {
        WebDriver driver = getDriver();

//        driver.navigate().to("https://staging5.openquire.com/");

        driver.navigate().to("https://staging4.openquire.com/reports/1191555");
        String pageTitle = driver.getTitle();

        if (pageTitle.contains("OpenQuire")) {
            BaseClass.quireLogin().enter_admin_Email();
            Thread.sleep(1000);
            //BaseClass.quireLogin().clickNextButton();
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
        } else {
            // The title does not indicate a login page, assume the user is already logged in
            System.out.println("\n" + "Already logged in. Skipping login steps.");
        }
        Thread.sleep(3000);

    }

//    @Test
//    public void TR_005c_ck5_and_uploadtoProfile_current_admin_login() throws InterruptedException {
//
//
//        //UPLOAD STAMP
//
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_editProfile_dropdownItem();
//        BaseClass.staging5().click_stamps_tab();
//        Thread.sleep(1000);
//        BaseClass.staging5().upload_stamp_button();
//        Thread.sleep(1500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(1500);
//
//        //UPLOAD SIGNATURE
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_editProfile_dropdownItem();
//        Thread.sleep(1000);
//        BaseClass.staging5().upload_signature_button();
//        Thread.sleep(1500);
//        BaseClass.templatesSection().clickSave2();
//        Thread.sleep(3000);
//
//        //open cloned fm 1105 report, and upload stamp and signature
//        BaseClass.reportfoldersection().clickReportsTab();
//        BaseClass.reportfoldersection().enterSearchField_QA_Report();
//        Thread.sleep(3500);
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(1500);
//        BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();
//        Thread.sleep(1500);
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(1500);
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
//
//        //        BaseClass.staging5().click_default_section_title();
////        Thread.sleep(1000);
//
//    }
    @Test
    public void TR_006_report_packages() throws InterruptedException {

        BaseClass.reportfoldersection().clickReportSettingsButton();
        BaseClass.pca_xml_section().clickTemplatePackagesTab();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().getTemplatesPackagesList();
        Thread.sleep(1000);

        //  click aei package
        BaseClass.templatesSection().enter_PackagesTab_SearchField_ESA_CA();
        Thread.sleep(800);

        BaseClass.pca_xml_section().click_package_ESA();
        Thread.sleep(800);

        //hover and click first arrow button unassigned package
        BaseClass.staging5().hover_unassigned__dropdown_value();
        Thread.sleep(800);
        BaseClass.staging5().click_unassigned_items_right_arrow();
        Thread.sleep(1000);

        BaseClass.pca_xml_section().getTemplatesPackagesList();
        Thread.sleep(1000);

//remove AEI package
        BaseClass.templatesSection().enter_PackagesTab_SearchField_ESA_CA();
        Thread.sleep(800);
        BaseClass.pca_xml_section().click_package_ESA();
        Thread.sleep(500);
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

        driver.switchTo().alert().accept();
        Thread.sleep(1500);
     driver.navigate().refresh();
        Thread.sleep(1500);


    }
    @Test
    public void TR_007_lock_unlock_ck5() throws InterruptedException {

        //enter body text iframe
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);

        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        BaseClass.templatesSection().enter_instruction_text_iFrame();

        //double click last word and leave iframe and click lock icon
        BaseClass.templatesSection().double_click_body_iFrame();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.switchTo().defaultContent();
        BaseClass.staging5().click_lock_icon_ck5();

        //switch back into iframe and verify locked content - leave iframe

        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.staging5().verify_locked_content_ck5();
        Thread.sleep(1000);
        BaseClass.staging5().click_locked_content_ck5();

        driver.switchTo().defaultContent();

        BaseClass.staging5().click_unlock_icon_ck5();
        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
        Thread.sleep(500);
        BaseClass.staging5().verify_unlocked_content_ck5();
        Thread.sleep(500);
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);

    }

    @Test
    public void TR_007b_ck5_admin_status_trigger_pinnedItems() throws InterruptedException {

//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
        BaseClass.quireLogin().navigate_to_admin_pinnedStatus_reports();

//        BaseClass.quireLogin().enter_admin_Email();
//        BaseClass.quireLogin().enterPassword();
//        Thread.sleep(1000);
//        BaseClass.quireLogin().clickLogin();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_modal_close_window();
//        Thread.sleep(500);


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
        Thread.sleep(1000);
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
        BaseClass.reportfoldersection().captureRecentReportName();
        BaseClass.reportfoldersection().clickReportsFirstLink();
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
    public void TR_008_ck5_dashboard_author_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_author_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
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

        BaseClass.staging5().navigateTo_automation_report_HM_folder();
        Thread.sleep(1500);

        BaseClass.staging5().verify_ck_editor_lower_permission_level();

    }
    @Test
    public void TR_009_ck5_dashboard_editor_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_editor_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.dashBoard().confirm_recentProjects_items();
        Thread.sleep(500);

        BaseClass.dashBoard().verify_dashboard_first_column();
        BaseClass.dashBoard().verify_dashboard_second_column();
        BaseClass.dashBoard().verify_dashboard_third_column_author();
        Thread.sleep(1000);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);

        BaseClass.staging5().navigateTo_automation_report_HM_folder();
        Thread.sleep(1500);

       // BaseClass.staging5().clickSection_row_editor();
        BaseClass.staging5().verify_ck_editor_lower_permission_level();
    }
    @Test
    public void TR_010_ck5_dashboard_PM_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_pm_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.dashBoard().verify_dashboard_first_column();
        BaseClass.dashBoard().verify_dashboard_second_column();
        BaseClass.dashBoard().verify_dashboard_third_column_pm();

        Thread.sleep(1000);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);
        BaseClass.staging5().navigateTo_automation_report_HM_folder();
        Thread.sleep(1500);

     //   BaseClass.staging5().clickSection_row_editor();
        BaseClass.staging5().verify_ck_editor_PM_permission_level();
    }
    @Test
    public void TR_011_ck5_root_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enterRootUserEmail();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
        WebDriver driver = getDriver();

        driver.navigate().to("https://staging5.openquire.com/analytics");
        Thread.sleep(1000);
        BaseClass.quireLogin().VERIFY_NO_something_went_wrong_MESSAGE();
        Thread.sleep(1000);

     //   String currentURL = driver.getCurrentUrl();
        // Check if current URL contains "staging5"
       // if (currentURL.contains("staging5")) {
            driver.navigate().to("https://staging5.openquire.com/companies/4/company_email_templates?filter=report%3Astatus_change");
       // }
        // Check if current URL contains "staging2"
      //  else if (currentURL.contains("staging2")) {
       //     driver.navigate().to("https://staging2.openquire.com/companies/43/company_email_templates?filter=report%3Astatus_change");
       // }
        Thread.sleep(1000);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        BaseClass.staging5().captureURL();
        Thread.sleep(500);

        BaseClass.ck5editor().click_status_Email_Notification_Template();
        Thread.sleep(500);
        BaseClass.ck5editor().click_email_template_message();
        Thread.sleep(500);
        BaseClass.staging5().verify_ck_editor_root_emailStatusTemplate_permission_level();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);



    }
    @Test
    public void TR_012_ck5_dashboard_contractor_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_contractor_Email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);


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
        Thread.sleep(2500);
        BaseClass.dashBoard().verify_no_fetching_data_messages();
        Thread.sleep(1000);
        BaseClass.dashBoard().capture_quire_release_notes_recentData();
        Thread.sleep(1000);




        BaseClass.dashBoard().click_contractor_testingInc_company_link();
        BaseClass.staging5().click_automation_report_link();
        Thread.sleep(1000);
        BaseClass.staging5().switchToAutomationReportTab();
        Thread.sleep(1000);
//        BaseClass.staging5().clickSection_row_editor();
        BaseClass.staging5().verify_ck_editor_lower_permission_level();
        Thread.sleep(1000);
        WebDriver driver = getDriver();

        driver.close();
        Thread.sleep(1000);
        BaseClass.staging5().switchToOriginalTab();
        Thread.sleep(1000);


    }
    @Test
    public void TR_013_ck5_sysadmin_login() throws InterruptedException {
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        BaseClass.quireLogin().enter_sysadmin_testingInc_email();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.navigate().to("https://staging5.openquire.com/analytics");
        Thread.sleep(1000);
        BaseClass.quireLogin().VERIFY_NO_something_went_wrong_MESSAGE();
        Thread.sleep(1000);

        BaseClass.staging5().navigateTo_automation_report_HM_folder();
        Thread.sleep(1000);

    //    BaseClass.staging5().clickSection_row_editor();
        BaseClass.staging5().verify_ck_editor_admin_permission_level();
        Thread.sleep(1000);
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);

        //click body and click locked content iframe
//        Thread.sleep(500);
//        BaseClass.staging5().clickSection_row_editor();
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_locked_content_ck5();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_locked_content_ck5();
//        //leave iframe and click unlock icon
//        driver.switchTo().defaultContent();
//        BaseClass.staging5().click_unlock_icon_ck5();
//        //switch to body iframe and check confirm unlocked content iframe
//
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_unlocked_content_ck5();
//        Thread.sleep(500);
//        BaseClass.templatesSection().select_all_body_and_delete_iFrame();
//        Thread.sleep(500);



    }
    @Test
    public void TR_014_Company_users() throws InterruptedException {

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
        BaseClass.reportfoldersection().enterSearchField_QA_companyUser();
        Thread.sleep(3000);
        BaseClass.staging5().click_qa_dummy_user_link();
        Thread.sleep(500);
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(1000);
        WebDriver driver = getDriver();

        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(1000);

        BaseClass.staging5().capture_unread_notification();
        Thread.sleep(2500);

    }

    @Test
    public void TR_016_portfolios() throws InterruptedException {
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
    }

    @Test
    public void TR_017_projFolders() throws InterruptedException {
        BaseClass.staging5().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        BaseClass.reportfoldersection().clickReportsFirstLink();

        BaseClass.projectFolderSection().click_ZON_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
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

        //go back and permanently delete zon project folder

        BaseClass.projectFolderSection().click_ZON_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

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

        BaseClass.projectFolderSection().verify_ZON_ProjectFolderLink_isNotVisible();
        Thread.sleep(500);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().capture_unread_notification();
        Thread.sleep(1500);


    }

    @Test
    public void TR_018_ck4_packages_ProjSummary_section() throws InterruptedException {
        WebDriver driver = getDriver();

        driver.navigate().to("https://staging5.openquire.com/folders/275681/projects/328759");

        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();


        BaseClass.reportfoldersection().ck4PackagesCheck();

        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();

        Thread.sleep(1000);

        driver.navigate().to("https://staging5.openquire.com/projects/328760");
        Thread.sleep(500);
        BaseClass.staging5().click_modal_close_window();


        BaseClass.quireLogin().enter_admin_matrix_Email();
        Thread.sleep(1000);
//        BaseClass.quireLogin().clickNextButton();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();

        Thread.sleep(2500);

        BaseClass.reportfoldersection().ck4PackagesCheck();
        Thread.sleep(1000);
        BaseClass.staging5().clickUserProfileTab();
        BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();


    }
    }


