package com.techment;

import javax.persistence.*;

public class DeleteProduct {

	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		DeleteProduct p = em.find(DeleteProduct.class, "111");
		em.remove(p);
		em.getTransaction().commit();
		emf.close();
		em.close();

	}
}