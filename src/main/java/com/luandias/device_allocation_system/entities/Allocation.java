package com.luandias.device_allocation_system.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_allocation")
public class Allocation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Character keyboardAndMouse;

	@Autowired
	private Device device;
	@Autowired
	private Monitor monitor;
	@Autowired
	private Stabilizer stabilizer;
	@Autowired
	private Client client;
	@Autowired
	private Business business;
	@Autowired
	private LocalDate expirationDate;

	public Allocation() {

	}

	public Allocation(Long id, Character keyboardAndMouse, Device device, Monitor monitor, Stabilizer stabilizer,
			Client client, Business business, LocalDate expirationDate) {
		this.id = id;
		this.keyboardAndMouse = keyboardAndMouse;
		this.device = device;
		this.monitor = monitor;
		this.stabilizer = stabilizer;
		this.client = client;
		this.business = business;
		this.expirationDate = expirationDate;
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

}
