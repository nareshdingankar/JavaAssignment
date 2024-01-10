package com.assignment;

import java.util.ArrayList;

public class CopyArray {

	public static void main(String[] args) {
		
		// Creating ArrayList
		ArrayList<String> students = new ArrayList<String>();

		// Adding data
		students.add("Naresh");
		students.add("Pranav");
		students.add("Yash");
		students.add("Ankit");
		students.add("Sushil");
		students.add("Sourabh");
		
		ArrayList<String> stud = new ArrayList<String>();
		
		// Adding list into another list
		stud.addAll(students);
		
		System.out.println(stud);

	}
}
