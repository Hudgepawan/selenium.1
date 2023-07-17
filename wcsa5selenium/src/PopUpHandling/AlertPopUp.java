package PopUpHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException {
	  
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Ant/OneDrive/Desktop/wcsa5workspace/WebElement/alert1.html");
		
		//To generate pop up click on button
		driver.findElement(By.xpath("//button[@type='button']")).click();
	
	//We can handle alert pop up by using robot class
		//Robot robot =new Robot();
		//Thread.sleep(2000);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyPress(KeyEvent.VK_ENTER);
		
		//To handle alert pop up by using switch to method
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		al.accept();  //for accept the alert pop up
		//al.dismiss(); //for dismiss the alert pop up
		
		//System.out.println(al.getText());
		
		
		
		
		
		
		

	}

}
