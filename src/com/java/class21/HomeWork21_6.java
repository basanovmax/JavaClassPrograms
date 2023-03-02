package com.java.class21;

public class HomeWork21_6 {
    public static void main(String[] args) {

       /* 6.  Write a program to print the below pattern
        *********
         *******
          *****
           ***
            *

        */

        int i,space,ast;

        for (i=1;i<=5;i++){
            for (space = 1; space <= i-1; space++){
                System.out.print(" ");
            }
            for (ast = 1; ast <= 11 - 2 * i; ast++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
