package com.java.class14;

import java.util.Scanner;

public class HomeWork13_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type string length will be at least 2");
        String sentence1 = input.nextLine();
        String twoLastChars = twoChars(sentence1);
        System.out.print(twoLastChars);
    }

    /* Homework 2:
    Write a method that takes a string
    returns a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.
    extraEnd(“Hi”) → “HiHiHi”
    extraEnd(“Hello”) → “lololo”
    extraEnd(“ab”) → “ababab */
    public static String twoChars (String str){
        String str1 = str.substring(str.length() -2);
        return str1.concat(str1).concat(str1);

    }
}
