package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1 {
	
	// 1. Open the browser
	// 2. Browse the URL
	// 3. Log in the application
	// 4. Log out the application
	
	
	WebDriver driver; 		// make the driver globally available to all annotations
	@Test(priority = 1)
	// 1. Open the browser
	public void OpenAUT() {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
	
		}
	
	@Test (dependsOnMethods = "OpenAUT") // Heart of the Test
	public void Login() throws InterruptedException {
		// log in into an AUT
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();		
		
		Thread.sleep(3000);
	
		}
	@Test (dependsOnMethods = "Login") // we can also write as @AfterSuite -- no matter
	public void Logout() throws InterruptedException {
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		}
	
	}
