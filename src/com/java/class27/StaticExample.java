package com.java.class27;
class Car {
    int speed = 200; //Instance variable get created in memory only when you create object

    static void drive(){
       /* int speed; //Local Variable - Must be initialized before used
       //Inside the static method you can only use static variables
        System.out.println(speed);*/

    }
}

public class StaticExample {
    public static void main(String[] args) {
        //Car.drive(); We can call static method without creating object
        Car c1= new Car();
        c1.drive();
    }
}
