package com.java.class06;

//must have to be able to use Scanner
//import statement is a statement that tell our class to use functionality from diff packages
import java.util.Scanner;

public class ScannerPractice {

    //compiling a code => chechikng if we are matching all syntax rules
    public static void main(String[] args) {

        //before you can use scanner you have import statement
        //before public class line
        Scanner input = new Scanner(System.in);

        //input.nextInt () -> will enable us to input and int data to our programm
        input.nextInt();

        //user can write any text
        input.nextLine();

        //any decimal value
        input.nextDouble();

        //write true or false
        input.nextBoolean();

    }
}
