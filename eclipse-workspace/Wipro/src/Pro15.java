import java.util.*;
public class Pro15 {
	public static void main(String[] args)
	{
		int rem,sum=0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		}

		System.out.print(sum);
}
}
