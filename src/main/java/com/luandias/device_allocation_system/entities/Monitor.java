package com.luandias.device_allocation_system.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_monitor")
public class Monitor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer identification;
	private String brand;
	private String model;
	private String size;
	private String resolution;

	@ManyToOne
	@JoinColumn(name = "allocation_id")
	private Allocation allocation;

	public Monitor() {

	}

	public Monitor(Long id, Integer identification, String brand, String model, String size, String resolution,
			Allocation allocation) {
		this.id = id;
		this.identification = identification;
		this.brand = brand;
		this.model = model;
		this.size = size;
		this.resolution = resolution;
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
		Monitor other = (Monitor) obj;
		return Objects.equals(id, other.id);
	}

}
