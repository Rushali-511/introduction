package objectrepositries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {


	WebDriver driver;		
		public Login(WebDriver driver) {
			this.driver=driver;
			
	}

		
		By search=By.xpath("//input[@type='text']");
		//@FindBy(xpath="//input[@type='text']")
		//WebElement search;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
		
		public WebElement serachh() {
			// TODO Auto-generated method stub
			return driver.findElement(search);
		}
		public WebElement submit() {
			// TODO Auto-generated method stub
			return submit;
		}
		
	}


