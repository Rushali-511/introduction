import java.util.Scanner;

public class Str8 
{
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			String s1,s2;
			int i;
			System.out.println("enter a string with *");
			Scanner sc=new Scanner(System.in);
			s1=sc.nextLine();
			int l=s1.length();
			for(i=0;i<l;i++)
			{
				if(s1.charAt(i)=='*')
				{
					StringBuffer sb=new StringBuffer(s1);
					sb.deleteCharAt(i);
					sb.deleteCharAt(i-1);
					sb.deleteCharAt(i-1);
					s2=sb.toString();
					System.out.println(s2);
					
				}
			}
			
}
}