package com.assignment;

import java.util.Comparator;
import java.util.Map;

class Student {
	
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class NameComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
        return entry1.getKey().compareTo(entry2.getKey());
    }
}