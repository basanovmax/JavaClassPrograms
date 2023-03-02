package com.java.class06;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //nextInt(), nextLine(), nextBoolean() -> they are all methods
        //all methods return result. Make sure you know what data type
        //the method return
        //before we ask for user input, we should tell user
        //what type of info we want from them
        System.out.println("Please enter your age and hit enter: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);


        System.out.println("Please enter your credit score between 0 - 820 ");

        int creditScore = input.nextInt();

        System.out.println("You credit score is  " + creditScore);

        //ask user their marital status
        //married, single
        //true, false

        System.out.println("Please enter your marital status. Write true if married, false if not ");

        boolean maritalStatus = input.nextBoolean();

        System.out.println("Your marital status is " + maritalStatus);

        System.out.println("Please enter your marital status. Write here ");
        String maritalStatus1 = input.next();
        System.out.println("Your marital status is " + maritalStatus1);



    }
}
