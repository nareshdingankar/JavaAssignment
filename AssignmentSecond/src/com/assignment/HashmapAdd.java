package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class HashmapAdd {

	public static void main(String[] args) {

		// Creating Hashmap
		HashMap<String, String> map = new HashMap<String, String>();
		
		// Putting Values
		map.put("Naresh", "Parel");
		map.put("Yash", "Dombivali");
		map.put("Pranav", "Borivali");
		map.put("Ankit", "Andheri");
		map.put("Sourabh", "Airoli");
		
		// iterating list
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+ " " + m.getValue());
		}

	}

}
