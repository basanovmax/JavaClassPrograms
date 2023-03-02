package com.java.class15;

public class Contains {
    public static void main(String[] args) {
        String str = "Hello Askar! \n thank you for interviewing for Apple" +
                "We want to congratulation you with offer";
        //contains method return boolean (true/false)
        //return true if the given String param exists
        //in the String
        boolean doesContain = str.contains("Apple");
        System.out.println(doesContain);

        if(str.contains("Apple")) {
            //do print out the text in certain format.
        }

        String str2 = "offer: Java, Python";
        if (str2.contains("JavaScript")){
            //go and schedule a call
            //and enroll
        }
        String anyOfTheWebsites= " ";
        if(anyOfTheWebsites.contains("Turkish rest near me"));

    }

    //startsWith ()
    //endWith ()
    //isEmpty()

}
