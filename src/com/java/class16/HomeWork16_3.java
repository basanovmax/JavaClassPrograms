package com.java.class16;

import java.util.Scanner;

public class HomeWork16_3 {
   public static void main (String[] args) {
      /* Write a program that uses a while loop to print
      the multiplication table for a given number.

      Enter number to print table: 7
      7 * 1 = 7
      7 * 2 = 14
      7 * 3 = 21
      7 * 4 = 28
      7 * 5 = 35
      7 * 6 = 42
      7 * 7 = 49
      7 * 8 = 56
      7 * 9 = 63
      7 * 10 = 70 */
      Scanner input = new Scanner(System.in);
      System.out.println("Enter digit");
      int num = input.nextInt();
      int num2 = 1;
      int sum= 0;

      while (num2 <= 10) {
         sum = num * num2;
         System.out.println(num + " * " + num2 + " = " + sum );
         num2++;
      }
   }
}
