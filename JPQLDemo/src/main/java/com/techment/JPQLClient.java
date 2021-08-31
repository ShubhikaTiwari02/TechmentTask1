package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

public class JPQLClient {
public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
      Query query = em.createQuery("select p from Product p");
		
		List<Product> products = query.getResultList();
		
		for(Product p : products)
		{
			System.out.println(p.getId()+"  "+p.getName()+"  "+p.getPrice()+"  "+p.getCategory());
			
		}
		Query qry2 = em.createQuery("select p.id from Product p");
		List<Integer> ids = qry2.getResultList();
		for(Integer i : ids)
		{
			System.out.println(i);
			
		}
//		System.out.println("==============");
//
//		Query qry3 = em.createQuery("select p.name from Product p");
//		List<Integer> name = qry3.getResultList();
//		for(Integer n : name)
//		{
//			System.out.println(n);
//			
//		}
//		
		
		System.out.println("==============");
		
		Query qry= em.createNamedQuery("findAllProduct");
		List<Product> list = qry.getResultList();
		for(Product p : products)
		{
			System.out.println(p.getId()+"  "+p.getName()+"  "+p.getPrice()+"  "+p.getCategory());
			
		}
		
		}

}