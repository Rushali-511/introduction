package Academy.E2EProject;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(base.class.getName());
@Test(dataProvider="getData")

	public void initialize(String username, String pass, String text ) throws IOException
	{
	driver =InitializeDriver();
	String urlname=prop.getProperty("url");
	 driver.get(urlname);
		 LandingPage lp=new LandingPage(driver);
		 LoginPage lo=lp.Lbutoon();
		 lo.Eemail().sendKeys(username);
		 lo.pass().sendKeys(pass);
		 lo.submit().click();	 
			 
	}
	
 
 @DataProvider
 public Object[][] getData() {
	Object[][] data=new Object[2][3];
	 data[0][0]="nonrestricteduser@qw.com";
	 data[0][1]="gjrvytrby";
	 data[0][2]="nonrestricfed";
	 
	 data[1][0]="restricteduser@qw.com";
	 data[1][1]="dwoiefj";
	 data[1][2]="restricted";
	 return data;	 
	 
 }
 	
}
