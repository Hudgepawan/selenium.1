package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotEventFiringWebdriver_5 {

	public static void main(String[] args) throws IOException {
		
		
		//By using EventFiringWebdriver
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		EventFiringWebDriver src1 = new EventFiringWebDriver(driver);
		
		File desc = src1.getScreenshotAs(OutputType.FILE);
		
		File ews = new File("./ScreenShot/selenium5.png");
		Files.copy(desc, ews);

	}

}
