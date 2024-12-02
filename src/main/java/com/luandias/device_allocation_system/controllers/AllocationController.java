package com.luandias.device_allocation_system.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.AllocationDTO;
import com.luandias.device_allocation_system.servicies.AllocationService;

@RestController
@RequestMapping(value = "/allocation")
public class AllocationController {

	@Autowired
	private AllocationService allocationService;

	@GetMapping
	public List<AllocationDTO> findAll() {
		List<AllocationDTO> result = allocationService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Optional<List<AllocationDTO>> findById(@PathVariable Long id){
		Optional<List<AllocationDTO>> obj = allocationService.findById(id);
		return obj;
	}
}
