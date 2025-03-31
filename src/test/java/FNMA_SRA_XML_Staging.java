import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;

//  new
// new
public class FNMA_SRA_XML_Staging extends ReusableAnnotations {
//	WebDriver driver = getDriver();
@Test
public void TR001_user_login() throws InterruptedException {
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
    public void TR002_SRA_Template_ProjectFolder_Report_Creation() throws InterruptedException {
        //create new template - name it SRA
        BaseClass.templatesSection().clickTemplatesTab();
        BaseClass.templatesSection().clickAddTemplateButton();
        BaseClass.templatesSection().enterTemplateNameField_SRA();
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(1000);


        BaseClass.templatesSection().enterTemplateDescriptionField();
        BaseClass.templatesSection().clickSave();
        Thread.sleep(3000);

        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.templatesSection().clickHereLinkTemplate();
        Thread.sleep(2000);

        //add esa package settings to newly created template

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickTemplateSettings_PackagesTab();
        Thread.sleep(1000);
        BaseClass.templatesSection().enterTemplateSettings_PackagesTab_SearchField_SRA();

        BaseClass.templatesSection().clickTemplateSettings_PackagesTab_clickFirstDropDownItem();
        Thread.sleep(1000);
        BaseClass.templatesSection().clickTemplateSettings_PackagesTab_addPackage_button();
        Thread.sleep(1000);


        BaseClass.templatesSection().clickTemplateSettings_SaveButton();

        //add refresh for semaphore   for  if save button gets stuck

        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(500);

        //add sections and remove



        //Go into to QA Automation Parent folder


        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(3500);

        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(500);


        // create new project folder with SRA templete created from previous step
        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        BaseClass.projectFolderSection().enterProjectFolderNameField_SRA();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdown
        Thread.sleep(2000);
        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(2000);

        BaseClass.projectFolderSection().click_SRA_Template_projectFolder_templatesTab();
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(2000);

        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(2000);

        BaseClass.projectFolderSection().click_SRA_ProjectFolderLink();

        Thread.sleep(2000);

        // create new SRA report folder inside SRA project folder w SRA template

        BaseClass.reportfoldersection().clickAddReportButton();
        BaseClass.reportfoldersection().enterReportName_QA_SRA_Field();
        BaseClass.reportfoldersection().enterReportDescriptionField();
        Thread.sleep(1000);

        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
        Thread.sleep(1500);

        BaseClass.reportfoldersection().clickDropdownItem();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(3000);
        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(1000);


    }

    @Test
    public void TR003_SRA_XML_Package() throws InterruptedException {


        //add sra xml subsection
        BaseClass.sra_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.sra_xml_section().clickAddSRAXMLPackage_toSection();
        Thread.sleep(1000);
        WebDriver driver = getDriver();

        //refresh to see sra in section view
        driver.navigate().refresh();


        //add sra xml details

        BaseClass.sra_xml_section().clickSectionView_SRA_XML();
        Thread.sleep(1500);

        BaseClass.sra_xml_section().enterDealIdentifier();
        BaseClass.pca_xml_section().select_ClientName_DUS_Lender();
        BaseClass.pca_xml_section().enter_thirdParty_requestor_name();
        BaseClass.sra_xml_section().enterThirdParty_signatory_name();
        BaseClass.sra_xml_section().enterThirdPartyAssessorName();
        BaseClass.pca_xml_section().enter_third_Party_ReportSignature_Date();
        BaseClass.sra_xml_section().selectThirdPartyReport_ScopeStandard();
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().scrollto_property_location_section();
        Thread.sleep(1500);
        BaseClass.pca_xml_section().clickProjectStreetAddress_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectStreetAddress_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);

        BaseClass.pca_xml_section().clickProjectCity_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectCity_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);

