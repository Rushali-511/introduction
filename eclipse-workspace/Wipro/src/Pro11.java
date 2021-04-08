import java.util.*;
public class Pro11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,count=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
				if(num%i==0)
				{
					count++;
				}
			}
		if(count==0)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
	}

}
