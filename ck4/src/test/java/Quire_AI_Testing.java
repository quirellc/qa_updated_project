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
      driver.navigate().to("https://staging3.openquire.com/reports/1595451");
     Thread.sleep(3000);

     //     BaseClass.reportfoldersection().click_ck5_sanity_test_report_link();
 }
    @Test
    public void TR_0008_ck4_AI_toolbar() throws InterruptedException {
        WebDriver driver = getDriver();

        // Enable spell check and track changes
        BaseClass.staging5().click_and_capture_spell_check_button();
        Thread.sleep(1000);
        BaseClass.staging5().click_and_capture_track_changes_button();
        Thread.sleep(5000);

        // ========== TEST 1: Generate Content > Summarize (with Replace button) ==========
        // Test AI Summarize feature with Stop/Try Again and Replace functionality
        BaseClass.staging5().click_coverLetter_sectionView();
        Thread.sleep(1000);
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(1000);

        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
        Thread.sleep(1000);
        BaseClass.quire_AI().select_all_text_body();
        driver.switchTo().defaultContent();

        Thread.sleep(500);
        BaseClass.quire_AI().click_quire_AI_icon();
        Thread.sleep(500);
        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
        Thread.sleep(500);

        // BaseClass.quire_AI().verify_quire_AI_dropDownItems();
        //  Thread.sleep(500);

        // Click Generate Content > Summarize
//        BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
//        Thread.sleep(500);
        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
        // Thread.sleep(1000);
        driver.switchTo().defaultContent();
        //  Thread.sleep(1000);

        BaseClass.quire_AI().verify_quire_AI_loading_prompt();
        //   Thread.sleep(1000);

        // Test Stop button - should clear the AI response
        BaseClass.quire_AI().click_quire_AI_stop_button();
        Thread.sleep(500);
        BaseClass.quire_AI().verify_quire_AI_empty_prompt();
        Thread.sleep(500);

        // Test Try Again button - should regenerate AI response
        BaseClass.quire_AI().click_quire_AI_try_again_button();
        Thread.sleep(5000);
        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
        Thread.sleep(500);
        BaseClass.quire_AI().verify_quire_AI_summarize_coverLetter_generated_prompt();
        driver.switchTo().defaultContent();
        Thread.sleep(500);

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
        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
        Thread.sleep(1000);
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
        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
        Thread.sleep(1000);
        BaseClass.quire_AI().select_all_text_body();
        driver.switchTo().defaultContent();

        // Open AI toolbar and generate summarize content
        BaseClass.quire_AI().click_quire_AI_icon();
        Thread.sleep(500);
        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
        Thread.sleep(500);
        // BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
        //  Thread.sleep(500);

        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
        driver.switchTo().defaultContent();

        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
        Thread.sleep(5000);

        BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_generated_prompt();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);


        // Click Copy button (copies AI text to clipboard, does NOT insert into editor)
        BaseClass.quire_AI().click_quire_AI_copy_text_button();
        Thread.sleep(1000);
        BaseClass.quire_AI().click_cancel_quire_AI_prompt();
        Thread.sleep(500);
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(1000);

        // Now paste the copied AI text into the editor manually
        BaseClass.templatesSection().clickAddContentRow_introPages();
        Thread.sleep(500);
        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
        BaseClass.quire_AI().paste_text_body();
        driver.switchTo().defaultContent();
        Thread.sleep(500);
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(1000);

        // Verify the pasted AI text appears in the editor
        BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_inserted_text();
        Thread.sleep(500);

        // Revert Title Page changes
        BaseClass.staging5().click_title_page_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
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

        // Switch to editor iframe and select all text
        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
        Thread.sleep(1000);
        BaseClass.quire_AI().select_all_text_body();
        driver.switchTo().defaultContent();

        // Open AI toolbar and click Content Assistant > Suggest References
        BaseClass.quire_AI().click_quire_AI_icon();
        Thread.sleep(500);
        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
        Thread.sleep(500);
        BaseClass.quire_AI().click_quire_AI_dropDown_contentAssistant_header_button();
        Thread.sleep(500);
        BaseClass.quire_AI().click_quire_AI_dropDown_suggest_references_button();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        // Verify reference suggestions appear
        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
        Thread.sleep(500);
        BaseClass.quire_AI().verify_quire_AI_suggest_references_generated_prompt();
        driver.switchTo().defaultContent();
        Thread.sleep(500);

        // Replace text with suggested references
        BaseClass.quire_AI().click_quire_AI_replace_button();
        Thread.sleep(500);
        BaseClass.staging5().acceptAlert();
        Thread.sleep(1000);
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(1000);

        // Verify the references persist in intro page
        BaseClass.quire_AI().verify_quire_AI_suggest_references_inserted_text();
        Thread.sleep(500);

        // Revert Executive Summary changes
        BaseClass.staging5().click_executive_summary_sectionView();
        Thread.sleep(500);
        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
        Thread.sleep(1000);
        BaseClass.staging5().click_revert_button_secondLink();
        Thread.sleep(1000);
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(2000);

