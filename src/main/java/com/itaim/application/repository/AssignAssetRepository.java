package com.itaim.application.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.itaim.application.domain.AssignAsset;

@Repository
public interface AssignAssetRepository extends JpaRepository<AssignAsset, Integer>
{
	//@Query("SELECT *  FROM assign_asset where assigned_flag = 'A'") 
	List<AssignAsset> findByStatus(String string);
}