        BaseClass.pca_xml_section().clickProjectState_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectState_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);

        BaseClass.pca_xml_section().clickProjectZip_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectZip_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);

        BaseClass.pca_xml_section().clickSiteCounty_ReportTagButton();
        BaseClass.pca_xml_section().enterSiteCounty_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);

        BaseClass.esa_xml_section().enterYearBuilt();
        Thread.sleep(500);

        BaseClass.pca_xml_section().clickTotalNumberofAptBuildings_ReportTagButton();
        BaseClass.pca_xml_section().enterTotalNumberofAptBuildings_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);

        BaseClass.pca_xml_section().clickNumberOfStories_ReportTagButton();
        BaseClass.pca_xml_section().enterNumberOfStories_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(1000);

        BaseClass.sra_xml_section().enterOccupancyPercentage_ReportTag();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(500);

      //  BaseClass.sra_xml_section().enterNumber_of_other_buildings();

        BaseClass.sra_xml_section().clickForm_4099c_indicator_checkBox();
        BaseClass.sra_xml_section().enterSeismicRisk_Assessment_Date();
        BaseClass.sra_xml_section().selectUse_of_ground_floor_dropdown();
        BaseClass.sra_xml_section().selectMultifamily_Building_Construction_Type();
        BaseClass.sra_xml_section().selectOther_construction_type();
        BaseClass.sra_xml_section().selectSite_soil_class();
        BaseClass.sra_xml_section().enterPga_gravity_percent();
        BaseClass.sra_xml_section().selectMercali_intensity();
        BaseClass.sra_xml_section().selectSurface_fault_potential();
        BaseClass.sra_xml_section().selectLiquefaction_potential();
        BaseClass.sra_xml_section().selectLandslide_potential();

        BaseClass.sra_xml_section().selectTsunami_inundation_potential();
        BaseClass.sra_xml_section().selectSeiche_failure_potential();
        BaseClass.sra_xml_section().enterPml_sel_475_mf_building();
        BaseClass.sra_xml_section().enterPml_sel_475_property();
     //   BaseClass.sra_xml_section().enterPml_sel_475_otherBuilding();
        BaseClass.sra_xml_section().clickBuilding_20percent_checkbox();
        BaseClass.sra_xml_section().enterPml_sul_475_mf_building();
      //  BaseClass.sra_xml_section().enterPml_sul_475_otherBuilding();
        BaseClass.sra_xml_section().enterPml_sul_475_property();
        BaseClass.sra_xml_section().acceptable_building_stability_checkbox();
        BaseClass.sra_xml_section().enterBuilding_code();

        BaseClass.sra_xml_section().selectShortColumn();
        BaseClass.sra_xml_section().selectTiltUpAnchoring();


        Thread.sleep(1000);
        BaseClass.esa_xml_section().clickGenerateXMLButton();
        Thread.sleep(6000);
        BaseClass.zon_xml_section().getXMLButtonText();
        Thread.sleep(2000);
        BaseClass.pca_xml_section().downloadGeneratedXML_ZIP();
        Thread.sleep(6000);
        BaseClass.staging5().unZip_SRA_XML_Folder();
        Thread.sleep(6000);
        BaseClass.staging5().capture_SRA_version_from_XML();
        Thread.sleep(5000);
    }

//    @Test
//    public void TR004_delete_SRA_XML_Package() throws InterruptedException {
//
//        BaseClass.templatesSection().clickTemplatesTab();
//        Thread.sleep(1000);
//
//        BaseClass.reportfoldersection().enterSearchField_SRA_Report();
//        Thread.sleep(3000);
//
//        BaseClass.staging5().click_delete_templates_to_trash();
////
////
////        BaseClass.reportfoldersection().clickReportsFirstLink();
////        Thread.sleep(1000);
////        BaseClass.templatesSection().clickTemplateSettingsButton();
////
////        BaseClass.templatesSection().clickdeleteToTrash();
////        Thread.sleep(2000);
//
//        BaseClass.reportfoldersection().clickReportsTab();
//        Thread.sleep(1000);
//
//        BaseClass.reportfoldersection().enterSearchField_QA_Report();
//        Thread.sleep(2000);
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(2000);
//        //click first project folder button
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(1000);
//
//
//        BaseClass.projectFolderSection().click_projectFolderSettings_button();
//        Thread.sleep(2000);
//
//        BaseClass.templatesSection().clickdeleteToTrash();
//
//        Thread.sleep(2000);
//
//    }
//    @Test
//    public void TR005_permanently_delete_trash_items() throws InterruptedException {
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_viewTrash_dropdownItem();
//        Thread.sleep(3000);
//
//        BaseClass.reportfoldersection().enterSearchField_ibrar();
//        Thread.sleep(3000);
//
//       BaseClass.staging5().clickDeletePermanentlyButton_AllItems();
//        Thread.sleep(800);
//
//    }

}

