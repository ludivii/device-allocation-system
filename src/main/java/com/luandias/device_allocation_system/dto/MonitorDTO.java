package com.luandias.device_allocation_system.dto;

import com.luandias.device_allocation_system.entities.Monitor;

public class MonitorDTO {

	private Long id;

	private Integer identification;
	private String brand;
	private String model;
	private String size;
	private String resolution;

	public MonitorDTO() {

	}

	public MonitorDTO(Monitor obj) {
		id = obj.getId();
		identification = obj.getIdentification();
		brand = obj.getBrand();
		model = obj.getModel();
		size = obj.getSize();
		resolution = obj.getResolution();
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
