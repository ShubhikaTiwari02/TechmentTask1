package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;
import com.techment.exception.IDNotFoundException;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao Dao;

	@Override
	public String addCustomer(CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setAddress(customerDto.getAddress());
		customer.setAge(customerDto.getAge());
		customer.setEmail(customerDto.getEmail());
		Dao.save(customer);
		return "Customer Is Added";
	}

	@Override
	public List<CustomerDto> viewAllCustomers() {

		List<Customer> customers =	Dao.findAll();
		
		List<CustomerDto> customerDto = new ArrayList<CustomerDto>();
		
		for(Customer c : customers)
		{
			customerDto.add(new CustomerDto(c.getId(),c.getName(),c.getAge(),c.getAddress()));
		}
		
		
		return customerDto;
	}

//	@Override
//	public Customer viewCustomerById() {
//		dao.deleteById(id);
//		return "Delete Successfull";
//		
//	}

@Override
	
	public CustomerDto viewCustomerById(int id)throws IDNotFoundException {		
		 
		Customer customer =  Dao.findById(id).get();
		CustomerDto customerDto= new CustomerDto(customer.getId(),customer.getName(),customer.getAge(),customer.getAddress(),customer.getEmail(),customer.getMobile());
		
		return customerDto;
	}

@Override
public String deleteCustomerById(int id) {
	// TODO Auto-generated method stub
	Dao.deleteById(id);
	return "deleted";
}

@Override
public String updateCustomerById(CustomerDto customerDTO, int id) {


	Customer newCustomer =Dao.findById(id).get();
	
	//CustomerDTO newCustomer = new CustomerDTO();
	newCustomer.setAddress(customerDTO.getAddress());
	newCustomer.setAge(customerDTO.getAge());
	newCustomer.setEmail(customerDTO.getEmail());
	newCustomer.setMobile(customerDTO.getMobile());
	Dao.save(newCustomer);
	
	return "updated";
}


}
