package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotFlipkart {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();//handle popup
		
		//To generate print pop up
		Robot robot = new Robot();
		// to hit control button

		robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_P);
	  
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_P);
	    
	    Thread.sleep(2000);
	    
	    // shift the controls to cancel button
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    
	    //hit enter button
	    
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
