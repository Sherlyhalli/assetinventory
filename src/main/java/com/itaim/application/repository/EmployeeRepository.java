package com.itaim.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itaim.application.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
