package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class= '_2AkmmA _29YdH8']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Jackets");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type= 'submit' and @class='vh79eN']")).click();
		
		Thread.sleep(5000);
		//WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div[1]/div/img"));
		WebElement mouseHover = driver.findElement(By.xpath("//*[@class= '_3YmFT8']//following::img[1]"));
		
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		
		Thread.sleep(5000);
		act.moveToElement(mouseHover).perform();
 
	}

}
