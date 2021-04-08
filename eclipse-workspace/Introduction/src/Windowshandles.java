import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set <String> sds=driver.getWindowHandles();
		Iterator<String> its=sds.iterator();
		String parentid=its.next();
		String childid = its.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Potato");
		List <WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		List <WebElement> expectedlist=list.stream().filter(s->s.getText().contains("Potato")).collect(Collectors.toList());
		driver.switchTo().window(parentid);
		
		
		
		

	}

}
