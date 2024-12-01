package com.luandias.device_allocation_system.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.DeviceDTO;
import com.luandias.device_allocation_system.servicies.DeviceService;

@RestController
@RequestMapping(value = "/device")
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;

	@GetMapping
	public List<DeviceDTO> findAll(){
		List<DeviceDTO> result = deviceService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public Optional<List<DeviceDTO>> findById(@PathVariable Long id){
		Optional<List<DeviceDTO>> obj = deviceService.findById(id);
		return obj;
	}
}
