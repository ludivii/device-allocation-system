package com.luandias.device_allocation_system.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luandias.device_allocation_system.dto.StabilizerDTO;
import com.luandias.device_allocation_system.entities.Stabilizer;
import com.luandias.device_allocation_system.repositories.StabilizerRepository;

@Service
public class StabilizerService {

	@Autowired
	private StabilizerRepository stabilizerRepository;
	
	@Transactional(readOnly = true)
	public List<StabilizerDTO> findAll(){
		List<Stabilizer> result = stabilizerRepository.findAll();
		List<StabilizerDTO> dto = result.stream().map(x -> new StabilizerDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public Optional<List<StabilizerDTO>> findById(long id) {
		Optional<Stabilizer> obj = stabilizerRepository.findById(id);
		Optional<List<StabilizerDTO>> dto = Optional.of(obj.stream().map(x -> new StabilizerDTO(x)).toList());
		return dto;
	}
}
