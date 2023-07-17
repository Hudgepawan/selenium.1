package PopUpHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUploadPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://desktop-o2habh3/login.do");
		//new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		
		// Home page
		//new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		// click on setting module..	
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		Thread.sleep(1000);
		
		//click on logo colour
		WebElement target = driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(1000);
		
		//click on use custom Logo 
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		
		//click on choose file
		WebElement target1 = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		act.doubleClick(target1).perform();	
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./autoItPrograms/act.au5.exe");
		
	}

}
