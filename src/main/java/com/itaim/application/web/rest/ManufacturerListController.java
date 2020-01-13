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

import com.itaim.application.domain.ManufacturerList;
import com.itaim.application.serviceImpl.ManufacturerListServiceImpl;



@RestController
@RequestMapping("/manufacturerList")
public class ManufacturerListController {
	private static final Logger Logger = LoggerFactory.getLogger(ManufacturerListController .class);
    @Autowired
	ManufacturerListServiceImpl manufacturerListServiceImpl;
    /**
	 * This method SaveAll to save the record of ManufacturerList
	 * 
	 * @return
	 */
	
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	public String saveManufacturer(@RequestBody ManufacturerList manufacturer) 
	{
		Logger.info("request for save data in Manufacturer ",manufacturer);
		manufacturerListServiceImpl.saveManufacturer(manufacturer);
		return "The manufacturer has been saved successfully.";
	}
	/**
	 * This method getAll to fetch the record of ManufacturerList
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getAll", method=RequestMethod.GET)
	public List<ManufacturerList> getAllManufacturer(){
		Logger.info("request for fetch data in Manufacturer");
		return manufacturerListServiceImpl.getAllManufacturer();
	}
	/**
	 * This method getById to fetch the record of ManufacturerList by id
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getById/{id}", method=RequestMethod.GET)
	public Optional<ManufacturerList> getManufacturerById(@PathVariable int id)
	{
		Logger.info("request for fetch data from Manufacturer by id",id);
		return manufacturerListServiceImpl.getManufacturerById(id);
	}
	
	/**
	 * This method updateById to update the record of ManufacturerList by Id
	 * 
	 * @return
	 */
	
	@RequestMapping(value= "/update/{id}", method=RequestMethod.PUT)
	public ManufacturerList updateById(@RequestBody ManufacturerList manufacturer,@PathVariable int id)
	{
		Logger.info("request for save data in Manufacturer by id",manufacturer);
		return manufacturerListServiceImpl.updateManufacturerById(manufacturer);
		
	}
	/**
	 * This method deleteById to delete the record of ManufacturerList by Id
	 * 
	 * @return
	 */

	@RequestMapping(value = "/delete/{id}", method=RequestMethod.DELETE)
	public String DeleteManufacturerById(@PathVariable int id) 
	{
		Logger.debug("request for delete data from Manufacturer by id",id);
		manufacturerListServiceImpl.DeleteManufacturerById(id);
		return "The manufacturer has been deleted successfully.";
	}

}
