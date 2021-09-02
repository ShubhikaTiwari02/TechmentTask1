package com.techment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course300")
public class Course {

@Id
int id;

@ManyToOne
String couseName;
int duration;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCouseName() {
	return couseName;
}
public void setCouseName(String couseName) {
	this.couseName = couseName;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}


public Course() {
	super();
}

public Course(int id, String couseName, int duration) {
	super();
	this.id = id;
	this.couseName = couseName;
	this.duration = duration;
}


	
}
