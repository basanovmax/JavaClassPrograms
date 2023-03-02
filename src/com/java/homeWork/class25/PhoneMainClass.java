package com.java.homeWork.class25;
/*    Task 1:
    Write a program to create a Phone Class with variables (property) and methods (actions) inside it.
    Create a PhoneMainClass and create three different objects of the Phone class
    Call methods of Phone class using these three different objects*/
public class PhoneMainClass {
    public static void main(String[] args) {
        Phone maxPhone = new Phone();
        Phone svetaPhone = new Phone();

        maxPhone.phoneName = "Iphone";
        maxPhone.memory = 256;
        maxPhone.color = "Black";

        svetaPhone.phoneName = "Google";
        svetaPhone.memory= 512;
        svetaPhone.color = "Gold";

        maxPhone.isCalling();
        maxPhone.memory();
        maxPhone.whichColor();

        svetaPhone.isCalling();
        svetaPhone.memory();
        svetaPhone.whichColor();

        System.out.println(maxPhone.phoneName);
        System.out.println(maxPhone.memory);
        System.out.println(maxPhone.color);
        System.out.println(svetaPhone.phoneName);
        System.out.println(svetaPhone.memory);
        System.out.println(svetaPhone.color);




    }
}
