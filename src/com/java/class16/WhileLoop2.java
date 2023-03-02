package com.java.class16;

public class WhileLoop2 {
    public static void main(String[] args) {

        //write a program
        //that will prin out
        //*
        //**
        //***
        //****
        //*****

        String str = "*";
        int iterator = 0;
        int i = 1;
        while (iterator < 5) {
            System.out.println(str);
            str = str.concat("*");
            iterator++;
        }

        String str2 = "";
        while (str2.length() < 5) {
            //you must have a statement
            //that update the value of a variable that
            //is used in boolean expression
            str2 = str2.concat("*");
            System.out.println(str2);
        }

        //write a program print out
        //10-0
        //10
        //9
        //8
        //...
        //0

        int j = 10;
        while (j >= 0) {
            System.out.println(j);
            j--;
        }

        //write a program
        //that will prin out
        //*****
        //****
        //***
        //**
        //*

        String str1 = "*****";
        while (str1.length() > 0) {
            System.out.println(str1);
            str1 = str1.substring(0, str1.length() - 1);
        }
        //write a programm that will print out even numberuntil 20

        int num = 0;
        while (num < 20) {
            num += 2;
            System.out.println(num);
        }

        int num2 = 0;
        while (num2 <= 20) {
            if (num2 % 2 == 0) {
                System.out.println(num2);
            }
            num2++;
        }
        //space complexity =>
        //time complexity =>
        //big annotation =>

        // white a program that will count number of vowel characters
        //and consonant characters in Spring

        String str3 ="Hello DevXer";
        // vowels - 4;
        //consonants including space - 8;

        //Iterate through all characters
        //if character is ==e,o return vowels, otherwise return consonants

        int b = 0;
        int c = 1;
        int d = 1;

        while (b<str3.length()) {
            if (str3.charAt(b)=='e'|| str3.charAt(b)=='o') {
                System.out.println("it's vowel" + " " +c);
                c++;
            }
            else {
                System.out.println("it's consonants" + " " + d);
                d++;
            }
            b++;
        }

    }
}
