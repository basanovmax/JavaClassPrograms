package com.java.class10;

import java.util.Scanner;

public class IfStatementRecap {
    public static void main(String[] args) {
        //1. Determining the minimum of three numbers:
//ask the user to input 3 integer numbers
//write a logic that will print out the largest number


        Scanner sc = new Scanner(System.in);

        System.out.println("Type 1 number:");
        int num1 = sc.nextInt();

        System.out.println("Type 2 number:");
        int num2 = sc.nextInt();

        System.out.println("Type 3 number:");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("This is larger number " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
                System.out.println("This is larger number " + num2);
            }
        /* else if (num1 == num2 && num1 > num3) {
            System.out.println("This is larger number " + num1);
        } */
        else {
                System.out.println("This is larger number " + num3);
        }


    }
}

