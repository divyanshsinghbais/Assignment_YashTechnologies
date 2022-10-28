package com.yash.fullstack.FullStackApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.fullstack.FullStackApp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
}
