package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
	public static void main(String[] args) {
		Map<String, Integer> salary = new HashMap<>();
		salary.put("Dana", 2400);
		salary.put("Chirag", 2000);
		salary.put("Azat", 6000);
		salary.put("Emily", 1500);
		salary.put("Chirag", 7200);
		salary.put("Aizhan", 6700);
		salary.put("Madina", 7400);
		salary.put("Milana", 1800);

		//1.Print employee name who is taken greatest salary
		Set<Map.Entry<String, Integer>> pairs = salary.entrySet();
		int greatS = 0;
		String name = "";
		for (Map.Entry<String, Integer> pair : salary.entrySet()) {
			if (pair.getValue() > greatS) {
				greatS = pair.getValue();
				name = pair.getKey();
			}
		}
		System.out.println(greatS + " " + name);

		System.out.println("============================");

		// Write a program to find total salary given to all employee from company
		int total = 0;
		for (Map.Entry<String, Integer> totalSalary : salary.entrySet()) {
			total = total + totalSalary.getValue();
		}
		System.out.println("Total salary is " + total);

		System.out.println("============================");

		// Print all employees name whose salary is greater that or equal to avg salary all employee
		int avg = total / salary.size();
		System.out.println("avg salary is " + avg);
		int avggr = 0;
		String name1 = "";
		for (Map.Entry<String, Integer> avgSalary : salary.entrySet()) {
			if (avgSalary.getValue() > avg) {
				avggr = avgSalary.getValue();
				name1 = avgSalary.getKey();
				System.out.println(name1 + " " + avggr);
			}
		}
		System.out.println("============================");
		// Print all employees salary after incrementing all salary by 20%

		for (Map.Entry<String, Integer> salaryIncrease : salary.entrySet()) {
			System.out.println((salaryIncrease.getValue() * 1.2) + " " + salaryIncrease.getKey());
		}
	}

}

