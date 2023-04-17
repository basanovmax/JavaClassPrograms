package com.java.homeWork.class39;

import java.util.HashMap;
import java.util.Map;

public class HomeWork3 {
	/*Task 2: Write a program to print the frequency of each character from the String -
		Do not use direct method from the Collections class
		Example
			 Input - This is my collection program
		Output - { =4, a=1, c=2, e=1, g=1, h=1, i=3, l=2, m=2, n=1, o=3, p=1, r=2, s=2, t=2, y=1}*/
	public static void main(String[] args) {
		String str = "This is my collection program";
		Map<Character, Integer> freqChar = new HashMap<>();
		for (int i = 0; i < str.length();i++){
			if (freqChar.containsKey(str.charAt(i))){
				freqChar.put(str.charAt(i),freqChar.get(str.charAt(i))+1);
			}
			else {
				freqChar.put(str.charAt(i),1);
			}
		}
		System.out.println(freqChar);
	}
}
