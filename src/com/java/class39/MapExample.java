package com.java.class39;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> ageOfPeople = new HashMap<>();

		ageOfPeople.put("Dana", 43); //1
		ageOfPeople.put("Azat", 23);
		ageOfPeople.put("Aidai", 33);
		ageOfPeople.put("Maxim", 37);
		ageOfPeople.put("Taira", 15);
		ageOfPeople.put("Madina", 18);
		ageOfPeople.put("Dana", 1);
		System.out.println(ageOfPeople);
		System.out.println(ageOfPeople.get("Dana"));
		System.out.println(ageOfPeople.size());
		System.out.println(ageOfPeople.isEmpty());
		System.out.println(ageOfPeople.containsKey("Dana"));
		System.out.println(ageOfPeople.containsValue(23));



	}
}
