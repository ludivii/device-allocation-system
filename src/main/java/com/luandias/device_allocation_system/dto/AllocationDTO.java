package com.luandias.device_allocation_system.dto;

import java.time.LocalDate;
import java.util.Set;

import com.luandias.device_allocation_system.entities.Allocation;
import com.luandias.device_allocation_system.entities.Business;
import com.luandias.device_allocation_system.entities.Client;
import com.luandias.device_allocation_system.entities.Device;
import com.luandias.device_allocation_system.entities.Monitor;
import com.luandias.device_allocation_system.entities.Stabilizer;

public class AllocationDTO {

	private Long id;
	private LocalDate expirationDate;
	private Client client;
	private Business business;
	private Set<Device> devices;
	private Set<Monitor> monitors;
	private Set<Stabilizer> stabilizers;

	public AllocationDTO() {

	}

	public AllocationDTO(Allocation obj) {
		id = obj.getId();
		expirationDate = obj.getExpirationDate();
		client = obj.getClient();
		business = obj.getBusiness();
		devices = obj.getDevices();
		monitors = obj.getMonitors();
		stabilizers = obj.getStabilizers();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
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

	public Set<Device> getDevice() {
		return devices;
	}

	public void setDevice(Set<Device> device) {
		this.devices = device;
	}

	public Set<Monitor> getMonitor() {
		return monitors;
	}

	public void setMonitor(Set<Monitor> monitor) {
		this.monitors = monitor;
	}

	public Set<Stabilizer> getStabilizer() {
		return stabilizers;
	}

	public void setStabilizer(Set<Stabilizer> stabilizer) {
		this.stabilizers = stabilizer;
	}
}
