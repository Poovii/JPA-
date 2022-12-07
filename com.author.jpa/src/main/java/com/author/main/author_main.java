package com.author.main;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.author.jpa.com.Author;

public class author_main {

	public static void main(String[] args) {
		try {
			int n;
			int authorId;
			String firstName;
			String middleName;
			String lastName;
			double phoneNo;
			
			do
			{
				System.out.println("----------------Author Menu--------------");
				System.out.println("1.Insert Author...");
				System.out.println("2.Update Author...");
				System.out.println("3.Remove Author...");
				System.out.println("4.Find Author...");
				System.out.println("5.Find the author by id...");
				System.out.println("6.Exit");
				System.out.println("Enter your choice");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();

				EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.jpa.collection");
				EntityManager em=emf.createEntityManager();
				em.getTransaction().begin();
				switch(n) {
					case 1:
						System.out.println("Enter authorId,firstName,middleName,lastName,middleName,phoneNo....");
						authorId=sc.nextInt();
						firstName=sc.nextLine();
						middleName=sc.nextLine();
						lastName=sc.nextLine();
						phoneNo=sc.nextDouble();
						Author a=new Author();
						a.setAuthorId(authorId);
						a.setFirstName(firstName);
						a.setMiddleName(middleName);
						a.setLastName(lastName);
						a.setPhoneNo(phoneNo); 
						em.persist(a);
						System.out.println("author details inserted successfully...");
						break;  
						
					case 2:
						System.out.println("Enter author currently using phoneNo");
						phoneNo=sc.nextDouble();
						
						
						 
						
						
						
					
						
						
				}
				
				
				
				
				
				
				
			}
		}
	}
}

