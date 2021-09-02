package com.techement.Example;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class OnetoManyBidirectionalCLient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Library library = new Library();
		library.setName("Abc Library");
		em.persist(library);
		
		Book bk1 = new Book();
		bk1.setBookNAme("MongoDB");
		bk1.setAuthor("Bala");
		bk1.setLibrary(library);
	
		Book bk2 = new Book();
		bk2.setBookNAme("SQL");
		bk2.setAuthor("Raju");
		bk2.setLibrary(library);
	
		em.persist(bk1);
		em.persist(bk2);
		
		
		
		
		
		
		
		
		
		
		
	
		em.getTransaction().commit();
		System.out.println("====================Inserted==================");

	}

}
