package com.luandias.device_allocation_system.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Transactional(readOnly = true)
	public Optional<List<MonitorDTO>> findById(long id) {
		Optional<Monitor> obj = monitorRepository.findById(id);
		Optional<List<MonitorDTO>> dto = Optional.of(obj.stream().map(x -> new MonitorDTO(x)).toList());
		return dto;
	}
}
