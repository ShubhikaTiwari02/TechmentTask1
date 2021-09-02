package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertOperationAuthorClient {

	public static void main(String[] args) {
		System.out.println("===============================Client Application Started================================");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("===================Insert Operation Started========================================");
			Author author1 = new Author(1, "Ravi", "Shanstri", "985632147");
			Author author2 = new Author(2, "Sachin", "Jain", "123456789");
			Author author3 = new Author(3, "Raju", "Singh", "789456123");
			Author author4 = new Author(4, "Rama", "Rao", "987456321");
			Author author5 = new Author(5, "Pawan", "Sahu", "987654321");
			em.persist(author1);
			em.persist(author2);
			em.persist(author3);
			em.persist(author4);
			em.persist(author5);
			em.getTransaction().commit();
		System.out.println("===============================Insert operation Finished==================================");
			
	}

}

