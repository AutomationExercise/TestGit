package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSimple {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.id("alert")).click();
		
		Alert sAlert = driver.switchTo().alert(); // switch from current window to an 'Alert'
		
		sAlert.accept(); // accept the alert
		
	}

}
