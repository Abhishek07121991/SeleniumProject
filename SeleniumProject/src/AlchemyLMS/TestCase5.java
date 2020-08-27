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

public class TestCase5 {

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
	    public void VerifyMyAccountPage() throws InterruptedException {
	        
	    WebElement myaccountpage = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	    myaccountpage.click();
	    String title=driver.getTitle();
	    System.out.println(title);
	   
	        //Print the title of the page
	       System.out.println("Title of the page is: " + title);
	        //Assertion for page title
	        Assert.assertEquals("My Account – Alchemy LMS", title); 
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	     //Close the browser
	     driver.quit();
	    }
	 
	}

