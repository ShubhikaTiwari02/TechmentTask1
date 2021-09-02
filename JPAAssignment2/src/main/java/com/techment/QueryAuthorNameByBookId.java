package com.techment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryAuthorNameByBookId {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();


		Query qry = em.createQuery("select p from Book p where p.ISBN=37");
		
		Object id =  qry.getSingleResult();
		
		
		Query qry1 = em.createQuery("select p from Auth p where p.id=id");
		
		
		
		
		List<Auth> auths = (List<Auth>) qry1.getResultList();
		
		for(Auth b:auths)
		{
			System.out.println(" id "+b.getId()+" name "+b.getName());
		}
		

		em.getTransaction().commit();
	

	}

}