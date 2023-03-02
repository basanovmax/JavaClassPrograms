package com.java.class21;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        /*3. Write a program to print the sum of each digit from the given number
        Example1
        Input - 3521
        Output - 11
        Example2
        Input - 5390
        Output - 17*/
        //1. Input data from user and create a variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        System.out.println(sum);

         /* 4.  Write a program to print the greatest digit from the given number
        Example1
        Input - 86545
        Output - Greatest digit is 8
        Example2
        Input - 23561
        Output - Greatest digit is 6 */
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        int max = num % 10;
        while (num1 > 0) {
            int lastDigit1 = num1 % 10;
            if (lastDigit1 > max) {
                max = lastDigit1;
            }
        }
        System.out.println(max);


        /*Write a program to print the reverse of the given number
                Example1
        Input - 86545
        Output - 54568
        Example2
        Input - 23561
        Output - 16532*/
        int num3 = input.nextInt();
        int rev = 0;

        while (num3 > 0) {
            int lastDigit2 = num3 % 10;
            rev = rev * 10 + lastDigit2;
            num3 = num3 / 10;
        }
        System.out.println(rev);
    }
}

