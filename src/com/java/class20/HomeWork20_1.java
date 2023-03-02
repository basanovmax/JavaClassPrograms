package com.java.class20;

public class HomeWork20_1 {
    public static void main(String[] args) {

        //1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5

        int i;
        int sum;

        for (i = 1; i <= 5; i++) {
            sum = (int) Math.pow(i, i);
            System.out.println("Sum is " + sum);
        } /*1
            4
            27
            256
            3125 */
    }
}
