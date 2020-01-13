package com.itaim.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itaim.application.domain.AssignAsset;
import com.itaim.application.repository.AssignAssetRepository;
import com.itaim.application.service.AssignAssetService;


@Service
@Transactional
public class AssignAssetServiceImpl implements AssignAssetService
{
	private static final Logger logger = LoggerFactory.getLogger(AssignAssetServiceImpl.class);
	@Autowired
	private AssignAssetRepository repository;
	
	public String saveAssignedAsset(AssignAsset asset) 
	{
		logger.info("request for save data from AssignAsset{}", asset);
		repository.save(asset);
		return "The Assest has been assigned successfully.";
	}

	public List<AssignAsset> getAssignedAsset() 
	{
		logger.info("request for fetch data from AssignAsset{}");
		return repository.findAll();
	}

	public Optional<AssignAsset> getAssetById(int id)
	{
		logger.info("request for fetch data from AssignAsset by id{}",id);
		return repository.findById(id);
	}

	public AssignAsset updateAssignAsset(AssignAsset asset)
	{
		logger.info("request for save data in AssignAsset by id{}",asset);
		return repository.save(asset);
	}

	public String deleteAssetById(int id) 
	{
		logger.debug("request for delete data from AssignAsset by id{}",id);
		repository.deleteById(id);
		return "Deleted successfully.";
	}

	public String deleteAllAsset() 
	{
		logger.debug("request for deleteAll data from AssignAsset by id{}");
		repository.deleteAll();
		return "Deleted successfully.";
	}

	public List<AssignAsset> findByStatus(String status) {
		logger.debug("request for get data from AssignAsset by status by id{}",status);
		// TODO Auto-generated method stub
		return repository.findByStatus(status);
	}
}
