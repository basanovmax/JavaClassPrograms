package com.java.class19;

public class ForLoopExample {
    public static void main(String[] args) {
        int i = 1; // initialization

        while (i <= 5) { //condition
            System.out.println(i);
            i++; //Increment / Decrement
        }
        /*1
        2
        3
        4
        5*/
        System.out.println("======================");

        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }
        /*1
        2
        3
        4
        5*/
        System.out.println("======================");

        for (int k = 10; k>0; k--) {
            System.out.println(k);
        }
        System.out.println("======================");
        /*10
        9
        8
        7
        6
        5
        4
        3
        2
        1
        */


    }
}
