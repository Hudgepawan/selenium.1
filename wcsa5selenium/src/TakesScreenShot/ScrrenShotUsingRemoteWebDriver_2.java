package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScrrenShotUsingRemoteWebDriver_2 {

	public static void main(String[] args) throws IOException {
		
		
		//By using RemoteWebDriver
		
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		File src1 = driver.getScreenshotAs(OutputType.FILE);
	    File desc = new File("./ScreenShot/selenium2.png");
	    Files.copy(src1, desc);
	   


	}

}
