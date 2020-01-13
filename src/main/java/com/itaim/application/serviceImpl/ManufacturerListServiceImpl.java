package com.itaim.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itaim.application.domain.ManufacturerList;
import com.itaim.application.repository.ManufacturerListRepository;
import com.itaim.application.service.ManufacturerListService;


@Service
@Transactional
public class ManufacturerListServiceImpl implements ManufacturerListService{
	private static final Logger logger = LoggerFactory.getLogger(ClientServiceImpl.class);

	@Autowired
	ManufacturerListRepository manufacturerListRepository;

	@Override
	public String saveManufacturer(ManufacturerList list)
	{
		logger.info("request for save data in manufacturerList{}",list);
		manufacturerListRepository.save(list);
		return "The Manufacturer has been saved successfully.";
	}
	@Override
	public List<ManufacturerList> getAllManufacturer() {
		logger.info("request for fetchall data from manufacturerList{}");
		return manufacturerListRepository.findAll();
	}
	@Override
	public Optional<ManufacturerList> getManufacturerById(int id) {
		logger.info("request for fetchall data from manufacturerList by id{}", id);
		return manufacturerListRepository.findById(id);
	}

	@Override
	public ManufacturerList updateManufacturerById(ManufacturerList list) {
		logger.info("request for updateall data from manufacturerList by id{}",list);
		return manufacturerListRepository.save(list);
	}

	@Override
	public String DeleteManufacturerById(int id) {
		logger.debug("request for delete data from manufacturerList by id{}", id);
		manufacturerListRepository.deleteById(id);
		return "The Manufacturer has been deleted successfully.";
	}
	
}
