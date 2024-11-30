package com.luandias.device_allocation_system.dto;

import java.time.LocalDate;

import com.luandias.device_allocation_system.entities.Allocation;
import com.luandias.device_allocation_system.entities.Business;
import com.luandias.device_allocation_system.entities.Client;
import com.luandias.device_allocation_system.entities.Device;
import com.luandias.device_allocation_system.entities.Monitor;
import com.luandias.device_allocation_system.entities.Stabilizer;

public class AllocationDTO {

	private Long id;
	private Character keyboardAndMouse;
	private Device device;
	private Monitor monitor;
	private Stabilizer stabilizer;
	private Client client;
	private Business business;
	private LocalDate expirationDate;

	public AllocationDTO() {

	}

	public AllocationDTO(Allocation obj) {
		id = obj.getId();
		keyboardAndMouse = obj.getKeyboardAndMouse();
		device = obj.getDevice();
		monitor = obj.getMonitor();
		stabilizer = obj.getStabilizer();
		client = obj.getClient();
		business = obj.getBusiness();
		expirationDate = obj.getExpirationDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Character getKeyboardAndMouse() {
		return keyboardAndMouse;
	}

	public void setKeyboardAndMouse(Character keyboardAndMouse) {
		this.keyboardAndMouse = keyboardAndMouse;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Stabilizer getStabilizer() {
		return stabilizer;
	}

	public void setStabilizer(Stabilizer stabilizer) {
		this.stabilizer = stabilizer;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
}
