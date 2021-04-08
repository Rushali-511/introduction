
public class Employee extends Person
{
double salary;
int year;
String nin;

double setSalary(double s)
{
	salary=s;
	return salary;
}
int setYear(int y)
{
	year=y;
	return year;
}
String setnin(String ni)
{
	nin=ni;
	return nin;
}
void getSalary()
{
	System.out.println("salary of employee is "+ salary);
}
void getYear()
{
	System.out.println("sarting year of employee is "+ year);
}
void getnin()
{
	System.out.println("national insurance number  of employee is "+ nin);
}

}
