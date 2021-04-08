
public class Arr5 {

	public static void main(String[] args) {
			int i,lar1=0,lar2=0,sm1,sm2;
			int[] arr=new int[] {8,0,71,1,65,4,6};
			for(i=0;i<arr.length;i++)
			{
				if(lar1<arr[i])
				{	
					lar1=arr[i];
				}
			}
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]!=lar1)
				{
				if(lar2<arr[i])
				{	
					lar2=arr[i];
				}
				}
			}
			sm1=arr[0];
			for(i=0;i<arr.length;i++)
			{
				if(sm1>arr[i])
				{
					sm1=arr[i];
				}
			}
			sm2=arr[0];
			for(i=0;i<arr.length;i++)
			{
				if(arr[i]!=sm1)
				{
				if(sm2>arr[i])
				{
					sm2=arr[i];
				}}
			}
			
			System.out.println(lar1+","+lar2);
			System.out.println(sm1 +"," + sm2);

	}

}
