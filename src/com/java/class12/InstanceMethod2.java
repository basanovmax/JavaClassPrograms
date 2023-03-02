package com.java.class12;

public class InstanceMethod2 {
    public static void main(String[] args) {
    InstanceMethod2 var = new InstanceMethod2();

        System.out.println(var.lastDigit(42, 52));
        System.out.println("=============================");
        System.out.println(var.threeOrFive(11));
        System.out.println("=============================");
        System.out.println(var.isTen(1,9));
        System.out.println("=============================");

    }

    /*Given two non-negative int values,
    return true if they have the same last digit,
    such as with 27 and 57.
    Note that the % “mod” operator computes remainders, so 17 % 10 is 7.
     */

    public boolean lastDigit (int a, int b) {
        return a % 10 == b % 10;
    }

    //Return true if the given non-negative number is a
    // multiple of 3 or a multiple of 5. Use the % “mod” operator

    public boolean threeOrFive (int a) {
        return a % 3 == 0 || a % 5 == 0;
    }

    /*Create a method that takes 2 integers,
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/
    public boolean isTen (int a, int b) {
        return a ==10 || b==10 || a + b ==10;
    }
}
