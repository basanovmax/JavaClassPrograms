package com.java.Practice.classesAndObjects;

public class ClassesAndObjects {
    public static void main(String[] args) {
       Person person1 = new Person();
       person1.name = "Max";
       person1.age = 37;
       int year1 = person1.calculateYearsToRetirement();

       person1.sayHello();

       Person person2 = new Person();
       person2.name = "Sveta";
       person2.age = 39;
       person2.speak();
       int year2 = person2.calculateYearsToRetirement();
        System.out.println(year1);
        System.out.println(year2);

        Dog sharik = new Dog();
        sharik.age = 20;
        sharik.name= "Sharik";
        sharik.name = "Bobik";
        sharik.isPlaying();

        Person Alex = new Person("Alex", 10);
    }
}
class Person{
    String name;
    int age;
    void speak (){
        for(int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " and " + age + " years old");
        }
    }
    void sayHello(){
        System.out.println("Hello " + name);
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name + (age * 10));
    }
    Person(){
        System.out.println("Sz");
    }
}
