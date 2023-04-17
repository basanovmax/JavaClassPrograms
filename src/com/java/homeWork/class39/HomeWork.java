package com.java.homeWork.class39;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork {
/*	Task 1: Write a program to print unique words from the Given String
			Input - well, collection is very easiest topic in java and it is very useful as well
			Output - collection easiest topic in java and it useful as well
			Logic hint: Create a two set with one set holding all the words and the second set will hold duplicate words and then do set1 - set2
			*/

	public static void main(String[] args) {
		String unique = "well, collection is very easiest topic in java and it is very useful as well";
		String [] uniqueArray = unique.replace(",", "").split(" ");

		Set<String> setAllWords= new HashSet<>();
		Set<String> setUnique = new HashSet<>();
		for (int i = 0; i< uniqueArray.length;i++){
			if (setAllWords.add(uniqueArray[i])==true){
				setAllWords.add(uniqueArray[i]);
			}
			else {
				setUnique.add(uniqueArray[i]);
			}
		}

		System.err.println("This words are duplicates " + setUnique);
		setAllWords.removeAll(setUnique);
		System.err.println( "This words are unique " +setAllWords);







	}
}
