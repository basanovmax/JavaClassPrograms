package com.java.class21;

public class HomeWork21_2 {
    public static void main(String[] args) {
        /*  2. Write a program to print reverse of the given String
        Example
        Input - Wedevx
        Output - xvedeW*/
        String word = "Wedevx";
        String rev = "";
        char ch;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int i = sc.nextInt();
        int rev = 0;
        while (i>0) {
        rev = (rev * 10) + i%10;
         i=i/10;
        }
        System.out.println("Reversed Number is " + rev);*/

