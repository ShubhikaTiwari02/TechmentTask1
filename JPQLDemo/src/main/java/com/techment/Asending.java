package com.techment;

import javax.persistence.*;  
import javax.persistence.criteria.*;  
  
import java.util.*;  
public class Asending {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
          CriteriaBuilder cb=em.getCriteriaBuilder();  
          CriteriaQuery<Product> cq=cb.createQuery(Product.class);  
            
         Root<Product> p=cq.from(Product.class);  
           
          
         cq.orderBy(cb.asc(p.get("price")));  
          CriteriaQuery<Product> select = cq.select(p);  
          TypedQuery<Product> q = em.createQuery(select);  
          List<Product> list = q.getResultList();  
  
             System.out.print("id");  
             System.out.print("\t name");  
             System.out.println("\t price");  
          
          for(Product p1:list)  
          {  
          System.out.print(p1.getId());  
          System.out.print("\t"+p1.getName());  
          System.out.println("\t"+p1.getPrice());
		   System.out.println("\t" + p1.getCategory());

          }   
            
         em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  
