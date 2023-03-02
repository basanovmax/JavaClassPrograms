package com.java.class18;

public class WhileLoopExample {
    public static void main(String[] args) {

        //Write a program to print all numbers from 1 to 20 that are divisible by 3
        int i = 1;
        while (i<=20) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("-------------------");

        //Write a program to print numbers from 1 to 50 which are divisible by 5 or 3
        int j = 1;
        while (j<=50) {
            if (j % 3 == 0 || j % 5 == 0 ) {
                System.out.println(j);
            }
            j++;
        }

    }

}
