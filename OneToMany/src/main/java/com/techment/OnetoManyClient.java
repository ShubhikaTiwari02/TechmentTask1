package com.techment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoManyClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Course java = new Course(90,"Java",4);
		Course python = new Course(91,"Python",4);
		Course bigdata = new Course(92,"Big data",4);
		
		em.persist(python);
		em.persist(java);
		em.persist(bigdata);
		
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(java);
		courses.add(python);
		courses.add(bigdata);
		
		//courses.add(new Course(94,"My SQL",1));
		
		
		
		
		Stud sachin = new Stud(1,"Sachin",courses);
		em.persist(sachin);
		em.getTransaction().commit();
		
		
		System.out.println("===============Inserted==================");
		

             
	
	
	}

}
