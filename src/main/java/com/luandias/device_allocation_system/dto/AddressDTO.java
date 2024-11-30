package com.luandias.device_allocation_system.dto;

import com.luandias.device_allocation_system.entities.Address;

public class AddressDTO {
	private Long id;
	private String address;
	private String state;
	private String city;
	private Integer postalCode;
	private Integer phone;

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

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
}
