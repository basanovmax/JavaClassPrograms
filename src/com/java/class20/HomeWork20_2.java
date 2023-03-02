package com.java.class20;

public class HomeWork20_2 {
    public static void main(String[] args) {

        // Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
        //Note - Please print the sum in decimal, answer should not be zero

        double i;
        double sum=0;

        for (i=1; i <=10; i++) {
            sum = sum+ i/(i+1);
        }
        System.out.println("Sum in decimal is " + (int)sum);
    }
}
