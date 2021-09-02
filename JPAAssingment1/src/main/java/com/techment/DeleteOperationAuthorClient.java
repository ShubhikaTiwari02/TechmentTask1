package com.techment;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteOperationAuthorClient {

	public static void main(String[] args) {

		System.out.println("===============================Client Application Started================================");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em= emf.createEntityManager();
		System.out.println("===================Delete Operation Started========================================");
		em.getTransaction().begin();

		Author author =em.find(Author.class, 4);
		em.remove(author);



		em.getTransaction().commit();
		System.out.println("===============================Delete operation Finished==================================");



	}

}
