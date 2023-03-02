package com.java.class20;

import java.util.Scanner;

public class HomeWork20_3 {
    public static void main(String[] args) {

        /*3. Write a program to print the sum of each digit from the given number
        Example1
        Input - 3521
        Output - 11
        Example2
        Input - 5390
        Output - 17*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum =0;
        while (num > 0) {
            sum = sum + num%10; //remove one digit from number
            num = num/10;
        }
        System.out.println("Sum of digits: " + sum);

    }
}
