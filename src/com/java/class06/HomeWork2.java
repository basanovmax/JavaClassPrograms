package com.java.class06;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your age: ");
        int Age = input.nextInt();

        System.out.println("Type your creditscore: ");
        int CreditScore = input.nextInt();

        System.out.println("Are you married? Type Yes or No: ");
        String Married = input.next();

        if (Age > 25 && CreditScore > 700 && Married.equalsIgnoreCase("Yes")) {

            System.out.println("You are approved");
        } else {
            System.out.println("Try later");

        }


    }
}
