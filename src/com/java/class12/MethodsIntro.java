package com.java.class12;

public class MethodsIntro {
    public static void main(String[] args) {
        //when your method have a return type you should use and safe the result in variables
        double num = calculateTax(); // same as 20.0
        System.out.println(num);

        double taxAmount =  calculateTax2(150000);
        System.out.println(taxAmount);
    }



    //Methods are predefined logic
    //that can be used to execute throught the
    //whole project

    //first put an access modifier -> public, protected, default, private
    //second put static
    //return data type -> any data types -> int, double, float, byte, chat, short, boolean, String
    //what is return data type? => it's the data type of result info of the function (Method)
    //return data types can also be void => use void when you want to create a method
    //that doesnt return any result -> ex. just print
    //when we have return type that is not void -> you must have a return statement
    //return statement must be followed by value that has same data type as your return data type
    //You can get that valur from calculation as well

    //next we have the name of the method => name of method should meaningful and follow cameCase verbs
    // ex: sendEmail(), sendReceipt(), printTop10Customers(),
    //the name of the method always finished with parenthesis.

    //the body of any methods can be as large as you need to be
    //you can calculatons
    //print out statements
    //if, switch, for, while
    public static double calculateTax() {
        return 10*2;
    }

    //void methods do not require a return statement
    public static void sayHello(){
        int year =2023;
        System.out.println("Hello" + year   );
    }

    //write a function that calculates
    //employees annual tax amount
    //if the annual salary is less than 100k then tax percent is 10%
    public static double calculateTax2(double annualSalary){
        if(annualSalary <= 100000) {
            return annualSalary * 0.1;
        }
        else {
            return annualSalary * 0.15;
        }
    }

    //Create functions that prints "I want travel to __________
    //___ -> should be a variable



}
