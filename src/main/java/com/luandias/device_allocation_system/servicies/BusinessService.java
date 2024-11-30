package com.luandias.device_allocation_system.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luandias.device_allocation_system.dto.BusinessDTO;
import com.luandias.device_allocation_system.entities.Business;
import com.luandias.device_allocation_system.repositories.BusinessRepository;

@Service
public class BusinessService {

	@Autowired
	private BusinessRepository businessRepository;
	
	@Transactional(readOnly = true)
	public List<BusinessDTO> findAll(){
		List<Business> result = businessRepository.findAll();
		List<BusinessDTO> dto = result.stream().map(x -> new BusinessDTO(x)).toList();
		return dto;
	}
}
