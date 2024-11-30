package com.luandias.device_allocation_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.StabilizerDTO;
import com.luandias.device_allocation_system.servicies.StabilizerService;

@RestController
@RequestMapping(value = "/stabilizer")
public class StabilizerController {
	
	@Autowired
	private StabilizerService stabilizerService;
	
	@GetMapping
	public List<StabilizerDTO> findAll(){
		List<StabilizerDTO> result = stabilizerService.findAll();
		return result;
	}

}
