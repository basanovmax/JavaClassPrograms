package com.java.class29;
class Vehicle {
    Vehicle() {
        System.out.println("From Vehicle");
    }
}
class Car extends Vehicle {

}
class SportsCar extends Car {
    SportsCar() {
        System.out.println("FromSportsCar");
    }
}
public class ConstructionChaining {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
    }
}
