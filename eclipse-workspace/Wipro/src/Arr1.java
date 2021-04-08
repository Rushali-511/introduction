
public class Arr1 {
	public static void main(String[] args)
	{
		int i,sum=0,avg;
		int[] arr=new int[] {1,2,3,4,5,6};
		for(i=0;i<arr.length;i++)
		{
			sum=sum + arr[i];
		}
		System.out.println(sum);
		avg=sum/arr.length;
		System.out.println(avg);
	}

}
