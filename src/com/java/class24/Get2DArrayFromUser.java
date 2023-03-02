package com.java.class24;

import java.util.Scanner;

public class Get2DArrayFromUser {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.println("Please enter 3 numbers for row" + (i + 1));

            for (int j = 0; j < data.length; j++) {
                data[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }





    }

}
