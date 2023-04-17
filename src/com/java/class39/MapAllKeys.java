package com.java.class39;

import java.util.*;

public class MapAllKeys {
	public static void main(String[] args) {

		Map<String, Integer> ageOfPeople = new HashMap<>();

		ageOfPeople.put("Dana", 43);
		ageOfPeople.put("Azat", 23);
		ageOfPeople.put("Aidai", 33);
		ageOfPeople.put("Maxim", 37);
		ageOfPeople.put("Taira", 15);
		ageOfPeople.put("Madina", 18);

		//Print all keys from map
	 	Set<String> keys = ageOfPeople.keySet();
		for (String key: keys){
			System.out.println(key + " = " + ageOfPeople.get(key));
		}
		Collection<Integer> values = ageOfPeople.values();

		// Print all values from the map
		for (int value : values){
			System.out.println(value);
		}
	}
}
