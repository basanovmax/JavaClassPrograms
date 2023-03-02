package com.java.homeWork.class29_1;

public class Food {

    public static void main (String[]args){
        Salad salad = new Salad();
    }
    Food(){
        System.out.println("Food constructor");
    }
    Food(int cal){
        this();
        System.out.println("Food daily calories are " + cal + " cal");
    }
}
class VegFood extends Food{
    VegFood(){
        super(2000);
        System.out.println("VegFood constructor");
    }
    VegFood(int cal){
        this();
        System.out.println("Vegfood int constructor " + cal + " cal");
    }
}
class Salad extends VegFood{
    Salad(){
       super();
        System.out.println("Salad constructor");
    }
    Salad(int cal){
        this();
        System.out.println("Salad int constructor " + cal + " cal");
    }
}

