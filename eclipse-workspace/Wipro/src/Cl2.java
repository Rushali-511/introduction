import java.lang.Math;
class Calculator
{
	double num1,num2;
	
	public static double powerInt(int num1,int num2)
	{
		
		double res1=Math.pow(num1,num2);
		return res1;
	}
	public static double powerDouble(double num1,int num2)
	{
		double res2=Math.pow(num1,num2);
		return res2;
	}
	
}




public class Cl2 {
	
	public static void main(String[] args) 
	{
		double in,du;
		in=Calculator.powerInt(3,5);
		du=Calculator.powerDouble(9.0,2);
	System.out.println("power is " + in);
	System.out.println("power is " + du);
		
	}

}
