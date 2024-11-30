package com.luandias.device_allocation_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.BusinessDTO;
import com.luandias.device_allocation_system.servicies.BusinessService;

@RestController
public class BusinessController {

	@Autowired
	private BusinessService businessService;
	
	@GetMapping
	public List<BusinessDTO> findAll(){
		List<BusinessDTO> result = businessService.findAll();
		return result;
	}
}
