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
@Table(name="assign_asset")
public class AssignAsset implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="asset_type", nullable = false)
	private String assetType;
	
	@Column(name="serial_number", nullable = false)
	private String serialNumber;
	
	@Column(name="assign_to", nullable = false)
	private  String assignTo;
	
	@Column(name="assignment_date",nullable = false)
	private Date assignmentDate;
	
	@Column(name="status", nullable = false)
	private String status;
	
	@Column(name="reason", nullable = false)
	private String reason;
	
	@Column(name="released_date", nullable = true)
	private Date releasedDate;

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

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	@Override
	public String toString() {
		return "AssignAsset [id=" + id + ", assetType=" + assetType + ", serialNumber=" + serialNumber + ", assignTo="
				+ assignTo + ", assignmentDate=" + assignmentDate + ", status=" + status + ", reason=" + reason
				+ ", releasedDate=" + releasedDate + "]";
	}

	public AssignAsset() {
		super();
	}
}
