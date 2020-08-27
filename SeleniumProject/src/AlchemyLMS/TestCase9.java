package AlchemyLMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase9 {

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
	    public void completeLesson() {
	        
	    WebElement allCourses = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
	    //Click on all courses link
	    allCourses.click();
	    //Get the course link
	    WebElement course =driver.findElement(By.xpath("//article[@id='post-69']//a[@class='btn btn-primary'][contains(text(),'See more...')]"));
	    //Click on the course link
	    course.click();
	    //Get the title of the course
	    String titleOfCourse=driver.getTitle();
	    //Print the title of the course
	    System.out.println("Title of the course page is: "+ titleOfCourse);
	    //Assert the title of the course page
	    Assert.assertEquals("Social Media Marketing – Alchemy LMS", titleOfCourse);
	    Reporter.log("Message displayed is: " +titleOfCourse); 
	    
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	     //Close the browser
	     driver.quit();
	    }
	 
	}
