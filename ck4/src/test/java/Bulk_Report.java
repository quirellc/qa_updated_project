import Quire_POM.BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import reusableLibrary.ReusableAnnotations;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Bulk_Report extends ReusableAnnotations  {
	WebDriver driver = getDriver();
    //@BeforeTest
    @Test
    public void TR_001_User_Login() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
      driver.navigate().to("https://app.openquire.com/reports/1073402");
        BaseClass.quireLogin().enterProdEmail();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickNextButton();
            BaseClass.quireLogin().enterPassword();
            Thread.sleep(1000);
            BaseClass.quireLogin().clickLogin();



                  //  click section 1.0 - add 300 sections
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_section_toSection_300_times();
            Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(5000);

 //click section 1.0 - add 50 subsections
        BaseClass.staging5().click_default_section_title();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_sub_section_toSection_50_times();
        Thread.sleep(1000);

//        //click section 1.1 - add sub section
        BaseClass.staging5().click_default_section_1_1();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_sub_section_toSection_15_times();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(5000);

           //   click section 10.0 - add 50 sub sections
            BaseClass.staging5().click_default_section_10_0();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
            Thread.sleep(1000);
            BaseClass.staging5().click_add_sub_section_toSection_50_times();
        Thread.sleep(1000);


             //click section 10.1 - add 15 sub sections

        BaseClass.staging5().click_default_section_10_1();
        Thread.sleep(1000);
        BaseClass.pca_xml_section().clickAddSectionButton();
        Thread.sleep(1000);
        BaseClass.staging5().click_add_sub_section_toSection_15_times();
        Thread.sleep(3000);


// //click section 1.0
//        BaseClass.staging5().click_default_section_title();
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_sub_section_toSection_50_times();
//        Thread.sleep(1000);
//        //reclick add section button to make it disappear
//driver.navigate().refresh();
//Thread.sleep(1000);
//
//        //click section 1.1 - add sub section
//        BaseClass.staging5().click_default_section_1_1();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_sub_section_toSection_15_times();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//
//        //click section 1.0 - add 50 sections
//
//        BaseClass.staging5().click_default_section_title();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().click_add_section_toSection_50_times();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//
//        //click section 10.0 - add sub sections
//
//        BaseClass.staging5().click_default_section_10_0();
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_sub_section_toSection_50_times();
//        Thread.sleep(1000);
//        //reclick add section button to make it disappear
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//        //click section 10.1 - add 15 sub sections
//
//        BaseClass.staging5().click_default_section_10_1();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_sub_section_toSection_15_times();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        BaseClass.staging5().click_default_section_50_0();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_section_toSection_50_times();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        BaseClass.staging5().click_default_section_100_0();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_section_toSection_50_times();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//        BaseClass.staging5().click_default_section_150_0();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_section_toSection_50_times();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//
//        BaseClass.staging5().click_default_section_200_0();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_section_toSection_50_times();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//
//
//
//        BaseClass.staging5().click_default_section_250_0();
//        Thread.sleep(1000);
//        BaseClass.pca_xml_section().clickAddSectionButton();
//        Thread.sleep(1000);
//        BaseClass.staging5().click_add_section_toSection_50_times();
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);




//        BaseClass.pca_xml_section().clickSectionView_PCA_XML();
//
//        BaseClass.pca_xml_section().downloadGeneratedXML_ZIP();
//
//        Thread.sleep(5000);
//        Assert.assertTrue(VerifyDownloadedfile("123456_PCA.xml"));
//
//        //   Assert.assertTrue(VerifyDownloadedfile("QA Automation Testing FM_1105 Template.json"));
//        BaseClass.staging5().capture_PCA_version_from_XML();


        }//end of verifyBooleanStatement
//Thread.sleep(2000);
//        try{
//
//            File xmlFile = new File("src/main/java/downloads/123456_PCA.xml");
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//        Document doc = dBuilder.parse(xmlFile);
//
//        // Normalize the document
//        doc.getDocumentElement().normalize();
//        String xmlName = doc.getDocumentElement().getAttribute("nns1:noNamespaceSchemaLocation");
//        System.out.println( " generated from XML: : " + xmlName);
//     //   logger.log(LogStatus.PASS, " generated from XML:  " + xmlName);
//    } catch (Exception e) {
//        System.out.println( " not generated from XML");
//     //   logger.log(LogStatus.FAIL, " not generated from XML");
//    }       // Thread.sleep(20000);

//        driver.navigate().to("https://staging5.openquire.com/templates/666119");
//        String pageTitle = driver.getTitle();
//
//        if (pageTitle.contains("OpenQuire")) {
//            BaseClass.quireLogin().enterEmail_test2_admin_level();
//            Thread.sleep(1000);
//            BaseClass.quireLogin().clickNextButton();
//            BaseClass.quireLogin().enterPassword();
//            Thread.sleep(1000);
//            BaseClass.quireLogin().clickLogin();
//        } else {
//            // The title does not indicate a login page, assume the user is already logged in
//            System.out.println("\n" + "Already logged in. Skipping login steps.");
//        }


//        Thread.sleep(1500);
//
//        BaseClass.staging5().verify_section_II_error_message();



        // Example: Verify the presence of a specific element
//        String rootElement = doc.getDocumentElement().getNodeName();
//        System.out.println("Root element: " + rootElement);
//
//        // Example: Verify the content of a specific element
//        NodeList nodeList = doc.getElementsByTagName("nns1:noNamespaceSchemaLocation");
//        @FindBy(xpath = "//a[contains(text(),'+ Add Section')]")
//
//        if (nodeList.getLength() > 0) {
//            Node node = nodeList.item(0);
//            String content = node.getTextContent();
//            System.out.println("Content of 'your_element_name': " + content);
//        } else {
//            System.out.println("Element 'your_element_name' not found.");
//        }

      //  BaseClass.reportfoldersection().click_generate_JSON_Button();
     //   Thread.sleep(5000);
//        BaseClass.reportfoldersection().capture_generated_JSON_text();
//        Thread.sleep(2000);
//        Thread.sleep(20000);
//        String downloadDir = "src/main/java/downloads";
//
//        File downloadedFile = new File(downloadDir + "/QA Automation Testing FM_1105 Template.json"); // Change filename as per your requirement
//
//        // Check if the file exists
//        if (downloadedFile.exists()) {
//            // Open the downloaded file using the default system program
//            try {
//                Runtime.getRuntime().exec("cmd /c start " + downloadedFile.getAbsolutePath());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("File not found in the specified directory.");
//        }
//
//
//        JsonObject jsonObject = JsonParser.parseReader(new FileReader("QA Automation Testing FM_1105 Template.json")).getAsJsonObject();
//
//        // Extract text of the element from JSON
//        String elementText = jsonObject.get("elementText").getAsString();
//
//        // Perform web automation tasks with Selenium using the extracted data
//        driver.get("your_website_url");
//        // Assuming you want to capture the text of an element with id "elementId"
//        String capturedText = driver.findElement(By.id("elementId")).getText();
//
//        // Compare the captured text with the expected text from JSON
//        if (capturedText.equals(elementText)) {
//            System.out.println("Text matches!");
//        } else {
//            System.out.println("Text doesn't match!");
//        }




    }


