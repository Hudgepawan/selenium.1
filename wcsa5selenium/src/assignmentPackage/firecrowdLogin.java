package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firecrowdLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://firecrowd.com/");
		driver.findElement(By.id("id_userLogin")).sendKeys("pawan.shudge@gmail.com");
		
		driver.findElement(By.id("id password")).sendKeys("pawan@123",Keys.ENTER);
		Thread.sleep(4000);

	}

}
