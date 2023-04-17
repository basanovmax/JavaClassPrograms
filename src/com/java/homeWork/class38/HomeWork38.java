package com.java.homeWork.class38;

import java.util.*;

public class HomeWork38 {
	public static void main(String[] args) {
		//Task 1: Write a program to get five numbers from the user and sort them in ascending order using the list

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();

		List<Integer> listOfNum = new ArrayList<>();
		listOfNum.add(num1);
		listOfNum.add(num2);
		listOfNum.add(num3);
		listOfNum.add(num4);
		listOfNum.add(num5);
		System.out.println("Original numbers " + listOfNum);
		Collections.sort(listOfNum);
		System.out.println("Sort them in ascending order " + listOfNum);
		System.out.println("========================");
		/*Task 2: Write a program to get five numbers from the user and print all numbers in reverse sequence
		Example:
		Input -  45, 67, 23, 12, 43
		Output - 43, 12, 23, 67, 45*/

		List<Integer> listOfNum1 = new ArrayList<>();

		listOfNum1.add(num1);
		listOfNum1.add(num2);
		listOfNum1.add(num3);
		listOfNum1.add(num4);
		listOfNum1.add(num5);
		System.out.println("Original numbers " + listOfNum1);
		Collections.reverse(listOfNum1);
		System.out.println("Reverse numbers " + listOfNum1);

		/*Task 3: Write a program to print unique words from the Given String
		Example:
		Input - well, collection is very easiest topic in java and it is very useful as well
		Output - collection easiest topic in java and it useful as well*/

		String str = "well , collection is very easiest topic in java and it is very useful as well";
		String[] splitWords = str.split(" ");

		Set<String> uniqueWords = new HashSet<>();
		for (String result : splitWords) {
			if (uniqueWords.add(result))

			System.out.print(result + " ");
		}
	}
}




