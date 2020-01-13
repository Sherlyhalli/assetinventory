package com.itaim.application.service;

import java.util.List;
import java.util.Optional;
import com.itaim.application.domain.Employee;

public interface EmployeeService 
{
	 public String saveEmployee(Employee employee);
	 public  List<Employee> getEmployee();
	 public Optional<Employee> getEmployeeById(int id);
	 public  Employee updateEmployee(Employee employee);
	 public  String deleteEmployee(int id);
}
