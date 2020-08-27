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

public class TestCase6 {

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
	      
	       WebElement login=driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")); 
	       login.click();
	       
	       WebElement username=driver.findElement(By.xpath("//input[@id='user_login']"));
	       username.sendKeys("root");
	       WebElement password=driver.findElement(By.xpath("//input[@id='user_pass']"));
	       password.sendKeys("pa$$w0rd");
	       WebElement loginbutton=driver.findElement(By.xpath("//input[@id='wp-submit']"));
	       loginbutton.click();
	       WebElement verifyroot=driver.findElement(By.xpath("//a[contains(text(),'Howdy,')]"));
	       verifyroot.click();
	       //Profile ‹ Alchemy LMS — WordPress
	     //Print the title of the page logged in my account page.
	       String titlemyaacout=driver.getTitle();
	       System.out.println("Title of the page is: " + titlemyaacout);
	        //Assertion for page title
	        Assert.assertEquals("Profile ‹ Alchemy LMS — WordPress", titlemyaacout);
	       
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	     //Close the browser
	     driver.quit();
	    }
	 
	}

