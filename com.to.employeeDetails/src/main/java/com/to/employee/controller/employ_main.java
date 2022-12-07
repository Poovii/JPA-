package com.to.employee.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.to.employeeDetails.Employ;
 



public class employ_main {

	public static void main(String[] args) {
		                //create
		
                      //EntityManagerFactory-it contains repositary & interface
				
					 EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.to.employeeDetails");
					
					 //EntityManager-implements the API & encapsulate all of them in single unit
					 EntityManager entityManager = emf.createEntityManager();
                      //getTransaction- is the level entity transaction obj
					// entityManager.getTransaction().begin();//begin()-start the Transaction
					 //insert

					 

					// entityManager.getTransaction().commit();//end the transaction*/
					 
					//Employ employ= entityManager.find(Employ.class,102);
					// System.out.println();
					 
					// String query="Select*from Employ";
					// TypedQuery<Employ>typedquery=entityManager.createQuery(query,Employ.class);
					// List<Employ>emplist=typedquery.getResultList();
					// for(Employ employ:emplist) {
						// System.out.println(employ);
					// }
					 
					Employ e41= entityManager.find(Employ.class, 106);
					 if(e41 !=null) {
						 entityManager.remove(e41);
					 } else {
						 System.out.println("employ not available");
					 }
					 
					 
					 entityManager.close();
					 emf.close();
					 
					 
					
					}
				
			



	}


