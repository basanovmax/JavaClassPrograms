package com.java.class24;

public class HomeWork24_3 {
    public static void main(String[] args) {
       /* 3. Program to print the sum of the smallest and greatest number from the array using for-each loop
        Input: 45, 65, 85, 24, 45, 85, 34, 65, 100
        Output: 124 (100 + 24) */

        int num[] = {45, 65, 85, 24, 45, 85, 34, 65, 100};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : num) {
            if (max < i) {
                max = i;
            }
        }
        for (int i : num) {
            if (min > i) {
                min = i;
            }
        }
        int sum = max+ min;
        System.out.println("Sum of the smallest number is " + min);
        System.out.println("Sum of the greatest number is " + max);
        System.out.println("Sum of the smallest and greatest number is " + sum);
    }
}



