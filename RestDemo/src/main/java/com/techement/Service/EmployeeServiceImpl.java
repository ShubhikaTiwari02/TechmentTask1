package com.techement.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.techment.Dao.IEmployeeDao;
import com.techment.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	@Autowired
	com.techment.dao.IEmployeeDao employeeDao;
	
	
	@Override
	public String addEmployee(Employee employee) {
		employeeDao.save(employee);
		return "added";
	}

	@Override
	public List<Employee> viewAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee viewEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id).get();
	}

}
