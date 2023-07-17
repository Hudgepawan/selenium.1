package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		//To identify webelement we use locators
		driver.findElement(By.id("id_userLoginId")).sendKeys("pawan.shudge@gmail.com"); //username TextBox
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("pawan@123",Keys.ENTER);
		Thread.sleep(4000);
		
      
		
 
	}
}
