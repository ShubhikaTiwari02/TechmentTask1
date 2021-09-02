package com.techment.oneTomany;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
//@Table(name="employee400")
//public class Employee {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	int id;
//	String name;
//	String designation;



//@Entity
//@Table(name="dept400")
//public class Department {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	int id;
//	String name;
//	
//	// one dept have many emp
//	@OneToMany
//	@JoinColumn(name="empid")
//	List<Employee> employees;

@Entity
@Table(name = "dept400")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String name;
	
	
	@OneToMany
	@JoinColumn(name = "Deptid")
	List<Employeee> employeees;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Employeee> getEmployeees() {
		return employeees;
	}


	public void setEmployeees(List<Employeee> employeees) {
		this.employeees = employeees;
	}
	
	
	
	
}
