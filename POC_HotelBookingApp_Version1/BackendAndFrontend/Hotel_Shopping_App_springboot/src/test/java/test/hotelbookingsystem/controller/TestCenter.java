package test.hotelbookingsystem.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.project.hotelbookingsystem.controller.CenterController;
import com.project.hotelbookingsystem.model.Center;
import com.project.hotelbookingsystem.repository.CenterRepository;

@ExtendWith(MockitoExtension.class)
public class TestCenter {
	
	@InjectMocks
	private CenterController con;
	
	@Mock
	private CenterRepository repo;

	//@SuppressWarnings("deprecation")
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void getAllCentersTest() {
		
		Center center1 = new Center();
		Center center2 = new Center();
		center1.setCenter_id(1L);
		center2.setCenter_id(1L);
		
        List<Center> list = new ArrayList<>();
        list.add(center1);
        list.add(center2);
		
//		when(repo.findAll()).thenReturn(Stream
//				.of(center1,center2).collect(Collectors.toList())); 	
		when(repo.findAll()).thenReturn(list); 
		
		assertEquals(2, con.getAllCenters().size());		
	}
	
	@Test
	public void getCenterById() {
		
		Center expected = new Center(1,"Marina Hotel", null, null, null, null, null, null, null, null, null, null);		
		Center center = Mockito.mock(Center.class);

		when(repo.findById(1L)).thenReturn(Optional.of(center));
		
		ResponseEntity<Center> res = null;
		try {
			res = con.getCenterById(expected.getCenter_id());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		assertEquals(200,res.getStatusCodeValue());
        	
	}

	
}





