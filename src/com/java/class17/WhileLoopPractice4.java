package com.java.class17;

public class WhileLoopPractice4 {
    public static void main(String[] args) {

        //Write a program print out
        //every other characters of a String
        //ex: Java -> a , a
        //Hello -> e,l
        //world -> o l


        String str = "Hello World from Mars";
       /* System.out.println(str.charAt(0)); //H
        System.out.println(str.charAt(1)); //e
        System.out.println(str.charAt(2)); //l
        System.out.println(str.charAt(3)); //l
        System.out.println(str.charAt(4)); //o */
        //Hello
        int i = 1;
        while (i < str.length()) {
            System.out.println(str.charAt(i));
            i+=2;
        }
        System.out.println("________________________");


    }
}
