package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class portallogin {
	WebDriver driver;
	public portallogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath="//a[contains(text(),'My Courses')]")
	WebElement mycourse;

	public WebElement courses()
	{
		return mycourse;
	}
	
}