//         ========== TEST 4: Adjust Content Tone > Technical ==========
//         Test AI Tone Adjustment - converts text to technical tone in Default Section SmartTable
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);

        // Click on the specific SmartTable cell with text to convert
        BaseClass.quire_AI().click_smartTable_cell_text_to_select();
        Thread.sleep(1000);

        // Switch to SmartTable editor iframe and select all text
        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
        Thread.sleep(1000);
        BaseClass.quire_AI().select_all_text_body();
        driver.switchTo().defaultContent();

        // Open AI toolbar and click Adjust Content Tone > Technical
        BaseClass.quire_AI().click_quire_AI_icon();
        Thread.sleep(500);
        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
        Thread.sleep(500);
        BaseClass.quire_AI().click_quire_AI_dropDown_adjustContentTone_header_button();
        Thread.sleep(500);
        BaseClass.quire_AI().click_quire_AI_dropDown_technical_tone_button();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        Thread.sleep(5000);

        // Verify technical tone content appears
        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
        Thread.sleep(500);
        BaseClass.quire_AI().verify_quire_AI_technical_tone_generated_prompt();
        driver.switchTo().defaultContent();
        Thread.sleep(500);

        // Replace text with technical tone version
        BaseClass.quire_AI().click_quire_AI_replace_button();
        Thread.sleep(500);
        BaseClass.staging5().acceptAlert();
        Thread.sleep(1000);
        BaseClass.staging5().click_pixel_out_of_section();
        Thread.sleep(1000);

        // Verify the technical tone text persists in SmartTable
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

    }


//  @Test
//  public void TR_0002_add_all_company_users() throws InterruptedException {
// //  WebDriver driver = getDriver();
//   //need to go company users first
 // driver.navigate().to("https://app.openquire.com");
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

