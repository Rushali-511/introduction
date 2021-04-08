package test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 
import base.Base;
import pages.LandingPage;
import pages.SearchPage;

public class HomePageTest  extends Base
	{
	 public WebDriver driver;
		@BeforeSuite
		public void initialize( ) throws IOException
		{
	    driver=Intializedriver();
		String urlname=prop.getProperty("url");
		driver.get(urlname);
		LandingPage lp=new LandingPage(driver);
		lp.Username().sendKeys("Rushali");
		lp.Password().sendKeys("Rushu@9340");
		lp.Login().click();
		}
		
		@Test
		public void Search()
		{
		SearchPage sp=new SearchPage();
		driver.switchTo().frame("mainpanel");
         sp.SearchinCRM();
		 sp.Image().click();
		}
		
		/*@DataProvider
		public Object[][] getdata() {
			Object[][] obj=new Object[1][3];
			
			obj[0][0]="Rushali";
			obj[0][1]="Rushu@9340";
			obj[0][2]="hbhb";
			return obj;*/
			
			
		
		
		
	}

