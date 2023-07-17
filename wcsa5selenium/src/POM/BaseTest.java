package POM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



	public class BaseTest extends flib implements IautoConstant {

		static WebDriver driver;
		public void setUp() throws IOException {
			
			BaseTest bt = new BaseTest();

			flib flib = new flib();
			String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
			String url = flib.readPropertyData(PROP_PATH, "Url");

			if(browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_PATH);
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(url);	
			}
			else if(browserValue.equalsIgnoreCase("firefox"))
			{ 
				System.setProperty(GECKO_KEY, GECKO_PATH);
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(url);
			}
			else if(browserValue.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(url);
			}
			else                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
			{
				System.out.println("Enter valid browservalue");
			}
		}

		public void tearDown() {

			driver.quit();
		}
	}


