package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day3 {
	@Test
	public void dem1()
	{
		System.out.println("web login");
	}	
	@Parameters({"URL"})
	@Test
		public void demo1(String uname)
		{
			System.out.println("punjab sind bank");
			System.out.println(uname);
		}
	
}
