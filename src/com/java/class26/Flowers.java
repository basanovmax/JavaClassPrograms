package com.java.class26;

public class Flowers {
    String name;
    String color;
    int price;


    Flowers(){
        System.out.println("Flowers");
    }


    Flowers(String flowerName, String flowerColor){
        name = flowerName;
        color = flowerColor;
        System.out.println("Flowers " + name + " are " + color);
    }

    Flowers(String flowersName1, int flowerPrice){
        name = flowersName1;
        price = flowerPrice;
        System.out.println("Flowers " + name + " and price are " + price);

        }
    }

