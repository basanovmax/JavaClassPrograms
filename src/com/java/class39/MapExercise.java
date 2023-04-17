package com.java.class39;

import com.java.class36.InClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercise {
	public static void main(String[] args) {
		Map<String, Integer> markOfStudents = new HashMap<>();
		markOfStudents.put("Maxim", 2);
		markOfStudents.put("Diana", 4);
		markOfStudents.put("Ali", 3);
		markOfStudents.put("Mustafa", 1);
		markOfStudents.put("Emily", 5);

		System.out.println(markOfStudents);
		System.out.println(markOfStudents.containsValue(5));
		System.out.println(markOfStudents.size());
		System.out.println(markOfStudents.containsKey("Ali"));

	}
}
