package com.java.class8;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a whole number:");

        int number = input.nextInt();

        // when i am divide by 2 and the reminder  - > even number
        //

        if (number % 2 == 0) {
            System.out.println(number +  " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
    }
}
