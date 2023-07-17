package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElementMethod {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Thread.sleep(2000);
		
		
		WebElement targetcoins = driver.findElement(By.xpath("//a[contain(text(),'watch']"));
		
		//to perform mouse action on webelement
		
		Actions act = new Actions(driver);
		
		// to perform mouseHover action
		act.moveToElement(targetcoins).perform();
		
		driver.findElement(By.xpath("//a[.='Band']")).click();
		
		
		

	}

}
