package com.java.class18;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i >= 5);

        Scanner sc = new Scanner(System.in);

        String choice = "";
        do {
            System.out.println("Please enter first number");

            int num1 = sc.nextInt();

            System.out.println("Please enter second number");
            int num2 = sc.nextInt();

            System.out.println("Please enter operation you want to perform");
            String operation = sc.next();
            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "sub":
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "mul":
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "div":
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Please enter valid operation");
            }
            System.out.println("Would you like to do more operation? (Yes/No)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        //Write a program to take one number from user and print square of it &
        //Continue of program till user enters no

        System.out.println("Enter number");
        int number = sc.nextInt();
        int result = 0;
        String res = "";

        do {
            result = number * number;
            System.out.println(result);
            System.out.println("Would you like to do more operation? (Yes/No)");
            res = sc.next();
        }
        while (res.equalsIgnoreCase("yes"));

    }
}




