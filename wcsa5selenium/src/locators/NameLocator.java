package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement usn=driver.findElement(By.name("email"));
		usn.sendKeys("pawan.shudge@gmail.com");
		Thread.sleep(2000);
		
		WebElement pwd= driver.findElement(By.name("pass"));
		pwd.sendKeys("qspiders");
		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.name("login"));
		button.click();
		
	

	}

}
