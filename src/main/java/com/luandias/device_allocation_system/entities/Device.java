package com.luandias.device_allocation_system.entities;

import java.io.Serializable;
import java.util.Objects;

import com.luandias.device_allocation_system.enums.Type;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_device")
public class Device implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@ManyToOne
	@JoinColumn(name = "allocation_id")
	private Allocation allocation;

	public Device() {

	}

	public Device(Long id, Integer identification, Type type, String brand, String model, String size, String cpu,
			String ram, String ssd, String gpu, Character keyboardAndMouse, Allocation allocation) {
		this.id = id;
		this.identification = identification;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.size = size;
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		this.gpu = gpu;
		this.keyboardAndMouse = keyboardAndMouse;
		this.allocation = allocation;
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

	public Allocation getAllocation() {
		return allocation;
	}

	public void setAllocation(Allocation allocation) {
		this.allocation = allocation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return Objects.equals(id, other.id);
	}

}
