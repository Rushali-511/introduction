package com.wipro.Annotation;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	Student student = (Student) context.getBean("stud");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
     }
    	
}
