package com.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NamedComparator {
	
		public static void main(String[] args) {
	        Map<String, Integer> student = new HashMap<>();

	        // Add students to the map
	        student.put("Naresh", 24);
	        student.put("Pranav", 24);
	        student.put("Ankit", 23);
	        student.put("Yash", 22);
	        student.put("Saquib", 26);
	        student.put("Shahnawaz", 27);
	        student.put("Yash", 26);


	        // Create a list of map entries
	        List<Map.Entry<String, Integer>> stud = new ArrayList<>(student.entrySet());

	        // Use NameComparator to sort the list
	        stud.sort(new NameComparator());

	        // Display the sorted names
	        for (Map.Entry<String, Integer> entry : stud) {
	            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
	        }
	    }
}
