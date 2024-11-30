package com.luandias.device_allocation_system.dto;

import java.time.LocalDate;

import com.luandias.device_allocation_system.entities.Address;
import com.luandias.device_allocation_system.entities.Client;

public class ClientDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Character gender;
	private String phone;
	private Address address;

	public ClientDTO() {

	}

	public ClientDTO(Client obj) {
		id = obj.getId();
		firstName = obj.getFirstName();
		lastName = obj.getLastName();
		birthDate = obj.getBirthDate();
		gender = obj.getGender();
		phone = obj.getPhone();
		address = obj.getAddress();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
