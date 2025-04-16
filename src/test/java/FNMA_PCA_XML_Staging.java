import Quire_POM.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;


public class  FNMA_PCA_XML_Staging extends ReusableAnnotations {
   // WebDriver driver = getDriver();

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
    public void TR002_FannieMae_Template() throws InterruptedException {


        BaseClass.templatesSection().clickTemplatesTab();
        Thread.sleep(1000);

        BaseClass.templatesSection().clickAddTemplateButton();
        Thread.sleep(2000);

        BaseClass.templatesSection().enterTemplateNameField_PCA();
        Thread.sleep(1000);

        BaseClass.templatesSection().selectTemplateTypeDropdown_staging();
        Thread.sleep(1000);

        BaseClass.templatesSection().enter_TemplateLabel_GeneralOther_Dropdown();
        Thread.sleep(1000);
        //   BaseClass.templatesSection().clickTemplateLabel_GeneralOther();

        BaseClass.templatesSection().enterTemplateDescriptionField();
        Thread.sleep(1500);

        BaseClass.templatesSection().clickSave();
        Thread.sleep(1000);


        BaseClass.templatesSection().capture_created_AlertMessage();
        BaseClass.templatesSection().clickHereLinkTemplate();
        Thread.sleep(1500);
    }
    @Test
    public void TR003_Sections_PCA_Template() throws InterruptedException {


            //click default section title and add sections: pdf, C/A , C/A subsection
            BaseClass.staging5().click_default_section_title();
            Thread.sleep(500);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(500);
            BaseClass.staging5().click_add_pdf_link_section();
            Thread.sleep(1000);
            BaseClass.staging5().click_add_fannie_mae_ConditionAction_section();
            Thread.sleep(1000);
            BaseClass.staging5().click_add_fannie_mae_ConditionAction_sub_section();
            Thread.sleep(1000);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
            Thread.sleep(700);


            //click section 2.0 - add section 2.1
            BaseClass.staging5().click_default_section_2();
            Thread.sleep(700);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(700);
            BaseClass.staging5().click_add_sub_section_toSection();
            Thread.sleep(700);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(700);


        //click section 2.1 - add sub section 2.1.1
            BaseClass.staging5().click_default_section_2_1();
            Thread.sleep(500);
            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(700);
            BaseClass.staging5().click_add_sub_section_toSection();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);

            //select CA dropdown
            BaseClass.staging5().select_fannie_mae_CA_category_dropdown();
            BaseClass.staging5().captureAlertMessage();
            Thread.sleep(1000);


            //hover over pdf link, select it, and select others as well
            BaseClass.staging5().hover_and_click_pdf_link_section_checkbox();
            Thread.sleep(500);
            //since pdf is selected already, it can  and click on other checkboxes
            BaseClass.staging5().click_fannie_mae_conditionAction_sub_section_checkbox();
            Thread.sleep(500);
            BaseClass.staging5().click_fannie_mae_conditionAction_section_checkbox();
            Thread.sleep(500);

            BaseClass.staging5().click_default_section_2_checkbox();
            Thread.sleep(500);
            BaseClass.staging5().click_default_section_1_1_checkbox();
            Thread.sleep(500);
            BaseClass.staging5().click_trash_icon_sectionView();
            Thread.sleep(500);

            driver.switchTo().alert().accept();
            Thread.sleep(1000);
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(1500);

        BaseClass.staging5().verify_default_section_2_isNot_Visible();

