package com.java.class25;

public class BankMainClass {
    public static void main(String[] args) {
        Bank tairAccount = new Bank();
        Bank maxAccount = new Bank();
        tairAccount.balance = 1000;
        tairAccount.accName = "Tair";
        maxAccount.balance = 5000;
        maxAccount.accName = "Max";

        tairAccount.withdraw(600);
        System.out.println(tairAccount.balance);

        System.out.println(maxAccount.balance);
    }

}
