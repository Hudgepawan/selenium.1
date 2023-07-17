package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instaram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("7666069014");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("Pawan@121");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class*='ap']")).click();
		Thread.sleep(2000);
		
		
		
		
		
		

	}

}
