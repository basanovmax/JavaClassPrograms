package com.java.class21;

import java.util.Scanner;

public class HomeWork21_1 {
    public static void main(String[] args) {
        /*  1. Write a program to count the number of vowels from the String (Ignoring Case)
        Example
        Input - Welcome to Java Class
        Output - Num of vowels=7*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.nextLine();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y') {
                vowels++;
            }
            else
                consonants++;
        }System.out.println("Num of vowels= " + vowels);
        System.out.println("Num of consonants including spaces= " + consonants);

    }
}
