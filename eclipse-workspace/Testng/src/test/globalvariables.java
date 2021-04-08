package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

public class globalvariables {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\rushali rathore\\eclipse-workspace\\Testng\\properties");
		prop.load(fis);
		System.out.println(prop.getProperty("value"));
		prop.setProperty("value", "987");
		System.out.println(prop.getProperty("value"));
		//FileInputStream fos=new FileInputStream("C:\\Users\\rushali rathore\\eclipse-workspace\\Testng\\properties");
		//prop.store(fos, null);
	}

}
