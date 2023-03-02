package com.java.class15;

public class Replace2 {
    public static void main(String[] args) {

        //write a program that update the first e in the second word
        //to X
        String str = "DevX Adventures World";// => DevX AdvXntures World
                    //= "Hello Coder superstar" => Hello CodXr superstar
                    //="I went to collage" => I wXnt to collage

        int indexOfFirstStace = str.indexOf(" ");
        //  AdvXntures World
        String noDexEReplaced = str.substring(indexOfFirstStace).replaceFirst("e","X");
        String devXOnly = str.substring(0,indexOfFirstStace);
        String finalResult = devXOnly.concat((noDexEReplaced));
        System.out.println(finalResult);
        System.out.println(str);


    }
}
