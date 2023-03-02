package com.java.class19;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //6 - 1,2,3,6 - factors
        //25 - 1.5.25 - factors
        //14 - 1,2,7,14 - factors
        //Write a program to find of given number
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num = input.nextInt();

        int i;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
