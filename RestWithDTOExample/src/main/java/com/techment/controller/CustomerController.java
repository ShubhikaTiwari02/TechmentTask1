package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.CustomerDto;
import com.techment.exception.IDNotFoundException;
import com.techment.service.ICustomerService;

@RestController
@RequestMapping(value = "/customerController")
public class CustomerController {

	@Autowired
	ICustomerService service;

	@GetMapping(value = "/viewAllCustomers")
	public List<CustomerDto> viewCustomer() {
		return service.viewAllCustomers();
	}

	// For Inserting A new Course
	@PostMapping(value = "/InsertCustomer")
	public String addNewCustomer(@RequestBody CustomerDto customer) {
		service.addCustomer(customer);

		return "Insertion Done";
	}

	@GetMapping(value = "/customerById/{id}")
	public CustomerDto getById(@PathVariable int id) {
//		CustomerDto customer = service.viewCustomerById(id);
//		return customer;
		try {
			CustomerDto customer = service.viewCustomerById(id);
			return customer;
		} catch (NoSuchElementException e) {
			throw new IDNotFoundException("id not found which you want to show");
		}

	}
	
	

	@DeleteMapping("/deleteCustomerById/{id}")
	public ResponseEntity<String> deletedCustomerById(@PathVariable int id) {

		// return new ResponseEntity<CustomerDTO>(iCustomerService.customerDTOById(id),
		// HttpStatus.OK);

		try {
			return new ResponseEntity<String>(service.deleteCustomerById(id), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			throw new IDNotFoundException("no present to get it ");
		}
	}
	
	
	@PutMapping("/updateCustomerById/{id}")
	public ResponseEntity<String> updateCustomerById(@RequestBody CustomerDto customerDTO,@PathVariable int id){
		
		
		try {
			
			return new ResponseEntity<String>(service.updateCustomerById(customerDTO, id),HttpStatus.OK);
		}catch (NoSuchElementException e) {
			throw new IDNotFoundException("no present to get it ");
		}
		
	}
	
	
	
	
	
	
	
	
	

	@ExceptionHandler(IDNotFoundException.class)
	public ResponseEntity<Object> MyException(IDNotFoundException e) {
		return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

}
