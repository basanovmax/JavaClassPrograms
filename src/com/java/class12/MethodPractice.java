package com.java.class12;

import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        //Create a function that return true or false and will let us know if we can sleepIn.
        //it should take 2 params - one to know if's a weekday
        //another param to know if it's a vacation.
        // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        boolean result = canWeSleepIn(4, true);
        System.out.println(result);

    }
    public static boolean canWeSleepIn(int dayOfWeek, boolean isOnVacation) {

        if (isOnVacation) {
            return true;

        }
        else {
            if (dayOfWeek <= 5) {
                return false;

            } else if (dayOfWeek == 6 || dayOfWeek == 7) {
                return true;


            } else {
                return false;

            }

        }


    }
}