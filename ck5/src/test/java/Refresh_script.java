import Quire_POM.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;


public class Refresh_script extends ReusableAnnotations {
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
   BaseClass.quireLogin().enter_admin_Email();
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
public void TR_015_ck5_packages_ProjSummary_section() throws InterruptedException {
 WebDriver driver = getDriver();
 if (baseUrl.contains("staging5")) {
  driver.navigate().to("https://staging5.openquire.com/folders/275681/projects/328759");
 } else if (baseUrl.contains("staging3")) {
  driver.navigate().to("https://staging3.openquire.com/folders/545421/projects/601025");
 } else if (baseUrl.contains("app")) {
  driver.navigate().to("https://app.openquire.com/projects/658267");
 }

 Thread.sleep(500);
 BaseClass.staging5().click_modal_close_window();
 Thread.sleep(500);

 BaseClass.reportfoldersection().ck5PackagesCheck();
 Thread.sleep(500);

}

 }





