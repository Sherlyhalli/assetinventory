package com.itaim.application.service;

import java.util.List;
import java.util.Optional;

import com.itaim.application.domain.ManufacturerList;

public interface ManufacturerListService {
		public String saveManufacturer(ManufacturerList manufacturer);
		public List<ManufacturerList> getAllManufacturer();
		public Optional<ManufacturerList> getManufacturerById(int id);
		public ManufacturerList updateManufacturerById(ManufacturerList manufacturer);
		public String DeleteManufacturerById(int id);
	
}
