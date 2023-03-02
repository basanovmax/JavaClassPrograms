package com.java.class30;
class Bank{
    void displayRateOfInterest(int amount) {
        System.out.println(amount);
    }
    void displayRateOfInterest(String amount) {
        System.out.println(amount);
    }
}
public class MethodOverLoadingExample {

    public static void main(String[] args) {
    Bank b =new Bank();
    b.displayRateOfInterest(100);
    }
}
