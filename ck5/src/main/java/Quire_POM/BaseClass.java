package Quire_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import reusableLibrary.ReusableAnnotations;


public class BaseClass extends ReusableAnnotations {
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    //static WebDriver driver;
    WebDriver driver = getDriver();

    public BaseClass(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }//end of constructor

    //for each page object class we must create a static reference to make each class static for the test class


    //create static reference for quire home page
    public static QuireHome quireHome() {
        WebDriver driver = getDriver();
        QuireHome quireHome = new QuireHome(driver);
        return quireHome;
    }//end of static reference for GoogleHome class

    public static QuireHome_New quireHomeNew() {
        WebDriver driver = getDriver();
        QuireHome_New quireHomeNew = new QuireHome_New(driver);
        return quireHomeNew;
    }//end of static reference for GoogleHome class

    //create static reference for quire staging5 dashboard
    public static Staging5 staging5() {
        WebDriver driver = getDriver();
        Staging5 staging5 = new Staging5(driver);
        return staging5;
    }//end of static reference for GoogleHome class
    
    //create static reference for PDF verification helper
    public static PDFVerificationHelper pdfVerification() {
        PDFVerificationHelper pdfHelper = new PDFVerificationHelper(ReusableAnnotations.logger);
        return pdfHelper;
    }//end of static reference for PDF verification


    public static QuireLogin quireLogin() {
        WebDriver driver = getDriver();
        QuireLogin quireLogin = new QuireLogin(driver);
        return quireLogin;
    }//end of static reference for GoogleHome class

    public static TemplatesSection templatesSection() {
        WebDriver driver = getDriver();
        TemplatesSection templatesSection = new TemplatesSection(driver);
        return templatesSection;
    }//end of static reference for GoogleHome class

    public static ProjectFolderSection projectFolderSection() {
        WebDriver driver = getDriver();
        ProjectFolderSection projectFolderSection = new ProjectFolderSection(driver);
        return projectFolderSection;
    }//end of static reference for GoogleHome class

    public static PCA_XML_Section pca_xml_section() {
        WebDriver driver = getDriver();
        PCA_XML_Section pca_xml_section = new PCA_XML_Section(driver);
        return pca_xml_section;
    }//end of static reference for GoogleHome class

    public static ESA_XML_Section esa_xml_section() {
        WebDriver driver = getDriver();
        ESA_XML_Section esa_xml_section = new ESA_XML_Section(driver);
        return esa_xml_section;
    }

    public static SRA_XML_Section sra_xml_section() {
        WebDriver driver = getDriver();
        SRA_XML_Section sra_xml_section = new SRA_XML_Section(driver);
        return sra_xml_section;
    }

    public static ZON_XML_Section zon_xml_section() {
        WebDriver driver = getDriver();
        ZON_XML_Section zon_xml_section = new ZON_XML_Section(driver);
        return zon_xml_section;
    }


    public static ReportFolderSection reportfoldersection() {
        WebDriver driver = getDriver();
        ReportFolderSection reportfoldersection = new ReportFolderSection(driver);
        return reportfoldersection;
    }//end of static reference for G

    public static ReportTagsSection reporttagssection() {
        WebDriver driver = getDriver();
        ReportTagsSection reporttagssection = new ReportTagsSection(driver);
        return reporttagssection;
    }

    public static CK5Editor ck5editor() {
        WebDriver driver = getDriver();
        CK5Editor ck5editor = new CK5Editor(driver);
        return ck5editor;
    }

    public static DashBoard dashBoard() {
        WebDriver driver = getDriver();
        DashBoard dashBoard = new DashBoard(driver);
        return dashBoard;
    }//end of static reference for GoogleHome class

    public static SmartTables smartTables() {
        WebDriver driver = getDriver();
        SmartTables smartTables = new SmartTables(driver);
        return smartTables;
    }//end of static reference for GoogleHome class

    public static Quire_AI quire_AI() {
        WebDriver driver = getDriver();
        Quire_AI quire_AI = new Quire_AI(driver);
        return quire_AI;
    }

    public static FM_Section fm_section() {
        WebDriver driver = getDriver();
        FM_Section fm_section = new FM_Section(driver);
        return fm_section;
    }

    public static Company_Connections company_connections() {
        WebDriver driver = getDriver();
        Company_Connections company_connections = new Company_Connections(driver);
        return company_connections;

    }
}