package com.java.homeWork.class36;
		/*Create a class & take two integer values from the user
		Perform division operation & handle the appropriate Exception
		Create a String variable with a null value
		Find the length of the null variable and handle the appropriate Exception
		Create an array of five integers
		Access the element at the fifth position
		Handle the appropriate Exception*/

import java.util.Scanner;

public class HomeWork36 {
	public static void main(String[] args) {
		String homeWork=null;
		int [] homeWorkArray = new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 digit");
		int digit1 = input.nextInt();
		System.out.println("Enter 2 digit");
		int digit2 = input.nextInt();
		try {
			System.out.println(digit1/digit2);
		} catch (ArithmeticException AE){
			System.out.println("You can't divide by zero");
		}
		try {
			System.out.println(homeWork.length());
		}
		catch (NullPointerException NE){
			System.out.println("Word index is Out Of Bounds");
		}
		try {
			System.out.println(homeWorkArray[5]);
		}
		catch (ArrayIndexOutOfBoundsException AE){
			System.out.println("Index of array is Out Of Bounds");
		}
	}
}
