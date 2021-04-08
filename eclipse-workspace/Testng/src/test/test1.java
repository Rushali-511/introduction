package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void demo()
	{
		System.out.println("rushali");
	}
	
	@BeforeTest
	public void demo1()
	{
		System.out.println("ratho");
	}
	@Test(groups= {"Smoke"})
	public void demo10()
	{
		System.out.println("smoe test1");
	}
	
	@Test(enabled=false)
	public void MobilesignimcarLoan()
	{
		//Appium
		System.out.println("Mobile SIGIN");
	}
}
