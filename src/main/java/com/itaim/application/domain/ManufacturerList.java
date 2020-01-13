package com.itaim.application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manufacturer_list")
public class ManufacturerList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "manufacturer_name", nullable = false)
	private String manufacturerName;

	public ManufacturerList() {
		super();

	}

	public ManufacturerList(int id, String manufacturerName) {
		super();
		this.id = id;
		this.manufacturerName = manufacturerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	@Override
	public String toString() {
		return "ManufacturerList [id=" + id + ", manufacturerName=" + manufacturerName + "]";
	}

}