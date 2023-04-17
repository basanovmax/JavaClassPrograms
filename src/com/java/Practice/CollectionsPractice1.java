package com.java.Practice;
import java.util.*;

public class CollectionsPractice1 {
	public static void main(String[] args) {
		//LIST INTERFACE (ARRAYLIST, LINKEDLIST
		List<String>listOfItems = new ArrayList<String>();
		listOfItems.add("Tomato");
		listOfItems.add("12");
		listOfItems.add("Apple");
		listOfItems.add("121");
		System.out.println(listOfItems.contains(12));
		Collections.sort(listOfItems);
		System.out.println(listOfItems);
		System.out.println(listOfItems.size());
		System.out.println(listOfItems.get(2));

		for (String item : listOfItems){
		System.out.print(item + " ");
		}
		System.out.println();
		for (int i = 0; i < listOfItems.size();i++){
			System.out.print(listOfItems.get(i) + " ");
		}


		System.out.println("=====================");
		//Find maximum number
		List <Integer> num = new ArrayList<>();
		num.add(20);
		num.add(19);
		num.add(15);
		num.add(34);
		num.add(44);
		num.add(23);
		num.add(21);
		num.add(12);

		int max = num.get(0);
		for (int i=1; i < num.size();i++){
			if (max<num.get(i)){
				max= num.get(i);
			}
		}System.out.println(max);


		System.out.println("=================");

		//SET INTERFACE

		Set<String> setOfItems = new HashSet<>();
		setOfItems.add("Tomato");
		setOfItems.add("Banana");
		setOfItems.add("Mango");
		setOfItems.add("Orange");
		setOfItems.add("Pineapple");
		setOfItems.add("Orange");
		setOfItems.add("Banana");

		System.out.println(setOfItems);

		System.out.println(setOfItems.isEmpty());

		//Find duplicate in a given statement

		String str = "It is true that bananas have no bones, and I do like bananas, " +
				"but I like bananas because they are tasty and healthy, not because they have no bones.";

		String[]words = str.split(" ");
		Set<String> setOfWords = new HashSet<>();
		Set<String> duplicateOfWords = new HashSet<>();

		for (String word : words){
			if (setOfWords.add(word)==false){
				duplicateOfWords.add((word));
			}
		}System.out.println("Duplicate words: " + duplicateOfWords); //Duplicate words: [no, like, and, have, I, bananas, because, they]
	}
}
