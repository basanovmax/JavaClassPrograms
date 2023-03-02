package com.java.class12;

public class Methods2 {
    public static void main(String[] args) {
        int total = sum(2, 2);
        System.out.println(total);

        boolean range = inTheRange(15, 15);
        System.out.println(range);
    }
    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public static int sum(int int1, int int2) {
        if (int1 == int2) {
            return (int1 + int2) * 2;
        }
        return int1 + int2;
    }
    //Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    public static boolean inTheRange (int a, int b) {
        return a >= 10 && a <=20 || b >= 10 && b <=20;
        //1. if you have a method that returns boolean
        //2. if you have just a simple if and else logic
        //you can put the condition expression with return
    }
}
