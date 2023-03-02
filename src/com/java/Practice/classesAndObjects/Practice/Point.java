package com.java.Practice.classesAndObjects.Practice;

public class Point {
    static int x;
    private int y;
    String name;
    private int  age;

    public Point() {
        System.out.println("Constructor");
    }
    Point (String name){
        this.name = name;
        System.out.println("My name is " + name);
    }


    void translate(int x, int y) {
        this.x=x*x;
        this.y=y*y;
        System.out.println("square of " + x + " = " + this.x);
        System.out.println("square of " + y + " = " +this.y);



    }
    void printDetails(){
        System.out.println(getName() + " is " + getAge());
    }
    void setName (String name){
        this.name=name;
    }
    void setAge (int age){
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

   int getAge(){
     return this.age;
    }

    Point(int x, int y, String name){
        this.x = x;
        this.y=y;
        this.name=name;
        System.out.println("My name is " + name + ". I am " + (x+y) + " years old");
    }


}

