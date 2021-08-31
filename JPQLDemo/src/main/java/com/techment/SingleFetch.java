package com.techment;

import javax.persistence.*;  
import javax.persistence.criteria.*;  
  
import java.util.*;  
public class SingleFetch {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
          CriteriaBuilder cb=em.getCriteriaBuilder();  
          CriteriaQuery<Product> cq=cb.createQuery(Product.class);  
            
         Root<Product> p=cq.from(Product.class);  
           
         cq.select(p.get("name"));   
           
          CriteriaQuery<Product> select = cq.select(p);  
          TypedQuery<Product> q = em.createQuery(select);  
          List<Product> list = q.getResultList();  
  
          System.out.println("id");  
               
            
          for(Product p1 :list)  
          {  
          System.out.println(p1.getId());  
      
        }  
            
         em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  