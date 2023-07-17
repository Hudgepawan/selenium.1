package HandlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Ant/OneDrive/Desktop/wcsa5workspace/WebElement/menu4.html");
		
		WebElement element = driver.findElement(By.id("menu"));
		Select sel = new Select(element);
		for(int i=2;i<=9;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}

	}

}
