package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		
		//get the name of main window name
		
		// Part-1 Get the Main Window name
		String MW = driver.getWindowHandle(); // captures the window name
		System.out.println("Main Window Name is:- " + MW); // prints the Main Window name
		System.out.println("============================"); // partitions the results
		
		//Part-2 Click on the 'New Message Window' and capture the Name
		driver.findElement(By.xpath("//*[@id=\'alert\']//preceding::button[2]")).click();
		
		/*String SWN = driver.getWindowHandle();
		System.out.println("Second Window Name is:- " + SWN); // prints name of second Window
		System.out.println("============================"); // partitions the results
		*/
		
		Set <String> AWN = driver.getWindowHandles();
		System.out.println("All Window Name is:- " + AWN); // prints names of all Windows
		System.out.println("============================"); // partitions the results
		
		//Part -3 Switch between Windows -- using the 'for loop' concept
				
		for (String SW : driver.getWindowHandles()) // change '=' sign to ':' sign
		{
			Thread.sleep(5000);				// just to view the process
			
			driver.switchTo().window(SW);	// switch from active window A to non-active window B during first iteration
			
			Thread.sleep(5000);				// just to view the process
			
			driver.switchTo().window(SW);	// switch from active window B to non-active window A during second iteration
			
		}
		 
		driver.close();		// closes only the active window
			
		//driver.quit();		// closes all the windows
	}

}
