class Fruit
{
	String name,taste;
	int size;
	Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println("Name of the fruit is "+name);
		System.out.println("Taste of the fruit is "+taste);
	}
	
}
class Apple extends Fruit
{
	Apple(String name,String taste,int size)
	{
		super(name,taste,size);
		
	}
	void eat()
	{
		System.out.println("Name of the fruit is "+name);
		System.out.println("Taste of the fruit is "+taste);
		System.out.println("size of the fruit is "+size);
	}
}
class Orange extends Fruit
{
	Orange(String name,String taste,int size)
	{
		super(name,taste,size);
		
	}
	void eat()
	{
		System.out.println("Name of the fruit is "+name);
		System.out.println("Taste of the fruit is "+taste);
		System.out.println("size of the fruit is "+size);
	}
}
public class Ove1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruit a=new Apple("apple","sweet",10);
a.eat();
Fruit o=new Orange("orange","sour",5);
o.eat();
	}

}
