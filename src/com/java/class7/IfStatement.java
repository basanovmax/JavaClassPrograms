package com.java.class7;

import java.sql.SQLOutput;

public class IfStatement {

    //if statement is a logical flow control
    //you can write a program that executes certain portion of the code
    //only in certain condition
    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello world");
            System.out.println("Hello Jupiter");
        }

        // proceed with a normal execution
        System.out.println("I am outside of If statement");

        //when you have only one statement inside you can skip {}
        if (false)
            System.out.println("Hello Mars");
        System.out.println("Hello Saturn"); // this line is in fact outside of If statement scope
        // it will print in any condition

        //I want print out hello Venus only if my gallanOfOil is more tha 1000;

        int gallanOfOil = 5400;
        if(gallanOfOil > 1000) {
            System.out.println ("Hello Venus");
        }

    }
}
