package sqlteting;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class connection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String port="3306";
		String host="localhost";
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qaclick", "root", "rushali@25");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from employee where name='rushali'");
		rs.next();
		System.out.println(rs.getString("username"));
		while(rs.next())
		{

WebDriver driver= new ChromeDriver();

driver.get("https://login.salesforce.com");

driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));

driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));

		}
		

	}

}
