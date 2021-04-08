package pages;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import base.Base;



public class SearchPage extends Base
{
	@FindBy(css="input[name='search']")
	WebElement search;
	
	@FindBy(css="input[type='image']")
	WebElement image;
	
	public WebElement Image()
	{
		return image;
	}
	
	public void SearchinWeb()
	{
		 Select s=new Select(search);
		   s.selectByVisibleText("Web");
	}
	
	public void SearchinCRM()
	{
		 Select s=new Select(search);
		   s.selectByVisibleText("CRM");
	}
	

}
