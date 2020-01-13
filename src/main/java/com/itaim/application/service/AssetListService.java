package com.itaim.application.service;

import java.util.List;
import java.util.Optional;

import com.itaim.application.domain.AssetList;

public interface AssetListService {

public String createAssetType(AssetList list);
public List<AssetList> getAllAssetType();
public Optional<AssetList> getAssetById(int id);
public AssetList updateById(AssetList list);
public String DeleteAssetById(int id);
}
