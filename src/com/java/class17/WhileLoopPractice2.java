package com.java.class17;

import java.net.BindException;

public class WhileLoopPractice2 {
    public static void main (String[] args) {
        //Write a program to print out all characters in s String

         String str = "Let's go to Mars";
        // do I know how many times my loop should be iterated?

        int startingIndex = 0;
        //if you need to increment then use var < how many times you need to run
        while (startingIndex <= str.length()-1) {
            char eachChar = str.charAt(startingIndex);
            System.out.println(eachChar);
            startingIndex++;
        }
        System.out.println("___________________");
        //Write a program that print out att characters of a String
        //in reverse order
        String str1 = "I love Java";
        int Index = str1.length()-1;
        while (Index>0) {
            Index--;
        char eachChar = str1.charAt(Index);
            System.out.println(eachChar);
        }
        System.out.println("___________________");
        String str2 = "Space X Mars Mission";
        //whenever you are working with charAt();
        //indexes - > index starts from 0
        int index = str2.length()-1;
        System.out.println(index);

        while (index>=0) {
            System.out.println(str2.charAt(index));
            index--;
        }
        /*System.out.println(str2.charAt(4));
        System.out.println(str2.charAt(3));
        System.out.println(str2.charAt(2));
        System.out.println(str2.charAt(1));
        System.out.println(str2.charAt(0)); */
    }
}
