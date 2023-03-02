package com.java.class20;

import java.util.Scanner;

public class HomeWork20_5 {
    public static void main(String[] args) {
        /*Write a program to print the reverse of the given number
                Example1
        Input - 86545
        Output - 54568
        Example2
        Input - 23561
        Output - 16532*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int i = sc.nextInt();
        int rev = 0;
        while (i>0) {
        rev = (rev * 10) + i%10;
         i=i/10;
        }
        System.out.println("Reversed Number is " + rev);

        /*int res;
        int j = 1234568;
        while(j>0) {
            res = j%10;
            j=j/10;
            System.out.print(res);
        }*/

    }
}
