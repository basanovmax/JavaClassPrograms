package com.java.class8;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /* > **Write a program to print a welcome message to the traveler and notify them of a 10% discount if
        they are returning customers, at the end print the message “Enjoy your stay here”**
>
**Question Type:** Write Code.
## Test Data:
```java
        Example 1:
        Welcome to the Beverly Hills
        Are you traveling first time here(true/false)? true
        Enjoy your stay
```
```java
        Example 2:
        Welcome to the Beverly Hills
        Are you traveling first time here(true/false)? false
        You have got a 10% discount on your stay
        Enjoy your stay
``` */

        System.out.println("Welcome to the Beverly Hill");
        System.out.println("Are you traveling first time here(true/false)?");
        Scanner input = new Scanner(System.in);
        boolean isFirstTime = input.nextBoolean();
        if (isFirstTime == false) {
            System.out.println("You have got a 10% discount on your stay");
        }
        System.out.println("Enjoy your stay");


    }
}
