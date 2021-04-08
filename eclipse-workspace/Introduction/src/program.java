
public class program {
	/*int prime (int n)
	{
		int i=2;
		int flag=0;
		int m=n/2;
		for(i=2;i<=m;i++)
		{      
		    if(n%i==0)
		    {           
		     flag=1;      
		     break;      
		    }      
		 }      
		   
		if(flag==0) 
		return n;
		return n;  
		  
	}  */ 
	
	public static int[] addnum(int n, int arr[], int x) 
    { 
        int i; 
        int newarr[] = new int[n + 1]; 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
        newarr[n] = x; 
        return newarr; 
    } 
	
	public void concatenate ( int[] a)
	{

		for(int i=0 ; i< a.length;i++)
		{
			String s1 = Integer.toString(a[i]); 
			String s2 = Integer.toString(a[i+1]); 
			String s = s1 + s2; 
	        int c = Integer.parseInt(s);
	        a=addnum( a.length, a,c);
		}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= { 2,3,5,7};
		program obj=new program();
		//obj.prime(35);
	    obj.concatenate(a);
	    System.out.println(a);
	}

}
