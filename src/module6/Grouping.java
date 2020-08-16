package module6;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= "HomePage", priority= 1)
	public void TC1() 
	{
		System.out.println("HomePageTest1");
	}

	@Test(groups= "Services" , priority= 4)
	public void TC2()
	{
		System.out.println("ServicesTest1");
	}
	
	@Test(groups= "ContactUs" , priority= 7)
	public void TC3() 
	{
		System.out.println("ContactUsTest1");
	}
	
	@Test(groups= "HomePage" , priority= 2)
	public void TC4()
	{
		System.out.println("HomePageTest2");
	}
	
	@Test(groups= "HomePage" , priority= 3)
	public void TC5()
	{
		System.out.println("HomePageTest3");
	}
	
	@Test(groups= "Services" , priority= 5)
	public void TC6() 
	{
		System.out.println("ServicesTest2");
	}
	
	@Test(groups= "ContactUs" , priority= 8)
	public void TC7() 
	{
		System.out.println("ContactUsTest2");
	}
	
	@Test(groups= "Services" , priority= 6)
	public void TC8() 
	{
		System.out.println("ServicesTest3");
	}
	
	@Test(groups= "ContactUs" , priority= 9)
	public void TC9() 
	{
		System.out.println("ContactUsTest3");
	}

}
