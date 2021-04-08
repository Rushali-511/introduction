import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LINKCOUNT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement fdriver=driver.findElement(By.id("footerTable"));
		WebElement rdriver=fdriver.findElement(By.xpath("//table[@id='footerTable']/tbody/tr[3]"));
		int size=rdriver.findElements(By.tagName("td")).size();
		System.out.println(size);
		for(int i=0; i< size;i++)
		{
			String move=Keys.chord(Keys.CONTROL, "a");
			rdriver.findElements(By.tagName("td")).get(i).sendKeys(move);
			System.out.println(rdriver.findElements(By.tagName("td")).get(i).getText());
		}
		
	}

}
