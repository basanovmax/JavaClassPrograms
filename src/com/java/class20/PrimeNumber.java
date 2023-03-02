package com.java.class20;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //Prime Number - number which divided only for itself and 1

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int num = input.nextInt();
        int count = 0;
        int i;
        for (i = 2; i < num; i++) {  //i=1 ; i <= num; i++
            if (num % i == 0) {
                count++;
            }
        }
        if (count==0) { // count == 2;
            System.out.println(num + " is Prime number");
        } else {
            System.out.println(num + "Not prime number");
        }


        System.out.println("Enter numbers");
        int num1 = input.nextInt();
        boolean isPrime = true;

        for (i = 2; i < num1; i++) {  //i=1 ; i <= num; i++
            if (num1 % i == 0) {
                isPrime=false;
            }
        }
        if (isPrime) { // count == 2;
            System.out.println(num1 + " is Prime number");
        } else {
            System.out.println(num1 + "Not prime number");
        }
    }
}

