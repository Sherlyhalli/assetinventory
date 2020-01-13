package com.itaim.application.web.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itaim.application.domain.Client;
import com.itaim.application.domain.Employee;
import com.itaim.application.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController 
{
	@Autowired
	EmployeeServiceImpl employeeService;
	
	/**
	 * This method Save to save the record of Employee
	 * 
	 * @return
	 */
	
	@RequestMapping(value = "/save", method=RequestMethod.POST)
//	public String saveEmployee(@RequestBody Employee employee) 
//	{ 
//		employeeService.saveEmployee(employee);
//		return "Success";
//	}
	public ResponseEntity<Boolean> save(@RequestBody Employee employee) {
	      if (employee.getId() == 0) {
	      List<Employee> empList = employeeService.getEmployee();
	      if (empList.stream().filter(data -> data.getEmail().equals(employee.getEmail())).count() > 0) {
	         return new ResponseEntity<Boolean>(false, HttpStatus.ALREADY_REPORTED);
	      }
	      employeeService.saveEmployee(employee);
	      } else {
	    	  employeeService.saveEmployee(employee);
	      }
	        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	 }
	
	/**
	 * This method getAll to fetch the record of Employee
	 * 
	 * @return
	 */
	 
	@RequestMapping(value = "/getAll", method=RequestMethod.GET)
	public List<Employee> getEmployee() 
	{
		System.out.println("find all employees");
		return employeeService.getEmployee();
	}
	
	/**
	 * This method getEmployeeById to fetch the record of Employee
	 * 
	 * @return
	 */

	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public Optional<Employee> getEmployeeById(@PathVariable int id) 
	{
		 return employeeService.getEmployeeById(id);
	}
	
	/**
	 * This method updateEmployee to update the record of Employee by Id
	 * 
	 * @return
	 */
	  
	@RequestMapping(value = "/{id}",  method=RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id)
	{
		return employeeService.updateEmployee(employee);	
	}
	
	/**
	 * This method deleteEmployee to delete the record of Employee
	 * 
	 * @return
	 */
	  
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable int id) 
	{
		employeeService.deleteEmployee(id);
		return "The employee has been deleted successfully.";
	}
}
