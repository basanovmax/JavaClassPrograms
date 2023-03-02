package com.java.class20;

public class HomeWork6 {
    public static void main(String[] args) {
        //  Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2

        int sum = 0;

        for (int i = 1; i<=5; i++) {
            sum = sum + (int)Math.pow(i, 2); //sum + i * i
        }
        System.out.println(sum );

    }
}
