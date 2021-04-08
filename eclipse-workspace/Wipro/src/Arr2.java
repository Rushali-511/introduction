
public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,max=0,min;
		int[] arr=new int[] {5,71,65,4,6};
		for(i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{	
				max=arr[i];
			}
		}
		min=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
