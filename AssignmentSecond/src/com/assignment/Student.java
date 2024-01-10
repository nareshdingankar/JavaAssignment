package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

	// Creating fields
	 int id;
	 String name;
	 int age;
	 String dateOfJoining;
	
	// Constructor
	public Student(int id, String name, int age, String dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}

	
    // toString
	@Override
	public String toString() {
		return "StudentExe [id=" + id + ", name=" + name + ", age=" + age + ", dateOfJoining=" + dateOfJoining + "]";
	}



	public static void main(String[] args) {
	
		// Creating objects of students
		Student sa = new Student(1, "Naresh", 24, "23-04-2022");
		Student sb = new Student(2, "Yash", 22, "10-08-2023");
		Student sc = new Student(3, "Ankit", 23, "09-07-2022");
		
		// Creating List of Students
		List<Student> students = new ArrayList<Student>();
		
		students.add(sa);
		students.add(sb);
		students.add(sc);
		
		// Iterating List
		Iterator<Student> itr = students.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}


