package com.techment;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoOneClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Address address = new Address();
		address.setDoorNo(101);
		address.setCity("Banglore");
		address.setStreetName("BTM");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Mahesh");
		employee.setDesignation("hr");
		employee.setAddress(address);
		
		em.persist(address);
		em.persist(employee);
		
		
		em.getTransaction().commit();
			
	}

}
