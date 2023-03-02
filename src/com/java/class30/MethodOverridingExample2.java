package com.java.class30;

import com.java.class11.Switch1;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
    void erase() {
        System.out.println("Erasing shape");
    }
}
    class Circle extends Shape{
    @Override
    void draw(){
            System.out.println("Drawing circle");
        }
    }

    class Square extends Shape{
    @Override
        void draw(){
            System.out.println("Drawing square");
        }
    }
public class MethodOverridingExample2 {
    public static void main(String[] args) {
      Shape sh = new Shape();
      Circle ci = new Circle();
      Square sq = new Square();
      sh.erase();
      sh.draw();
      ci.draw();
      sq.draw();
    }
}
