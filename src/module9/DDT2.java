package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DDT2 {

	WebDriver driver;
	
	@BeforeTest
	// launch the browser
	public void launchBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
	}
	
	
	
	@Test
	// enter the credentials
	public void fillForm() throws Exception
	
	{	Thread.sleep(3000);
		//	a. enter the first name
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys("Sohail");
		Thread.sleep(3000);
//		b. enter the last name
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys("Feroze");
		Thread.sleep(3000);
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys("VA");
		Thread.sleep(3000);
		//	c. click on the button
		driver.findElement(By.name("Submit1")).clear();
		driver.findElement(By.name("Submit1")).click();
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
