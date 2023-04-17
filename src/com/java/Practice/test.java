package com.java.Practice;

public class test {
    public static void main(String[] args) {
        int a = 45645;
        int sum=0;
        int digit;
        while (a > 0){
            digit= a%10;
            System.out.println("Digit " + digit);
            sum = sum+digit;
            System.out.println("Sum " + sum);
            a = a/10;
        }
        System.out.println("sum of 45645 is " + sum);

        }
    }

