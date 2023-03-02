package com.java.class25;

public class PersonMainClass {
    public static void main(String[] args) {
        //Create reference of class

        Person maxim; // -> size 0 byte, not create a memory



        int a; // -> size 4 byte

        //Initialize memory for object
        Person dana = new Person();// -> Initialize new object
        Person azat = new Person();

        //dana and maxim object of class
        System.out.println(dana.name); // Print null

        dana.run();

        dana.age=34;
        azat.age=14;

        dana.name = "Danaker";
        azat.name = "Azat Azamatov";

        dana.run();
        azat.eat();






    }
}
