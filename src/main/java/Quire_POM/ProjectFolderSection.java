package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//
public class ProjectFolderSection extends ReusableAnnotations {
    //
    // must declare a local logger variable to be used for each pom class
    ExtentTest logger;
    WebDriver driver = getDriver();
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public ProjectFolderSection(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "//*[text()='Portfolios']")
    WebElement portfoliosTab;


    @FindBy(xpath = "//*[contains(text(),'Add Project Folder')]")
    WebElement addProjectFolderButton;

    public void clickAddProjectFolderButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, addProjectFolderButton, logger, "add project folder button");
    }
    String browserName = driver.getClass().getSimpleName();

    @FindBy(xpath = "//*[@name='project[name]']")
    WebElement projectFolderName;
    public void enterProjectFolderNameField_PCA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing PCA Project Folder-Chrome "+  dateOfSystem, logger, "PCA Project Folder name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing PCA Project Folder-Firefox "+ dateOfSystem, logger, "PCA Project Folder name field ff");
        }}

    public void enterProjectFolderNameField_ESA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing ESA Project Folder-Chrome "+  dateOfSystem, logger, "ESA Project Folder name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing ESA Project Folder-Firefox "+ dateOfSystem, logger, "ESA Project Folder name field ff");
        }}
    String className = this.getClass().getSimpleName();
    DateFormat formatDate = new SimpleDateFormat("(MM_dd_yyyy_HH_mm)");
    Date systemDate = new Date();
    String dateOfSystem = formatDate.format(systemDate);
    public void enterProjectFolderNameField_SRA() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing SRA Project Folder-Chrome "+  dateOfSystem, logger, "SRA Project Folder name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing SRA Project Folder-Firefox "+ dateOfSystem, logger, "SRA Project Folder name field ff");
        }}

    public void enterProjectFolderNameField_FM_1104() {
        if (browserName.contains("Chrome")) {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing Freddie Mac 1104 Project Folder-Chrome "+  dateOfSystem, logger, "1104 Project Folder name field chrome");
    } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing Freddie Mac 1104 Project Folder-Firefox "+ dateOfSystem, logger, "1104 Project Folder name field ff");
    }}

    public void enterProjectFolderNameField_FM_1105() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing Freddie Mac 1105 Project Folder_" + dateOfSystem, logger, "SRA Project Folder name field");
    }

    public void enterProjectFolderNameField_CK5() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing CK5 Project Folder-Chrome "+  dateOfSystem, logger, "CK5 Project Folder name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing CK5 Project Folder-Firefox "+ dateOfSystem, logger, "CK5 Project Folder name field ff");
        }
}

    public void enterProjectFolderNameField_New_CK5() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing New CK5 Project Folder-Chrome "+  dateOfSystem, logger, "New CK5 Project Folder name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing New CK5 Project Folder-Firefox "+ dateOfSystem, logger, "New CK5 Project Folder name field ff");
        }
    }
    public void enterProjectFolderNameField_ZON() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing ZON Project Folder-Chrome "+  dateOfSystem, logger, "ZON Project Folder name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing ZON Project Folder-Firefox "+ dateOfSystem, logger, "ZON Project Folder name field ff");
        }}

    public void enterProjectFolderNameField_Medium() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing Medium Priority Project Folder-Chrome "+  dateOfSystem, logger, "Medium Priority Project Folder name field chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderName, "QA Automation Testing Medium Priority Project Folder-Firefox "+ dateOfSystem, logger, "Medium Priority Project Folder name field ff");
        }}

    @FindBy(xpath = "//*[@name='project[description]']")
    WebElement projectFolderDescription;

    public void enterProjectFolderDescriptionField() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, projectFolderDescription, "QA Automation Testing project folder Creation", logger, "project folder description field");
    }

    @FindBy(xpath = "//*[@href='#templates-tab-content']")
    WebElement projectFolderTemplatesTab;

    public void clickProjectFolder_TemplatesTab() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolderTemplatesTab, logger, " project folder templates tab");
    }

    @FindBy(xpath = "//div[@class='project-template-assignment']//input[@id='unassigned_items_search']")
    WebElement projectFolder_Template_SearchField;

    public void enterProjectFolder_Template_SearchField() throws InterruptedException {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, projectFolder_Template_SearchField, "QA Automation", logger, "project folder-template search field ");
        Thread.sleep(1000);
        ReusableMethodsLoggersPOM.submitMethod(driver, projectFolder_Template_SearchField, logger, "project folder-template search field ");

    }

    @FindBy(xpath = "//*[contains(text(),'PCA Template-Chrome')]")
    WebElement projectFolder_QA_PCA_Template_chrome;
    @FindBy(xpath = "//*[contains(text(),'PCA Template-Firefox')]")
    WebElement projectFolder_QA_PCA_Template_firefox;
    public void click_PCA_Template_projectFolder_templatesTab() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_QA_PCA_Template_chrome, logger, "QA PCA template chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_QA_PCA_Template_firefox, logger, "QA PCA template firefox");
        }
    }

    @FindBy(xpath = "//*[contains(text(),'ESA Template')]")
    WebElement projectFolder_ESA_Template;
