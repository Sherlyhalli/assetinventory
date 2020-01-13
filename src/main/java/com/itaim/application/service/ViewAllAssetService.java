package com.itaim.application.service;

import java.util.List;

import com.itaim.application.domain.ViewAllAsset;

public interface ViewAllAssetService {
	public List<ViewAllAsset> findByTwoTables();
}
