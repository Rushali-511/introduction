
public class Arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,temp,n;
		int[] arr=new int[] {78,126,100,55,77,80};
		n=arr.length;
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++) 
			{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}