import java.util.*;
public class Arr8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count,maxcount=0;
int arr[]=new int[] {1,5,5,2,2,5,1,6,7};
int maxele=0;
for(i=0;i<arr.length;i++)
{
	count=1;
	for(j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			count++;
		if(count>maxcount)
		{
			maxcount=count;
		maxele=arr[j];
		}
		
	}}

}
System.out.println(maxele );

	}

}
