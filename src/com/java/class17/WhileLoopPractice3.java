package com.java.class17;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        //how many characters ?
        //count from 1
        String str = "I am on Mars Mission";
        System.out.println(str.length());

        //where is that location character?
        //index of character
        int index = str.length()-1;

        System.out.println(str.charAt(index));
    }
}
