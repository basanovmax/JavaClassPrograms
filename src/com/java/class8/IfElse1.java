package com.java.class8;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        boolean doesHaveLicense = true;


        // 1-st goal is make sure the program works fine for the customers
        //2-nd goal is make sure the program is written in a most
        //space (memory) and performance (speed) efficient way.



        // program checks this if statement
        if (doesHaveLicense) {
            System.out.println("Have a safe trip");
        }
        //regardless of the result of first if statement
        //the program will come and check this statement as well
        // so the program actually spends time for this if statement

        //i have to write the logic twice -> there is a high possibility you can get one of the logic wrong
        if (!doesHaveLicense) {
            System.out.println("Here is your ticket");
        }

        //program will check if statement
        //if true - execute the if statement
        //if false program jumps to else  and execute the body of else. the program
        //doesn't

        if (doesHaveLicense){
            System.out.println("Have a a safe trip");
        }
        else {
            System.out.println("Here is your ticket");
        }


        // if user has a license ans speed less than 80 m/hr

        boolean hasLicense = true;
        int speed = 70;

        if (hasLicense && speed < 80) {
            System.out.println("have a safe journey");
            System.out.println("Be careful it's snowing today");
        }

        // is there anything you want the program to do
        //if the if statement above is false?
        // if yes then add an else statement
        else {
            System.out.println("Get ticket 2");
            System.out.println("Please obey the rules");
        }


        /* Write a program to get the salaries of two-person and print the name of the person that has a greater salary


        Example 1
        Person 1: 1200
        Person 2: 2500
        Output: 2500

        Example 2:
        Person 1: 4500
        Person 2: 8600
        Output: 8600 */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Bill Gates salary: ");

        double bill = input.nextDouble();

        System.out.println("Please enter Ilon Mask salary : ");

        double mask = input.nextDouble();

        if (bill > mask) {
            System.out.println("Bill Gates salary is higher than Ilon Mask. It is  " + "$" + bill);
        }
        else {
            System.out.println("Ilon Mask salary is higher than Bill Gates. It is " + "$" + mask);
        }





    }
}
