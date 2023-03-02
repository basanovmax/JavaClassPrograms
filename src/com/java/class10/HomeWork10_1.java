package com.java.class10;

import java.util.Scanner;

public class HomeWork10_1 {
    public static void main(String[] args) {

        /* Nested If homework 2:
Write a program for online shopping website:
An online shopping website uses a nested if statement to determine the shipping cost for an order based on the weight of the order and the shipping destination.
Take user inputs for:
double weight, destination.
- If the weight of the order is less than 2 lbs and the shipping destination is within the United States, the shipping cost is $5.

- If the weight of the order is 2 lbs or more and the shipping destination is within the United States, the shipping cost is
calculated based on the weight of the order. users pay 50 cents per lbs.

- If the shipping destination is outside the United States, the shipping cost is calculated based on the weight of the order at special rate. $1.5 per lbs.


Example output 1:
Please  Enter weight of your item in lbs
1
Please enter shipping country:
United States
Your shipping cost is $5

Example output 2:
Please  Enter weight of your item in lbs
20
Please enter shipping country:
United States
Your shipping cost is $10

Example output 3:
Please  Enter weight of your item in lbs
10
Please enter shipping country:
Canada
Your shipping cost is $15  */


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter shipping country:");
        String country = sc.nextLine();

        System.out.println("Please  Enter weight of your item in lbs");
        double weight = sc.nextDouble();




        if (country.equalsIgnoreCase("United States") || country.equalsIgnoreCase("USA") && weight >= 0 && weight < 2) {
            System.out.println("Your shipping cost is $5");
        }
        else if (country.equalsIgnoreCase("United States") || country.equalsIgnoreCase("USA") && weight >= 2){
            System.out.println("Your shipping cost is $" + (weight * 0.5));
        }
        else if (weight < 0) {
            System.out.println("Incorrect weight");
        }
        else {
            System.out.println("Your shipping cost is $" + (weight*1.5));
        }
    }
}
