package module6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example3 {
	
	// 1. Open the browser @Bofore annotation (multi browsers)
	
	private WebDriver driver;
	String URL = "https://www.facebook.com/";
	 
	@Parameters("browser")
	@BeforeTest
	public void openBrowser( String browser) {
		
	if (browser.equalsIgnoreCase("Chrome"))  {
			System.setProperty("driver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("driver.gecko.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("IE")) {
			System.setProperty("driver.ie.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("invalid browser");
		}
	}
	

	// 2. Navigate to URL @Test annotation
		@Test
		public void openURL() {
			driver.get("URL");
		}
		
	// 3. Close the browser @AfterTest annotation
		@AfterTest
			public void closeBrowser() {
				driver.quit();
			}
	
	
	
	
	
	
	

}
