
// 1. Test are checked alphabetically first.
// 2. Secondly, Tests are checked by priority that is set.
// 3. Thirdly, Test are checked by dependency that is set.
// *. Priority and dependency can be clubbed together.


package module6;

import org.testng.annotations.Test;

public class Dependencies {
	
	@Test (priority = 10)
	  public void Eman() {
		  System.out.println("This is Test case 6");
	  }
	  @Test (priority = 8, enabled = false) // we can disable any test so that not to run.
	  public void Shifali () 				// we can decide which TCs to run and which TCs not.
	  {
		  System.out.println("This is Test case 1");
	  }

	  @Test (priority = 6, enabled = true) // we can enable any test to run again.
	  public void Nancy() 
	  {
		  System.out.println("This is Test case 2");
	  }

	  @Test (priority = 12, dependsOnMethods = "Ayesha")	// we can also club priorities and dependencies
	  public void Sohail() 									// it will first look for priority and then dependency
	  {
		  System.out.println("This is Test case 3");
	  }

	  @Test (priority = 4, dependsOnMethods = "Ayesha")
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

