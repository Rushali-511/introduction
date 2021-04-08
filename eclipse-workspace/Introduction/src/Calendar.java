import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='departure'] //span[@class='lbl_input latoBold appendBottom10']")).click();
		//driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains("April");
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains("May"))
		{
		
			driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
		}
		
		int count=driver.findElements(By.className("DayPicker-Day")).size();
		System.out.println(count);
		for(int i=0 ; i<count ; i++)
		{
			System.out.println("for loop");
			String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				System.out.println("if loop");
				driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).click();
				break;
			}
		}
		
	
		
		
	}

	
	}


