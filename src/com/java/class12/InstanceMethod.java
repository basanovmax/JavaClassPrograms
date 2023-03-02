package com.java.class12;

//What is Object? => Object is a Instance of a class
//Instance of a class is created

//what is static method?
//static methods are predefined functions
//that can be used whithout creating an Object

//WHat is non-static method?
//Non-static method is Instance method.
//In order to use instance methods inside a static method
//you must create an object of the class
//where the instance method is defined.
public class InstanceMethod {
    public static void main(String[] args) {
        print();
        InstanceMethod someVarName = new InstanceMethod();
        someVarName.print1();
    }

    public static void  print(){
        System.out.println("Hello");
    }

    public void print1(){
        System.out.println("Hello1");
    }
}
