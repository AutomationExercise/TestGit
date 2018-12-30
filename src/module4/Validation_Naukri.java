package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Naukri {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "M:\\Lilla\\Installation_Stuff\\SeleniumFiles\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		// click on log in button
		driver.findElement(By.xpath("//*[@id=\'login_Layer\']/div")).click(); // clicking on log in link
		
		
		// click on user Id field
		
		driver.findElement(By.xpath("//*[@id= 'eLoginNew']")).click(); //click on 'User Id field'
		
		// click on the password field
		driver.findElement(By.xpath("//*[@id= 'pLogin']")).click(); //clicking on 'Password field'
		
		
		// validate the 'prompt text'
		// capture the text value and put into reference element 'Text'
		String Text = driver.findElement(By.id("eLoginNew_err")).getText(); // capturing the prompt error 
		
		System.out.println(Text); // printing the captured text
		
		boolean Result = Text.equals("Please enter your Email ID / Username"); // Verifying the error prompt msg
		
		System.out.println("Result - " + Result);
		
		driver.close();
		

	}

}
