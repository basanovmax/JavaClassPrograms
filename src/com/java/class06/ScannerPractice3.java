package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Username: ");
        String userName = input.next();

        System.out.println("Password: ");
        String userPassword = input.next();

                                                            //Another
        boolean nameAndPassword = userName.equalsIgnoreCase("best@devx.com") && userPassword.equals("Fall2022");

        System.out.println("Your login and password is " + nameAndPassword);

        //
    }
}
