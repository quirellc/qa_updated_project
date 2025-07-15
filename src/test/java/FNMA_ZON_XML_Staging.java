import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;


public class FNMA_ZON_XML_Staging extends ReusableAnnotations {
	//WebDriver driver = getDriver();
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
            BaseClass.quireLogin().enter_admin_Email();
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
    public void TR002_ZON_Template_ProjectFolder_Report_Creation() throws InterruptedException {
        //create ZON template
        BaseClass.templatesSection().clickTemplatesTab();
        BaseClass.templatesSection().clickAddTemplateButton();
        BaseClass.templatesSection().enterTemplateNameField_ZON();
        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(1000);


        BaseClass.templatesSection().enterTemplateDescriptionField();
        BaseClass.templatesSection().clickSave();
        Thread.sleep(3000);

        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.templatesSection().clickHereLinkTemplate();
        Thread.sleep(2000);


        //add ZON package settings to newly created template

        BaseClass.templatesSection().clickTemplateSettingsButton();
        BaseClass.templatesSection().clickTemplateSettings_PackagesTab();
        Thread.sleep(1000);
        BaseClass.templatesSection().enterTemplateSettings_PackagesTab_SearchField_ZON();
        Thread.sleep(1700);

        BaseClass.templatesSection().clickTemplateSettings_PackagesTab_clickFirstDropDownItem();
        Thread.sleep(1700);
        BaseClass.templatesSection().clickTemplateSettings_PackagesTab_addPackage_button();
        Thread.sleep(1700);


        BaseClass.templatesSection().clickTemplateSettings_SaveButton();

        Thread.sleep(1500);
        WebDriver driver = getDriver();

driver.navigate().refresh();
        Thread.sleep(500);

        //Go into to QA Automation Parent folders1


        BaseClass.reportfoldersection().clickReportsTab();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(4000);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        Thread.sleep(2000);


        //create ZON project folder

        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        BaseClass.projectFolderSection().enterProjectFolderNameField_ZON();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();

        //need to add wait before typing so it can search item in dropdownssffy
        Thread.sleep(2000);

        BaseClass.projectFolderSection().enterProjectFolder_ZON_Template_SearchField();
        Thread.sleep(3500);

        BaseClass.projectFolderSection().click_ZON_Template_projectFolder_templatesTab();
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(3000);

        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(4500);
        BaseClass.projectFolderSection().click_ZON_ProjectFolderLink();

        //create ZON report folder with ZON template created

        Thread.sleep(2000);

        BaseClass.reportfoldersection().clickAddReportButton();

        BaseClass.reportfoldersection().enterReportName_QA_ZON_Field();
        BaseClass.reportfoldersection().enterReportDescriptionField();
        BaseClass.reportfoldersection().clickReport_TemplateDropdown();
        Thread.sleep(2500);
        BaseClass.reportfoldersection().clickDropdownItem();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().clickSave();
        Thread.sleep(3000);

        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.templatesSection().clickHereLinkReport();
        Thread.sleep(2000);

    }

    @Test
    public void TR003_ZON_XML_Package() throws InterruptedException {


        //add ZON xml subsection
        BaseClass.zon_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.zon_xml_section().clickAddZONXMLPackage_toSection();
        Thread.sleep(2000);
        WebDriver driver = getDriver();

        //refresh to see ZON in section view
        driver.navigate().refresh();




        BaseClass.zon_xml_section().clickSectionView_ZON_XML();

        Thread.sleep(1000);


        BaseClass.zon_xml_section().enterDealIdentifier();
        BaseClass.zon_xml_section().select_ClientName_DUS_Lender();
        BaseClass.pca_xml_section().enter_thirdParty_requestor_name();
        BaseClass.zon_xml_section().enterThirdParty_signatory_name();
        BaseClass.zon_xml_section().enterThirdPartyAssessorName();
        BaseClass.pca_xml_section().enter_third_Party_ReportSignature_Date();
        BaseClass.zon_xml_section().enterThirdPartyReport_ScopeStandardDescription();
//        Thread.sleep(500);
//        BaseClass.pca_xml_section().scrollto_property_location_section();
        Thread.sleep(1500);
        BaseClass.pca_xml_section().clickProjectStreetAddress_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectStreetAddress_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(1000);

        BaseClass.pca_xml_section().clickProjectCity_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectCity_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(1000);

        BaseClass.pca_xml_section().clickProjectState_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectState_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(2000);

        BaseClass.pca_xml_section().clickProjectZip_ReportTagButton();
        BaseClass.pca_xml_section().enterProjectZip_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(1000);

        BaseClass.pca_xml_section().clickSiteCounty_ReportTagButton();
        BaseClass.pca_xml_section().enterSiteCounty_ReportTagField();
        BaseClass.pca_xml_section().clickSaveCheckButton();
        Thread.sleep(1000);




        BaseClass.zon_xml_section().enterProperty_land_area_acres();

        BaseClass.zon_xml_section().enterZoning_designation();

        BaseClass.zon_xml_section().click_existing_land_use_indicator_checkBox();

        BaseClass.zon_xml_section().click_existing_building_set_back_lines_indicator_checkBox();


        BaseClass.zon_xml_section().click_existing_building_size_indicator_checkBox();


        BaseClass.zon_xml_section().click_existing_building_density_coverage_indicator_checkBox();

        BaseClass.zon_xml_section().enter_existing_parking_spaces();

        BaseClass.zon_xml_section().enter_required_parking_spaces();


        BaseClass.zon_xml_section().click_existing_parking_conformance_checkBox();
        BaseClass.zon_xml_section().click_special_zoning_indicator_checkBox();
        BaseClass.zon_xml_section().click_recorded_violations_indicator_checkBox();
        BaseClass.zon_xml_section().click_recorded_building_code_violations_indicator_checkBox();

        BaseClass.zon_xml_section().click_recorded_fire_code_violations_indicator_checkBox();
        BaseClass.zon_xml_section().click_certificate_of_occupancy_checkBox();
        BaseClass.zon_xml_section().select_concluding_zoning_conformance_status();
        BaseClass.zon_xml_section().enter_property_damage_threshold_percent();



        Thread.sleep(2000);

        BaseClass.esa_xml_section().clickGenerateXMLButton();
        Thread.sleep(6000);
        BaseClass.zon_xml_section().getXMLButtonText();
        Thread.sleep(2000);
        BaseClass.pca_xml_section().downloadGeneratedXML_ZIP();
        Thread.sleep(6000);
        BaseClass.staging5().unZip_ZON_XML_Folder();
        Thread.sleep(6000);
        BaseClass.staging5().capture_ZON_version_from_XML();
        Thread.sleep(5000);
    }

//    @Test
//    public void TR004_delete_ZON_XML_template_and_ProjectFolder() throws InterruptedException {
//
//        //delete template
//
//
//        BaseClass.templatesSection().clickTemplatesTab();
//        Thread.sleep(2000);
//        BaseClass.reportfoldersection().enterSearchField_ZON_Report();
//        Thread.sleep(2000);
//
//        BaseClass.staging5().click_delete_templates_to_trash();
//
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
   // BaseClass.staging5().clickDeletePermanentlyButton_AllItems();
//        Thread.sleep(800);
//
//    }

}

