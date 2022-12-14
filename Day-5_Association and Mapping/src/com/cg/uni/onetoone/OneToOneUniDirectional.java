package com.cg.uni.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUniDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("Sahala");
		s.setPercentage(87.89f);
		
		Address a=new Address();
		a.setStreetno(12);
		a.setArea("kuttichara");
		a.setCity("Calicut");
		a.setState("Kerala");
		
		s.setAddress(a);
		
		em.persist(s);
		
		System.out.println("Rows is inserted");
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		

	}

}
