package com.itaim.application.web.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itaim.application.domain.AssetList;
import com.itaim.application.serviceImpl.AssetListServiceImpl;
@RestController
@RequestMapping("/api/assetList")
public class AssetListController {
	private static final Logger Logger = LoggerFactory.getLogger(AssetListController .class);

	@Autowired
	AssetListServiceImpl assetListService;
	
	/**
	 * This method SaveAll to save the record of AssetList
	 * 
	 * @return
	 */

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String createAssetList(@RequestBody AssetList list) {
		Logger.info("request for save data in assetList", list);
		assetListService.createAssetType(list);
		return "Asset List Saved Successfully";
	}
	
	/**
	 * This method getAll to fetch the record of AddAsset
	 * 
	 * @return
	 */

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<AssetList> getAllAssetList() {
		Logger.info("request for fetchall data from assetList");
		return assetListService.getAllAssetType();
	}
	
	/**
	 * This method getAssetListById to fetch the record of AssetList by Id
	 * 
	 * @return
	 */

	@RequestMapping(value = "/getAssetListById/{id}", method = RequestMethod.GET)
	public Optional<AssetList> getAssetById(@PathVariable int id) {
		Logger.info("request for fetch data from assetList by id",id);
		return assetListService.getAssetById(id);

	}
	
	/**
	 * This method updateAssetListById to update the record of AssetList by Id
	 * 
	 * @return
	 */

	@RequestMapping(value = "/updateAssetListById/{id}", method = RequestMethod.PUT)
	public AssetList updateById(@RequestBody AssetList list, @PathVariable int id) {
		Logger.info("request for save data to assetList by Id",list);
		return assetListService.updateById(list);

	}
	
	/**
	 * This method deleteAssetListById to delete the record of AddAsset by Id
	 * 
	 * @return
	 */

	@RequestMapping(value = "/deleteAssetListById/{id}", method = RequestMethod.DELETE)
	public String deleteAssetById(@PathVariable int id) {
		Logger.debug("request for delete data from assetList by Id",id);
		assetListService.DeleteAssetById(id);
		return "Asset Delete successfully by its Id";
	}

}
