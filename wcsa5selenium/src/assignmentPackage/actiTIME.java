package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrivers.chrome.drivers","./drivers/chromedrivers.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do  ");
		driver.findElement(By.className("")).sendKeys("");

	}

}
   