package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		// down casting for browser specific class
		
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		cdriver.get("https://www.selenium.dev/");	
		Thread.sleep(4000);
		
		File src = cdriver.getScreenshotAs(OutputType.FILE);
		
		File desc = new File("./ScreenShot/selenium3.png");
		
		Files.copy(src, desc);
		

	}

}
