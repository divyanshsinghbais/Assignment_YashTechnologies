package com.pro.limits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.limits.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitsConfiguration limitsconfiguration;
	
	@GetMapping("/limits")
	public LimitsConfiguration returnLimits() {
		return new LimitsConfiguration(limitsconfiguration.getMinimum(),limitsconfiguration.getMaximum());
	}
	
}
