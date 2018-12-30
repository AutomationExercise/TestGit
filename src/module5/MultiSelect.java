package module5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	
	// "Select Class" to focus on the DropDown
		Select mSelect = new Select(driver.findElement(By.id("selenium_commands"))); // focus on the Select element
		
		// Part-1
		// Select and deSelect "Navigation Commands" under 'Selenium Commands'
		
		mSelect.selectByIndex(1); // select the "Navigation Commands" by Index
		
		Thread.sleep(5000); // just to visualize the steps. Not needed in actual execution
		
		mSelect.deselectByVisibleText("Navigation Commands"); // de-select by VisualText
		
		// Run a loop to select, print and then de-select the available options
		List<WebElement> mSize = mSelect.getOptions(); //will list the all the options into mSize
		
		int mTotal = mSize.size(); // will give the size of Total Options -- mTotal = Total Options
		
		System.out.println("Total number of options:- " + mTotal);
		
		for(int i = 0; i<mTotal; i++) {
			
			String sValue = mSize.get(i).getText(); // will get the text of all options
						
			System.out.println("Text value is:- " + sValue); // will print the text of all options
			
			//Thread.sleep(5000); // just to visualize the steps.
			
			mSelect.selectByIndex(i); // will select the text of all options
			
			//Thread.sleep(5000); // just to visualize the steps.
			
			mSelect.deselectByIndex(i); // will de-select the text of all options	
			
		}
		
			mSelect.deselectAll(); // de-selects the all options -- here we have only one option to de-select
	}

}
