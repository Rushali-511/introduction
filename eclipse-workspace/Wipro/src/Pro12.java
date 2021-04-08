
public class Pro12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,flag=0;
		for(num=10;num<=99;num++)
		{
		for(i=2;i<=num/2;i++)
		{
				if(num%i==0)
				{
				flag=0;
				break;
				}
				else
				flag=1;
		}
		if (flag==1)
        System.out.print(num+" ");
		} 
		}
}
