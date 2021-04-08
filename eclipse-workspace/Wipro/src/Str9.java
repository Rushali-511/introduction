import java.util.Scanner;

public class Str9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3;
		char ch1,ch2;
		int i,lmax;
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		int length1 = s1.length();
		s2=sc.nextLine();
		int length2 = s2.length();
		if(length1>=length2)
		{
			lmax=length1;
		}
		else
			lmax=length2;
		for(i=0;i<lmax;i++)
		{
			ch1=s1.charAt(i);
			ch2=s2.charAt(i);
			System.out.print(ch1);
			System.out.print(ch2);
		}
}
}