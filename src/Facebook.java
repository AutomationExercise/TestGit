import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	
		// Open Browser
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open AUT
		driver.get("https://www.facebook.com/");
		
	/*	//Using ID:
		driver.findElement(By.id("u_0_c")).sendKeys("Muhammad");
		driver.findElement(By.id("u_0_e")).sendKeys("Lilla");
		
		// Using Name:
		// Enter email
		driver.findElement(By.name("reg_email__")).sendKeys("email@gmail.com");
		// Re-enter email
*/	/*	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("email@gmail.com");*/
		
	/*	// Using Class Name:
		driver.findElement(By.className("inputtext")).sendKeys("Muhammad");
		driver.findElement(By.className("inputtext")).sendKeys("Lilla");
		*/
		/*// Using link Text
		driver.findElement(By.linkText("Forgot account?")).click();
		
		// Navigation commands
		driver.navigate().back();
		driver.navigate().refresh();
		
		// Partial link Text
		driver.findElement(By.partialLinkText("account?")).click();
		
		// Navigation commands
		driver.navigate().back();
		//driver.navigate().forward();		
*/		
		// Using CSS = Cascading Style Sheet
		// CSS locator on radio Button:
		//driver.findElement(By.cssSelector("#u_0_9")).click();
		//driver.findElement(By.cssSelector("#u_0_s > span:nth-child(2) > label")).click();
		
	/*	//CSS locator on drop list:
		driver.findElement(By.cssSelector("#month > option:nth-child(13)")).click();
		driver.findElement(By.cssSelector("#day > option:nth-child(13)")).click();
		driver.findElement(By.cssSelector("#year > option:nth-child(8)")).click();
		*/
		
		// Using XPath locator
		driver.findElement(By.xpath("//input[@type= 'email']")).sendKeys("Muhammad");
		driver.findElement(By.xpath("//*[@id= 'pass']")).sendKeys("Lilla");
		
		
		//driver.close(); // close the browser.
		
		
		
	}

}
