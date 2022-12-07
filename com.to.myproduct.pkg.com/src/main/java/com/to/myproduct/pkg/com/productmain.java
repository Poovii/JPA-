package com.to.myproduct.pkg.com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class productmain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.to.myproduct.pkg.com");  
        EntityManager em=emf.createEntityManager();  
          
em.getTransaction().begin();  
          
       product p1=new product(); 
       p1.setId(1);
       p1.setName("Oil");
       p1.setDept("Grossary");
       
       em.persist(p1);
       
       
       product p2=new product(); 
       p1.setId(2);
       p1.setName("Rice");
       p1.setDept("Grossary");
       
       em.persist(p2);
       
       
       product p3=new product(); 
       p1.setId(3);
       p1.setName("Pencil");
       p1.setDept("BookShop");
       
       em.persist(p3);
       
       
       product p4=new product(); 
       p1.setId(4);
       p1.setName("Pen");
       p1.setDept("BookShop");
       
       em.persist(p4);
       
       em.getTransaction().commit();  
        
       
		
	}

}
