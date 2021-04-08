import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
			Set<String> sds=driver.getWindowHandles();
			Iterator<String> its= sds.iterator();
			String parentid=its.next();
			String childid=its.next();
		driver.switchTo().window(childid);
		driver.findElement(By.id("search-field")).sendKeys("Wheat");
		List <WebElement > list=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filterlist=list.stream().filter(s->s.getText().contains("Wheat")).collect(Collectors.toList());
		Assert.assertEquals(list.size(), filterlist.size());
		
		
		
		
		
		
	}

}
