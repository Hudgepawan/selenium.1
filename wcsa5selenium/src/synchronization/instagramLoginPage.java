package synchronization;

import java.time.Duration;                                //Using implicit wait

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramLoginPage {

	public static void main(String[] args) throws InterruptedException {
	 
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Pawan");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pawan@121");
		
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Show']")).click();

	}

}
