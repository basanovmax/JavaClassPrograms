package com.java.class9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender ? M or F");
        //When you hit . and have a name ending with a()
        //it means it's a method (function)
        String gender = sc.next();

        // charAt(0) method takes the first character of a String
        char genderInCharDataType = gender.charAt(0);
        System.out.println (genderInCharDataType);

        System.out.println("What is your Tesla Model");
        //when you want to get a char from user
        //use the syntax below
        char teslaModel = sc.next().charAt(0);
        System.out.println(teslaModel);
    }

}
