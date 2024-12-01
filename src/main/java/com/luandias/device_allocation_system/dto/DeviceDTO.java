package com.luandias.device_allocation_system.dto;

import com.luandias.device_allocation_system.entities.Device;
import com.luandias.device_allocation_system.enums.Type;

public class DeviceDTO {

	private Long id;

	private Integer identification;
	private Type type;
	private String brand;
	private String model;
	private String size;
	private String cpu;
	private String ram;
	private String ssd;
	private String gpu;
	private Character keyboardAndMouse;

	public DeviceDTO() {

	}

	public DeviceDTO(Device obj) {
		id = obj.getId();
		identification = obj.getIdentification();
		type = obj.getType();
		brand = obj.getBrand();
		model = obj.getModel();
		size = obj.getSize();
		cpu = obj.getCpu();
		ram = obj.getRam();
		ssd = obj.getSsd();
		gpu = obj.getGpu();
		keyboardAndMouse = obj.getKeyboardAndMouse();
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public Character getKeyboardAndMouse() {
		return keyboardAndMouse;
	}

	public void setKeyboardAndMouse(Character keyboardAndMouse) {
		this.keyboardAndMouse = keyboardAndMouse;
	}

}
