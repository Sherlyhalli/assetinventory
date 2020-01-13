package com.itaim.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.itaim.application.domain.AddAsset;

@Repository
public interface AddAssetRepository extends JpaRepository<AddAsset, Integer> {
	@Query(value="select serial_number from add_asset where asset_type = ?", nativeQuery = true)
    List<String> findSerialNum(String assetType);
}
