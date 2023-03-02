package com.java.class12;

import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you height in meters");
        double userHeight = input.nextDouble();

        double feetMeter = heightFeet(userHeight);
        double inchMeter =heightInch(userHeight);
        System.out.println("Your height in feet is "+feetMeter);
        System.out.println("Your height in inch is "+inchMeter);

    }

    /*1. Create a method that takes a person's height as a double (in meters)
         and returns their height in feet and inches. Google the formula. */
    public static double heightFeet(double meters) {
        double feet = meters * 3.28084;
        return feet;
    }

    public static double heightInch (double meters) {
        double inch = meters * 39.3701;
        return inch;
    }
}


