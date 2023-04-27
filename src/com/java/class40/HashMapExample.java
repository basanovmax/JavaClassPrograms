package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		// Write a program to find frequency of each character from String
		String str = "this is myfirstjavacollectionclassanditiseasy";
		Map<Character, Integer> CharFreq = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char currentChar = str.charAt(i);
			if (CharFreq.containsKey(currentChar)) {
				int preFrequency = CharFreq.get(currentChar);
				CharFreq.put(currentChar, preFrequency + 1);
			} else {
				CharFreq.put(currentChar, 1);
			}
		}
		System.out.println(CharFreq);
		System.out.println("======================");

		// Find out Char the greatest frequency

		Set<Map.Entry<Character, Integer>> pairs = CharFreq.entrySet();
		int max = Integer.MIN_VALUE;
		char maxChar = 0;
		for (Entry<Character, Integer> pair : pairs) {
			if (pair.getValue() > max) {
				max = pair.getValue();
				maxChar = pair.getKey();
			}
		}
		System.out.println(max);
		System.out.println(maxChar);
	}
}


