package com.java.class8;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
         /* **Write a program to take a day number from the user and print the name of the day from the given number**
**Question Type:** Write Code.
## Test Data:
```java
        Input - 0,  Output - Sunday
        Input - 1,  Output - Monday
        Input - 2,  Output - Tuesday
        Input - 3,  Output - Wednesday
        Input - 4,  Output - Thursday
        Input - 5,  Output - Friday
        Input - 6,  Output - Saturday
        Input - 7,  Output - Invalid Input */

        System.out.println("Please type a day number:");
        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Input");
        }
    }
}


