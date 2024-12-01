package com.luandias.device_allocation_system.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

	@OneToMany(mappedBy = "allocation", fetch = FetchType.LAZY)
	private Set<Device> devices = new HashSet<>();

	@OneToMany(mappedBy = "allocation", fetch = FetchType.LAZY)
	private Set<Monitor> monitors = new HashSet<>();

	@OneToMany(mappedBy = "allocation", fetch = FetchType.LAZY)
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

}
