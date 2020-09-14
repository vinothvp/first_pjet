package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmpolyeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/employee")
	public String addEmployeeDetails(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Successfully added";
		
	}
	@GetMapping(value="/employee")
	public List<Employee> getEmployeeDetails(){
		return employeeService.getEmployee();
	}
	
	@DeleteMapping(value="/employee/{id}")
	public String getEmployeeDetails(@PathVariable Long id){
		 employeeService.deleteEmpoloyee(id);
		return "Successfully Deleted";
	}
	
	
	
	
	
	

}
