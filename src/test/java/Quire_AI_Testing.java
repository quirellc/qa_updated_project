import Quire_POM.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;


public class Quire_AI_Testing extends ReusableAnnotations {
//	WebDriver driver = getDriver();
// private String getCurrentMonth() {
//  // Get the current date
//  Calendar calendar = Calendar.getInstance();
//
//  // Format the current month
//  DateFormat formatMonth = new SimpleDateFormat("MM");
//  return formatMonth.format(calendar.getTime());
// }
//
// private String getPreviousMonth() {
//  // Get the current date
//  Calendar calendar = Calendar.getInstance();
//
//  // Subtract one month
//  calendar.add(Calendar.MONTH, -1);
//
//  // Format the previous month
//  DateFormat formatMonth = new SimpleDateFormat("MM");
//  return formatMonth.format(calendar.getTime());


 @Test
 public void TR_01_user_login() throws InterruptedException {
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
   BaseClass.quireLogin().enterRootUserEmail();

//   BaseClass.quireLogin().enter_cbre_sysadmin_Email();
  } else if (baseUrl.contains("app")) {
   BaseClass.quireLogin().enter_admin_Email();
  }

  Thread.sleep(1000);
  BaseClass.quireLogin().enterPassword();
  Thread.sleep(1000);
  BaseClass.quireLogin().clickLogin();
  Thread.sleep(3000);
  //     BaseClass.reportfoldersection().click_ck5_sanity_test_report_link();
 }
//  @Test
//  public void TR_0002_add_all_company_users() throws InterruptedException {
// //  WebDriver driver = getDriver();
//   //need to go company users first
// // driver.navigate().to("https://app.openquire.com");
//   BaseClass.staging5().enter_all_company_users_with_roles();
//  }
//  @Test
//  public void TR_0003_add_all_company_features() throws InterruptedException {
//   //need to go company features first
//
//   BaseClass.staging5().add_all_company_features();
//
//  }
//  @Test
//  public void TR_0004_add_qa_reportFolder() throws InterruptedException {
//   BaseClass.reportfoldersection().clickReportsTab();
//BaseClass.reportfoldersection().clickAddFolderButton();
//   BaseClass.reportfoldersection().enterFolderNameField_QA();
//   Thread.sleep(1000);
//   }


 @Test
 public void TR_02a_lazarus_upload() throws InterruptedException {
  WebDriver driver = getDriver();

  driver.navigate().to("https://staging3.openquire.com/companies/77/ai_legacy_reports");
  Thread.sleep(3000);

  BaseClass.staging5().clickLibrariesTab();
  BaseClass.staging5().click_librariesTab_quireLazarusReports_Dropdown();

  Thread.sleep(2000);

  BaseClass.quire_AI().click_all_reports_checkbox();
  Thread.sleep(2000);
  BaseClass.quire_AI().click_delete_files_button();
  Thread.sleep(500);
  BaseClass.quire_AI().click_commit_button();
  Thread.sleep(250);
  BaseClass.quire_AI().verify_files_deleted_notification();
  Thread.sleep(3000);

  BaseClass.quire_AI().click_upload_files_button();
  Thread.sleep(500);
  BaseClass.quire_AI().upload_fnmae_pdf_file_to_lazarus();
//  Thread.sleep(500);

//  BaseClass.quire_AI().click_upload_files_button();
//  Thread.sleep(500);
  BaseClass.quire_AI().upload_asbestosSummary_doc_file_to_lazarus();
  Thread.sleep(2000);
  BaseClass.quire_AI().verify_4_items_uploading_lazarus2();

  Thread.sleep(5000);


  BaseClass.staging5().clickUserProfileTab();
  BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
  Thread.sleep(500);

  BaseClass.quireLogin().enter_cbre_sysadmin_Email();
  BaseClass.quireLogin().enterPassword();
  Thread.sleep(1000);
  BaseClass.quireLogin().clickLogin();
  Thread.sleep(500);
  BaseClass.staging5().click_modal_close_window();
  Thread.sleep(500);

  BaseClass.staging5().clickLibrariesTab();
  BaseClass.staging5().click_librariesTab_quireLazarusReports_Dropdown();
  Thread.sleep(1000);

  BaseClass.quire_AI().click_first_link_systemLabel_dropdownButton();
  Thread.sleep(500);
  BaseClass.quire_AI().click_reliance_letter_dropdown_option();
//  Thread.sleep(500);
//need to refresh, it doesnt register some times
  driver.navigate().refresh();
  Thread.sleep(1000);

  BaseClass.quire_AI().enter_label_field_relianceLetter();
  Thread.sleep(2000);
  BaseClass.staging5().click_out_of_section();
  Thread.sleep(3000);
  BaseClass.quire_AI().verify_automation_asbestos_report_link();
  Thread.sleep(500);
  BaseClass.quire_AI().click_remove_label_button();
  Thread.sleep(2000);
  BaseClass.staging5().click_out_of_section();
  Thread.sleep(200);
  BaseClass.quire_AI().verify_automation_fnmae_report_link();
  Thread.sleep(200);


  BaseClass.quire_AI().click_all_reports_checkbox();
  Thread.sleep(500);
  BaseClass.quire_AI().click_compress_and_download_button();
  Thread.sleep(500);
  BaseClass.quire_AI().click_commit_button();
  Thread.sleep(500);
  BaseClass.quire_AI().verify_download_link_notification();
  Thread.sleep(500);
  BaseClass.quire_AI().click_clear_selection_button();
  Thread.sleep(5000);



  //think feature not working yet 9/10/25
  BaseClass.quire_AI().hover_and_click_ask_AI_lazarus_Button();
  Thread.sleep(3000);
  BaseClass.quire_AI().enter_AI_conversate_field_locationOfDocument();
  Thread.sleep(6000);
  BaseClass.quire_AI().verify_AI_chat_asbestos_state_response_text1();
  Thread.sleep(500);
  BaseClass.quire_AI().click_AI_chat_close_button();
  Thread.sleep(500);
  driver.navigate().refresh();
  Thread.sleep(500);


  BaseClass.quire_AI().hover_and_click_ask_AI_lazarus_Button();
  Thread.sleep(3000);
  BaseClass.quire_AI().enter_AI_conversate_field_summarizeDocument();
  Thread.sleep(6000);
  BaseClass.quire_AI().verify_AI_chat_asbestos_summary_response_text();
  Thread.sleep(500);
  BaseClass.quire_AI().click_AI_chat_close_button();
  Thread.sleep(1500);

  BaseClass.quire_AI().hover_and_click_second_report_ask_AI_Button();
  Thread.sleep(3000);
  BaseClass.quire_AI().enter_AI_conversate_field_authorOfDocument();
  Thread.sleep(10000);
  BaseClass.quire_AI().verify_AI_chat_author_fnmae_response_text();
  Thread.sleep(3000);

  BaseClass.quire_AI().click_AI_chat_close_button();
  Thread.sleep(1500);
  BaseClass.quire_AI().hover_and_click_second_report_ask_AI_Button();
  Thread.sleep(500);

  BaseClass.quire_AI().enter_AI_conversate_field_issues_or_concerns();
  Thread.sleep(10000);
  BaseClass.quire_AI().verify_AI_chat_issues_fnmae_response_text();
  Thread.sleep(500);
  BaseClass.quire_AI().click_AI_chat_close_button();
  Thread.sleep(1500);







 }


 @Test
