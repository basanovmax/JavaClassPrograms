package com.java.class18;

import java.util.Scanner;

public class HomeWork_18_1 {
    public static void main(String[] args) {


   /* Write a program to take the opening balance
   and the account name from the user and
   display the below operations that the user
   can perform, at the end ask user if they
   want to perform more operations and then
   continue the same process until a user enters ‘NO’
    Output
    Welcome to the ATM Machine
    Please enter your account opening balance: 1000
    Please choose the operations you want to perform
1) Withdraw
2) Deposit
3) Check Balance
1
    Please enter the amount you want to withdraw: 500
    The available balance is: 500
    Do you want to perform more operations?
    Press 1 for yes, Press 2 for No
1
    Please choose the operations you want to perform
1) Withdraw
2) Deposit
3) Check Balance
2
    Please enter the amount you want to deposit: 500
    The available balance is: 1000
    Do you want to perform more operations?
    Press 1 for yes, Press 2 for No
    2*/


       String choice = "";
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to the ATM Machine");
        System.out.println("Please enter your account opening balance:");
        int userBalance = sc.nextInt();

        do {
        System.out.println("Please choose the operations you want to perform");
        System.out.println("1.Withdraw ");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        String operation = sc.next();

        switch (operation){
            case "1":
            case "Withdraw":
                System.out.println("Please enter the amount you want to withdraw:");
                int withdraw = sc.nextInt();
                System.out.println("Your balance is: " + (userBalance-withdraw));
                userBalance=userBalance-withdraw;
                break;
            case "2":
            case "Deposit":
                System.out.println("Please enter the amount you want to deposit:");
                int deposit = sc.nextInt();
                System.out.println("Your balance is: " + (userBalance+deposit));
                userBalance=userBalance+deposit;
                break;
            case "3":
            case "Check balance":
                System.out.println("Your balance is: " + (userBalance));
                break;
            default:
                System.out.println("Try again");
        }
        System.out.println("Would you like to do more operation? (Press 1 for yes, Press 2 for No)");
        choice = sc.next();
        } while (choice.equalsIgnoreCase("1") || choice.equalsIgnoreCase("yes"));
    }
}
