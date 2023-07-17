package AssignmentPackage_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//How to close all the browser
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
		//launch the child window
		Thread.sleep(2000);
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		
		Point element = childWindow.getLocation();
		int xaxis = element.getX();
		int yaxis = element.getY();
		
		//Scroll till open a pop up window link
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		
		//click on link to open child browser
		childWindow.click();
		
		//close all the browser
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
