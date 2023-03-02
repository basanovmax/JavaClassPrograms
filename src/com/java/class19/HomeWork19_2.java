package com.java.class19;

import java.util.Scanner;

public class HomeWork19_2 {
    public static void main(String[] args) {
    //2. Write a program to count the number of divisors of the given numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number"); //15
        int num = input.nextInt();
        int count=0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
            count++;
            }
        }System.out.println(count);  //4

    }
}
