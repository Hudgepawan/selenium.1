package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input [class=inputtext _55r1 _6luy]")).sendKeys("qspiders");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("inputtext _55r1 _6luy _9npi")).sendKeys("pawan");
		Thread.sleep(2000);
		

		
		
		
	}
}