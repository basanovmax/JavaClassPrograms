package com.java.class23;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //Declaration of two Dimensional Array

        int data[][] = {{34, 54, 23},
                        {24, 45, 25},
                        {14, 56, 36}
        };
        //Access one of the element from 2D array
        System.out.println(data[0][0]); //34

        System.out.println("===============");

        //Print all data

        for (int i = 0; i< 3;i++){
            for (int j = 0; j< data[i].length;j++){ //3
                System.out.print(data[i][j] + " "); //print table
            }
            System.out.println();
        }
        System.out.println("===============");
        //Find Number of Rows in 2D Array

        System.out.println(data.length);
        System.out.println("===============");
        //Find number of Column in 2D Array
        System.out.println(data[0].length);
    }
}
