package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText {
	
	public static WebDriver driver; // declare the WebDriver globally to access for all methods
	
	public static void main(String[] args) throws InterruptedException {
		// open the chrome driver
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.bing.com"); // open the URL
		
		// create the reference object for BingHomePageObjects page class
		BingHomePageObjects page = new BingHomePageObjects(driver);
		
		
		page.setTextValue("Edureka"); // set the value in the Bing search bar
		
		page.clickSearchBtn(); // click on a search button
		
		// click on 
			
		
	}

}
