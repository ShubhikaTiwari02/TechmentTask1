package com.techment.oneTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee400")
public class Employeee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Id;
	String name;
	String designation;
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
	public Employeee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	
	

	
	
	
}
