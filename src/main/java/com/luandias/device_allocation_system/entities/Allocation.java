package com.luandias.device_allocation_system.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_allocation")
public class Allocation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate expirationDate;

	@OneToOne
	private Client client;
	@OneToOne
	private Business business;

	@OneToMany(mappedBy = "allocation", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private Set<Device> devices = new HashSet<>();

	@OneToMany(mappedBy = "allocation", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private Set<Monitor> monitors = new HashSet<>();

	@OneToMany(mappedBy = "allocation", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private Set<Stabilizer> stabilizers = new HashSet<>();

	public Allocation() {

	}

	public Allocation(Long id, LocalDate expirationDate, Client client, Business business) {
		this.id = id;
		this.expirationDate = expirationDate;
		this.client = client;
		this.business = business;
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

	public Set<Device> getDevices() {
		return devices;
	}

	public Set<Monitor> getMonitors() {
		return monitors;
	}

	public Set<Stabilizer> getStabilizers() {
		return stabilizers;
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
		Allocation other = (Allocation) obj;
		return Objects.equals(id, other.id);
	}

	// Method to add a device
	public void addDevice(Device device) {
		this.devices.add(device);
		device.setAllocation(this);
	}

	// Method to add various devices
	public void addDevice(Set<Device> devices) {
		devices.forEach(device -> {
			this.devices.add(device);
			device.setAllocation(this);
		});
	}

	// Method to remove a device
	public void removeDevice(Device device) {
		devices.remove(device);
		device.setAllocation(null);
	}

	// Method to remove various devices
	public void removeDevice(Set<Device> devices) {
		devices.forEach(device -> {
			this.devices.remove(device);
			device.setAllocation(null);
		});
	}

	// Method to add a monitor
	public void addMonitor(Monitor monitor) {
		monitors.add(monitor);
		monitor.setAllocation(this);
	}

	// Method to add various monitors
	public void addMonitor(Set<Monitor> monitors) {
		monitors.forEach(monitor -> {
			this.monitors.add(monitor);
			monitor.setAllocation(this);
		});
	}

	// Method to remove a monitor
	public void removeMonitor(Monitor monitor) {
		monitors.remove(monitor);
		monitor.setAllocation(null);
	}

	// Method to remove various monitors
	public void removeMonitor(Set<Monitor> monitors) {
		monitors.forEach(monitor -> {
			this.monitors.remove(monitor);
			monitor.setAllocation(null);
		});
	}

	// Method to add a stabilizer
	public void addStabilizer(Stabilizer stabilizer) {
		stabilizers.add(stabilizer);
		stabilizer.setAllocation(this);
	}

	// Method to add various stabilizers
	public void addStabilizer(Set<Stabilizer> stabilizers) {
		stabilizers.forEach(stabilizer -> {
			this.stabilizers.add(stabilizer);
			stabilizer.setAllocation(this);
		});
	}

	// Method to remove a stabilizer
	public void removeStabilizer(Stabilizer stabilizer) {
		stabilizers.remove(stabilizer);
		stabilizer.setAllocation(null);
	}

	// Method to remove various stabilizers
	public void removeStabilizer(Set<Stabilizer> stabilizers) {
		stabilizers.forEach(stabilizer -> {
			this.stabilizers.remove(stabilizer);
			stabilizer.setAllocation(null);
		});
	}

}
