package com.java.Practice.classesAndObjects.Practice;

import java.util.Dictionary;

public class PointMain {
    public static void main(String[] args) {
/*       Point digit = new Point();
        digit.x = 7;
        digit.y = 10;

        Point digit1 = new Point();
        digit1.x = 2;
        digit1.y = 3;
        digit1.translate(18,8);

        Point digit2 = new Point();
        digit2.translate(1,2);*/

        Point namePerson = new Point();
        namePerson.setName("Pablo");
        namePerson.setAge(37);
        System.out.println(namePerson.getName());
        System.out.println(namePerson.getAge());


        namePerson.translate(5,2);



       namePerson.printDetails();


        Point numbers = new Point();
        numbers.translate(3,5);

        Point nama = new Point(1,10,"Suzie");

        Point myName = new Point("Maxim");

        System.out.println(myName.getName());
        System.out.println(nama.getAge());
        Point.x = 10;
        System.out.println(Point.x);
    }


}
