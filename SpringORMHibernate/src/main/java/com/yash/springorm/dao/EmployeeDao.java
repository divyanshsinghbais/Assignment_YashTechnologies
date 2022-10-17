package com.yash.springorm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.yash.springorm.entities.Employee;

public class EmployeeDao {
	private HibernateTemplate hibernatetemp;
	
	@Transactional
	public int insert(Employee emp)
	{
		Integer i=(Integer)this.hibernatetemp.save(emp);
		return i;
		
	}
	
	public Employee getEmployeeDetails(int empid)
	{
		Employee emp=this.hibernatetemp.get(Employee.class, empid);
		return emp;
	}
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> emp=this.hibernatetemp.loadAll(Employee.class);
		return emp;
	}
	
	@Transactional
	public void deleteDetails(int empid)
	{
		Employee emp=this.hibernatetemp.get(Employee.class,empid);
		this.hibernatetemp.delete(emp);
	}
	
	@Transactional
	public void updateDetails(Employee emp)
	{
		this.hibernatetemp.update(emp);
	}
	
	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}

}