public void TR_02b_Quire_AI_searchField_and_prompt_Testing() throws InterruptedException {
 WebDriver driver = getDriver();
//
//
//  BaseClass.staging5().clickUserProfileTab();
//  BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
//  Thread.sleep(500);
//
//  BaseClass.quireLogin().enter_cbre_sysadmin_Email();
//  BaseClass.quireLogin().enterPassword();
//  Thread.sleep(1000);
//  BaseClass.quireLogin().clickLogin();
//  Thread.sleep(500);

BaseClass.quire_AI().click_quire_AI_search_field();
  Thread.sleep(500);
 BaseClass.quire_AI().verify_quire_AI_prompt_text();
  Thread.sleep(500);
  BaseClass.quire_AI().enter_quire_AI_prompt_search_field();
// BaseClass.quire_AI().click_quire_AI_filter_button();

// BaseClass.quire_AI().click_quire_AI_status_field();
 Thread.sleep(2000);

// BaseClass.quire_AI().confirm_quire_AI_status_value();
// BaseClass.quire_AI().click_writing_status_dropdown();
 BaseClass.quire_AI().click_quire_AI_search_button();
 Thread.sleep(5000);
 BaseClass.quire_AI().hover_quire_AI_first_search_result();


 Thread.sleep(2000);
 BaseClass.quire_AI().confirm_report_opened_new_tab_and_sameTab();
 BaseClass.quire_AI().click_ask_quire_button();

 Thread.sleep(4000);
  BaseClass.quire_AI().verify_AI_chat_intro_loading_message();
  Thread.sleep(500);

 BaseClass.quire_AI().click_AI_chat_back_button();
 Thread.sleep(4000);

 BaseClass.quire_AI().verify_AI_intro_chat_body();
// Thread.sleep(500);
// BaseClass.quire_AI().verify_AI_intro_chat_body();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_continue_conversation_button();
 Thread.sleep(4000);
 BaseClass.quire_AI().verify_AI_chat_create_summary_response();
// Thread.sleep(1000);
 // BaseClass.staging5().click_out_of_section();
//  Thread.sleep(500);


 //BaseClass.quire_AI().click_quire_AI_create_summary_button();
 Thread.sleep(6000);
 BaseClass.quire_AI().verify_AI_chat_hideReport_summary_Texas_response_text();
 Thread.sleep(2000);

}

 }





