class Author
{
	private String name,email;
	private char ch;
	Author (String n,String e,char c)
	{
		name=n;
		email=e;
		ch=c;
	}
 void getName()
{
	System.out.println("name of the author is "+name);
}
void getEmail()
{
	System.out.println("email of the author is " + email );
	
}
void getGender()
{
	System.out.println("gender of the book is " + ch );
	
}
}

class Book
{
	private String bname;
	private double price;
	private int qtyInStock;
	Author a1=new Author("chetan bhagat","xyz23@gmail.com",'F');
	Book (String n,double p,int q)
	{
		bname=n;
		price=p;
		qtyInStock=q;
		a1.getName();
		a1.getEmail();
		a1.getGender();
	}
	void getBName()
	{
		System.out.println("name of the book is " + bname );
		
	}
	void getPrice()
	{
		System.out.println("price of the book is " + price );
		
	}
	void getStock()
	{
		System.out.println("quantity of the book is " + qtyInStock );
		
	}
	
}
public class Enc
{
	public static void main(String args[])
	{
Book b1=new Book("2 states",2500,20);
b1.getBName();
b1.getPrice();
b1.getStock();

}
}