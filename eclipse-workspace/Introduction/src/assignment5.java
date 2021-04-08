import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//legend[text()='Checkbox Example'] /following-sibling::label[2] /input")).click();
		String checkbox=driver.findElement(By.xpath("//legend[text()='Checkbox Example'] /following-sibling::label[2] /input")).getText();
		Select s=new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
		s.selectByVisibleText(checkbox);q
		driver.findElement(By.name("enter-name")).sendKeys(checkbox);
		driver.findElement(By.id("alertbtn")).click();
		String str =driver.switchTo().alert().getText();
		if(str.contains(checkbox))
		{
			System.out.println("success");
		}
			else
			{
				System.out.println("falied");
		}
		
	}

}
