package AlchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {

WebDriver driver;
WebDriverWait wait;
    
    @BeforeMethod
    public void beforeMethod() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\latestone\\chromedriver.exe");
    	//Create a new instance of the Chrome driver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }
 
    @Test
    public void VerifyWebsiteTitle() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
            
            //Assertion for page title
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
         
    }
 
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
 
}