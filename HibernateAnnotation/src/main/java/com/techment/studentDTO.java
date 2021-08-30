package com.techment;

public class studentDTO {

	int studentId;
	String name;
	String dept;
	
	
	public studentDTO() {
		
	}
	
	public studentDTO(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	

	public studentDTO(int studentId, String name, String dept) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.dept = dept;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
