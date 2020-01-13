package com.itaim.application.web.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itaim.application.domain.AssignAsset;
import com.itaim.application.domain.Employee;
import com.itaim.application.serviceImpl.AssignAssetServiceImpl;

@RestController
@RequestMapping("/assignAsset")
public class AssignAssetController 
{
	private static final Logger Logger = LoggerFactory.getLogger(AssignAssetController .class);
	@Autowired
	AssignAssetServiceImpl service;
	
	/**
	 * This method Save to save the record of AssignAsset
	 * 
	 * @return
	 */
	
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Boolean> save(@RequestBody AssignAsset assignAsset) {
	 Logger.info("request for save data in assignAsset", assignAsset);
		    service.saveAssignedAsset(assignAsset);
	        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	 }
    
    /**
	 * This method getAll to fetch the record of AssignAsset
	 * 
	 * @return
	 */
    
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<AssignAsset> getAssignedAsset()
	{
    	Logger.info("request for fetch data from assignAsset");
		return service.getAssignedAsset();
	}
	
	/**
	 * This method getAssetById to fetch the record of AssignAsset by Id
	 * 
	 * @return
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public AssignAsset getAssetById(@PathVariable int id) throws Exception 
	{
		Logger.warn("request for fetch data from assignAsset by id",id);
		Optional<AssignAsset> asset = service.getAssetById(id);
		if (!asset.isPresent())
			throw new Exception("Could not find asset with id- " + id);
		return asset.get();
	}
	
	/**
	 * This method update to update the record of AssignAsset
	 * 
	 * @return
	 */

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
//	public AssignAsset update(@RequestBody AssignAsset updasset, @PathVariable int id) throws Exception 
//	{
//		Optional<AssignAsset> asset = service.getAssetById(id);
//		if (!asset.isPresent())
//			throw new Exception("Could not find asset with id- " + id);
//		// Required for the "where" clause in the sql query template.
//		updasset.setId(id);
//		return service.updateAssignAsset(updasset);
//	}
	public ResponseEntity<Boolean> update(@RequestBody AssignAsset assign) {
		Logger.info("request to saveall data in assignAsset",assign);
		         service.saveAssignedAsset(assign);
	        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	/**
	 * This method deleteAssetById to delete the record of AssignAsset by Id
	 * 
	 * @return
	 */

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteAssetById(@PathVariable int id) throws Exception 
	{
		Logger.debug("request to delete Data from assignAsset by id");
		Optional<AssignAsset> asset = service.getAssetById(id);
		if (!asset.isPresent())
			throw new Exception("Could not find asset with id- " + id);

		service.deleteAssetById(id);
		return "DEleted Successfully.";
	}
	
	/**
	 * This method deleteAll to delete the record of AssignAsset
	 * 
	 * @return
	 */

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE)
	public String deleteAll() 
	{
		Logger.debug("request to deleteall data from assignAsset by id");
		service.deleteAllAsset();
		return "The assest has been deleted successfully.";
	}
	
	/**
	 * This method getAllByStatus to fetch the status of record in AssignAsset
	 * 
	 * @return
	 */
	
	@RequestMapping(value = "/getallbystatus/{status}", method = RequestMethod.GET)
	public List<AssignAsset> findByStatus(@PathVariable String status) {
		Logger.info("request to getall data from assignAsset by status",status);
		return service.findByStatus(status);
	}
}
