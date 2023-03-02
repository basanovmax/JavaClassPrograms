package com.java.Practice;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Write a program to print the sum of even numbers from 1 to 10
        int sum = 0;
        for (int i=1; i<=10;i++) {
            if (i%2==0) {
                sum =sum+i;
            }
        }
        System.out.println(sum); //30


    //. Write a program to count the number of divisors of the given numbers
    //For example - Number 6 has 4 divisors & 12 has 6 divisors
   Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
    int count = 0;
    for (int i =1;i <= num; i++ ) {
        if (num%i==0){
            count++;
        }
    }
        System.out.println(count);

        /*3. Write a program to find a magic number from 1 to 100,
        if you divide that number by 5 you will get remainder 4
        if you divide that number by 4 you will get remainder 3
        if you divide that number by 3 you will get remainder 2
        if you divide that number by 2 you will get remainder 1*/

        for (int i=1; i <=100; i++) {
            if (i%5==4 && i%4==3 && i%3==2 && i%2==1) {
                count++;
            }
        }
    }
}
