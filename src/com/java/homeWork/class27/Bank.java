package com.java.homeWork.class27;
/*Task 1:
        Write a program to create a Bank Class with  Static and Instance variables inside it.
        (Brainstorm on which variables can be static in Bank Class )
        Create static as well as non-static methods inside the bank class that can utilize variables of class
Create a BankMainClass and call the instance method of the class using the object & static method using class*/

public class Bank {
    static String customerName;
    static String bankName;
    static int balance;
    int deposit;
    int withdraw;

    static void customerInfo(String customerName, String bankName) {
        System.out.println("Customer name is " + customerName + " bank name is " + bankName);
    }
    void setDeposit(int deposit) {
        this.deposit = deposit;
        balance = balance + deposit;
        System.out.println(customerName + "new balance " + bankName +  " is " + balance);
    }
    void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
        if (withdraw > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdraw;
            System.out.println(customerName + " new balance " + bankName +  " is " + balance);
        }
    }
    Bank(String customerName, String bankName) {
        Bank.customerName = customerName;
        Bank.bankName = bankName;
    }



}
