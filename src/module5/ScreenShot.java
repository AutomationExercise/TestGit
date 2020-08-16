package module5;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	try {
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	
		
		driver.findElement(By.xpath("//*[@name= 'profession' and @id= 'profession-1']")).click(); // click on a 'CheckBox "Automation Tester"'
		
		WebElement element = driver.findElement(By.xpath("//*[@name= 'profession' and @id= 'profession-1']")); 	
	}
	catch(Exception e) {
	// find the value of 'CheckBox' webelement 
			
		// Syntax to capture and save the screenshot.															// and put into a reference called 'element'
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			//Syntax to store in our local drive.
		
	FileUtils.copyFile(screenshotFile, new File("M:\\Lilla\\studyStuff.ping"));
	
	}
		System.out.println("screenshot is captured");
		 
		
	

	}

}
