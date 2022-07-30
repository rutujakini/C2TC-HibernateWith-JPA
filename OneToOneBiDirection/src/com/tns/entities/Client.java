package com.tns.entities;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("Nirav Meher");
		Address homeAddress = new Address();
		homeAddress.setStreet("Sai Nagar Road");
		homeAddress.setCity("Palghar");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("401 402");
		
		//inject address into student
		student.setAddress(homeAddress);
		
		//persist only student, no need to persist Address explicitly
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	
	System.out.println("done");
}}