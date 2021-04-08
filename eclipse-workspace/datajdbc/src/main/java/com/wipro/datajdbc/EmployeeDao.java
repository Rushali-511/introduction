package com.wipro.datajdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdtemp;
	
	private void setJdbcTemplate (JdbcTemplate jdtemp)
	{
		this.jdtemp=jdtemp;
	}
	
	
	int saveEmployee(Employee e)
	{
		String query="insert into employee ("+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')"; 
		return jdtemp.update(query);
	}
	
	int updateEmployee(Employee e)
	{
		String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' "; 
		return jdtemp.update(query);
	}
	
	int deleteEmployee(Employee e)
	{
		String query="delete from employee where id='"+e.getId()+"' ";   
				return jdtemp.update(query);  
	}
}
