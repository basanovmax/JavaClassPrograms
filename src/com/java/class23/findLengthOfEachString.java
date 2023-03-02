package com.java.class23;

import java.util.Scanner;

public class findLengthOfEachString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 String");
        String names[]=new String[5];

        for (int i = 0; i < names.length;i++){
            names[i]=input.next().trim();
        }
        for (int i = 0; i <names.length;i++){
            System.out.println(names[i] + " " + names[i].length());
            }
        }
    }

