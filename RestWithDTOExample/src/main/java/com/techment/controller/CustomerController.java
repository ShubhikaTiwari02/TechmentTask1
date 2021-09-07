package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value = "/customerController")
public class CustomerController {
	
	@Autowired
	ICustomerService service;

	@GetMapping(value = "/viewAllCustomers")
	public List<CustomerDto> viewCustomer()
	{
		return service.viewAllCustomers();
	}
	
	
	//For Inserting A new Course
	@PostMapping(value = "/InsertCustomer")
	public String addNewCustomer(@RequestBody CustomerDto customer) {
		service.addCustomer(customer);

		return "Insertion Done";
	}
	
}
