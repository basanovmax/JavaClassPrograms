package com.java.homeWork.class26;
/*Task 1:
Write a program to create an IPhone Class with variables (property) and methods (actions) inside it.,
Create three constructors inside the IPhone class
Identify and create static variables inside the IPhone class (Brainstorm on which variables can be static in IPhone Class )
Create an IPhoneMainClass and use these three constructors to create three different objects
Set static variable value for each object & Print all the values
Using three objects call methods of IPhone class*/
public class IPhoneMainClass {
    public static void main(String[] args) {
        Iphone phone = new Iphone();
        Iphone phone1=new Iphone("Iphone", "14 Pro", "Black");
        Iphone phone2 = new Iphone("Iphone","14 Pro ",512,25,"Black");

        System.out.println("==================");
        phone1.isCalling();
        System.out.println("==================");
        phone1.isGood();
        System.out.println("==================");
        phone2.isTexting();
        System.out.println("==================");

        Iphone.model = "3GS";
        Iphone.sizeOfMemory = 16;
        Iphone.cameraMegaPixel = 8;
/*
        System.out.println("My new iphone model is " + Iphone.model);
        System.out.println("My new iphone memory is " +Iphone.sizeOfMemory);
        System.out.println("My new iphone camera is " +Iphone.cameraMegaPixel);*/
        System.out.println("==================");
        phone1.isCalling();
        System.out.println("==================");
        phone1.isGood();
        System.out.println("==================");
        phone2.isTexting();
        System.out.println("==================");
    }

}
