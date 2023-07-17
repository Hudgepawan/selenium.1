package AssignmentPackage_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class omayoFileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
	  
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		
		//driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		WebElement src = driver.findElement(By.id("uploadfile"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(src).perform();
		
	     Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoItPrograms/upload.exe");
		
		//File src = new File("./autoItPrograms/fi.exe");
		//String tar = src.getAbsolutePath();
		
		
		

	}

}

