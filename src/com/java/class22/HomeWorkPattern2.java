package com.java.class22;

import java.util.Scanner;

public class HomeWorkPattern2 {
    public static void main(String[] args) {
        /* 6.  Write a program to print the below pattern
         *********
         *******
         *****
         ***
         *

         */

        int space, ast;
/*
        for (i=1;i<=5;i++){
            for (space = 1; space <= i-1; space++){
                System.out.print(" ");
            }
            for (ast = 1; ast <= 11 - i * 2; ast++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = input.nextInt();

        for(int i=1; i <= num-1; i++) {
            for (int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (space = 1; space <= num - i; space++) {
                System.out.print(" ");
            }
            for (ast = 1; ast <= 2 * i - 1; ast++) {
                System.out.print(ast);
            }
            System.out.println();

        }
    }
}
