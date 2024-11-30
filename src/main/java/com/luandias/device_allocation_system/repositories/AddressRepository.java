package com.luandias.device_allocation_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luandias.device_allocation_system.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
