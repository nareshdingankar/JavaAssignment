package com.assignment;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeKey {

	public static void main(String[] args) {
		
		        // Create a map with String keys and Integer values
		        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		        
		        map.put(101, "Java");
		        map.put(102, "Python");
		        map.put(103, "Angular");
		        map.put(104, "SpringBoot");
		        map.put(105, "JavaScript");

		        // Display the original map
		        System.out.println("Original Values: "+map);


		        // Take user input for the key to search
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter key to search: ");
		        int keyToSearch = scanner.nextInt();
		        
		        // Search for a key
		        if (map.containsKey(keyToSearch)) {
		        	 String value = map.get(keyToSearch);
		            System.out.println("Key '"+keyToSearch+"' is found with " +value);
		        } else {
		            System.out.println("Key '"+keyToSearch+"' is not found");
		        }
		    }
		

	}


