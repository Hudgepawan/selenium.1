package synchronization;

import java.lang.module.FindException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSychronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("http://desktop-o2habh3/login.do");
      //login page                                                                                                                                                           
      
      String actualTitleOfLoginPage = driver.getTitle();
      explicitWaitMethod(driver,30,actualTitleOfLoginPage);
      System.out.println("Title is matched,Test case passed!!");
      driver.findElement(By.name("username")).sendKeys("admin");
      driver.findElement(By.name("pwd")).sendKeys("manager");
      driver.findElement(By.id("loginButton")).click();
     
      
      //Homepage
      //"actiTime- Enter Time track"
      
      System.out.println("Title is matched,test case passed!!");	
	}
	 
	  public static void explicitWaitMethod(WebDriver driver,int sec,String title)
	  {
		  //To apply explicit wait
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
		 
		 wait.until(ExpectedConditions.titleContains(title));
	  }
	  
	}
