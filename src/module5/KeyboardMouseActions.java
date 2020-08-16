package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
			// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/");
		
		WebElement FName = driver.findElement(By.name(""));
		
		Actions act = new Actions(driver);
		
		Action newAct = (Action) act.moveToElement(FName)
				.keyDown(FName, Keys.SHIFT)
				.sendKeys("muhammad")
				.keyDown(FName, Keys.SHIFT)
				.build();
		
		newAct.perform();
		
	}

}
