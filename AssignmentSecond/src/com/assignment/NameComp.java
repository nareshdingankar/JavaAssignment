package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NameComp {

	public static void main(String[] args) {
		 Map<String, Integer> student = new HashMap<>();
		 

	        // Add students to the map
	        student.put("Naresh", 24);
	        student.put("Pranav", 24);
	        student.put("Ankit", 23);
	        student.put("Yash", 22);
	        student.put("Saquib", 26);
	        student.put("Shah", 27);
	        student.put("Yash", 26);
	        
	        System.out.println("Original Map");
	        student.forEach((k,v) -> System.out.println(k+"\t"+v));
	        
	        Set<Entry<String,Integer>> entrySet = student.entrySet();
	        
	        List<Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(entrySet);
	        
	        Collections.sort(list, (o1 ,o2) -> o1.getValue().compareTo(o2.getValue()));
	        
	        System.out.println("Map sorted based on Name");
	        
	        list.forEach(s -> {
	        	System.out.println(s.getKey()+ "\t"+s.getValue());
	        });

	}

}
