package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		//Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  //handle pop up
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Login']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7666069014");
		
		
		

	}

}
