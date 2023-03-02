package com.java.class29;

class Animal{
    Animal(){
        System.out.println("From Animal");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("From Dog");
    }
}
class Pets extends Dog{
    Pets(){
        System.out.println("From Pets");
    }
}
public class ConstructorChainingWithParams {
    public static void main(String[] args) {
        Pets pet = new Pets();
    }
}
