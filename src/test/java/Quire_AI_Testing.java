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
 public void TR0001_user_login() throws InterruptedException {
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
   BaseClass.quireLogin().enter_cbre_sysadmin_Email();
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
//
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
public void TR_002_API_Testing() throws InterruptedException {
 WebDriver driver = getDriver();
BaseClass.quire_AI().click_quire_AI_search_field();
 BaseClass.quire_AI().verify_quire_AI_prompt_text();
 BaseClass.quire_AI().enter_quire_AI_prompt_search_field();
 BaseClass.quire_AI().click_quire_AI_filter_button();

 BaseClass.quire_AI().click_quire_AI_status_field();
 Thread.sleep(2000);

 BaseClass.quire_AI().confirm_quire_AI_status_value();
 BaseClass.quire_AI().click_writing_status_dropdown();
 BaseClass.quire_AI().click_quire_AI_search_button();
 Thread.sleep(5000);
 BaseClass.quire_AI().hover_quire_AI_first_search_result();


 Thread.sleep(2000);
 BaseClass.quire_AI().confirm_report_opened_new_tab();
 BaseClass.quire_AI().click_ask_quire_button();

 Thread.sleep(2000);

 BaseClass.quire_AI().click_AI_chat_back_button();
 Thread.sleep(500);

 BaseClass.quire_AI().verify_AI_intro_chat_body();
// Thread.sleep(500);
// BaseClass.quire_AI().verify_AI_intro_chat_body();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_continue_conversation_button();
 Thread.sleep(500);
 BaseClass.quire_AI().verify_AI_chat_create_summary_response();
 Thread.sleep(500);
 BaseClass.quire_AI().click_quire_AI_create_summary_button();
 Thread.sleep(2000);
 BaseClass.quire_AI().verify_AI_chat_response_text();
 Thread.sleep(2000);

}

 }





