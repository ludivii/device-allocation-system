package com.luandias.device_allocation_system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luandias.device_allocation_system.dto.MonitorDTO;
import com.luandias.device_allocation_system.servicies.MonitorService;

@RestController
@RequestMapping(value = "/monitor")
public class MonitorController {

	@Autowired
	private MonitorService monitorService;

	@GetMapping
	public List<MonitorDTO> findAll() {
		List<MonitorDTO> result = monitorService.findAll();
		return result;
	}
}
