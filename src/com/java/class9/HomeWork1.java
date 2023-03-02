package com.java.class9;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        /*> **Write a program to find the greatest number out of three numbers using nested if statement**
>
**Question Type:** Write Code.
## Test Data:
```java
Example 1:
Input - 43, 54, 24
Output - 54 is the greatest
```
```java
Example 1:
Input - 53, 21, 65
Output - 65 is the greatest
*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest number");
        }


        else if (num2 > num1 && num2 > num3){

            System.out.println(num2 + " is the greatest number");
        }

        else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the greatest number");
        }

        else {
            System.out.println("Type different numbers number");
        }
    }
}

