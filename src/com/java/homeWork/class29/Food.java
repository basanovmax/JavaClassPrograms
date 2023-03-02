package com.java.homeWork.class29;

import com.java.class22.FindIndexOfNumber;

/*Task 1:
        Create a class Food, VegFood, and Salad
        Create two constructors in each class
Call the second constructor of each class from the first constructor using this() keyword
        Call the VegFood Class constructor from the Salad Class constructor using the super() keyword
        Call the Food class constructor from VegFood Class constructor using the super() keyword
        Create a MainClass and create an object of Salad Class & Execute the code without errors*/
class Food {
    public static void main(String[] args) {
        Salad salad = new Salad();
    }
    Food(){
        System.out.println("Food Constructor");
    }
    Food (int calories){
        System.out.println("Daily calories " + calories);
    }
}

class VegFood extends Food{
VegFood(){
    super();
    System.out.println("VegFood constructor");
}
VegFood(int calories){
    System.out.println("VegFood calories " + calories);
}

}
class Salad extends VegFood{
    Salad(){
        super();
        System.out.println("Salad constructor");
    }
    Salad(int calories){
        System.out.println("In salad " + calories + " calories");
    }
}

