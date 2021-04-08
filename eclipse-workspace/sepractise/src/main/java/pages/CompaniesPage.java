package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;




public class CompaniesPage {
	
	@FindBy(css="a[title='Companies']")
	WebElement company;
	
	public WebElement Gotocomapny()
	{
		return company;
	}
	

	@FindBy(css="select[name='cs_status']")
	WebElement status;
	
	@FindBy(css="select[name='doAction']")
	WebElement check;
	
	@FindBy(css="input[value='DO']")
	WebElement action;
	
	public WebElement Actions()
	{
		return action;
	}
	

	@FindBy(css="a[name='cs_category']")
	WebElement category;
	
	

	@FindBy(css="input[name='cs_extended']")
	WebElement extended;
	public WebElement Extended()
	{
		return extended;
	}

	@FindBy(css="input[name='cs_name']")
	WebElement name;
	public WebElement Name()
	{
		return name;
	}

	@FindBy(css="input[name='cs_notes']")
	WebElement notes;
	public WebElement Notes()
	{
		return notes;
	}
	
	@FindBy(css="input[name='cs_website']")
	WebElement website;
	public WebElement website()
	{
		return website;
	}

	 
	 public void Ststus()
	 {
		 Select s=new Select(status);
		 s.selectByValue("Hot");
	 }
	   
	 public void category()
	 {
		 Select s=new Select(category);
		 s.selectByValue("Partner");
	 }
	   
	   
	 public void checkrecords()
	 {
		 Select s=new Select(check);
		 s.selectByValue("Checked records:");
	 }
	   
	

}
