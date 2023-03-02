package com.java.homeWork.class25;

/*    Task 1:
    Write a program to create a Phone Class with variables (property) and methods (actions) inside it.
    Create a PhoneMainClass and create three different objects of the Phone class
    Call methods of Phone class using these three different objects*/
public class Phone {
    String phoneName;
    int memory;
    String color;

    void isCalling() {
        System.out.println(phoneName + " is calling");
    }

    void memory() {
        System.out.println("Your phone have " + memory + " Gb memory");
    }

    void whichColor() {
        System.out.println("Your phone is " + color + " color");
    }

}
