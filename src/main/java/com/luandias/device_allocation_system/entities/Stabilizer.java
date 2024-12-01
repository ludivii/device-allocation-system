package com.luandias.device_allocation_system.entities;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_stabilizer")
public class Stabilizer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer identification;
	private String brand;
	private String model;
	private String voltage;
	private Character bivolt;

	@ManyToOne
	@JoinColumn(name = "allocation_id")
	@JsonBackReference
	private Allocation allocation;

	public Stabilizer() {

	}

	public Stabilizer(Long id, Integer identification, String brand, String model, String voltage, Character bivolt,
			Allocation allocation) {
		this.id = id;
		this.identification = identification;
		this.brand = brand;
		this.model = model;
		this.voltage = voltage;
		this.bivolt = bivolt;
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
		Stabilizer other = (Stabilizer) obj;
		return Objects.equals(id, other.id);
	}

}
