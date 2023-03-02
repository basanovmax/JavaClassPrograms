package com.java.class8;

import java.util.Scanner;

public class ElseIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //hasLicense
        //speedLimit
        //if hasLicense and speedLimit is less than 80
        // then say Safe Journey

        //if hasLicense and speedLimit is more than 80
        //then give speeding ticket

        //if doesn't have license and speedLimit is less than 80
        //print out tow the car

        //if no license and speed is more than 80
        // call to court

       boolean hasLicense = true;
       int speed = 70;

       //one if statement is like one use case, one scenario from your users (application)
       //as soon as you get a true if or else if statement you execute that statement
        //and jump out of the whole else if group
       if(hasLicense && speed < 80) {
           System.out.println("Have a Safe Journey");
       }

       else if (hasLicense && speed > 80){
           System.out.println("Here is your speeding ticket");
       }

        else if(!hasLicense && speed < 80) {
            System.out.println("We have to tow your car");
        }

        else {
            System.out.println("You must appear in the court");
        }

        //coding standard is :
        //usually the pairs go as
        //if
        //one or more else ifs
        //else


        //else means none if above if statement were true

    }
}
