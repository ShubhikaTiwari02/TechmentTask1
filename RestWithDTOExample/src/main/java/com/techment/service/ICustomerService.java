package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techment.dao.ICustomerDao;
import com.techment.dto.CustomerDto;
import com.techment.entity.Customer;

public interface ICustomerService {

	String addCustomer(CustomerDto customerDto);
	
	List<CustomerDto> viewAllCustomers();
	
	
	
	
}
