package com.techment;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Author300")
public class Author {
		@Id
	int AuthorId;
	String firstName;
	String lastName;
	String phoneNumber;
	
	public Author()
	{
		
	}
	
	
	public Author(int authorId, String firstName, String lastName, String phoneNumber) {
		super();
		AuthorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}


	public int getAuthorId() {
		return AuthorId;
	}
	public void setAuthorId(int authorId) {
		AuthorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String LastName) {
		lastName = LastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		phoneNumber = PhoneNumber;
	}
	@Override
	public String toString() {
		return "Author [AuthorId=" + AuthorId + ", firstName=" + firstName + ", LastName=" + lastName + ", PhoneNumber="
				+ phoneNumber + "]";
	}
	
	
	
	
	
	
}
