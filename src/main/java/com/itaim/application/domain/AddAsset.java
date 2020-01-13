package com.itaim.application.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "add_asset")
public class AddAsset implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
	@Column(name = "asset_type", nullable = false)
	private String assetType;
	
	@Column(name = "serial_number", nullable = false)
	private String serialNumber;
	
	@Column(name = "model_number", nullable = false)
	private String modelNumber;
	
	@Column(name = "manufacturer", nullable = false)
	private String manufacturer;
	
	@Column(name = "procurement_date", nullable = false)
	private Date procurementDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getProcurementDate() {
		return procurementDate;
	}

	public void setProcurementDate(Date procurementDate) {
		this.procurementDate = procurementDate;
	}

	@Override
	public String toString() {
		return "AddAssests [id=" + id + ", assetType=" + assetType + ", serialNumber=" + serialNumber + ", modelNumber="
				+ modelNumber + ", manufacturer=" + manufacturer + ", procurementDate=" + procurementDate + "]";
	}

	public AddAsset(int id, String assetType, String serialNumber, String modelNumber, String manufacturer,
			Date procurementDate) {
		super();
		this.id = id;
		this.assetType = assetType;
		this.serialNumber = serialNumber;
		this.modelNumber = modelNumber;
		this.manufacturer = manufacturer;
		this.procurementDate = procurementDate;
	}

	public AddAsset() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
