package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class downncastingRemoteWebDriver_4 {

	public static void main(String[] args) throws IOException {
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.facebook.com/");
			
			// By down casting to RemoteWebDriver class
			
			RemoteWebDriver rwd = (RemoteWebDriver)driver;
			File src1 = rwd.getScreenshotAs(OutputType.FILE);
			File des1 = new File("./ScreenShot/facebook4.png");
		    Files.copy(src1, des1);

	}

}
