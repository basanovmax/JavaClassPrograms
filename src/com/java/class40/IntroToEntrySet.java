package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntroToEntrySet {
	public static void main(String[] args) {
		Map<String, Integer> salary = new HashMap<>();

		salary.put("Ali", 115);
		salary.put("Madina", 100);
		salary.put("Katerina", 200);
		salary.put("Azat", 175);
		salary.put("Dana", 102);

		Set<Map.Entry<String, Integer>> pairs = salary.entrySet();

		for ( Map.Entry<String, Integer> pair : pairs)  {
			if (!pair.getKey().equals("Ali"))
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
	}
}
