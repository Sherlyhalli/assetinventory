package com.itaim.application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset_list")
public class AssetList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "asset_name", nullable = false)
	private String assetName;

	public AssetList() {
		super();
	}

	public AssetList(int id, String assetName) {
		super();
		this.id = id;
		this.assetName = assetName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String toString() {
		return "AssetList [id=" + id + ", assetName=" + assetName + "]";
	}

}
