package AlchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {

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
    public void VerifyWebsiteHeading() {
        
    WebElement heading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
   String headingTitle = heading.getText();	
   
        //Print the heading title of the page
        System.out.println("Page heading is: " + headingTitle);
        //Assertion for page title
        Assert.assertEquals("Learn from Industry Experts", headingTitle); 
    }
 
    @AfterMethod
    public void afterMethod() {
     //Close the browser
     driver.quit();
    }
 
}