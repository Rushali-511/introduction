import java.util.*;

public class Pro17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev=0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
		rev=rev*10;
		rev=rev + num%10;
		num=num/10;
		}

		System.out.print(rev);

	}

}
