package com.java.class20;

import java.util.Scanner;

public class CountDigit {

    //Write a program to count number of digit in the given.
    //Input - 35435
    //Output - 5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num = input.nextInt();
        int count = 0;

        while (num > 0) {
            num = num/10; //remove one digit from number
            count++;
        }
        System.out.println(count);
    }
}
