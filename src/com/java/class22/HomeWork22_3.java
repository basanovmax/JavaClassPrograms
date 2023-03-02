package com.java.class22;

import java.util.Scanner;

public class HomeWork22_3 {
    public static void main(String[] args) {
        /*
        3.  Write a program to count number of positive(consider zero also positive)
        and negative numbers from an array
        Example
        Input - 12, -45, 67, 23, -13, 45, -56
        Output - Positive Elements - 4, Negative Elements - 3
         */
        int numbers[] = new int[7];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");

        int pos = 0;
        int neg = 0;

        for (int i = 0; i < numbers.length; i++){
            numbers[i]=input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
               pos++;
            } else if (numbers[i] < 0) {
              neg++;
            }
        }
        System.out.println("Positive Elements -" + pos);
        System.out.println("Negative Elements -" + neg);

    }
}
