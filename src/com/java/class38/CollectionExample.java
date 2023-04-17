package com.java.class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List<Integer> listOfNum = new ArrayList<>();
		//Store data into the list
		listOfNum.add(40);
		listOfNum.add(60);
		listOfNum.add(50);
		listOfNum.add(65);
		listOfNum.add(2,3);

		System.out.println(listOfNum.contains(60)); //true
		System.out.println(listOfNum.isEmpty());




		Collections.sort(listOfNum);
		Collections.reverse(listOfNum);
		System.out.println(listOfNum);





		List<String> fruits=new ArrayList<>();
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("apple");

		 if(fruits.contains("banana")){
			 fruits.remove("mango");
		 }
		System.out.println(fruits);

	}



}
