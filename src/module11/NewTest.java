package module11;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GridExampleTest {
	public RemoteWebDriver driver;
	public static String appURL = "http://www.google.com";
  
  @BeforeTest
  public void setUp() {
	  DesiredCapabilities capabilities = new DesiredCapabilities.chrome();
	  driver = new RemoteWebDriver(new URL("http://192.165.137.1:5555/wd/hub"), capabilities);
	  
  }

  @Test
  public void testGooglePageTitle() {
	  System.out.println("*** navigate to application ***");
	  driver.navigate().to("appURL");
	  String strPageTitle = driver.getTitle();
	  System.out.println("*** varifying page title ***");
	  Assert.assertTrue(strPageTitle.equals("Google"), "Page title doesn't match");
  }
  
  @AfterTest
  public void closeBrowser() {
	  if(driver != null) {
		  driver.close(); 
	  }
	  
  }

}