//    @Test
//    public void TR_0008_ck4_AI_toolbar() throws InterruptedException {
//        WebDriver driver = getDriver();
//
//        // Enable spell check and track changes
//        BaseClass.staging5().click_and_capture_spell_check_button();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_and_capture_track_changes_button();
//        Thread.sleep(5000);
//
//        // ========== TEST 1: Generate Content > Summarize (with Replace button) ==========
//        // Test AI Summarize feature with Stop/Try Again and Replace functionality
//        BaseClass.staging5().click_coverLetter_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//
//        // BaseClass.quire_AI().verify_quire_AI_dropDownItems();
//        //  Thread.sleep(500);
//
//        // Click Generate Content > Summarize
////        BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
////        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//        // Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        //  Thread.sleep(1000);
//
//        BaseClass.quire_AI().verify_quire_AI_loading_prompt();
//        //   Thread.sleep(1000);
//
//        // Test Stop button - should clear the AI response
//        BaseClass.quire_AI().click_quire_AI_stop_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_empty_prompt();
//        Thread.sleep(500);
//
//        // Test Try Again button - should regenerate AI response
//        BaseClass.quire_AI().click_quire_AI_try_again_button();
//        Thread.sleep(5000);
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_summarize_coverLetter_generated_prompt();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//
//        // Test Replace button - replaces editor content with AI generated text
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//
//        // Verify the AI text was inserted into the editor
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().verify_quire_AI_summarize_coverLetter_inserted_text();
//        Thread.sleep(500);
//
//        // Revert Cover Letter changes
//        BaseClass.staging5().click_coverLetter_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(500);
//
//        // ========== TEST 2: Generate Content > Summarize (with Copy button) ==========
//        // Test AI Copy feature - generate AI text, copy it, then paste into different section
//        BaseClass.staging5().click_title_page_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        // Open AI toolbar and generate summarize content
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//        // BaseClass.quire_AI().click_quire_AI_dropDown_generateContent_header_button();
//        //  Thread.sleep(500);
//
//        BaseClass.quire_AI().click_quire_AI_dropDown_summarize_button();
//        driver.switchTo().defaultContent();
//
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(5000);
//
//        BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_generated_prompt();
//        Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        Thread.sleep(1000);
//
//
//        // Click Copy button (copies AI text to clipboard, does NOT insert into editor)
//        BaseClass.quire_AI().click_quire_AI_copy_text_button();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().click_cancel_quire_AI_prompt();
//        Thread.sleep(500);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Now paste the copied AI text into the editor manually
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        BaseClass.quire_AI().paste_text_body();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Verify the pasted AI text appears in the editor
//        BaseClass.quire_AI().verify_quire_AI_summarize_titlePage_inserted_text();
//        Thread.sleep(500);
//
//        // Revert Title Page changes
//        BaseClass.staging5().click_title_page_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // ========== TEST 3: Content Assistant > Suggest References ==========
//        // Test AI Suggest References feature in Executive Summary intro page
//        BaseClass.staging5().click_executive_summary_sectionView();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickAddContentRow_introPages();
//        Thread.sleep(1000);
//
//        // Switch to editor iframe and select all text
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        // Open AI toolbar and click Content Assistant > Suggest References
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_contentAssistant_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_suggest_references_button();
//        Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        Thread.sleep(5000);
//
//        // Verify reference suggestions appear
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_suggest_references_generated_prompt();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//
//        // Replace text with suggested references
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Verify the references persist in intro page
//        BaseClass.quire_AI().verify_quire_AI_suggest_references_inserted_text();
//        Thread.sleep(500);
//
//        // Revert Executive Summary changes
//        BaseClass.staging5().click_executive_summary_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_intro_pages_content_editor_revisions_icon();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(2000);
//
////         ========== TEST 4: Adjust Content Tone > Technical ==========
////         Test AI Tone Adjustment - converts text to technical tone in Default Section SmartTable
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//
//        // Click on the specific SmartTable cell with text to convert
//        BaseClass.quire_AI().click_smartTable_cell_text_to_select();
//        Thread.sleep(1000);
//
//        // Switch to SmartTable editor iframe and select all text
//        BaseClass.quire_AI().switch_to_ck4_editor_iframe();
//        Thread.sleep(1000);
//        BaseClass.quire_AI().select_all_text_body();
//        driver.switchTo().defaultContent();
//
//        // Open AI toolbar and click Adjust Content Tone > Technical
//        BaseClass.quire_AI().click_quire_AI_icon();
//        Thread.sleep(500);
//        BaseClass.quire_AI().switch_to_ck4_AI_toolbar_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_adjustContentTone_header_button();
//        Thread.sleep(500);
//        BaseClass.quire_AI().click_quire_AI_dropDown_technical_tone_button();
//        Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        Thread.sleep(5000);
//
//        // Verify technical tone content appears
//        BaseClass.quire_AI().switch_to_quire_AI_prompt_iframe();
//        Thread.sleep(500);
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_generated_prompt();
//        driver.switchTo().defaultContent();
//        Thread.sleep(500);
//
//        // Replace text with technical tone version
//        BaseClass.quire_AI().click_quire_AI_replace_button();
//        Thread.sleep(500);
//        BaseClass.staging5().acceptAlert();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//        // Verify the technical tone text persists in SmartTable
//        BaseClass.quire_AI().verify_quire_AI_technical_tone_inserted_text();
//        Thread.sleep(1000);
//
//        // Revert Default Section SmartTable changes
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_revisions_icon_second();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_revert_button_secondLink();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_pixel_out_of_section();
//        Thread.sleep(1000);
//
//    }



}





