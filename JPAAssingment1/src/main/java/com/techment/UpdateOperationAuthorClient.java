package com.techment;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateOperationAuthorClient {

	public static void main(String[] args) {
System.out.println("===============================Client Application Started================================");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("===================Update Operation Started========================================");
			Author author = em.find(Author.class, 3);
		
		System.out.println("Author First Name is : "+author.firstName);
		System.out.println("Author Last Name is : "+ author.getLastName());
		System.out.println("Author Mobile Number is :" +author.getPhoneNumber());
		
		System.out.println("Author Details After Mobile Number Updation Is : ");
		author.setPhoneNumber("8770961969");
		
		System.out.println("Author First Name is : "+author.firstName);
		System.out.println("Author Last Name is : "+ author.getLastName());
		System.out.println("Author Mobile Number is :" +author.getPhoneNumber());
		
			em.getTransaction().commit();
		System.out.println("===============================Update operation Finished==================================");
			

	}

}
