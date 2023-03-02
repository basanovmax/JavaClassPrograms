package com.java.class14;

public class StringPractice2 {
    //concat
    //String are


    public static void main(String[] args) {
        //2 ways of concatenating String
        //one way + sigh

        String str = "<html>";
        str += "<body>"; //str = str + "<body>"
        str += "<h1>Hello DevX </h1>";
        str += "</body>";
        str += "</html>";

        System.out.println(str);

        String str1 = "public class Hello";
        //concat method
        str1=str1.concat("{");
        // \n -> create newline
        // \t -> creates tab
        // \" -> add " as a String
        // \\ -> add \ as a String
        str1=str1.concat("{");
        System.out.println(str1);



        String str4 = "Hello";
        str4.concat("DevX!");
        System.out.println(str4);



    }





}
