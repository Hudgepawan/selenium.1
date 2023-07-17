package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
		GetWindowHandlesMethod parentHandle = new GetWindowHandlesMethod();
		System.out.println("Address of parent window:"+parentHandle);
		
		//launch the child window
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		//get the address of child window
		
		String childHandle = driver.getWindowHandle();
		System.out.println("Address of child window:"+childHandle);
		
		//get the address of child window only
		
		Set<String> allHandles = driver.getWindowHandles();
		
		//read address by using looping statement
		for(String al:allHandles)
		{
		   System.out.println(al);	
		}
		

	}

}
