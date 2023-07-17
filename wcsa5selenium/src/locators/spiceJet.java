package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9860987685");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pawan121");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Log in to SpiceClub']")).click();
		
		
		
		
		
		
		

	}

}
