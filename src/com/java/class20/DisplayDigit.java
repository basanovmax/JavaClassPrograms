package com.java.class20;

import java.util.Scanner;

public class DisplayDigit {
    public static void main(String[] args) {
        //Write a program to print each digit in different line of the number in output in reverse order

        // input 1234
        // output
        //4
        //3
        //2
        //1

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num = input.nextInt();

        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10; //remove one digit
        }
    }
}

