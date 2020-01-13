package com.itaim.application.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itaim.application.domain.ViewAllAsset;
import com.itaim.application.serviceImpl.ViewAllAssetServiceImpl;

@RestController
@RequestMapping("/viewAllAsset")
public class ViewAllAssetController {
	private static final Logger Logger = LoggerFactory.getLogger(ViewAllAssetController .class);
  @Autowired
  ViewAllAssetServiceImpl viewAllAssetSericeImpl;
  
  /**
	 * This method getAllTwoTables to fetch the record of ViewAllAsset
	 * 
	 * @return
	 */
  
	@RequestMapping(value = "/getAllTwoTables", method = RequestMethod.GET)
	public List<ViewAllAsset> findByTwoTables(){
		 Logger.info("request for fetching data from viewAllAsset");
		return viewAllAssetSericeImpl.findByTwoTables();
	}
}
