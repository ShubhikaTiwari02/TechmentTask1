package com.techment;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectOperationAuthorClient {

	public static void main(String[] args) {

		System.out.println("====================Client Application =======================================");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		
		Query query = em.createQuery("Select a from Author a ");
		
		List<Author> authors= query.getResultList();

		for(Author a : authors)
		{
			System.out.println( "AUthor Id is : "+ a.getAuthorId() +"  Author's Name : "+ a.getFirstName()+" "+a.getLastName() +" AUthor's Mobile Number is  : "+a.getPhoneNumber());

		}
		
		System.out.println("=====================Operation Completed============================================");
	}

}