        Thread.sleep(500);

    }

    @Test
    public void TR004_add_appendix_info_and_Mark_complete_template() throws InterruptedException {

        //add appendix items
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().click_add_appendix_button();

        BaseClass.reportfoldersection().enter_appendix_title();
        BaseClass.reportfoldersection().click_any_appendix_format_checkbox();
        Thread.sleep(500);

        BaseClass.staging5().click_save_button();

        BaseClass.staging5().captureAlertMessage();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
        Thread.sleep(1000);

        BaseClass.staging5().upload_header_image();
        Thread.sleep(4500);

        //mark appendix complete
        BaseClass.staging5().click_mark_intro_pages_complete_grey_icon_();
        Thread.sleep(500);

        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        //change name
        BaseClass.reportfoldersection().enter_appendix_name();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().enter_file_name_appendix();
        Thread.sleep(1000);
        BaseClass.staging5().click_out_of_section();
        Thread.sleep(500);


    }
    @Test
    public void TR005_Report_creation_PCA() throws InterruptedException {

        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(5500);
        BaseClass.reportfoldersection().clickReportsFirstLink();


        BaseClass.projectFolderSection().clickAddProjectFolderButton();
        BaseClass.projectFolderSection().enterProjectFolderNameField_PCA();
        BaseClass.projectFolderSection().enterProjectFolderDescriptionField();
        BaseClass.projectFolderSection().clickProjectFolder_TemplatesTab();
        Thread.sleep(2000);
        BaseClass.projectFolderSection().enterProjectFolder_Template_SearchField();
        Thread.sleep(2000);
        BaseClass.projectFolderSection().click_PCA_Template_projectFolder_templatesTab();
        Thread.sleep(500);
        BaseClass.projectFolderSection().clickProjectFolder_AddTemplateButton();
        Thread.sleep(2000);
        BaseClass.projectFolderSection().clickSave();
        Thread.sleep(6000);
        BaseClass.projectFolderSection().click_PCA_ProjectFolderLink();
        Thread.sleep(2000);

        BaseClass.reportfoldersection().clickAddReportButton();

        BaseClass.reportfoldersection().enterReportName_QA_PCA_Field();
        BaseClass.reportfoldersection().enterReportDescriptionField();
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
    public void TR006_Report_addRemove_sections_fillSections_PCA() throws InterruptedException {
        // add/remove sections report

        //click default section title and add sections: pdf, C/A , C/A subsection
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(500);
        BaseClass.staging5().click_add_pdf_link_section();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_fannie_mae_ConditionAction_section();
        Thread.sleep(1500);
        BaseClass.staging5().click_add_fannie_mae_ConditionAction_sub_section();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);


        //click section 2.0 - add section 2.1
        BaseClass.staging5().click_default_section_2();
        Thread.sleep(500);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(500);
        BaseClass.staging5().click_add_sub_section_toSection();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);

        //click section 2.1 - add sub section 2.1.1
        BaseClass.staging5().click_default_section_2_1();
        Thread.sleep(500);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(500);
        BaseClass.staging5().click_add_sub_section_toSection();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();
        Thread.sleep(500);

        //select CA dropdown
        BaseClass.staging5().select_fannie_mae_CA_category_dropdown();
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);


        //hover over pdf link, select it, and select others as well
        BaseClass.staging5().hover_and_click_pdf_link_section_checkbox();
        Thread.sleep(500);
        //since pdf is selected already, it can  and click on other checkboxes
        BaseClass.staging5().click_fannie_mae_conditionAction_sub_section_checkbox();
        Thread.sleep(500);
        BaseClass.staging5().click_fannie_mae_conditionAction_section_checkbox();
        Thread.sleep(500);

        BaseClass.staging5().click_default_section_2_checkbox();
        Thread.sleep(500);
        BaseClass.staging5().click_default_section_1_1_checkbox();
        Thread.sleep(500);
        BaseClass.staging5().click_trash_icon_sectionView();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.switchTo().alert().accept();

        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(2000);

        BaseClass.staging5().verify_default_section_2_isNot_Visible();
        Thread.sleep(1000);

    }

    @Test
    public void TR007_report_Appendix_uploadImages_spellCheck_verifyCompletion() throws InterruptedException {

        //verify appendix is marked complete
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(1000);
        BaseClass.staging5().verify_intro_pages_blue_marked_complete_icon_is_Visible();
        Thread.sleep(1000);


        //turn on spellcheck, fix names, then turn off spellcheck
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(500);

        BaseClass.staging5().click_and_capture_spell_check_button();
        Thread.sleep(500);
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(4500);
        BaseClass.staging5().capture_spellCheck_errors();
        Thread.sleep(3000);
        BaseClass.staging5().fix_appendix_spellCheck_errors();
        Thread.sleep(1000);
        BaseClass.staging5().capture_spellCheck_errors();


        //delete appendix created from template
        BaseClass.reportfoldersection().click_delete_appendix_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        driver.navigate().refresh();
        Thread.sleep(500);

        //add pdf appendix - pdf checkbox is set by default
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().click_add_appendix_button();
        Thread.sleep(500);
        BaseClass.reportfoldersection().enter_pdf_appendix_title();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);

        //add gallery appendix -
        BaseClass.reportfoldersection().click_add_appendix_button();
        Thread.sleep(500);
        BaseClass.reportfoldersection().enter_gallery_appendix_title();
        Thread.sleep(500);
        BaseClass.reportfoldersection().click_gallery_format_checkbox_appendix();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(1000);


        // BaseClass.reportfoldersection().clickSectionView_Appendices();
        //Thread.sleep(1000);
//upload to gallery items - second appendix item

        BaseClass.staging5().upload_files_to_gallery_2nd_appendix();
        Thread.sleep(6000);
