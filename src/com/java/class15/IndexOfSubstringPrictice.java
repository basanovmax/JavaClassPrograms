package com.java.class15;

public class IndexOfSubstringPrictice {
    public static void main(String[] args) {
        //
        String str2 = "I love 5am walking at ";
        int indexOf5am = str2.indexOf("5am");
        //check for the length of this String
        //3
        int length = "5am".length();
        System.out.println(indexOf5am); //7
        System.out.println(length); //3
        System.out.println(str2.substring(indexOf5am, indexOf5am+length)); //5am
    }
}
