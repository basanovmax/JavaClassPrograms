package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {
        // COnditional OR ||
        // is used for setting multiple conditions
        //and overall result is true only if one of them is true

        //int age = 62;

        //boolean giveDiscount =  age > 60 || age < 8;
        //System.out.println(giveDiscount);

        //different between && -> all condition must true
        // || -> one of them must be true



        //if 24 hr time

        int currentTime = 15;

        //drink should be tru if current time is 6-11

        boolean drinkCoffee = currentTime >= 6 && currentTime <= 11;
        System.out.println(drinkCoffee);

        int howManyJavaExercises = 7;
        int howManySoftSkillVideos = 0;
        boolean canIrelaxNow = howManyJavaExercises >= 5 || howManySoftSkillVideos >= 2;
        System.out.println(canIrelaxNow);

        //Banking industry application
        //when should the bank account be blocked?
        //Login Attempts more the 3
        //transaction amount is more than $3000
        //location of transaction -> must match your current location

        int numberOfLoginAttempts = 0;
        double transactionAmount = 3010.0;
        String LocationOfTransaction = "USA";

        boolean block = numberOfLoginAttempts > 3 || transactionAmount > 3000.0 || LocationOfTransaction != "USA";
        System.out.println(block);




    }
}
