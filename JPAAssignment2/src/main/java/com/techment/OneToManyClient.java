package com.techment;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Author1 shubhika = new Author1("shubhika");
		Auth harsh = new Auth("Harsh");

		
		
		Book java = new Book("Java", 234,parul);
		Book python = new Book("Python", 300,shubhika);
		Book cpp = new Book("C++", 134,harsh);
		Book javascript = new Book("C++", 634,harsh);

		Set<Book> books1 = new HashSet();
		Set<Book> books2 = new HashSet();

		books1.add(java);
		books1.add(python);
		books2.add(cpp);
		books2.add(javascript);
		

		shubhika.setBooks(books1);
		harsh.setBooks(books2);
		 
	
		em.persist(java);
		em.persist(python);
		em.persist(cpp);
		em.persist(shubhika);
		em.persist(harsh);

		em.getTransaction().commit();
		System.out.println("Inserted");

	}

}