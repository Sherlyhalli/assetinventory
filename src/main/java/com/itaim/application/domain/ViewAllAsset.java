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
@Table(name = "view_assets")
public class ViewAllAsset implements Serializable
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
	
	@Column(name="assign_to", nullable = false)
	private  String assignTo;
	
	@Column(name="assignment_date",nullable = false)
	private Date assignmentDate;
	
	@Column(name="status", nullable = false)
	private String status;
	
	@Column(name="reason", nullable = false)
	private String reason;

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

	public String getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}

	public Date getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(Date assignmentDate) {
		this.assignmentDate = assignmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "ViewAllAsset [id=" + id + ", assetType=" + assetType + ", serialNumber=" + serialNumber
				+ ", modelNumber=" + modelNumber + ", manufacturer=" + manufacturer + ", procurementDate="
				+ procurementDate + ", assignTo=" + assignTo + ", assignmentDate=" + assignmentDate + ", status="
				+ status + ", reason=" + reason + "]";
	}

	public ViewAllAsset() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}