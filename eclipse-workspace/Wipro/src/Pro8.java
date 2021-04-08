import java.util.*;
public class Pro8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
Scanner s =new Scanner(System.in);
System.out.println("enter a colour code");
ch=s.next().charAt(0);
switch(ch)
{
case 'R':
	System.out.println("red");
	break;
case 'W':
	System.out.println("WHITE");
	break;
case 'O':
	System.out.println("ORANGE");
	break;
case 'Y':
	System.out.println("YELLOW");
	break;
case 'B':
	System.out.println("BLUE");
	break;
case 'G':
	System.out.println("GREEN");
	break;
	 default :
		 System.out.println("invalid code");
}




	}

}
