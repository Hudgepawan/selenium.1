package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[class*='e']")).sendKeys("7666069014");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	
		

	}

}
