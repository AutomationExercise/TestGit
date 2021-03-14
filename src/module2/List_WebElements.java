package module2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class List_WebElements {

	public static void main(String[] args) {
		
		// 1.Launch Chrome browser using Selenium WebDriver
				System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
							
		// 2. Navigate to "https://www.edureka.co"
				driver.get("https://www.edureka.co");
				
		// 3. Write a Java code using Selenium WebDriver to make sure that all the element attributes are found on the webpage
				
				 List <WebElement> element = driver.findElements(By.tagName("a"));
		
				int TotalElements = element.size();
				
				System.out.println(TotalElements);
				
				for(int i = 0; i <= TotalElements; i++ )
				{
					System.out.println("Text is : " + element.get(i).getText());
					
					
				
				/* List <WebElement> element = driver.findElements(By.tagName("div"));
					int Elements_Total = element.size();
					
					System.out.println(Elements_Total);
					for(int i = 0; i <= Elements_Total; i++ )
					{
					
						System.out.println(element.get(i).getText());*/
					//	System.out.println("Text is : " + element.get(i).getText());
				}
			}
		}

	
