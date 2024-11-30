package com.luandias.device_allocation_system.dto;

import com.luandias.device_allocation_system.entities.Address;

public class AddressDTO {
	private Long id;
	private String address;
	private String state;
	private String city;
	private String postalCode;
	private String phone;

	public AddressDTO() {

	}

	public AddressDTO(Address obj) {
		id = obj.getId();
		address = obj.getAddress();
		state = obj.getState();
		city = obj.getCity();
		postalCode = obj.getPostalCode();
		phone = obj.getPhone();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
