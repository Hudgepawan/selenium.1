package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	     
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//To apply the implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch the web application
		driver.get("http://desktop-o2habh3/login.do");
		 
		//read the data from excel sheet and test the login page
		
		Flib flib = new Flib();
		String validUsername = flib.readExcelData("./data/ACTI.xlsx","validcred", 1, 0);
		String validPassword = flib.readExcelData("./data/ACTI.xlsx","validcred",1,1);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
        driver.findElement(By.id("loginButton")).click();
		

	}

}
