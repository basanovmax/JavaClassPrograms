package com.java.class31;

class Bank {
    void withdraw() {
        System.out.println("Parent Withdraw");
    }

    void deposit() {
        System.out.println("Parent deposit");
    }

    void displayRateOfInterest(){
        System.out.println("Parent rate of interest");
    }
}

class ChaseBank extends Bank{
    @Override
    void displayRateOfInterest(){
        System.out.println("Child rate of interest - Chase Bank");
    }

    void takeQuickLoan(){
        System.out.println("Child Take quick loan");
    }
    void withdraw() {
        System.out.println("Child Withdraw Chase bank");
    }
}


class CitiBank extends Bank {
    @Override
    void displayRateOfInterest() {
        System.out.println("Child rate of interest Citi Bank");
    }
    void withdraw() {
        System.out.println("Child Withdraw Citi bank");
    }
}