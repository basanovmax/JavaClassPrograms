package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork40 {
	public static void main(String[] args) {
/*		=========Homework 24 April ===========
		Write a program to store the FIFA world cup team and captains in the HashMap & Print team based on the captain value entered by the user
		Example Data
		Team		   Captain
		----------	        --------------
				Argentina	Lionel Messi
		Belgium		Eden Hazard
		Brazil		Thiago Silva
		Denmark	Simon Kjaer
		Portugal	        Cristiano Ronaldo
		USA		Christian Pulisic
		Australia	        Mathew Ryan
		Wales		Gareth Bale
		Example Input - Lionel Messi
		Output - Argentina*/


		Map<String, String> fifa= new HashMap<>();
		fifa.put("Belgium", "Eden Hazard");
		fifa.put("Brazil", "Thiago Silva");
		fifa.put("Denmark", "Cristiano Ronaldo");
		fifa.put("USA", "Christian Pulisic");
		fifa.put("Australia", "Mathew Ryan");
		fifa.put("Wales", "Gareth Bale");

		Set<Map.Entry<String, String>> fifaPairs = fifa.entrySet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter football player name");
		String name = sc.nextLine();
		for (Map.Entry<String, String> pair: fifaPairs)
		if (pair.getValue().equals(name)){
			System.out.println(pair.getValue() + " is play for " + pair.getKey());
		}

	}
}
