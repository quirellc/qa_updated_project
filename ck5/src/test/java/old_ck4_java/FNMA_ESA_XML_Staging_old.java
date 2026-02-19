package old_ck4_java;

import Quire_POM.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;


public class FNMA_ESA_XML_Staging_old extends ReusableAnnotations {
	WebDriver driver = getDriver();
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
    public void TR002_ESA_Template_ProjectFolder_Report_Creation() throws InterruptedException {

        //create esa template
//        BaseClass.templatesSection().clickTemplatesTab();
//        BaseClass.templatesSection().clickAddTemplateButton();
//        BaseClass.templatesSection().enterTemplateNameField_ESA();
//        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
//        Thread.sleep(1000);
//
//
//        Thread.sleep(1000);
//        BaseClass.templatesSection().enterTemplateDescriptionField();
//        BaseClass.templatesSection().clickSave();
//        Thread.sleep(2500);
//
//        BaseClass.templatesSection().capture_created_AlertMessage();
//        BaseClass.templatesSection().clickHereLinkTemplate();
//        Thread.sleep(1000);
//
//
//        //add esa package settings to newly created template
//
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//        BaseClass.templatesSection().clickTemplateSettings_PackagesTab();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().enterTemplateSettings_PackagesTab_SearchField_ESA();
//
//        BaseClass.templatesSection().clickTemplateSettings_PackagesTab_clickFirstDropDownItem();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickTemplateSettings_PackagesTab_addPackage_button();
//        Thread.sleep(1000);
//
//
//        BaseClass.templatesSection().clickTemplateSettings_SaveButton();
//
//        Thread.sleep(1000);


        //Go into to QA Automation Parent folders1


        BaseClass.reportfoldersection().clickReportsTab();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(1000);


        //create esa project folder

        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        Thread.sleep(500);

        BaseClass.projectFolderSection().enterProjectFolderNameField_ESA();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdownssffy
        Thread.sleep(2000);

        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(2500);

        BaseClass.projectFolderSection().click_ESA_Template_projectFolder_templatesTab();
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(3000);

        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(5000);
        BaseClass.projectFolderSection().click_ESA_ProjectFolderLink();
        Thread.sleep(1000);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(1000);

        //create esa report folder with esa template created


        BaseClass.reportfoldersection().clickAddReportButton();
        Thread.sleep(500);

        BaseClass.reportfoldersection().enterReportName_QA_ESA_Field();
        BaseClass.reportfoldersection().enterReportDescriptionField();
        Thread.sleep(500);

        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
        Thread.sleep(1500);
        BaseClass.reportfoldersection().clickDropdownItem();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(3500);

        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.reportfoldersection().clickHereLink();
        Thread.sleep(1500);


    }
    @Test
    public void TR003_ESA_XML_Package() throws InterruptedException {




        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
        Thread.sleep(1000);

        BaseClass.reporttagssection().enterpropertyRoomCount();
        Thread.sleep(500);

        BaseClass.reporttagssection().enterunitInspectedCount();
        Thread.sleep(1000);

        //refresh to see ESA in section view
                //add esa xml subsection
        BaseClass.esa_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.esa_xml_section().clickAddESAXMLPackage_toSection();
        Thread.sleep(2000);
        WebDriver driver = getDriver();

        //go to report tag and enter values
        driver.navigate().refresh();
        Thread.sleep(2000);

     BaseClass.esa_xml_section().clickSectionView_ESA_XML();

        BaseClass.esa_xml_section().capture_percent_of_units_inspected_reportTag();

        BaseClass.pca_xml_section().enterDealIdentifier();
        BaseClass.pca_xml_section().select_ClientName_DUS_Lender();
        BaseClass.pca_xml_section().enter_thirdParty_requestor_name();
        BaseClass.pca_xml_section().enterThirdParty_signatory_name();
        BaseClass.pca_xml_section().enterThirdPartyAssessorName();

        BaseClass.pca_xml_section().enter_third_Party_ReportSignature_Date();

        BaseClass.esa_xml_section().selectThirdPartyReport_ScopeStandard();

        Thread.sleep(500);
        BaseClass.pca_xml_section().scrollto_property_location_section();
        Thread.sleep(500);

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

        BaseClass.esa_xml_section().enterNumberOfParcels();
        BaseClass.esa_xml_section().enterYearBuilt();
        BaseClass.esa_xml_section().enterPhase_1_Site_Assessment_Date();
        BaseClass.esa_xml_section().enterYearsOfPropertyOwnership();

        BaseClass.esa_xml_section().selectHazard_concerns();
        BaseClass.esa_xml_section().selectTank_concerns();
        BaseClass.esa_xml_section().selectPcb_concerns();
        BaseClass.esa_xml_section().selectAcm_concerns();
        BaseClass.esa_xml_section().selectLbp_concerns();
        BaseClass.esa_xml_section().selectRadon_concern();
        BaseClass.esa_xml_section().selectAir_quality_concern();
        BaseClass.esa_xml_section().selectLead_water_concern();
        BaseClass.esa_xml_section().selectMold_concern();
        BaseClass.esa_xml_section().selectAdjacent_property_concern();

        BaseClass.esa_xml_section().enterNumber_of_UST();
        BaseClass.esa_xml_section().enterNumber_of_LUST();
        BaseClass.esa_xml_section().enterNumber_of_AST();
       // BaseClass.esa_xml_section().enterDealIdentifier();
        BaseClass.esa_xml_section().enterThirdParty_signatory_name();
        BaseClass.esa_xml_section().enterThirdPartyAssessorName();
        Thread.sleep(2000);

        BaseClass.esa_xml_section().selectDUS_compliance();

        Thread.sleep(3000);


        BaseClass.esa_xml_section().clickGenerateXMLButton();
        Thread.sleep(6000);
        BaseClass.zon_xml_section().getXMLButtonText();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().downloadGeneratedXML_ZIP();
        Thread.sleep(8000);
        BaseClass.staging5().unZip_ESA_XML_Folder();
        Thread.sleep(5000);
        BaseClass.staging5().capture_ESA_version_from_XML();
        Thread.sleep(1000);
    }

//    @Test
//    public void TR004_delete_ESA_XML_template_and_ProjectFolder() throws InterruptedException {
//
//        //delete template
//
//
//        BaseClass.templatesSection().clickTemplatesTab();
//        Thread.sleep(1000);
//
 //      BaseClass.reportfoldersection().enterSearchField_ESA_Report();
//        Thread.sleep(3000);
//
//        BaseClass.reportfoldersection().clickReportsFirstLink();
//        Thread.sleep(1000);
//        BaseClass.templatesSection().clickTemplateSettingsButton();
//
//        BaseClass.templatesSection().clickdeleteToTrash();
//        Thread.sleep(2000);
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
//    }
//
//    @Test
//    public void TR005_permanently_delete_trash_items() throws InterruptedException {
//
//        BaseClass.staging5().clickUserProfileTab();
//        BaseClass.staging5().click_userProfileTab_viewTrash_dropdownItem();
//        Thread.sleep(1000);
//
//        BaseClass.reportfoldersection().enterSearchField_ibrar();
//        Thread.sleep(3000);
//
//        BaseClass.staging5().clickDeletePermanentlyButton_AllItems();
//        Thread.sleep(800);
//
//    }

}

