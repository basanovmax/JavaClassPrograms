package com.java.class12;

import java.util.Scanner;

public class HomeWork12_1 {
    public static void main(String[] args) {
          /*2.    Create a method that takes a char representing a grade (A, B, C, D, or F)
        and returns a boolean indicating whether the grade is passing or failing.
        A and B are passing, C,D,F are failing. */

        Scanner input = new Scanner(System.in);

        System.out.println("Please type your grade from A - F");
        char grade = input.next().charAt(0);

        boolean b = ourGrade(grade);
        System.out.println(b);
    }
    public static boolean ourGrade(char grade) {
        if (grade == 'A' || grade == 'B') {
            System.out.println("Passed");
            return true;
        }

        else if (grade == 'C' || grade == 'D' || grade == 'F') {
            System.out.println("Failing");
            return false;
        }
        else {
            System.out.println("Wrong grade");
        }
        return false;
    }
}
