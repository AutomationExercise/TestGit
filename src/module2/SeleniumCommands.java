package module2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumCommands {

	public static void main(String[] args) {
		//Browser Commands
		
		//Chrome Browser
	/*	System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	*/	
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		//driver.navigate().to("https://www.facebook.com/facebook");
		
		// Firefox browser
	/*	System.setProperty("webdriver.gecko.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\geckodriver.exe");
		WebDriver gecko = new FirefoxDriver();*/
		
	/*	System.setProperty("webdriver.gecko.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\geckodriver.exe");
		WebDriver FF = new FirefoxDriver();*/
		
	/*	System.setProperty("webdriver.ie.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\IEDriverServer.exe");
		WebDriver IE = new InternetExplorerDriver();*/
	
	// Close and Quit commands
		//driver.close(); // it closes current active window of the current instance.
		
		//driver.quit();  // it closes all the windows in the current instance.

	/*// Get commands
		driver.get("URL");				// to get the URL on the browser.
		driver.getCurrentUrl();			// to get the current URL available on the browser.
		driver.getTitle();				// to get the current title of the page.
		driver.getClass();				// to get the class name of the element.
		driver.getWindowHandle();		// to get the names of the windows and switch between various windows.
		
	// Navigation commands
		driver.navigate().to("URL"); 	// to open a URL or to navigate to a string.
		driver.navigate().back();  		// to move to previous page.
		driver.navigate().forward(); 	// to move to the next page.
		driver.navigate().refresh(); 	// to refresh the page.
		
	// WebElement Interaction commands:
		driver.findElement(By.id("")).click();			// Clicks on an Element.
		driver.findElement(By.id("")).sendKeys("");		// Types on a text Box.
		driver.findElement(By.id("")).clear();			// Erase text from the text Box.
*/
	
	
	
	}
}
