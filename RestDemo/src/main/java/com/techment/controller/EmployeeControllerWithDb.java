package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techement.Service.IEmployeeService;
import com.techment.entity.Employee;

@RestController
@RequestMapping("/empController")
public class EmployeeControllerWithDb {

	@Autowired
	IEmployeeService iEmployeeService;

	@GetMapping("/viewAllEmployee")
	public List<Employee> viewAllEmployee() {
		return iEmployeeService.viewAllEmployees();

	} 
	
	
	@PostMapping("/addNewEmployee")
	public String addNewEmployee(@RequestBody Employee employee) {
		return iEmployeeService.addEmployee(employee);
		
	}
	
	@GetMapping("/viewEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		return iEmployeeService.viewEmployeeById(id);
	}
	
	
	
}
