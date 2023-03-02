package com.java.class25;

public class Dog {
    String name; //Variables
    int age;
    char gender;

    Dog(String nameFromUser, int ageFromUser){ //Constructor
    name = nameFromUser;
    age=ageFromUser;
    }
    Dog(){

    }

    void bark(){ //Methods
        System.out.println(name + " is barking");
    }
    void play(){
        System.out.println(name + " is playing");
    }
}
