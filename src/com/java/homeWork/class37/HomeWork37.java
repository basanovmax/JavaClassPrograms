package com.java.homeWork.class37;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a program to print the number of days in a given month using If-Else
		Example
		Input - 1,  Output - 31 days
		Input - 2,  Output - 28/29 days
		Input - 3,  Output - 31 days
		Input - 4,  Output - 30 days
		Input - 12, Output - 31 days
		Input - Any other number - Throw the Exception*/
public class HomeWork37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of month");
		int month = sc.nextInt();
		if (month<1 || month>12){
			throw new InputMismatchException("Invalid month");
		}
		else if (month==2){
			System.out.println("This month have 28/29 days");
		}
		else if (month==4 || month==6 || month==9 || month==11){
			System.out.println("This month have 30 days");
		}
		else {
			System.out.println("This month have 31 days");
		}

	}
}
