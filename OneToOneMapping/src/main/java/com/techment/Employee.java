package com.techment;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Employee300")
public class Employee {

	@javax.persistence.Id
	int Id;
	String name;
	String designation;
	@OneToOne
	Address Address;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	
}
