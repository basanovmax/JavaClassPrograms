package com.java.class36;
		/*1) Create array of 4 elements
		2) Create String with null value
		3) Access element at 5th position
		4) Find length of null String
		5) Handle the appropriate exception*/


public class InClass {
	public static void main(String[] args) {
		int num[] = {1, 2, 3, 4};
		String word = null;
		try {
			System.out.println(num[5]);
			System.out.println(word.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong number in array");
		} catch (NullPointerException e) {
			System.out.println("Wrong word length");
		} finally {
			System.out.println("I am always executed");
		}

	}
}
