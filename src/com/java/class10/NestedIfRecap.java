package com.java.class10;

import java.util.Scanner;

public class NestedIfRecap {
    public static void main(String[] args) {

        //let's design the logic for restaraunt app
//first users should be given 2 options:
//appetizer or main course
//if user picks appetizers
//we should show users 2 appeterizer.
//1: spring rolls
//2: egg rolls
//once user is shown appetizer options they should be able select one
//appetizer.
//if user selects spring roll: print out spring roll ingredients
///if user selects egg roll: print out egg roll ingredients

//if user picks main course
//show
//1. Lagman
//2. New York Rib Eye steak
//if user selects Lagman: print out Lagman  ingredients
//if user selects New York Rib Eye steak: print out New York Rib Eye steak ingredients

        System.out.println("Make a choice: ");
        System.out.println("1.Main course");
        System.out.println("2.Appetizer");
        System.out.println("3.Drink");
        Scanner sc = new Scanner(System.in);

        String choice1 = sc.nextLine();


        if (choice1.equalsIgnoreCase("Main course") || choice1.equals("1")) {
            System.out.println("1.Lagman");
            System.out.println("2. NYC steak");

            String choiceMainCourse = sc.nextLine();

            if (choiceMainCourse.equalsIgnoreCase("Lagman") || choiceMainCourse.equals("1")) {
                System.out.println("Lagman ingredients");
            } else if (choiceMainCourse.equalsIgnoreCase("NYC steak") || choiceMainCourse.equals("2")) {
                System.out.println("NYC steak ingredients");
            }
            else {
                System.out.println("Invalid Main course choice");
            }
        }

        else if (choice1.equalsIgnoreCase("Appetizer") || choice1.equals("2")) {
            System.out.println("1.Spring rolls");
            System.out.println("2.Egg rolls");

            String choiceAppetizer = sc.nextLine();
            if (choiceAppetizer.equalsIgnoreCase("Spring rolls") || choiceAppetizer.equals("1")) {
                System.out.println("Spring roll Ingredients");
            }
            else if (choiceAppetizer.equalsIgnoreCase("Egg rolls") || choiceAppetizer.equals("2")) {
                System.out.println("Egg roll Ingredients");
            }
            else {
                System.out.println("Invalid appetizer choice");
            }
        }
        else if (choice1.equalsIgnoreCase("Drink") || choice1.equals("3")){
            System.out.println("1.Orange juice");
            System.out.println("2.Apple juice");
            System.out.println("3.Pineapple juice");

            String choiceJuice = sc.nextLine();
            if (choiceJuice.equalsIgnoreCase("Orange juice") || choiceJuice.equals("1")) {
                System.out.println("Orange juice Ingredients");
            }
            else if (choiceJuice.equalsIgnoreCase("Apple juice") || choiceJuice.equals("2")) {
                System.out.println("Apple juice Ingredients");
            }
            else if (choiceJuice.equalsIgnoreCase("Pineapple juice") || choiceJuice.equals("3")) {
                System.out.println("Pineapple juice Ingredients");
            }
            else {
                System.out.println("Invalid drink choice");
            }
        }

        else {
            System.out.println("Invalid choice");
        }
    }
}



