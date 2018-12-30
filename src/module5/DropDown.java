package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	
	// "Select Class" to focus on the DropDown
		Select oSelect = new Select(driver.findElement(By.xpath("//*[@id= 'continents']"))); // focus on the Select element
		
		// 3 ways to handle this DropDown:
				// 1. Select by Index 
				// 2. Select by Visible text 
				// 3. Select by Value 
		Thread.sleep(5000); // just to visualize the steps. Not needed in actual execution
		
		// 1. Select by Index -- eg Africa
		oSelect.selectByIndex(2);
		
		Thread.sleep(5000); // just to visualize the steps
		// 2. Select by Visible text -- eg South America
		oSelect.selectByVisibleText("South America");
		
		Thread.sleep(5000); // just to visualize the steps
		
		// 3. Select by Value -- Antarctica
		oSelect.selectByValue("g"); // value option may not be available on all DropDowns
			
	}

}
