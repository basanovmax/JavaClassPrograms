package com.java.class28;
class Calculator{// Parent class / Super Class
    void add(int a, int b) {
        System.out.println("Add = " + (a+b));
    }
    void sub (int a, int b){
        System.out.println("Sub = " + (a-b));
    }
}
class AdvanceCalculator extends Calculator { //Child / SubClass
    void mul(int a, int b) {
        System.out.println(a * b);
    }
    void div(int a, int b) {
        System.out.println(a / b);
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
        c.sub(40,20);

        AdvanceCalculator ac = new AdvanceCalculator();
        ac.sub(10,20);
        ac.mul(10,20);
        ac.div(20,10);
        ac.add(20,10);
    }
}
