package com.techment.oneTomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientOnetoMany {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Employeee e1 = new Employeee("Hari", "developer");
		Employeee e2 = new Employeee("Ravi", "HR");
		
		em.persist(e1);
		em.persist(e2);
		
		List<Employeee> emp = new ArrayList<Employeee>();

		emp.add(e1);
		emp.add(e2);
		
		Department d1 = new Department();
		d1.setName("hr");
		d1.setEmployeees(emp);
		
		em.persist(d1);
		em.getTransaction().commit();
		
		
	}

}
