package module11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitbrowser {

	public static void main(String[] args) {
		
		  // WE DONT NEED THESE LINES.
		 /* // open the browser
		  System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();*/
		  
		
		// Creating a new instance (object) of the HTML unit driver.
		  WebDriver driver = new HtmlUnitDriver(); // Headless browser for fast execution without using browser.
		  
		  // launch the application
		  driver.get("https://www.google.com/");
		  
		  WebElement search = driver.findElement(By.name("q"));
		  search.sendKeys("Edureka");
		  
		  search.submit(); // submitting the query
		  
		  // get the title and put into a local variable
				  
		 String googleTitle = driver.getTitle();
		 
		 System.out.println("Google title is: " +googleTitle);
		 
		 //Reporter.log(googleTitle);
		 
	}

}
