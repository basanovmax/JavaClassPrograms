package com.java.class28;

class mammals {
    void isBreathing(String name) {
        System.out.println(name + " is breathing");
    }
}

class Animal extends mammals { //Parent class
    String name;
    int age;

    void isRun(String name) {
        System.out.println(name + " is running");
    }

    void isEat(String name) {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    String name;

    void isBarking(String name) {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {
        Dog newDog = new Dog();
        newDog.isBarking("Sharik");
        newDog.isRun("Bobik");
        newDog.isEat("Jonty");
        newDog.isBreathing("Doggy");

    }

}
