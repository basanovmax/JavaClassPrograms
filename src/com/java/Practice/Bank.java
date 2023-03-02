package com.java.Practice;

class Bank {
    void withdraw(){
        System.out.println("Parent withdraw");
    }
    void deposit(){
        System.out.println("Parent Deposit");
    }
    void displayOfInterest(){
        System.out.println("Parent rate");
    }
}

class ChaseBank extends Bank{
    @Override
    void displayOfInterest(){
        System.out.println("Parent rate Chase");
    }

    }
class Citibank extends Bank{
    @Override
    void displayOfInterest(){
        System.out.println("Parent rate Citi");
    }
    }
