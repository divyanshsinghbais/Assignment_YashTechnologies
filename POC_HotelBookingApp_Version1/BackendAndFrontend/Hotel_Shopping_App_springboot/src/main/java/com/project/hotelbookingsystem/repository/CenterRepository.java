package com.project.hotelbookingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.hotelbookingsystem.model.Center;

@Repository
public interface CenterRepository extends JpaRepository<Center, Long> {
	
	
	
	@Query(value = "SELECT * FROM center WHERE center_first_name = center_name", nativeQuery = true)
	public List<Center> serchUserByName(String center_name);
	
	
	@Query(value = "SELECT * FROM center, state WHERE state_id = center_state", nativeQuery = true)
	public List<Center> serchUserByState(String center_state);
	

}
