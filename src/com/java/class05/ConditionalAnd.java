package com.java.class05;

public class ConditionalAnd {
    public static void main(String[] args) {
        //COnditional AND is used when you to enforce multiple rules
        //before you execute your logical all of the rules must be met

        //to issue certificate i want student have gpa more then 3,5
        //and i want students to have less than 3 missed classes


        boolean giveMaximCertificate = false;

        double maximGPA = 3.6;
        int maximMissedClasses = 2;
                                 //true          //false
        giveMaximCertificate = maximGPA>3.5 && maximMissedClasses < 3;
        System.out.println(giveMaximCertificate);


        //write a program where you give your age
        //tell if do you have a passport
        //return true if age is more than 16
        //and if you have a passport

        int myAge = 37;
        boolean doesMaximHavePassport=  true;
        boolean issuesDriverLicense1 = myAge > 16 && doesMaximHavePassport;

        System.out.println(issuesDriverLicense1);




    }
}
