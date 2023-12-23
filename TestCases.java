package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        

        // Launch Chrome :
        // Load URL  https://keep.google.com/u/0/
        driver.get("https://keep.google.com/u/0/");
        // Wait for 30 seconds  
        Thread.sleep(3000);

        // Will redirect to sign up page  
        // Click on Enter Email text box Using Locator "ID" "identifierId"
        WebElement emailTxtBox=  driver.findElementById("identifierId");
        emailTxtBox.click();
        // Locate the Email text Box & Enter Email "PLEASE ENTER YOUR EMAIL ID" 
        emailTxtBox.sendKeys("PLEASE ENTER YOUR EMAIL ID");
        // Click on next button  Using Locator "XPath" "//span[contains(text(),'Next')]"
        driver.findElementByXPath("//span[contains(text(),'Next')]").click();
        // wait for 3 sec 
        Thread.sleep(3000); 
        // Click on Enter Password text box Using Locator "XPath":"//input[@aria-label='Enter your password']"
        WebElement passTextBox=  driver.findElementByXPath("//input[@aria-label='Enter your password']");
        passTextBox.click();
        // Locate the Password text Box & Enter Password "PLEASE ENTER YOUR PASS"
        passTextBox.sendKeys("PLEASE ENTER YOUR PASS");
        // Click on next button  Using Locator "XPath" "//span[contains(text(),'Next')]"
        driver.findElementByXPath("//span[contains(text(),'Next')]").click();


        // Click on take a note Text bar Using Locator "XPath":"//div[@aria-label='Take a note…']"
        WebElement note = driver.findElementByXPath("//div[@aria-label='Take a note…']");
        note.click();
        // Click on take a note Title bar  Using Locator "XPath":"//div[@aria-label='Title']"
        WebElement titleBar = driver.findElementByXPath("//div[@aria-label='Title']");
        // Type Title 
        titleBar.sendKeys("Anime List");
        //Printing the Tittle
        System.out.println("The Tittle is : " + titleBar.getText());
        Thread.sleep(500); 
        // Click on take a note Text bar Using Locator "XPath":"//div[@aria-label='Take a note…']"
        note.click();
        // Type Text & Click Enter after every text  
        note.sendKeys("JoJo's Bizzare Adventure");
        note.sendKeys(Keys.ENTER);
    
        note.sendKeys("Attack on Titan");
        note.sendKeys(Keys.ENTER);

        note.sendKeys("Saitama");
        note.sendKeys(Keys.ENTER);

        note.sendKeys("Blue Lock");
        note.sendKeys(Keys.ENTER);

        note.sendKeys("Baki Hanma");
       
        Thread.sleep(2000);
        // Click on close Using Locator "XPath" "(//div[contains(text(),'Close')])[1]"
        WebElement closebtn = driver.findElementByXPath("(//div[contains(text(),'Close')])[1]");

        if(closebtn.isDisplayed()){
            closebtn.click();
            System.out.println("The Note is Created");
        }
    }


}
