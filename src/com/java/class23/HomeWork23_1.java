package com.java.class23;

public class HomeWork23_1 {
    public static void main(String[] args) {
       /* 1. Write a program to get a collection
       of elements and print it in reverse order
        Input: 1 2 3 4 5
        Output: 5 4 3 2 1*/

        int num[] = {1, 2, 3, 4, 5};

        for (int i = num.length-1; i>=0; i--){
            System.out.print(num[i] + " ");
        }
    }
}

