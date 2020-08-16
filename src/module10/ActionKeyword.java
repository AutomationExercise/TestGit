package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {
	static WebDriver driver;
	
	public static void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void Navigate() {
		driver.get("https://www.google.com");
	}
	
	 public static void ClickGmail() throws InterruptedException {
		 driver.findElement(By.linkText("Gmail")).click();
		 Thread.sleep(5000);
	 }
}
