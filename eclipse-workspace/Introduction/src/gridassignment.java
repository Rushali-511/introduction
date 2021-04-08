import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gridassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement tdriver=driver.findElement(By.xpath("//table[@class='table-display']/tbody"));
		int rowcount=tdriver.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		int ccount=tdriver.findElements(By.xpath("//tr[1]/th")).size();
		System.out.println(ccount);
		int s=tdriver.findElements(By.xpath("//tr[3]/td")).size();
		int i = 0;
		while(i< s)
		{
			System.out.println(tdriver.findElements(By.xpath("//tr[3]/td")).get(i).getText());
			i++;
		}
		
		
		
	}

	private static By ByTagName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
