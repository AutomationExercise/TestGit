package googleHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	// create a constructor for GoogleHomePageObjects
	 public GoogleHomePageObjects(WebDriver driver)
			{
		PageFactory.initElements(driver, this);
			}
	
	@FindBy(name ="q")
	public WebElement searchText;
	
	@FindBy(name ="btnK")
	WebElement clickButton;
	
	// create the methods for these WebElements:


	public void searchTextBing(String writeText) {

		searchText.clear();
		searchText.sendKeys("writeText");
		clickButton.click();
	}
	
}
