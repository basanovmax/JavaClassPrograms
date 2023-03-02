package com.java.class14;

public class StringDotLength {
    //str.length() -> return the number of characters in a String
    //return type Int
    public static void main(String[] args) {
    String str = "wedevx.co";
        System.out.println(str.length()); //9

        String str2 = "Hello world !";
        System.out.println(str2.length());//13

        String str3 = "United State of America";
        System.out.println(str3.length()); //23

        String str4 = "Canada";
        String str5 = "Mexico";
        String str6 = "Cuba";

        int num = str3.length();
        int num1 = str4.length();
        int num2 = str5.length();
        int num3 = str6.length();

        int avarage = (num+num1+num2+num3)/4;
        System.out.println(avarage); //9
    }
}
