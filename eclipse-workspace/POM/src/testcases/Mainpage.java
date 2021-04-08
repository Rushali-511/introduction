package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositries.Business;
import objectrepositries.Login;
import objectrepositries.Tools;

public class Mainpage {

	@Test
	public void GotoBusinessemail() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://businessemail.rediff.com/?sc_cid=inhome");
		Business b=new Business(driver);
		b.Businessemail().click();
		System.out.println("bussiness");
		Tools t=new Tools(driver);
		t.goTools();
		System.out.println("tools");
		t.golin().click();
		System.out.println("lin");
		Thread.sleep(3000);
		Login l=new Login(driver);
		l.serachh();
		System.out.println("tools");
		l.serachh().sendKeys("email");
		l.submit();
		
		
		
	}

}
