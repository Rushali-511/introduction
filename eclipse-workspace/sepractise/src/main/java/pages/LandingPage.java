package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LandingPage extends Base {
	
	WebDriver driver;
	 
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signup;
	
	public WebElement SignUp()
	{
		return signup;
	}
	
	@FindBy(xpath="//a[contains(text(),'Features')]")
	WebElement features;
	 
	public WebElement Features()
	{
		return features;
	}
	
	@FindBy(xpath="//a[contains(text(),'Pricing')]")
	WebElement pricing;
	 
	public WebElement Pricing()
	{
		return pricing;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	 
	public WebElement Contacts()
	{
		return contacts;
	}
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	 
	public WebElement Login()
	{
		return login;
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	 
	public WebElement Username()
	{
		return username;
	}
	

	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	 
	public WebElement Password()
	{
		return password;
	}
	
	
	
	
	

}
