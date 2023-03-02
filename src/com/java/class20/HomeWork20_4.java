package com.java.class20;

import java.util.Scanner;

public class HomeWork20_4 {
    public static void main(String[] args) {
        /* 4.  Write a program to print the greatest digit from the given number
        Example1
        Input - 86545
        Output - Greatest digit is 8
        Example2
        Input - 23561
        Output - Greatest digit is 6 */
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int large = 0;
        while (num>0) {
                if (large<num%10) {
                large = num%10;
                } num = num/10;
        } System.out.println("Largest number is " + large);

    }
}
