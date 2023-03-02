package com.java.class29;

class Bank{
    void displayOfInterest(){
        System.out.println("4.0%");
    }
}
class ChaseBank extends Bank {
    void displayOfInterest(){
        System.out.println("6.0%");
        super.displayOfInterest();
    }
}
public class ThisAndSuperWithMethods {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.displayOfInterest();
    }
}
