package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingDriverScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.bing.com/");
		
		BingObjects page = new BingObjects(driver);
		UFT_Home page1 = new UFT_Home(driver);
		
		page.BingSearchTab("Edureka");
		//.BingSearchClick();
		Thread.sleep(3000);
		
		try {
		page1.clickFunction();
		}
		catch(Exception e) {}
	}

}
