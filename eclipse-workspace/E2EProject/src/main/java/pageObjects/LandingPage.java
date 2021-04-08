package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	By signin=By.cssSelector("a[href*='sign_in']");

	public LoginPage Lbutoon()
	{
		driver.findElement(signin).click();
		LoginPage lo=new LoginPage(driver);
		return lo;
		
	}
	
	@FindBy(xpath="//span[text()='Register']")
	WebElement visible ;
	
	public WebElement Visible()
	{
		return visible;
	}
	
	@FindBy(xpath="//h2[contains(text(),'Featured Courses')]")
	WebElement Contact;

	public WebElement check()
	{
		return Contact;
	}
	@FindBy(xpath="\"//a[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']")
			WebElement courses;

	public WebElement  Courses()
	{
		return courses;
		
	}
By popup=By.xpath("//button[contains(text(),'NO THANKS')]");
	
public List<WebElement>  popupp()
{
 return driver.findElements(popup);
}

public WebElement popupclic()
{
 return driver.findElement(popup);
}	
	}

