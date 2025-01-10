package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import javax.swing.plaf.TableHeaderUI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
//
public class TemplatesSection extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public TemplatesSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor


    String browserName = driver.getClass().getSimpleName();


    @FindBy(xpath = "//*[text()='Templates']")
    WebElement templatesTab;
    public void clickTemplatesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templatesTab, logger, "templates tab");}
    @FindBy(xpath = "(//div[@class='contentWrapper disabled js-tooltip'])[1]")
    WebElement templatesTab_locked;
    @FindBy(xpath = "//div[@class='tooltip-inner' and contains(text(), 'This action is disabled due to company policy')]")
    WebElement button_locked_message;
    public void verify_add_template_button_locked() throws InterruptedException {
        BaseClass.templatesSection().hover_to_add_TemplateButton();
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, templatesTab_locked,true, logger, "Locked add template button");
        Thread.sleep(500);
        BaseClass.templatesSection().hover_to_add_TemplateButton();
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, button_locked_message,true, logger, "Locked templates tab Message");
}




    public void verify_edit_labels_button_locked() throws InterruptedException {
        BaseClass.templatesSection().hover_to_editLabelsButton();
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, templatesTab_locked,true, logger, "Locked edit label tab");
        Thread.sleep(500);
        BaseClass.templatesSection().hover_to_editLabelsButton();
        Thread.sleep(500);
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, button_locked_message,true, logger, "Locked label Message");
    }
    @FindBy(xpath = "//*[contains(text(),'Add Template')]")
    WebElement addTemplateButton;
    public void hover_to_add_TemplateButton() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, addTemplateButton, logger, "addTemplateButton");}
    public void clickAddTemplateButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addTemplateButton, logger, "Add template button");}

    @FindBy(xpath = "//a[normalize-space()='View Disabled Templates']")
    WebElement view_disabled_templates_button;
    public void click_view_disabled_templates_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, view_disabled_templates_button, logger, "view_disabled_templates_button");}

    @FindBy(xpath = "//a[normalize-space()='Edit Labels']")
    WebElement editLabelsButton;
    public void hover_to_editLabelsButton() {
        ReusableMethodsLoggersPOM.mouseHoverMethod(driver, editLabelsButton, logger, "editLabelsButton");}


    @FindBy(xpath = "//h1[normalize-space()='New Template']")
    WebElement addNewTemplateModal;
    public void verify_NewTemplateModal_isVisible() throws InterruptedException {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, addNewTemplateModal, true,logger, "New template Modal");}

    @FindBy(xpath = "//a[text()='Cancel']")
    WebElement cancelButton;
    public void clickCancel() {
        ReusableMethodsLoggersPOM.clickMethod(driver, cancelButton, logger, "cancel button");}

    @FindBy(xpath = "//a[normalize-space()='Assign to Projects']")
    WebElement assign_to_projects_button;
    public void click_assign_to_projects_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, assign_to_projects_button, logger, "assign_to_projects_button button");}

    @FindBy(xpath = "//a[normalize-space()='Manage Collaborators']")
    WebElement manage_collaborators;
    public void click_manage_collaborators_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, manage_collaborators, logger, "manage_collaborators button");}
    @FindBy(xpath = "//a[@title='Export Content']")
    WebElement export_content_button;
    public void click_export_content_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_content_button, logger, "export_content_button button");}
    @FindBy(xpath = "//a[contains(text(), 'SINGLE')]")
    WebElement export_to_single_template_button;
    public void click_export_to_single_template_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_to_single_template_button, logger, "export_to_single_template_button button");}


    @FindBy(xpath = "//div[@id='templates']//span[@class='input-group-addon dropdown-action']")
    WebElement target_export_template_dropdown_arrow;
    public void click_target_export_template_dropdown_arrow() {
        ReusableMethodsLoggersPOM.clickMethod(driver, target_export_template_dropdown_arrow, logger, "target_export_template_dropdown_arrow button");}

    @FindBy(xpath = "//input[@placeholder='Type at least 3 characters to search']")
    WebElement export_to_report_field;
    public void enter_export_to_report_field() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, export_to_report_field,"QA Medium Priority Test Report-Chrome", logger, "export_to_report_field button");

        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, export_to_report_field,"QA Medium Priority Test Report-Firefox", logger, "export_to_report_field button");
        }
    }

    @FindBy(xpath = "//div[@class='ui-menu-item-wrapper'][contains(text(),'QA Automation Testing New Updated Medium Priority Template-Chrome')]")
    WebElement medium_priority_updated_dropdownValue_chrome;
    @FindBy(xpath = "//div[@class='ui-menu-item-wrapper'][contains(text(),'QA Automation Testing New Updated Medium Priority Template-Firefox')]")
    WebElement medium_priority_updated_dropdownValue_ff;
    public void click_medium_priority_updated_dropdownValue_export() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, medium_priority_updated_dropdownValue_chrome, logger, "medium_priority_updated_dropdownValue");

        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.clickMethod(driver, medium_priority_updated_dropdownValue_ff, logger, "medium_priority_updated_dropdownValue");
        }
    }

    @FindBy(xpath = "//li[@class='ui-menu-item']")
    WebElement first_target_report_dropdown_link;
    public void click_first_target_report_dropdown_link() {
        ReusableMethodsLoggersPOM.clickMethod(driver, first_target_report_dropdown_link, logger, "first_target_report_dropdown_link");}

    @FindBy(xpath = "//div[@class='nav-list source-blueprint']//a[@title='Default Section Title']")
    WebElement export_default_section_title_1;
    public void click_export_default_section_title_1() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_default_section_title_1, logger, "export_default_section_title_1");}

    @FindBy(xpath = "//li[contains(@class, 'outlineItem report-appendix sortable-report-appendix indent-level-1')]")
    List <WebElement> export_appendix_items;
    public void click_export_appendix_items() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for (WebElement element : export_appendix_items) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            // Add any necessary wait time here if required, for example:
        }}

    @FindBy(xpath = "//li[contains(@class, 'outlineItem report-appendix sortable-report-appendix indent-level-1')]")
    List <WebElement> appendix_sections;
    public void verify_appendix_sections_exported() {
        int appendix_sections_count = appendix_sections.size();
        for (int i = 0; i < appendix_sections_count ; i++) {
            WebElement appendices = appendix_sections.get(i);
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, appendices, true, logger, "appendix section" + i);
        }}

    public void count_appendix_sections() {
        int appendix_sections_count = appendix_sections.size();
        System.out.println("There are: " + appendix_sections_count + " sections in Appendices" );
        logger.log(LogStatus.PASS, "There are: " + appendix_sections_count + " sections in Appendices" );

        for (int i = 0; i < appendix_sections_count ; i++) {
            WebElement appendices = appendix_sections.get(i);
            ReusableMethodsLoggersPOM.captureTextMethod(driver, appendices,  logger, "appendix section name: " + i);
        }
    }//

    @FindBy(xpath = "//a[normalize-space()='Export Now']")
    WebElement export_now_button;
    public void click_export_now_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, export_now_button, logger, "export_now_button");}

    @FindBy(xpath = "//a[normalize-space()='Export Complete']")
    WebElement export_complete_button;
