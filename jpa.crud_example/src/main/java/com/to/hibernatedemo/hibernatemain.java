package com.to.hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class hibernatemain {

	public static void main(String[] args) {
		
		
		EntityManagerFactory ef=Persistence.createEntityManagerFactory("jpa.crud_example");
		EntityManager e=ef.createEntityManager();
		
		demo d=new demo(1,"abi", "IT");
		//d.setId(100);
		//d.setName("poovi");
		//d.setAge(23);
		//d.setDept("cse");
		e.getTransaction().begin();
		e.persist(d);
		e.getTransaction().commit();
		
		
		
		
		
		e.close();
		ef.close();
		
	}

}
