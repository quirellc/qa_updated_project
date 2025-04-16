import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import reusableLibrary.ReusableAnnotations;

import java.util.List;


public class Regression1 extends ReusableAnnotations {

    @Test
    public void TC001_user_login() throws InterruptedException {
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
            BaseClass.quireLogin().enterProdEmail();
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
    }

    @Test
    public void TC002_delete_generated_automation_reports() throws InterruptedException {

        BaseClass.staging5().clickReportsTab();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(1000);
        BaseClass.templatesSection().delete_automation_folders();
        Thread.sleep(1000);
//
//        BaseClass.staging5().clickReportsTab();
//        BaseClass.reportfoldersection().enterSearchField_QA_Report();
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//
//        BaseClass.projectFolderSection().click_PCA_ProjectFolderLink();
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(200);
//
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(3000);
//
//        BaseClass.projectFolderSection().click_ESA_ProjectFolderLink();
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.projectFolderSection().click_SRA_ProjectFolderLink();
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
////
////        BaseClass.projectFolderSection().click_ZON_ProjectFolderLink();
////        BaseClass.projectFolderSection().click_projectFolderSettings_button();
////        BaseClass.templatesSection().clickdeleteToTrash();
////        Thread.sleep(200);
////        BaseClass.staging5().captureAlertMessage();
////        Thread.sleep(500);
//
//        BaseClass.projectFolderSection().click_CK5_ProjectFolderLink();
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//
//        BaseClass.projectFolderSection().click_medium_priority_ProjectFolderLink();
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);

    }

    @Test
    public void TC003_delete_generated_automation_templates() throws InterruptedException {

        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(1000);
        BaseClass.templatesSection().delete_automation_templates();
        Thread.sleep(1000);
        // templates delete

//        BaseClass.templatesSection().clickTemplatesTab();
//        BaseClass.templatesSection().enterTemplateSearchField_PCA();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().enterTemplateSearchField_SRA();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().enterTemplateSearchField_ZON();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().enterTemplateSearchField_ck5();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//        BaseClass.templatesSection().enterTemplateSearchField_FM_1104();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(1000);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//
//        BaseClass.templatesSection().enterTemplateSearchField_FM_1105();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);
//
//
//
//        BaseClass.templatesSection().enterTemplateSearchField_cloned_FM_1105();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//
//            BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_cancel_alert_message();
//        Thread.sleep(1000);
//
//
//
//        BaseClass.templatesSection().enterTemplateSearchField_updated_medium();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//
//            BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_cancel_alert_message();
//        Thread.sleep(1000);
//
//            BaseClass.templatesSection().enterTemplateSearchField_cloned_medium();
//            Thread.sleep(1000);
//
//            BaseClass.pca_xml_section().clickFirstTemplateLink();
//            BaseClass.templatesSection().clickTemplateSettingsButton();
//            BaseClass.templatesSection().clickdeleteToTrash();
//            Thread.sleep(200);
//
//            BaseClass.staging5().captureAlertMessage();
//            Thread.sleep(1000);
//            BaseClass.staging5().click_cancel_alert_message();
//            Thread.sleep(1000);
    }

    @Test
    public void TC03_delete_wb_items() throws InterruptedException {

        BaseClass.staging5().clickLibrariesTab();
        BaseClass.staging5().click_librariesTab_wordBankDropdown();
        Thread.sleep(600);
        BaseClass.templatesSection().enterSearchField_QA_WB();
        Thread.sleep(3000);
        BaseClass.staging5().delete_QA_WB_items();
        Thread.sleep(1000);

    }
//
//    @Test
//    public void TC04_permanently_delete_trash_items() throws InterruptedException {
//        Thread.sleep(1500);
//
//        BaseClass.staging5().click_view_trash_button();
//        Thread.sleep(1500);
//        BaseClass.staging5().clickDeletePermanentlyButton_AllItems();
//        Thread.sleep(1000);
//
//    }
    }