//    @FindBy(xpath = "//li[contains(@class, 'will-')]//i[@class='fa fa-arrow-right']")
//    WebElement export_completed_arrow;
    public void verify_export_completed() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, export_complete_button, logger, "export_completed_text");
        ReusableMethodsLoggersPOM.verifyBooleanStatement1(driver, export_complete_button, true, logger, "export_completed_button");
    }
//            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, export_completed_arrow,true,  logger, "export_completed_arrow");}


    @FindBy(xpath = "//a[normalize-space()='Start Another Export']")
    WebElement start_another_export_button;
    public void click_start_another_export_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, start_another_export_button, logger, "start_another_export_button");}
    @FindBy(xpath = "//div[contains(text(),'123')]")
    WebElement exported_wb_item_1;
    @FindBy(xpath = "//div[contains(text(),'123123')]")
    WebElement exported_wb_item_2;
    public void verify_exported_wb_item() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, exported_wb_item_1,true,  logger, "exported_wb_item");
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, exported_wb_item_2,true,  logger, "exported_wb_item");}


    @FindBy(xpath = "//input[@id='unassigned_items_search']")
    WebElement unassigned_items_searchField;
    public void enter_Medium_projFolder_to_template() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, unassigned_items_searchField, "QA Automation Testing Medium Priority Project Folder-Chrome", logger, " unassigned_items_searchField ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, unassigned_items_searchField, "QA Automation Testing Medium Priority Project Folder-Firefox", logger, " unassigned_items_searchField ");
        }
        ReusableMethodsLoggersPOM.submitMethod(driver, unassigned_items_searchField, logger, " unassigned_items_searchField ");}
    @FindBy(xpath = "//div[@class='form-group field-name']//input[@id='template_name']")
    WebElement existing_template_Name;
    public void enter_new_TemplateNameField_medium_priority() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, existing_template_Name, "QA Automation Testing New Updated Medium Priority Template-Chrome", logger, "New Medium Priority template name field");
        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, existing_template_Name, "QA Automation Testing New Updated Medium Priority Template-Firefox", logger, "New Medium Priority template name field");}
        }

    // Locate all elements with the specified XPath

    @FindBy(xpath = "//input[@id='template_name']")
    WebElement templateName;
    public void enterTemplateNameField_FM_1104() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing FM_1104 Template-Chrome", logger, "FreddieMac1104 template name field Chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing FM_1104 Template-Firefox", logger, "FreddieMac1104 template name field Firefox");
        }}
    public void enterTemplateNameField_FM_1105() {
        if (browserName.contains("Chrome")) {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing FM_1105 Template-Chrome", logger, "FreddieMac1105 template name field Chrome");

    } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing FM_1105 Template-Firefox", logger, "FreddieMac1105 template name field Firefox");
    }}
    public void enterTemplateNameField_cloned_FM_1105() {
        if (browserName.contains("Chrome")) {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing FM_1105 Cloned Template-Chrome", logger, "FreddieMac1105 template name field Chrome");

    } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing FM_1105 Cloned Template-Firefox", logger, "FreddieMac1105 Cloned template name field Firefox");
    }}
    public void enterTemplateNameField_PCA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing PCA Template-Chrome", logger, "PCA template name field chrome");

        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing PCA Template-Firefox", logger, "PCA template name field ff");
        }
    }
