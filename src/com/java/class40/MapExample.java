package com.java.class40;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer>students = new HashMap<>();
		students.put("Max",2);
		students.put("Diana", 4);
		students.put("Mustafa", 1);
		students.put("Emily", 6);
		students.put("Ali", 8);

		Set<String> keys = students.keySet();
		for(String key : keys) {
			System.out.println(key + " = " + students.get(key));
		}

		Collection<Integer> values = students.values();
		for (Integer value : values){
			System.out.println(value);
		}
	}
}
