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

public class TestCase7 {

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
	    public void allCourseCount() {
	        
	    WebElement allCourses = driver.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
	    allCourses.click();
	    //Get the total no of courses on the page
	    int countofcourses =driver.findElements(By.className("ld_course_grid_button")).size();
	    //Print the total no of courses on the page
	    System.out.println("Number of courses on the page is:" +countofcourses);
	    Reporter.log("Courses count is: " +countofcourses);
	    }
	 
	    @AfterMethod
	    public void afterMethod() {
	     //Close the browser
	     driver.quit();
	    }
	 
	}
