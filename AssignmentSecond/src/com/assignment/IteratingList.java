package com.assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingList {

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

		// Iterating List
		Iterator<String> itr = students.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
