package test.hotelbookingsystem.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.project.hotelbookingsystem.controller.EmployeeController;
import com.project.hotelbookingsystem.model.Employee;
import com.project.hotelbookingsystem.repository.EmployeeRepository;



@ExtendWith(MockitoExtension.class)
public class TestEmployee {
	
	@InjectMocks
	private EmployeeController con;
	
	@Mock
	private EmployeeRepository repo;
	
//	@SuppressWarnings("deprecation")
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void getAllEmployeesTest() {
		Employee c1 = new Employee();
		Employee c2 = new Employee();
		c1.setEmployee_id(100L);
		c1.setEmployee_id(100L);
		
		List<Employee> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(2, con.getAllEmployees().size());
	}
	
	@Test
	public void getEmployeeByIdTest() {
		
		Employee expected = new Employee(101,"Divyansh", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);		
		Employee customer = Mockito.mock(Employee.class);

		when(repo.findById(101L)).thenReturn(Optional.of(customer));
		
		ResponseEntity<Employee> res = null;
		try {
			res = con.getEmployeeById(expected.getEmployee_id());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		assertEquals(200,res.getStatusCodeValue());
        	
	}
	
	@Test
	public void createEmployeeByName() {
		Employee actual = new Employee();	
		actual.setEmployee_first_name("Drj");	
			
        when(repo.save(actual)).thenReturn(actual);
        
        actual = con.createEmployee(actual);
        Employee expected = new Employee();

       expected.setEmployee_first_name("Drj");
       
       assertEquals(actual.getEmployee_first_name(),expected.getEmployee_first_name());
	}
	
	@Test
	public void createCustomerByID() {
		Employee actual = new Employee();	
		actual.setEmployee_id(700);;	
			
        when(repo.save(actual)).thenReturn(actual);
        
        actual = con.createEmployee(actual);
        Employee expected = new Employee();

       expected.setEmployee_id(700);
       
       assertEquals(actual.getEmployee_id(),expected.getEmployee_id());
	}


}

