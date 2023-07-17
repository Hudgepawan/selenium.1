package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvalidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcred");
		Thread.sleep(2000);
		
		for(int i=1;i<rc;i++)
		{
			WebElement usnTB = driver.findElement(By.name("username"));
			usnTB.sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcred", i, 0));
			
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcred", i, 1));
			driver.findElement(By.id("loginButton")).click();
			usnTB.clear();
			
		}
		bt.closeBrowser();
		
		

	}

}
