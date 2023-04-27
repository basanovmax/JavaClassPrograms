package com.java.Practice;

import java.util.*;

public class PracticeMap {
	public static void main(String[] args) {
/*		Map<String, String> fifa= new HashMap<>();
		fifa.put("Belgium", "Eden Hazard");
		fifa.put("Brazil", "Thiago Silva");
		fifa.put("Denmark", "Cristiano Ronaldo");
		fifa.put("USA", "Christian Pulisic");
		fifa.put("Australia", "Mathew Ryan");
		fifa.put("Wales", "Gareth Bale");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter football player name");
		String name = sc.nextLine();

		for (int i = 0; i < fifa.size(); i++){
			if (fifa.get(name).equals(name)){
				System.out.println(fifa.get(name));
			}
		}*/

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

/*		Set<Map.Entry<String, Integer>> pairs = salary.entrySet();
		int greatS = 0;
		String name = "";
		for (Map.Entry<String, Integer> greatsalary : pairs){
			if (greatsalary.getValue() > greatS){
				greatS = greatsalary.getValue();
				name = greatsalary.getKey();
			}
		}System.out.println(greatS + " " + name);*/

		Set<Map.Entry<String, Integer>> count = salary.entrySet();

	}
}
