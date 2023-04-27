package com.java.Practice;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
	public static void main(String[] args) {
// Write a program to find frequency of each character from String

		String str ="this is my first java collection class and it is easy";

		Map<Character, Integer> frequency = new HashMap<>();

		for (int i = 0; i < str.length(); i++){
			char currentChar = str.charAt(i);
			if (frequency.containsKey(currentChar)){
				int preFrequency = frequency.get(currentChar);
				System.out.println(str.charAt(i) + " " + frequency.get(currentChar));
				frequency.put(currentChar,preFrequency+1);
				System.out.println("if " + frequency + " " + frequency.put(currentChar,preFrequency+1));
			}else {
				frequency.put(currentChar, 1);
				System.out.println("else " + frequency + " "  +  frequency.put(currentChar, 1));
			}
		}
		System.out.println(frequency);
	}
}
