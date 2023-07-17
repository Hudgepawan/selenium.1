package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStacckLogin {

	public static void main(String[] args) throws InterruptedException {
		
         System.setProperty("webdriver.chrome.driver","./drivers/chromedrivers.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.shoppersstack.com/");
         driver.findElement(By.id("id_UserLoginId")).sendKeys("hudgepawan@gmail.com");
         
         driver.findElement(By.id("id_password")).sendKeys("Pawan@1122",Keys.ENTER);
         Thread.sleep(4000);
         
	}

}
