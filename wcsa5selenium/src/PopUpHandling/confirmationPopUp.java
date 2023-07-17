package PopUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Ant/OneDrive/Desktop/wcsa5workspace/WebElement/confirmation1.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//We can handle pop up by using Robot class
		
		//Robot robot = new Robot();
		//Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		//To handle pop up by using switch to method
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.dismiss();
		
		
		
		

	}

}
