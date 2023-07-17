package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("pawan");
		driver.findElement(By.name("password")).sendKeys("pawan123");
		WebElement LoginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		LoginButton.submit();
		LoginButton.click();
		Thread.sleep(2000);
		
		driver.navigate().to("http://desktop-o2habh3/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement LoginButton2 = driver.findElement(By.id("loginButton"));
		
		LoginButton2.submit();
		LoginButton2.click();
	
		
		

	}

}
