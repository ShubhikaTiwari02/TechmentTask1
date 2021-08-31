package com.techment;

import javax.persistence.*;  

public class UpdateProduct
{  
      
    public static void main(String args[])  
    {  
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");  
        EntityManager em=emf.createEntityManager();  
          
      
          
        Product p=em.find(Product.class,111);  
        System.out.println("Before Updation");  
        System.out.println("Product id = "+p.getId());  
        System.out.println("Product Name = "+p.getName());  
        System.out.println("Procuct Category = "+p.getCategory());  
        System.out.println("Procuct price = "+p.getPrice());  

         p.setPrice(5300);  
          
        System.out.println("After Updation");  
        System.out.println("Product id = "+p.getId());  
        System.out.println("Product Name = "+p.getName());  
        System.out.println("Procuct Category = "+p.getCategory());  
        System.out.println("Procuct price = "+p.getPrice());    
          
          
    }  
  
}