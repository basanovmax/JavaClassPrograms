package com.java.class9;

public class NestedIf {
    public static void main(String[] args) {

        boolean outerBoolean = true;
        boolean innerBoolean = false;


        // First if statement scope {} -> is outer if statement
        //if next line if statement is false then program going to


        //this program not print out anything
        if (true) {

            if (false) {
                System.out.println("Hi from Inner If statement");

            }


        }

    }
}
