import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.collections.Sets;

public class Sorrtweb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
			Set<String> sds=driver.getWindowHandles();
			Iterator<String> its= sds.iterator();
			String parentid=its.next();
			String childid=its.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();
			List<WebElement> orilist=(List<WebElement>) driver.findElements(By.xpath("//tbody/tr"));	
			List<String> originalist=orilist.stream().map(s->s.getText()).collect(Collectors.toList());
			//List <String> sortedlist=originalist.stream().sorted().collect(Collectors.toList());
			//Assert.assertFalse(originalist.equals(sortedlist));
			List <String> price ;
			do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Wheat")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(s-> System.out.println(s));
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
			}while(price.size()<1);
	}
			
			private static String getPriceVeggie(WebElement s) {

				// TODO Auto-generated method stub

				String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
				return pricevalue;
			}

}