//    public void enterTemplateNameField_ESA() {
//    if (browserName.contains("Chrome")) {
//        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing ESA Template-Chrome", logger, "ESA template name field chrome");
//
//    } else if (browserName.contains("Firefox")) {
//        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing ESA Template-Firefox", logger, "ESA template name field ff");
//    }
//}
    public void enterTemplateNameField_SRA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing SRA Template-Chrome", logger, "SRA template name field chrome");

        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing SRA Template-Firefox", logger, "SRA template name field ff");
        }}

    public void enterTemplateNameField_ck5() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing CK5 Template-Chrome", logger, "CK5 template name field chrome");

        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing CK5 Template-Firefox", logger, "CK5 template name field ff");
        }}

    public void enterTemplateNameField_new_ck5() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing New CK5 Template-Chrome", logger, "CK5 new template name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing New CK5 Template-Firefox", logger, "CK5 new template name field ff");
        }}      public void enterTemplateNameField_ZON() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing ZON Template-Chrome", logger, "ZON template name field chrome");

        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing ZON Template-Firefox", logger, "ZON template name field ff");
        }}
    public void enterTemplateNameField_medium_priority() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing Medium Priority Template-Chrome", logger, "Medium Priority Template chrome");

        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing Medium Priority Template-Firefox", logger, " Medium Priority Template ff");
        }}

    public void enter_TemplateNameField_cloned_medium_priority() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing Cloned Medium Priority Template-Chrome", logger, "Cloned Medium Priority Template chrome");

        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateName, "QA Automation Testing Cloned Medium Priority Template-Firefox", logger, "Cloned Medium Priority Template ff");
        }}
    @FindBy(xpath = "//div[@class='alert alert-warning alert-under js-warning-name-changed']")
    WebElement new_TemplateName_warningMessage;
    public void verify_new_TemplateName_warningMessage() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, new_TemplateName_warningMessage, true, logger, "new template name warning message");}
    @FindBy(xpath = "//a[@class='edit-link']")
    List<WebElement> search_results;
    public void delete_automation_templates() throws InterruptedException {
        BaseClass.templatesSection().enterSearchField_automated_files();
        Thread.sleep(4000);
        int search_results_int = search_results.size();

        if (!search_results.isEmpty()) {
for (int i = 0; i < search_results_int; i++) {
    try {

                    BaseClass.pca_xml_section().clickFirstTemplateLink();

                    BaseClass.templatesSection().clickTemplateSettingsButton();
                    BaseClass.templatesSection().clickdeleteToTrash();
                    BaseClass.staging5().captureAlertMessage();
                    BaseClass.templatesSection().enterSearchField_automated_files();

                } catch (Exception e) {
                    System.out.println("Failed to delete edit link: " + e.getMessage());
                    logger.log(LogStatus.FAIL, "Failed to delete edit link: " + e.getMessage());

                }
            }
        } else {
            System.out.println("No edit links found.");
            logger.log(LogStatus.PASS, "No edit links found.");

        }
    }
    public void delete_automation_folders() throws InterruptedException {
        BaseClass.templatesSection().enterSearchField_automated_files();
        Thread.sleep(4000);
        int search_results_int = search_results.size();

        if (!search_results.isEmpty()) {
            for (int i = 0; i < search_results_int; i++) {
                try {
                    BaseClass.pca_xml_section().clickFirstTemplateLink();
                    BaseClass.projectFolderSection().click_projectFolderSettings_button();
                    Thread.sleep(200);
                    BaseClass.templatesSection().clickdeleteToTrash();
                    Thread.sleep(500);
                    BaseClass.staging5().captureAlertMessage();
                    Thread.sleep(500);
                    BaseClass.templatesSection().enterSearchField_automated_files();
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Failed to delete edit link: " + e.getMessage());
                    logger.log(LogStatus.FAIL, "Failed to delete edit link: " + e.getMessage());
                }
            }
        } else {
            System.out.println("No edit links found.");
            logger.log(LogStatus.PASS, "No edit links found.");

        }
    }
    @FindBy(xpath = "//input[@id='tag-matrix-search']")
    WebElement search_field;

    public void enterSearchField_automated_files() throws InterruptedException {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, search_field, "-Chrome", logger, "Chrome files");
            Thread.sleep(1000);
            ReusableMethodsLoggersPOM.submitMethod(driver, search_field,  logger, "Chrome files");


        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, search_field, "-Firefox", logger, "Firefox files");
            Thread.sleep(1000);

            ReusableMethodsLoggersPOM.submitMethod(driver, search_field, logger, "Firefox files");

        }}
    public void enterTemplateSearchField_FM_1104() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing FM_1104 Template-Chrome", logger, "FreddieMac1104 template search_field");

        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing FM_1104 Template-Firefox", logger, "FreddieMac1104 template search_field");
        }}
    public void enterTemplateSearchField_FM_1105() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing FM_1105 Template-Chrome", logger, "FreddieMac1105 template search_field ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing FM_1105 Template-Firefox", logger, "FreddieMac1105 template search_field ");}}
    public void enterTemplateSearchField_cloned_FM_1105() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing Cloned FM_1105 Cloned Template-Chrome", logger, "FreddieMac1105 template search_field ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing Cloned FM_1105 Cloned Template-Firefox", logger, "FreddieMac1105 template search_field ");
        }}
    public void enterTemplateSearchField_PCA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing PCA Template-Chrome", logger, "PCA template search_field ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing PCA Template_Firefox", logger, "PCA template search_field ");
        }
        ReusableMethodsLoggersPOM.submitMethod(driver, search_field, logger, " search_field ");
        }
