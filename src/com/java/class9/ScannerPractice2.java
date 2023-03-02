package com.java.class9;


import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender M or W");
        char gender = sc.next().charAt(0);
        if (gender == 'M' || gender == 'm') {
            System.out.println("Go work hard");
        }
        else if (gender== 'W' || gender == 'w') {
            System.out.println("Enjoy yor life");
            }
        else {
            System.out.println("Wrong input");
        }
    }
}
