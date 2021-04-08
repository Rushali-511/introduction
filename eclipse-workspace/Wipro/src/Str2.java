import java.util.Scanner;

public class Str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		String s2;
		String s3;
		char ch1;
		char ch2;
		System.out.println("enter two strings");
		Scanner sc=new Scanner(System.in);

		s1=sc.nextLine();
		s2=sc.nextLine();
		int length1 = s1.length();
		int length2 = s2.length();

		ch1 = s1.charAt(length1 - 1);
		ch2 = s2.charAt(0);
		
		if(ch1 != ch2) {
			System.out.println(s1.toLowerCase() + " " + s2.toLowerCase());
		}
		else 
		{
			StringBuffer sb = new StringBuffer(s2);
		    sb.deleteCharAt(0);
		    s3=(sb.toString());
		    System.out.println(s1.toLowerCase()  + s3.toLowerCase());
		}
		

		
	}

}
