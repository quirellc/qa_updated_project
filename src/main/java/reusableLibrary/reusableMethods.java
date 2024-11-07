//package reusableLibrary;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.ArrayList;
//
//public class reusableMethods {
//
//    //create a return method to return the webdriver you going to use on your test classes
//    //static command allows your method to be global
//    public static WebDriver defineChromeDriver() {
//        //set up your driver through web driver manager
//        WebDriverManager.chromedriver().setup();
//
//        //set your chrome options arguments for your web driver
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        //options.addArguments("headless");
//
//        //define the chrome driver that you will use for automation test
//        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
//        WebDriver driver = new ChromeDriver(options);
//
//        //set maximized for mac users
//        driver.manage().window().maximize();
//
//        return driver;
//
//    }//end of webdriver method
//
//    //return method will execute your statements along with returning some conditions/value
//    //example of return methods are only WebDriver method & getText action
//
//    //void method will only perform the action but won't return anything
//    //void actions are click, sendKeys, scrolling, submit, select, mouse hover, clear
//
//    //click action is one of the type of void method
//    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
//            System.out.println("Successfully clicked on element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to click on element " + elementName + ": " + e);
//        }
//    }
//
//    //end of click method
//    //click action is one of the type of void method
//    public static void clickMethodByIndex(WebDriver driver, String xpath, int index, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
//            System.out.println("Successfully clicked on element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to click on element " + elementName + ": " + e);
//        }
//    }//end of click method by index
//
//    //submit method is one of the type of void method
//    public static void submitMethod(WebDriver driver,String xpath,String elementName){
//        WebDriverWait wait =  new WebDriverWait(driver,10);
//        try{
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
//            System.out.println("Successfully submit on element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to submit on element " + elementName + ": " + e);
//        }
//    }//end of submit method
//
//    //click action is one of the type of void method
//    public static void sendKeysMethod(WebDriver driver, String xpath, String userValue, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//            element.clear();
//            element.sendKeys(userValue);
//            System.out.println("Successfully entered a value on element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
//        }
//    }//end of sendkeys method
//
//    //click action is one of the type of void method
//    public static void sendKeysMethodByIndex(WebDriver driver, String xpath, String userValue, int index, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
//            element.clear();
//            element.sendKeys(userValue);
//            System.out.println("Successfully entered a value on element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
//        }
//    }//end of sendkeys method
//
//    //capture text and return it using return method
//    public static String captureTextMethod(WebDriver driver, String xpath, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        String result = "";
//        try {
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//            result = element.getText();
//            System.out.println("Successfully entered a value on element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
//        }
//        return result;
//
//    } //end of get text method
//
//
//
//    //hover over by mouse
//    //create a void method for mouse hoover
//    public static void mouseHoverMethod(WebDriver driver, String xpath, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        Actions mouseActions = new Actions(driver);
//        try {
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//            mouseActions.moveToElement(element).perform();
//            System.out.println("Successfully hovered over element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to hover over element " + elementName + ": " + e);
//        }//end of mouse hover exception
//    }//end of mouse hover method
//
//
//
//    //create a void method for mouse hoover by index
//    public static void mouseHoverMethodByIndex(WebDriver driver, String xpath, int index, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        Actions mouseActions = new Actions(driver);
//        try {
//            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
//            mouseActions.moveToElement(element).perform();
//            System.out.println("Successfully hovered over element " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to hover over element " + elementName + ": " + e);
//        }//end of mouse hover by index exception
//    }//end of mouse hover method by index
//
//
//
//    //create scroll intoview element
//    public static void scrollToElementMethod (WebDriver driver, String xpath, String elementName){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//        try{
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//            jse.executeScript("arguments[0].scrollIntoView(true)",element);
//            System.out.println("Successfully scrolled to: " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to scroll to: " + elementName + ": " + e);
//        }//end of scroll by element exception
//    }//end of scroll by element method
//
//
//
//    //create scroll intoview element by index
//    public static void scrollToElementByIndexMethod (WebDriver driver, String xpath, int index, String elementName){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//
//        try{
//            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
//            jse.executeScript("arguments[0].scrollIntoView(true)",element);
//            System.out.println("Successfully scrolled to: " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to scroll to: " + elementName + ": " + e);
//        }//end of scroll by element exception
//    }//end of scroll by element method
//
//
//
//    //create select dropdown by visible text
//    public static void selectByText (WebDriver driver, String xpath, String visibleText, String elementName){
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        try{
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//            Select dropdown = new Select(element);
//            dropdown.selectByVisibleText(visibleText);
//            System.out.println("Successfully selected by visible text: " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to select by visible text: " + elementName + ": " + e);
//        }//end of scroll by element exception
//    }//end of scroll by element method
//
//    public static void verifyBooleanStatement(WebDriver driver, String xpath, boolean expectedValue, String elementName){
//        //store the xpath in boolean statement
//        WebDriverWait wait = new WebDriverWait(driver, 7);
//        try {
//            boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isSelected();
//            System.out.println("Value: " + elementState);
//            if (elementState == expectedValue) {
//                System.out.println("Passed: Checkbox is " + expectedValue);
//            } else {
//                System.out.println("Failed: Checkbox is " + elementState);
//            }
//        } catch (Exception e) {
//            System.out.println("Unable to verify element  " + elementName + " " + e);
//        }//end of exception
//    }//end of verifyBooleanStatement
//
//    //create a void method for scrolling by pixel
//    public static void scrollByPixelMethod(WebDriver driver, int x, int y) {
//        //explicit wait of 10 seconds
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        //call JSE
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        try {
//            //enter int x and y coordinates as integer
//            jse.executeScript("scroll(" + x + "," + y + ")" );
//            System.out.println("Successfully scrolled by " + x+","+y);
//        } catch (Exception e) {
//            System.out.println("Unable to scroll by " + x+","+y + ": " + e);
//        }//end of scroll by pixel exception
//    }//end of scroll by pixel method
//
//    public static void changeTabs(WebDriver driver, int tabNumber, String elementName) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        //call the window handles in array list and switch to the new tab
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        //switch to the new tab by index of tabNumber
//        try {
//            driver.switchTo().window(tabs.get(tabNumber));
//            System.out.println("Successfully changed tab to: " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to change tab: " + elementName + ": " + e);
//        }// end of tab change exception
//    } // end of changing tab method
//
//
//} // end of main