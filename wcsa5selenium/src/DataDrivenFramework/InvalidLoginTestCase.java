package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-o2habh3/login.do");

		//read the data from excel sheet and test the login page

		Flib flib = new Flib();

		//to read multiple data we use for loop
		int rc = flib.getLastRowCount("./data/ACTI.xlsx","invalidcred");
		for(int i=1;i<rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ACTI.xlsx","invalidcred", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ACTI.xlsx","invalidcred",i,1));
			driver.findElement(By.id("loginButton")).click();

			
			driver.findElement(By.name("username")).clear();

		}

	}

}
