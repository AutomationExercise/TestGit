package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		driver.findElement(By.id("confirm")).click();
		
		Alert cAlert = driver.switchTo().alert(); // switch from current window to an 'Alert'
		
		System.out.println(cAlert.getText()); // print the text in the alert
		
		cAlert.accept(); // accept the alert -- if we want to accept the alert
		
		cAlert.dismiss(); // reject the alert -- if we want to reject the alert

	}

}
