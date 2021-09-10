package com.techment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IEmployeeDao;
import com.techment.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	IEmployeeDao employeeDao;
	
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		return "added";
	}

	@Override
	public List<Employee> viewAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee viewEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id).get();
	}

}
