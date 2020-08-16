package googleHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleDriverScript {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		
		page.searchTextBing("UFT");
	
		
				
		/*WebElement setText = driver.findElement(By.name("q")); // is replaced by above code
		setText.sendKeys("SeleniumHQ");
		
		Thread.sleep(3000);
		//page.clickSearchButton();
		
		WebElement clickButton = driver.findElement(By.name("btnK"));
		clickButton.click();*/
		
	}

}
