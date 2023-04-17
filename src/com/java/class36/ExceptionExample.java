package com.java.class36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers");


		try {
			int num1 = input.nextInt(), num2=input.nextInt();
			System.out.println(num1 / num2);
		}
		catch(InputMismatchException e) {
			System.out.println("Please try after hangover, enter number");
		}
		catch(ArithmeticException e) {
			System.out.println("Please study Math, We can not divide by zero");
		}
		catch(Exception e) {
			System.out.println("Something went wrong! Please try after sometime");
		}

		System.out.println("Welcome to the party");
		System.out.println("Enjoy your dinner");
	}
}
