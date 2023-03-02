package com.java.class14;

public class Substring {
    //substring => return a String which is a substring from ith to the end of original String

    //
    public static void main(String[] args) {
        String str = "Hello world";


        str.substring(6);  // return a substring from W onwards
        System.out.println(str); //Hello World
        System.out.println(str.substring(6)); //world


        String str1 = "Tesla Motors inc.";
        System.out.println(str1.substring(6)); //Motors inc.

        String str2 = "La Ferrari";
        System.out.println(str2.substring(3, 8)); //Ferra

        String str3 = "Maldive Island";
        System.out.println(str3.substring(0,7)); //Maldive
    }
}
