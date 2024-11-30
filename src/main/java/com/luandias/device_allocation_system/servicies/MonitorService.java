package com.luandias.device_allocation_system.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luandias.device_allocation_system.dto.MonitorDTO;
import com.luandias.device_allocation_system.entities.Monitor;
import com.luandias.device_allocation_system.repositories.MonitorRepository;

@Service
public class MonitorService {

	@Autowired
	private MonitorRepository monitorRepository;
	
	public List<MonitorDTO> findAll(){
		List<Monitor> result = monitorRepository.findAll();
		List<MonitorDTO> dto = result.stream().map(x -> new MonitorDTO(x)).toList();
		return dto;
	}
}
