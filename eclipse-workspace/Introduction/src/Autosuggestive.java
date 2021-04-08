import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		List <WebElement> lists=driver.findElements(By.className("erkvQe"));
		Thread.sleep(3000);
		for(WebElement list : lists)
		{
			System.out.println("Value are " + list.getText());
			if(list.getText().equalsIgnoreCase("selenium webdriver")) ;
				list.click();
				Thread.sleep(3000);
		}
		
		

	}

}
