package test;
import java.io.IOException;

import java.util.Properties;
import org.testng.annotations.Test;
import pages.CompaniesPage;


public class CompnayTest {
	@Test
	public void companysearch() throws IOException
	{
	    CompaniesPage cp=new CompaniesPage();
		cp.Gotocomapny().click();
		cp.Ststus();
		cp.category();
		cp.Name().sendKeys("Wipro");
		cp.Extended().sendKeys("mvonv");
		cp.Notes().sendKeys("efniuh8uy2hgmgufi32n");
		cp.website().click();
		cp.checkrecords();
		cp.Actions().click();
		
		
	
	}
}
