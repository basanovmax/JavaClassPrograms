package com.java.class17;

public class HomeWork_2 {
    public static void main(String[] args) {
        // Write a program that prints all prime numbers
        // between 1 and a 100  using a while loop.

        int i = 1;

        while (i < 100) {
            int j = 2;
            boolean isPrime = false;

            while (j < i) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
                j++;
            }
            if (!isPrime) {
                System.out.println(i);
            }
            i++;
        }
    }
}
