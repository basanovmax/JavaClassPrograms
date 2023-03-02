package com.java.class21;

public class HomeWork21_4 {
    public static void main(String[] args) {
        /*4.  Write a program to print the below pattern
        *
        **
        ***
        ****
        *****
        */

        int i;
        int j;
        for (i=1; i<=5;i++){
            for (j=1; j <=i; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
