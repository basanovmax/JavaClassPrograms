package com.java.class27;

import com.java.homeWork.class25.Phone;

public class Iphone {
    static String brandName = "Iphone";
    static String operationSystem = "IOS";
    String model;
    int memory;

    static void generalInfo(){
        System.out.println("My phone brand is " + brandName + " and have " + operationSystem);
    }
    void howManyMemory(){
        System.out.println(brandName + "have " + memory + " memory");
    }
    Iphone(String model, int memory){
    this.model = model;
    this.memory = memory;
        System.out.println("My phone is " + brandName + " "+ model + " " + memory + " " + operationSystem);

    }

    public static void main(String[] args) {
        Iphone.generalInfo();
        Iphone myPhone = new Iphone("14ProMax",256);
        myPhone.howManyMemory();







    }
}

