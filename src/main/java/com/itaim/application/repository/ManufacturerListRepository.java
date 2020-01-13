package com.itaim.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itaim.application.domain.ManufacturerList;


@Repository
public interface ManufacturerListRepository extends JpaRepository<ManufacturerList, Integer>{

}
