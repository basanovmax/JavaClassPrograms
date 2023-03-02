package com.java.Practice;

public class BankMain {
    public static void main (String[] args){
    ChaseBank maxCb = new ChaseBank();
    Citibank maxCiti = new Citibank();

    Paypal myPaypal = new Paypal();
    myPaypal.displayOfInterest(maxCb);
    myPaypal.displayOfInterest(maxCiti);
    }

}
