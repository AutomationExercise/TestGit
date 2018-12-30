package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) 
	{
			//Open Browser
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
			// Open AUT
		driver.get("https://www.facebook.com/");
				
		/*// Finding the total number of elements starting with a specific tag <> locator:
		 * 
		List <WebElement> element = driver.findElements(By.tagName("select")); // list all those webelements which have a taqName 'Select' and put them into a reference element called 'element'.
		int TotalElements = element.size();
				
		System.out.println(TotalElements);
		
		for (int i = 0; i<TotalElements; i++)
		{
			
			System.out.println(element.get(i).getText());
		
		}*/
		
		
		//Create a list of type WebElement to store all the Link elements in to it.
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i = 0; i <= links.size(); i=i+1)
		{
			System.out.println("Links name : " +links.get(i).getText());
		}
		
		driver.close();
	}

}








