package com.luandias.device_allocation_system.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luandias.device_allocation_system.dto.AllocationDTO;
import com.luandias.device_allocation_system.entities.Allocation;
import com.luandias.device_allocation_system.repositories.AllocationRepository;

@Service
public class AllocationService {

	@Autowired
	private AllocationRepository allocationRepository;
	
	@Transactional(readOnly = true)
	public List<AllocationDTO> findAll(){
		List<Allocation> result = allocationRepository.findAll();
		List<AllocationDTO> dto = result.stream().map(x -> new AllocationDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public Optional<Allocation> findById(long id) {
		Optional<Allocation> obj = allocationRepository.findById(id);
		Optional<Allocation> dto = obj;
		return dto;
	}
	
}
