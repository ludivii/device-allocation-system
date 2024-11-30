package com.luandias.device_allocation_system.dto;

import com.luandias.device_allocation_system.entities.Address;
import com.luandias.device_allocation_system.entities.Business;

public class BusinessDTO {

	private Long id;
	private String name;
	private Integer cnpj;
	private Integer phone;
	private String email;
	private Address address;

	public BusinessDTO() {

	}

	public BusinessDTO(Business obj) {
		id = obj.getId();
		name = obj.getName();
		cnpj = obj.getCnpj();
		phone = obj.getPhone();
		email = obj.getEmail();
		address = obj.getAddress();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}