//upload to pdf - first appendix item
        BaseClass.staging5().upload_files_to_pdf_first_appendix();
        Thread.sleep(6000);

        BaseClass.reportfoldersection().capture_all_items_appendix_section();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().verify_no_processing_items_appendix_section();

        BaseClass.reportfoldersection().capture_broken_link_api();
        Thread.sleep(1000);
//
//        //turn on spellcheck, fix names, then turn off spellcheck
//        BaseClass.reportfoldersection().clickSectionView_Appendices();
//        Thread.sleep(500);
//
//        BaseClass.staging5().click_and_capture_spell_check_button();
//        Thread.sleep(500);
//        BaseClass.reportfoldersection().clickSectionView_Appendices();
//        Thread.sleep(4500);
//        BaseClass.staging5().capture_spellCheck_errors();
//        Thread.sleep(3000);
//        BaseClass.staging5().fix_appendix_spellCheck_errors();
//        Thread.sleep(1000);
//        BaseClass.staging5().capture_spellCheck_errors();

//add photo section and pdf link section  and upload images and pdf
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);

        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_imageSection_toSection();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_pdf_link_section();
        Thread.sleep(500);
        BaseClass.reporttagssection().hover_to_ReportTags_sections_Button();

        Thread.sleep(500);
        BaseClass.staging5().click_choose_photo_from_gallery_button();
        Thread.sleep(500);
        BaseClass.staging5().click_all_gallery_images_in_popup();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);
        BaseClass.staging5().click_select_pdf_link_button();
        Thread.sleep(500);
        BaseClass.staging5().click_PDF_Link_in_popup();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().capture_items_added_in_report_section();
        Thread.sleep(1000);


        //delete appendix in report and verify
        BaseClass.reportfoldersection().clickSectionView_Appendices();
        Thread.sleep(1500);

        BaseClass.reportfoldersection().click_delete_appendix_button();
        Thread.sleep(500);
        BaseClass.staging5().captureAlertMessage();
        Thread.sleep(500);

        //click trash app button
        BaseClass.staging5().click_view_trash_button();
        Thread.sleep(500);
