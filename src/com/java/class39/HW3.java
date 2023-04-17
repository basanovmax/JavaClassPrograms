package com.java.class39;

import java.util.*;

/*Task 3: Write a program to print unique words from the Given String
		Example:
		Input - well, collection is very easiest topic in java and it is very useful as well
		Output - collection easiest topic in java and it useful as well*/
public class HW3 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Set<String> setOfWords = new HashSet<>();
			//Take data from user
			System.out.println("Enter any String");
			String str = sc.nextLine().replace(",","");

			String[] arrayOfWords=str.split(" ");
		System.out.println(Arrays.toString(arrayOfWords));

			for (int i = 0; i < arrayOfWords.length;i++){
				if (setOfWords.add(arrayOfWords[i])==false){
					setOfWords.remove(arrayOfWords[i]);
				}
			}
		System.out.println(setOfWords);
		}
	}
	//[as, java, easiest, in, and, topic, collection, it, useful]

