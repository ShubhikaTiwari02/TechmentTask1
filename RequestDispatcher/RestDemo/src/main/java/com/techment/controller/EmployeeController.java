package com.techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {

	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	@GetMapping("/showMessage")
	public String  hello() {
		return "this is my first demo";
		
	}
	
	
	
	@GetMapping("/getAllEmployee")
	public ArrayList<Employee>  showsEmployees() {
		
		
//		employees.add(new Employee(1, "shubhika", "etc"));
//		employees.add(new Employee(2, "shubhum", "etc"));
//		employees.add(new Employee(3, "Pk", "etc"));
//		employees.add(new Employee(4, "Pk", "etc"));
		
		return employees;
		
	}
	
	@PostMapping(value="addNewEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		employees.add(employee);
		return "employee added";
	}
	
	
}
