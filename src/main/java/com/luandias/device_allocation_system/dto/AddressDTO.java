package com.luandias.device_allocation_system.dto;

import com.luandias.device_allocation_system.entities.Address;

public class AddressDTO {
	private Long id;
	private String address;
	private String district;
	private String state;
	private String city;
	private String postalCode;

	public AddressDTO() {

	}

	public AddressDTO(Address obj) {
		id = obj.getId();
		address = obj.getAddress();
		district = obj.getDistrict();
		state = obj.getState();
		city = obj.getCity();
		postalCode = obj.getPostalCode();
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
	
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
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

}
