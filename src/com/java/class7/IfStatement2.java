package com.java.class7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfStatement2 {
    public static void main(String[] args) {

        //write a program that tells me if i am eligible to drive
        //take age from users
        System.out.println("Please enter your age: ");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        //print out older then 16

        if (age > 16) {
            System.out.println("You are eligible to drive");
        }

        if (age <= 16) {
            System.out.println("You are not Eligible to Drive");
        }

        // Write a program that ask weather in fahrenheit
        //if weaher is less then 32 -. printout freezing
        //if weather is more or equal  32 and less than 41
        //if weather is more or equal 42 and less 68 -> it's good weather outside

        System.out.println("What the weather? like?");
        int weather = input.nextInt();

        if (weather < 32){
            System.out.println("It's freezing. Stay home");
        }

        if (weather >= 32 && weather < 41) // don't put ; after statement
        {
            System.out.println("It's really chilly outside");
        }

        if (weather >= 42 && weather < 68)
        {
            System.out.println("Good weather outside");
        }
        if (weather >= 68) {
            System.out.println("Let go to beach");
        }

    }
}
