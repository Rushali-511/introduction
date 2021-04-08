package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

	@Parameters({"URL","NO"})
	@Test
	public void MobilesignimcarLoan(String uname,String nname)
	{
		//Appium
		System.out.println("Mobile SIGINout");
		System.out.println(uname);
		System.out.println(nname);
	}
	
	@BeforeClass
	public void demo4()
	{
		System.out.println("before class");
	}
	@Test(dataProvider="takedata")
	public void demo2(String un,String pd)
	{
		System.out.println("wipro linnited");
		System.out.println(un);
		System.out.println(pd);
	}
	
@DataProvider
public Object[][] takedata()
{
	Object[][] data=new Object[3][2];
	data[0][0]="fun";
	data[0][1]="fpd";
	data[1][0]="2un";
	data[1][1]="2pd";
	data[2][0]="3un";
	data[2][1]="3pd";
	return data;
	
	
}
}
