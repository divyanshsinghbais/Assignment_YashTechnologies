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

import com.project.hotelbookingsystem.controller.LocationController;
import com.project.hotelbookingsystem.model.Location;
import com.project.hotelbookingsystem.repository.LocationRepository;

import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
class TestLocation {
	@InjectMocks
	private LocationController con;
	
	@Mock
	private LocationRepository repo;
	
//	@SuppressWarnings("deprecation")
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void getAllCustomersTest() {
		Location c1 = new Location();
		Location c2 = new Location();
		Location c3 = new Location();
		Location c4 = new Location();
		Location c5 = new Location();
		
		c1.setLocation_id(1);
		c2.setLocation_id(2);
		c3.setLocation_id(3);
		c4.setLocation_id(4);
		c5.setLocation_id(5);
		
		List<Location> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
			
		when(repo.findAll()).thenReturn(list);
		
		assertEquals(5, con.getAllLocations().size());
	}
	
	@Test
	public void getCustomersById() {
		
		Location expected = new Location(101,"Indore", null, null, null);		
		Location customer = Mockito.mock(Location.class);

		when(repo.findById(101L)).thenReturn(Optional.of(customer));
		
		ResponseEntity<Location> res = null;
		try {
			res = con.getLocationById((expected.getLocation_id()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		assertEquals(200,res.getStatusCodeValue());
        	
	}


}

