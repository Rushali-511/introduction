package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void demo()
	{
		System.out.println("personal loan");
	}
	
	@Test
	public void demo1()
	{
		System.out.println("home loan");
		Assert.assertTrue(false);
	}

	
	public void demo10()
	{
		System.out.println("smoe day4");
	}

}
