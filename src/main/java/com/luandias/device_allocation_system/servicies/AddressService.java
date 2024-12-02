package com.luandias.device_allocation_system.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luandias.device_allocation_system.dto.AddressDTO;
import com.luandias.device_allocation_system.entities.Address;
import com.luandias.device_allocation_system.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Transactional(readOnly = true)
	public List<AddressDTO> findAll() {
		List<Address> result = addressRepository.findAll();
		List<AddressDTO> dto = result.stream().map(x -> new AddressDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public Optional<List<AddressDTO>> findById(long id) {
		Optional<Address> obj = addressRepository.findById(id);
		Optional<List<AddressDTO>> dto = Optional.of(obj.stream().map(x -> new AddressDTO(x)).toList());
		return dto;
	}
}