//    public void enterTemplateSearchField_ESA() {
//        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing ESA Template", logger, "ESA template search_field ");}
    public void enterTemplateSearchField_SRA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing SRA Template-Chrome", logger, "SRA template search_field ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing SRA Template-Firefox", logger, "SRA template search_field ");
        }
        }
    public void enterTemplateSearchField_ck5() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing CK5 Template-Chrome", logger, "ck5 template search_field ");
        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing CK5 Template-Firefox", logger, "ck5 template search_field ");}
        }
    public void enterTemplateSearchField_new_ck5() {

        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing New CK5 Template-Chrome", logger, "ck5 template search_field ");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing New CK5 Template-Firefox", logger, "ck5 template search_field ");
        }}
    public void enterTemplateSearchField_ZON() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing ZON Template-Chrome", logger, "ZON template search_field");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing ZON Template-Firefox", logger, "ZON template search_field");

        }}


            public void enterTemplateSearchField_medium() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing Medium Priority Template-Chrome", logger, " QA Automation Testing New Updated Medium Priority Template-chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing Medium Priority Template-Firefox", logger, " QA Automation Testing New Updated Medium Priority Template-ff");
        }
        ReusableMethodsLoggersPOM.submitMethod(driver, search_field, logger, "search_field ");}
    public void enterTemplateSearchField_updated_medium() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing New Updated Medium Priority Template-Chrome", logger, " QA Automation Testing New Updated Medium Priority Template-chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing New Updated Medium Priority Template-Firefox", logger, " QA Automation Testing New Updated Medium Priority Template-ff");
        }
        ReusableMethodsLoggersPOM.submitMethod(driver, search_field, logger, " search_field ");}
    public void enterSearchField_QA_WB() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA WordBank", logger, "FreddieMac1104 template search_field");
        ReusableMethodsLoggersPOM.submitMethod(driver, search_field, logger, " search_field ");}

    public void enterTemplateSearchField_cloned_medium() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing Cloned Medium Priority", logger, " QA Automation Testing Cloned  Medium Priority Template");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, search_field, "QA Automation Testing Cloned Medium Priority", logger, " QA Automation Testing Cloned  Medium Priority Template");
        }
        ReusableMethodsLoggersPOM.submitMethod(driver, search_field, logger, " search_field ");}

    @FindBy(xpath = "(//*[@placeholder='Choose a System Label'])[2]")
    WebElement templateLabelDropdown;

    public void enter_TemplateLabel_GeneralOther_Dropdown() {

        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, templateLabelDropdown,"General Other" , logger, "template label - General Other");
    }



    @FindBy(xpath = "//select[@class='form-control']")
    WebElement templateTypeDropdown;
    public void selectTemplateTypeDropdown_prod() {
        ReusableMethodsLoggersPOM.selectByValue(driver, templateTypeDropdown, "fannie_mae", logger, "templateTypeDropdown");}
    public void selectTemplateTypeDropdown_staging() {
        ReusableMethodsLoggersPOM.selectByValue(driver, templateTypeDropdown, "fannie_mae", logger, "templateTypeDropdown");}
    public void selectTemplateTypeDropdown_FM_1104() {
        ReusableMethodsLoggersPOM.selectByValue(driver, templateTypeDropdown, "freddie_mac1104", logger, "templateTypeDropdown");}
    public void selectTemplateTypeDropdown_FM_1105() {
        ReusableMethodsLoggersPOM.selectByValue(driver, templateTypeDropdown, "freddie_mac_v2", logger, "templateTypeDropdown");}

    @FindBy(xpath = "//div[@class='option active'][normalize-space()='General Other']")
    WebElement templateLabel_GeneralOther;
    public void clickTemplateLabel_GeneralOther() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateLabel_GeneralOther, logger, "template label - General Other");
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, templateLabel_GeneralOther,"General Other" , logger, "template label - General Other");}



    @FindBy(xpath = "//textarea[@id='template_description']")
    WebElement templateDescription;
    public void enterTemplateDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateDescription, "QA Automation Testing  Template Creation", logger, "template description field");}

    @FindBy(xpath = "//div[@class='form-group field-desc']//textarea[@id='template_description']")
    WebElement template_existing_Description;
    public void enter_new_TemplateDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, template_existing_Description, "QA Automation Testing New Updated Template Creation task", logger, "template description field");}


    @FindBy(xpath = "//div[@class='selectize-control single']//div[@class='selectize-input items full has-options has-items']")
    WebElement pdf_file_name_format;
    public void click_pdf_file_name_format_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, pdf_file_name_format, logger, "click_pdf_file_name_format_dropdown");}


    @FindBy(xpath = "//div[normalize-space()='Custom Format...']")
    WebElement custom_format_dropdown_value;
    public void click_custom_format_dropdown_value() {
        ReusableMethodsLoggersPOM.clickMethod(driver, custom_format_dropdown_value, logger, "custom_format_dropdown_value");}

    @FindBy(xpath = "//input[@id='pdf_file_name_format_input']")
    WebElement pdf_file_name_textField;
    public void enter_pdf_file_name_textField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, pdf_file_name_textField, "!@#$%^&*()",logger, "pdf_file_name_textField");}


    @FindBy(xpath = "//a[normalize-space()='Insert Report Tag']")
    WebElement insert_reportTag_dropdown_button;
    public void click_insert_reportTag_dropdown_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_reportTag_dropdown_button, logger, "insert_reportTag_dropdown_button");}

    @FindBy(xpath = "//a[normalize-space()='Account Manager Email']")
    WebElement reportTag_dropdown_value;
    public void click_reportTag_dropdown_value() {
        ReusableMethodsLoggersPOM.clickMethod(driver, reportTag_dropdown_value, logger, "reportTag_dropdown_value");}

    @FindBy(xpath = "//a[normalize-space()='Insert Variable']")
    WebElement insert_variable_dropdown_button;
    public void click_insert_variable_dropdown_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, insert_variable_dropdown_button, logger, "insert_variable_dropdown_button");}

    @FindBy(xpath = "//a[normalize-space()='Current Date']")
    WebElement variable_dropdown_value;
    public void click_variable_dropdown_date_value() {
        ReusableMethodsLoggersPOM.clickMethod(driver, variable_dropdown_value, logger, "variable_dropdown_value");}


    @FindBy(xpath = "//*[@value='Save']")
    WebElement saveButton;

    public void clickSave() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveButton, logger, "save button");
    }

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement saveButton2;

    public void clickSave2() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveButton2, logger, "save button2");
    }

    @FindBy(xpath = "//div[@class='alert alert-notice']")
    WebElement alertMessage;
    public void captureAlertMessage() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, alertMessage, logger, "alert message ");}
    @FindBy(xpath = "//div[contains(text(),'been created')]")
    WebElement alertMessage_created;
    public void capture_created_AlertMessage() {
         ReusableMethodsLoggersPOM.captureTextMethod(driver, alertMessage_created, logger, "item created alert message ");
    }

    @FindBy(xpath = "//div[contains(text(), 'Instruction was successfully created')]")
    WebElement alertMessage_instructionText;
    public void verify_instructionText_alertMessage() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_instructionText, true,  logger, "alertMessage_instructionText");}

    @FindBy(xpath = "//div[contains(text(), 'WordBank assignments updated')]")
    WebElement alertMessage_wordBank;
    public void verify_wordBank_AlertMessage() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_wordBank, true,  logger, "alertMessage_wordBank");}
    @FindBy(xpath = "//div[contains(text(), 'Your Excel file will be generated momentarily. It will appear in your notifications when ready.')]")
    WebElement alertMessage_excelFile;
    public void verify_excel_AlertMessage() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_excelFile, true,  logger, "alertMessage_excelFile");}

    @FindBy(xpath = "//div[contains(text(), 'Your PDF will be generated momentarily. It will appear in your notifications when ready.')]")
    WebElement alertMessage_PDF;
    public void verify_PDF_AlertMessage() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_PDF, true,  logger, "alertMessage_PDF");}

    @FindBy(xpath = "//div[contains(text(), 'Item deleted successfully.')]")
    WebElement alertMessage_deleteItem;
    public void verify_alertMessage_deleteItem() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_deleteItem, true,  logger, "alertMessage_deleteItem");}


    @FindBy(xpath = "//div[contains(text(), 'Item was successfully restored.')]")
    WebElement alertMessage_item_restored;
    public void verify_alertMessage_item_restored() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_item_restored, true,  logger, "alertMessage_item_restored");}

    @FindBy(xpath = "//div[contains(text(), 'Quire has submitted your request for processing. You will be notified when your documents are ready')]")
    WebElement alertMessage_submitted_for_request;
    public void verify_alertMessage_submitted_for_request() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_submitted_for_request, true,  logger, "alertMessage_submitted_for_request");}

    @FindBy(xpath = "//div[contains(text(), 'Package Summary Item was successfully updated')]")
    WebElement alertMessage_projectSummary;
    public void verify_alertMessage_projectSummary() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_projectSummary, true,  logger, "alertMessage_projectSummary");}

    @FindBy(xpath = "//div[contains(text(), 'Report Status updated')]")
    WebElement alertMessage_reportStatus;
    public void verify_alertMessage_reportStatus() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_reportStatus, true,  logger, "alertMessage_reportStatus");}

    @FindBy(xpath = "//div[contains(text(), 'Report tag was successfully updated')]")
    WebElement alertMessage_reportTag;
    public void verify_alertMessage_reportTag() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_reportTag, true,  logger, "alertMessage_reportTag");}

    @FindBy(xpath = "//div[contains(text(), 'Template was deleted')]")
    WebElement alertMessage_templateDeleted;
    public void verify_alertMessage_templateDeleted() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, alertMessage_templateDeleted, true,  logger, "alertMessage_templateDeleted");}


    @FindBy(xpath = "//a[text()='here']")
    WebElement hereLink;
    public void clickHereLinkTemplate() throws InterruptedException {
        try {
            ReusableMethodsLoggersPOM.clickMethod(driver, hereLink, logger, "here link");
            } catch (Exception e) {
            Thread.sleep(1000);
            driver.navigate().refresh();
            Thread.sleep(1000);
            driver.navigate().refresh();
            Thread.sleep(1000);

            BaseClass.reportfoldersection().enterSearchField_QA();
            Thread.sleep(3500);
           BaseClass.reportfoldersection().clickReportsFirstLink();
        }
    }

    public void clickHereLinkReport() throws InterruptedException {
        try {
            ReusableMethodsLoggersPOM.clickMethod(driver, hereLink, logger, "here link");
        } catch (Exception e) {
            Thread.sleep(1000);
            driver.navigate().refresh();
            BaseClass.pca_xml_section().clickFirstTemplateLink();
        }
    }


    @FindBy(xpath = "//*[contains(@href,'/projects/')]")
    WebElement prevProjectButton;
    public void clickPrevProjectButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, prevProjectButton, logger, "prev project link");
    }

    @FindBy(xpath = "//a[contains(text(),'Template Settings')]")
    WebElement templateSettingsButton;
    public void clickTemplateSettingsButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettingsButton, logger, "templateSettingsButton");}

    @FindBy(xpath = "//a[normalize-space()='Details']")
    WebElement templateSettings_detailsTab;
    public void click_templateSettings_detailsTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettings_detailsTab, logger, "templateSettings_detailsTab");}


    @FindBy(xpath = "//label[@for='template_disabled']/input[@type='checkbox']")
    WebElement templateSettings_disabled_checkbox;
    public void click_templateSettings_disabled_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettings_disabled_checkbox, logger, "templateSettings_disabled_checkboxZ");}


    @FindBy(xpath = "//a[contains(text(),'Packages')]")
    WebElement templateSettings_PackagesTab;
    public void clickTemplateSettings_PackagesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettings_PackagesTab, logger, "templateSettings_PackagesTab");
    }

    @FindBy(xpath = "//div[@class='form-group list-manager custom-packages']//input[@id='unassigned_items_search']")
    WebElement templateSettings_PackagesTab_SearchField;


    public void enterTemplateSettings_PackagesTab_SearchField_ESA() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, templateSettings_PackagesTab_SearchField, "FNMA XML Data Standard (ESA)" ,logger, "templateSettings_PackagesTab_SearchField_ESA");
    }

    public void enterTemplateSettings_PackagesTab_SearchField_SRA() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateSettings_PackagesTab_SearchField, "FNMA XML Data Standard (SRA)" ,logger, "templateSettings_PackagesTab_SearchField_SRA");
    }

    public void enterTemplateSettings_PackagesTab_SearchField_ZON() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, templateSettings_PackagesTab_SearchField, "FNMA XML Data Standard (ZON)" ,logger, "templateSettings_PackagesTab_SearchField_ZON");
    }


    public void enter_PackagesTab_SearchField_ESA_CA() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, templateSettings_PackagesTab_SearchField, "Quire ESA Condition Action" ,logger, "templateSettings_PackagesTab_SearchField_ESA");
    }

    @FindBy(xpath = "//div[@class='assignmentList-itemName']")
    WebElement templateSettings_PackagesTab_clickFirstDropDownItem;
    public void clickTemplateSettings_PackagesTab_clickFirstDropDownItem() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettings_PackagesTab_clickFirstDropDownItem, logger, "templateSettings_PackagesTab_clickFirstDropDownItem");}


    @FindBy(xpath = "//div[@class='form-group list-manager custom-packages']//button[@type='button'][normalize-space()='Add']")
    WebElement templateSettings_PackagesTab_addPackage_button;

    public void clickTemplateSettings_PackagesTab_addPackage_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettings_PackagesTab_addPackage_button, logger, "templateSettings_PackagesTab_addPackage_button");
    }

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement templateSettings_SaveButton;

    public void clickTemplateSettings_SaveButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, templateSettings_SaveButton, logger, "templateSettings_SaveButton");
    }


    @FindBy(xpath = "//a[@data-method='delete']")
    WebElement deleteToTrashButton;

    public void clickdeleteToTrash() {
        ReusableMethodsLoggersPOM.clickMethod(driver, deleteToTrashButton, logger, "deleteToTrashButton");
    }

    @FindBy(xpath = "//i[@class='fa fa-exclamation-circle fa-lg fa-fw']")
    WebElement greyIcon;
    public void clickGreyIcon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, greyIcon, logger, "greyIcon");
    }

    @FindBy(xpath = "(//i[@class='fa fa-exclamation-circle fa-lg fa-fw'])[2]")
    WebElement grey_instruction_Icon_template;
    public void click_grey_instruction_Icon_template() {
        ReusableMethodsLoggersPOM.clickMethod(driver, grey_instruction_Icon_template, logger, "grey_instruction_Icon_template");
    }

    @FindBy(xpath = "//section[@id='instruction_editor']")
    WebElement AddContentRow_instruction;

    public void clickAddContentRow_instruction() {
        ReusableMethodsLoggersPOM.clickMethod(driver, AddContentRow_instruction, logger, "AddContentRow_instruction");
    }

    @FindBy(xpath = "//section[@class='intro-section editor-section lockable js-spellCheckContent']")
    WebElement addContentRow;
    public void clickAddContentRow_introPages() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addContentRow, logger, "addContentRow");}

    public void enter_text_ContentRow_introPages() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, addContentRow,"QA Automationn Testing Script - Spell Check Check Section_" , logger, "text_body");}

    @FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
    WebElement reference_tag_ck5_iFrame;
    public void switchTo_instruction_text_ck5_iFrame() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, reference_tag_ck5_iFrame, logger, "reference_tag_ck5_iFrame ");
    }


    @FindBy(xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[2]")
    WebElement wordBank_text_field_ck5_iFrame;
    public void switchTo_wordBank_text_field_ck5_iFrame() {
        ReusableMethodsLoggersPOM.switch_to_iFrame(driver, wordBank_text_field_ck5_iFrame, logger, "wordBank_text_field_ck5_iFrame ");
    }

       @FindBy(xpath = "//body")
    WebElement instruction_text_iFrame;
    public void enter_instruction_text_iFrame() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_iFrame, "QA Test Automation - Instructions", logger, "instruction_text_iFrame");
    }

    @FindBy(xpath = "//p[normalize-space()='QA Test Automation - Instructions']")
    WebElement instruction_text_modal;
    public void verify_instruction_text_modal() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, instruction_text_modal, true,  logger, "instruction_text_modal");
        BaseClass.staging5().click_cancelButton_profile();

    }

    public void enter_wb_text_iFrame() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_iFrame, "QA Test Automation - WordBank Creation Text", logger, "wb_text_iFrame");
    }

    public void enter_spellCheck_text_iFrame() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod2(driver, instruction_text_iFrame, "QA Automationn Testing Script - Spell Check Check Section ", logger, "instruction_text_iFrame");
    }


    String className = this.getClass().getSimpleName();
    DateFormat formatTime = new SimpleDateFormat("HH_mm_ss");
    DateFormat formatHour = new SimpleDateFormat("HH");

    Date systemDate = new Date();
    String timeOfSystem = formatTime.format(systemDate);
    String hourOfSystem = formatHour.format(systemDate);

    public void enter_spellCheck_text_time_iFrame() {
        ReusableMethodsLoggersPOM.clickMethod(driver, instruction_text_iFrame, logger, "text body_iFrame");

        ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_iFrame, "QA Automationn Testing Script - Spell Check Check Section " + timeOfSystem, logger, "instruction_text_iFrame");
    }

    @FindBy(xpath = "//p[contains(text(),'QA Automationn Testing Script - Spell Check Check') and contains(text(), '_')]")
    WebElement spellCheck_text;
    public void verify_spellCheck_text() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, spellCheck_text, true,  logger, "spellCheck_text");}



    public void double_click_body_iFrame() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, instruction_text_iFrame, logger, "select all text_iFrame");
    }
    public void select_all_body_and_delete_iFrame() {
        ReusableMethodsLoggersPOM.clearMethod(driver, instruction_text_iFrame, logger, "text body_iFrame");
    }
    @FindBy(xpath = "//span[contains(@class, 'mceNonEditable reportTag ck') and contains(@class, 'widget')]")
    WebElement report_tag_iframe;
    public void double_click_report_tag_iframe() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, report_tag_iframe, logger, "report_tag_iframe");
    }


    @FindBy(xpath = "(//span[contains(@class, 'mceNonEditable reportTag ck') and contains(@class, 'widget')])[2]")
    WebElement second_report_tag_iframe;
    public void double_click_second_report_tag_iframe() {
        ReusableMethodsLoggersPOM.doubleClickMethod(driver, second_report_tag_iframe, logger, "second_report_tag_iframe");
    }

    public void select_all_and_backspace_Section_section_row_iFrame() throws InterruptedException {
        //Actions mouseActions = new Actions(driver);
        String os = System.getProperty("os.name").toLowerCase();
        String selectAllKey = (os.contains("mac")) ? Keys.chord(Keys.COMMAND, "a") : Keys.chord(Keys.CONTROL, "a");
        instruction_text_iFrame.sendKeys(selectAllKey);
       // mouseActions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(500);
      //  mouseActions.sendKeys(Keys.BACK_SPACE).perform();
        instruction_text_iFrame.sendKeys(String.valueOf(Keys.BACK_SPACE));
        Thread.sleep(500);

    }

    public void select_all_and_backspace_Section2_row_editor_() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_iFrame, Keys.CONTROL + "a",logger, "section2_row_editor ");
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, instruction_text_iFrame, String.valueOf(Keys.BACK_SPACE),logger, "section2_row_editor ");
    }

    @FindBy(xpath = "//span[@class='mceNonEditable reportTag']")
    WebElement report_tag_text;
    public void capture_section_row_editor() {
        ReusableMethodsLoggersPOM.captureTextMethod(driver, report_tag_text, logger, "report_tag_text ");
    }

    @FindBy(xpath = "//body[@class='reports CT-hide quire-smart-table-editor cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
    WebElement cell_text_iFrame;

    public void click_escape_cell_iFrame() {
        ReusableMethodsLoggersPOM.escapeMethod(driver, cell_text_iFrame, logger, "cell_iFrame");
    }



//    @FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
//
//    WebElement text_field_iFrame;
//
//    public void enter_text_field_iFrame() {
//       // ReusableMethodsLoggersPOM.sendKeysMethod(driver, text_field_iFrame, "QA Test Automation - Instructions", logger, "text_field_iFrame");
//        ReusableMethodsLoggersPOM.sendKeysMethod(driver, reference_tag_ck5_iFrame, "QA Test Automation - Instructions", logger, "reference_tag_ck5_iFrame");
//
//    }

    @FindBy(xpath = "//a[@class='instruction-link has-instruction']")
    List<WebElement> instructions_associated;

    @FindBy(xpath = "//section[@class='switchboard CT-hide']//i[@class='fa fa-exclamation-circle fa-lg fa-fw']")
    //a[@id='cover_letter_instruction_431988']//i[@class='fa fa-exclamation-circle fa-lg fa-fw']
   WebElement yellow_instruction_icon_introPage;

    public void capture_number_of_instructionItems_associated() {

        System.out.println("\n" + "There are: " + instructions_associated.size() + " yellow sections with instruction items" + "\n");
        logger.log(LogStatus.PASS, "There are:  " + instructions_associated.size() + "yellow sections with instruction items" + "\n");
    }

    public void verify_yellow_instruction_icon_introPages_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, yellow_instruction_icon_introPage, true,  logger, "yellow_instruction_icon_introPage ");
    }
    public void click_yellow_instruction_icon_introPages() {
        ReusableMethodsLoggersPOM.clickMethod(driver, yellow_instruction_icon_introPage ,logger, "yellow_instruction_icon_introPage");}


    @FindBy(xpath = "//a[@class='instruction-link has-instruction']")
    WebElement yellow_instruction_icon_defaultSection;
    public void click_yellow_instruction_defaultSection_icon() {
        ReusableMethodsLoggersPOM.clickMethod(driver, yellow_instruction_icon_defaultSection ,logger, "yellow_instruction_icon");}

    public void verify_yellow_instruction_icon_default_section_is_Visible() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, yellow_instruction_icon_defaultSection, true,  logger, "yellow_instruction_icon ");
    }

    @FindBy(xpath = "//input[@id='template_import_content_true']")
    WebElement import_from_word_template;
    public void click_import_from_word_template_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, import_from_word_template ,logger, "import_from_word_template");}

    String insert_file_1 = "(//input[@type='file'])[1]";
    public void upload_word_file() {
        ReusableMethodsLoggersPOM.uploadFileMethod(driver, insert_file_1, "Smart_table_partial.docx", logger, "upload_word_file");
    }

    @FindBy(xpath = "//label[normalize-space()='Clone Existing Template:']")
    WebElement clone_existing_template_checkbox;
    public void click_clone_existing_template_checkbox() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clone_existing_template_checkbox ,logger, "clone_existing_template_checkbox");}


    @FindBy(xpath = "//div[@id='source_template_control']//span[@class='input-group-addon dropdown-action']")
    WebElement clone_template_dropdown;
    public void click_clone_template_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clone_template_dropdown ,logger, "clone_template_dropdown");
    }

    @FindBy(xpath = "//li[@class='list-group-item'][normalize-space()='QA Automation Testing FM_1104 Template-Chrome']")
    WebElement clone_existing_template_first_fm_1104_dropdown_chrome;
    @FindBy(xpath = "//li[@class='list-group-item'][normalize-space()='QA Automation Testing FM_1104 Template-Firefox']")
    WebElement clone_existing_template_first_fm_1104_dropdown_ff;
    public void click_clone_existing_template_fm_1104_dropdown() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, clone_existing_template_first_fm_1104_dropdown_chrome ,logger, "clone_existing_template_first_fm_1104_dropdown_chrome");
    } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, clone_existing_template_first_fm_1104_dropdown_ff ,logger, "clone_existing_template_first_fm_1104_dropdown_ff");
    }}

    @FindBy(xpath = "(//li[@class='list-group-item'][normalize-space()='QA Automation Testing New Updated Medium Priority Template-Chrome'])[1]")
    WebElement clone_existing_template_mediumPriority_chrome;
    @FindBy(xpath = "(//li[@class='list-group-item'][normalize-space()='QA Automation Testing New Updated Medium Priority Template-Firefox'])[1]")
    WebElement clone_existing_template_mediumPriority_ff;


    public void click_clone_updated_template_mediumPriority() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, clone_existing_template_mediumPriority_chrome ,logger, "clone_existing_template_mediumPriority");
        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.clickMethod(driver, clone_existing_template_mediumPriority_ff ,logger, "clone_existing_template_mediumPriority");
        }}


    @FindBy(xpath = "//*[@class='list-group dropdown-list']/li")
    WebElement clone_existing_report_first_dropdown;
    public void click_clone_existing_report_first_dropdown() {
        ReusableMethodsLoggersPOM.clickMethod(driver, clone_existing_report_first_dropdown ,logger, "clone_existing_report_first_dropdown");}


    //  @FindBy(xpath = "//*[@class='htLeft q-readonly current highlight']")
    //  WebElement dateCreatedReport;

//    public void captureRecentFolderDateCreated() {
//        //String reportDate= dateCreatedReport.getAttribute("text");
//       // System.out.println("date created: " + reportDate);
//        String result2 = ReusableMethodsLoggersPOM.captureTextMethod(driver, dateCreatedReport, logger, "date created message ");
//        System.out.println("\n" + "Date Created: " + result2);
//    }


}







