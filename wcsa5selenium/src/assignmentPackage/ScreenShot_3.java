package assignmentPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot_3 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//down casting from browser specific class
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		cdriver.get("https://www.selenium.dev/");
		
		File src = cdriver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./ScreenShot/Sel_3.png");
		Files.copy(src, desc);
		
	}

}
