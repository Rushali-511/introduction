package objectrepositries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tools {


	WebDriver driver;

		
		public Tools(WebDriver driver) {
			this.driver=driver;
	}
		By link=By.cssSelector("div.navbar-area.headroom.header:nth-child(3) div.container ul.navbar-nav.m-auto li.nav-item:nth-child(4) > a:nth-child(1)");

		By tool=By.cssSelector("div.navbar-area.headroom.header:nth-child(3) div.container ul.navbar-nav.m-auto li.nav-item:nth-child(4) ul:nth-child(2) li:nth-child(2) > a:nth-child(1)");
		

		public WebElement goTools() {
			// TODO Auto-generated method stub
			return driver.findElement(tool);
		}
		

		public WebElement golin() {
			// TODO Auto-generated method stub
			return driver.findElement(link);
		}
		
	}


