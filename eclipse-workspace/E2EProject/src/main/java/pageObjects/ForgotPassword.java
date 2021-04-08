package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	WebDriver driver;
	
	public ForgotPassword(WebDriver driver)
	{
		this.driver=driver;
		
	}

	private By serach=(By.id("user_email"));

	public WebElement Search()
	{
		return driver.findElement(serach);
		
		
	}
	
	private By sendme=(By.name("commit"));

	public WebElement Sendme()
	{
		return driver.findElement(sendme);
		
	}
}
