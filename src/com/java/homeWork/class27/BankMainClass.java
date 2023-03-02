package com.java.homeWork.class27;

public class BankMainClass {
    public static void main(String[] args) {
        Bank.customerInfo("Maxim", "BofA");
        Bank newBank = new Bank ("Max", "Chase");
        newBank.setDeposit(50000);
        newBank.setWithdraw(1500);
        Bank.customerInfo("Maxim", "BofA");



    }
}
