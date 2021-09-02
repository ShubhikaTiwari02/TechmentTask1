package com.techment;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryAllBookbyPrice {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query qry = em.createQuery("select b from Book b where b.price between 500 and 1000");
		
		
		
		
		
		
		List<Book> books = (List<Book>) qry.getResultList();
		
		for(Book b:books)
		{
			System.out.println(" name "+b.getTitle()+", Book Price "+b.getPrice());
		}
		

		em.getTransaction().commit();
	

	}

}
