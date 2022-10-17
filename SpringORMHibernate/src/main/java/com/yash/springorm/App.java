package com.yash.springorm;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.springorm.dao.EmployeeDao;
import com.yash.springorm.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Spring orm" );

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao empdao=context.getBean("employeedao",EmployeeDao.class);

		int temp = 106;
		/*
		 * Insert employee into the database
		 */
		Employee emp=new Employee(temp,"Sizzy");
		int msg=empdao.insert(emp);
		//System.out.println(msg + "insertion done");
		
		/*
		 * Get all employee list
		 */
		ArrayList<Employee> emp_list=(ArrayList<Employee>) empdao.getAllEmployees();
		for(Employee s1:emp_list)
		{
			System.out.println(s1);
		}
		
		/*
		 * Update Details of an employee
		 */

		Employee empx=new Employee(temp,"New");
		empdao.updateDetails(empx);
		
		emp_list=(ArrayList<Employee>) empdao.getAllEmployees();
		for(Employee s1:emp_list)
		{
			System.out.println(s1);
		}

		/*
		 * Delete employee from id
		 */
		System.out.println("Deleting employee: " +temp);
		empdao.deleteDetails(temp);

		/*
		 * Get all employee list
		 */
		emp_list=(ArrayList<Employee>) empdao.getAllEmployees();
		for(Employee s1:emp_list)
		{
			System.out.println(s1);
		}
		
	}
}
