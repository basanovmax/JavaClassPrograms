package com.java.class17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //write a program to print
        //1 10 2 9 3 8 4 7 5 6
        //1 2 3 4 5 -> run 5 times
        //10 9 7 8 6 -> run 5 times
        int num = 1; //starting point
        int num1 = 10;
        //if your problems is asking to run specific number of times
        //there should at least one var
        while (num<6 && num1>5) { //() -> how many times it should run?
            //in the body of the while i must have a
            // boolean expression updater
            System.out.println(num);
            num++; //updater
            System.out.println(num1);
            num1--; //updater
        }

        //1. define the right starting point
        //2. define a boolean expression where
        //you are using the variables of starting pont
        //3. write body of the while loop
        //4. make sure you have a updater of a variables in the boolean expression

    }
}
