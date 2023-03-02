package com.java.class11;

import java.sql.SQLOutput;
import java.util.Scanner;

public class homeWork11_1 {
    public static void main(String[] args) {
        /*Write a program that takes a day of the week as input (e.g., “Monday”), and outputs the number
        of days until the next weekend (i.e., either Saturday or Sunday).
        Use a switch statement to implement this program.
        Sample outputs for input "Monday" would be "5" and input "Friday" would be "2"*/

        Scanner word = new Scanner(System.in);

        System.out.println("Type any day (Monday-Sunday)");
        String day = word.nextLine();

        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("5 days to Weekend");
            break;
            case "tuesday":
                System.out.println("4 days to Weekend");
                break;
            case "wednesday":
                System.out.println("3 days to Weekend");
                break;
            case "thursday":
                System.out.println("2 days to Weekend");
                break;
            case "friday":
                System.out.println("1 days to Weekend");
                break;
            case "saturday":
                System.out.println("It is WEEKEND!!!");
                break;
            case "sunday":
                System.out.println("It is WEEKEND!!!");
                break;
            default:
                System.out.println("Incorrect day");
                break;

        }

    }
}
