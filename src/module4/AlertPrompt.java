package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrompt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.id("prompt")).click();
		
		Alert pAlert = driver.switchTo().alert(); // switch from current window to an 'Alert'
		
		//System.out.println(pAlert.getText()); // print the text in the alert if we want
		
		pAlert.sendKeys("Muhammad Lilla");
		
		pAlert.accept(); // accept the alert -- if we want to accept the alert
		
		
		
		// If we want to validate the text written in an alert
		
		String Text = driver.findElement(By.id("msg")).getText(); // capture the text in 'Text' variable
		
		System.out.println(Text);
		
		boolean Result = Text.equals("Hello Muhammad Lilla! How are you today?"); // compare the actual text VS expected text
		
		System.out.println(Result);
		
		
		}

}
