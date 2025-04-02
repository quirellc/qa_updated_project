import Quire_POM.BaseClass;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.relevantcodes.extentreports.LogStatus;
import okhttp3.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
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
import java.time.Duration;
import java.time.Instant;


public class Regression2 extends ReusableAnnotations {
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
                        BaseClass.quireLogin().enter_sysadmin_testingInc_email();
                } else if (baseUrl.contains("app")) {
                        BaseClass.quireLogin().enterProdEmail();
                }

                Thread.sleep(1000);
                BaseClass.quireLogin().enterPassword();
                Thread.sleep(1000);
                BaseClass.quireLogin().clickLogin();
                Thread.sleep(3000);
        }
        @Test
        public void TR018_Spellcheck_trackChanges_ck4() throws InterruptedException {
                WebDriver driver = getDriver();

                //navigate to empty report-automation testing report
                driver.navigate().to("https://app.openquire.com/reports/1379930");
                Thread.sleep(500);
                BaseClass.staging5().captureURL();
                Thread.sleep(500);
                BaseClass.staging5().click_and_capture_track_changes_button();
                Thread.sleep(1000);


                // go to section 1 and type spellcheck error text
        BaseClass.staging5().click_Section2_row_editor();
                Thread.sleep(5000);
                BaseClass.ck5editor().enter_sc_text_body_ck5();
                Thread.sleep(50000);
                BaseClass.staging5().click_default_section_title();
                Thread.sleep(500);

                BaseClass.ck5editor().click_current_section_TC_highlight();
                Thread.sleep(1000);

                BaseClass.ck5editor().click_accept_TC_suggestion();
                Thread.sleep(500);

                BaseClass.staging5().click_and_capture_spell_check_button();
                Thread.sleep(500);
                BaseClass.staging5().capture_spellCheck_error_sections();
                Thread.sleep(2000);
                BaseClass.staging5().fix_all_spellCheck_errors_sanity();
                Thread.sleep(500);

        BaseClass.staging5().click_Section2_row_editor();
                Thread.sleep(500);

                BaseClass.ck5editor().select_all_and_backspace_sc_tc_section();
//
//                //track changes delete section - red - section 1
//
//                BaseClass.staging5().clickSection_row_editor();
//
//                BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//                Thread.sleep(500);
//                BaseClass.templatesSection().select_all_and_backspace_Section_section_row_iFrame();
//                Thread.sleep(500);
//                driver.switchTo().defaultContent();
//                Thread.sleep(500);
               // BaseClass.staging5().click_section_1_header();
               // Thread.sleep(500);
//
//                //verify green and red track change showing
////        BaseClass.staging5().verify_green_tracked_changes_is_Visible();
////        Thread.sleep(500);
                BaseClass.ck5editor().click_TC_red_highlight();
                Thread.sleep(500);
//                //delete section 1 by accepting red cross change
//
              //  BaseClass.staging5().click_Section2_row_editor();
               // Thread.sleep(500);
                BaseClass.ck5editor().click_accept_TC_suggestion();
                Thread.sleep(500);
                BaseClass.staging5().click_section_2_header();
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
//        @Test
//        public void TR_006a_Headers_Footers() throws InterruptedException, IOException {
////not adding in report, doing to template
//
////                BaseClass.reportfoldersection().clickReportsTab();
////        BaseClass.reportfoldersection().enterSearchField_QA_Report();
////        Thread.sleep(4500);
////        BaseClass.reportfoldersection().clickReportsFirstLink();
////        Thread.sleep(1000);
////        BaseClass.projectFolderSection().click_projectFolderLink_MediumPriority();
////        Thread.sleep(1000);
////        BaseClass.reportfoldersection().clickReportsFirstLink();
//
//
////        //in proj folder, click add new report button
////        BaseClass.reportfoldersection().clickAddReportButton();
////        //new report name and info
////        BaseClass.reportfoldersection().enterReportName_QA_Medium_Priority_Report_Field();
////
////        BaseClass.reportfoldersection().enterReportDescriptionField();
////        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
////        Thread.sleep(2500);
////        BaseClass.reportfoldersection().clickDropdownItem();
////        Thread.sleep(1000);
////        BaseClass.reportfoldersection().clickSave();
////        Thread.sleep(3000);
//////capture alert message fore template created
////        BaseClass.templatesSection().capture_created_AlertMessage();
////        BaseClass.templatesSection().clickHereLinkReport();
////        Thread.sleep(3000);
//
//                //click template settings button
////                BaseClass.templatesSection().clickTemplateSettingsButton();
////
////
////                //click header tab
////                BaseClass.reportfoldersection().clickHeaderTab_ReportSettings();
////                Thread.sleep(500);
//////left header textbox - insert report tag
////                BaseClass.reportfoldersection().click_left_header_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_header_reportTag_ReportSettings();
////                Thread.sleep(500);
//////center header textbox - insert month variable tag
////                BaseClass.reportfoldersection().click_center_header_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_month_variable_dropdown_ReportSettings();
////                Thread.sleep(500);
////                //right header textbox - insert text
////                BaseClass.reportfoldersection().enter_right_header_textBox_ReportSettings();
////                Thread.sleep(500);
////
////                //click footer tab
////                BaseClass.reportfoldersection().clickfooterTab_ReportSettings();
////                Thread.sleep(500);
//////left footer textbox - insert report tag
////                BaseClass.reportfoldersection().click_left_footer_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_footer_reportTag_ReportSettings();
////                Thread.sleep(500);
//////center footer textbox - insert year variable tag
////                BaseClass.reportfoldersection().click_center_footer_textBox_ReportSettings();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().select_year_variable_dropdown_ReportSettings();
////                Thread.sleep(500);
////                //right footer textbox - insert text
////
////                BaseClass.reportfoldersection().enter_right_footer_textBox_ReportSettings();
////                Thread.sleep(500);
////                //click s ave button
////                BaseClass.staging5().click_save_button();
////                Thread.sleep(1000);
////
////                //quick preview button in next tab
////                BaseClass.reportfoldersection().click_quick_preview_button();
////                Thread.sleep(1000);
////                BaseClass.reportfoldersection().change_to_next_tab();
////                Thread.sleep(500);
////
////                //quick preview tab - capture header and footer data
////                BaseClass.reportfoldersection().verify_header_section_quickPreview();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().verify_footer_section_quickPreview();
////                Thread.sleep(500);
//                WebDriver driver = getDriver();
////
//////close second tab and go back to default tab
////                driver.close();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().change_to_default_tab();
////
////
////                Thread.sleep(500);
////generate pdf and capture alert message
////                BaseClass.reportfoldersection().clickRegeneratePDFButton();
////                Thread.sleep(500);
////                BaseClass.reportfoldersection().captureAlertMessage();
////                Thread.sleep(3000);
//                //capture and click generated pdf
//
//                BaseClass.reportfoldersection().captureGeneratedPDF_text();
//               // BaseClass.reportfoldersection().click_GeneratedPDF_button();
//
////verify if header and footer has contents expected
//                BaseClass.staging5().verify_header_footer_PDF_contents();
//                Thread.sleep(500);
//                //close second tab and go to default tab
//
//                Thread.sleep(6000);
//
//
////        BaseClass.staging5().click_export_to_excel_fm1105();
////        Thread.sleep(500);
////        BaseClass.templatesSection().captureAlertMessage();
////        Thread.sleep(500);
////        BaseClass.staging5().click_cancel_alert_message();
////        Thread.sleep(500);
////        BaseClass.staging5().click_export_pdf_button();
////        Thread.sleep(500);
////        BaseClass.templatesSection().captureAlertMessage();
////        Thread.sleep(500);
////        BaseClass.staging5().click_cancel_alert_message();
////        Thread.sleep(500);
//
//        }
}








