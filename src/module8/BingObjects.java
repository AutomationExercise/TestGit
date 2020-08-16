package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingObjects {
	
	public BingObjects( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "sb_form_q")
	public WebElement BingSearch;
	
	@FindBy(name="go")
	public WebElement BingClick;
	
	public void BingSearchTab(String TextValue)
	{
		BingSearch.sendKeys(TextValue);
		BingClick.click();
	}
	
	
	/*public void BingSearchClick()
	{
		BingClick.click();
	}*/

}
