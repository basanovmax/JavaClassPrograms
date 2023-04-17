package com.java.homeWork.class39;

import java.util.*;

public class HomeWork2 {
	public static void main(String[] args) {
		/*Task 2: Write a program to print the frequency of each character from the String -
		Do not use direct method from the Collections class
		Example
			 Input - This is my collection program
		Output - { =4, a=1, c=2, e=1, g=1, h=1, i=3, l=2, m=2, n=1, o=3, p=1, r=2, s=2, t=2, y=1}*/

		String str = "This is my collection program";
		Map<Character,Integer>CharFreq = new HashMap<>();
		for (int i=0; i < str.length()-1;i++){
			if (CharFreq.containsKey(str.charAt(i))==true){
				CharFreq.put(str.charAt(i),CharFreq.get(str.charAt(i))+1);
			}
			else {
				CharFreq.put(str.charAt(i),1);
			}
		}
		System.out.println(CharFreq);
	}
}
