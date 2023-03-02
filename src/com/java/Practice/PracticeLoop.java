package com.java.Practice;

public class PracticeLoop {
    public static void main(String[] args) {
        /* 4.  Write a program to print the greatest digit from the given number
        Example1
        Input - 86545
        Output - Greatest digit is 8
        Example2
        Input - 23561
        Output - Greatest digit is 6 */

        /*while (num > 0) {
            reminder = num % 10;                               //5      //4    //5   //6      //8 //0
            System.out.println(reminder);
            largestNumber = Math.max(reminder, largestNumber); //5      //5    //5  //6    //8
            System.out.println(largestNumber);
            num = num/10;                                 //8654   //865  //86  //8  //0
            System.out.println(num);
        }System.out.println(largestNumber); */

        int last = 0;
        int i = 56584653;

        while (i > 0) {
            if (last < i%10) {
                last=i%10;
            }
            i=i/10;
        }
        System.out.println(last);

        /*3. Write a program to print the sum of each digit from the given number
        Example1
        Input - 3521
        Output - 11
        Example2
        Input - 5390
        Output - 17*/


    }


}
