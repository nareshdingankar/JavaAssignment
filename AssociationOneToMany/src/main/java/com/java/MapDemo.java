package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class MapDemo {

    private static final SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Department.class)
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

    public static void main(String[] args) {
        // Creating instances and saving to the database
        saveDataToDatabase();
    }

    private static void saveDataToDatabase() {
        // Creating a new department with employees
        Department department = new Department();
        department.setName("Software Engineer");

        Employee employee1 = new Employee();
        employee1.setName("Pranav");
        employee1.setAge(24);
        employee1.setExperience("1 year");
        employee1.setDepartment(department);

        Employee employee2 = new Employee();
        employee2.setName("Naresh");
        employee2.setAge(24);
        employee2.setExperience("2 years ");
        employee2.setDepartment(department);
        
        Employee employee3 = new Employee();
        employee3.setName("Ankit");
        employee3.setAge(23);
        employee3.setExperience("1.5 years");
        employee3.setDepartment(department);
        
        Employee employee4 = new Employee();
        employee4.setName("Sushil");
        employee4.setAge(24);
        employee4.setExperience("3 years");
        employee4.setDepartment(department);

        department.setEmployees(Arrays.asList(employee1, employee2, employee3, employee4));

        // Save the department and associated employees
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            session.persist(department);

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
