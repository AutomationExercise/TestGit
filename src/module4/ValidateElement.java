package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
	
		/*driver.findElement(By.id("profession-0")).click(); // click on a 'CheckBox "Manual Tester"'
		
		WebElement element = driver.findElement(By.id("profession-0")); // find the value of 'CheckBox' webelement 
		// and put into a reference called 'element'
		*/
		driver.findElement(By.xpath("//*[@name= 'profession' and @id= 'profession-1']")).click(); // click on a 'CheckBox "Automation Tester"'
		
		WebElement element = driver.findElement(By.xpath("//*[@name= 'profession' and @id= 'profession-1']")); 	// find the value of 'CheckBox' webelement 
																		// and put into a reference called 'element'
		
		boolean result = element.isSelected(); // validate that the element is present
		
		System.out.println("Value is: " + result);
	
		driver.close(); 
	
	}

}
