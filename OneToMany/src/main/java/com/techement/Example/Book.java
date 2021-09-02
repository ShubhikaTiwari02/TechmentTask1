package com.techement.Example;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book20000")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookid;
	String bookNAme;
	String author;
	
	@ManyToOne
	@JoinColumn(name = "libraryId")
	Library library;
	
	
	
	
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookNAme() {
		return bookNAme;
	}
	public void setBookNAme(String bookNAme) {
		this.bookNAme = bookNAme;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}

