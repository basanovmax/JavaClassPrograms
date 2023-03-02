package com.java.class24;

import java.util.Scanner;

public class HomeWork24_1 {
    public static void main(String[] args) {
      /*  1. Write a program to get two 2D arrays from the user and print the sum of it
        Input:
        Array 1
        1 1 1
        2 2 2
        3 3 3
        Array 2
        4 4 4
        2 2 2
        1 1 1

        Output:
        5 5 5
        4 4 4
        4 4 4*/

        Scanner input = new Scanner(System.in);
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];

        for (int i = 0; i < num1.length; i++) {
            System.out.println("Please enter for first Array 3 numbers for row" + (i + 1));

            for (int j = 0; j < num2.length; j++) {
                num1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < num1.length; i++) {
            System.out.println("Please enter for second Array 3 numbers for row" + (i + 1));

            for (int j = 0; j < num2.length; j++) {
                num2[i][j] = input.nextInt();
            }
        }
        for (int i=0;i<num1.length;i++){
            for (int j=0; j<num2.length;j++){
                System.out.print(num1[i][j]+num2[i][j] + " ");
            }System.out.println();
        }

    }
}