//restore recent 2 deleted items (appendices)
        BaseClass.staging5().click_restore_first_deleted_item();
        Thread.sleep(500);
        BaseClass.staging5().click_restore_first_deleted_item();
        Thread.sleep(500);
        //go back and refresh
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(500);



    }

    @Test
    public void TR007a_upload_titlePageImage_ReporTag() throws InterruptedException {
        WebDriver driver = getDriver();

        BaseClass.reporttagssection().clickSectionView_ReportTags_Button();
        Thread.sleep(3000);

        BaseClass.reporttagssection().click_title_page_image_button();
        Thread.sleep(1000);

        BaseClass.staging5().click_signature_image_in_popup();
        Thread.sleep(500);
        BaseClass.staging5().click_save_button();
        Thread.sleep(500);
        BaseClass.reporttagssection().verify_title_page_image_loaded();
        BaseClass.staging5().click_default_section_title();
        BaseClass.staging5().clickSection_row_editor();
        Thread.sleep(500);
        BaseClass.ck5editor().click_report_tag_icon_ck5();
        Thread.sleep(500);

//        BaseClass.staging5().click_reportTag_icon_ck_modal();
//        Thread.sleep(500);
//        BaseClass.staging5().switchTo_reportTag_dropdownItems_ck5_iFrame();
        BaseClass.staging5().click_titlePageImage_RT_dropDownItem();
//        driver.switchTo().defaultContent();
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(500);
        BaseClass.reporttagssection().verify_title_page_image_loaded();
        Thread.sleep(500);


    }


    @Test
    public void TR008_PCA_FannieMae_quickFactsTable_export_quickPreview() throws InterruptedException {

        BaseClass.pca_xml_section().clickSectionView_QuickFactsTable();
        Thread.sleep(1500);

        BaseClass.pca_xml_section().clickCommon_stairways_checkbox_quickFactsTable();
        Thread.sleep(500);
        BaseClass.pca_xml_section().clickCommon_breezeways_checkbox_quickFactsTable();
        Thread.sleep(500);
        BaseClass.pca_xml_section().clickUnits_selected_quickFactsTable();
        Thread.sleep(1000);

        //quick preview button in next tab
        BaseClass.reportfoldersection().click_quick_preview_button();
        Thread.sleep(1000);
        BaseClass.reportfoldersection().change_to_next_tab();
        Thread.sleep(500);
        //quick preview tab - capture header and footer data
        BaseClass.reportfoldersection().verify_quick_preview_pca_quickFactsTable();
        Thread.sleep(500);
        WebDriver driver = getDriver();

        //close second tab and go back to default tab
        driver.close();
        Thread.sleep(500);
        BaseClass.reportfoldersection().change_to_default_tab();
        Thread.sleep(1000);

        //capture portfolio text and click export pdf and export excel button...and capture green banner
        BaseClass.pca_xml_section().clickSectionView_QuickFactsTable();
        Thread.sleep(500);

        BaseClass.staging5().click_export_to_excel_fm1105();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(500);

        BaseClass.staging5().click_export_pdf_button();
        Thread.sleep(500);
        BaseClass.templatesSection().captureAlertMessage();
        Thread.sleep(500);
        BaseClass.staging5().click_cancel_alert_message();
        Thread.sleep(500);




    }

        @Test
        public void TR009_PCA_FannieMae_XML_Package() throws InterruptedException {

            BaseClass.pca_xml_section().clickSectionView_ExecutiveSummary();
            Thread.sleep(500);
            BaseClass.pca_xml_section().clickSectionView_KnownProblems();
            Thread.sleep(500);

            BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(1000);
            BaseClass.pca_xml_section().clickAddPCAXMLPackage_toSection();

            Thread.sleep(500);
            WebDriver driver = getDriver();

            driver.navigate().refresh();
            Thread.sleep(500);

            BaseClass.pca_xml_section().clickSectionView_PCA_XML();
            Thread.sleep(2000);

            BaseClass.pca_xml_section().enterDealIdentifier();
            BaseClass.pca_xml_section().select_ClientName_DUS_Lender();

            BaseClass.pca_xml_section().enter_thirdParty_requestor_name();
//        BaseClass.pca_xml_section().clickClientContact_ReportTagField_dropdownButton();
//        BaseClass.pca_xml_section().clickClientContact_ReportTagField_dropdownItem();


            BaseClass.pca_xml_section().selectReport_subtype_dropdown();
            BaseClass.pca_xml_section().enterThirdParty_signatory_name();

            BaseClass.pca_xml_section().enterThirdPartyAssessorName();

            BaseClass.pca_xml_section().enter_third_Party_ReportSignature_Date();
//        BaseClass.pca_xml_section().enterReportDate_ReportTagField();
//        BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(1000);

//        BaseClass.pca_xml_section().scrollto_property_location_section();
//        Thread.sleep(500);

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

            BaseClass.pca_xml_section().enterNumberOfParcels();
//        BaseClass.pca_xml_section().enterNumberOfParcels_ReportTagField();
//        BaseClass.pca_xml_section().clickSaveCheckButton();
//        Thread.sleep(500);

            BaseClass.pca_xml_section().clickScattered_parcel_checkBox();
            BaseClass.pca_xml_section().clickAdjoining_parcel_checkBox();
            Thread.sleep(1000);


            BaseClass.pca_xml_section().clickYearConstructed_ReportTagButton();
            BaseClass.pca_xml_section().enterYearConstructed_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);

            BaseClass.pca_xml_section().clickTotalNumberofAptBuildings_ReportTagButton();
            BaseClass.pca_xml_section().enterTotalNumberofAptBuildings_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);

            BaseClass.pca_xml_section().enterNumber_of_other_buildings();
            BaseClass.pca_xml_section().selectBuildingType_dropdown();
            Thread.sleep(500);
            BaseClass.pca_xml_section().clickNumberOfStories_ReportTagButton();
            BaseClass.pca_xml_section().enterNumberOfStories_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);


            BaseClass.pca_xml_section().selectUse_of_ground_floor_dropdown();

            BaseClass.pca_xml_section().clickPropertyRoomCount_ReportTagButton();
            BaseClass.pca_xml_section().enterPropertyRoomCount_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);

            BaseClass.pca_xml_section().enterNumber_of_beds();


            BaseClass.pca_xml_section().enter_property_Condition_Assessment_Date();
