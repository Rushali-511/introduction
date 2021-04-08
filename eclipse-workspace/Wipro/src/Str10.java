import java.util.Scanner;

public class Str10 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s1,s2;
			int n=4;
			System.out.println("enter a string");
			Scanner sc=new Scanner(System.in);
			s1=sc.nextLine();
			int l=s1.length();
			for(int i=0;i<n;i++)
			{
				s2=s1.substring((l-n), l);
				System.out.print(s2);
			}
}
}