//    @FindBy(xpath = "//*[contains(text(),'ESA Template-Firefox')]")
//    WebElement projectFolder_ESA_Template_ff;
    public void click_ESA_Template_projectFolder_templatesTab() {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_ESA_Template, logger, "QA esa template");
        }

    @FindBy(xpath = "//div[contains(text(),'FM_1104 Template-Chrome')]")
    WebElement projectFolder_FM_1104_Template_chrome;
    @FindBy(xpath = "//div[contains(text(),'FM_1104 Template-Firefox')]")
    WebElement projectFolder_FM_1104_Template_ff;
    public void click_FM_1104_Template_projectFolder_templatesTab() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_FM_1104_Template_chrome, logger, "QA fm1104 template chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_FM_1104_Template_ff, logger, "QA fm1104 template firefox");
        }}

//    @FindBy(xpath = "//*[contains(text(),'FM_1105 Template')]")
//    WebElement projectFolder_FM_1105_Template;
//    public void click_FM_1105_Template_projectFolder_templatesTab() {
//        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_FM_1105_Template, logger, "FM 1105 template");
//    }

    @FindBy(xpath = "//*[contains(text(),'SRA Template-Chrome')]")
    WebElement projectFolder_SRA_Template_chrome;
    @FindBy(xpath = "//*[contains(text(),'SRA Template-Firefox')]")
    WebElement projectFolder_SRA_Template_ff;
    public void click_SRA_Template_projectFolder_templatesTab() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_SRA_Template_chrome, logger, "QA sra template chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_SRA_Template_ff, logger, "QA sra template firefox");
        }}

    @FindBy(xpath = "//*[contains(text(),'ZON Template-Chrome')]")
    WebElement projectFolder_ZON_Template_chrome;
    @FindBy(xpath = "//*[contains(text(),'ZON Template-Firefox')]")
    WebElement projectFolder_ZON_Template_ff;
    public void click_ZON_Template_projectFolder_templatesTab() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_ZON_Template_chrome, logger, "QA zon template chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_ZON_Template_ff, logger, "QA zon template firefox");
        }}

    @FindBy(xpath = "//div[contains(text(),'CK5 Template-Chrome')]")
    WebElement projectFolder_CK5_Template_chrome;
    @FindBy(xpath = "//div[contains(text(),'CK5 Template-Firefox')]")
    WebElement projectFolder_CK5_Template_ff;
    public void click_CK5_Template_projectFolder_templatesTab() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_CK5_Template_chrome, logger, "QA ck5 template chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_CK5_Template_ff, logger, "QA ck5 template firefox");
        }}

    @FindBy(xpath = "//div[contains(text(),'Testing New CK5 Template-Chrome')]")
    WebElement projectFolder_New_CK5_Template_chrome;
    @FindBy(xpath = "//div[contains(text(),'Testing New CK5 Template-Firefox')]")
    WebElement projectFolder_New_CK5_Template_ff;
    public void click_CK5_Template_projectFolder_New_templatesTab() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_New_CK5_Template_chrome, logger, "QA new ck5 template chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_New_CK5_Template_ff, logger, "QA new ck5 template firefox");
        }}


    @FindBy(xpath = "//div[@class='project-template-assignment']//button[@type='button'][normalize-space()='Add']")
    WebElement projectFolder_AddTemplateButton;
    public void clickProjectFolder_AddTemplateButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_AddTemplateButton, logger, "Project Folder Add template button");
    }




    @FindBy(xpath = "//span[contains(text(),'PCA Project Folder-Firefox')]")
    WebElement projectFolder_PCA_Link_ff;
    @FindBy(xpath = "//span[contains(text(),'PCA Project Folder-Chrome')]")
    WebElement projectFolder_PCA_Link_chrome;
    public void click_PCA_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_PCA_Link_chrome, logger, "project folder PCA link");

        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_PCA_Link_ff, logger, "project folder PCA link");
        }
    }

    @FindBy(xpath = "//span[contains(text(),'ESA Project Folder-Firefox')]")
    WebElement projectFolder_ESA_Link_ff;
    @FindBy(xpath = "//span[contains(text(),'ESA Project Folder-Chrome')]")
    WebElement projectFolder_ESA_Link_chrome;
    public void click_ESA_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_ESA_Link_chrome, logger, "project folder esa link chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_ESA_Link_ff, logger, "project folder PCA link ff");
        }}


    @FindBy(xpath = "//*[contains(text(),'SRA Project Folder-Chrome')]")
    WebElement projectFolder_SRA_Link_chrome;
    @FindBy(xpath = "//*[contains(text(),'SRA Project Folder-Firefox')]")
    WebElement projectFolder_SRA_Link_ff;

    public void click_SRA_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_SRA_Link_chrome, logger, "project folder sra link chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_SRA_Link_ff, logger, "project folder sra link ff");
        }}

    @FindBy(xpath = "//span[contains(text(),'CK5 Project Folder-Chrome')]")
    WebElement projectFolder_CK5_Link_chrome;
    @FindBy(xpath = "//span[contains(text(),'CK5 Project Folder-Firefox')]")
    WebElement projectFolder_CK5_Link_ff;

    public void click_CK5_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_CK5_Link_chrome, logger, "project folder ck5 link chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_CK5_Link_ff, logger, "project folder ck5 link ff");
        }}

    @FindBy(xpath = "//*[contains(text(),'New CK5 Project Folder-Chrome')]")
    WebElement projectFolder_new_CK5_Link_chrome;
    @FindBy(xpath = "//*[contains(text(),'New CK5 Project Folder-Firefox')]")
    WebElement projectFolder_new_CK5_Link_ff;

    public void click_new_CK5_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_new_CK5_Link_chrome, logger, "project folder new ck5 link chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_new_CK5_Link_ff, logger, "project folder new ck5 link ff");
        }}

    @FindBy(xpath = "//span[contains(text(),'ZON Project Folder-Chrome')]")
    WebElement projectFolder_ZON_Link_chrome;
    @FindBy(xpath = "//span[contains(text(),'ZON Project Folder-Firefox')]")
    WebElement projectFolder_ZON_Link_ff;
    public void click_ZON_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_ZON_Link_chrome, logger, "project folder ck5 link chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.scrollandClickMethod(driver, projectFolder_ZON_Link_ff, logger, "project folder ck5 link ff");
        }}

    public void verify_ZON_ProjectFolderLink_isNotVisible() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, projectFolder_ZON_Link_chrome, false, logger, "projectFolder_ZON_Link_chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, projectFolder_ZON_Link_ff, false, logger, "projectFolder_ZON_Link_ff");
        }}



    @FindBy(xpath = "//span[contains(text(),'Freddie Mac 1104 Project Folder-Chrome')]")
    WebElement projectFolder_FM_1104_Link_chrome;
    @FindBy(xpath = "//span[contains(text(),'Freddie Mac 1104 Project Folder-Firefox')]")
    WebElement projectFolder_FM_1104_Link_ff;
    public void click_FM_1104_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_FM_1104_Link_chrome, logger, "project folder fm1104 link chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_FM_1104_Link_ff, logger, "project folder fm1104 link ff");
        }}

    @FindBy(xpath = "//*[contains(text(),'Medium Priority Project Folder-Chrome')]")
    WebElement projectFolder_medium_priority_Link_chrome;
    @FindBy(xpath = "//*[contains(text(),'Medium Priority Project Folder-Firefox')]")
    WebElement projectFolder_medium_priority_Link_ff;
    public void click_medium_priority_ProjectFolderLink() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_medium_priority_Link_chrome, logger, "project folder Medium Priority link chrome");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.clickMethod(driver, projectFolder_medium_priority_Link_ff, logger, "project folder Medium Priority link ff");
        }}

    @FindBy(xpath = "//*[text()='Shared Reports']")
    WebElement sharedReportsTab;




    @FindBy(xpath = "//*[@value='Save']")
    WebElement saveButton;

    public void clickSave() {
        ReusableMethodsLoggersPOM.clickMethod(driver, saveButton, logger, "save button");
    }


    @FindBy(xpath = "//*[@class='alert alert-notice']")
    WebElement alertMessage;
    public void captureAlertMessage() {
       String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, alertMessage, logger, "alert message ");
        System.out.println("Alert Message: " + result);
    }
    @FindBy(xpath = "//a[text()='here']")
    WebElement hereLink;
    public void clickHereLink() {
        ReusableMethodsLoggersPOM.clickMethod(driver, hereLink, logger, "here link");
    }

    @FindBy(xpath = "//i[@class='fa fa-folder']")
    WebElement prevProjectButton;
    public void clickPrevProjectButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, prevProjectButton, logger, "prev project link");
    }
    @FindBy(xpath = "//*[@class='edit-link-text']")
    WebElement recentReportName;
    public void captureRecentReportName() {
        String result = ReusableMethodsLoggersPOM.captureTextMethod(driver, recentReportName, logger, "recent report name ");
        System.out.println("\n" + "Report name: " + result);}

    @FindBy(xpath = "//span[contains(text(),'2023 QA Report')]")
    WebElement projectFolderLink_2023QAReport;
    public void clickProjectFolderLink_2023QAReport() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolderLink_2023QAReport, logger, "projectFolderLink_2023QAReport");}

    @FindBy(xpath = "//span[contains(text(),'QA Automation Testing Medium Priority Project Folder')]")
    WebElement projectFolderLink_MediumPriority;
    public void click_projectFolderLink_MediumPriority() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolderLink_MediumPriority, logger, "projectFolderLink_MediumPriority");}


    @FindBy(xpath = "//a[normalize-space()='Project Folder Settings']")
    WebElement projectFolderSettings_button;
    public void click_projectFolderSettings_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, projectFolderSettings_button, logger, "projectFolderSettings_button");
    }
  //  @FindBy(xpath = "//*[@class='htLeft q-readonly current highlight']")
  //  WebElement dateCreatedReport;

//    public void captureRecentFolderDateCreated() {
//        //String reportDate= dateCreatedReport.getAttribute("text");
//       // System.out.println("date created: " + reportDate);
//        String result2 = ReusableMethodsLoggersPOM.captureTextMethod(driver, dateCreatedReport, logger, "date created message ");
//        System.out.println("\n" + "Date Created: " + result2);
//    }


}







