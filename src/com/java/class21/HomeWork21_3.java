package com.java.class21;

import java.util.Scanner;

public class HomeWork21_3 {
    public static void main(String[] args) {
        /*3. Write a program to check given number is palindrome or not
                Example1
        Input - 1221
        Output - Palindrome
        Example2
        Input - 122321
        Output - Not Palindrome*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int rev = 0;
        int b = num;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (b == rev) {
            System.out.println(b + " is Palindrome");
        } else {
            System.out.println(b + " Not Palindrome");
        }
    }

}

