package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;
import reusableLibrary.ReusableMethodsLoggersPOM;

public class QuireLogin extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;

    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public QuireLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor

    @FindBy(xpath = "//*[@id='user_identifier']")
    WebElement userID;

    @FindBy(xpath = "//*[text()='Next']")
    WebElement nextButton;

    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[text()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//input[@value='Sign In']")
    WebElement sign_in_button;
    WebDriver driver = getDriver();

    String browserName = driver.getClass().getSimpleName();

    public void clearEmail() {
        ReusableMethodsLoggersPOM.clearMethod(driver, loginButton, logger, "email ID");
    }




    public void enter_sysadmin_testingInc_email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_sysadmin@quiretest.com", logger, "test sysadmin ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_sysadmin2@quiretest.com", logger, "test sysadmin ID");
        }}

    public void enter_admin_matrix_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "test2_matrix@quiretest.com", logger, "test sysadmin ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_admin_matrix2@quiretest.com", logger, "test sysadmin ID");
        }}

    public void enterProdEmail() {
        if (browserName.contains("Chrome")) {

            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "ijsysadminmatrix@quiretest.com", logger, "prod sysadmin email ID");
    } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_sysadmin_matrix@quiretest.com", logger, "prod sysadmin email ID");

        }}
    public void enterProdEmail2() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, userID, "ijsysadminmatrix@quiretest.com", logger, "prod sysadmin email ID");}

    public void enter_admin_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_admin@quiretest.com", logger, "Admin Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_admin2@quiretest.com", logger, "test admin 2 ID");
        }}

    public void enter_author_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_author@quiretest.com", logger, "Author Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_author2@quiretest.com", logger, "Author2 Email ID");
        }}

    public void enter_author_BV_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_author_bv@quiretest.com", logger, "BV Author Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_author_bv2@quiretest.com", logger, "BV Author2 Email ID");
        }}



    public void enter_editor_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_editor@quiretest.com", logger, "Editor Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_editor2@quiretest.com", logger, "Editor2 Email ID");
        }}

    public void enter_editor_BV_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_editor_bv@quiretest.com", logger, "bv Editor Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_editor_bv2@quiretest.com", logger, "bv Editor2 Email ID");
        }}



    public void enter_contractor_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qacontractor4@quiretest.com", logger, "Contractor Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qacontractor_2@quiretest.com", logger, "Contractor2 Email ID");
        }}
    public void enter_contractor_prod_Email() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qacontractor@quiretest.com", logger, "Contractor Email ID");
    }

    public void enter_pm_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_pm@quiretest.com", logger, "PM Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_pm2@quiretest.com", logger, "PM2 Email ID");
        }}

    public void enter_pm_BV_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_pm_bv@quiretest.com", logger, "bv PM Email ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_pm_bv2@quiretest.com", logger, "bv PM2 Email ID");
        }}

    public void enterRootUserEmail() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "ibrarj@openquire.com", logger, "root user ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_root_user@quiretest.com", logger, "qa root 2  ID");
        }}


    public void enterEmail_test2_admin_level() {
            if (browserName.contains("Chrome")) {
                ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "test2@quiretest.com", logger, "test2 admin ID");
            } else if (browserName.contains("Firefox")) {
                ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "test@quiretest.com", logger, "test admin ID");
            }}

    public void enterEmail_bv_admin_level() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_admin_bv@quiretest.com", logger, "bv admin ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_admin_bv2@quiretest.com", logger, "bv admin ID");
        }}

    public void enterEmail_bv_sysadmin_level() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_sysadmin_bv@quiretest.com", logger, "bv  sysadmin ID");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_sysadmin_bv2@quiretest.com", logger, "bv sysadmin ID");
        }}

    public void enterEmail_admin_atlas() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_admin_atlas@quiretest.com", logger, "automation_admin_atlas");
        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_admin_atlas2@quiretest.com", logger, "automation_admin_atlas");
        }}
    public void enterEmail_sysadmin_atlas() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_sysadmin_atlas@quiretest.com", logger, "automation_sysadmin_atlas");
        } else if (browserName.contains("Firefox")) {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_sysadmin_atlas2@quiretest.com", logger, "automation_sysadmin_atlas");
        }}

    public void enter_cbre_sysadmin_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_sysadmin_cbre@quiretest.com", logger, "automation_sysadmin_cbre");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "automation_sysadmin_cbre@quiretest.com", logger, "automation_sysadmin_cbre");
        }}

    public void enter_demo_sysadmin_Email() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_sysadmin_demo@quiretest.com", logger, "automation_sysadmin_cbre");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_sysadmin_demo2@quiretest.com", logger, "automation_sysadmin_cbre");
        }}

    public void enterEmail_qa_admin_aei() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_admin_aei@quiretest.com", logger, "qa_admin_aei");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_admin_aei2@quiretest.com", logger, "qa_admin_aei2");
        }}

    public void enterEmail_qa_admin_efi() {
        if (browserName.contains("Chrome")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_admin_efi@quiretest.com", logger, "qa_admin_efi");
        } else if (browserName.contains("Firefox")) {
            ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, userID, "qa_admin_efi2@quiretest.com", logger, "qa_admin_efi2");
        }}


    @FindBy(xpath = "//input[@id='identifierId']")
    WebElement gmail_ID;
    public void enter_gmail_ID() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, gmail_ID, "ibrar.openquire@gmail.com", logger, "enter_gmail id");
    }
    @FindBy(xpath = "//input[@name='Passwd']")
    WebElement gmail_pw;
    public void enter_gmail_pw() {
        ReusableMethodsLoggersPOM.sendKeysandSubmitMethod(driver, gmail_pw, "tbd", logger, "gmail_pw");
    }

    @FindBy(xpath = "//div[contains(text(),'Compose')]")
    WebElement compose_email;
    public void click_compose_email() {
        ReusableMethodsLoggersPOM.clickMethod(driver, compose_email, logger, "compose_email");
    }

    @FindBy(xpath = "//input[@aria-label='To recipients']")
    WebElement recipient_email;
    public void enter_recipient_email() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, recipient_email, "ibrarj@openquire.com", logger, "recipient_email");
    }

    @FindBy(xpath = "//input[@aria-label='Subject']")
    WebElement subject_text;
    public void enter_subject_text() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, subject_text, "System User count", logger, "subject_text");
    }

    @FindBy(xpath = "//div[@aria-label='Message Body']")
    WebElement body_text;
    public void enter_body_text() {
        ReusableMethodsLoggersPOM.sendKeysMethod(driver, body_text, "ibrarj@openquire.com", logger, "body_text");
    }

    String file_attachment = "//input[@name='Filedata']";

    public void upload_gmail_file_attachment() {
        ReusableMethodsLoggersPOM.upload_downloaded_company_files(driver, file_attachment, logger, "file_attachment");
    }

    @FindBy(xpath = "//div[@aria-label='Send']")
    WebElement send_button;
    public void click_send_button() {
        ReusableMethodsLoggersPOM.clickMethod(driver, send_button, logger, "send_button");
    }


    public void navigate_to_admin_pinnedStatus_reports() throws InterruptedException {
        BaseClass.reportfoldersection().clickReportsTab();
        BaseClass.staging5().click_modal_close_window();

        BaseClass.reportfoldersection().enterSearchField_QA_Report();
        Thread.sleep(4500);
        BaseClass.reportfoldersection().clickReportsFirstLink();
        BaseClass.staging5().click_modal_close_window();

      //  Thread.sleep(1000);
        BaseClass.projectFolderSection().click_misc_Link_ProjectFolderLink();
        BaseClass.staging5().click_modal_close_window();

     //   Thread.sleep(2000);
        //cloned fm 1104 report
        BaseClass.reportfoldersection().clickReportsFirstLink();
        BaseClass.staging5().click_modal_close_window();

     //   Thread.sleep(2000);
//        if (browserName.contains("Chrome")) {
//            driver.navigate().to("https://staging5.openquire.com/reports/666419");
//        } else if (browserName.contains("Firefox")) {
//            driver.navigate().to("https://staging5.openquire.com/reports/666418");
//        }
    }



    public void clickNextButton() {
        ReusableMethodsLoggersPOM.clickMethod(driver, nextButton, logger, "user ID Next button");
    }

    public void enterPassword() {

        ReusableMethodsLoggersPOM.sendKeysMethod(driver, password, "secret", logger, "pw");
    }


    //changed click login button to enter submit on keyboard
    public void clickLogin() {
        ReusableMethodsLoggersPOM.clickMethod(driver, loginButton, logger, "pw login button");
    }

    public void clickSignIn() {
        ReusableMethodsLoggersPOM.clickMethod(driver, sign_in_button, logger, "pw sign_in_button ");
    }

    @FindBy(xpath = "(//h1[normalize-space()=\"We're sorry, but something went wrong.\"])[1]")
    WebElement something_went_wrong;
    public void VERIFY_NO_something_went_wrong_MESSAGE() {
        ReusableMethodsLoggersPOM.verifyBooleanStatement(driver, something_went_wrong,false, logger, "something_went_wrong");
    }
}

