package com.java.Practice;

public class forLoop {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (11 - 2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int line = 5; line >= 1; line--) {
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (11 - 2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        for (int i = 1; i <= 6; i++){
            for (int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================");

        for (int line = 1; line <= 5; line ++) {
            for (int i = 1; i <= (line-1); i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= (11-2*line); i++){
                System.out.print("+");
            }
        } System.out.println();
    }
}
