
public class Arr7 {
	
		public static void main (String[] args)
		{
			int[] arr=new int[] {78,77,126,100,55,77,80};
			int end = arr.length;
		    for (int i = 0; i < end; i++) {
		        for (int j = i + 1; j < end; j++) {
		            if (arr[i] == arr[j]) {                  
		                int shiftLeft = j;
		                for (int k = j+1; k < end; k++, shiftLeft++) {
		                    arr[shiftLeft] = arr[k];
		                }
		                end--;
		                j--;
		            }
		        }
		    }

		    int[] whitelist = new int[end];
		    for(int i = 0; i < end; i++){
		        whitelist[i] = arr[i];
		    }
		    for(int i=0;i<end;i++)
		    	System.out.println(whitelist[i]);
		}
	}

