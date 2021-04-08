package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(id="user_email")
	WebElement email;

	public WebElement Eemail()
	{
		return email;
	}
	

	@FindBy(id="user_password")
	WebElement password;

	public WebElement pass()
	{
		return password;
	}
	@FindBy(name="commit")
	WebElement submit;

	public WebElement submit() {
		// TODO Auto-generated method stub
		return submit;
	}
	
	By forpasss=By.cssSelector("a[href*='password/new']");

	
		
	}
