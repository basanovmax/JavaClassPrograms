package com.java.class8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlightProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Welcome to the Delta Air Lines
        Are you travelling from connecting flight(true/false)? false
        Please proceed to the security check
        Enjoy your flight*/

        System.out.println("Welcome to the Delta Air Lines");
        System.out.println("Are you travelling from connecting flight?");
        String isConnecting2 = input.nextLine();

        if (!isConnecting2.equalsIgnoreCase ("yes")){
            System.out.println("Please proceed to the security check");
        }

        // ! - nagating sign only works with booleans
        //it's very useful in if statements

            System.out.println("Enjoy your flight");

        boolean doesHaveDriveLicense = false;

        if (!doesHaveDriveLicense) {
            System.out.println("Give ticket");
        }


    }
}
