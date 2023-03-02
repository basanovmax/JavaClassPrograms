package com.java.class26;

class Demo {
    Demo() {
        System.out.println("From constructor");
    }
}

public class ConstructorTrickyExample {
    public static void main(String[] args) {
        Demo d = new Demo();
        //d.Demo(); - Compilation error
    }
}
