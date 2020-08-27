package AlchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase8 {

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
	    public void contactUs() {
	        
	    WebElement contact = driver.findElement(By.linkText("Contact"));
	    contact.click();
	    WebElement fullName=driver.findElement(By.id("wpforms-8-field_0"));
	    //Enter full name
	    fullName.sendKeys("Abhishek kumar");
	    WebElement email=driver.findElement(By.id("wpforms-8-field_1"));
	    //Enter email
	    email.sendKeys("abcd@xyz.com");
	    WebElement subject=driver.findElement(By.id("wpforms-8-field_3"));
	    //Enter subject
	    subject.sendKeys("Enquiry");
	    WebElement message=driver.findElement(By.id("wpforms-8-field_2"));
	    //Enter message
	    message.sendKeys("Which is the top most course available");
	    WebElement sendMessageButton=driver.findElement(By.name("wpforms[submit]"));
	    //Click on Send message button
	    sendMessageButton.click();
	    
	    WebElement messageContent=driver.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us! We will be in touch with')]"));
	    
	   String MessageContent = messageContent.getText();
	   //Print the message
	   System.out.println("Message displayed after submission is: " +MessageContent);
	   Reporter.log("Message displayed is: " +MessageContent); 
	    
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	     //Close the browser
	     driver.quit();
	    }
	 
	}

