package com.wipro.datajdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao"); 
        
       /*int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
        System.out.println(status); */
              
     int status1 = dao.updateEmployee(new Employee(102,"lakshay",4000));
    System.out.println(status1);
    
    /*Employee e=new Employee(); 
    e.setId(102); 
    int status2 =dao.deleteEmployee(e);
    System.out.println(status2);*/
     
    }
}
