import java.util.Scanner;

public class Str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		char ch1;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		int length = s1.length();
		if(length%2==0)
		{
			s2=s1.substring(0, length/2);
			System.out.println(s2);
		}
		else
		{
			System.out.println("null");
		}
	}

}
