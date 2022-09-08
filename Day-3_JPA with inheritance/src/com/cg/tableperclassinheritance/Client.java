package com.cg.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//creating an employee
		Employee e=new Employee();
		e.setName("Najeeb");
		e.setSalary(20000);
		em.persist(e);
		
		Employee e1=new Employee();
		e1.setName("Fathima");
		e1.setSalary(29000);
		em.persist(e1);
		
		//creating manager
		Manager m=new Manager();
		m.setName("Ismail");
		m.setSalary(35000);
		m.setDeptname("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		factory.close();
		
		
		

	}

}