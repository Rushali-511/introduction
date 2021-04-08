import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class hiddenelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		driver.findElement(By.id("displayed-text"));
		driver.findElement(By.id("hide-textbox")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('displayed-text').value='Selenium';");
		String text=(String) js.executeScript("return document.getElementById('displayed-text').value");
		System.out.println(text);
		
		
		
		
	}

}
