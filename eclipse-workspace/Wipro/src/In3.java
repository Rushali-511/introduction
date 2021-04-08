public class In3 {

	public static void main(String[] args)
	{
Teacher t1=new Teacher("pankaj ","23/06/1990",35000,"english");
CollegeStudent cs1=new CollegeStudent("lakshya","4/09/2007",001,"OIST",4);
cs1.display();
t1.display();
	}}
 
class Per
{
String name;
String dob;
public Per(String name,String dob)
{
	this.name=name;
	this.dob=dob;
}
void display()
{
	System.out.println("Name is " + name);
	System.out.println("date of birth is " + dob);
}
}

class Teacher extends Per                                                                                             
{
double salary;
String subject;
public Teacher(String name,String dob,double salary,String subject)
{
	super(name,dob);
	this.salary=salary;
	this.subject=subject;
}
void display()
{
	super.display();
	System.out.println("salary of teacher is  " + salary);
System.out.println("teacher teaches subject " + subject);
}
}

class Student extends Per
{
int Studentid;
public Student(String name,String dob,int Studentid)
{
	super(name,dob);
	this.Studentid=Studentid;
}
void display()
{
	super.display();
	System.out.println("student id of  student  is  " + Studentid);
}
}

class CollegeStudent extends Student 
{
String clgname;
int year;
public CollegeStudent(String name,String dob,int Studentid,String clgname,int year)
{
	super(name,dob,Studentid);
	this.clgname=clgname;
	this.year=year;
}
void display()
{
super.display();
	System.out.println("student's college name  is  " + clgname);
	System.out.println("student  is  studying in year" + year);

}	
	}


