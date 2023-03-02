package com.java.class7;

public class TypeCasting {

    public static void main(String[] args) {

        double gasPrice = 1.99;
        //int wholeNumber = gasPrice; //incompatible means -> not supported. things that don't fit each other

        //2 problems  - 1) Trying to put decimal pointed numbers into whole number data types;
        // 2) when trying to push in bigger data types in smaller

        //int b = 10.5; //incompatible

        //int a = 400005;
        //short smallNum = a;

        //explicit type casting -> manual casting
        double price = 2.99;
        // (int) is a type casting operator
        int convert = (int)price;
        System.out.println(convert);

        double num2 = 9.01;
        int convert2 = (int)num2;
        System.out.println(convert2);

        float floatNum = 2.4f;
        //convert float into a byte
        //and print out byte number
        byte convert3 = (byte)floatNum;
        System.out.println(convert3);

        //implicit -> automatic casting

        int num1 = 24;
        double doubleNum = num1;
        System.out.println(doubleNum); //24.0

        int num5 = 55;
        double doubleNum2 = num5;
        System.out.println(doubleNum2); //55.0

        // I want get Average Customer Spending on my product
        //I sold %4,544,95.96
        // 64 clients
        // find what is avarage customer spending

        double sold = 4544950.96;
        int client = 64;
        double avarage = sold/client;
        System.out.println(avarage);



        //I drove 100 miles
        //gallons of gas = 2.4;
        //how many gallons


        System.out.println( " --- Miles pef galon --");
        int miles = 100;
        double gallons = 2.4;
        double mpg = miles/gallons;
        System.out.println(mpg);
    }
}
