package com.techment.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Client300")
public class Client {

	@Id
	int id;
	String name;
	@ManyToOne
	Office office;
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
	public Office getOffice() {
		return office;
	}
	public void setOffice(Office office) {
		this.office = office;
	}
	public Client(int id, String name, Office office) {
		super();
		this.id = id;
		this.name = name;
		this.office = office;
	}
	
	
	
}
