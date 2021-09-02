package com.techment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="student301")
public class Stud {
	@Id
	int id;
	String name;
	@OneToMany
	List<Course> course;
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
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public Stud(int id, String name, List<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public Stud()
	{
		 
	}
	
	

}
