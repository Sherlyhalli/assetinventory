package com.itaim.application.service;

import java.util.List;
import java.util.Optional;
import com.itaim.application.domain.AddAsset;

public interface AddAssetService 
{
	public void saveAssest(AddAsset addAssests);
	public List<AddAsset> getAllAssests();
	public Optional<AddAsset> getAssestById(int id);
	public AddAsset updateAssestById(AddAsset addAssests);
	public String deleteAssestById(int id);
    public List<String> findSerialNum(String assetType);
}
 