package com.techment;


import javax.persistence.*;  
import java.util.*;  
public class FetchProduct {  
    
   public static void main( String args[]) {  
           
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "s" );  
        EntityManager em = emf.createEntityManager();  
        em.getTransaction().begin( );  
          
          
        Query query = em.createQuery( "Select p.price from Product p ");  
          
        @SuppressWarnings("unchecked")  
      List<Product> list=(List<Product>)query.getResultList( );  
         
        System.out.print(" p.id");  
        System.out.print("\t p.name");  
       System.out.println("\t p.price");  
       System.out.println("\t p.category");  

          
        for( Product p:list ){  
           System.out.print( p.getId( ));  
           System.out.print("\t" +  p.getName( ));  
          System.out.print("\t" + p.getPrice( ));  
          System.out.println("===================================");  
        }  
        em.getTransaction().commit();  
        em.close();  
        emf.close();    
   }  
}  