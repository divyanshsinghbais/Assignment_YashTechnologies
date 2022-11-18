package com.project.hotelbookingsystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hotelbookingsystem.exception.ResourceNotFoundException;
import com.project.hotelbookingsystem.model.State;
import com.project.hotelbookingsystem.repository.StateRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class StateController {
	Logger log
    = LoggerFactory.getLogger(StateController.class);
	
	@Autowired
	private StateRepository stateRepository;

	@GetMapping("/states")
	public List<State> getAllStates() {
		log.info("method details: "+log.getName());
		return stateRepository.findAll();
	}
}
