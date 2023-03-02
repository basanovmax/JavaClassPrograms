package com.java.class8;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {

    // ex 1:
    //please enter the month in number
    //input: 1
    //output: 31

    // ex 2:
    //please enter the month in number
    //input: 6
    //output: 30

    // ex 3:
    //please enter the month in number
    //input: 2
    //output: 28 or 29


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter month");

        int month = input.nextInt();

        if (month == 1) {
            System.out.println("January has 31 days");
        }
        else if (month == 2) {
            System.out.println("February has 28 days");
        }
        else if (month == 3) {
            System.out.println("March has 31 days");
        }
        else if (month == 4) {
            System.out.println("April has 30 days");
        }
        else if (month == 5) {
            System.out.println("May has 31 days");
        }
        else if (month == 6) {
            System.out.println("June has 30 days");
        }
        else if (month == 7) {
            System.out.println("June has 30 days");
        }
        else if (month == 8) {
            System.out.println("August has 31 days");
        }
        else if (month == 9) {
            System.out.println("September has 30 days");
        }
        else if (month == 10) {
            System.out.println("October has 31 days");
        }
        else if (month == 11) {
            System.out.println("November has 30 days");
        }
        else if (month == 12) {
            System.out.println("December has 31 days");
        }

        //not always, but usually else is used to handle error messages
        else {
            System.out.println("Wrong entry. A number outside of 1 and 12.");
        }

        System.out.println("Please enter month");
        int month1 = input.nextInt();

        if(month1 ==1 || month == 3 || month == 5 || month == 7|| month == 8 || month == 12) {
            System.out.println("31 days");
        }
        else if (month1 ==4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }
        else if (month1 == 2) {
            System.out.println("28 or 29 days");
        }
        else {
            System.out.println("Wrong entry. A number outside of 1 and 12.");
        }
    }
}
