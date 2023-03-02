package com.java.class19;

public class HomeWork19_1 {
    public static void main(String[] args) {
        //1. Write a program to print the sum of even numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) {  //2,4,6,8,10
                sum=sum+i;
            }
        }System.out.println(sum);
    }
}
