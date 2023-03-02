package com.java.class10;

import java.util.Scanner;

public class HomeWork10_2 {
    public static void main(String[] args) {


        /*
        Nested If statements homework 3:
Write a bank app to calculate interest rates on loans:
take input for loanAmount in $,  credit score between 300-850.

If the loan amount is less than $10,000 and the credit score is less than 600, the interest rate is set to 15%.

If the loan amount is less than $10,000 and the credit score is 600 or higher, the interest rate is set to 10%.

If the loan amount is $10,000 or higher and the credit score is less than 600, the interest rate is set to 12%.

If the loan amount is $10,000 or higher and the credit score is 600 or higher, the interest rate is set to 8%.

Print out the interest rate.
Example output:
Please enter how much you want to loan:
9000
Please enter your credit score:
750
Your interest rate is 10%.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how much you want to loan:");
        int loan = input.nextInt();

        System.out.println("Please enter your credit score from 300-850:");
        int creditScore = input.nextInt();

        if (loan >0 && loan < 10000) {
            if (creditScore >= 300 && creditScore < 600) {
                System.out.println("Interest rate is set to 15%");
            } else if (creditScore >= 600 && creditScore <= 850) {
                System.out.println("Interest rate is set to 10%");
            } else {
                System.out.println("Please type credit score from 300-850!");
            }
        } else if (loan >=10000 ) {
            if (creditScore >= 300 && creditScore < 600) {
                System.out.println("Interest rate is set to 12%");
            } else if (creditScore >= 600 && creditScore <= 850) {
                System.out.println("Interest rate is set to 8%");
            } else {
                System.out.println("Please type credit score from 300-850!");
            }
        } else {
            System.out.println("Invalid data");
        }
    }
}