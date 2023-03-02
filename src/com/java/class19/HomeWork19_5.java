package com.java.class19;

public class HomeWork19_5 {
    public static void main(String[] args) {
        //  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 10; i >= 6; i--) {
            sum1 += i;
        }
        for (int j = 1; j <= 5; j++) {
            sum2 += j;
        }

        System.out.println(sum1 + sum2); //55


    }
}
