import Quire_POM.BaseClass;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Regression3 extends ReusableAnnotations {
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

 public void TR_001_User_Login_r3() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
//
  WebDriver driver1 = getDriver();

  driver1.navigate().to("https://staging5.openquire.com");
  BaseClass.quireLogin().enterEmail_bv_admin_level();
  BaseClass.quireLogin().enterPassword();
  BaseClass.quireLogin().clickLogin();
 }

 @Test
 public void TR_002_createTemplate_r3() throws InterruptedException {

  //create ck5 template
  BaseClass.templatesSection().clickTemplatesTab();
  Thread.sleep(500);
  BaseClass.templatesSection().clickAddTemplateButton();
  Thread.sleep(500);
  BaseClass.templatesSection().enterTemplateNameField_new_ck5();
  Thread.sleep(500);
  BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
  Thread.sleep(1000);
// new ck5 feature enabled will make all templates/reports in ck5
  //     BaseClass.ck5editor().select_ck5_report_dropdown();
  //     Thread.sleep(500);

  BaseClass.templatesSection().enterTemplateDescriptionField();
  Thread.sleep(500);
  BaseClass.templatesSection().clickSave();
  Thread.sleep(4000);
  BaseClass.templatesSection().captureAlertMessage();
  BaseClass.templatesSection().clickHereLinkTemplate();
  Thread.sleep(1000);

 }




 }
// @Test
// public void TR_001_user_login() throws InterruptedException, IOException {
//  String currentMonth = getCurrentMonth();
//  String previousMonth = getPreviousMonth();
//
//
////  logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
//  driver.navigate().to("https://app.openquire.com/company_usage_reports?month=" + currentMonth + "&year=2024");
//  Thread.sleep(1000);
//
////
////  String pageTitle = driver.getTitle();
////  if (pageTitle.contains("OpenQuire")) {
//  BaseClass.quireLogin().enterRootUserEmail();
//  Thread.sleep(1000);
//  BaseClass.quireLogin().enterPassword();
//  Thread.sleep(1000);
//  BaseClass.quireLogin().clickLogin();
//  Thread.sleep(1000);
//  BaseClass.staging5().captureURL();
//  Thread.sleep(20000);
//  BaseClass.staging5().click_export_to_excel();
//  BaseClass.templatesSection().verify_excel_AlertMessage();
//  BaseClass.staging5().click_active_notification_button();
//  Thread.sleep(500);
//  BaseClass.staging5().mark_all_as_read();
//  Thread.sleep(20000);
//  driver.navigate().refresh();
//  BaseClass.staging5().click_active_notification_button();
//
//  BaseClass.staging5().open_company_usage_reports_link();
//  Thread.sleep(500);
//
//  driver.navigate().to("https://app.openquire.com/company_usage_reports?month=" + previousMonth + "&year=2024");
//  Thread.sleep(1000);
//
//  BaseClass.staging5().captureURL();
//  Thread.sleep(20000);
//  BaseClass.staging5().click_export_to_excel();
//  BaseClass.templatesSection().verify_excel_AlertMessage();
//  BaseClass.staging5().click_active_notification_button();
//  Thread.sleep(500);
//  BaseClass.staging5().mark_all_as_read();
//  Thread.sleep(20000);
//  driver.navigate().refresh();
//  BaseClass.staging5().click_active_notification_button();
//
//  BaseClass.staging5().open_company_usage_reports_link();
//  Thread.sleep(500);
//
// }

//  } else {
//   System.out.println("\n" + "Already logged in. Skipping login steps.");
//   Thread.sleep(3000);
//  }
//
//  @Test
//  public void TR_002_gmail_login() throws InterruptedException, IOException {
//
//
//   driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
//   Thread.sleep(500);
//   BaseClass.quireLogin().enter_gmail_ID();
//   BaseClass.quireLogin().enter_gmail_pw();
//   BaseClass.quireLogin().click_compose_email();
//   BaseClass.quireLogin().enter_recipient_email();
//   BaseClass.quireLogin().enter_subject_text();
//
//   Thread.sleep(1000);
//
//   BaseClass.quireLogin().enter_body_text();
//   Thread.sleep(3000);
//
//   BaseClass.quireLogin().upload_gmail_file_attachment();
//   Thread.sleep(1000);
//
//   BaseClass.quireLogin().click_send_button();
//
//
// }

// @Test
// public void TR_002_test() throws InterruptedException, IOException {
//  driver.navigate().to("https://app.openquire.com/portfolios/3891");
// Thread.sleep(500);
//  BaseClass.staging5().mark_all_notifications_as_read();
//  //change to default view
//  BaseClass.staging5().click_change_porfolio_view_button();
//  Thread.sleep(1000);
//  BaseClass.staging5().select_porfolio_view_default();
//  Thread.sleep(500);
//  BaseClass.staging5().click_save_button();
//  Thread.sleep(1500);
//  BaseClass.staging5().select_template_dropdown_pca_elise();
//  Thread.sleep(2500);
//  BaseClass.staging5().click_export_to_excel_fm1105();
//  Thread.sleep(500);
//  BaseClass.templatesSection().captureAlertMessage();
//  Thread.sleep(500);
//  BaseClass.staging5().click_cancel_alert_message();
//  Thread.sleep(500);
//  BaseClass.staging5().click_export_pdf_button();
//  Thread.sleep(500);
//  BaseClass.templatesSection().captureAlertMessage();
//  Thread.sleep(500);
//  BaseClass.staging5().click_cancel_alert_message();
//  Thread.sleep(500);
////click notification icon and click first link, and open new tab with link
//  BaseClass.staging5().click_active_notification_button();
//  Thread.sleep(500);
// // BaseClass.staging5().mark_all_as_read();
//  Thread.sleep(6000);
//  BaseClass.staging5().open_jenTest_pdf_notification_link();
//  Thread.sleep(500);
//  BaseClass.staging5().verify_report_names_from_portfolio_PDF();
//  Thread.sleep(500);
// }

