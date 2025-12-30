import Quire_POM.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import reusableLibrary.ReusableAnnotations;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmailWithAttachment extends ReusableAnnotations {
    private String getCurrentMonth() {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Format the current month
        DateFormat formatMonth = new SimpleDateFormat("MM");
        return formatMonth.format(calendar.getTime());
    }

    private String getPreviousMonth() {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Subtract one month
        calendar.add(Calendar.MONTH, -1);

        // Format the previous month
        DateFormat formatMonth = new SimpleDateFormat("MM");
        return formatMonth.format(calendar.getTime());
    }

    private String getCurrentYear() {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Format the current year
        DateFormat formatYear = new SimpleDateFormat("yyyy");
        return formatYear.format(calendar.getTime());
    }

    private String getPreviousMonthYear() {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Subtract one month
        calendar.add(Calendar.MONTH, -1);

        // Format the year of the previous month
        DateFormat formatYear = new SimpleDateFormat("yyyy");
        return formatYear.format(calendar.getTime());
    }

    @Test
    public void TR_001_User_Login()  throws InterruptedException, IOException {
        WebDriver driver = getDriver();

        String currentMonth = getCurrentMonth();
        String previousMonth = getPreviousMonth();
        String currentYear = getCurrentYear();
        String previousMonthYear = getPreviousMonthYear();


//  logger.log(LogStatus.PASS, "Browser Name: " + driver.getClass().getSimpleName());
        driver.navigate().to("https://app.openquire.com/company_usage_reports?month=" + previousMonth + "&year=" + previousMonthYear);

        Thread.sleep(1000);

//
//  String pageTitle = driver.getTitle();
//  if (pageTitle.contains("OpenQuire")) {
        BaseClass.quireLogin().enterRootUserEmail();
        Thread.sleep(1000);
        BaseClass.quireLogin().enterPassword();
        Thread.sleep(1000);
        BaseClass.quireLogin().clickLogin();
        Thread.sleep(1000);
        BaseClass.staging5().captureURL();
        Thread.sleep(1500);
        BaseClass.staging5().verify_and_markRead_if_notification_is_active();
        Thread.sleep(1000);
        BaseClass.staging5().verify_loading_complete_sideBar();
        Thread.sleep(500);
        BaseClass.staging5().click_export_to_excel();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_excel_AlertMessage();
        Thread.sleep(15000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        BaseClass.staging5().verify_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().open_company_usage_reports_link();

        Thread.sleep(1000);
        driver.navigate().to("https://app.openquire.com/company_usage_reports?month=" + currentMonth + "&year=" + currentYear);
        Thread.sleep(1000);


        BaseClass.staging5().captureURL();
        Thread.sleep(1500);
        BaseClass.staging5().verify_and_markRead_if_notification_is_active();
        Thread.sleep(1000);
        BaseClass.staging5().verify_loading_complete_sideBar();
        Thread.sleep(500);
        BaseClass.staging5().click_export_to_excel();
        Thread.sleep(500);
        BaseClass.templatesSection().verify_excel_AlertMessage();
        Thread.sleep(15000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        BaseClass.staging5().verify_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().click_active_notification_button();
        Thread.sleep(500);
        BaseClass.staging5().open_company_usage_reports_link();
        Thread.sleep(1500);
//        Thread.sleep(20000);
//        BaseClass.staging5().click_export_to_excel();
//        BaseClass.templatesSection().verify_excel_AlertMessage();
//        Thread.sleep(1000);
//
//        BaseClass.staging5().verify_and_markRead_if_notification_is_active();
//
//        Thread.sleep(15000);
//        driver.navigate().refresh();
//        Thread.sleep(10000);
//        BaseClass.staging5().click_active_notification_button();
        // BaseClass.staging5().open_company_usage_reports_link();
        // Thread.sleep(5000);




        // Create object of Property file
        Properties props = new Properties();
        // this will set host of server- you can change based on your requirement
        props.put("mail.smtp.host", "smtp.gmail.com");
        // set the port of socket factory
        props.put("mail.smtp.socketFactory.port", "465");
        // set socket factory
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        // set the authentication to true
        props.put("mail.smtp.auth", "true");
        // set the port of SMTP server
        props.put("mail.smtp.port", "465");

        // This will handle the complete authentication
        Session session = Session.getDefaultInstance(props,

                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("ibrar.openquire@gmail.com", "omjg yagx zyvv qbtw");
                    }
                });
        try {

//                // Create object of MimeMessage class
//                Message message = new MimeMessage(session);
//                // Set the from address
//                message.setFrom(new InternetAddress("ibrar.openquire@gmail.com"));
//                // Set the recipient address
//                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ibrar.openquire@gmail.com"));
//                // Add the subject link
//                message.setSubject("Testing Subject");
//                // Create object to add multimedia type content
//                BodyPart messageBodyPart1 = new MimeBodyPart();
//                // Set the body of email
//                messageBodyPart1.setText("This is message body");
//                // Create another object to add another content
//                MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//                // Mention the file which you want to send
//                String filename = System.getProperty("user.dir") + "/src/main/java/images/maptest.pdf";
//                // Create data source and pass the filename
//                DataSource source = new FileDataSource(filename);
//                // set the handler
//                messageBodyPart2.setDataHandler(new DataHandler(source));
//                // set the file
//                messageBodyPart2.setFileName(filename);
//                // Create object of MimeMultipart class
//                Multipart multipart = new MimeMultipart();
//                // add body part 1
//                multipart.addBodyPart(messageBodyPart2);
//                // add body part 2
//                multipart.addBodyPart(messageBodyPart1);
//                // set the content
//                message.setContent(multipart);
//                // finally send the email
//                Transport.send(message);
//
//                System.out.println("=====Email Sent=====");

            // Create a new MimeMessage object for the email
            Message message = new MimeMessage(session);
            // Set the "from" address
            message.setFrom(new InternetAddress("ibrar.openquire@gmail.com"));
            // Set the recipient address
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ibrarj@openquire.com, elizabeths@openquire.com"));
            // Set the subject of the email
            message.setSubject("Company Usage Reports: " + previousMonth + "->" + currentMonth + " - QA Automated");

            // Create a Multipart object to hold the email body and attachments
            Multipart multipart = new MimeMultipart();

            // Add the email body part
            BodyPart messageBodyPart1 = new MimeBodyPart();
            messageBodyPart1.setText("The first attachment should be previous Month, the second attachment is current month.");
            multipart.addBodyPart(messageBodyPart1);

            // Specify the directory containing the files you want to attach
            String directoryPath = System.getProperty("user.dir") + "/src/main/java/downloads";
            File directory = new File(directoryPath);

            // Attach all files from the downloads directory
            if (directory.isDirectory()) {
                File[] files = directory.listFiles();
                if (files != null) {
                    for (File file : files) {
                        // Create a new body part for each file
                        MimeBodyPart messageBodyPart2 = new MimeBodyPart();
                        DataSource source = new FileDataSource(file);
                        messageBodyPart2.setDataHandler(new DataHandler(source));
                        messageBodyPart2.setFileName(file.getName());
                        // Add the file attachment to the multipart
                        multipart.addBodyPart(messageBodyPart2);
                    }
                }
            }

            // Set the content of the message
            message.setContent(multipart);

            // Finally, send the email
            Transport.send(message);

            System.out.println("=====Email Sent=====");

        } catch (MessagingException e) {

            throw new RuntimeException(e);

        }

    }
}