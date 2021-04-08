
public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ori="malayal";
String rev="";
int i;
int l=ori.length();
for(i=l-1;i >= 0;i--)
{
	rev=rev + ori.charAt(i);
}
if(rev.equals(ori))
{
	System.out.println("palindrome");
}
else
	System.out.println("not a palindrome");
	}

}
