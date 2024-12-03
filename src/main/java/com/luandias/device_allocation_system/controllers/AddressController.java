package com.luandias.device_allocation_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.AddressDTO;
import com.luandias.device_allocation_system.entities.Address;
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
	
	@GetMapping(value = "/{id}")
	public AddressDTO findById(@PathVariable Long id){
		AddressDTO obj = addressService.findById(id);
		return obj;
	}
	
	@PostMapping
	public AddressDTO insert(@RequestBody AddressDTO addressDTO) {
	    Address address = addressService.fromDTO(addressDTO);
	    addressService.insert(address);
	    return new AddressDTO(address);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		addressService.delete(id);
	}

	@PutMapping(value = "/{id}")
	public AddressDTO update(@PathVariable Long id, @RequestBody AddressDTO addressDTO) {
		Address address = addressService.fromDTO(addressDTO);
		address.setId(id);
		address = addressService.update(address);
		return new AddressDTO(address);
	}
}
