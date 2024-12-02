package com.luandias.device_allocation_system.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luandias.device_allocation_system.dto.ClientDTO;
import com.luandias.device_allocation_system.entities.Client;
import com.luandias.device_allocation_system.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll(){
		List<Client> result = clientRepository.findAll();
		List<ClientDTO> dto = result.stream().map(x -> new ClientDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public Optional<List<ClientDTO>> findById(long id) {
		Optional<Client> obj = clientRepository.findById(id);
		Optional<List<ClientDTO>> dto = Optional.of(obj.stream().map(x -> new ClientDTO(x)).toList());
		return dto;
	}
}
