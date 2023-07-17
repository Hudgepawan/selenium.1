package AssignmentPackage_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginTestCase {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-o2habh3/login.do");
		Thread.sleep(2000);
		
		//read the data from the excel and test the login page
		
		FileInputStream fis = new FileInputStream("./data/ACTITIME TestData.xlsx");
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet("ACTI");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);
		String validUsername = cell.getStringCellValue();
		
		Thread.sleep(2000);
		
		FileInputStream fis1 = new FileInputStream("./data/ACTITIME TestData.xlsx");
		Workbook wh1 = WorkbookFactory.create(fis);
		Sheet sheet1 = wh1.getSheet("ACTI");
		Row row1 = sheet1.getRow(1);
		Cell cell1 = row1.getCell(0);
		String validPassword = cell1.getStringCellValue();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();

	}

}
