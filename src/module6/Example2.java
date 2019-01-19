package module6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Example2 {
	
	private WebDriver driver;
	String URL = "http://www.gmail.com";
	
	//@Parameters({"browser"})
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
		try{
			if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			else if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
				driver = new ChromeDriver();
				
			else if (browser.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
			} catch (WebDriverException e) {
				System.out.println(e.getMessage());
			}
			}
			@Test
			public void login_TestCase() {
				driver.navigate().to(URl); // do something
					
			}
	@AfterTest
	public void closeBrowser() {
		}
	}
		}
	}

	}
