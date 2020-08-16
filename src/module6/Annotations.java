package module6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void Eman() {
	  System.out.println("This is Test case 6");
  }
  @Test
  public void Shifali () 
  {
	  System.out.println("This is Test case 1");
  }

  @Test
  public void Nancy() 
  {
	  System.out.println("This is Test case 2");
  }

  @Test
  public void Sohail() 
  {
	  System.out.println("This is Test case 3");
  }

  @Test
  public void Murad() 
  {
	  System.out.println("This is Test case 4");
  }

  @Test
  public void Ayesha() 
  {
	  System.out.println("This is Test case 5");
  }

}

