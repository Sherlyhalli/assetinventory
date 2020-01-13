package com.itaim.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.itaim.application.domain.AddAsset;
import com.itaim.application.repository.AddAssetRepository;
import com.itaim.application.service.AddAssetService;

@Service
@Transactional
public class AddAssetServiceImpl implements AddAssetService
{
	private static final Logger logger = LoggerFactory.getLogger(AddAssetServiceImpl.class);

	@Autowired
	AddAssetRepository addAssetRepository;
    public void saveAssest(AddAsset addAssests) 
	{
    	logger.info("request for fetch data from addAsset{}",addAssests);
		addAssetRepository.save(addAssests);
	}

	public List<AddAsset> getAllAssests()
	{
		logger.info("request for fetchall data from addAsset{}");
		return 	addAssetRepository.findAll();
	}

	public Optional<AddAsset> getAssestById(int id) 
	{
		logger.info("request for fetch data from addAsset by id{}",id);
		return addAssetRepository.findById(id);
	}

	public AddAsset updateAssestById(AddAsset addAssests) 
	{
		logger.info("request for save data from addAsset by id{}",addAssests);
	    return addAssetRepository.save(addAssests);
	}
	
	public String deleteAssestById(int id) 
	{
		logger.debug("request for delete data from addAsset by id{}",id);
		return "The Assests Has Been Deleted Successfully.";
	}
	
	public List<String> findSerialNum(String assetType) {
		logger.debug("request for delete data from addAsset by id{}",assetType);
		return addAssetRepository.findSerialNum(assetType);
	}
}
