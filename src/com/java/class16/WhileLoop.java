package com.java.class16;

public class WhileLoop {
    public static void main(String[] args) {
        //What are loop?
        //In programming pretty often you need to rerun the same set of
        //code multiple times and you need to accomplish that with
        //minimal code
        //for ex: we want to write program that counts
        //number of active users right now

         /*int activeUsers = 0;
        activeUsers++;
        System.out.println("Welcome users number" + activeUsers);
        activeUsers++;
        System.out.println("Welcome users number" + activeUsers);
        activeUsers++;
        System.out.println("Welcome users number" + activeUsers); */

        //instead of if, we have while
        //() -> boolean expression
        //boolean expression is true
        //you must have a boolean expression updater
        //otherwise you might have an infinity loop

        int activeU = 0;
        //if you are dealing with counters
        //you boolean expresssions aro going yo be
        //<comparison operator
        while (activeU < 10) {
            activeU++;
            System.out.println("Welcome user number" + activeU);


        }
    }
    //reuse the same logic is for methods
}
