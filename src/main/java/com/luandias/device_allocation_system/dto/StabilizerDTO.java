package com.luandias.device_allocation_system.dto;

import com.luandias.device_allocation_system.entities.Stabilizer;

public class StabilizerDTO {

	private Long id;

	private Integer identification;
	private String brand;
	private String model;
	private String voltage;
	private Character bivolt;

	public StabilizerDTO() {

	}

	public StabilizerDTO(Stabilizer obj) {
		id = obj.getId();
		identification = obj.getIdentification();
		brand = obj.getBrand();
		model = obj.getModel();
		voltage = obj.getVoltage();
		bivolt = obj.getBivolt();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdentification() {
		return identification;
	}

	public void setIdentification(Integer identification) {
		this.identification = identification;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	public Character getBivolt() {
		return bivolt;
	}

	public void setBivolt(Character bivolt) {
		this.bivolt = bivolt;
	}
}
