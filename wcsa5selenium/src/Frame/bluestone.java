package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//launch the web application
		driver.get("https://www.bluestone.com/");
		Thread.sleep(1000);
		
		//handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		
	//	driver.switchTo().frame(5);                   //handle frame by using index
		
		driver.switchTo().frame("fc_widget");        //handle the frame by using string name or id
		driver.findElement(By.id("chat-icon")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		
	//	driver.switchTo().frame("fc_widget");
	//	driver.findElement(By.xpath("//                                                                                                                                                                                                                             iframe[@name='fc_widget']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("Pawan");
		driver.findElement(By.id("chat-fc-email")).sendKeys("pawanhudge@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9860779710");        
		
		
		
		

	}

}
