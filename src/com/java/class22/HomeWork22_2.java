package com.java.class22;

import java.util.Scanner;

public class HomeWork22_2 {
    public static void main(String[] args) {
        /*2.  Write a program to find the sum of even and odd numbers
        Example
        Input - 12, 45, 67, 23, 13, 45, 56
        Output - Sum of Even Elements - 68, Sum of Odd Elements - 193
         */
        int numbers[] = new int[7];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i]=input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else if (numbers[i] % 2 == 1) {
                sumOdd += numbers[i];
            }
        }System.out.println("Sum of Even Elements -" + sumEven);
        System.out.println("Sum of Odd Elements - "+ sumOdd);
    }
}
