package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

  
public class FindProduct {  
    public static void main(String args[])  
    {  
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");  
        EntityManager em=emf.createEntityManager();  
          
      
          
        Product p=em.find(Product.class,111);  
        System.out.println("find any Product");  
        System.out.println("Product id = "+p.getId());  
        System.out.println("Product Name = "+p.getName());  
        System.out.println("Procuct Category = "+p.getCategory());  
        System.out.println("Procuct price = "+p.getPrice());  
 
        
    }  
}  