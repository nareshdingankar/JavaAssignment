package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SortByName {

	public static void main(String[] args) {
		
		Map<Integer, String> emp = new HashMap<>();
		
		emp.put(101, "Naresh");
		emp.put(102, "Pranav");
		emp.put(103, "Raj");
		emp.put(104, "Ankit");
		emp.put(105, "Sourabh");

		System.out.println("Original Map:-");
		emp.forEach((k,v)->System.out.println(k+"\t"+v));
		
		Set<Entry<Integer, String>> entrySet = emp.entrySet();
		
		List<Entry<Integer, String>> list = new ArrayList<>(entrySet);
		
		Collections.sort(list, new NameComparator());
		
		System.out.println("Sorted Map By Name:-");

		list.forEach(s ->{
			System.out.println(s.getKey()+"\t"+s.getValue());
		});
	}

}
