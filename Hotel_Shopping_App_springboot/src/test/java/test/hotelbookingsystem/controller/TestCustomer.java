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

import com.project.hotelbookingsystem.controller.CustomerController;
import com.project.hotelbookingsystem.model.Customer;
import com.project.hotelbookingsystem.repository.CustomerRepository;

@ExtendWith(MockitoExtension.class)
public class TestCustomer {
	
	@InjectMocks
	private CustomerController con;
	
	@Mock
	private CustomerRepository repo;
	
//	@SuppressWarnings("deprecation")
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void getAllCustomersTest() {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		c1.setCustomer_id(100L);
		c2.setCustomer_id(200L);
		
		List<Customer> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(2, con.getAllCustomers().size());
	}
	
	@Test
	public void getCustomersById() {
		
		Customer expected = new Customer(101,"Divyansh", null, null, null, null, null, null, null, null, null, null);		
		Customer customer = Mockito.mock(Customer.class);

		when(repo.findById(101L)).thenReturn(Optional.of(customer));
		
		ResponseEntity<Customer> res = null;
		try {
			res = con.getCustomerById(expected.getCustomer_id());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		assertEquals(200,res.getStatusCodeValue());
        	
	}
	
	@Test
	public void createCustomerByName() {
		Customer actual = new Customer();	
		actual.setCustomer_first_name("Tanay");	
			
        when(repo.save(actual)).thenReturn(actual);
        
        actual = con.createCustomer(actual);
        Customer expected = new Customer();

       expected.setCustomer_first_name("Tanay");
       
       assertEquals(actual.getCustomer_first_name(),expected.getCustomer_first_name());
	}
	
	@Test
	public void createCustomerByID() {
		Customer actual = new Customer();	
		actual.setCustomer_id(700);;	
			
        when(repo.save(actual)).thenReturn(actual);
        
        actual = con.createCustomer(actual);
        Customer expected = new Customer();

       expected.setCustomer_id(700);
       
       assertEquals(actual.getCustomer_id(),expected.getCustomer_id());
	}


}

