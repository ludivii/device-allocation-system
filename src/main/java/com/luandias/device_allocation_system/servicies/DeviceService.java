package com.luandias.device_allocation_system.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luandias.device_allocation_system.dto.DeviceDTO;
import com.luandias.device_allocation_system.entities.Device;
import com.luandias.device_allocation_system.repositories.DeviceRepository;

@Service
public class DeviceService {

	@Autowired
	private DeviceRepository deviceRepository;
	
	@Transactional(readOnly = true)
	public List<DeviceDTO> findAll(){
		List<Device> result = deviceRepository.findAll();
		List<DeviceDTO> dto = result.stream().map(x -> new DeviceDTO(x)).toList();
		return dto;
	}
}