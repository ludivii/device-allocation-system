package com.luandias.device_allocation_system.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.BusinessDTO;
import com.luandias.device_allocation_system.servicies.BusinessService;

@RestController
@RequestMapping(value = "/business")
public class BusinessController {

	@Autowired
	private BusinessService businessService;
	
	@GetMapping
	public List<BusinessDTO> findAll(){
		List<BusinessDTO> result = businessService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Optional<List<BusinessDTO>> findById(@PathVariable Long id){
		Optional<List<BusinessDTO>> obj = businessService.findById(id);
		return obj;
	}
}
