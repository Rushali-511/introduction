class Animal
{
	void eat()
	{
		System.out.println("animal can eat anything");
	}
	void sleep()
	{
		System.out.println("animal can sleep anywhere");
	}
}

class Bird extends Animal
{
	void eat()
	{
		System.out.println("birds can eat insects");
	}
	void sleep()
	{
		System.out.println("owl is the only bird which doesnt sleeps at night");
	}
	void fly()
	{
		System.out.println("All birds cannot fly");
	}
}

public class In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a= new Animal();
a.eat();
a.sleep();
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();

	}

}
