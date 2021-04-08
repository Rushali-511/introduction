import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List <WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	SoftAssert a = new SoftAssert();
		for (WebElement link :links)
		{
			String url= link.getAttribute("href");
		URL ur=new URL(url);
		HttpURLConnection conn=(HttpURLConnection)ur.openConnection();
		conn.setRequestMethod("HEAD");
		Thread.sleep(2000);
        conn.connect();
		int rcode=conn.getResponseCode();
		System.out.println(rcode);;
		a.assertTrue(rcode<400,"The link broken is "+link.getText()+"and response code is "+rcode);
		}
		a.assertAll();
		
		}
	}

