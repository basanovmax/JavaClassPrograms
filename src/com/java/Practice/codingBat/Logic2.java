package com.java.Practice.codingBat;

public class Logic2 {
    public static void main(String[] args) {

    }
    public int luckySum(int a, int b, int c) {

        if (a!=13 && b !=13 && c !=13){
            return a+b+c;
        }
        else if (a!=13 && b!=13 && c==13){
            return a+b;
        }
        else if  (a!=13 && b==13){
            return a;
        }
        else if (a==13 && b!=13 && c!=13){
            return 0;
        }
        return 0;
    }
}
