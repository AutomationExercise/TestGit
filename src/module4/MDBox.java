package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDBox { //Modal Dialogue Box

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2018/04/popups.html");
		
		driver.findElement(By.xpath("//*[@href= '#0']")).click();
		driver.findElement(By.xpath("//*[@type= 'text']")).sendKeys("Muhammad Lilla");
		driver.findElement(By.xpath("//*[@class= 'alert']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//*[@class= 'close']")).click();
		
		driver.close();
		
	}

}
