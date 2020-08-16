package module4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfElseStatement {

	static WebDriver driver;
	static String actualTitle;
	static String expectedTitle;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
			
		actualTitle = driver.getTitle();
		expectedTitle = "Google";
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close(); // closing the Window

	}

}
