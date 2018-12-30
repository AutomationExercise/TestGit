package module4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	
		String GoogleTitle = driver.getTitle(); // Getting the title
		
		System.out.println("This is " + GoogleTitle + " " +  "Title"); // printing the 'Google' title
		
		boolean Result = GoogleTitle.equals("Google"); // validating the 'Google' title is present
		
		System.out.println("Value is : " + Result); // printing the result
		
		driver.close(); // closing the Window
		
		
	}

}
