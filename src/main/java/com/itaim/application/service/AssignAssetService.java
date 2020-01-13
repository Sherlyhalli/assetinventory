package com.itaim.application.service;

import java.util.List;
import java.util.Optional;
import com.itaim.application.domain.AssignAsset;


public interface AssignAssetService
{
	public String saveAssignedAsset(AssignAsset asset);
	public List<AssignAsset> getAssignedAsset();
    public Optional<AssignAsset> getAssetById(int id);
    public AssignAsset updateAssignAsset(AssignAsset asset);
    public String deleteAssetById(int id);
    public String deleteAllAsset();
	public List<AssignAsset> findByStatus(String string);
}
