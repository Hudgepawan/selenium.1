package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsOfWebelement.getLocationMethod;

public class ScrollTillPerticularWebelement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//launch the web application
		driver.get("https://www.selenium.dev/");
		
		//identify the web element
		WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		
		 
		//To perform scrolling operations for a newsElement
		// Location of newsElment
		Point loc = newsElement.getLocation();
		
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		
		
		
		
		

	}

}
