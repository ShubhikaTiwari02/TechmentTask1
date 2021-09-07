package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;

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

			//customerDto.add(new CustomerDto(c.getId(),c.getName(),c.getAge(),c.getAddress(),c.getEmail(),c.getMobile()));
			customerDto.add(new CustomerDto(c.getId(),c.getName(),c.getAge(),c.getAddress()));
		}
		
		
		return customerDto;
	}


}
