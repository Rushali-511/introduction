import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		//System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		//System.out.println("child window ");
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		//System.out.println("parent");
		
		
		
	}

}
