package com.itaim.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itaim.application.domain.AssetList;


@Repository
public interface AssetListRepository extends JpaRepository<AssetList, Integer>{

}
