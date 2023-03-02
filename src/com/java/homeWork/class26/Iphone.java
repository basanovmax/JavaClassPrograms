package com.java.homeWork.class26;
/*Task 1:
Write a program to create an IPhone Class with variables (property) and methods (actions) inside it.,
Create three constructors inside the IPhone class
Identify and create static variables inside the IPhone class (Brainstorm on which variables can be static in IPhone Class )
Create an IPhoneMainClass and use these three constructors to create three different objects
Set static variable value for each object & Print all the values
Using three objects call methods of IPhone class*/
public class Iphone {

    String brand;
    static String model;
    static int sizeOfMemory;
    static String color;
    static int cameraMegaPixel;

    void isCalling() {
        System.out.println("My phone " + brand + " " + model + " is calling");
    }
    void isGood() {
        System.out.println("My phone is " + brand + model);
        System.out.println("It have " + sizeOfMemory + " memory");
        System.out.println("Color is " + color);
        System.out.println(brand + " " + model +  " camera size is " + cameraMegaPixel);
    }
    void isTexting(){
        System.out.println("My phone " + brand + " " + model + " can text messages");
    }
    Iphone(){
        System.out.println("I have Iphone");
    }
    Iphone(String newBrand, String newModel,String newColor){
        brand = newBrand;
        model=newModel;
        color=newColor;
    }
    Iphone(String newBrand, String newModel, int newSizeOfMemory, int newCameraMegaPixel, String newColor ){
        brand = newBrand;
        model= newModel;
        cameraMegaPixel = newCameraMegaPixel;
        sizeOfMemory = newSizeOfMemory;
        color = newColor;


    }


}