//        BaseClass.pca_xml_section().enterAssessmentDate_ReportTagField();
//        BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);


            BaseClass.pca_xml_section().clickUnitsInspectedCount_ReportTagButton();
            BaseClass.pca_xml_section().enterUnitsInspectedCount_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();

            BaseClass.pca_xml_section().clickDownUnitCount_ReportTagButton();
            BaseClass.pca_xml_section().enterDownUnitCount_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);

            BaseClass.pca_xml_section().enterTotalNetRentableSF();

            BaseClass.pca_xml_section().enterBuildingSquareFeet_ReportTagButton();

            BaseClass.pca_xml_section().clickMoisture_or_microbial_growth_checkbox();
            BaseClass.pca_xml_section().clickPest_present_checkbox();
            BaseClass.pca_xml_section().clickProperty_high_seismisk_risk_checkbox();
            BaseClass.pca_xml_section().click_seismic_risk_assessment_required_checkbox();
            BaseClass.pca_xml_section().clickCatastrophicEvent_checkbox();
            BaseClass.pca_xml_section().clickCodeViolation_checkbox();
            BaseClass.pca_xml_section().clickADA_FHA_Compliance_Issues_checkbox();
            BaseClass.pca_xml_section().clickEnergy_compliance_reporting_checkbox();
            Thread.sleep(500);

            BaseClass.pca_xml_section().clickParkingSpaces_ReportTagButton();
            BaseClass.pca_xml_section().enterParkingSpaces_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);


            BaseClass.pca_xml_section().clickHandicapParkingSpaces_ReportTagButton();
            BaseClass.pca_xml_section().enterHandicapParkingSpaces_ReportTagField();
            BaseClass.pca_xml_section().clickSaveCheckButton();
            Thread.sleep(500);

            BaseClass.pca_xml_section().selectMultifamily_Building_Construction_Type();

            BaseClass.pca_xml_section().selectWalkwayDropdown();

            BaseClass.pca_xml_section().clickOverallPropertyRating_ReportTagButton();
            BaseClass.pca_xml_section().selectOverallPropertyRating_ReportTagDropdown();
            //   BaseClass.pca_xml_section().clickCloseWindowButton();
            Thread.sleep(500);

            BaseClass.pca_xml_section().select_claddingType_dropdown();
            BaseClass.pca_xml_section().select_roofGeometryType_dropdown();
            BaseClass.pca_xml_section().select_plumbing_insulation_present_dropdown();
            BaseClass.pca_xml_section().click_roof_ventilation_present_checkBox();
            BaseClass.pca_xml_section().select_openings_heat_wildfire_resistant_dropdown();
            BaseClass.pca_xml_section().select_storm_drainage_system_dropdown();
            BaseClass.pca_xml_section().select_wildfire_resistant_roof_vents_dropdown();
            BaseClass.pca_xml_section().select_roof_anchor_dropdown();

            BaseClass.pca_xml_section().select_patio_deck_dropdown();
            BaseClass.pca_xml_section().click_observed_structural_distress_checkBox();
            BaseClass.pca_xml_section().select_site_plan_geometry_dropdown();
            BaseClass.pca_xml_section().enter_lowest_floor_level_occupied();
            BaseClass.pca_xml_section().click_interior_sprinkler_system_present_checkBox();
            BaseClass.pca_xml_section().select_sprinkler_system_type_dropdown();
            BaseClass.pca_xml_section().click_ember_accumulators_checkBox();

            BaseClass.pca_xml_section().select_first_floor_height_dropdown();
            BaseClass.pca_xml_section().select_ice_dam_protection_dropdown();
            BaseClass.pca_xml_section().select_snow_guards_dropdown();
            BaseClass.pca_xml_section().select_fire_service_response_type_dropdown();
            BaseClass.pca_xml_section().select_building_retrofitted_for_flood_resiliency_dropdown();
            BaseClass.pca_xml_section().select_roof_equipment_hurricane_bracing_dropdown();

            BaseClass.pca_xml_section().select_heating_fuel_type_dropdown();
            BaseClass.pca_xml_section().select_hot_water_fuel_type_dropdown();
            BaseClass.pca_xml_section().select_heating_fuel_paid_by_dropdown();
            BaseClass.pca_xml_section().select_hot_water_fuel_paid_by_dropdown();
            BaseClass.pca_xml_section().select_foundation_type_dropdown();
            ////////////////////////////////////////////////////////////////////////////////////////////////////

            //  BaseClass.pca_xml_section().enterSiteTypeUse_ReportTagField();
            // BaseClass.pca_xml_section().clickSaveCheckButton();


            Thread.sleep(1500);


            BaseClass.esa_xml_section().clickGenerateXMLButton();
            Thread.sleep(6000);
            BaseClass.zon_xml_section().getXMLButtonText();
            Thread.sleep(2000);
            BaseClass.pca_xml_section().downloadGeneratedXML_ZIP();
            Thread.sleep(6000);
            BaseClass.staging5().unZip_PCA_XML_Folder();
            Thread.sleep(6000);
            BaseClass.staging5().capture_PCA_version_from_XML();
            Thread.sleep(2000);


        }
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
//        BaseClass.reportfoldersection().enterSearchField_PCA_Report();
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
//
//        BaseClass.staging5().clickDeletePermanentlyButton_AllItems();
//        Thread.sleep(800);
//
//    }b


