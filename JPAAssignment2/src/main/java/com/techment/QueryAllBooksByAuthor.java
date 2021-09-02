package com.techment;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryAllBooksByAuthor {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query qry = em.createQuery("select p from Auth p where p.name='shubhika'");
		
		Object id =  qry.getSingleResult();
		
		
		Query qry1 = em.createQuery("SELECT d FROM Book e JOIN e.auth d", Author1.class);
		
		List<Book> books = (List<Book>) qry1.getResultList();
		
		for(Book b:books)
		{
			System.out.println(" name "+b.getTitle()+", Book Price "+b.getPrice());
		}
		

		em.getTransaction().commit();
	

	}

}
