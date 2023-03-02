package com.java.class12;

import java.util.Scanner;

public class HomeWork12_2 {
    public static void main(String[] args) {
        /* 3.   Create a method that takes a boolean indicating whether someone is a member of a loyalty program
        and a double representing the cost of a purchase,
        and returns a double representing the final cost
        of the purchase after applying a discount.
        If the customer is a loyalty customer apply 10% discount.*/


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter purchase cost");
        double totalCost = input.nextDouble();
        System.out.println("Are you loyalty member? Choose true or false");
        boolean isLoyaltyMember = input.nextBoolean();

        double cost = finalCost(totalCost, isLoyaltyMember);
        System.out.println("Your final price with 10% discount is " + cost + "$");
    }

    public static double finalCost(double purchase, boolean isMember) {
        if (isMember) {
            return (purchase - (purchase * 0.10));

        } else {
            return purchase;
        }

    }
}

