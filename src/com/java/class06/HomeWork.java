package com.java.class06;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        boolean LogIn = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Type email username: ");
        String userName = input.next();

        System.out.println("Type Password: ");
        String Password = input.next();

        System.out.println("Type your location: ");
        String LoginLocation = input.next();

        if (userName.equalsIgnoreCase("steve@apple.com") && Password.equals ("infinityLoop1")
                && LoginLocation.equalsIgnoreCase("california")) {

            System.out.println("You log in");
        } else {
            System.out.println("You log out");

        }
    }
}
