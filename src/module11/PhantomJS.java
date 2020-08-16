package module11;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJS {

	public static void main(String[] args) {
		
		String googleTitle; // creating the variable
		
		/*// open the browser
		  System.setProperty("phantomjs.binary.path", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\phantomjs.exe");
		  */
		  
		//ALTERNATIVE WAY:
		
		 // create a file path object/instance 	
		File file = new File ("M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
		
		 WebDriver driver = new PhantomJSDriver();
		
		  // launch the application
		  driver.get("https://www.google.com/");
		  
		  WebElement search = driver.findElement(By.name("q"));
		  search.sendKeys("Edureka");
		  search.submit();
		  
		  // get the title and put into a local variable
				  
		 googleTitle = driver.getTitle();
		 
		 System.out.println("Google title is: " +googleTitle);
		 
		 //Reporter.log(googleTitle);

	}

}
