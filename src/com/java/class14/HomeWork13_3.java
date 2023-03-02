package com.java.class14;

import java.util.Scanner;

public class HomeWork13_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Homework 3:
        Given a string of any length, return a new string where
        the last 2 chars, if present, are swapped, so “coding” yields “codign”.
        lastTwo(“coding”) → “codign”
        lastTwo(“cat”) → “cta”
        lastTwo(“ab”) → “ba” */

        System.out.println("Type string");
        String swapped = input.nextLine();

        System.out.println(lastTwo1(swapped));    }

    public static String lastTwo1(String str) {
        if (str.length() >=2) {
            String swap1 = str.substring(str.length() - 2, str.length() - 1);
            String swap2 = str.substring(str.length() - 1);
            return str.substring(0, str.length() - 2).concat(swap2).concat(swap1);
        }
        System.out.println("Error");
        return str;
    }

    /*    public static String lastTwo(String str){
        if (str.length() >=2){
           String swap = str.substring(str.length()-2);
           swap = swap.substring(1).concat(swap.substring(0,1));
           str = str.substring(0,str.length()-2).concat(swap);
        }
        else {
            System.out.println("Error");
        }
        return str;
    }*/
}
