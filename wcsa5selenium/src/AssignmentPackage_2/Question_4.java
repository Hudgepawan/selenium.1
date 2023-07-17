package AssignmentPackage_2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_4 {

	public static void main(String[] args) throws InterruptedException {
		
		//How to close only child window
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		
		//launch the child window
		Thread.sleep(2000);
		WebElement childwindow = driver.findElement(By.partialLinkText("Open a popup window"));
		
		Point elementLoc = childwindow.getLocation();
		int xaxis = elementLoc.getX();
		int yaxis = elementLoc.getY();
		
		//scroll till open a pop up window link
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		
		//click on link to open child browser
		childwindow.click();
		
		//get the address or handle of parent window.....
		String parentHandle = driver.getWindowHandle();
		
		//get the address or handle of parent window and child window
		
		Set<String> allHandles = driver.getWindowHandles();
		
		//how to close only child browser........
		
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
			    Thread.sleep(2000);
			    driver.switchTo().window(wh).close();
			    break;
			}
			
		}

	}

}
