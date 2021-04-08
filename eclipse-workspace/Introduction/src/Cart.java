import java.util.Arrays;

import java.util.Arrays;
import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsadded= {"Cucumber","Brocolli","Beetroot","Beans"};
		additems(driver,itemsadded);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver,5);
		driver.findElement((By.xpath("//img[@alt='Cart']"))).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettycademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		
	}

	private static void additems(WebDriver driver, String[] itemsadded) {
		// TODO Auto-generated method stub
	
		int times=0;
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++)
		{
			System.out.print("nguynuy");
			String[] name=products.get(i).getText().split("-");
			String fname=name[0].trim();
			System.out.println(fname);
			List al=Arrays.asList(itemsadded);
			System.out.println(al);
			if(al.contains(fname))
			{
				times++;
				System.out.println("22");
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if(times==itemsadded.length) 
					{
						break;
					}
	}

		}
	}
}