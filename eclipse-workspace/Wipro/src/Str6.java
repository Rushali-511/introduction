import java.util.Scanner;

public class Str6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3;
		char ch1;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		int length1 = s1.length();
		s2=sc.nextLine();
		int length2 = s2.length();
		if(length1==length2)
		{
			System.out.println("please enter another strings");
		}
		if(length1>length2)
		{
			System.out.print(s2+s1+s2);
		}
		else
		{
			System.out.print(s1+s2+s1);
		}
		
		
	}

}
