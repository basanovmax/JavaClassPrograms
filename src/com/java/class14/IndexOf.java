package com.java.class14;

public class IndexOf {

    //indexOf (Sting etc) -> return the index of the first occurrence
    //whenever there is no matching String then it will return -1

    //indexOf(String str, int i) -> "
    //lastIndexOf (String str) -> return the index of last occurrence of str. If not found return -1

    public static void main(String[] args) {
      String str = "tik tak";
        System.out.println(str.indexOf("tak")); //4
        System.out.println(str.indexOf("k")); //2

        String str2 = "bla bla bla";
        System.out.println(str2.indexOf("bla")); //0
        System.out.println(str2.indexOf("dsadsads")); //-1 or error

        String str3 = "Macbook Air, Nike Air, Ipod Air";
        System.out.println(str3.indexOf("Air", 10)); //-1
        System.out.println(str3.indexOf("Air", 19)); //18

        String str4 = "Lala polluza lala land lakers";
      System.out.println(str4.indexOf("la", 5)); //13


        String str5 = "Java Developer, Java coding";
      System.out.println(str5.lastIndexOf("Java")); //16

      String str6 = "Almazova";
      int last2Chars = str6.lastIndexOf("va"); //6
      System.out.println(last2Chars);



    }
}
