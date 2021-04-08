import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver=footdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
	
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String move=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(move);
			System.out.println(columndriver.findElements(By.tagName("a")).get(i).getText());
			Thread.sleep(5000L);
		}
		
		Set<String> ids=((WebDriver) columndriver).getWindowHandles();
		Iterator<String> it=ids.iterator();
		while(it.hasNext())
		{
			((WebDriver) columndriver).switchTo().window(it.next());
			System.out.println("hgiygigi");
			System.out.println(((WebDriver) columndriver).getTitle());
			System.out.println("hgiygigi");
			
		}
		
		
	}

}
