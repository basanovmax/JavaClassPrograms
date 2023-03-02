package com.java.class24;

public class HomeWork24_2 {
    public static void main(String[] args) {
       /* 2.  Write a program to find the sum of array elements using for-each loop
        Input: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        Output: 55 */

        int sum = 0;
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int sumArray : num) {
            sum+=sumArray;
        }System.out.println("Sum of Array is " + sum);

    }
}
