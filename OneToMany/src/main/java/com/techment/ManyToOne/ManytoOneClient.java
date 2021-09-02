package com.techment.ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManytoOneClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Office office = new Office(2, "Techment");
		em.persist(office);
		
		Client employee1 = new Client(104, "shubhika", office);
		Client employee2 = new Client(105, "rahul", office);
		Client employee3 = new Client(106, "shrya", office);
		
		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		
		em.getTransaction().commit();
		
		

	}

}
