package module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_SetUp {
	
	public static RemoteWebDriver driver;
	
	public static void main(String[] args) {
		
		String appURL = "https://www.google.com/";
		String node = "http://localhost:5566/wd/hub";
		
		DesiredCapabilities cap = new DesiredCapabilities.firefox();
		cap.DesiredCapibilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform("org.openqa.selenium.Platform.WINDOWS");
		
		driver = new RemoteWebDriver(new URL(node), cap)
		
		driver.navigate().to(appURL);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
