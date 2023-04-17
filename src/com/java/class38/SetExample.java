package com.java.class38;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
	Set<String> fruits = new HashSet<>();

	fruits.add("mango");
	fruits.add("apple");
	fruits.add("potato");
	fruits.add("banana");

	fruits.add("apple");
	fruits.add("mango");
	fruits.add("banana");
	fruits.add("potato");


	for (String fruit : fruits){
		System.out.println(fruit);
	}
	}
}
