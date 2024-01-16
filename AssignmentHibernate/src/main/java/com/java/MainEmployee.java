  package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainEmployee {

	public static void main(String[] args) {

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setName("Ankit");
		employee.setAge(23);
		employee.setSalary(240000.0);
		employee.setDob("21-11-2000");
		
		session.persist(employee);
		
		transaction.commit();
		
		session.close();
		
		factory.close();
		
	}

}
