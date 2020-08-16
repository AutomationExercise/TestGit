package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequencing {
	
	@Test (priority = 10)
	  public void Eman() {
		  System.out.println("This is Test case 6");
	  }
	  @Test (priority = 8)
	  public void Shifali () 
	  {
		  System.out.println("This is Test case 1");
	  }

	  @Test (priority = 6)
	  public void Nancy() 
	  {
		  System.out.println("This is Test case 2");
	  }

	  @Test (priority = 12)
	  public void Sohail() 
	  {
		  System.out.println("This is Test case 3");
	  }

	  @Test (priority = 4)
	  public void Murad() 
	  {
		  System.out.println("This is Test case 4");
	  }

	  @Test (priority = 2)
	  public void Ayesha() 
	  {
		  System.out.println("This is Test case 5");
	  }


}
