package com.java.class21;

public class HomeWork21_5 {
    public static void main(String[] args) {
        /*5.  Write a program to print the below pattern
           *
          ***
         *****
        *******
       *********

         */
        int i, spaces, ast;
        for (i = 5; i >= 1; i--) {
            for (spaces = 1; spaces <= i - 1; spaces++) {
                System.out.print(" ");
            }
            for (ast = 1; ast <= 11 - 2 * i; ast++) {
                System.out.print("*");
            }System.out.println();
        }

    }
}
