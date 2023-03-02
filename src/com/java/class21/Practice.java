package com.java.class21;

public class Practice {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int s = 1; s <= (i - 1); s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (11 - 2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
            /*    1
                 123
                12345
               1234567
              123456789*/
        }
    }
}
