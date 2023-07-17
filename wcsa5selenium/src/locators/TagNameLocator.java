package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ant/OneDrive/Desktop/wcsa5workspace/WebElement/.html");
		Thread.sleep(2000);
		
		WebElement usn=driver.findElement(By.tagName("input"));
		usn.sendKeys("pawan");
		
		WebElement pass= driver.findElement(By.tagName("input"));
		pass.sendKeys("pawan@121");
	

	}

}
