package com.itaim.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itaim.application.domain.AssetList;
import com.itaim.application.repository.AssetListRepository;
import com.itaim.application.service.AssetListService;

@Service
@Transactional
public class AssetListServiceImpl implements AssetListService {
	private static final Logger logger = LoggerFactory.getLogger(AssetListServiceImpl.class);


	@Autowired
	AssetListRepository assetListRepository;

	public String createAssetType(AssetList list) {
		logger.info("request for save data in AssetList{}", list);
		assetListRepository.save(list);
		return "Asset Type is saved successfully";
	}

	public List<AssetList> getAllAssetType() {
		logger.info("request for fetchall data from AssetList{}");
		return assetListRepository.findAll();
	}

	public Optional<AssetList> getAssetById(int id) {
		logger.info("request for fetchall data from AssetList by id{}",id);
		return assetListRepository.findById(id);
	}

	public AssetList updateById(AssetList list) {
		logger.debug("request for saveall data in AssetList by id{}",list);
		return assetListRepository.save(list);
	}

	public String DeleteAssetById(int id) {
		logger.debug("request for deleteall data AssetList by id{}",id);
		assetListRepository.deleteById(id);
		return "Asset Type has been deleted successfully";
	}

}