package com.java.class17;

public class HomeWork_1 {
    public static void main(String[] args) {
        /*Write a program that calculates the sum of all
        even numbers between 1 and a 100 using a while loop.
            2+4+6+8 … = ?*/

        int i = 2;
        int sum = 2;

        while (i<100) {
            i+=2;
            sum = sum + i;
        }
        System.out.println(sum);


    }

}
