package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects {
		// first we need to create the Constructor for this class, so that the methods on this constructor can be accessed by the Tests
	public BingHomePageObjects(WebDriver driver) {
		// there is an inbuilt PageFactory class in Selenium which will initialize the elements below.
		PageFactory.initElements(driver, this);
		}
	
	// write text into "Text Search" bar
			@FindBy(name= "q")
			public WebElement searchText;
						
			// click onto the search button
			@FindBy(id= "sb_form_go")
			public WebElement clickButton;
			
			

			public void setTextValue (String Edureka)
			{
				searchText.sendKeys("Edureka");
			}
			
			public void clickSearchBtn()
			{
				clickButton.click();
			}
}






/*'Function to Click on a Button
Function button_click (Prop_InnerText, Prop_HtmlTag)
	err.clear
	Dim oWebButton
	Set oWebButton = Description.Create
	oWebButton("innertext").Value = Prop_InnerText
	oWebButton("html tag").Value = Prop_HtmlTag
	MyBrowser.WebButton(oWebButton).Click
	Set oWebButton = Nothing*/	