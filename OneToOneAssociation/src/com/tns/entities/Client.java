package com.tns.entities;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= factory.createEntityManager();
		em.getTransaction().begin();
		Student student=new Student();
		student.setName("Nirmiti Patil");
		Address homeAddress=new Address();
		homeAddress.setCity("Virar");
	    homeAddress.setState("Maharashtra");
	    homeAddress.setStreet("Sai  nagar Road");
	    homeAddress.setZipcode("401 400");
	    
	    //inject address into student
	    student.setAddress(homeAddress);
	    
	    // persist only student ,no need to persist Address explicitly
	    em.persist(student);
	    em.getTransaction().commit();
	      
	    System.out.println("Added one student with address to database.");
	    em.close();
	    factory.close();
	}}