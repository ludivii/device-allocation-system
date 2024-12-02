package com.luandias.device_allocation_system.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.ClientDTO;
import com.luandias.device_allocation_system.servicies.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public List<ClientDTO> findAll() {
		List<ClientDTO> result = clientService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Optional<List<ClientDTO>> findById(@PathVariable Long id){
		Optional<List<ClientDTO>> obj = clientService.findById(id);
		return obj;
	}

}
