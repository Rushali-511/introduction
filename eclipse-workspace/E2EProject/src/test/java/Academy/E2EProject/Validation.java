package Academy.E2EProject;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class Validation extends base {
	
	public WebDriver driver;
		
	public static Logger log =LogManager.getLogger(base.class.getName());
	LandingPage lp;
	@BeforeTest
	public void driverinitialize() throws IOException
	{
		driver =InitializeDriver();
		System.out.println("text77");	 
	}
	
	@Test

		public void initialized()  throws IOException
		{
		String urlname=prop.getProperty("url");
		 driver.get(urlname);
		 System.out.println("text776666");
			 log.info("not displayed");
			 lp=new LandingPage(driver);
			 Assert.assertTrue(lp.Visible().isDisplayed());
			 System.out.print("jcjfjffjfj");
			 Assert.assertEquals(lp.check().getText(), "FEATURED COURSES");
			 log.error("id displayed");
			 
		}
	
	@Test
	public void checcourses()
	{
	lp.Courses().click();
	System.out.print("aaaa");
	}
}
