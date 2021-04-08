import java.util.Scanner;

public class Str7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		if (s1.charAt(0) == 'x' || s1.charAt(s1.length()-1) == 'x')
		{
			    s1 = s1.substring(1,s1.length());
			    s1 = s1.substring(0,s1.length()-1);
			    System.out.println(s1);
		}
		else
		{
			 System.out.println(s1);
		}
			
		
		

		
		
			
}
}