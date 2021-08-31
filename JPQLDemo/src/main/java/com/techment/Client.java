package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
	EntityManager em= emf.createEntityManager();
	
		em.getTransaction().begin();
		Product product = new Product();

		product.setId(1);
		product.setName("laptop");
		product.setCategory("electronics");
		product.setPrice(4500);
		
		System.out.println(" inserted product 2");
		product.setId(2);
		product.setName("phone");
		product.setCategory("electronics");
		product.setPrice(5000);
		
		System.out.println(" inserted product 3");
		product.setId(3);
		product.setName("LED");
		product.setCategory("electronics");
		product.setPrice(55000);
		
		
        em.persist(product);
       em.getTransaction().commit();
       // emf.close();
        //em.close();
		
	}

}
