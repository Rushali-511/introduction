import java.util.*;
abstract class Compartment
{
abstract void notice();
}
 class Firstclass extends Compartment
 {
	 void  notice()
	 {
		 System.out.println(" this is for first class people");
	 }
 }
 class Ladies extends Compartment
 {
	 void  notice()
	 {
		 System.out.println(" this is reserved only for females");
	 }
 }
 class Luggage extends Compartment
 {
	 void  notice()
	 {
		 System.out.println("This compatrment in for only luggage ");
	 }
 }
 class General extends Compartment
 {
	 void  notice()
	 {
		 System.out.println("This compartment is for general people "); 
	 }
 }
 

public class Abs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compartment arr[]=new Compartment[10];
		System.out.println("enter any value from 1 to 4");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
				switch(n)
				{
					case 1:
						Firstclass f=new Firstclass();
						f.notice();
						break;
						
					case 2:
						Ladies l=new Ladies();
						l.notice();
						break;
						
					case 3:
						Luggage lg=new Luggage();
						lg.notice();
						break;
						
					case 4:
						General g=new General();
						g.notice();
						break;
						
						default:
							System.out.println("invalid choice");
				}
						
						
						
	}

}
