package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TagName {

	public static void main(String[] args) 
	{
			//Open Browser 
		
		System.setProperty("webdriver.gecko.driver","C:\\TestEclipse\\Edureka_15thDec\\Driver\\geckodriver.ext");
		WebDriver driver = new FirefoxDriver();
				
			// Open AUT
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		String title= driver.getTitle();
		System.out.println(title);
		System.out.print(title); 
				
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
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i = 0; i <= links.size(); i=i+1)
		{
			System.out.println("Links name : " +links.get(i).getText());
		}
		
		driver.close();*/
	}

}








