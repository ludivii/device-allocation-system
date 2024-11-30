package com.luandias.device_allocation_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.AddressDTO;
import com.luandias.device_allocation_system.servicies.AddressService;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping
	public List<AddressDTO> findAll(){
		List<AddressDTO> result = addressService.findAll();
		return result;
	}
}
