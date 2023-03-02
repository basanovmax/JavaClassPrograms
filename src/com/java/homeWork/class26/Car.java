package com.java.homeWork.class26;
/*Task 2:
        Write a program to create a Class with all static variables (Use any example)
        Create a MainClass and print all the static variable values directly using the class name (It will print default values)
Create an object of the class and set static variables values through the object
        Print all the static variable values directly using the class name*/
public class Car {
    static String brandName;
    static int hoursePower;
    static String color;

    void isDriving(){
        System.out.println("I am driving " + brandName + ". It has " + hoursePower + " hp and it is " + color + " color" );
    }


}
