package com.java.class39;

import java.util.*;

public class HomeWork1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		//Take data from user
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5; i++){
			numbers.add(sc.nextInt());
		}
		// Sort the data and print
		Collections.sort(numbers);
		System.out.println(numbers);

	}
}
