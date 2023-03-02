package com.java.class22;

import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
    //Write a program to print sum of data stores in array
        Scanner input = new Scanner(System.in);

        int listOfData[] = new int[4];
        System.out.println("Enter number");

        for (int i = 0; i<listOfData.length;i++){
            listOfData[i]=input.nextInt();
        }
        int sum= 0;
        for (int i = 0; i<listOfData.length;i++){
            sum +=listOfData[i];
        }
        System.out.println(sum);




    }
}
