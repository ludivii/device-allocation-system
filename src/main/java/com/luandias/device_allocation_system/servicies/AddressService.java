package com.luandias.device_allocation_system.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

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
	public AddressDTO findById(long id) {
	    Optional<Address> optionalAddress = addressRepository.findById(id);
	    Address obj = optionalAddress.get();
	    return new AddressDTO(obj);
	}
	
	public AddressDTO insert(Address address) {
		Address result = addressRepository.save(address);
		return new AddressDTO(result);
	}

	public void delete(Long id) {
		 Address address = addressRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Address not found for ID: " + id));
		    try {
		        addressRepository.delete(address);
		    } catch (Exception e) {
		        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error deleting address", e);
	}
	}


	public Address update(Address address) {
	    Optional<Address> existingOptionalAddress = addressRepository.findById(address.getId());
	    Address existingAddress = existingOptionalAddress.get();
	    updateData(existingAddress, address);
	    Address updatedAddress = addressRepository.save(existingAddress);
	    return updatedAddress;
	}


	private void updateData(Address newAddress, Address address) {
	    newAddress.setAddress(address.getAddress());
	    newAddress.setDistrict(address.getDistrict());
	    newAddress.setState(address.getState());
	    newAddress.setCity(address.getCity());
	    newAddress.setPostalCode(address.getPostalCode());
	}

	public Address fromDTO(AddressDTO addressDTO) {
		return new Address(addressDTO.getId(), addressDTO.getAddress(), addressDTO.getDistrict(), addressDTO.getState(),
				addressDTO.getCity(), addressDTO.getPostalCode());
	}
}
