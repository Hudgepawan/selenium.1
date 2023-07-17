package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleDisableWebelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		//To launch the web application
		driver.get("file:///C:/Users/Ant/OneDrive/Desktop/wcsa5workspace/WebElement/.html");
		Thread.sleep(2000);
		
		// identify the web element
		driver.findElement(By.id("i1")).sendKeys("admin");
		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//generate alert pop up.
		jse.executeScript("alert('Hello there!!')");
		
		//To handle disabled web element
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('i2').value='manager'");
		

	}
	}

