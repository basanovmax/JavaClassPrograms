package com.java.homeWork.class30;

import java.util.Scanner;

class Vehicle{
    int speed;
    public void driving(){
        System.out.println("Vehicle driving");
    }
    public void driving(int speed){
        this.speed=speed;
        System.out.println("Vehicle driving " + speed + " speed");
    }
}

class Car extends Vehicle{
    @Override
    public void driving(){
        System.out.println("Car driving");
    }
    @Override
    public void driving(int speed){
        this.speed=speed;
        System.out.println("Car driving " + speed + " speed");
    }
}


public class HomeWork30_1 {
    public static void main(String[]args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.driving();
        myVehicle.driving(120);

        Car myCar = new Car();
        myCar.driving();
        myCar.driving(180);

        Vehicle bi;


        bi = new Car();
        bi.driving(100);

        Vehicle myIt = new Car();
        myIt.driving(20);
    }

}
