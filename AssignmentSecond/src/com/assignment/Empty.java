package com.assignment;

import java.util.ArrayList;

public class Empty {

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
		
		// Checking list is empty or not
		if(students.isEmpty())
		{
			System.out.println("List is Empty");
		}
		else
		{
			System.out.println("List is not Empty");
		}
	}

}
