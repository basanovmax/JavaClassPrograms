package com.java.class14;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        //charAt(int i) -> return a character at ith index
        //hard coding means => not dynamic coding
        String str = "wedevx.com";
        System.out.println(str.charAt(1)); //e
        System.out.println(str.charAt(0)); //w
        System.out.println(str.charAt(5)); //x
        System.out.println(str.charAt(6)); //.

        String str2 = "Hello world";
        System.out.println(str2.charAt(5)); //space

        String str3 = "Superstar";
        //System.out.println(str3.charAt(15)); // index out of bound
        //Exceptions are runtime errors
        //.StringIndexOutOfBoundsException

        //create a method that takes a String and returns the last character of that String.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.next();

        System.out.println(lastChar(word));  //return last Char
    }


    public static char lastChar(String str) {
        //"DevX"
        int length = str.length(); //24
        return str.charAt(str.length()-1); //24-1
    }
}
