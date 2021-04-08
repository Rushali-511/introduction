
public class Pro19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,count=0;
		while(count<5)
		{
		if((num%2==0) && (num%3==0) && (num%5==0))
		{
			System.out.println(num);
			count++;
		}
		num++;
		}

	}

}
