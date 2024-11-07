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
    //  String browserName = driver.getClass().getSimpleName();
    //  String browserName1 = driver.getClass().getName();


    @Test
    public void TR_001_FM1104_new_cloned_template_and_report() throws InterruptedException {
        WebDriver driver = getDriver();
    //    driver.navigate().to("https://staging5.openquire.com/reports/666396");

      //  String pageTitle = driver.getTitle();
        driver.navigate().to("https://staging5.openquire.com/");

            BaseClass.quireLogin().enter_admin_Email();
            Thread.sleep(1000);
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();
            Thread.sleep(1000);


//
//        //DELETE Header R1 and R2
//        BaseClass.staging5().click_r1_header();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1_header_smartTable - after escape is clicked
//        BaseClass.staging5().rightClick_r1_header_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.staging5().click_delete_row_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_r1_header_is_empty();
//        Thread.sleep(500);
//
//
////delete header row 1 again
//        BaseClass.staging5().click_r1_header();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe
//        BaseClass.templatesSection().switchTo_instruction_text_ck5_iFrame();
//        Thread.sleep(500);
////switch r1c5 dynamic cell to iframe - to click escape button
//        BaseClass.templatesSection().click_escape_cell_iFrame();
//        Thread.sleep(500);
//        driver.switchTo().parentFrame();
//        Thread.sleep(500);
//        //right click r1_header_smartTable - after escape is clicked
//        BaseClass.staging5().rightClick_r1_header_smartTable();
//        Thread.sleep(500);
//        // dynamic cell - after right click - click insert row above
//        BaseClass.staging5().click_delete_row_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_r1_header_is_empty();
//        Thread.sleep(500);

//        Scenario 4
//        No existing unresolved or resolved comments
//        Add 2 new comments
//        Refresh page
//        Resolve both comments added in step 2
//        Refresh page
//        Reopen both comments resolved in step 5



        Thread.sleep(30000);

        //   Thread.sleep(2500);







//        BaseClass.staging5().click_coverLetter_sectionView();
//        Thread.sleep(500);
//
//        //check revision history
//        BaseClass.staging5().click_intro_pages_revisions_icon();
//        //NOT WORKING
//        BaseClass.staging5().capture_revisions_history();
//       // BaseClass.staging5().click_cancel_button_popup();
//        Thread.sleep(500);
//
//       // BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
//      //  Thread.sleep(500);
//        BaseClass.staging5().click_out_of_section();
//
//        Thread.sleep(500);

    }




        //NOT WORKING
//add wordbank assigned item to cell
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_row5_richText();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_insert_wordbank_arrow_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        //not working 9-10-24
//     //   BaseClass.staging5().verify_green_highlighted_wb_item_is_Visible();
//        Thread.sleep(1500);
//        BaseClass.staging5().click_row5_richText();
//        Thread.sleep(1000);

    //NOT NEEDED
//        //export to excel from smart table actions
//        BaseClass.staging5().click_smartTable_actions_button();
//        Thread.sleep(500);
//        BaseClass.staging5().click_export_to_excel_file_dropdown_button();
//        Thread.sleep(500);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_smartTable_sectionView();
//        Thread.sleep(500);



        //unlink - section link
        //NOT WORKING
//        BaseClass.staging5().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().doubleclick_linked_section_text();
//        Thread.sleep(500);
//        BaseClass.staging5().click_unlink_button_sectionLinkView();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        BaseClass.staging5().click_row4_richText();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_linked_sectionLink_isNot_visible();
//        Thread.sleep(500);
//        BaseClass.staging5().click_smartTable_title_header();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().click_quick_preview_button();
//        Thread.sleep(1500);
//        BaseClass.reportfoldersection().change_to_next_tab();
//        Thread.sleep(500);
//        BaseClass.staging5().verify_quickPreview_linked_section_isNot_visible();
//        driver.close();
//        BaseClass.reportfoldersection().change_to_default_tab();
//        Thread.sleep(500);
    }








