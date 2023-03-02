package com.java.homeWork.class26;
/*Task 2:
        Write a program to create a Class with all static variables (Use any example)
        Create a MainClass and print all the static variable values directly using the class name (It will print default values)
Create an object of the class and set static variables values through the object
        Print all the static variable values directly using the class name*/
public class CarMainClass {
    public static void main(String[] args) {
        System.out.println(Car.brandName);
        System.out.println(Car.color);
        System.out.println(Car.hoursePower);
        System.out.println("==============");

        Car myCar = new Car();
        Car.hoursePower = 300;
        Car.brandName = "BMW";
        Car.color = "Black";
        myCar.isDriving();
        System.out.println("==============");

        Car.hoursePower = 150;
        Car.brandName = "Toyota";
        Car.color = "White";
        myCar.isDriving();
    }

}
