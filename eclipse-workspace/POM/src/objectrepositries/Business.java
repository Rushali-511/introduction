package objectrepositries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Business {

	WebDriver driver;

		
		public Business(WebDriver driver) {
			this.driver=driver;
	}

		By bemail=By.xpath("//img[@title='Email For Business: Starting @ Rs. 43/Month']");
		

		public WebElement Businessemail() {
			// TODO Auto-generated method stub
			return driver.findElement(bemail);
		}
		
	}


