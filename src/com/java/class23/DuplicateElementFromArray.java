package com.java.class23;

import java.util.Scanner;

public class DuplicateElementFromArray {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("Please enter 8 fruits");
            String fruits[]=new String[8];

            for(int i = 0; i < fruits.length; i++){
                fruits[i] = input.nextLine().trim();
            }
        System.out.println("Duplicate fruits are : ");
            for (int i=0; i < fruits.length;i++){
                for (int j = i+1; j < fruits.length; j++) {
                    if (fruits[i].equalsIgnoreCase(fruits[j])){
                        System.out.println(fruits[i]);
                        break;
                    }
                }
            }
    }
}
