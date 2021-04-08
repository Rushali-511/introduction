import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class seleniumfeatures {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement pass=driver.findElement(By.id("exampleInputPassword1"));
		//System.out.println(driver.findElement(withTagName("label").above(pass)).getText());
		/*WebElement birth=driver.findElement(By.xpath("//lable[@text='Date of Birth"));
		System.out.println(driver.findElement(withTagName("input").below(birth)).getText());
		WebElement left=driver.findElement(By.id("exampleCheck1"));
		System.out.println(driver.findElement(withTagName("input").toRightOf(left)).getText());
		WebElement right=driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']"));
		System.out.println(driver.findElement(withTagName("input").toLeftOf(right)).getText());*/
		System.out.println(pass.getRect().getDimension().getHeight());
		System.out.println(pass.getRect().getDimension().getWidth());
		
		File file=pass.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\logo.png"));
		
		WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW);
		Set <String> is=driver.getWindowHandles();
		Iterator<String> it=is.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		String text=driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]")).getText();
		driver.switchTo().window(parentid);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(text);
		
		
		
		
		
		
		
	}

}
