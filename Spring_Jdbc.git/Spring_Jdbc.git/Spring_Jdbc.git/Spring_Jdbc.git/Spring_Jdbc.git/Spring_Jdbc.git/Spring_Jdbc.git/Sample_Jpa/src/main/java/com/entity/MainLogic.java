package com.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainLogic {
	private static EntityManager em;
	
	public static void main(String args[]) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student");
		
		em=emf.createEntityManager();
		
		createStudent(201,"amrutha",560);
		createStudent(202,"Arun",520);
		
	}
	private static void createStudent(int id, String name,int marks) {
		em.getTransaction().begin();
		Student st = new Student(id,name,marks);
		em.persist(st);
		em.getTransaction().commit();
	}
}
