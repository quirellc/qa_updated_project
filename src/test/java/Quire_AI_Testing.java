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
  Thread.sleep(20000);



  //think feature not working yet 9/10/25
  BaseClass.quire_AI().hover_and_click_ask_AI_lazarus_Button();
  Thread.sleep(3000);
  BaseClass.quire_AI().enter_AI_conversate_field_locationOfDocument();
  Thread.sleep(3000);
  BaseClass.quire_AI().verify_AI_chat_asbestos_state_response_text1();
  Thread.sleep(500);
  BaseClass.quire_AI().click_AI_chat_close_button();
  Thread.sleep(500);
  driver.navigate().refresh();
  Thread.sleep(500);


  BaseClass.quire_AI().hover_and_click_ask_AI_lazarus_Button();
  Thread.sleep(3000);
  BaseClass.quire_AI().enter_AI_conversate_field_summarizeDocument();
  Thread.sleep(10000);
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
public void TR_02b_Quire_AI_searchField_and_chat_prompt_Testing() throws InterruptedException {
 WebDriver driver = getDriver();
//
//
  BaseClass.staging5().clickUserProfileTab();
  BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
  Thread.sleep(500);

  BaseClass.quireLogin().enter_cbre_sysadmin_Email();
  BaseClass.quireLogin().enterPassword();
  Thread.sleep(1000);
  BaseClass.quireLogin().clickLogin();
  Thread.sleep(2500);

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
  Thread.sleep(2000);

  BaseClass.quire_AI().click_ask_quire_button();

// Thread.sleep(4000);
//  BaseClass.quire_AI().verify_AI_chat_intro_loading_message();
  Thread.sleep(6000);
  Thread.sleep(500);
 BaseClass.quire_AI().click_AI_chat_back_button();
 Thread.sleep(4000);
 BaseClass.quire_AI().verify_AI_intro_chat_body();
// Thread.sleep(500);
// BaseClass.quire_AI().verify_AI_intro_chat_body();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_continue_conversation_button();
 Thread.sleep(2000);


  BaseClass.quire_AI().verify_AI_chat_create_summary_response();
  Thread.sleep(2000);

  BaseClass.quire_AI().click_quire_AI_create_summary_button();
  Thread.sleep(8000);
   BaseClass.quire_AI().verify_AI_chat_hideReport_summary_Texas_response_text();
  Thread.sleep(2000);

// Thread.sleep(1000);
 // BaseClass.staging5().click_out_of_section();
//  Thread.sleep(500);


 //BaseClass.quire_AI().click_quire_AI_create_summary_button();
 Thread.sleep(2000);

}
@Test
public void TR_02c_ck5_AI_toolbar() throws InterruptedException {
 WebDriver driver = getDriver();
 BaseClass.staging5().clickUserProfileTab();
 BaseClass.staging5().click_userProfileTab_logOut_dropdownItem();
 Thread.sleep(500);

 BaseClass.quireLogin().enter_admin_Email();
 BaseClass.quireLogin().enterPassword();
 Thread.sleep(1000);
 BaseClass.quireLogin().clickLogin();
 Thread.sleep(2500);

 driver.navigate().to("https://staging3.openquire.com/reports/1595463");

//         Enable spell check and track changes

 BaseClass.staging5().click_and_capture_spell_check_button();
 Thread.sleep(1000);
 BaseClass.staging5().click_and_capture_track_changes_button();
 Thread.sleep(4500);

//         ========== TEST 1: Generate Content > Summarize (with Replace button) ==========
//         Test AI Summarize feature with Stop/Try Again and Replace functionality
 BaseClass.staging5().click_coverLetter_sectionView();
 Thread.sleep(1000);
 BaseClass.templatesSection().clickAddContentRow_introPages();
 Thread.sleep(1000);

 BaseClass.quire_AI().verify_quire_AI_icon_isVisible();
 Thread.sleep(500);
 BaseClass.quire_AI().select_all_TC_body_text();
 Thread.sleep(500);

 BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 BaseClass.quire_AI().verify_quire_AI_dropDownItems();
 Thread.sleep(500);

 // Click Generate Content > Summarize
 BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
 Thread.sleep(1000);
 BaseClass.quire_AI().verify_quire_AI_loading_prompt();

 // Test Stop button - should clear the AI response
 BaseClass.quire_AI().click_quire_AI_stop_button();
 Thread.sleep(500);
 BaseClass.quire_AI().verify_quire_AI_empty_prompt();
 Thread.sleep(500);

 // Test Try Again button - should regenerate AI response
 BaseClass.quire_AI().click_quire_AI_try_again_button();
 Thread.sleep(5000);
 BaseClass.quire_AI().verify_quire_AI_summarize_generated_prompt();
 Thread.sleep(1000);

 // Test Replace button - replaces editor content with AI generated text
 BaseClass.quire_AI().click_quire_AI_replace_button();
 Thread.sleep(500);
 BaseClass.staging5().acceptAlert();
 Thread.sleep(1000);

 // Verify the AI text was inserted into the editor
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(1000);
 BaseClass.quire_AI().verify_quire_AI_summarize_coverLetter_inserted_text();
 Thread.sleep(500);

 // Revert Cover Letter changes
 BaseClass.staging5().click_coverLetter_sectionView();
 Thread.sleep(500);
 BaseClass.staging5().click_intro_pages_revisions_icon();
 Thread.sleep(1000);

//        BaseClass.ck5editor().click_close_button_popup();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_intro_pages_revisions_icon();
//        Thread.sleep(1000);

 BaseClass.staging5().click_revert_button_secondLink();
 Thread.sleep(1000);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(500);


 // ========== TEST 2: Generate Content > Summarize (with Copy button) ==========
 // Test AI Copy feature - generate AI text, copy it, then paste into different section
 BaseClass.staging5().click_title_page_sectionView();
 Thread.sleep(1000);
 BaseClass.templatesSection().clickAddContentRow_introPages();
 Thread.sleep(1000);
 BaseClass.quire_AI().select_all_TC_body_text();
 Thread.sleep(500);
 // Open AI toolbar and generate summarize content
 BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
 Thread.sleep(2000);
 BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_generated_prompt();
 Thread.sleep(1000);

 // Click Copy button (copies AI text to clipboard, does NOT insert into editor)
 BaseClass.quire_AI().click_quire_AI_copy_text_button();
 Thread.sleep(1000);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(1000);

 // Now paste the copied AI text into the editor manually
 BaseClass.templatesSection().clickAddContentRow_introPages();
 Thread.sleep(500);
 BaseClass.quire_AI().paste_text_introPages_body();
 Thread.sleep(500);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(1000);

 // Verify the pasted AI text appears in the editor
 BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_inserted_text();
 Thread.sleep(500);

 // Revert Title Page changes
 BaseClass.staging5().click_title_page_sectionView();
 Thread.sleep(500);
 BaseClass.staging5().click_intro_pages_revisions_icon();
 Thread.sleep(1000);
//        BaseClass.ck5editor().click_close_button_popup();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_intro_pages_revisions_icon();
 Thread.sleep(1000);
 BaseClass.staging5().click_revert_button_secondLink();
 Thread.sleep(1000);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(1000);

 // ========== TEST 3: Content Assistant > Suggest References ==========
 // Test AI Suggest References feature in Executive Summary intro page


 BaseClass.staging5().click_executive_summary_sectionView();
 Thread.sleep(1000);
 BaseClass.templatesSection().clickAddContentRow_introPages();
 Thread.sleep(1000);
 BaseClass.quire_AI().select_all_TC_body_text();
 Thread.sleep(500);
 // Open AI toolbar and click Content Assistant > Thesaurus
 BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_dropDown_contentAssistant_header_button();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_dropDown_suggest_references_button();
 Thread.sleep(6000);

 // Verify thesaurus suggestions appear
 BaseClass.quire_AI().verify_quire_AI_suggest_references_generated_prompt();
 Thread.sleep(1000);

 // Replace text with thesaurus suggestion
 BaseClass.quire_AI().click_quire_AI_replace_button();
 Thread.sleep(500);
 BaseClass.staging5().acceptAlert();
 Thread.sleep(1000);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(1500);

 // Verify the thesaurus replacement persists
 BaseClass.quire_AI().verify_quire_AI_suggest_references_inserted_text();
 Thread.sleep(500);
 // Revert Executive Summary changes
 BaseClass.staging5().click_executive_summary_sectionView();
 Thread.sleep(500);
 BaseClass.staging5().click_intro_pages_revisions_icon();
 Thread.sleep(1000);
//        BaseClass.ck5editor().click_close_button_popup();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_intro_pages_revisions_icon();
 Thread.sleep(1000);
 BaseClass.staging5().click_revert_button_secondLink();
 Thread.sleep(1000);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(2000);

//         ========== TEST 4: Adjust Content Tone > Technical ==========
//         Test AI Tone Adjustment - converts text to technical tone in Default Section SmartTable



 driver.navigate().refresh();
 Thread.sleep(2000);
 BaseClass.staging5().click_default_section_title();
 Thread.sleep(1000);
 BaseClass.quire_AI().click_smartTable_cell_text_to_select();
 Thread.sleep(1000);
 //  BaseClass.quire_AI().Discard_TC_if_present_ST_cell();
 Thread.sleep(1000);
 //   BaseClass.quire_AI().click_smartTable_cell_text_to_select();
 Thread.sleep(1000);
 BaseClass.quire_AI().select_all_TC_body_text();
 Thread.sleep(500);
 // Open AI toolbar and click Adjust Content Tone > Technical
 BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 //  BaseClass.quire_AI().click_quire_AI_icon();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_dropDown_adjustContentTone_header_button();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_dropDown_technical_tone_button();
 Thread.sleep(2000);

 // Verify technical tone content appears
 BaseClass.quire_AI().verify_quire_AI_technical_tone_generated_prompt();
 Thread.sleep(1000);

 // Replace text with technical tone version
 BaseClass.quire_AI().click_quire_AI_replace_button();
 Thread.sleep(500);
 BaseClass.staging5().acceptAlert();
 Thread.sleep(1000);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(1000);

 // Verify the technical tone text persists
 BaseClass.quire_AI().verify_quire_AI_technical_tone_inserted_text();
 Thread.sleep(1000);
 // Revert Default Section SmartTable changes
 BaseClass.staging5().click_default_section_title();
 Thread.sleep(500);
 BaseClass.staging5().click_smartTable_revisions_icon_second();
 Thread.sleep(1000);
 BaseClass.staging5().click_revert_button_secondLink();
 Thread.sleep(1000);
 BaseClass.staging5().click_pixel_out_of_section();
 Thread.sleep(1000);
//
//Thread.sleep(2000);
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_and_capture_track_changes_button();
//        Thread.sleep(2000);
//        BaseClass.quire_AI().click_smartTable_cell_text_to_select();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().Discard_TC_if_present_ST_cell();
//        Thread.sleep(1000);
}
 }





