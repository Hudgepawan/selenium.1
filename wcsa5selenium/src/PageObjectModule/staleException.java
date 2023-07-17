package PageObjectModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleException {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-o2habh3/login.do");
		
		WebElement usn = driver.findElement(By.name("username"));
		
		WebElement pass = driver.findElement(By.name("pwd"));
		
		driver.navigate().refresh();
		usn.sendKeys("admin");

	}

}
