
public class pyramid {

	static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        pyramid t = new pyramid();
        this.x = 22;
        y = 44;
 
        System.out.println("Test.x: " + pyramid.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }
 
    public static void main(String args[])
    {
        pyramid t = new pyramid();
        t.method1(5);
    }
}
			
