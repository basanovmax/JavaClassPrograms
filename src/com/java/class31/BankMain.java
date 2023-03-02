package com.java.class31;

public class BankMain {
    public static void main(String[] args) {


        ChaseBank maximCB = new ChaseBank();
        CitiBank maximCiti = new CitiBank();
        Paypal maximPaypal = new Paypal();

        maximPaypal.displayRateOfInterest(maximCB);
        maximPaypal.displayRateOfInterest(maximCiti);
        maximPaypal.withdraw(maximCB);
        maximPaypal.withdraw(maximCiti);

        Bank bank = new Bank();
        bank.deposit();

    }
}
