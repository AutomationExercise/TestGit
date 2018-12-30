package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		// change the focus of the WebDriver from the page to a particular part of page.
		// Specify 3 elements:
		
		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		
		driver.switchTo().frame(iFrame);
		
		WebElement From = driver.findElement(By.id("draggable"));
		
		WebElement To = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver); // need to import the Actions Class
		
		act.dragAndDrop(From, To).perform(); // perform the 'drag and drop' action

	}

}
