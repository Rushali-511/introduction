class Patient
{
	String name;
	double height;
	double weight;
	 Patient(String n,double h,double w)
	 {
		 name=n;
		 height=h;
	     weight=w;
	 }
	String na()
	{
		return name;
	}
	double computeBMI()
	{
		double bmi=weight/(height*height);
		return bmi;
	}
}
public class Cl3 {

	public static void main(String[] args) 
	{   
		Patient p = new Patient("mohit",12,50);
		double bm=p.computeBMI();
		String n=p.na();
		System.out.println("Name of patient is " + n);
		System.out.println("Patient's BMI is " + bm);

	}

}
