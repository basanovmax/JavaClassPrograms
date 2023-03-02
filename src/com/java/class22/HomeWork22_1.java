package com.java.class22;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork22_1 {
    public static void main(String[] args) {


   /* 1.  Write a program to find the greatest number from an array
            Example
    Input - 12, 45, 67, 23, 13, 45, 56
    Output - 67

    */
        int listOfData[] = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");

        for (int i = 0; i < listOfData.length; i++) {
            listOfData[i] = sc.nextInt();
        }

        int max=listOfData[0];
        int i;
        for ( i= 0; i <listOfData.length; i++){
            if (max<listOfData[i]){
                max=listOfData[i];
            }
        }
        System.out.println("Greatest number from an array is " + max);
    }
}


