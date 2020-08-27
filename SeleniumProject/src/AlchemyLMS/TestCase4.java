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

public class TestCase4 {

   WebDriver driver;
   WebDriverWait wait;
    
    @BeforeMethod
    public void beforeMethod() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\latestone\\chromedriver.exe");
             
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }
 
    @Test
    public void VerifyTitleOfSecondMostPopularCourse() {
        
    WebElement popularcourse = driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
   String Secondmostpopularcourse = popularcourse.getText();	
   
        //Print the heading title of the page
        System.out.println("Title of Second mostpopular course is: " + Secondmostpopularcourse);
        //Assertion for page title
        Assert.assertEquals("Email Marketing Strategies", Secondmostpopularcourse); 
    }
 
    @AfterMethod
    public void afterMethod() {
     //Close the browser
     driver.quit();
    }
 
}
