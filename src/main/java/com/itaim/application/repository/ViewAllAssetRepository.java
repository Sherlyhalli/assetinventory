package com.itaim.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.itaim.application.domain.ViewAllAsset;

public interface ViewAllAssetRepository extends JpaRepository<ViewAllAsset, Integer> {
	@Query(value="SELECT add_asset.id, add_asset.asset_type, add_asset.serial_number, add_asset.model_number, add_asset.manufacturer, add_asset.procurement_date, assign_asset.assign_to, assign_asset.assignment_date, assign_asset.status, assign_asset.reason FROM add_asset INNER JOIN assign_asset ON add_asset.serial_number=assign_asset.serial_number", nativeQuery = true)
    List<ViewAllAsset> findByTwoTables();
}
