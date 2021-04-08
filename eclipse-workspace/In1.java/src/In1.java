
interface Libraryuser
{
	void registerAccount();
	void requestBook();
	int age=13;
	String booktype ="Fiction";
	
	

}
class Kiduser implements Libraryuser
{
	
	public void registerAccount()
	{
	if(age<12)
	System.out.println("You have successfully registered under a Kids Account");
	else
	System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}
	
	public void requestBook()
	{
		String str2="kids";
	boolean b=booktype.equals(str2);
	if(b==true)
	System.out.println("Book issued successfully , please return the book after 10 days");
	else
	System.out.println("“Oops, you are allowed to take only kids books");
}
}
class Adultuser implements Libraryuser
{
	
	public void registerAccount()
	{
	if(age>12)
	System.out.println("You have successfully registered under a adult Account");
	else
	System.out.println("Sorry, Age must be greater than 12 to register as a kid");
	}
	
	public void requestBook()
	{
		String str2="fiction";
	boolean b=booktype.equals(str2);
	if(b==true)
	System.out.println("Book issued successfully , please return the book after 10 days");
	else
	System.out.println("“Oops, you are allowed to take only kids books");
}}

public class In1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kiduser k=new Kiduser();
k.registerAccount();
k.requestBook();
Adultuser a=new Adultuser();
a.registerAccount();
a.requestBook();
	}

}
