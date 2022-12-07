package com.to.mydemo.jpa.example;


		import javax.persistence.EntityManager;
		import javax.persistence.EntityManagerFactory;
		import javax.persistence.Persistence;
		 



		public class employ_main {

			public static void main(String[] args) {
				                //create
				
		                      //EntityManagerFactory-it contains repositary & interface
						
							 EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.to.mydemo.jpa.example");
							
							 //EntityManager-implements the API & encapsulate all of them in single unit
							 EntityManager entityManager = emf.createEntityManager();
		                      //getTransaction- is the level entity transaction obj
							 entityManager.getTransaction().begin();//begin()-start the Transaction
							 //insert

							 employ e0= new employ();
							 e0.setId(102);
							 e0.setName("Gokul");
							 e0.setSalary(25000);
							 entityManager.persist(e0);
							 
							 employ e1= new employ();
							 e1.setId(103);
							 e1.setName("Akila");
							 e1.setSalary(30000);
							 entityManager.persist(e1);
							 
							 employ e2= new employ();
							 e2.setId(104);
							 e2.setName("Theju");
							 e2.setSalary(35000);
							 entityManager.persist(e2);
							 
							 employ e3= new employ();
							 e3.setId(105);
							 e3.setName("Dhana");
							 e3.setSalary(40000);

							 entityManager.persist(e3);//instance passed

							 entityManager.getTransaction().commit();//end the transaction*/
							 
							
							}
						
					



			}

	
