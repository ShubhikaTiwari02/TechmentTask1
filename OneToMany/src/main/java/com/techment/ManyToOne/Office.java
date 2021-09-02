package com.techment.ManyToOne;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="office300")
public class Office {

	@Id
	int id;
	String officename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public Office(int id, String officename) {
		super();
		this.id = id;
		this.officename = officename;
	}
	
	
}
