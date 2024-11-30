package com.luandias.device_allocation_system.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private Character bivolt;

	public Stabilizer() {

	}

	public Stabilizer(Long id, Integer identification, String brand, Character bivolt) {
		this.id = id;
		this.identification = identification;
		this.brand = brand;
		this.bivolt = bivolt;
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

	public Character getBivolt() {
		return bivolt;
	}

	public void setBivolt(Character bivolt) {
		this.bivolt = bivolt;
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
