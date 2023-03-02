package com.java.class11;

import java.util.Scanner;

public class homeWork11_2 {
    public static void main(String[] args) {

       /* 2. Write a program that takes an operator (e.g., “+”, “-”, “*”, “/”) and two integers as input,
       and outputs the result of the operation.
       Use a switch statement to implement this program. Make sure to consider the possibility
       of division by zero, and any other edge cases.
        Sample outputs for input "+ 2 3" would be "5", input "/ 6 2" would be "3", input "* 7 8" would be "56",
        if we have edge case input "/ 5 0" would be "division by zero is not allowed" or similar message*/


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first whole integer");
        double num1 = input.nextDouble();


        System.out.println("Enter operator (e.g., “+”, “-”, “*”, “/”)");
        String operator = input.next();

        System.out.println("Enter second whole integer");
        double num2 = input.nextDouble();

        if (num1 == 0 || num2 == 0) {
            System.out.println("division by zero is not allowed");

        } else {
            switch (operator) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1*num2);
                    break;
                case "/":
                    System.out.println(num1/num2);
                    break;
                default:
                    System.out.println("Wrong operator");

            }
        }
    }
}