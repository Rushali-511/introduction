import java.util.Scanner;
public class Arr3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,ser,flag=0;
		int[] arr=new int[] {5,71,65,4,6};
		System.out.println("enter number want to search");
		Scanner sc=new Scanner(System.in);
		ser=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(ser==arr[i])
			{	
				flag=0;
				break;
			}
			else
				flag=1;
			
		}
		if(flag==0)
		{

			System.out.println((i+1));
		}
		else
			System.out.println("-1");
				
				
		}
}
