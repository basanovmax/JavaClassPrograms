package com.java.class22;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
    //Create and initialize anArray
        int listOfData[] = {10,20,30,40,50,60,70,80};

        //Access element from array

        System.out.println(listOfData[2]);

        System.out.println(listOfData.length);

        for (int i = 0; i<listOfData.length; i++){
            System.out.println(listOfData[i]);
        }
        System.out.println(listOfData); //[I@74a14482 - it's memory location

        System.out.println(Arrays.toString(listOfData)); // Data

        System.out.println(listOfData[6]);



    }
}
