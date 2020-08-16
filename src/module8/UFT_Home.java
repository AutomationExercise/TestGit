package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UFT_Home {
	public UFT_Home(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText= "Videos")
	WebElement clickLink;
	
	@FindBy(linkText= "Edureka")
	WebElement verifyText;
	
	public void clickFunction() throws InterruptedException
	{
		clickLink.click();
		
		Thread.sleep(3000);
		
		verifyText.click();
	}

}
