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
    public void TC01_login() throws InterruptedException {
    	WebDriver driver = getDriver();
//    driver.navigate().to("https://app.openquire.com/reports/1025962");
        driver.navigate().to("https://staging5.openquire.com/");
        Thread.sleep(600);

        BaseClass.quireLogin().enter_sysadmin_testingInc_email();
        Thread.sleep(600);
        //   BaseClass.quireLogin().clickNextButton();
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(600);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(2000);
    }

    @Test
    public void TC02_delete_generated_automation_reports() throws InterruptedException {


        BaseClass.staging5().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        BaseClass.reportfoldersection().clickReportsFirstLink();

        BaseClass.projectFolderSection().click_PCA_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);

        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(3000);

        BaseClass.projectFolderSection().click_ESA_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.projectFolderSection().click_SRA_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);
//
//        BaseClass.projectFolderSection().click_ZON_ProjectFolderLink();
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(200);
//        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(500);

        BaseClass.projectFolderSection().click_CK5_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.projectFolderSection().click_FM_1104_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);


        BaseClass.projectFolderSection().click_medium_priority_ProjectFolderLink();
        BaseClass.projectFolderSection().click_projectFolderSettings_button();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

    }
        @Test
        public void TC02_delete_generated_automation_templates() throws InterruptedException {
        // templates delete

        BaseClass.templatesSection().clickTemplatesTab();
        BaseClass.templatesSection().enterTemplateSearchField_PCA();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.templatesSection().enterTemplateSearchField_SRA();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.templatesSection().enterTemplateSearchField_ZON();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.templatesSection().enterTemplateSearchField_ck5();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        BaseClass.templatesSection().enterTemplateSearchField_FM_1104();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
        Thread.sleep(1000);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);


        BaseClass.templatesSection().enterTemplateSearchField_FM_1105();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);



        BaseClass.templatesSection().enterTemplateSearchField_cloned_FM_1105();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();
        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);

            BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(1000);



        BaseClass.templatesSection().enterTemplateSearchField_updated_medium();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();
        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);

            BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(1000);

            BaseClass.templatesSection().enterTemplateSearchField_cloned_medium();
            Thread.sleep(1000);

            BaseClass.pca_xml_section().clickFirstTemplateLink();
            BaseClass.templatesSection().clickTemplateSettingsButton();
            BaseClass.templatesSection().clickdeleteToTrash();
            Thread.sleep(200);

            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(1000);
            BaseClass.staging5().click_cancel_alert_message();
            Thread.sleep(1000);
}
    @Test
    public void TC03_delete_wb_items() throws InterruptedException {

        BaseClass.staging5().clickLibrariesTab();
        BaseClass.staging5().click_librariesTab_wordBankDropdown();
        Thread.sleep(600);
        BaseClass.templatesSection().enterSearchField_QA_WB();
        Thread.sleep(3000);
        BaseClass.staging5().click_wordbank_items_filtered();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().click_delete_selected_items();
        Thread.sleep(500);
        WebDriver driver = getDriver();
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

    }

    @Test
    public void TC04_permanently_delete_trash_items() throws InterruptedException {
        Thread.sleep(1500);

        BaseClass.staging5().click_view_trash_button();
        Thread.sleep(1500);
        BaseClass.staging5().clickDeletePermanentlyButton_AllItems();
        Thread.sleep(1000);

    }
    }

