package com.java.Practice;

import java.util.Scanner;

/* We have a loud talking parrot. Create a function that will tell us if
we are in trouble or not based on the hour and based on if the parrot is talking.

The "hour" is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is
before 7 or after 20. Return true if we are in trouble. */
public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary");
        double annualSalary= input.nextDouble();

        double tax = calculateTax(annualSalary);
        System.out.println("Your tax is $" + tax);


        Travel("Italy");
        Travel("German");
        Travel("London");
        Travel("USA");
    }
    public static double calculateTax(double annualSalary){
        if(annualSalary>0 || annualSalary<= 100000) {
            return annualSalary*0.1;
        }
        else {
            return annualSalary*0.15;
        }
    }

    public static void Travel(String destination) {
        System.out.println("I want to travel to " + destination);
    }

}
