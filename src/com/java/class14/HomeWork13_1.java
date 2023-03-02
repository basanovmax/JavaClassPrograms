package com.java.class14;

import java.util.Scanner;

public class HomeWork13_1 {
    public static void main(String[] args) {
        /*Homework 1:
Write a method that takes a string and returns true if the string starts with “hi” and false otherwise. */

        Scanner input = new Scanner(System.in);
        System.out.println("Type sentence with or without starting hi");
        String sentence = input.nextLine();
        System.out.println(isStartWithHi(sentence));

    }
    public static boolean isStartWithHi(String str) {
        return str.substring(0,2).equalsIgnoreCase("hi");
    }
}
