import java.util.Scanner;

public class Str11 
{
		static int substring(String s1,String s2)
		{
		int i,k=0;
		int M = s1.length();
		int N = s2.length();
		  for (i = 0; i <= N - M; i++)
		  { 
	            int j; 
	            for (j = 0; j < M; j++) 
	              if (s1.charAt(i + j) != s2.charAt(j)) 
	              break; 
	   
	            if (j == M) 
	            return i;
	            
		  }
		  return -1;
}
		  public static void main (String[] args) 
			{
			  String s1,s2;
			  int k,i=0;
			  System.out.println("enter two strings");
				Scanner sc=new Scanner(System.in);
				s1=sc.nextLine();
				s2=sc.nextLine();
				 k=substring(s1,s2);
		  if(k == -1)
			  System.out.println("string is not present");
		  else
			  System.out.println("presenr");  
	                 
}
}