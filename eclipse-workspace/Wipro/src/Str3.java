
import java.util.Scanner;

public class Str3 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		char ch1;
		int i;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		int length1 = s1.length();
		s2=s1.substring(0,2);
		for(i=0;i<length1;i++)
		{
			System.out.print(s2);
		}
		
		
	
	}
}