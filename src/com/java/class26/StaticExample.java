package com.java.class26;

class Car {
    static int price;
    Car(){
        price++;
    }
}
public class StaticExample {
    public static void main(String[] args) {
        Car audi = new Car();
        Car bmw = new Car();
        Car honda = new Car();
        System.out.println(audi.price);
        System.out.println(bmw.price);
        System.out.println(honda.price);
    }
}
